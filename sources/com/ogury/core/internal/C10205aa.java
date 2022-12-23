package com.ogury.core.internal;

import java.io.Closeable;

/* renamed from: com.ogury.core.internal.aa */
/* compiled from: Closeable.kt */
public class C10205aa {

    /* renamed from: a */
    private final String f25981a;

    /* renamed from: b */
    private final long f25982b;

    /* renamed from: a */
    public static final void m31010a(Closeable closeable, Throwable th) {
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C10219ai.m31036b(th, "$this$addSuppressed");
            C10219ai.m31036b(th2, "exception");
            if (th != th2) {
                C10300y.f26095a.mo66933a(th, th2);
            }
        }
    }

    /* renamed from: a */
    public String mo66759a() {
        return this.f25981a;
    }

    /* renamed from: b */
    public long mo66760b() {
        return this.f25982b;
    }

    private C10205aa(String str, long j) {
        C10219ai.m31036b(str, "message");
        this.f25981a = str;
        this.f25982b = j;
    }

    public /* synthetic */ C10205aa(String str, long j, int i) {
        this(str, System.currentTimeMillis());
    }
}
