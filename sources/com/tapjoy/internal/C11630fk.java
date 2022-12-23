package com.tapjoy.internal;

import android.os.SystemClock;

/* renamed from: com.tapjoy.internal.fk */
public final class C11630fk {

    /* renamed from: a */
    public static final C11630fk f28286a = new C11630fk(-1);

    /* renamed from: b */
    public final long f28287b;

    /* renamed from: c */
    public long f28288c;

    public C11630fk(long j) {
        this.f28287b = j;
        this.f28288c = SystemClock.elapsedRealtime();
    }

    public C11630fk() {
        this.f28287b = 3600000;
        try {
            this.f28288c = SystemClock.elapsedRealtime() - 3600000;
        } catch (NullPointerException unused) {
            this.f28288c = -1;
        }
    }

    /* renamed from: a */
    public final boolean mo72492a() {
        try {
            return SystemClock.elapsedRealtime() - this.f28288c > this.f28287b;
        } catch (NullPointerException unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo72493a(long j) {
        try {
            return (SystemClock.elapsedRealtime() - this.f28288c) + j > this.f28287b;
        } catch (NullPointerException unused) {
            return true;
        }
    }
}
