package com.ogury.p376ed.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ogury.p376ed.internal.C10648iz;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.smaato.sdk.video.vast.model.Creative;
import com.tapjoy.TJAdUnitConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.it */
public abstract class C10639it implements C10589hj {

    /* renamed from: a */
    public static final C10640a f26852a = new C10640a((byte) 0);

    /* renamed from: b */
    private final C10580hb f26853b;

    /* renamed from: c */
    private C10427da f26854c = C10427da.f26371a;

    /* renamed from: a */
    public void mo67641a() {
    }

    /* renamed from: a */
    public void mo67644a(C10493ek ekVar) {
        C10765mq.m32773b(ekVar, IronSourceConstants.EVENTS_AD_UNIT);
    }

    /* renamed from: a */
    public void mo67645a(C10648iz izVar) {
    }

    /* renamed from: a */
    public void mo67646a(String str) {
        C10765mq.m32773b(str, Creative.AD_ID);
    }

    /* renamed from: a */
    public void mo67647a(String str, String str2) {
        C10765mq.m32773b(str2, Creative.AD_ID);
    }

    /* renamed from: a */
    public void mo67648a(String str, String str2, String str3) {
        C10765mq.m32773b(str2, TJAdUnitConstants.String.CALLBACK_ID);
        C10765mq.m32773b(str3, Creative.AD_ID);
    }

    /* renamed from: a */
    public void mo67649a(Map<String, String> map, String str) {
        C10765mq.m32773b(map, "params");
        C10765mq.m32773b(str, "args");
    }

    /* renamed from: a */
    public void mo67642a(boolean z) {
    }

    /* renamed from: b */
    public void mo67650b() {
    }

    /* renamed from: b */
    public void mo67651b(String str) {
        C10765mq.m32773b(str, Creative.AD_ID);
    }

    /* renamed from: b */
    public void mo67652b(String str, String str2) {
        C10765mq.m32773b(str2, TJAdUnitConstants.String.CALLBACK_ID);
    }

    /* renamed from: b */
    public void mo67643b(boolean z) {
    }

    /* renamed from: c */
    public void mo67653c() {
    }

    /* renamed from: c */
    public void mo67654c(String str) {
        C10765mq.m32773b(str, Creative.AD_ID);
    }

    /* renamed from: c */
    public void mo67655c(boolean z) {
    }

    public C10639it(C10580hb hbVar) {
        C10765mq.m32773b(hbVar, "mraidCommandExecutor");
        this.f26853b = hbVar;
    }

    /* renamed from: com.ogury.ed.internal.it$a */
    public static final class C10640a {
        public /* synthetic */ C10640a(byte b) {
            this();
        }

        private C10640a() {
        }
    }

    /* renamed from: a */
    public final boolean mo67541a(String str, C10660jh jhVar, C10483eb ebVar) {
        C10765mq.m32773b(str, "url");
        C10765mq.m32773b(jhVar, "webView");
        C10765mq.m32773b(ebVar, "ad");
        C10562gn.m32098a(str);
        if (!m32475a(jhVar)) {
            return true;
        }
        m32472a(str, ebVar);
        return true;
    }

    /* renamed from: a */
    private static boolean m32475a(C10660jh jhVar) {
        return !C10765mq.m32772a((Object) jhVar.getAdState(), (Object) "hidden") && !C10765mq.m32772a((Object) jhVar.getAdState(), (Object) "loading");
    }

    /* renamed from: a */
    private final void m32472a(String str, C10483eb ebVar) {
        String str2;
        Map linkedHashMap = new LinkedHashMap();
        try {
            JSONObject d = m32479d(str);
            str2 = d.optString("method", "");
            C10765mq.m32770a((Object) str2, "json.optString(\"method\", \"\")");
            try {
                String optString = d.optString(TJAdUnitConstants.String.CALLBACK_ID);
                C10765mq.m32770a((Object) optString, "json.optString(\"callbackId\")");
                linkedHashMap.put(TJAdUnitConstants.String.CALLBACK_ID, optString);
                Object opt = d.opt("args");
                if (opt == null) {
                    opt = "";
                }
                m32471a(opt, (Map<String, String>) linkedHashMap);
                m32473a(str2, linkedHashMap, opt.toString(), ebVar);
            } catch (Exception e) {
                e = e;
                C10427da.m31544a(e);
                this.f26853b.mo67524a(str2, "");
            }
        } catch (Exception e2) {
            e = e2;
            str2 = "";
            C10427da.m31544a(e);
            this.f26853b.mo67524a(str2, "");
        }
    }

    /* renamed from: a */
    private static void m32471a(Object obj, Map<String, String> map) {
        if (obj != null && (obj instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            C10765mq.m32770a((Object) keys, UserMetadata.KEYDATA_FILENAME);
            while (keys.hasNext()) {
                String next = keys.next();
                C10765mq.m32770a((Object) next, SDKConstants.PARAM_KEY);
                String optString = jSONObject.optString(next, "");
                C10765mq.m32770a((Object) optString, "args.optString(key, \"\")");
                map.put(next, optString);
            }
        }
    }

    /* renamed from: d */
    private static JSONObject m32479d(String str) {
        int a = C10814oc.m32846a((CharSequence) str, "/?q=") + 4;
        if (str != null) {
            String substring = str.substring(a);
            C10765mq.m32770a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return new JSONObject(C10562gn.m32098a(substring));
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    private final void m32473a(String str, Map<String, String> map, String str2, C10483eb ebVar) {
        String str3 = "";
        switch (str.hashCode()) {
            case -1289167206:
                if (str.equals(MraidJsMethods.EXPAND)) {
                    mo67653c();
                    return;
                }
                return;
            case -984419449:
                if (str.equals("ogyResolveIntent")) {
                    String str4 = map.get("intentUri");
                    String str5 = map.get(TJAdUnitConstants.String.CALLBACK_ID);
                    if (str5 != null) {
                        str3 = str5;
                    }
                    mo67652b(str4, str3);
                    return;
                }
                return;
            case -934437708:
                if (str.equals(MraidJsMethods.RESIZE)) {
                    m32480d();
                    return;
                }
                return;
            case -840442113:
                if (str.equals(MraidJsMethods.UNLOAD)) {
                    mo67641a();
                    return;
                }
                return;
            case -12713460:
                if (str.equals("ogyOnAdImpression")) {
                    m32470a(ebVar);
                    return;
                }
                return;
            case 3417674:
                if (str.equals("open")) {
                    mo67647a(map.get("url"), ebVar.mo67249m().mo67294b());
                    return;
                }
                return;
            case 94756344:
                if (str.equals("close")) {
                    m32474a(map, false);
                    return;
                }
                return;
            case 451326307:
                if (str.equals("ogyCreateShortcut")) {
                    mo67649a(map, str2);
                    return;
                }
                return;
            case 624734601:
                if (str.equals("setResizeProperties")) {
                    m32481d(map);
                    return;
                }
                return;
            case 901631159:
                if (str.equals("ogyOnAdEvent")) {
                    mo67644a(ebVar.mo67249m());
                    return;
                }
                return;
            case 1121179396:
                if (str.equals("ogyOnAdClicked")) {
                    mo67651b(ebVar.mo67249m().mo67294b());
                    return;
                }
                return;
            case 1614272768:
                if (str.equals("useCustomClose")) {
                    m32478c(map);
                    return;
                }
                return;
            case 1622028878:
                if (str.equals("ogyForceClose")) {
                    m32474a(map, true);
                    return;
                }
                return;
            case 1805873469:
                if (str.equals("ogyStartIntent")) {
                    String str6 = map.get("intentUri");
                    String str7 = map.get(TJAdUnitConstants.String.CALLBACK_ID);
                    if (str7 != null) {
                        str3 = str7;
                    }
                    mo67648a(str6, str3, ebVar.mo67249m().mo67294b());
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private final void m32474a(Map<String, String> map, boolean z) {
        boolean a = m32476a(map);
        if (z) {
            mo67655c(a);
        } else {
            mo67642a(a);
        }
        if (a) {
            m32477b(map);
        }
    }

    /* renamed from: a */
    private static boolean m32476a(Map<String, String> map) {
        String str = map.get("showNextAd");
        if (str == null) {
            return true;
        }
        return str.equals("true");
    }

    /* renamed from: b */
    private final void m32477b(Map<String, String> map) {
        String str = map.get("nextAdId");
        if (str == null) {
            str = "";
        }
        mo67646a(str);
    }

    /* renamed from: c */
    private final void m32478c(Map<String, String> map) {
        String str = map.get("useCustomClose");
        mo67643b(str == null ? false : str.equals("false"));
    }

    /* renamed from: d */
    private final void m32481d(Map<String, String> map) {
        C10648iz.C10649a aVar = C10648iz.f26875a;
        C10648iz a = C10648iz.C10649a.m32548a(map);
        mo67645a(a);
        if (a == null) {
            this.f26853b.mo67524a("setResizeProperties", "Wrong parameters");
        }
    }

    /* renamed from: d */
    private final void m32480d() {
        try {
            mo67650b();
        } catch (Throwable th) {
            C10580hb hbVar = this.f26853b;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            hbVar.mo67524a(MraidJsMethods.RESIZE, message);
        }
    }

    /* renamed from: a */
    private final void m32470a(C10483eb ebVar) {
        if (ebVar.mo67266y().mo67306a() && ebVar.mo67266y().mo67307b() == C10497eo.IMPRESSION_SOURCE_FORMAT) {
            mo67654c(ebVar.mo67249m().mo67294b());
        }
    }
}
