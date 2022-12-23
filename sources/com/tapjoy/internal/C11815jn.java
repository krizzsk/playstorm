package com.tapjoy.internal;

import java.io.InterruptedIOException;

/* renamed from: com.tapjoy.internal.jn */
public class C11815jn {

    /* renamed from: a */
    public static final C11815jn f28843a = new C11815jn() {
        /* renamed from: a */
        public final void mo72796a() {
        }
    };

    /* renamed from: b */
    private boolean f28844b;

    /* renamed from: c */
    private long f28845c;

    /* renamed from: a */
    public void mo72796a() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.f28844b && this.f28845c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
