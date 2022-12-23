package com.bytedance.sdk.component.p120e;

import java.io.File;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.e.b */
/* compiled from: NetResponse */
public class C2913b {

    /* renamed from: a */
    final int f6578a;

    /* renamed from: b */
    final String f6579b;

    /* renamed from: c */
    final Map<String, String> f6580c;

    /* renamed from: d */
    final String f6581d;

    /* renamed from: e */
    final long f6582e;

    /* renamed from: f */
    final long f6583f;

    /* renamed from: g */
    private File f6584g = null;

    /* renamed from: h */
    private final boolean f6585h;

    /* renamed from: i */
    private byte[] f6586i = null;

    public C2913b(boolean z, int i, String str, Map<String, String> map, String str2, long j, long j2) {
        this.f6585h = z;
        this.f6578a = i;
        this.f6579b = str;
        this.f6580c = map;
        this.f6581d = str2;
        this.f6582e = j;
        this.f6583f = j2;
    }

    /* renamed from: a */
    public int mo17773a() {
        return this.f6578a;
    }

    /* renamed from: a */
    public void mo17774a(File file) {
        this.f6584g = file;
    }

    /* renamed from: b */
    public String mo17775b() {
        return this.f6579b;
    }

    /* renamed from: c */
    public Map<String, String> mo17776c() {
        return this.f6580c;
    }

    /* renamed from: d */
    public String mo17777d() {
        return this.f6581d;
    }

    /* renamed from: e */
    public File mo17778e() {
        return this.f6584g;
    }

    /* renamed from: f */
    public boolean mo17779f() {
        return this.f6585h;
    }

    /* renamed from: g */
    public long mo17780g() {
        return this.f6582e - this.f6583f;
    }
}
