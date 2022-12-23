package com.ironsource.mediationsdk.adunit.p210c;

import com.ironsource.mediationsdk.C6635ag;
import com.ironsource.mediationsdk.adunit.p210c.p212b.C6607a;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.adunit.c.c */
public final class C6609c {

    /* renamed from: a */
    C6607a f17136a;

    /* renamed from: b */
    C6635ag f17137b;

    /* renamed from: c */
    private Timer f17138c;

    public C6609c(C6607a aVar, C6635ag agVar) {
        this.f17136a = aVar;
        this.f17137b = agVar;
    }

    /* renamed from: c */
    private void m20109c() {
        Timer timer = this.f17138c;
        if (timer != null) {
            timer.cancel();
            this.f17138c = null;
        }
    }

    /* renamed from: a */
    public final void mo36567a() {
        if (this.f17136a.f17128a != C6607a.C6608a.MANUAL) {
            mo36568a(this.f17136a.f17130c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36568a(long j) {
        m20109c();
        Timer timer = new Timer();
        this.f17138c = timer;
        timer.schedule(new TimerTask() {
            public final void run() {
                C6609c.this.f17137b.mo36189e();
            }
        }, j);
    }

    /* renamed from: b */
    public final void mo36569b() {
        if (this.f17136a.f17128a != C6607a.C6608a.MANUAL) {
            mo36568a(0);
        }
    }
}
