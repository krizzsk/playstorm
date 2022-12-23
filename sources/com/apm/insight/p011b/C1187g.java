package com.apm.insight.p011b;

import android.content.Context;

/* renamed from: com.apm.insight.b.g */
public class C1187g {

    /* renamed from: a */
    private static volatile C1187g f982a;

    /* renamed from: c */
    private static C1188h f983c;

    /* renamed from: b */
    private final C1178b f984b;

    private C1187g(Context context) {
        this.f984b = new C1178b(context);
        C1188h hVar = new C1188h(0);
        f983c = hVar;
        hVar.mo12201b();
    }

    /* renamed from: a */
    public static C1187g m1299a(Context context) {
        if (f982a == null) {
            synchronized (C1187g.class) {
                if (f982a == null) {
                    f982a = new C1187g(context);
                }
            }
        }
        return f982a;
    }

    /* renamed from: b */
    public static C1188h m1300b() {
        return f983c;
    }

    /* renamed from: a */
    public C1178b mo12196a() {
        return this.f984b;
    }

    /* renamed from: c */
    public void mo12197c() {
        this.f984b.mo12180a();
    }

    /* renamed from: d */
    public void mo12198d() {
        this.f984b.mo12182b();
    }
}
