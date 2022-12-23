package com.ironsource.mediationsdk.p216b;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.b.a */
public abstract class C6644a<T> {

    /* renamed from: a */
    protected T f17275a;

    /* renamed from: b */
    private Timer f17276b;

    /* renamed from: c */
    private long f17277c;

    public C6644a(long j) {
        this.f17277c = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo36640a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36641a(T t) {
        if (!(this.f17277c <= 0) && t != null) {
            this.f17275a = t;
            mo36642b();
            Timer timer = new Timer();
            this.f17276b = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C6644a.this.mo36640a();
                }
            }, this.f17277c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo36642b() {
        Timer timer = this.f17276b;
        if (timer != null) {
            timer.cancel();
            this.f17276b = null;
        }
    }

    /* renamed from: c */
    public final void mo36643c() {
        this.f17275a = null;
    }
}
