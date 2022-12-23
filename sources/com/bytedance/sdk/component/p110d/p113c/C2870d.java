package com.bytedance.sdk.component.p110d.p113c;

import com.bytedance.sdk.component.p110d.C2895g;
import com.bytedance.sdk.component.p110d.C2898j;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.d.c.d */
/* compiled from: ImageResponse */
public class C2870d<T> implements C2898j {

    /* renamed from: a */
    private String f6512a;

    /* renamed from: b */
    private String f6513b;

    /* renamed from: c */
    private T f6514c;

    /* renamed from: d */
    private int f6515d;

    /* renamed from: e */
    private int f6516e;

    /* renamed from: f */
    private Map<String, String> f6517f;

    /* renamed from: g */
    private boolean f6518g;

    /* renamed from: h */
    private boolean f6519h;

    /* renamed from: i */
    private C2895g f6520i;

    /* renamed from: j */
    private int f6521j;

    /* renamed from: a */
    public C2870d mo17722a(C2860c cVar, T t) {
        this.f6514c = t;
        this.f6512a = cVar.mo17692e();
        this.f6513b = cVar.mo17681a();
        this.f6515d = cVar.mo17688b();
        this.f6516e = cVar.mo17690c();
        this.f6519h = cVar.mo17699l();
        this.f6520i = cVar.mo17700m();
        this.f6521j = cVar.mo17701n();
        return this;
    }

    /* renamed from: a */
    public C2870d mo17723a(C2860c cVar, T t, Map<String, String> map, boolean z) {
        this.f6517f = map;
        this.f6518g = z;
        return mo17722a(cVar, t);
    }

    /* renamed from: a */
    public String mo17724a() {
        return this.f6513b;
    }

    /* renamed from: b */
    public T mo17725b() {
        return this.f6514c;
    }

    /* renamed from: c */
    public Map<String, String> mo17726c() {
        return this.f6517f;
    }

    /* renamed from: d */
    public boolean mo17727d() {
        return this.f6519h;
    }

    /* renamed from: e */
    public C2895g mo17728e() {
        return this.f6520i;
    }

    /* renamed from: f */
    public int mo17729f() {
        return this.f6521j;
    }
}
