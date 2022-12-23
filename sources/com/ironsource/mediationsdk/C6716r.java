package com.ironsource.mediationsdk;

import com.ironsource.environment.p205e.C6423c;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.r */
public final class C6716r {

    /* renamed from: a */
    private static final C6716r f17582a = new C6716r();

    /* renamed from: b */
    private Map<String, Long> f17583b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Map<String, Boolean> f17584c = new HashMap();

    /* renamed from: d */
    private int f17585d;

    /* renamed from: e */
    private int f17586e;

    private C6716r() {
    }

    /* renamed from: a */
    public static synchronized C6716r m20447a() {
        C6716r rVar;
        synchronized (C6716r.class) {
            rVar = f17582a;
        }
        return rVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m20450b(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        this.f17583b.put(ad_unit.toString(), Long.valueOf(System.currentTimeMillis()));
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            C6463D.m19392a().mo36013a(ironSourceError);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6569ac.m19976a().mo36417a(ironSourceError);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
        }
    }

    /* renamed from: a */
    public final void mo36850a(IronSource.AD_UNIT ad_unit, int i) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f17585d = i;
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f17586e = i;
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
        }
    }

    /* renamed from: a */
    public final synchronized void mo36851a(final IronSource.AD_UNIT ad_unit, final IronSourceError ironSourceError) {
        int i;
        if (!mo36852a(ad_unit)) {
            final String ad_unit2 = ad_unit.toString();
            if (!this.f17583b.containsKey(ad_unit2)) {
                m20450b(ad_unit, ironSourceError);
                return;
            }
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                i = this.f17585d;
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                i = this.f17586e;
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.warning("ad unit not supported - " + ad_unit);
                i = 0;
            }
            long j = (long) (i * 1000);
            long currentTimeMillis = System.currentTimeMillis() - this.f17583b.get(ad_unit2).longValue();
            if (currentTimeMillis > j) {
                m20450b(ad_unit, ironSourceError);
                return;
            }
            this.f17584c.put(ad_unit2, Boolean.TRUE);
            long j2 = j - currentTimeMillis;
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.verbose("delaying callback by " + j2);
            C6423c cVar = C6423c.f16330a;
            C6423c.m19277a(new Runnable() {
                public final void run() {
                    IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
                    C6716r.this.m20450b(ad_unit, ironSourceError);
                    C6716r.this.f17584c.put(ad_unit2, Boolean.FALSE);
                }
            }, j2);
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo36852a(IronSource.AD_UNIT ad_unit) {
        if (!this.f17584c.containsKey(ad_unit.toString())) {
            return false;
        }
        return this.f17584c.get(ad_unit.toString()).booleanValue();
    }
}
