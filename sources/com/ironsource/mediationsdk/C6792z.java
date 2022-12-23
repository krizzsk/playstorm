package com.ironsource.mediationsdk;

import com.ironsource.lifecycle.C6451f;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.mediationsdk.z */
public final class C6792z {

    /* renamed from: a */
    C6650c f17919a;

    /* renamed from: b */
    private Runnable f17920b;

    /* renamed from: c */
    private int f17921c = 0;

    /* renamed from: d */
    private C6451f f17922d;

    public C6792z(int i, C6650c cVar) {
        this.f17919a = cVar;
        this.f17921c = i;
        this.f17920b = new Runnable() {
            public final void run() {
                IronLog.INTERNAL.verbose("loaded ads are expired");
                if (C6792z.this.f17919a != null) {
                    C6792z.this.f17919a.mo36187c_();
                }
            }
        };
    }

    /* renamed from: b */
    private boolean m20700b() {
        return this.f17921c > 0;
    }

    /* renamed from: a */
    public final void mo37015a() {
        if (m20700b() && this.f17922d != null) {
            IronLog.INTERNAL.verbose("canceling expiration timer");
            this.f17922d.mo35971c();
            this.f17922d = null;
        }
    }

    /* renamed from: a */
    public final void mo37016a(long j) {
        if (m20700b()) {
            long millis = TimeUnit.MINUTES.toMillis((long) this.f17921c) - Math.max(j, 0);
            if (millis > 0) {
                mo37015a();
                this.f17922d = new C6451f(millis, this.f17920b, true);
                Calendar instance = Calendar.getInstance();
                instance.add(14, (int) millis);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("loaded ads will expire on: " + instance.getTime() + " in " + String.format("%.2f", new Object[]{Double.valueOf((((double) millis) / 1000.0d) / 60.0d)}) + " minutes");
                return;
            }
            IronLog.INTERNAL.verbose("no delay - onAdExpired called");
            this.f17919a.mo36187c_();
        }
    }
}
