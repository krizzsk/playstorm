package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.cache.C4235a;

/* renamed from: com.fyber.inneractive.sdk.util.m */
public class C5354m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4235a f14223a;

    public C5354m(C4235a aVar) {
        this.f14223a = aVar;
    }

    public void run() {
        C4235a aVar;
        try {
            if (C5350l.f14216a != null && (aVar = this.f14223a) != null) {
                C5350l.f14216a.getSharedPreferences("IAConfigurationPreferences", 0).edit().remove(aVar.mo24243b()).apply();
            }
        } catch (Throwable unused) {
        }
    }
}
