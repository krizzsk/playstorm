package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.if */
/* compiled from: IdentityInfo */
public class C6257if {

    /* renamed from: a */
    private static final String f15846a = C6257if.class.getSimpleName();

    /* renamed from: a */
    public static Map<String, String> m18680a() {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("mk-version", C6228hp.m18569a());
            Boolean g = C6269iq.m18729a().mo35480g();
            if (g != null) {
                hashMap.put("u-id-adt", String.valueOf(g.booleanValue() ? 1 : 0));
            }
            hashMap.put(CampaignEx.JSON_KEY_ST_TS, String.valueOf(Calendar.getInstance().getTimeInMillis()));
            Calendar instance = Calendar.getInstance();
            hashMap.put("tz", String.valueOf(instance.get(15) + instance.get(16)));
            C6259ih a = C6259ih.m18712a();
            HashMap hashMap2 = new HashMap();
            if (a.f15865d && a.f15862a != null) {
                hashMap2.put("u-s-id", a.f15862a);
            }
            hashMap.putAll(hashMap2);
        } catch (Exception unused) {
        }
        return hashMap;
    }
}
