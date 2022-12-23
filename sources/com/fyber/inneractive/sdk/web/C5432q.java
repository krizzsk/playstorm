package com.fyber.inneractive.sdk.web;

/* renamed from: com.fyber.inneractive.sdk.web.q */
public class C5432q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5433r f14384a;

    public C5432q(C5433r rVar) {
        this.f14384a = rVar;
    }

    public void run() {
        try {
            this.f14384a.f14387a.evictAll();
        } catch (Throwable unused) {
        }
    }
}
