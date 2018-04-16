package com.intel_poc;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;

public class NativeReactModule extends ReactContextBaseJavaModule {

    ReactContext reactContext;
    WritableMap params = Arguments.createMap();
    private static final String TAG = "NativeReactModule";

    public NativeReactModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "NativeReactExample";
    }

    @ReactMethod
    public void showNativeToast(String msg){
        Toast.makeText(getReactApplicationContext(),msg,Toast.LENGTH_LONG).show();
    }

    @ReactMethod
    public void startIntelActivity(String msg){
        Log.d(TAG, "startIntelActivity: ");
        Activity activity = getCurrentActivity();
        if (activity != null) {
            Intent intent = new Intent(activity, WooGeenActivity.class);
            activity.startActivity(intent);
        }
    }
}
