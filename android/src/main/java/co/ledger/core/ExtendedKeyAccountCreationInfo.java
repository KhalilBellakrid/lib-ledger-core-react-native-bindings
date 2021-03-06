// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

package co.ledger.core;

import java.util.ArrayList;

/**TODO */
public final class ExtendedKeyAccountCreationInfo {


    /*package*/ final int index;

    /*package*/ final ArrayList<String> owners;

    /*package*/ final ArrayList<String> derivations;

    /*package*/ final ArrayList<String> extendedKeys;

    public ExtendedKeyAccountCreationInfo(
            int index,
            ArrayList<String> owners,
            ArrayList<String> derivations,
            ArrayList<String> extendedKeys) {
        this.index = index;
        this.owners = owners;
        this.derivations = derivations;
        this.extendedKeys = extendedKeys;
    }

    public int getIndex() {
        return index;
    }

    public ArrayList<String> getOwners() {
        return owners;
    }

    public ArrayList<String> getDerivations() {
        return derivations;
    }

    public ArrayList<String> getExtendedKeys() {
        return extendedKeys;
    }

    @Override
    public String toString() {
        return "ExtendedKeyAccountCreationInfo{" +
                "index=" + index +
                "," + "owners=" + owners +
                "," + "derivations=" + derivations +
                "," + "extendedKeys=" + extendedKeys +
        "}";
    }

}
