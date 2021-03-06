package com.ledger.reactnative;

import co.ledger.core.LedgerCore;
import android.content.Context;
import android.content.SyncStats;

import com.facebook.react.bridge.ReactApplicationContext;

import java.io.File;

/**
 * Module used to resolve file paths. libledger-core has its own iternal representation of the file system that may not
 * be adapted for the runtime platform. All path given to the PathResolver are absolute.
 */
public class PathResolverImpl extends co.ledger.core.PathResolver {
    private ReactApplicationContext reactContext;
    private String versionMajor;

    public PathResolverImpl(ReactApplicationContext reactContext) {
        this.reactContext = reactContext;
        String version = LedgerCore.getStringVersion();
        this.versionMajor = version.substring(0, version.indexOf("."));
    }
    /**
     * Resolves the path for a SQLite database file.
     * @param path The path to resolve.
     * @return The resolved path.
     */
    public String resolveDatabasePath(String path) {
        String base = "/database_".concat(this.versionMajor).concat("_").concat(path.replace("/", "__"));
        File file = this.reactContext.getFilesDir();
        String modifiedPath = file.getAbsolutePath();
        String finalPath = modifiedPath.concat(base);
        return finalPath;
    }

    /**
     * Resolves the path of a single log file.
     * @param path The path to resolve.
     * @return The resolved path.
     */
    public String resolveLogFilePath(String path) {
        String base = "/log_file_".concat(this.versionMajor).concat("_").concat(path.replace("/", "__"));
        File file = this.reactContext.getFilesDir();
        String modifiedPath = file.getAbsolutePath();
        return modifiedPath.concat(base);
    }

    /**
     * Resolves the path for a json file.
     * @param path The path to resolve.
     * @return The resolved path.
     */
    public String resolvePreferencesPath(String path) {
        String base = "/preferences_".concat(this.versionMajor).concat("_").concat(path.replace("/", "__"));
        File file = this.reactContext.getFilesDir();
        String modifiedPath = file.getAbsolutePath();
        return modifiedPath.concat(base);
    }
}
