package com.fyber.inneractive.sdk.web;

import android.util.LruCache;

/* renamed from: com.fyber.inneractive.sdk.web.p */
public class C5431p<K> extends LruCache<K, C5434s> {
    public C5431p(int i) {
        super(i);
    }

    public int sizeOf(Object obj, Object obj2) {
        String str;
        C5434s sVar = (C5434s) obj2;
        int i = 0;
        for (String next : sVar.f14391b.keySet()) {
            if (!(next == null || (str = sVar.f14391b.get(next)) == null)) {
                i += next.length() + str.length();
            }
        }
        return i + sVar.f14390a.length;
    }
}
