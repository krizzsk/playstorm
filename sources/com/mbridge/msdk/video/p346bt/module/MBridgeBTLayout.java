package com.mbridge.msdk.video.p346bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.video.p346bt.p347a.C9196c;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTLayout */
public class MBridgeBTLayout extends BTBaseView {

    /* renamed from: p */
    private WebView f22292p;

    public void init(Context context) {
    }

    public void onDestory() {
    }

    public MBridgeBTLayout(Context context) {
        super(context);
    }

    public MBridgeBTLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setWebView(WebView webView) {
        this.f22292p = webView;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.f22292p != null) {
            try {
                if (this.f22191b == null || !this.f22191b.isDynamicView()) {
                    JSONObject jSONObject = new JSONObject();
                    if (configuration.orientation == 2) {
                        jSONObject.put("orientation", "landscape");
                    } else {
                        jSONObject.put("orientation", "portrait");
                    }
                    jSONObject.put("instanceId", this.f22193d);
                    C8824g.m25670a().mo58310a(this.f22292p, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void onBackPressed() {
        if (this.f22292p != null) {
            C9196c.m26194a().mo62126a(this.f22292p, "onSystemBackPressed", this.f22193d);
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f22292p != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", f22188n);
                jSONObject2.put("id", getInstanceId());
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                C8824g.m25670a().mo58310a(this.f22292p, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                C9196c.m26194a().mo62126a(this.f22292p, "broadcast", getInstanceId());
            }
        }
    }

    public void notifyEvent(String str) {
        WebView webView = this.f22292p;
        if (webView != null) {
            m26261a(webView, str, this.f22193d);
        }
    }
}
