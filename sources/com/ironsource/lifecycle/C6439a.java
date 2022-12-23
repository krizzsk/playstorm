package com.ironsource.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo75040bv = {1, 0, 3}, mo75041d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo75042d2 = {"Lcom/ironsource/lifecycle/ForegroundTimeCalculator;", "Lcom/ironsource/lifecycle/IronsourceLifecycleListener;", "task", "Lcom/ironsource/lifecycle/SessionCalcTask;", "(Lcom/ironsource/lifecycle/SessionCalcTask;)V", "sessionStartTime", "", "appPaused", "", "appResumed", "appStarted", "appStopped", "getSessionTime", "updateSessionStartTime", "environment_release"}, mo75043k = 1, mo75044mv = {1, 4, 2})
/* renamed from: com.ironsource.lifecycle.a */
public final class C6439a implements C6442c {

    /* renamed from: a */
    private long f16351a = System.currentTimeMillis();

    /* renamed from: b */
    private final C6453g f16352b;

    public C6439a(C6453g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "task");
        this.f16352b = gVar;
        C6443d.m19366a().mo35957a((C6442c) this);
    }

    /* renamed from: a */
    public final void mo35947a() {
        this.f16351a = System.currentTimeMillis();
    }

    /* renamed from: b */
    public final void mo35948b() {
        this.f16352b.f16384a = Long.valueOf(System.currentTimeMillis() - this.f16351a);
        this.f16352b.run();
    }
}
