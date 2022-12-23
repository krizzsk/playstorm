package com.tapjoy;

import android.os.AsyncTask;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyErrorMessage;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

public class TJWebViewJSInterface {

    /* renamed from: a */
    WebView f27477a;

    /* renamed from: b */
    TJWebViewJSInterfaceListener f27478b;

    /* renamed from: c */
    private final ConcurrentLinkedQueue<String> f27479c = new ConcurrentLinkedQueue<>();

    /* renamed from: d */
    private boolean f27480d;

    public TJWebViewJSInterface(WebView webView, TJWebViewJSInterfaceListener tJWebViewJSInterfaceListener) {
        this.f27477a = webView;
        this.f27478b = tJWebViewJSInterfaceListener;
    }

    @JavascriptInterface
    public void dispatchMethod(String str) {
        TapjoyLog.m33194d("TJWebViewJSInterface", "dispatchMethod params: ".concat(String.valueOf(str)));
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getJSONObject("data").getString("method");
            TapjoyLog.m33194d("TJWebViewJSInterface", "method: ".concat(String.valueOf(string)));
            if (this.f27478b != null && this.f27477a != null) {
                this.f27478b.onDispatchMethod(string, jSONObject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void callback(ArrayList<?> arrayList, String str, String str2) {
        try {
            callbackToJavaScript(new JSONArray(arrayList), str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void callback(Map<?, ?> map, String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject(map));
            callbackToJavaScript(jSONArray, str, str2);
        } catch (Exception e) {
            TapjoyLog.m33196e("TJWebViewJSInterface", "Exception in callback to JS: " + e.toString());
            e.printStackTrace();
        }
    }

    public void callbackToJavaScript(Object obj, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TJAdUnitConstants.String.ARGUMENTS, obj);
            if (str != null && str.length() > 0) {
                jSONObject.put("method", str);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (str2 != null && str2.length() > 0) {
                jSONObject2.put(TJAdUnitConstants.String.CALLBACK_ID, str2);
            }
            jSONObject2.put("data", jSONObject);
            String str3 = "javascript:if(window.AndroidWebViewJavascriptBridge) AndroidWebViewJavascriptBridge._handleMessageFromAndroid('" + jSONObject2 + "');";
            if (!this.f27480d) {
                this.f27479c.add(str3);
            } else if (this.f27477a != null) {
                new C11397a(this.f27477a).execute(new String[]{str3});
            } else {
                TapjoyLog.m33199w("TJWebViewJSInterface", "No available webview to execute js");
            }
        } catch (Exception e) {
            TapjoyLog.m33196e("TJWebViewJSInterface", "Exception in callback to JS: " + e.toString());
            e.printStackTrace();
        }
    }

    public void flushMessageQueue() {
        if (!this.f27480d) {
            while (true) {
                String poll = this.f27479c.poll();
                if (poll == null) {
                    this.f27480d = true;
                    return;
                } else if (this.f27477a != null) {
                    new C11397a(this.f27477a).execute(new String[]{poll});
                }
            }
        }
    }

    /* renamed from: com.tapjoy.TJWebViewJSInterface$a */
    class C11397a extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        WebView f27481a;

        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            return ((String[]) objArr)[0];
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            String str = (String) obj;
            if (this.f27481a == null) {
                return;
            }
            if (!str.startsWith("javascript:") || Build.VERSION.SDK_INT < 19) {
                try {
                    this.f27481a.loadUrl(str);
                } catch (Exception e) {
                    TapjoyErrorMessage.ErrorType errorType = TapjoyErrorMessage.ErrorType.INTERNAL_ERROR;
                    TapjoyLog.m33195e("TJWebViewJSInterface", new TapjoyErrorMessage(errorType, "Exception in loadUrl. Device not supported. " + e.toString()));
                }
            } else {
                try {
                    String replaceFirst = str.replaceFirst("javascript:", "");
                    if (this.f27481a != null) {
                        this.f27481a.evaluateJavascript(replaceFirst, (ValueCallback) null);
                    }
                } catch (Exception e2) {
                    TapjoyErrorMessage.ErrorType errorType2 = TapjoyErrorMessage.ErrorType.INTERNAL_ERROR;
                    TapjoyLog.m33195e("TJWebViewJSInterface", new TapjoyErrorMessage(errorType2, "Exception in evaluateJavascript. Device not supported. " + e2.toString()));
                }
            }
        }

        public C11397a(WebView webView) {
            this.f27481a = webView;
        }
    }
}
