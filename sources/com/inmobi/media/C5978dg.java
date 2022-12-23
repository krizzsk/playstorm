package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.dg */
/* compiled from: TokenManager */
public class C5978dg {

    /* renamed from: a */
    public static final String f15194a = C5978dg.class.getName();

    /* renamed from: com.inmobi.media.dg$a */
    /* compiled from: TokenManager */
    static class C5979a {

        /* renamed from: a */
        static final C5978dg f15195a = new C5978dg();
    }

    /* renamed from: a */
    public static C5978dg m17848a() {
        return C5979a.f15195a;
    }

    /* renamed from: a */
    public static void m17849a(int i, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - j));
        hashMap.put("networkType", C6251ib.m18652b());
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("plType", "AB");
        C6218hh.m18506a().mo35424a("AdGetSignalsFailed", (Map<String, Object>) hashMap);
    }
}
