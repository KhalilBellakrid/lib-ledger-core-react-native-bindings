// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from emitter.djinni

package com.ledger.reactnative;

import co.ledger.core.Event;
import co.ledger.core.EventBus;
import co.ledger.core.EventPublisher;
import co.ledger.core.ExecutionContext;
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**Class representing an event publisher */
public class RCTCoreEventPublisher extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, EventPublisher> javaObjects;
    public Map<String, EventPublisher> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreEventPublisher(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, EventPublisher>();
        WritableNativeMap.setUseNativeAccessor(true);
    }

    @Override
    public String getName()
    {
        return "RCTCoreEventPublisher";
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
            promise.reject("Failed to release instance of RCTCoreEventPublisher", "First parameter of RCTCoreEventPublisher::release should be an instance of RCTCoreEventPublisher");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, EventPublisher> elem : this.javaObjects.entrySet())
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

    /**
     *Get event bus through which publisher broadcast its events
     *@return EventBus object
     */
    @ReactMethod
    public void getEventBus(ReadableMap currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            EventPublisher currentInstanceObj = this.javaObjects.get(sUid);

            EventBus javaResult = currentInstanceObj.getEventBus();

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreEventBus rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreEventBus.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreEventBus");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Broadcast an event through eventbus (to all subscribed receivers to this EventBus)
     *@param event, Event object
     */
    @ReactMethod
    public void post(ReadableMap currentInstance, ReadableMap event, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            EventPublisher currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreEvent rctParam_event = this.reactContext.getNativeModule(RCTCoreEvent.class);
            Event javaParam_0 = rctParam_event.getJavaObjects().get(event.getString("uid"));
            currentInstanceObj.post(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Same as post method but with an sticky event
     *@param event, Event object
     *@param tag, 32 bits integer, tag of sticky event
     */
    @ReactMethod
    public void postSticky(ReadableMap currentInstance, ReadableMap event, int tag, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            EventPublisher currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreEvent rctParam_event = this.reactContext.getNativeModule(RCTCoreEvent.class);
            Event javaParam_0 = rctParam_event.getJavaObjects().get(event.getString("uid"));
            currentInstanceObj.postSticky(javaParam_0, tag);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Relay an event to another EventBus (other than EventPublisher's event bus)
     *@param bus, EventBus object, through which we want to broadcast EventPublisher's event to EventPublisher's receiver
     */
    @ReactMethod
    public void relay(ReadableMap currentInstance, ReadableMap bus, Promise promise) {
        try
        {
            String sUid = currentInstance.getString("uid");

            EventPublisher currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreEventBus rctParam_bus = this.reactContext.getNativeModule(RCTCoreEventBus.class);
            EventBus javaParam_0 = rctParam_bus.getJavaObjects().get(bus.getString("uid"));
            currentInstanceObj.relay(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Create a new instance of EventPublisher class
     *@param context, executionContext object, context in which event publisher broadcast its events
     */
    @ReactMethod
    public void newInstance(ReadableMap context, Promise promise) {
        try
        {
            RCTCoreExecutionContext rctParam_context = this.reactContext.getNativeModule(RCTCoreExecutionContext.class);
            ExecutionContext javaParam_0 = rctParam_context.getJavaObjects().get(context.getString("uid"));
            EventPublisher javaResult = EventPublisher.newInstance(javaParam_0);

            String javaResult_uuid = UUID.randomUUID().toString();
            RCTCoreEventPublisher rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreEventPublisher.class);
            rctImpl_javaResult.getJavaObjects().put(javaResult_uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreEventPublisher");
            result.putString("uid",javaResult_uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
