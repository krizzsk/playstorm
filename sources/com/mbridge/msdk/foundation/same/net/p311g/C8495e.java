package com.mbridge.msdk.foundation.same.net.p311g;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.inmobi.sdk.InMobiSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C2357a;
import com.mbridge.msdk.foundation.p062a.p063a.C2338a;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.tools.C8595p;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8610w;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.VungleApiClient;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.net.g.e */
/* compiled from: CommonRequestParamsForAdd */
public final class C8495e {

    /* renamed from: a */
    private static String f20570a = "";

    /* renamed from: b */
    private static String f20571b = "";

    /* renamed from: a */
    public static void m24526a(C8494d dVar, Context context) {
        if (C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            C2357a.m5633a();
            if (C2338a.m5535a().mo15734b(MBridgeConstans.AUTHORITY_DNT, 0) == 1) {
                dVar.mo57606a("dnt", "1");
            }
        }
        if (C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_OTHER)) {
            String str = C8494d.f20565f;
            dVar.mo57606a(str, C8610w.m24893b() + "");
            String str2 = C8494d.f20566g;
            dVar.mo57606a(str2, C8610w.m24890a() + "");
            dVar.mo57606a(C8494d.f20563d, C8596q.m24846m());
        }
        dVar.mo57606a("pkg_source", C8596q.m24819a(C8596q.m24843k(context), context));
        if (C2350a.m5601e().mo15796k() != null) {
            dVar.mo57606a("web_env", C2350a.m5601e().mo15796k().toString());
        }
        if (Build.VERSION.SDK_INT > 18) {
            dVar.mo57606a("http_req", "2");
        }
        m24527a(dVar, true);
        m24531e(dVar);
        m24530d(dVar);
        C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
        if (b == null) {
            b = C2283b.m5275a().mo15562b();
        }
        if (b.mo15482au()) {
            dVar.mo57606a(InMobiSdk.IM_GDPR_CONSENT_IAB, C2357a.m5633a().mo15824e() + "");
        }
    }

    /* renamed from: a */
    public static void m24525a(C8494d dVar) {
        dVar.mo57606a("api_version", C8413a.f20319a);
    }

    /* renamed from: b */
    public static void m24528b(C8494d dVar) {
        m24527a(dVar, false);
        m24531e(dVar);
        m24530d(dVar);
    }

    /* renamed from: d */
    private static void m24530d(C8494d dVar) {
        try {
            if (TextUtils.isEmpty(C8413a.f20329k)) {
                C8413a.f20329k = C2338a.m5535a().mo15735b("b");
            }
            if (!TextUtils.isEmpty(C8413a.f20329k)) {
                dVar.mo57606a("b", C8413a.f20329k);
            }
            if (TextUtils.isEmpty(C8413a.f20330l)) {
                C8413a.f20330l = C2338a.m5535a().mo15735b("c");
            }
            if (!TextUtils.isEmpty(C8413a.f20330l)) {
                dVar.mo57606a("c", C8413a.f20330l);
            }
        } catch (Exception e) {
            C8608u.m24884d("CommonRequestParamsForAdd", e.getMessage());
        }
    }

    /* renamed from: e */
    private static void m24531e(C8494d dVar) {
        int p = C8596q.m24852p();
        if (p != -1) {
            dVar.mo57606a("unknown_source", p + "");
        }
    }

    /* renamed from: a */
    private static void m24527a(C8494d dVar, boolean z) {
        C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
        if (b != null) {
            if (!TextUtils.isEmpty(b.mo15493c()) && z) {
                dVar.mo57606a("a_stid", b.mo15493c());
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("dmt", C8596q.m24850o() + "");
                    jSONObject.put("dmf", C8596q.m24848n());
                }
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    if (!jSONObject.equals(f20570a)) {
                        f20571b = C8595p.m24814a(jSONObject.toString());
                    }
                    if (!TextUtils.isEmpty(f20571b)) {
                        dVar.mo57606a("dvi", f20571b);
                    }
                }
            } catch (Exception e) {
                C8608u.m24884d("CommonRequestParamsForAdd", e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public static void m24529c(C8494d dVar) {
        if (dVar != null) {
            if (!C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                dVar.mo57605a(DeviceRequestsHelper.DEVICE_INFO_MODEL);
                dVar.mo57605a("brand");
                dVar.mo57605a("screen_size");
                dVar.mo57605a("sub_ip");
                dVar.mo57605a("network_type");
                dVar.mo57605a("useragent");
                dVar.mo57605a("ua");
                dVar.mo57605a("language");
                dVar.mo57605a("network_str");
                dVar.mo57605a(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME);
                dVar.mo57605a(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE);
            }
            if (!C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_OTHER)) {
                dVar.mo57605a(C8494d.f20565f);
                dVar.mo57605a(C8494d.f20566g);
                dVar.mo57605a("power_rate");
                dVar.mo57605a("charging");
                dVar.mo57605a(TapjoyConstants.TJC_DEVICE_TIMEZONE);
            }
            if (!C2357a.m5633a().mo15819a(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                dVar.mo57605a(VungleApiClient.GAID);
                dVar.mo57605a("gaid2");
            }
        }
    }
}
