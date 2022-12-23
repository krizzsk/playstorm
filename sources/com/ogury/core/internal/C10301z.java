package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.z */
/* compiled from: JDK7PlatformImplementations.kt */
public class C10301z extends C10298x {
    /* renamed from: a */
    public final void mo66933a(Throwable th, Throwable th2) {
        C10219ai.m31036b(th, "cause");
        C10219ai.m31036b(th2, "exception");
        th.addSuppressed(th2);
    }
}
