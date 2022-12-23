package com.tapjoy.internal;

import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.bw */
public final class C11472bw<Result> implements Runnable {

    /* renamed from: a */
    private final C11470bu<Result> f27747a;
    @Nullable

    /* renamed from: b */
    private final C11475bz<Result> f27748b;

    protected C11472bw(C11470bu<Result> buVar, @Nullable C11475bz<Result> bzVar) {
        this.f27747a = buVar;
        this.f27748b = bzVar;
    }

    public final void run() {
        try {
            Result f = this.f27747a.mo72261f();
            C11475bz<Result> bzVar = this.f27748b;
            if (bzVar != null && !(bzVar instanceof C11477ca)) {
                bzVar.mo72265a(this.f27747a, f);
            }
        } catch (Throwable unused) {
            C11475bz<Result> bzVar2 = this.f27748b;
            if (bzVar2 != null && !(bzVar2 instanceof C11477ca)) {
                bzVar2.mo72264a(this.f27747a);
            }
        }
    }
}
