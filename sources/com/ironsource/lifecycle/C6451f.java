package com.ironsource.lifecycle;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.lifecycle.f */
public final class C6451f implements C6442c {

    /* renamed from: a */
    Runnable f16377a;

    /* renamed from: b */
    private String f16378b = "INTERNAL";

    /* renamed from: c */
    private Timer f16379c;

    /* renamed from: d */
    private boolean f16380d;

    /* renamed from: e */
    private Long f16381e;

    /* renamed from: f */
    private long f16382f;

    public C6451f(long j, Runnable runnable, boolean z) {
        this.f16382f = j;
        this.f16377a = runnable;
        this.f16380d = false;
        this.f16381e = null;
        if (0 == 0) {
            this.f16380d = true;
            C6443d.m19366a().mo35957a((C6442c) this);
            this.f16381e = Long.valueOf(System.currentTimeMillis() + this.f16382f);
            if (!C6443d.m19366a().mo35958b()) {
                m19375d();
            }
        }
    }

    /* renamed from: d */
    private void m19375d() {
        if (this.f16379c == null) {
            Timer timer = new Timer();
            this.f16379c = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C6451f.this.f16377a.run();
                }
            }, this.f16382f);
            Calendar.getInstance().setTimeInMillis(this.f16381e.longValue());
        }
    }

    /* renamed from: e */
    private void m19376e() {
        Timer timer = this.f16379c;
        if (timer != null) {
            timer.cancel();
            this.f16379c = null;
        }
    }

    /* renamed from: a */
    public final void mo35947a() {
        Long l;
        if (this.f16379c == null && (l = this.f16381e) != null) {
            long longValue = l.longValue() - System.currentTimeMillis();
            this.f16382f = longValue;
            if (longValue <= 0) {
                mo35971c();
                this.f16377a.run();
                return;
            }
            m19375d();
        }
    }

    /* renamed from: b */
    public final void mo35948b() {
        if (this.f16379c != null) {
            m19376e();
        }
    }

    /* renamed from: c */
    public final void mo35971c() {
        m19376e();
        this.f16380d = false;
        this.f16381e = null;
        C6443d a = C6443d.m19366a();
        if (a.f16361g.contains(this)) {
            a.f16361g.remove(this);
        }
    }
}
