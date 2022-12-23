package com.mbridge.msdk.mbnative.p331a;

import com.mbridge.msdk.out.Campaign;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.mbnative.a.c */
/* compiled from: NativeCacheFactory */
public final class C8736c {

    /* renamed from: a */
    public static Map<Integer, C8735b<String, List<Campaign>>> f21179a = new HashMap();

    /* renamed from: a */
    public static C8735b<String, List<Campaign>> m25352a(int i) {
        if (f21179a.containsKey(Integer.valueOf(i))) {
            return f21179a.get(Integer.valueOf(i));
        }
        C8733a aVar = new C8733a(i);
        f21179a.put(Integer.valueOf(i), aVar);
        return aVar;
    }
}
