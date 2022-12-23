package com.ogury.core.internal.crash;

import com.ogury.core.internal.C10219ai;
import java.lang.Thread;

/* renamed from: com.ogury.core.internal.crash.l */
/* compiled from: ExceptionHandler.kt */
public final class C10262l implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public static final C10263a f26056a = new C10263a((byte) 0);

    /* renamed from: b */
    private final C10257j f26057b;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f26058c;

    public C10262l(C10257j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        C10219ai.m31036b(jVar, "crashSerializerFactory");
        this.f26057b = jVar;
        this.f26058c = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        C10219ai.m31036b(thread, "thread");
        C10219ai.m31036b(th, "exception");
        try {
            this.f26057b.mo66831a(th).mo66804a();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f26058c;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Exception e) {
            C10256i iVar = C10256i.f26043a;
            C10256i.m31098a(e);
        }
    }

    /* renamed from: com.ogury.core.internal.crash.l$a */
    /* compiled from: ExceptionHandler.kt */
    public static final class C10263a {
        private C10263a() {
        }

        public /* synthetic */ C10263a(byte b) {
            this();
        }
    }
}
