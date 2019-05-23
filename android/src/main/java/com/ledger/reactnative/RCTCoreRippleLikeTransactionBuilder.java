// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ripple_like_wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.Amount;
import co.ledger.core.Currency;
import co.ledger.core.RippleLikeMemo;
import co.ledger.core.RippleLikeTransaction;
import co.ledger.core.RippleLikeTransactionBuilder;
import co.ledger.core.RippleLikeTransactionCallback;
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

@ReactModule(name = "RCTCoreRippleLikeTransactionBuilder")
public class RCTCoreRippleLikeTransactionBuilder extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, RippleLikeTransactionBuilder> javaObjects;
    public Map<String, RippleLikeTransactionBuilder> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreRippleLikeTransactionBuilder(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, RippleLikeTransactionBuilder>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreRippleLikeTransactionBuilder";
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
            promise.reject("Failed to release instance of RCTCoreRippleLikeTransactionBuilder", "First parameter of RCTCoreRippleLikeTransactionBuilder::release should be an instance of RCTCoreRippleLikeTransactionBuilder");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, RippleLikeTransactionBuilder> elem : this.javaObjects.entrySet())
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
     * Send funds to the given address. This method can be called multiple times to send to multiple addresses.
     * @param amount The value to send
     * @param address Address of the recipient
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void sendToAddress(ReadableMap currentInstance, ReadableMap amount, String address, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            RippleLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAmount rctParam_amount = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_amount.getJavaObjects().get(amount.getString("uid"));
            RippleLikeTransactionBuilder javaResult = currentInstanceObj.sendToAddress(javaParam_0, address);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreRippleLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreRippleLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreRippleLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Send all available funds to the given address.
     * @param address Address of the recipient
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void wipeToAddress(ReadableMap currentInstance, String address, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            RippleLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RippleLikeTransactionBuilder javaResult = currentInstanceObj.wipeToAddress(address);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreRippleLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreRippleLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreRippleLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Set fees (in drop) the originator is willing to pay
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void setFees(ReadableMap currentInstance, ReadableMap fees, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            RippleLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreAmount rctParam_fees = this.reactContext.getNativeModule(RCTCoreAmount.class);
            Amount javaParam_0 = rctParam_fees.getJavaObjects().get(fees.getString("uid"));
            RippleLikeTransactionBuilder javaResult = currentInstanceObj.setFees(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreRippleLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreRippleLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreRippleLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Add a memo.
     * @return A reference on the same builder in order to chain calls.
     */
    @ReactMethod
    public void addMemo(ReadableMap currentInstance, ReadableMap memo, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            RippleLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreRippleLikeMemo rctParam_memo = this.reactContext.getNativeModule(RCTCoreRippleLikeMemo.class);
            RippleLikeMemo javaParam_0 = rctParam_memo.getJavaObjects().get(memo.getString("uid"));
            RippleLikeTransactionBuilder javaResult = currentInstanceObj.addMemo(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreRippleLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreRippleLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreRippleLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** An arbitrary unsigned 32-bit integer that identifies a reason for payment or a non-Ripple account */
    @ReactMethod
    public void setDestinationTag(ReadableMap currentInstance, long tag, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            RippleLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RippleLikeTransactionBuilder javaResult = currentInstanceObj.setDestinationTag(tag);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreRippleLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreRippleLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreRippleLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Build a transaction from the given builder parameters. */
    @ReactMethod
    public void build(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            RippleLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreRippleLikeTransactionCallback javaParam_0 = RCTCoreRippleLikeTransactionCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.build(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Creates a clone of this builder.
     * @return A copy of the current builder instance.
     */
    @ReactMethod
    public void clone(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            RippleLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            RippleLikeTransactionBuilder javaResult = currentInstanceObj.clone();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreRippleLikeTransactionBuilder rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreRippleLikeTransactionBuilder.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreRippleLikeTransactionBuilder");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /** Reset the current instance to its initial state */
    @ReactMethod
    public void reset(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            RippleLikeTransactionBuilder currentInstanceObj = this.javaObjects.get(sUid);

            currentInstanceObj.reset();
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void parseRawUnsignedTransaction(ReadableMap currency, String rawTransaction, Promise promise) {
        try
        {
            RCTCoreCurrency rctParam_currency = this.reactContext.getNativeModule(RCTCoreCurrency.class);
            Currency javaParam_0 = rctParam_currency.getJavaObjects().get(currency.getString("uid"));
            byte [] javaParam_1 = hexStringToByteArray(rawTransaction);

            RippleLikeTransaction javaResult = RippleLikeTransactionBuilder.parseRawUnsignedTransaction(javaParam_0, javaParam_1);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreRippleLikeTransaction rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreRippleLikeTransaction.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreRippleLikeTransaction");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void parseRawSignedTransaction(ReadableMap currency, String rawTransaction, Promise promise) {
        try
        {
            RCTCoreCurrency rctParam_currency = this.reactContext.getNativeModule(RCTCoreCurrency.class);
            Currency javaParam_0 = rctParam_currency.getJavaObjects().get(currency.getString("uid"));
            byte [] javaParam_1 = hexStringToByteArray(rawTransaction);

            RippleLikeTransaction javaResult = RippleLikeTransactionBuilder.parseRawSignedTransaction(javaParam_0, javaParam_1);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreRippleLikeTransaction rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreRippleLikeTransaction.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreRippleLikeTransaction");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
