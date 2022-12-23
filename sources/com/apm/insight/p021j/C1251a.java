package com.apm.insight.p021j;

import android.os.Handler;

/* renamed from: com.apm.insight.j.a */
public abstract class C1251a implements Runnable {

    /* renamed from: a */
    private Handler f1184a;

    /* renamed from: b */
    private final long f1185b;

    /* renamed from: c */
    private final long f1186c;

    C1251a(Handler handler, long j, long j2) {
        this.f1184a = handler;
        this.f1185b = j;
        this.f1186c = j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12312a() {
        if (mo12314b() > 0) {
            this.f1184a.postDelayed(this, mo12314b());
        } else {
            this.f1184a.post(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12313a(long j) {
        if (j > 0) {
            this.f1184a.postDelayed(this, j);
        } else {
            this.f1184a.post(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo12314b() {
        return this.f1185b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo12315c() {
        return this.f1186c;
    }
}
