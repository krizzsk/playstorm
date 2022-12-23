package com.saypromo.webplayer;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.saypromo.base.SPDebugLog;
import com.saypromo.core.device.Device;
import com.saypromo.core.log.DeviceLog;
import com.saypromo.core.misc.Utilities;
import com.saypromo.core.misc.ViewUtilities;
import com.saypromo.listeners.IWebPlayerListener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WebPlayer extends WebView {
    private String _appId;
    private Context _context;
    private String _debugId;
    private Map<String, String> _erroredSettings;
    /* access modifiers changed from: private */
    public Method _evaluateJavascript = null;
    private JSONObject _eventSettings;
    private long _htmlShowTimestamp = 0;
    private String _placeId;
    private final WebChromeClient _webChromeClient = new WebChromeClient() {
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onJsAlert(android.webkit.WebView r2, java.lang.String r3, java.lang.String r4, android.webkit.JsResult r5) {
            /*
                r1 = this;
                int r0 = r4.length()
                if (r0 <= 0) goto L_0x0063
                java.lang.String r2 = "event="
                boolean r3 = r4.contains(r2)
                if (r3 == 0) goto L_0x0026
                java.lang.String r3 = ""
                java.lang.String r2 = r4.replace(r2, r3)
                com.saypromo.webplayer.WebPlayer r3 = com.saypromo.webplayer.WebPlayer.this
                com.saypromo.listeners.IWebPlayerListener r3 = r3._webPlayerListener
                if (r3 == 0) goto L_0x005e
                com.saypromo.webplayer.WebPlayer r3 = com.saypromo.webplayer.WebPlayer.this
                com.saypromo.listeners.IWebPlayerListener r3 = r3._webPlayerListener
                r3.onWebPlayerSentEvent(r2)
                goto L_0x005e
            L_0x0026:
                java.lang.String r2 = "http"
                boolean r2 = r4.contains(r2)
                r3 = 0
                if (r2 == 0) goto L_0x004c
                android.net.Uri r2 = android.net.Uri.parse(r4)
                java.lang.String r4 = "x"
                java.lang.String r4 = r2.getQueryParameter(r4)
                java.lang.String r0 = "y"
                java.lang.String r2 = r2.getQueryParameter(r0)
                if (r4 == 0) goto L_0x004c
                if (r2 == 0) goto L_0x004c
                float r3 = java.lang.Float.parseFloat(r4)
                float r2 = java.lang.Float.parseFloat(r2)
                goto L_0x004d
            L_0x004c:
                r2 = r3
            L_0x004d:
                com.saypromo.webplayer.WebPlayer r4 = com.saypromo.webplayer.WebPlayer.this
                com.saypromo.listeners.IWebPlayerListener r4 = r4._webPlayerListener
                if (r4 == 0) goto L_0x005e
                com.saypromo.webplayer.WebPlayer r4 = com.saypromo.webplayer.WebPlayer.this
                com.saypromo.listeners.IWebPlayerListener r4 = r4._webPlayerListener
                r4.onWebPlayerClicked(r3, r2)
            L_0x005e:
                r5.confirm()
                r2 = 1
                return r2
            L_0x0063:
                boolean r2 = super.onJsAlert(r2, r3, r4, r5)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.saypromo.webplayer.WebPlayer.C109102.onJsAlert(android.webkit.WebView, java.lang.String, java.lang.String, android.webkit.JsResult):boolean");
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return super.onConsoleMessage(consoleMessage);
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            super.onShowCustomView(view, customViewCallback);
        }
    };
    /* access modifiers changed from: private */
    public IWebPlayerListener _webPlayerListener;
    private final WebViewClient _webViewClient = new WebViewClient() {
        public void onPageFinished(WebView webView, String str) {
            WebPlayer.this.loadMraid();
            super.onPageFinished(webView, str);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            float f;
            if (str.contains("mraid://open?url=event")) {
                String replace = Uri.decode(str).replace("mraid://open?url=event=", "");
                if (WebPlayer.this._webPlayerListener != null) {
                    WebPlayer.this._webPlayerListener.onWebPlayerSentEvent(replace);
                }
                WebPlayer.this.loadUrl("javascript:window.mraidbridge.nativeCallComplete('open');");
                return true;
            } else if (!str.contains("mraid://open?url=http")) {
                return true;
            } else {
                Uri parse = Uri.parse(Uri.decode(str).replace("mraid://open?url=", ""));
                String queryParameter = parse.getQueryParameter("x");
                String queryParameter2 = parse.getQueryParameter("y");
                float f2 = 0.0f;
                if (queryParameter == null || queryParameter2 == null) {
                    f = 0.0f;
                } else {
                    f2 = Float.parseFloat(queryParameter);
                    f = Float.parseFloat(queryParameter2);
                }
                if (WebPlayer.this._webPlayerListener != null) {
                    WebPlayer.this._webPlayerListener.onWebPlayerClicked(f2, f);
                }
                WebPlayer.this.loadUrl("javascript:window.mraidbridge.nativeCallComplete('open');");
                return true;
            }
        }
    };

    public void TrackDebugEvent(String str) {
        String str2 = this._debugId;
        if (str2 != null && !str2.isEmpty()) {
            long j = 0;
            if (str.equals("html_destroy") || str.equals("html_click")) {
                j = Device.getTimestampInMillis() - this._htmlShowTimestamp;
            }
            SPDebugLog.sharedInstance.trackEventWithId(this._debugId, this._appId, this._placeId, str, "", j, 0, 0);
            if (str.equals("html_show")) {
                this._htmlShowTimestamp = Device.getTimestampInMillis();
            }
        }
    }

    public WebPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this._context = context;
    }

    public void init(String str, String str2, String str3) {
        this._appId = str;
        this._placeId = str2;
        this._debugId = str3;
        WebSettings settings = getSettings();
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                this._evaluateJavascript = WebView.class.getMethod("evaluateJavascript", new Class[]{String.class, ValueCallback.class});
            } catch (NoSuchMethodException e) {
                DeviceLog.exception("Method evaluateJavascript not found", e);
                this._evaluateJavascript = null;
            }
        }
        settings.setAllowFileAccess(true);
        settings.setAppCacheEnabled(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDomStorageEnabled(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        ViewUtilities.setBackground(this, new ColorDrawable(0));
        setBackgroundResource(0);
        setWebViewClient(this._webViewClient);
        setWebChromeClient(this._webChromeClient);
        TrackDebugEvent("html_init");
    }

    public void setWebPlayerListener(IWebPlayerListener iWebPlayerListener) {
        this._webPlayerListener = iWebPlayerListener;
    }

    public void setEventSettings(JSONObject jSONObject) {
        this._eventSettings = jSONObject;
    }

    public void setSettings(JSONObject jSONObject, JSONObject jSONObject2) {
        Map<String, String> map = this._erroredSettings;
        if (map != null) {
            map.clear();
        }
        setTargetSettings(getSettings(), jSONObject);
        setTargetSettings(this, jSONObject2);
    }

    public Map<String, String> getErroredSettings() {
        return this._erroredSettings;
    }

    private Object setTargetSettings(Object obj, JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    obj.getClass().getMethod(next, getTypes(jSONArray)).invoke(obj, getValues(jSONArray));
                } catch (Exception e) {
                    addErroredSetting(next, e.getMessage());
                    DeviceLog.exception("Setting errored", e);
                }
            }
        }
        return obj;
    }

    public void invokeJavascript(String str) {
        Utilities.runOnUiThread(new JavaScriptInvocation(str, this));
    }

    public void sendEvent(JSONArray jSONArray) {
        invokeJavascript("javascript:window.nativebridge.receiveEvent(" + jSONArray.toString() + ")");
    }

    private class JavaScriptInvocation implements Runnable {
        private String _jsString = null;
        private WebView _webView = null;

        public JavaScriptInvocation(String str, WebView webView) {
            this._jsString = str;
            this._webView = webView;
        }

        public void run() {
            if (this._jsString != null) {
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        WebPlayer.this._evaluateJavascript.invoke(this._webView, new Object[]{this._jsString, null});
                        return;
                    }
                    WebPlayer.this.loadUrl(this._jsString);
                } catch (Exception e) {
                    DeviceLog.exception("Error while processing JavaScriptString", e);
                }
            } else {
                DeviceLog.error("Could not process JavaScript, the string is NULL");
            }
        }
    }

    private Class<?>[] getTypes(JSONArray jSONArray) throws JSONException, ClassNotFoundException {
        if (jSONArray == null) {
            return null;
        }
        Class<?>[] clsArr = new Class[jSONArray.length()];
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (jSONArray.get(i) instanceof JSONObject) {
                    Class<?> cls = Class.forName(((JSONObject) jSONArray.get(i)).getString("className"));
                    if (cls != null) {
                        clsArr[i] = cls;
                    }
                } else {
                    clsArr[i] = getPrimitiveClass(jSONArray.get(i).getClass());
                }
            }
        }
        return clsArr;
    }

    public Class<?> getPrimitiveClass(Class<?> cls) {
        String name = cls.getName();
        if (name.equals("java.lang.Byte")) {
            return Byte.TYPE;
        }
        if (name.equals("java.lang.Short")) {
            return Short.TYPE;
        }
        if (name.equals("java.lang.Integer")) {
            return Integer.TYPE;
        }
        if (name.equals("java.lang.Long")) {
            return Long.TYPE;
        }
        if (name.equals("java.lang.Character")) {
            return Character.TYPE;
        }
        if (name.equals("java.lang.Float")) {
            return Float.TYPE;
        }
        if (name.equals("java.lang.Double")) {
            return Double.TYPE;
        }
        if (name.equals("java.lang.Boolean")) {
            return Boolean.TYPE;
        }
        return name.equals("java.lang.Void") ? Void.TYPE : cls;
    }

    private Object[] getValues(JSONArray jSONArray) throws JSONException, ClassNotFoundException, NoSuchMethodException {
        Class<?> cls;
        if (jSONArray == null) {
            return null;
        }
        Object[] objArr = new Object[jSONArray.length()];
        Object[] objArr2 = new Object[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.get(i) instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                Object obj = jSONObject.get("value");
                String string = jSONObject.getString("type");
                String string2 = jSONObject.has("className") ? jSONObject.getString("className") : null;
                if (!(string2 == null || !string.equals("Enum") || (cls = Class.forName(string2)) == null)) {
                    objArr2[i] = Enum.valueOf(cls, (String) obj);
                }
            } else {
                objArr2[i] = jSONArray.get(i);
            }
        }
        if (jSONArray != null) {
            System.arraycopy(objArr2, 0, objArr, 0, jSONArray.length());
        }
        return objArr;
    }

    private void addErroredSetting(String str, String str2) {
        if (this._erroredSettings == null) {
            this._erroredSettings = new HashMap();
        }
        this._erroredSettings.put(str, str2);
    }

    public void loadMraid() {
        try {
            loadUrl("javascript:(function() {\n  var isIOS = (/iphone|ipad|ipod/i).test(window.navigator.userAgent.toLowerCase());\n  if (isIOS) {\n    console = {};\n    console.log = function(log) {\n      var iframe = document.createElement('iframe');\n      iframe.setAttribute('src', 'ios-log: ' + log);\n      document.documentElement.appendChild(iframe);\n      iframe.parentNode.removeChild(iframe);\n      iframe = null;\n    };\n    console.debug = console.info = console.warn = console.error = console.log;\n  }\n}());\n(function() {\n  var mraid = window.mraid = {};\n\n  var bridge = window.mraidbridge = {\n    nativeSDKFiredReady: false,\n    nativeCallQueue: [],\n    nativeCallInFlight: false,\n    lastSizeChangeProperties: null\n  };\n\n\n  bridge.fireChangeEvent = function(properties) {\n    for (var p in properties) {\n      if (properties.hasOwnProperty(p)) {\n        var handler = changeHandlers[p];\n        handler(properties[p]);\n      }\n    }\n  };\n\n  bridge.nativeCallComplete = function(command) {\n    if (this.nativeCallQueue.length === 0) {\n      this.nativeCallInFlight = false;\n      return;\n    }\n\n    var nextCall = this.nativeCallQueue.pop();\n    window.location = nextCall;\n  };\n\n\n  bridge.executeNativeCall = function(args) {\n    var command = args.shift();\n\n    if (!this.nativeSDKFiredReady) {\n        console.log('rejecting ' + command + ' because mraid is not ready');\n        bridge.notifyErrorEvent('mraid is not ready', command);\n        return;\n    }\n\n    var call = 'mraid://' + command;\n\n    var key, value;\n    var isFirstArgument = true;\n\n    for (var i = 0; i < args.length; i += 2) {\n      key = args[i];\n      value = args[i + 1];\n\n      if (value === null) continue;\n\n      if (isFirstArgument) {\n        call += '?';\n        isFirstArgument = false;\n      } else {\n        call += '&';\n      }\n\n      call += encodeURIComponent(key) + '=' + encodeURIComponent(value);\n    }\n\n    if (this.nativeCallInFlight) {\n      this.nativeCallQueue.push(call);\n    } else {\n      this.nativeCallInFlight = true;\n      window.location = call;\n    }\n  };\n\n\n  bridge.setCurrentPosition = function(x, y, width, height) {\n    currentPosition = {\n      x: x,\n      y: y,\n      width: width,\n      height: height\n    };\n    broadcastEvent(EVENTS.INFO, 'Set current position to ' + stringify(currentPosition));\n  };\n\n  bridge.setDefaultPosition = function(x, y, width, height) {\n    defaultPosition = {\n      x: x,\n      y: y,\n      width: width,\n      height: height\n    };\n    broadcastEvent(EVENTS.INFO, 'Set default position to ' + stringify(defaultPosition));\n  };\n  \n  bridge.setMaxSize = function(width, height) {\n    maxSize = {\n      width: width,\n      height: height\n    };\n\n    expandProperties.width = width;\n    expandProperties.height = height;\n\n    broadcastEvent(EVENTS.INFO, 'Set max size to ' + stringify(maxSize));\n  };\n\n  bridge.setPlacementType = function(_placementType) {\n    placementType = _placementType;\n    broadcastEvent(EVENTS.INFO, 'Set placement type to ' + stringify(placementType));\n  };\n\n  bridge.setScreenSize = function(width, height) {\n    screenSize = {\n      width: width,\n      height: height\n    };\n    broadcastEvent(EVENTS.INFO, 'Set screen size to ' + stringify(screenSize));\n  };\n\n  bridge.setState = function(_state) {\n    state = _state;\n    broadcastEvent(EVENTS.INFO, 'Set state to ' + stringify(state));\n    broadcastEvent(EVENTS.STATECHANGE, state);\n  };\n\n  bridge.setIsViewable = function(_isViewable) {\n    isViewable = _isViewable;\n    broadcastEvent(EVENTS.INFO, 'Set isViewable to ' + stringify(isViewable));\n    broadcastEvent(EVENTS.VIEWABLECHANGE, isViewable);\n  };\n\n  bridge.setSupports = function(sms, tel, calendar, storePicture, inlineVideo) {\n    supportProperties = {\n      sms: sms,\n      tel: tel,\n      calendar: calendar,\n      storePicture: storePicture,\n      inlineVideo: inlineVideo\n    };\n  };\n\n  bridge.notifyReadyEvent = function() {\n    this.nativeSDKFiredReady = true;\n    broadcastEvent(EVENTS.READY);\n  };\n\n\n  bridge.notifyErrorEvent = function(message, action) {\n    broadcastEvent(EVENTS.ERROR, message, action);\n  };\n\n  bridge.fireReadyEvent = bridge.notifyReadyEvent;\n  bridge.fireErrorEvent = bridge.notifyErrorEvent;\n\n  bridge.notifySizeChangeEvent = function(width, height) {\n    if (this.lastSizeChangeProperties &&\n          width == this.lastSizeChangeProperties.width && height == this.lastSizeChangeProperties.height) {\n      return;\n    }\n\n    this.lastSizeChangeProperties = {\n        width: width,\n        height: height\n    };\n    broadcastEvent(EVENTS.SIZECHANGE, width, height);\n  };\n\n  bridge.notifyStateChangeEvent = function() {\n    if (state === STATES.LOADING) {\n      broadcastEvent(EVENTS.INFO, 'Native SDK initialized.');\n    }\n\n    broadcastEvent(EVENTS.INFO, 'Set state to ' + stringify(state));\n    broadcastEvent(EVENTS.STATECHANGE, state);\n  };\n\n  bridge.notifyViewableChangeEvent = function() {\n    broadcastEvent(EVENTS.INFO, 'Set isViewable to ' + stringify(isViewable));\n    broadcastEvent(EVENTS.VIEWABLECHANGE, isViewable);\n  };\n\n\n  var VERSION = mraid.VERSION = '2.0';\n\n  var STATES = mraid.STATES = {\n    LOADING: 'loading',\n    DEFAULT: 'default',\n    EXPANDED: 'expanded',\n    HIDDEN: 'hidden',\n    RESIZED: 'resized'\n  };\n\n  var EVENTS = mraid.EVENTS = {\n    ERROR: 'error',\n    INFO: 'info',\n    READY: 'ready',\n    STATECHANGE: 'stateChange',\n    VIEWABLECHANGE: 'viewableChange',\n    SIZECHANGE: 'sizeChange'\n  };\n\n  var PLACEMENT_TYPES = mraid.PLACEMENT_TYPES = {\n    UNKNOWN: 'unknown',\n    INLINE: 'inline',\n    INTERSTITIAL: 'interstitial'\n  };\n\n\n  var expandProperties = {\n    width: false,\n    height: false,\n    useCustomClose: false,\n    isModal: true\n  };\n\n  var resizeProperties = {\n    width: false, \n    height: false,\n    offsetX: false, \n    offsetY: false,\n    customClosePosition: 'top-right',\n    allowOffscreen: true\n  };\n\n  var orientationProperties = {\n    allowOrientationChange: true,\n    forceOrientation: \"none\"\n  };\n\n  var supportProperties = {\n    sms: false,\n    tel: false,\n    calendar: false,\n    storePicture: false,\n    inlineVideo: false\n  };\n\n\n  var lastSizeChangeProperties;\n\n  var maxSize = {};\n\n  var currentPosition = {};\n\n  var defaultPosition = {};\n\n  var screenSize = {};\n\n  var hasSetCustomClose = false;\n\n  var listeners = {};\n\n\n  var state = STATES.LOADING;\n\n  var isViewable = false;\n\n  var placementType = PLACEMENT_TYPES.UNKNOWN;\n\n  var hostSDKVersion = {\n    'major': 0,\n    'minor': 0,\n    'patch': 0\n  };\n\n  var EventListeners = function(event) {\n    this.event = event;\n    this.count = 0;\n    var listeners = {};\n\n    this.add = function(func) {\n      var id = String(func);\n      if (!listeners[id]) {\n        listeners[id] = func;\n        this.count++;\n      }\n    };\n\n    this.remove = function(func) {\n      var id = String(func);\n      if (listeners[id]) {\n        listeners[id] = null;\n        delete listeners[id];\n        this.count--;\n        return true;\n      } else {\n        return false;\n      }\n    };\n\n    this.removeAll = function() {\n      for (var id in listeners) {\n        if (listeners.hasOwnProperty(id)) this.remove(listeners[id]);\n      }\n    };\n\n    this.broadcast = function(args) {\n      for (var id in listeners) {\n        if (listeners.hasOwnProperty(id)) listeners[id].apply(mraid, args);\n      }\n    };\n\n    this.toString = function() {\n      var out = [event, ':'];\n      for (var id in listeners) {\n        if (listeners.hasOwnProperty(id)) out.push('|', id, '|');\n      }\n      return out.join('');\n    };\n  };\n\n  var broadcastEvent = function() {\n    var args = new Array(arguments.length);\n    var l = arguments.length;\n    for (var i = 0; i < l; i++) args[i] = arguments[i]; \n    var event = args.shift();\n    if (listeners[event]) listeners[event].broadcast(args);\n  };\n\n  var contains = function(value, array) {\n    for (var i in array) {\n      if (array[i] === value) return true;\n    }\n    return false;\n  };\n\n  var clone = function(obj) {\n    if (obj === null) return null;\n    var f = function() {};\n    f.prototype = obj;\n    return new f();\n  };\n\n  var stringify = function(obj) {\n    if (typeof obj === 'object') {\n      var out = [];\n      if (obj.push) {\n\n        for (var p in obj) out.push(obj[p]);\n        return '[' + out.join(',') + ']';\n      } else {\n\n        for (var p in obj) out.push(\"'\" + p + \"': \" + obj[p]);\n        return '{' + out.join(',') + '}';\n      }\n    } else return String(obj);\n  };\n\n  var trim = function(str) {\n    return str.replace(/^\\s+|\\s+$/g, '');\n  };\n\n\n  var changeHandlers = {\n    state: function(val) {\n      if (state === STATES.LOADING) {\n        broadcastEvent(EVENTS.INFO, 'Native SDK initialized.');\n      }\n      state = val;\n      broadcastEvent(EVENTS.INFO, 'Set state to ' + stringify(val));\n      broadcastEvent(EVENTS.STATECHANGE, state);\n    },\n\n    viewable: function(val) {\n      isViewable = val;\n      broadcastEvent(EVENTS.INFO, 'Set isViewable to ' + stringify(val));\n      broadcastEvent(EVENTS.VIEWABLECHANGE, isViewable);\n    },\n\n    placementType: function(val) {\n      broadcastEvent(EVENTS.INFO, 'Set placementType to ' + stringify(val));\n      placementType = val;\n    },\n\n    sizeChange: function(val) {\n      broadcastEvent(EVENTS.INFO, 'Set screenSize to ' + stringify(val));\n      for (var key in val) {\n        if (val.hasOwnProperty(key)) screenSize[key] = val[key];\n      }\n    },\n\n    supports: function(val) {\n      broadcastEvent(EVENTS.INFO, 'Set supports to ' + stringify(val));\n      supportProperties = val;\n    },\n\n    hostSDKVersion: function(val) {\n\n      var versions = val.split('.').map(function(version) {\n        return parseInt(version, 10);\n      }).filter(function(version) {\n        return version >= 0;\n      });\n\n      if (versions.length >= 3) {\n        hostSDKVersion['major'] = parseInt(versions[0], 10);\n        hostSDKVersion['minor'] = parseInt(versions[1], 10);\n        hostSDKVersion['patch'] = parseInt(versions[2], 10);\n        broadcastEvent(EVENTS.INFO, 'Set hostSDKVersion to ' + stringify(hostSDKVersion));\n      }\n    }\n  };\n\n  var validate = function(obj, validators, action, merge) {\n    if (!merge) {\n\n      if (obj === null) {\n        broadcastEvent(EVENTS.ERROR, 'Required object not provided.', action);\n        return false;\n      } else {\n        for (var i in validators) {\n          if (validators.hasOwnProperty(i) && obj[i] === undefined) {\n            broadcastEvent(EVENTS.ERROR, 'Object is missing required property: ' + i, action);\n            return false;\n          }\n        }\n      }\n    }\n\n    for (var prop in obj) {\n      var validator = validators[prop];\n      var value = obj[prop];\n      if (validator && !validator(value)) {\n\n        broadcastEvent(EVENTS.ERROR, 'Value of property ' + prop + ' is invalid: ' + value, action);\n        return false;\n      }\n    }\n    return true;\n  };\n\n  var expandPropertyValidators = {\n    useCustomClose: function(v) { return (typeof v === 'boolean'); },\n  };\n\n  mraid.addEventListener = function(event, listener) {\n    if (!event || !listener) {\n      broadcastEvent(EVENTS.ERROR, 'Both event and listener are required.', 'addEventListener');\n    } else if (!contains(event, EVENTS)) {\n      broadcastEvent(EVENTS.ERROR, 'Unknown MRAID event: ' + event, 'addEventListener');\n    } else {\n      if (!listeners[event]) {\n        listeners[event] = new EventListeners(event);\n      }\n      listeners[event].add(listener);\n    }\n  };\n\n  mraid.close = function() {\n    if (state === STATES.HIDDEN) {\n      broadcastEvent(EVENTS.ERROR, 'Ad cannot be closed when it is already hidden.',\n        'close');\n    } else bridge.executeNativeCall(['close']);\n  };\n\n  mraid.expand = function(URL) {\n    if (!(this.getState() === STATES.DEFAULT || this.getState() === STATES.RESIZED)) {\n      broadcastEvent(EVENTS.ERROR, 'Ad can only be expanded from the default or resized state.', 'expand');\n    } else {\n      var args = ['expand',\n        'shouldUseCustomClose', expandProperties.useCustomClose\n      ];\n\n      if (URL) {\n        args = args.concat(['url', URL]);\n      }\n\n      bridge.executeNativeCall(args);\n    }\n  };\n\n  mraid.getExpandProperties = function() {\n    var properties = {\n      width: expandProperties.width,\n      height: expandProperties.height,\n      useCustomClose: expandProperties.useCustomClose,\n      isModal: expandProperties.isModal\n    };\n    return properties;\n  };\n\n\n  mraid.getCurrentPosition = function() {\n    return {\n      x: currentPosition.x,\n      y: currentPosition.y,\n      width: currentPosition.width,\n      height: currentPosition.height\n    };\n  };\n\n  mraid.getDefaultPosition = function() {\n    return {\n      x: defaultPosition.x,\n      y: defaultPosition.y,\n      width: defaultPosition.width,\n      height: defaultPosition.height\n    };\n  };\n\n  mraid.getMaxSize = function() {\n    return {\n      width: maxSize.width,\n      height: maxSize.height\n    };\n  };\n\n  mraid.getPlacementType = function() {\n    return placementType;\n  };\n\n  mraid.getScreenSize = function() {\n    return {\n      width: screenSize.width,\n      height: screenSize.height\n    };\n  };\n\n  mraid.getState = function() {\n    return state;\n  };\n\n  mraid.isViewable = function() {\n    return isViewable;\n  };\n\n  mraid.getVersion = function() {\n    return mraid.VERSION;\n  };\n\n  mraid.open = function(URL) {\n   if (!URL) broadcastEvent(EVENTS.ERROR, 'URL is required.', 'open');\n    else bridge.executeNativeCall(['open', 'url', URL]);\n  };\n\n  mraid.removeEventListener = function(event, listener) {\n    if (!event) {\n      broadcastEvent(EVENTS.ERROR, 'Event is required.', 'removeEventListener');\n      return;\n    }\n\n    if (listener) {\n      var success = false;\n      if (listeners[event]) {\n        success = listeners[event].remove(listener);\n      }\n\n      if (!success) {\n        broadcastEvent(EVENTS.ERROR, 'Listener not currently registered for event.', 'removeEventListener');\n        return;\n      }\n\n    } else if (!listener && listeners[event]) {\n      listeners[event].removeAll();\n    }\n\n    if (listeners[event] && listeners[event].count === 0) {\n      listeners[event] = null;\n      delete listeners[event];\n    }\n  };\n\n  mraid.setExpandProperties = function(properties) {\n    if (validate(properties, expandPropertyValidators, 'setExpandProperties', true)) {\n      if (properties.hasOwnProperty('useCustomClose')) {\n        expandProperties.useCustomClose = properties.useCustomClose;\n      }\n    }\n  };\n\n  mraid.useCustomClose = function(shouldUseCustomClose) {\n    expandProperties.useCustomClose = shouldUseCustomClose;\n    hasSetCustomClose = true;\n    bridge.executeNativeCall(['usecustomclose', 'shouldUseCustomClose', shouldUseCustomClose]);\n  };\n\n\n  mraid.supports = function(feature) {\n    return supportProperties[feature];\n  };\n\n  mraid.playVideo = function(uri) {\n    if (!mraid.isViewable()) {\n      broadcastEvent(EVENTS.ERROR, 'playVideo cannot be called until the ad is viewable', 'playVideo');\n      return;\n    }\n\n    if (!uri) {\n      broadcastEvent(EVENTS.ERROR, 'playVideo must be called with a valid URI', 'playVideo');\n    } else {\n      bridge.executeNativeCall(['playVideo', 'uri', uri]);\n    }\n  };\n\n  mraid.storePicture = function(uri) {\n    if (!mraid.isViewable()) {\n      broadcastEvent(EVENTS.ERROR, 'storePicture cannot be called until the ad is viewable', 'storePicture');\n      return;\n    }\n\n    if (!uri) {\n      broadcastEvent(EVENTS.ERROR, 'storePicture must be called with a valid URI', 'storePicture');\n    } else {\n      bridge.executeNativeCall(['storePicture', 'uri', uri]);\n    }\n  };\n\n\n  var resizePropertyValidators = {\n    width: function(v) {\n      return !isNaN(v) && v > 0; \n    },\n    height: function(v) {\n      return !isNaN(v) && v > 0; \n    },\n    offsetX: function(v) {\n      return !isNaN(v);\n    },\n    offsetY: function(v) {\n      return !isNaN(v);\n    },\n    customClosePosition: function(v) {\n      return (typeof v === 'string' && \n        ['top-right', 'bottom-right', 'top-left', 'bottom-left', 'center', 'top-center', 'bottom-center'].indexOf(v) > -1);\n    },\n    allowOffscreen: function(v) {\n      return (typeof v === 'boolean');\n    }\n  };\n\n  mraid.setOrientationProperties = function(properties) {\n\n    if (properties.hasOwnProperty('allowOrientationChange')) {\n      orientationProperties.allowOrientationChange = properties.allowOrientationChange;\n    }\n\n    if (properties.hasOwnProperty('forceOrientation')) {\n      orientationProperties.forceOrientation = properties.forceOrientation;\n    }\n\n    var args = ['setOrientationProperties',\n      'allowOrientationChange', orientationProperties.allowOrientationChange,\n      'forceOrientation', orientationProperties.forceOrientation\n    ];\n    bridge.executeNativeCall(args);\n  };\n\n  mraid.getOrientationProperties = function() {\n    return {\n      allowOrientationChange: orientationProperties.allowOrientationChange,\n      forceOrientation: orientationProperties.forceOrientation\n    };\n  };\n\n  mraid.resize = function() {\nif (!(this.getState() === STATES.DEFAULT || this.getState() === STATES.RESIZED)) {\n      broadcastEvent(EVENTS.ERROR, 'Ad can only be resized from the default or resized state.', 'resize');\n    } else if (!resizeProperties.width || !resizeProperties.height) {\n      broadcastEvent(EVENTS.ERROR, 'Must set resize properties before calling resize()', 'resize');\n    } else {\n      var args = ['resize',\n        'width', resizeProperties.width,\n        'height', resizeProperties.height,\n        'offsetX', resizeProperties.offsetX || 0,\n        'offsetY', resizeProperties.offsetY || 0,\n        'customClosePosition', resizeProperties.customClosePosition,\n        'allowOffscreen', !!resizeProperties.allowOffscreen\n        ];\n\n      bridge.executeNativeCall(args);\n    } \n  };\n\n  mraid.getResizeProperties = function() {\n    var properties = {\n      width: resizeProperties.width,\n      height: resizeProperties.height,\n      offsetX: resizeProperties.offsetX,\n      offsetY: resizeProperties.offsetY,\n      customClosePosition: resizeProperties.customClosePosition,\n      allowOffscreen: resizeProperties.allowOffscreen\n    };\n    return properties;\n  };\n\n  mraid.setResizeProperties = function(properties) {\n    if (validate(properties, resizePropertyValidators, 'setResizeProperties', true)) {\n\n      var desiredProperties = ['width', 'height', 'offsetX', 'offsetY', 'customClosePosition', 'allowOffscreen'];\n\n      var length = desiredProperties.length;\n\n      for (var i = 0; i < length; i++) {\n        var propname = desiredProperties[i];\n        if (properties.hasOwnProperty(propname)) {\n          resizeProperties[propname] = properties[propname];\n        }\n      }\n    }\n  };\n\n  mraid.getHostSDKVersion = function() {\n    return hostSDKVersion;\n  }\n\n}());");
            loadUrl("javascript:window.mraidbridge.fireReadyEvent();");
            loadUrl("javascript:window.mraidbridge.setMaxSize(" + getWidth() + ", " + getHeight() + ");");
            loadUrl("javascript:window.mraidbridge.fireChangeEvent({viewable:true, state: 'default' });");
            TrackDebugEvent("html_mraid_load");
        } catch (Exception e) {
            DeviceLog.info(e.getMessage());
        }
    }
}
