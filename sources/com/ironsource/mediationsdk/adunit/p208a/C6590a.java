package com.ironsource.mediationsdk.adunit.p208a;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ironsource.environment.C6399a;
import com.ironsource.environment.C6408c;
import com.ironsource.environment.C6429h;
import com.ironsource.environment.p203c.C6409a;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.adunit.a.a */
public class C6590a {
    /* renamed from: a */
    public static int m20029a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_INIT_EXCEPTION;
        }
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_INIT_EXCEPTION;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return IronSourceError.ERROR_CODE_GENERIC;
    }

    /* renamed from: a */
    public static void m20030a(Context context) {
        C6409a aVar = C6409a.C6411a.f16305a;
        if (context != null) {
            try {
                if (!aVar.f16302c.getAndSet(true)) {
                    aVar.mo35921a("auid", C6429h.m19350y(context));
                    aVar.mo35921a(DeviceRequestsHelper.DEVICE_INFO_MODEL, C6429h.m19319g());
                    aVar.mo35921a("make", C6429h.m19321h());
                    aVar.mo35921a("os", C6429h.m19323i());
                    String e = C6429h.m19315e();
                    if (e != null) {
                        aVar.mo35921a("osv", e.replaceAll("[^0-9/.]", ""));
                        aVar.mo35921a("osvf", e);
                    }
                    aVar.mo35921a("apilvl", String.valueOf(C6429h.m19317f()));
                    String i = C6429h.m19324i(context);
                    if (!TextUtils.isEmpty(i)) {
                        aVar.mo35921a("carrier", i);
                    }
                    String d = C6408c.m19243d(context);
                    if (!TextUtils.isEmpty(d)) {
                        aVar.mo35921a("instlr", d);
                    }
                    String A = C6429h.m19295A(context);
                    if (!TextUtils.isEmpty(A)) {
                        aVar.mo35921a("dt", A);
                    }
                    aVar.mo35921a(BidResponsed.KEY_BID_ID, context.getPackageName());
                    aVar.mo35921a("mem", String.valueOf(C6429h.m19312d(context)));
                    aVar.mo35921a("tkv", "2.0");
                    aVar.mo35921a("tsu", Long.valueOf(C6408c.m19239b(context)));
                    aVar.mo35921a("tai", Long.valueOf(C6408c.m19236a(context)));
                    aVar.mo35921a("apv", C6408c.m19241c(context));
                    aVar.mo35921a("ptype", Integer.valueOf(C6399a.C64001.m19229f(context)));
                    aVar.mo35921a("simop", C6399a.C64001.m19228e(context));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        aVar.mo35922b(context);
    }

    /* renamed from: a */
    public static void m20031a(String str, Object obj) {
        C6409a.C6411a.f16305a.mo35921a(str, obj);
    }

    /* renamed from: a */
    public static void m20032a(String str, JSONObject jSONObject) {
        C6409a aVar = C6409a.C6411a.f16305a;
        if (jSONObject != null) {
            try {
                Object obj = aVar.f16300a.get(str);
                if (!(obj instanceof JSONObject)) {
                    aVar.mo35921a(str, jSONObject);
                    return;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.putOpt(next, jSONObject.opt(next));
                }
                aVar.mo35921a(str, jSONObject2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m20033a(Map<String, Object> map) {
        C6409a aVar = C6409a.C6411a.f16305a;
        if (map != null) {
            try {
                for (String next : map.keySet()) {
                    if (map.containsKey(next)) {
                        aVar.mo35921a(next, map.get(next));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static int m20034b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return 1037;
        }
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return 1027;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return IronSourceError.ERROR_CODE_GENERIC;
    }
}
