package com.mbridge.msdk.foundation.same.net.p309e;

import com.mbridge.msdk.foundation.same.net.p307c.C8457b;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.mbridge.msdk.foundation.same.net.e.c */
/* compiled from: NetworkResponse */
public final class C8479c {

    /* renamed from: a */
    public final int f20491a;

    /* renamed from: b */
    public final byte[] f20492b;

    /* renamed from: c */
    public final Map<String, String> f20493c;

    /* renamed from: d */
    public final List<C8457b> f20494d;

    public C8479c(int i, byte[] bArr, List<C8457b> list) {
        this(i, bArr, m24469a(list), list);
    }

    private C8479c(int i, byte[] bArr, Map<String, String> map, List<C8457b> list) {
        this.f20491a = i;
        this.f20492b = bArr;
        this.f20493c = map;
        if (list == null) {
            this.f20494d = null;
        } else {
            this.f20494d = Collections.unmodifiableList(list);
        }
    }

    /* renamed from: a */
    private static Map<String, String> m24469a(List<C8457b> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C8457b next : list) {
            treeMap.put(next.mo57558a(), next.mo57559b());
        }
        return treeMap;
    }
}
