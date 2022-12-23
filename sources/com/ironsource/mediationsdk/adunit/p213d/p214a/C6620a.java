package com.ironsource.mediationsdk.adunit.p213d.p214a;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.p210c.p211a.C6603a;
import com.ironsource.mediationsdk.adunit.p213d.C6619a;
import com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C6691a;
import com.ironsource.mediationsdk.model.Placement;

/* renamed from: com.ironsource.mediationsdk.adunit.d.a.a */
public abstract class C6620a<Listener extends C6603a> extends C6622c<Listener> implements AdapterAdInteractionListener {

    /* renamed from: h */
    private BaseAdInteractionAdapter<?, AdapterAdInteractionListener> f17184h;

    public C6620a(C6619a aVar, BaseAdInteractionAdapter<?, ?> baseAdInteractionAdapter, C6691a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
        this.f17184h = baseAdInteractionAdapter;
    }

    /* renamed from: a */
    public final void mo36590a(Placement placement) {
        int i;
        IronLog.INTERNAL.verbose(mo36597c("placementName = " + placement.getPlacementName()));
        try {
            this.f17190e = placement;
            mo36594a(C6622c.C6623a.SHOWING);
            this.f17188c.f17102d.mo36495a(mo36609q());
            this.f17184h.showAd(this.f17191f, this);
        } catch (Throwable th) {
            String str = "showAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(mo36597c(str));
            mo36594a(C6622c.C6623a.FAILED);
            if (this.f17188c != null) {
                this.f17188c.f17103e.mo36545n(str);
            }
            IronSource.AD_UNIT ad_unit = this.f17186a.f17175a;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                i = IronSourceError.ERROR_IS_SHOW_EXCEPTION;
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                i = 1038;
            } else {
                IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
                i = IronSourceError.ERROR_CODE_GENERIC;
            }
            onAdShowFailed(i, str);
        }
    }

    /* renamed from: a */
    public final void mo36591a(boolean z) {
        if (this.f17188c != null) {
            this.f17188c.f17102d.mo36499a(z);
        }
    }

    /* renamed from: a */
    public final boolean mo36592a() {
        if (this.f17191f != null) {
            try {
                return mo36603i() ? this.f17189d == C6622c.C6623a.LOADED && this.f17184h.isAdAvailable(this.f17191f) : this.f17184h.isAdAvailable(this.f17191f);
            } catch (Throwable th) {
                String str = "isReadyToShow - exception = " + th.getLocalizedMessage();
                IronLog.INTERNAL.error(mo36597c(str));
                if (this.f17188c != null) {
                    this.f17188c.f17103e.mo36545n(str);
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo36593c() {
        super.mo36593c();
        BaseAdInteractionAdapter<?, AdapterAdInteractionListener> baseAdInteractionAdapter = this.f17184h;
        if (baseAdInteractionAdapter != null) {
            try {
                baseAdInteractionAdapter.releaseMemory();
            } catch (Exception e) {
                String format = String.format("releaseMemory - exception = ", new Object[]{e});
                IronLog.INTERNAL.verbose(mo36597c(format));
                if (this.f17188c != null) {
                    this.f17188c.f17103e.mo36545n(format);
                }
            }
            this.f17184h = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        ((com.ironsource.mediationsdk.adunit.p210c.p211a.C6603a) r5.f17187b).mo36555c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAdClosed() {
        /*
            r5 = this;
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r1 = ""
            java.lang.String r1 = r5.mo36597c(r1)
            r0.verbose(r1)
            java.lang.Object r0 = r5.f17192g
            monitor-enter(r0)
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = r5.f17189d     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.adunit.d.a.c$a r2 = com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c.C6623a.SHOWING     // Catch:{ all -> 0x0087 }
            if (r1 != r2) goto L_0x0068
            com.ironsource.mediationsdk.adunit.d.a.c$a r1 = com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c.C6623a.NONE     // Catch:{ all -> 0x0087 }
            r5.mo36594a((com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c.C6623a) r1)     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.adunit.b.d r1 = r5.f17188c     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = ""
            com.ironsource.mediationsdk.adunit.d.a r2 = r5.f17186a     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r2 = r2.f17175a     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.IronSource$AD_UNIT r3 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ all -> 0x0087 }
            if (r2 != r3) goto L_0x0054
            com.ironsource.mediationsdk.adunit.c.a.b r1 = r5.f17187b     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.adunit.c.a.a r1 = (com.ironsource.mediationsdk.adunit.p210c.p211a.C6603a) r1     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = r1.mo36554c()     // Catch:{ all -> 0x0087 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = "otherInstanceAvailable = "
            r2.<init>(r3)     // Catch:{ all -> 0x0087 }
            int r3 = r1.length()     // Catch:{ all -> 0x0087 }
            if (r3 <= 0) goto L_0x004b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            java.lang.String r4 = "true|"
            r3.<init>(r4)     // Catch:{ all -> 0x0087 }
            r3.append(r1)     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0087 }
            goto L_0x004d
        L_0x004b:
            java.lang.String r1 = "false"
        L_0x004d:
            r2.append(r1)     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0087 }
        L_0x0054:
            com.ironsource.mediationsdk.adunit.b.d r2 = r5.f17188c     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.adunit.b.a r2 = r2.f17102d     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = r5.mo36609q()     // Catch:{ all -> 0x0087 }
            r2.mo36497a(r3, r1)     // Catch:{ all -> 0x0087 }
        L_0x005f:
            monitor-exit(r0)     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.adunit.c.a.b r0 = r5.f17187b
            com.ironsource.mediationsdk.adunit.c.a.a r0 = (com.ironsource.mediationsdk.adunit.p210c.p211a.C6603a) r0
            r0.mo36555c(r5)
            return
        L_0x0068:
            com.ironsource.mediationsdk.adunit.b.d r1 = r5.f17188c     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x0085
            com.ironsource.mediationsdk.adunit.b.d r1 = r5.f17188c     // Catch:{ all -> 0x0087 }
            com.ironsource.mediationsdk.adunit.b.i r1 = r1.f17103e     // Catch:{ all -> 0x0087 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = "unexpected closed for "
            r2.<init>(r3)     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = r5.mo36605m()     // Catch:{ all -> 0x0087 }
            r2.append(r3)     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0087 }
            r1.mo36543l(r2)     // Catch:{ all -> 0x0087 }
        L_0x0085:
            monitor-exit(r0)     // Catch:{ all -> 0x0087 }
            return
        L_0x0087:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0087 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p213d.p214a.C6620a.onAdClosed():void");
    }

    public void onAdEnded() {
        IronLog.INTERNAL.verbose(mo36597c(""));
        if (this.f17188c != null) {
            this.f17188c.f17102d.mo36504f(mo36609q());
        }
        ((C6603a) this.f17187b).mo36557e(this);
    }

    public void onAdOpened() {
        IronLog.INTERNAL.verbose(mo36597c(""));
        if (this.f17188c != null) {
            this.f17188c.f17102d.mo36501c(mo36609q());
        }
        ((C6603a) this.f17187b).mo36553b(this);
    }

    public void onAdShowFailed(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(mo36597c("error = " + i + ", " + str));
        if (this.f17189d == C6622c.C6623a.SHOWING) {
            mo36594a(C6622c.C6623a.FAILED);
            if (this.f17188c != null) {
                this.f17188c.f17102d.mo36496a(mo36609q(), i, str, "");
            }
            ((C6603a) this.f17187b).mo36552a(new IronSourceError(i, str), this);
        } else if (this.f17188c != null) {
            this.f17188c.f17103e.mo36542k(String.format("unexpected show failed for %s, error - %d, %s", new Object[]{mo36605m(), Integer.valueOf(i), str}));
        }
    }

    public void onAdShowSuccess() {
        IronLog.INTERNAL.verbose(mo36597c(""));
        if (this.f17188c != null) {
            this.f17188c.f17102d.mo36500b(mo36609q());
        }
        ((C6603a) this.f17187b).mo36551a(this);
    }

    public void onAdStarted() {
        IronLog.INTERNAL.verbose(mo36597c(""));
        if (this.f17188c != null) {
            this.f17188c.f17102d.mo36503e(mo36609q());
        }
        ((C6603a) this.f17187b).mo36556d(this);
    }

    public void onAdVisible() {
        IronLog.INTERNAL.verbose(mo36597c(""));
        if (this.f17188c != null) {
            this.f17188c.f17102d.mo36505g(mo36609q());
        }
    }
}
