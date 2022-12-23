package com.ironsource.mediationsdk.utils;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.p286a.C8155e;

/* renamed from: com.ironsource.mediationsdk.utils.o */
public final class C6782o {

    /* renamed from: f */
    private static C6782o f17881f;

    /* renamed from: a */
    private int f17882a = 1;

    /* renamed from: b */
    private int f17883b = 1;

    /* renamed from: c */
    private int f17884c = 1;

    /* renamed from: d */
    private int f17885d = 1;

    /* renamed from: e */
    private C8155e f17886e = new C8155e();

    /* renamed from: com.ironsource.mediationsdk.utils.o$1 */
    static /* synthetic */ class C67831 {

        /* renamed from: a */
        static final /* synthetic */ int[] f17887a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ironsource.mediationsdk.IronSource$AD_UNIT[] r0 = com.ironsource.mediationsdk.IronSource.AD_UNIT.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17887a = r0
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.OFFERWALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17887a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17887a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17887a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C6782o.C67831.<clinit>():void");
        }
    }

    private C6782o() {
        m20649d(this.f17882a);
        m20650e(this.f17883b);
        m20651f(this.f17885d);
    }

    /* renamed from: a */
    public static synchronized C6782o m20647a() {
        C6782o oVar;
        synchronized (C6782o.class) {
            if (f17881f == null) {
                f17881f = new C6782o();
            }
            oVar = f17881f;
        }
        return oVar;
    }

    /* renamed from: c */
    private static IronSource.AD_UNIT m20648c(int i) {
        if (i == 0) {
            return IronSource.AD_UNIT.OFFERWALL;
        }
        if (i == 1) {
            return IronSource.AD_UNIT.REWARDED_VIDEO;
        }
        if (i == 2) {
            return IronSource.AD_UNIT.INTERSTITIAL;
        }
        if (i != 3) {
            return null;
        }
        return IronSource.AD_UNIT.BANNER;
    }

    /* renamed from: d */
    private void m20649d(int i) {
        this.f17882a = i;
        this.f17886e.mo56417b(i);
    }

    /* renamed from: e */
    private void m20650e(int i) {
        this.f17883b = i;
        this.f17886e.mo56416a(i);
    }

    /* renamed from: f */
    private void m20651f(int i) {
        this.f17885d = i;
        this.f17886e.mo56418c(i);
    }

    /* renamed from: a */
    public final synchronized void mo36988a(int i) {
        mo36989a(m20648c(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo36989a(com.ironsource.mediationsdk.IronSource.AD_UNIT r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L_0x0005
            monitor-exit(r2)
            return
        L_0x0005:
            int[] r0 = com.ironsource.mediationsdk.utils.C6782o.C67831.f17887a     // Catch:{ all -> 0x0039 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0039 }
            r3 = r0[r3]     // Catch:{ all -> 0x0039 }
            r0 = 1
            if (r3 == r0) goto L_0x0032
            r1 = 2
            if (r3 == r1) goto L_0x002a
            r1 = 3
            if (r3 == r1) goto L_0x0022
            r1 = 4
            if (r3 == r1) goto L_0x001a
            goto L_0x0020
        L_0x001a:
            int r3 = r2.f17885d     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.m20651f(r3)     // Catch:{ all -> 0x0039 }
        L_0x0020:
            monitor-exit(r2)
            return
        L_0x0022:
            int r3 = r2.f17883b     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.m20650e(r3)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x002a:
            int r3 = r2.f17882a     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.m20649d(r3)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x0032:
            int r3 = r2.f17884c     // Catch:{ all -> 0x0039 }
            int r3 = r3 + r0
            r2.f17884c = r3     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x0039:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C6782o.mo36989a(com.ironsource.mediationsdk.IronSource$AD_UNIT):void");
    }

    /* renamed from: b */
    public final synchronized int mo36990b(int i) {
        return mo36991b(m20648c(i));
    }

    /* renamed from: b */
    public final synchronized int mo36991b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return -1;
        }
        int i = C67831.f17887a[ad_unit.ordinal()];
        if (i == 1) {
            return this.f17884c;
        } else if (i == 2) {
            return this.f17882a;
        } else if (i == 3) {
            return this.f17883b;
        } else if (i != 4) {
            return -1;
        } else {
            return this.f17885d;
        }
    }
}
