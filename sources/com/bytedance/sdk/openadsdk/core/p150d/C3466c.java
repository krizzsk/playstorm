package com.bytedance.sdk.openadsdk.core.p150d;

import android.content.Context;
import com.bytedance.sdk.component.p120e.C2913b;
import com.bytedance.sdk.component.p120e.p121a.C2912a;
import com.bytedance.sdk.component.p120e.p122b.C2918c;
import com.bytedance.sdk.component.p120e.p122b.C2919d;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.d.c */
/* compiled from: FrequentCallEventHelper */
public class C3466c {
    /* renamed from: a */
    public static void m10392a(Context context, String str, long j) {
        JSONObject a = m10391a(str, j);
        C2919d b = C3854d.m12660a().mo20705b().mo17761b();
        b.mo17789a(C4014u.m13231g("/api/ad/union/sdk/stats/"));
        b.mo17799c(a.toString());
        b.mo17797a((C2912a) new C2912a() {
            /* renamed from: a */
            public void mo17771a(C2918c cVar, C2913b bVar) {
                if (bVar != null) {
                    C2975l.m8380a("uploadFrequentEvent", Boolean.valueOf(bVar.mo17779f()), bVar.mo17777d());
                    return;
                }
                C2975l.m8387c("uploadFrequentEvent", "NetResponse is null");
            }

            /* renamed from: a */
            public void mo17772a(C2918c cVar, IOException iOException) {
                C2975l.m8387c("uploadFrequentEvent", iOException.getMessage());
            }
        });
    }

    /* renamed from: a */
    private static JSONObject m10391a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "over_freq");
            jSONObject.put("rit", str);
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("timestamp", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
