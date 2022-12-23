package com.mbridge.msdk.video.signal.p369a;

import android.util.Base64;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.signal.a.l */
/* compiled from: JSNotifyProxy */
public final class C9428l extends C9420e {

    /* renamed from: a */
    private WebView f23053a;

    public C9428l(WebView webView) {
        this.f23053a = webView;
    }

    /* renamed from: a */
    public final void mo62839a(int i) {
        super.mo62839a(i);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", i);
            C8824g.m25670a().mo58310a(this.f23053a, "onVideoStatusNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo62841a(int i, String str) {
        super.mo62841a(i, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i);
            jSONObject.put("pt", str);
            C8824g.m25670a().mo58310a(this.f23053a, "onJSClick", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo62842a(MBridgeVideoView.C9382a aVar) {
        super.mo62842a(aVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, m27066a(aVar.f22942a, aVar.f22943b));
            jSONObject.put("time", String.valueOf(aVar.f22942a));
            jSONObject.put("duration", String.valueOf(aVar.f22943b));
            C8824g.m25670a().mo58310a(this.f23053a, "onVideoProgressNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private String m27066a(int i, int i2) {
        if (i2 != 0) {
            double d = (double) (((float) i) / ((float) i2));
            try {
                return C8613y.m24910a(Double.valueOf(d)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i2 + "";
    }

    /* renamed from: a */
    public final void mo62843a(Object obj) {
        super.mo62843a(obj);
        C8824g.m25670a().mo58310a(this.f23053a, "webviewshow", (obj == null || !(obj instanceof String)) ? "" : Base64.encodeToString(obj.toString().getBytes(), 2));
    }

    /* renamed from: a */
    public final void mo62840a(int i, int i2, int i3, int i4) {
        super.mo62840a(i, i2, i3, i4);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = "landscape";
            if (i != 2 ? i2 != 2 : i2 == 1) {
                str = "portrait";
            }
            jSONObject2.put("orientation", str);
            jSONObject2.put("screen_width", i3);
            jSONObject2.put("screen_height", i4);
            jSONObject.put("data", jSONObject2);
            C8824g.m25670a().mo58310a(this.f23053a, "showDataInfo", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
