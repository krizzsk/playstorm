package com.ironsource.sdk.p293g;

import com.ironsource.sdk.p296j.C8360a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.g.c */
public final class C8342c {

    /* renamed from: a */
    public String f20019a;

    /* renamed from: b */
    public String f20020b;

    /* renamed from: c */
    public int f20021c = -1;

    /* renamed from: d */
    public Map<String, String> f20022d;

    /* renamed from: e */
    public int f20023e;

    /* renamed from: f */
    public boolean f20024f;

    /* renamed from: g */
    public C8360a f20025g;

    public C8342c(String str, String str2, Map<String, String> map, C8360a aVar) {
        this.f20020b = str;
        this.f20019a = str2;
        this.f20022d = map;
        this.f20025g = aVar;
        this.f20023e = 0;
        this.f20024f = false;
    }

    /* renamed from: a */
    public final Map<String, String> mo56845a() {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceId", this.f20020b);
        hashMap.put("demandSourceName", this.f20019a);
        Map<String, String> map = this.f20022d;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final synchronized void mo56846a(int i) {
        this.f20023e = i;
    }
}
