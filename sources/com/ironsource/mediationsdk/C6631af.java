package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.C6765c;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.af */
public final class C6631af {

    /* renamed from: a */
    C6635ag f17229a;

    /* renamed from: b */
    private C6765c f17230b;

    /* renamed from: c */
    private Timer f17231c = null;

    public C6631af(C6765c cVar, C6635ag agVar) {
        this.f17230b = cVar;
        this.f17229a = agVar;
    }

    /* renamed from: e */
    private void m20226e() {
        Timer timer = this.f17231c;
        if (timer != null) {
            timer.cancel();
            this.f17231c = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo36620a() {
        if (this.f17230b.f17681m) {
            m20226e();
            Timer timer = new Timer();
            this.f17231c = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C6631af.this.f17229a.mo36189e();
                }
            }, this.f17230b.f17679k);
        }
    }

    /* renamed from: b */
    public final synchronized void mo36621b() {
        if (!this.f17230b.f17681m) {
            m20226e();
            Timer timer = new Timer();
            this.f17231c = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C6631af.this.f17229a.mo36189e();
                }
            }, this.f17230b.f17679k);
        }
    }

    /* renamed from: c */
    public final void mo36622c() {
        synchronized (this) {
            m20226e();
        }
        this.f17229a.mo36189e();
    }

    /* renamed from: d */
    public final synchronized void mo36623d() {
        m20226e();
        Timer timer = new Timer();
        this.f17231c = timer;
        timer.schedule(new TimerTask() {
            public final void run() {
                C6631af.this.f17229a.mo36189e();
            }
        }, this.f17230b.f17678j);
    }
}
