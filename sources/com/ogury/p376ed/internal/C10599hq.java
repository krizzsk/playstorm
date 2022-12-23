package com.ogury.p376ed.internal;

import android.content.Context;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.hq */
public final class C10599hq implements C10589hj {

    /* renamed from: a */
    public static final C10600a f26743a = new C10600a((byte) 0);

    /* renamed from: b */
    private final C10595ho f26744b;

    /* renamed from: c */
    private final C10598hp f26745c;

    /* renamed from: d */
    private C10729lj<C10684ke> f26746d;

    /* renamed from: e */
    private C10729lj<C10684ke> f26747e;

    /* renamed from: f */
    private C10549gb f26748f = new C10550gc();

    /* renamed from: g */
    private final String[] f26749g = {"ogyCreateWebView", "ogyUpdateWebView", "ogyCloseWebView", "ogyNavigateBack", "ogyNavigateForward"};

    public C10599hq(C10595ho hoVar, C10598hp hpVar) {
        C10765mq.m32773b(hoVar, "browser");
        C10765mq.m32773b(hpVar, "multiWebViewCommandExecutor");
        this.f26744b = hoVar;
        this.f26745c = hpVar;
    }

    /* renamed from: a */
    public final void mo67568a(C10729lj<C10684ke> ljVar) {
        this.f26746d = ljVar;
    }

    /* renamed from: b */
    public final void mo67569b(C10729lj<C10684ke> ljVar) {
        this.f26747e = ljVar;
    }

    /* renamed from: com.ogury.ed.internal.hq$a */
    public static final class C10600a {
        public /* synthetic */ C10600a(byte b) {
            this();
        }

        private C10600a() {
        }
    }

    /* renamed from: a */
    public final boolean mo67541a(String str, C10660jh jhVar, C10483eb ebVar) {
        C10765mq.m32773b(str, "url");
        C10765mq.m32773b(jhVar, "webView");
        C10765mq.m32773b(ebVar, "ad");
        if (!C10592hl.m32219a(str)) {
            return false;
        }
        JSONObject jSONObject = new JSONObject(C10562gn.m32098a(C10592hl.m32220b(str)));
        String optString = jSONObject.optString("method", "");
        String optString2 = jSONObject.optString(TJAdUnitConstants.String.CALLBACK_ID, "");
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        C10765mq.m32770a((Object) optString, "command");
        C10765mq.m32770a((Object) optString2, TJAdUnitConstants.String.CALLBACK_ID);
        m32268a(optString, optJSONObject, optString2, jhVar);
        return C10686kg.m32639a(this.f26749g, optString);
    }

    /* renamed from: a */
    private final void m32268a(String str, JSONObject jSONObject, String str2, C10660jh jhVar) {
        switch (str.hashCode()) {
            case -1797727422:
                if (str.equals("ogyCloseWebView")) {
                    m32273c(jSONObject, str2, jhVar);
                    return;
                }
                return;
            case -1244773540:
                if (str.equals("ogyCreateWebView")) {
                    m32270a(jSONObject, str2, jhVar);
                    return;
                }
                return;
            case -692274449:
                if (str.equals("ogyUpdateWebView")) {
                    m32272b(jSONObject, str2, jhVar);
                    return;
                }
                return;
            case 960350259:
                if (str.equals("ogyNavigateForward")) {
                    m32271b(jSONObject);
                    return;
                }
                return;
            case 1635219001:
                if (str.equals("ogyNavigateBack")) {
                    m32269a(jSONObject);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private final void m32270a(JSONObject jSONObject, String str, C10660jh jhVar) {
        C10549gb gbVar = this.f26748f;
        Context context = jhVar.getContext();
        C10765mq.m32770a((Object) context, "webView.context");
        if (gbVar.mo67495a(context)) {
            C10610hw hwVar = C10610hw.f26779a;
            C10608hv a = C10610hw.m32323a(jSONObject);
            this.f26744b.mo67548a(a);
            C10598hp.m32261a(jhVar, str, a.mo67585c());
            C10729lj<C10684ke> ljVar = this.f26746d;
            if (ljVar != null) {
                ljVar.mo67074a();
                return;
            }
            return;
        }
        C10729lj<C10684ke> ljVar2 = this.f26747e;
        if (ljVar2 != null) {
            ljVar2.mo67074a();
        }
    }

    /* renamed from: b */
    private final void m32272b(JSONObject jSONObject, String str, C10660jh jhVar) {
        C10610hw hwVar = C10610hw.f26779a;
        C10608hv a = C10610hw.m32323a(jSONObject);
        this.f26744b.mo67552b(a);
        C10598hp.m32261a(jhVar, str, a.mo67585c());
    }

    /* renamed from: c */
    private final void m32273c(JSONObject jSONObject, String str, C10660jh jhVar) {
        String optString = jSONObject.optString("webViewId", "");
        C10595ho hoVar = this.f26744b;
        C10765mq.m32770a((Object) optString, "webViewId");
        hoVar.mo67550a(optString);
        C10598hp.m32261a(jhVar, str, optString);
    }

    /* renamed from: a */
    private final void m32269a(JSONObject jSONObject) {
        String optString = jSONObject.optString("webViewId", "");
        C10595ho hoVar = this.f26744b;
        C10765mq.m32770a((Object) optString, "webViewId");
        hoVar.mo67554b(optString);
    }

    /* renamed from: b */
    private final void m32271b(JSONObject jSONObject) {
        String optString = jSONObject.optString("webViewId", "");
        C10595ho hoVar = this.f26744b;
        C10765mq.m32770a((Object) optString, "webViewId");
        hoVar.mo67557c(optString);
    }
}
