// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.BigIntListCallback;
import co.ledger.core.BitcoinLikeAccount;
import co.ledger.core.BitcoinLikeOutputListCallback;
import co.ledger.core.BitcoinLikeTransaction;
import co.ledger.core.BitcoinLikeTransactionBuilder;
import co.ledger.core.I32Callback;
import co.ledger.core.StringCallback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/** Class representing a Bitcoin account. */
@ReactModule(name = "RCTCoreBitcoinLikeAccount")
public class RCTCoreBitcoinLikeAccount extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, BitcoinLikeAccount> javaObjects;
    public Map<String, BitcoinLikeAccount> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreBitcoinLikeAccount(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, BitcoinLikeAccount>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreBitcoinLikeAccount";
    }
    @ReactMethod
    public void release(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            this.javaObjects.remove(uid);
            promise.resolve(0);
        }
        else
        {
            promise.reject("Failed to release instance of RCTCoreBitcoinLikeAccount", "First parameter of RCTCoreBitcoinLikeAccount::release should be an instance of RCTCoreBitcoinLikeAccount");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, BitcoinLikeAccount> elem : this.javaObjects.entrySet())
        {
            result.pushString(elem.getKey());
        }
        promise.resolve(result);
    }
    @ReactMethod
    public void flush(Promise promise)
    {
        this.javaObjects.clear();
        promise.resolve(0);
    }
    @ReactMethod
    public void isNull(ReadableMap currentInstance, Promise promise)
    {
        String uid = currentInstance.getString("uid");
        if (uid.length() > 0)
        {
            if (this.javaObjects.get(uid) == null)
            {
                promise.resolve(true);
                return;
            }
            else
            {
                promise.resolve(false);
                return;
            }
        }
        promise.resolve(true);
    }
    public static byte[] hexStringToByteArray(String hexString)
    {
        int hexStringLength = hexString.length();
        byte[] data = new byte[hexStringLength / 2];
        for (int i = 0; i < hexStringLength; i += 2)
        {
            data[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4) + Character.digit(hexString.charAt(i+1), 16));
        }
        return data;
    }
    static final String HEXES = "0123456789ABCDEF";
    public static String byteArrayToHexString( byte [] data)
    {
        if (data == null)
        {
            return null;
        }
        final StringBuilder hexStringBuilder = new StringBuilder( 2 * data.length );
        for ( final byte b : data )
        {
            hexStringBuilder.append(HEXES.charAt((b & 0xF0) >> 4)).append(HEXES.charAt((b & 0x0F)));
        }
        return hexStringBuilder.toString();
    }

    /**
     * Get UTXOs of account in a given range.
     * @param from, integer, lower bound for account's UTXO's index
     * @param to, integer, upper bound for account's UTXO's index
     * @param callback, ListCallback object which returns a list of BitcoinLikeOutput if getUTXO succeed
     */
    @ReactMethod
    public void getUTXO(ReadableMap currentInstance, int from, int to, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeAccount currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBitcoinLikeOutputListCallback javaParam_2 = RCTCoreBitcoinLikeOutputListCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getUTXO(from, to, javaParam_2);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get UTXOs count of account.
     * @param callback, Callback object which returns number of UTXO owned by this account
     */
    @ReactMethod
    public void getUTXOCount(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeAccount currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreI32Callback javaParam_0 = RCTCoreI32Callback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getUTXOCount(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void broadcastRawTransaction(ReadableMap currentInstance, String transaction, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeAccount currentInstanceObj = this.javaObjects.get(sUid);

            byte [] javaParam_0 = hexStringToByteArray(transaction);

            RCTCoreStringCallback javaParam_1 = RCTCoreStringCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.broadcastRawTransaction(javaParam_0, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void broadcastTransaction(ReadableMap currentInstance, ReadableMap transaction, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeAccount currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBitcoinLikeTransaction rctParam_transaction = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransaction.class);
            BitcoinLikeTransaction javaParam_0 = rctParam_transaction.getJavaObjects().get(transaction.getString("uid"));
            RCTCoreStringCallback javaParam_1 = RCTCoreStringCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.broadcastTransaction(javaParam_0, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void buildTransaction(ReadableMap currentInstance, Boolean partial, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeAccount currentInstanceObj = this.javaObjects.get(sUid);

            BitcoinLikeTransactionBuilder javaResult = currentInstanceObj.buildTransaction(partial);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreBitcoinLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreBitcoinLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Get fees from network, fees are ordered in descending order (i.e. fastest to slowest confirmation)
     * Note: it would have been better to have this method on BitcoinLikeWallet
     * but since BitcoinLikeWallet is not used anywhere, it's better to keep all
     * specific methods under the same specific class so it will be easy to segratate
     * when the right time comes !
     */
    @ReactMethod
    public void getFees(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            BitcoinLikeAccount currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBigIntListCallback javaParam_0 = RCTCoreBigIntListCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getFees(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
