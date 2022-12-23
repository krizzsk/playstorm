package com.ogury.p375cm.internal;

/* renamed from: com.ogury.cm.internal.baccb */
public class baccb extends bacbc {
    /* renamed from: a */
    public final void mo66718a(Throwable th, Throwable th2) {
        bbabc.m30943b(th, "cause");
        bbabc.m30943b(th2, "exception");
        th.addSuppressed(th2);
    }
}
