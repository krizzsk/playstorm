package com.applovin.impl.sdk.p049d;

import java.util.Map;

/* renamed from: com.applovin.impl.sdk.d.a */
public class C1865a {

    /* renamed from: a */
    private final String f3380a;

    /* renamed from: b */
    private final String f3381b;

    /* renamed from: c */
    private final Map<String, String> f3382c;

    /* renamed from: d */
    private final boolean f3383d;

    public C1865a(String str, String str2) {
        this(str, str2, (Map<String, String>) null, false);
    }

    public C1865a(String str, String str2, Map<String, String> map, boolean z) {
        this.f3380a = str;
        this.f3381b = str2;
        this.f3382c = map;
        this.f3383d = z;
    }

    /* renamed from: a */
    public String mo14092a() {
        return this.f3380a;
    }

    /* renamed from: b */
    public String mo14093b() {
        return this.f3381b;
    }

    /* renamed from: c */
    public Map<String, String> mo14094c() {
        return this.f3382c;
    }

    /* renamed from: d */
    public boolean mo14095d() {
        return this.f3383d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f3380a + '\'' + ", backupUrl='" + this.f3381b + '\'' + ", headers='" + this.f3382c + '\'' + ", shouldFireInWebView='" + this.f3383d + '\'' + '}';
    }
}
