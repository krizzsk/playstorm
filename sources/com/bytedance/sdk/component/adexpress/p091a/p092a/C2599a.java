package com.bytedance.sdk.component.adexpress.p091a.p092a;

import com.bytedance.sdk.component.p110d.C2901m;

/* renamed from: com.bytedance.sdk.component.adexpress.a.a.a */
/* compiled from: AdapterInstance */
public class C2599a {

    /* renamed from: e */
    private static volatile C2599a f5561e;

    /* renamed from: a */
    private volatile C2600b f5562a;

    /* renamed from: b */
    private volatile C2602d f5563b;

    /* renamed from: c */
    private volatile C2601c f5564c;

    /* renamed from: d */
    private volatile C2901m f5565d;

    private C2599a() {
    }

    /* renamed from: a */
    public static C2599a m6611a() {
        if (f5561e == null) {
            synchronized (C2599a.class) {
                if (f5561e == null) {
                    f5561e = new C2599a();
                }
            }
        }
        return f5561e;
    }

    /* renamed from: a */
    public void mo16623a(C2600b bVar) {
        this.f5562a = bVar;
    }

    /* renamed from: b */
    public C2600b mo16627b() {
        return this.f5562a;
    }

    /* renamed from: a */
    public void mo16624a(C2601c cVar) {
        this.f5564c = cVar;
    }

    /* renamed from: c */
    public C2601c mo16628c() {
        return this.f5564c;
    }

    /* renamed from: a */
    public void mo16625a(C2602d dVar) {
        this.f5563b = dVar;
    }

    /* renamed from: d */
    public C2602d mo16629d() {
        return this.f5563b;
    }

    /* renamed from: a */
    public void mo16626a(C2901m mVar) {
        this.f5565d = mVar;
    }

    /* renamed from: e */
    public C2901m mo16630e() {
        return this.f5565d;
    }
}
