package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Timer;

/* renamed from: com.ironsource.mediationsdk.b */
public abstract class C6642b {

    /* renamed from: a */
    C6643a f17240a;

    /* renamed from: b */
    public AbstractAdapter f17241b;

    /* renamed from: c */
    NetworkSettings f17242c;

    /* renamed from: d */
    String f17243d;

    /* renamed from: e */
    boolean f17244e;

    /* renamed from: f */
    public String f17245f;

    /* renamed from: g */
    public String f17246g;

    /* renamed from: h */
    int f17247h;

    /* renamed from: i */
    Timer f17248i;

    /* renamed from: j */
    Timer f17249j;

    /* renamed from: k */
    int f17250k;

    /* renamed from: l */
    int f17251l;

    /* renamed from: m */
    public int f17252m;

    /* renamed from: n */
    public int f17253n;

    /* renamed from: o */
    protected Long f17254o;

    /* renamed from: p */
    protected Long f17255p;

    /* renamed from: q */
    IronSourceLoggerManager f17256q;

    /* renamed from: r */
    private String f17257r;

    /* renamed from: s */
    private int f17258s;

    /* renamed from: t */
    private String f17259t = "maxAdsPerSession";

    /* renamed from: u */
    private String f17260u = "maxAdsPerIteration";

    /* renamed from: v */
    private String f17261v = "maxAdsPerDay";

    /* renamed from: com.ironsource.mediationsdk.b$a */
    public enum C6643a {
        NOT_INITIATED(0),
        INIT_FAILED(1),
        INITIATED(2),
        AVAILABLE(3),
        NOT_AVAILABLE(4),
        EXHAUSTED(5),
        CAPPED_PER_SESSION(6),
        INIT_PENDING(7),
        LOAD_PENDING(8),
        CAPPED_PER_DAY(9),
        NEEDS_RELOAD(10);
        

        /* renamed from: l */
        public int f17274l;

        private C6643a(int i) {
            this.f17274l = i;
        }
    }

    C6642b(NetworkSettings networkSettings) {
        this.f17257r = networkSettings.getProviderTypeForReflection();
        this.f17243d = networkSettings.getProviderInstanceName();
        this.f17244e = networkSettings.isMultipleInstances();
        this.f17242c = networkSettings;
        this.f17245f = networkSettings.getSubProviderId();
        this.f17246g = networkSettings.getAdSourceNameForEvents();
        this.f17247h = 0;
        this.f17258s = 0;
        this.f17240a = C6643a.NOT_INITIATED;
        this.f17256q = IronSourceLoggerManager.getLogger();
        this.f17254o = null;
        this.f17255p = null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36629a(com.ironsource.mediationsdk.C6642b.C6643a r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.b$a r0 = r4.f17240a     // Catch:{ all -> 0x0044 }
            if (r0 != r5) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r4.f17240a = r5     // Catch:{ all -> 0x0044 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r4.f17256q     // Catch:{ all -> 0x0044 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = "Smart Loading - "
            r2.<init>(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r4.f17243d     // Catch:{ all -> 0x0044 }
            r2.append(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = " state changed to "
            r2.append(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0044 }
            r2.append(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0044 }
            r3 = 0
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0044 }
            com.ironsource.mediationsdk.AbstractAdapter r0 = r4.f17241b     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C6642b.C6643a.CAPPED_PER_SESSION     // Catch:{ all -> 0x0044 }
            if (r5 == r0) goto L_0x0039
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C6642b.C6643a.CAPPED_PER_DAY     // Catch:{ all -> 0x0044 }
            if (r5 != r0) goto L_0x0042
        L_0x0039:
            com.ironsource.mediationsdk.AbstractAdapter r0 = r4.f17241b     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r4.mo36062k()     // Catch:{ all -> 0x0044 }
            r0.setMediationState(r5, r1)     // Catch:{ all -> 0x0044 }
        L_0x0042:
            monitor-exit(r4)
            return
        L_0x0044:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C6642b.mo36629a(com.ironsource.mediationsdk.b$a):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36630a(String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f17256q;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, str + " exception: " + this.f17243d + " | " + str2, 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo36631a() {
        return this.f17247h >= this.f17250k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo36632b() {
        return this.f17258s >= this.f17251l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo36633c() {
        if (!mo36631a() && !mo36632b()) {
            if (!(this.f17240a == C6643a.CAPPED_PER_DAY)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo36634d() {
        this.f17247h++;
        this.f17258s++;
        if (mo36632b()) {
            mo36629a(C6643a.CAPPED_PER_SESSION);
        } else if (mo36631a()) {
            mo36629a(C6643a.EXHAUSTED);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo36635e() {
        try {
            if (this.f17248i != null) {
                this.f17248i.cancel();
            }
        } catch (Exception e) {
            mo36630a("stopInitTimer", e.getLocalizedMessage());
        } finally {
            this.f17248i = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo36636f() {
        try {
            if (this.f17249j != null) {
                this.f17249j.cancel();
            }
        } catch (Exception e) {
            mo36630a("stopLoadTimer", e.getLocalizedMessage());
        } finally {
            this.f17249j = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo36059g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo36060h();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract void mo36061i();

    /* renamed from: j */
    public final String mo36637j() {
        return this.f17244e ? this.f17257r : this.f17243d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract String mo36062k();

    /* renamed from: l */
    public final Long mo36638l() {
        return this.f17254o;
    }

    /* renamed from: m */
    public final Long mo36639m() {
        return this.f17255p;
    }
}
