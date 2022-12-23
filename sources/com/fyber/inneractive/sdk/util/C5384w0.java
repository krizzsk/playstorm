package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.util.w0 */
public class C5384w0 {

    /* renamed from: a */
    public final TimeUnit f14262a;

    /* renamed from: b */
    public final long f14263b;

    /* renamed from: c */
    public Handler f14264c;

    /* renamed from: d */
    public boolean f14265d = false;

    /* renamed from: e */
    public C5386b f14266e;

    /* renamed from: f */
    public long f14267f = 0;

    /* renamed from: com.fyber.inneractive.sdk.util.w0$a */
    public static class C5385a extends Handler {

        /* renamed from: a */
        public final WeakReference<C5384w0> f14268a;

        public C5385a(C5384w0 w0Var) {
            super(Looper.getMainLooper());
            this.f14268a = new WeakReference<>(w0Var);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            C5384w0 w0Var = (C5384w0) this.f14268a.get();
            if (w0Var != null && message.what == 1932593528 && !w0Var.f14265d) {
                w0Var.mo26484a(message.getWhen());
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.w0$b */
    public interface C5386b {
        /* renamed from: a */
        void mo24274a(C5384w0 w0Var);
    }

    public C5384w0(TimeUnit timeUnit, long j) {
        this.f14263b = j;
        this.f14262a = timeUnit;
        IAlog.m16699a("Visible time counter init - time %d", Long.valueOf(j));
    }

    /* renamed from: a */
    public void mo26483a() {
        this.f14265d = true;
        Handler handler = this.f14264c;
        if (handler != null) {
            handler.removeMessages(1932593528);
        }
    }

    /* renamed from: b */
    public void mo26485b() {
        this.f14265d = false;
        mo26484a(SystemClock.uptimeMillis());
    }

    /* renamed from: c */
    public void mo26486c() {
        C5385a aVar = new C5385a(this);
        this.f14264c = aVar;
        this.f14265d = false;
        aVar.sendEmptyMessage(1932593528);
    }

    /* renamed from: a */
    public final void mo26484a(long j) {
        long uptimeMillis = this.f14267f + (SystemClock.uptimeMillis() - j) + 50;
        this.f14267f = uptimeMillis;
        if (this.f14266e == null || uptimeMillis <= this.f14262a.toMillis(this.f14263b)) {
            Handler handler = this.f14264c;
            if (handler != null && this.f14266e != null) {
                handler.removeMessages(1932593528);
                this.f14264c.sendEmptyMessageDelayed(1932593528, 50);
                return;
            }
            return;
        }
        this.f14266e.mo24274a(this);
    }

    public C5384w0(TimeUnit timeUnit, long j, long j2) {
        this.f14263b = j;
        this.f14262a = timeUnit;
        this.f14267f = j2;
        IAlog.m16699a("Visible time counter init - time %d", Long.valueOf(j));
    }
}
