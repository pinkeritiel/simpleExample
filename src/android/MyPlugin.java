package com.mindfire.plugin;
 
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CallbackContext;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import android.app.Activity;
import android.content.Intent;

public class MyPlugin extends CordovaPlugin {
     public static final String ACTION_DEMO = "sampleAction";
@Override
public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
try {
		alert(action);
    if (ACTION_DEMO.equals(action)) {
       JSONObject argObject = args.getJSONObject(0);
 
       // 'argObject' contains all the passed arguments. Use the getter method to grab them.
       // eg:  argObject.getString(“my-param”)
 
       // Here goes our custom code
 		alert('sampleAction');
       callbackContext.success();
       return true;
    }
    callbackContext.error("No such action defined");
    return false;
} catch(Exception e) {
    callbackContext.error(e.getMessage());
    return false;
} 
}
}