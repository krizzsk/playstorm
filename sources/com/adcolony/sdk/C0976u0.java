package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C0817e0;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.u0 */
class C0976u0 {

    /* renamed from: a */
    private final ScheduledExecutorService f801a = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ScheduledFuture<?> f802b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ScheduledFuture<?> f803c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C0960t0 f804d;

    /* renamed from: com.adcolony.sdk.u0$a */
    class C0977a implements Runnable {
        C0977a() {
        }

        public void run() {
            ScheduledFuture unused = C0976u0.this.f802b = null;
            C0976u0.this.m1029e();
        }
    }

    /* renamed from: com.adcolony.sdk.u0$b */
    class C0978b implements Runnable {
        C0978b() {
        }

        public void run() {
            if (C0976u0.this.f804d.mo11059g()) {
                C0714a.m136b().mo10847r().mo10793i();
                ScheduledFuture unused = C0976u0.this.f803c = null;
            }
        }
    }

    C0976u0(C0960t0 t0Var) {
        this.f804d = t0Var;
    }

    /* renamed from: d */
    private void m1028d() {
        if (this.f802b == null) {
            try {
                this.f802b = this.f801a.schedule(new C0977a(), this.f804d.mo11045a(), TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                new C0817e0.C0818a().mo10684a("RejectedExecutionException when scheduling session stop ").mo10684a(e.toString()).mo10685a(C0817e0.f434i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m1029e() {
        new C0817e0.C0818a().mo10684a("AdColony session ending, releasing Context.").mo10685a(C0817e0.f429d);
        C0714a.m136b().mo10828c(true);
        C0714a.m131a((Context) null);
        this.f804d.mo11056f(true);
        this.f804d.mo11058g(true);
        this.f804d.mo11060j();
        if (C0714a.m136b().mo10847r().mo10791f()) {
            ScheduledFuture<?> scheduledFuture = this.f803c;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.f803c.cancel(false);
            }
            try {
                this.f803c = this.f801a.schedule(new C0978b(), 10, TimeUnit.SECONDS);
            } catch (RejectedExecutionException e) {
                new C0817e0.C0818a().mo10684a("RejectedExecutionException when scheduling message pumping stop ").mo10684a(e.toString()).mo10685a(C0817e0.f434i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11079c() {
        m1024a();
    }

    /* renamed from: a */
    private void m1024a() {
        ScheduledFuture<?> scheduledFuture = this.f802b;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f802b.cancel(false);
            this.f802b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11078b() {
        m1028d();
    }
}
