package com.applovin.impl.sdk.p047b;

import java.util.Map;

/* renamed from: com.applovin.impl.sdk.b.c */
public class C1854c {

    /* renamed from: a */
    private final String f3011a;

    /* renamed from: b */
    private Map<String, String> f3012b;

    private C1854c(String str, Map<String, String> map) {
        this.f3011a = str;
        this.f3012b = map;
    }

    /* renamed from: a */
    public static C1854c m4011a(String str) {
        return m4012a(str, (Map<String, String>) null);
    }

    /* renamed from: a */
    public static C1854c m4012a(String str, Map<String, String> map) {
        return new C1854c(str, map);
    }

    /* renamed from: a */
    public Map<String, String> mo14049a() {
        return this.f3012b;
    }

    /* renamed from: b */
    public String mo14050b() {
        return this.f3011a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f3011a + '\'' + "params='" + this.f3012b + '\'' + '}';
    }
}
