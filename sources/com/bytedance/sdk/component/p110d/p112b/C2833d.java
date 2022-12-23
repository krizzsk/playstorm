package com.bytedance.sdk.component.p110d.p112b;

import com.bytedance.sdk.component.p110d.C2894f;
import com.bytedance.sdk.component.p110d.C2895g;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.d.b.d */
/* compiled from: HttpResponse */
public class C2833d<T> implements C2894f {

    /* renamed from: a */
    Map<String, String> f6370a;

    /* renamed from: b */
    private int f6371b;

    /* renamed from: c */
    private T f6372c;

    /* renamed from: d */
    private String f6373d;

    /* renamed from: e */
    private C2895g f6374e;

    public C2833d(int i, T t, String str) {
        this.f6371b = i;
        this.f6372c = t;
        this.f6373d = str;
    }

    public C2833d(int i, T t, String str, Map<String, String> map) {
        this(i, t, str);
        this.f6370a = map;
    }

    /* renamed from: a */
    public C2895g mo17615a() {
        return this.f6374e;
    }

    /* renamed from: a */
    public void mo17616a(C2895g gVar) {
        this.f6374e = gVar;
    }

    /* renamed from: b */
    public int mo17617b() {
        return this.f6371b;
    }

    /* renamed from: c */
    public T mo17618c() {
        return this.f6372c;
    }

    /* renamed from: d */
    public String mo17619d() {
        return this.f6373d;
    }

    /* renamed from: e */
    public Map<String, String> mo17620e() {
        return this.f6370a;
    }
}
