package com.mbridge.msdk.video.signal.p369a;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.signal.a.h */
/* compiled from: JSActivityProxy */
public final class C9423h extends C9414a {

    /* renamed from: a */
    private WebView f23032a;

    /* renamed from: b */
    private int f23033b = 0;

    public C9423h(WebView webView) {
        this.f23032a = webView;
    }

    /* renamed from: a */
    public final void mo62800a() {
        super.mo62800a();
        this.f23033b = 1;
        C8824g.m25670a().mo58310a(this.f23032a, "onSystemPause", "");
    }

    /* renamed from: b */
    public final void mo62803b() {
        super.mo62803b();
        this.f23033b = 0;
        C8824g.m25670a().mo58310a(this.f23032a, "onSystemResume", "");
    }

    /* renamed from: f */
    public final void mo62807f() {
        super.mo62807f();
        C8824g.m25670a().mo58310a(this.f23032a, "onSystemDestory", "");
    }

    /* renamed from: a */
    public final void mo62802a(Configuration configuration) {
        super.mo62802a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            C8824g.m25670a().mo58310a(this.f23032a, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    public final void mo62808g() {
        super.mo62808g();
        C8824g.m25670a().mo58310a(this.f23032a, "onSystemBackPressed", "");
    }

    /* renamed from: a */
    public final void mo62801a(int i) {
        super.mo62801a(i);
        this.f23033b = i;
    }

    /* renamed from: h */
    public final int mo62809h() {
        return this.f23033b;
    }
}
