package com.bytedance.sdk.openadsdk.component.p138c;

import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3503r;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p172h.C3812a;
import com.bytedance.sdk.openadsdk.p172h.C3815b;
import com.bytedance.sdk.openadsdk.p172h.p173a.C3813a;
import com.bytedance.sdk.openadsdk.p172h.p173a.C3814b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.c.a */
/* compiled from: TTAppOpenAdReport */
public class C3272a {
    /* renamed from: a */
    public static void m9549a(final int i, final int i2) {
        C3815b.m12552a().mo20659a((C3812a) new C3812a() {
            /* renamed from: a */
            public C3813a mo18671a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i);
                jSONObject.put("user_timeout_time", i2);
                return C3814b.m12522b().mo20634a("openad_load_ad_timeout").mo20636b(jSONObject.toString());
            }
        });
    }

    /* renamed from: a */
    public static void m9551a(C3498n nVar, int i, int i2, float f) {
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", C3498n.m10583c(nVar) ? "video_normal_ad" : "image_normal_ad");
        hashMap.put("skip_time", Integer.valueOf(i));
        hashMap.put("skip_show_time", Integer.valueOf(i2));
        hashMap.put("total_time", Float.valueOf(f));
        C3156e.m9196b(nVar, "skip", (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m9554a(C3498n nVar, long j, float f, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", C3498n.m10583c(nVar) ? "video_normal_ad" : "image_normal_ad");
        if (z) {
            hashMap.put("video_duration", Float.valueOf(f));
            hashMap.put("video_percent", Integer.valueOf((int) (((((double) j) * 1.0d) / 10.0d) / ((double) f))));
        } else {
            hashMap.put("image_duration", Float.valueOf(f));
        }
        C3156e.m9196b(nVar, "destroy", (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m9550a(C3498n nVar) {
        C3156e.m9196b(nVar, "cache_expire", (Map<String, Object>) null);
    }

    /* renamed from: b */
    public static void m9556b(C3498n nVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", C3498n.m10583c(nVar) ? "video_normal_ad" : "image_normal_ad");
        C3156e.m9196b(nVar, "cache_loss", (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m9555a(C3498n nVar, long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("order", Integer.valueOf(z ? 1 : 2));
        C3156e.m9182a(nVar, "download_image_duration", j, (Map<String, Object>) hashMap);
    }

    /* renamed from: b */
    public static void m9557b(C3498n nVar, long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("size", Long.valueOf(nVar.mo19607J().mo16350e()));
        hashMap.put("video_duration", Double.valueOf(nVar.mo19607J().mo16353f()));
        hashMap.put("order", Integer.valueOf(z ? 1 : 2));
        C3156e.m9182a(nVar, "download_video_duration", j, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m9552a(C3498n nVar, int i, C3503r rVar) {
        long j;
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", C3498n.m10583c(nVar) ? "video_normal_ad" : "image_normal_ad");
        hashMap.put("open_ad_cache_type", Integer.valueOf(i));
        if (rVar != null) {
            rVar.mo19788b(System.currentTimeMillis());
            hashMap.put("client_start_time", Long.valueOf(rVar.mo19787b()));
            hashMap.put("sever_time", Long.valueOf(rVar.mo19791d()));
            hashMap.put("network_time", Long.valueOf(rVar.mo19789c()));
            hashMap.put("client_end_time", Long.valueOf(rVar.mo19792e()));
            hashMap.put("download_resource_duration", Long.valueOf(rVar.mo19794g()));
            hashMap.put("resource_source", Integer.valueOf(rVar.mo19795h()));
            j = rVar.mo19793f();
        } else {
            j = 0;
        }
        C3156e.m9182a(nVar, "load_net_duration", j, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m9553a(C3498n nVar, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", C3498n.m10583c(nVar) ? "video_normal_ad" : "image_normal_ad");
        C3156e.m9182a(nVar, "load_cache_duration", j, (Map<String, Object>) hashMap);
    }
}
