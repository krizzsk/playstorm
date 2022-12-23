package com.apm.insight.p010a;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.runtime.C1384p;

/* renamed from: com.apm.insight.a.a */
public class C1172a implements ICrashCallback {

    /* renamed from: d */
    private static volatile C1172a f923d;

    /* renamed from: a */
    private volatile String f924a;

    /* renamed from: b */
    private volatile C1174b f925b;

    /* renamed from: c */
    private volatile C1175c f926c;

    /* renamed from: e */
    private volatile boolean f927e = false;

    private C1172a() {
    }

    /* renamed from: a */
    public static C1172a m1244a() {
        if (f923d == null) {
            synchronized (C1172a.class) {
                if (f923d == null) {
                    f923d = new C1172a();
                }
            }
        }
        return f923d;
    }

    /* renamed from: a */
    public void mo12175a(CrashType crashType, long j, String str) {
    }

    /* renamed from: a */
    public void mo12176a(String str) {
    }

    /* renamed from: a */
    public void mo12177a(String str, C1174b bVar, C1175c cVar) {
        this.f924a = str;
        this.f925b = bVar;
        this.f926c = cVar;
        if (!this.f927e) {
            this.f927e = true;
            C1384p.m2264b().mo12526a((Runnable) new Runnable() {
                public void run() {
                }
            });
        }
    }

    /* renamed from: b */
    public void mo12178b() {
    }

    public void onCrash(CrashType crashType, String str, Thread thread) {
        boolean equals = crashType.equals(CrashType.NATIVE);
    }
}
