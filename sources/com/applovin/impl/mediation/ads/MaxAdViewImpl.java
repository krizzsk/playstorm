package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.C1604a;
import com.applovin.impl.mediation.p028a.C1574b;
import com.applovin.impl.mediation.p032d.C1645c;
import com.applovin.impl.sdk.C1817aa;
import com.applovin.impl.sdk.C1862d;
import com.applovin.impl.sdk.C1873e;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.C2101z;
import com.applovin.impl.sdk.p048c.C1856a;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1934z;
import com.applovin.impl.sdk.utils.C2033b;
import com.applovin.impl.sdk.utils.C2043j;
import com.applovin.impl.sdk.utils.C2085q;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.UUID;

public class MaxAdViewImpl extends C1604a implements C1817aa.C1820a, C1862d.C1864a, C1873e.C1876a {

    /* renamed from: A */
    private boolean f2078A;

    /* renamed from: B */
    private boolean f2079B;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f2080a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final MaxAdView f2081b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f2082c = UUID.randomUUID().toString().toLowerCase(Locale.US);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final View f2083d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f2084e = Long.MAX_VALUE;

    /* renamed from: f */
    private C1574b f2085f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f2086g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f2087h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f2088i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f2089j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1586a f2090k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1588c f2091l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1862d f2092m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C2101z f2093n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1817aa f2094o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Object f2095p = new Object();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C1574b f2096q = null;

    /* renamed from: r */
    private boolean f2097r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f2098s;

    /* renamed from: t */
    private boolean f2099t;

    /* renamed from: u */
    private boolean f2100u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f2101v = false;

    /* renamed from: w */
    private boolean f2102w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f2103x;

    /* renamed from: y */
    private boolean f2104y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f2105z;

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$a */
    private class C1586a extends C1587b {
        private C1586a() {
            super();
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            if (C2092v.m5047a()) {
                C2092v vVar = MaxAdViewImpl.this.logger;
                String str2 = MaxAdViewImpl.this.tag;
                vVar.mo14789b(str2, "Calling ad load failed callback for publisher: " + MaxAdViewImpl.this.adListener);
            }
            C2043j.m4932a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.m3075a(maxError);
        }

        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.f2101v) {
                if (C2092v.m5047a()) {
                    C2092v vVar = MaxAdViewImpl.this.logger;
                    String str = MaxAdViewImpl.this.tag;
                    vVar.mo14789b(str, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.mo14290E().destroyAd(maxAd);
                return;
            }
            C1574b bVar = (C1574b) maxAd;
            bVar.mo13241d(MaxAdViewImpl.this.f2088i);
            bVar.mo13242e(MaxAdViewImpl.this.f2089j);
            if (bVar.mo13176w() != null) {
                MaxAdViewImpl.this.m3064a(bVar);
                if (bVar.mo13178y()) {
                    long z = bVar.mo13179z();
                    if (C2092v.m5047a()) {
                        C2092v A = MaxAdViewImpl.this.sdk.mo14286A();
                        String str2 = MaxAdViewImpl.this.tag;
                        A.mo14789b(str2, "Scheduling banner ad refresh " + z + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                    }
                    MaxAdViewImpl.this.f2092m.mo14082a(z);
                    if (MaxAdViewImpl.this.f2092m.mo14088f() || MaxAdViewImpl.this.f2098s) {
                        if (C2092v.m5047a()) {
                            MaxAdViewImpl.this.logger.mo14789b(MaxAdViewImpl.this.tag, "Pausing ad refresh for publisher");
                        }
                        MaxAdViewImpl.this.f2092m.mo14086d();
                    }
                }
                if (C2092v.m5047a()) {
                    C2092v vVar2 = MaxAdViewImpl.this.logger;
                    String str3 = MaxAdViewImpl.this.tag;
                    vVar2.mo14789b(str3, "Calling ad load success callback for publisher: " + MaxAdViewImpl.this.adListener);
                }
                C2043j.m4930a(MaxAdViewImpl.this.adListener, maxAd, true);
                return;
            }
            MaxAdViewImpl.this.sdk.mo14290E().destroyAd(bVar);
            onAdLoadFailed(bVar.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$b */
    private abstract class C1587b implements C1604a.C1605a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener {

        /* renamed from: a */
        private boolean f2113a;

        private C1587b() {
        }

        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2096q)) {
                C2043j.m4960d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2096q)) {
                if ((MaxAdViewImpl.this.f2096q.mo13172A() || MaxAdViewImpl.this.f2105z) && this.f2113a) {
                    this.f2113a = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                C2043j.m4968h(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f2096q)) {
                C2043j.m4927a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2096q)) {
                C2043j.m4952b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2096q)) {
                if ((MaxAdViewImpl.this.f2096q.mo13172A() || MaxAdViewImpl.this.f2105z) && !MaxAdViewImpl.this.f2092m.mo14088f()) {
                    this.f2113a = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                C2043j.m4966g(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2096q)) {
                C2043j.m4957c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
            C2043j.m4934a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$c */
    private class C1588c extends C1587b {
        private C1588c() {
            super();
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            if (C2092v.m5047a()) {
                C2092v vVar = MaxAdViewImpl.this.logger;
                String str2 = MaxAdViewImpl.this.tag;
                vVar.mo14789b(str2, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.m3075a(maxError);
        }

        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.f2101v) {
                if (C2092v.m5047a()) {
                    C2092v vVar = MaxAdViewImpl.this.logger;
                    String str = MaxAdViewImpl.this.tag;
                    vVar.mo14789b(str, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.mo14290E().destroyAd(maxAd);
                return;
            }
            if (C2092v.m5047a()) {
                MaxAdViewImpl.this.logger.mo14789b(MaxAdViewImpl.this.tag, "Successfully pre-cached ad for refresh");
            }
            MaxAdViewImpl.this.m3074a(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdView maxAdView, View view, C1959m mVar, Context context) {
        super(str, maxAdFormat, "MaxAdView", mVar);
        if (context != null) {
            this.f2080a = context.getApplicationContext();
            this.f2081b = maxAdView;
            this.f2083d = view;
            this.f2090k = new C1586a();
            this.f2091l = new C1588c();
            this.f2092m = new C1862d(mVar, this);
            this.f2093n = new C2101z(maxAdView, mVar);
            this.f2094o = new C1817aa(maxAdView, mVar, this);
            mVar.mo14287B().mo14136a((C1873e.C1876a) this);
            if (C2092v.m5047a()) {
                C2092v vVar = this.logger;
                String str2 = this.tag;
                vVar.mo14789b(str2, "Created new MaxAdView (" + this + ")");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No context specified");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3061a() {
        C1574b bVar;
        MaxAdView maxAdView = this.f2081b;
        if (maxAdView != null) {
            C2033b.m4862a(maxAdView, this.f2083d);
        }
        this.f2094o.mo13892a();
        synchronized (this.f2095p) {
            bVar = this.f2096q;
        }
        if (bVar != null) {
            this.sdk.mo14290E().destroyAd(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3062a(long j) {
        if (!Utils.bitMaskContainsFlag(j, ((Long) this.sdk.mo14311a(C1856a.f3064y)).longValue()) || this.f2078A) {
            if (C2092v.m5047a()) {
                this.logger.mo14789b(this.tag, "No undesired viewability flags matched or forcing pre-cache - scheduling viewability");
            }
            this.f2097r = false;
            m3080b();
            return;
        }
        if (C2092v.m5047a()) {
            C2092v vVar = this.logger;
            String str = this.tag;
            vVar.mo14789b(str, "Undesired flags matched - current: " + Long.toBinaryString(j) + ", undesired: " + Long.toBinaryString(j));
            this.logger.mo14789b(this.tag, "Waiting for refresh timer to manually fire request");
        }
        this.f2097r = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3063a(View view, C1574b bVar) {
        int u = bVar.mo13174u();
        int v = bVar.mo13175v();
        int i = -1;
        int dpToPx = u == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), u);
        if (v != -1) {
            i = AppLovinSdkUtils.dpToPx(view.getContext(), v);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, i);
        } else {
            layoutParams.width = dpToPx;
            layoutParams.height = i;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (C2092v.m5047a()) {
                this.logger.mo14789b(this.tag, "Pinning ad view to MAX ad view with width: " + dpToPx + " and height: " + i + ".");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int addRule : C2085q.m5021a(this.f2081b.getGravity(), 10, 14)) {
                layoutParams2.addRule(addRule);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3064a(final C1574b bVar) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
                java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
                	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
                	at java.base/java.util.Objects.checkIndex(Objects.java:372)
                	at java.base/java.util.ArrayList.get(ArrayList.java:458)
                	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
                	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
                	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
                	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
                	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
                */
            public void run() {
                /*
                    r8 = this;
                    com.applovin.impl.mediation.a.b r0 = r2
                    android.view.View r0 = r0.mo13176w()
                    r1 = 0
                    if (r0 != 0) goto L_0x000c
                    java.lang.String r2 = "MaxAdView does not have a loaded ad view"
                    goto L_0x000d
                L_0x000c:
                    r2 = r1
                L_0x000d:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r3 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.mediation.ads.MaxAdView r3 = r3.f2081b
                    if (r3 != 0) goto L_0x0017
                    java.lang.String r2 = "MaxAdView does not have a parent view"
                L_0x0017:
                    if (r2 == 0) goto L_0x003a
                    boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()
                    if (r0 == 0) goto L_0x002a
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.v r0 = r0.logger
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.String r1 = r1.tag
                    r0.mo14793e(r1, r2)
                L_0x002a:
                    com.applovin.impl.mediation.MaxErrorImpl r0 = new com.applovin.impl.mediation.MaxErrorImpl
                    r1 = -1
                    r0.<init>(r1, r2)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r1 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.mediation.MaxAdListener r1 = r1.adListener
                    com.applovin.impl.mediation.a.b r2 = r2
                    com.applovin.impl.sdk.utils.C2043j.m4926a((com.applovin.mediation.MaxAdListener) r1, (com.applovin.mediation.MaxAd) r2, (com.applovin.mediation.MaxError) r0)
                    return
                L_0x003a:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    r2.m3061a()
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r4 = r2
                    r2.mo13299a(r4)
                    com.applovin.impl.mediation.a.b r2 = r2
                    boolean r2 = r2.mo13203G()
                    if (r2 == 0) goto L_0x0059
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.aa r2 = r2.f2094o
                    com.applovin.impl.mediation.a.b r4 = r2
                    r2.mo13893a((com.applovin.impl.mediation.p028a.C1577e) r4)
                L_0x0059:
                    r2 = 393216(0x60000, float:5.51013E-40)
                    r3.setDescendantFocusability(r2)
                    com.applovin.impl.mediation.a.b r2 = r2
                    long r4 = r2.mo13173B()
                    r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                    int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r2 == 0) goto L_0x007e
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    android.view.View r2 = r2.f2083d
                    com.applovin.impl.mediation.a.b r4 = r2
                    long r4 = r4.mo13173B()
                L_0x0079:
                    int r4 = (int) r4
                L_0x007a:
                    r2.setBackgroundColor(r4)
                    goto L_0x009d
                L_0x007e:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    long r4 = r2.f2084e
                    int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r2 == 0) goto L_0x0095
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    android.view.View r2 = r2.f2083d
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r4 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    long r4 = r4.f2084e
                    goto L_0x0079
                L_0x0095:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    android.view.View r2 = r2.f2083d
                    r4 = 0
                    goto L_0x007a
                L_0x009d:
                    r3.addView(r0)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r3 = r2
                    r2.m3063a((android.view.View) r0, (com.applovin.impl.mediation.p028a.C1574b) r3)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r2 = r2
                    r0.m3081b((com.applovin.impl.mediation.p028a.C1574b) r2)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.Object r0 = r0.f2095p
                    monitor-enter(r0)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this     // Catch:{ all -> 0x0132 }
                    com.applovin.impl.mediation.a.b r3 = r2     // Catch:{ all -> 0x0132 }
                    com.applovin.impl.mediation.p028a.C1574b unused = r2.f2096q = r3     // Catch:{ all -> 0x0132 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0132 }
                    boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()
                    if (r0 == 0) goto L_0x00d0
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.v r0 = r0.logger
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.String r2 = r2.tag
                    java.lang.String r3 = "Scheduling impression for ad manually..."
                    r0.mo14789b(r2, r3)
                L_0x00d0:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.sdk.m r0 = r0.sdk
                    com.applovin.impl.mediation.MediationServiceImpl r0 = r0.mo14290E()
                    com.applovin.impl.mediation.a.b r2 = r2
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r3 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.ads.MaxAdViewImpl$a r3 = r3.f2090k
                    r0.processRawAdImpressionPostback(r2, r3)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r0 = r0.f2096q
                    java.lang.String r0 = r0.mo13142f()
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.String r2 = r2.f2087h
                    boolean r0 = r0.equalsIgnoreCase(r2)
                    if (r0 == 0) goto L_0x0123
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.String r0 = r0.f2086g
                    boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r0)
                    if (r0 == 0) goto L_0x0123
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.mediation.MaxAdReviewListener r0 = r0.adReviewListener
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r2 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.String r2 = r2.f2086g
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r3 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    com.applovin.impl.mediation.a.b r3 = r3.f2096q
                    r4 = 1
                    com.applovin.impl.sdk.utils.C2043j.m4936a((com.applovin.mediation.MaxAdReviewListener) r0, (java.lang.String) r2, (com.applovin.mediation.MaxAd) r3, (boolean) r4)
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.String unused = r0.f2087h = r1
                    com.applovin.impl.mediation.ads.MaxAdViewImpl r0 = com.applovin.impl.mediation.ads.MaxAdViewImpl.this
                    java.lang.String unused = r0.f2086g = r1
                L_0x0123:
                    com.applovin.impl.mediation.ads.MaxAdViewImpl$2$1 r0 = new com.applovin.impl.mediation.ads.MaxAdViewImpl$2$1
                    r0.<init>()
                    com.applovin.impl.mediation.a.b r1 = r2
                    long r1 = r1.mo13177x()
                    com.applovin.sdk.AppLovinSdkUtils.runOnUiThreadDelayed(r0, r1)
                    return
                L_0x0132:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0132 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxAdViewImpl.C15832.run():void");
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3065a(C1574b bVar, long j) {
        if (C2092v.m5047a()) {
            this.logger.mo14789b(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.mo14290E().processViewabilityAdImpressionPostback(bVar, j, this.f2090k);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3073a(final C1604a.C1605a aVar) {
        if (!m3087e()) {
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() {
                public void run() {
                    if (MaxAdViewImpl.this.f2096q != null) {
                        long a = MaxAdViewImpl.this.f2093n.mo14810a(MaxAdViewImpl.this.f2096q);
                        MaxAdViewImpl.this.extraParameters.put("visible_ad_ad_unit_id", MaxAdViewImpl.this.f2096q.getAdUnitId());
                        MaxAdViewImpl.this.extraParameters.put("viewability_flags", Long.valueOf(a));
                    } else {
                        MaxAdViewImpl.this.extraParameters.remove("visible_ad_ad_unit_id");
                        MaxAdViewImpl.this.extraParameters.remove("viewability_flags");
                    }
                    int pxToDp = AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.f2081b.getContext(), MaxAdViewImpl.this.f2081b.getWidth());
                    int pxToDp2 = AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.f2081b.getContext(), MaxAdViewImpl.this.f2081b.getHeight());
                    MaxAdViewImpl.this.extraParameters.put("viewport_width", Integer.valueOf(pxToDp));
                    MaxAdViewImpl.this.extraParameters.put("viewport_height", Integer.valueOf(pxToDp2));
                    MaxAdViewImpl.this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(MaxAdViewImpl.this.f2092m.mo14088f() || MaxAdViewImpl.this.f2098s));
                    MaxAdViewImpl.this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(MaxAdViewImpl.this.f2103x));
                    if (C2092v.m5047a()) {
                        C2092v vVar = MaxAdViewImpl.this.logger;
                        String str = MaxAdViewImpl.this.tag;
                        vVar.mo14789b(str, "Loading " + MaxAdViewImpl.this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + MaxAdViewImpl.this.adUnitId + "' and notifying " + aVar + APSSharedUtil.TRUNCATE_SEPARATOR);
                    }
                    MaxAdViewImpl.this.sdk.mo14290E().loadAd(MaxAdViewImpl.this.adUnitId, MaxAdViewImpl.this.f2082c, MaxAdViewImpl.this.adFormat, MaxAdViewImpl.this.localExtraParameters, MaxAdViewImpl.this.extraParameters, MaxAdViewImpl.this.f2080a, aVar);
                }
            });
        } else if (C2092v.m5047a()) {
            C2092v.m5053i(this.tag, "Failed to load new ad - this instance is already destroyed");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3074a(MaxAd maxAd) {
        this.f2100u = false;
        if (this.f2099t) {
            this.f2099t = false;
            if (C2092v.m5047a()) {
                C2092v vVar = this.logger;
                String str = this.tag;
                vVar.mo14789b(str, "Rendering precache request ad: " + maxAd.getAdUnitId() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            this.f2090k.onAdLoaded(maxAd);
            return;
        }
        if (C2092v.m5047a()) {
            this.logger.mo14789b(this.tag, "Saving pre-cache ad...");
        }
        this.f2085f = (C1574b) maxAd;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3075a(MaxError maxError) {
        if (this.sdk.mo14344b(C1856a.f3054o).contains(String.valueOf(maxError.getCode()))) {
            if (C2092v.m5047a()) {
                C2092v A = this.sdk.mo14286A();
                String str = this.tag;
                A.mo14789b(str, "Ignoring banner ad refresh for error code " + maxError.getCode());
            }
        } else if (this.f2098s || this.f2092m.mo14088f()) {
            if (this.f2100u) {
                this.logger.mo14789b(this.tag, "Refresh pre-cache failed when auto-refresh is stopped");
                this.f2100u = false;
            }
            if (this.f2099t) {
                this.logger.mo14789b(this.tag, "Refresh pre-cache failed - calling ad load failed callback for publisher");
                C2043j.m4931a(this.adListener, this.adUnitId, maxError);
            }
        } else {
            this.f2097r = true;
            this.f2100u = false;
            long longValue = ((Long) this.sdk.mo14311a(C1856a.f3053n)).longValue();
            if (longValue >= 0) {
                if (C2092v.m5047a()) {
                    C2092v A2 = this.sdk.mo14286A();
                    String str2 = this.tag;
                    A2.mo14789b(str2, "Scheduling failed banner ad refresh " + longValue + " milliseconds from now for '" + this.adUnitId + "'...");
                }
                this.f2092m.mo14082a(longValue);
            }
        }
    }

    /* renamed from: a */
    private void m3076a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (C2092v.m5047a()) {
                C2092v vVar = this.logger;
                String str3 = this.tag;
                vVar.mo14789b(str3, "Updated allow immediate auto-refresh pause and ad load to: " + str2);
            }
            this.f2102w = Boolean.parseBoolean(str2);
        } else if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (C2092v.m5047a()) {
                C2092v vVar2 = this.logger;
                String str4 = this.tag;
                vVar2.mo14789b(str4, "Updated disable auto-retries to: " + str2);
            }
            this.f2103x = Boolean.parseBoolean(str2);
        } else if ("disable_precache".equalsIgnoreCase(str)) {
            if (C2092v.m5047a()) {
                C2092v vVar3 = this.logger;
                String str5 = this.tag;
                vVar3.mo14789b(str5, "Updated precached disabled to: " + str2);
            }
            this.f2104y = Boolean.parseBoolean(str2);
        } else if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (C2092v.m5047a()) {
                C2092v vVar4 = this.logger;
                String str6 = this.tag;
                vVar4.mo14789b(str6, "Updated should stop auto-refresh on ad expand to: " + str2);
            }
            this.f2105z = Boolean.parseBoolean(str2);
        } else if ("force_precache".equals(str)) {
            if (C2092v.m5047a()) {
                C2092v vVar5 = this.logger;
                String str7 = this.tag;
                vVar5.mo14789b(str7, "Updated force precache to: " + str2);
            }
            this.f2078A = Boolean.parseBoolean(str2);
        } else if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (C2092v.m5047a()) {
                C2092v vVar6 = this.logger;
                String str8 = this.tag;
                vVar6.mo14789b(str8, "Updated is adaptive banner to: " + str2);
            }
            this.f2079B = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* renamed from: b */
    private void m3080b() {
        if (m3086d()) {
            if (C2092v.m5047a()) {
                this.logger.mo14789b(this.tag, "Scheduling refresh precache request now");
            }
            this.f2100u = true;
            this.sdk.mo14303S().mo14206a((C1877a) new C1934z(this.sdk, new Runnable() {
                public void run() {
                    if (C2092v.m5047a()) {
                        MaxAdViewImpl.this.logger.mo14789b(MaxAdViewImpl.this.tag, "Loading ad for pre-cache request...");
                    }
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.m3073a((C1604a.C1605a) maxAdViewImpl.f2091l);
                }
            }), C1645c.m3312a(this.adFormat));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3081b(C1574b bVar) {
        int height = this.f2081b.getHeight();
        int width = this.f2081b.getWidth();
        if (height > 0 || width > 0) {
            int pxToDp = AppLovinSdkUtils.pxToDp(this.f2080a, height);
            int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f2080a, width);
            MaxAdFormat format = bVar.getFormat();
            int height2 = (this.f2079B ? format.getAdaptiveSize(pxToDp2, this.f2080a) : format.getSize()).getHeight();
            int width2 = format.getSize().getWidth();
            if (!C2092v.m5047a()) {
                return;
            }
            if (pxToDp < height2 || pxToDp2 < width2) {
                StringBuilder sb = new StringBuilder();
                sb.append("\n**************************************************\n`MaxAdView` size ");
                sb.append(pxToDp2);
                sb.append("x");
                sb.append(pxToDp);
                sb.append(" dp smaller than required ");
                sb.append(this.f2079B ? "adaptive " : "");
                sb.append("size: ");
                sb.append(width2);
                sb.append("x");
                sb.append(height2);
                sb.append(" dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                this.logger.mo14793e("AppLovinSdk", sb.toString());
            }
        }
    }

    /* renamed from: c */
    private void m3083c() {
        if (C2092v.m5047a()) {
            C2092v vVar = this.logger;
            String str = this.tag;
            vVar.mo14789b(str, "Rendering for cached ad: " + this.f2085f + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.f2090k.onAdLoaded(this.f2085f);
        this.f2085f = null;
    }

    /* renamed from: d */
    private boolean m3086d() {
        if (this.f2104y) {
            return false;
        }
        return ((Boolean) this.sdk.mo14311a(C1856a.f3065z)).booleanValue();
    }

    /* renamed from: e */
    private boolean m3087e() {
        boolean z;
        synchronized (this.f2095p) {
            z = this.f2101v;
        }
        return z;
    }

    public void destroy() {
        m3061a();
        if (this.f2085f != null) {
            this.sdk.mo14290E().destroyAd(this.f2085f);
        }
        synchronized (this.f2095p) {
            this.f2101v = true;
        }
        this.f2092m.mo14085c();
        this.sdk.mo14287B().mo14138b((C1873e.C1876a) this);
        super.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f2088i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bb, code lost:
        if (com.applovin.impl.sdk.C2092v.m5047a() != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c2, code lost:
        if (com.applovin.impl.sdk.C2092v.m5047a() != false) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadAd() {
        /*
            r5 = this;
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r0 == 0) goto L_0x002d
            com.applovin.impl.sdk.v r0 = r5.logger
            java.lang.String r1 = r5.tag
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ""
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = " Loading ad for "
            r2.append(r3)
            java.lang.String r3 = r5.adUnitId
            r2.append(r3)
            java.lang.String r3 = "..."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.mo14789b(r1, r2)
        L_0x002d:
            boolean r0 = r5.f2102w
            r1 = 1
            if (r0 != 0) goto L_0x0045
            com.applovin.impl.sdk.m r0 = r5.sdk
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.p048c.C1856a.f3060u
            java.lang.Object r0 = r0.mo14311a(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r0 = 0
            goto L_0x0046
        L_0x0045:
            r0 = r1
        L_0x0046:
            if (r0 == 0) goto L_0x0086
            com.applovin.impl.sdk.d r2 = r5.f2092m
            boolean r2 = r2.mo14088f()
            if (r2 != 0) goto L_0x0086
            com.applovin.impl.sdk.d r2 = r5.f2092m
            boolean r2 = r2.mo14083a()
            if (r2 == 0) goto L_0x0086
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = r5.tag
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load a new ad. An ad refresh has already been scheduled in "
            r1.append(r2)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.applovin.impl.sdk.d r3 = r5.f2092m
            long r3 = r3.mo14084b()
            long r2 = r2.toSeconds(r3)
            r1.append(r2)
            java.lang.String r2 = " seconds."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.applovin.impl.sdk.C2092v.m5053i(r0, r1)
        L_0x0085:
            return
        L_0x0086:
            java.lang.String r2 = "Loading ad..."
            if (r0 == 0) goto L_0x00be
            com.applovin.impl.mediation.a.b r0 = r5.f2085f
            if (r0 == 0) goto L_0x00a1
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r0 == 0) goto L_0x009d
            com.applovin.impl.sdk.v r0 = r5.logger
            java.lang.String r1 = r5.tag
            java.lang.String r2 = "Rendering cached ad"
            r0.mo14789b(r1, r2)
        L_0x009d:
            r5.m3083c()
            goto L_0x00d0
        L_0x00a1:
            boolean r0 = r5.f2100u
            if (r0 == 0) goto L_0x00b7
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r0 == 0) goto L_0x00b4
            com.applovin.impl.sdk.v r0 = r5.logger
            java.lang.String r2 = r5.tag
            java.lang.String r3 = "Waiting for precache ad to load to render"
            r0.mo14789b(r2, r3)
        L_0x00b4:
            r5.f2099t = r1
            goto L_0x00d0
        L_0x00b7:
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r0 == 0) goto L_0x00cb
            goto L_0x00c4
        L_0x00be:
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r0 == 0) goto L_0x00cb
        L_0x00c4:
            com.applovin.impl.sdk.v r0 = r5.logger
            java.lang.String r1 = r5.tag
            r0.mo14789b(r1, r2)
        L_0x00cb:
            com.applovin.impl.mediation.ads.MaxAdViewImpl$a r0 = r5.f2090k
            r5.m3073a((com.applovin.impl.mediation.ads.C1604a.C1605a) r0)
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxAdViewImpl.loadAd():void");
    }

    public void onAdRefresh() {
        String str;
        String str2;
        C2092v vVar;
        this.f2099t = false;
        if (this.f2085f != null) {
            m3083c();
            return;
        }
        if (!m3086d()) {
            if (C2092v.m5047a()) {
                vVar = this.logger;
                str2 = this.tag;
                str = "Refreshing ad from network...";
            }
            loadAd();
        } else if (this.f2097r) {
            if (C2092v.m5047a()) {
                vVar = this.logger;
                str2 = this.tag;
                str = "Refreshing ad from network due to viewability requirements not met for refresh request...";
            }
            loadAd();
        } else {
            if (C2092v.m5047a()) {
                this.logger.mo14793e(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f2099t = true;
            return;
        }
        vVar.mo14789b(str2, str);
        loadAd();
    }

    public void onCreativeIdGenerated(String str, String str2) {
        C1574b bVar = this.f2096q;
        if (bVar == null || !bVar.mo13142f().equalsIgnoreCase(str)) {
            C1574b bVar2 = this.f2085f;
            if (bVar2 != null && bVar2.mo13142f().equalsIgnoreCase(str)) {
                this.f2087h = str;
                this.f2086g = str2;
                return;
            }
            return;
        }
        C2043j.m4935a(this.adReviewListener, str2, (MaxAd) this.f2096q);
    }

    public void onLogVisibilityImpression() {
        m3065a(this.f2096q, this.f2093n.mo14810a(this.f2096q));
    }

    public void onWindowVisibilityChanged(int i) {
        if (((Boolean) this.sdk.mo14311a(C1856a.f3058s)).booleanValue() && this.f2092m.mo14083a()) {
            if (C2085q.m5019a(i)) {
                if (C2092v.m5047a()) {
                    this.logger.mo14789b(this.tag, "Ad view visible");
                }
                this.f2092m.mo14090h();
                return;
            }
            if (C2092v.m5047a()) {
                this.logger.mo14789b(this.tag, "Ad view hidden");
            }
            this.f2092m.mo14089g();
        }
    }

    public void setCustomData(String str) {
        if (this.f2096q != null) {
            String str2 = this.tag;
            C2092v.m5053i(str2, "Custom data for Ad Unit ID (" + this.adUnitId + ") was set after load was called. For the ads to be correctly attributed to this custom data, please set the custom data before loading the " + this.adFormat.getLabel() + ".");
        }
        Utils.maybeLogCustomDataSizeLimit(str, this.tag);
        this.f2089j = str;
    }

    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        m3076a(str, str2);
    }

    public void setPlacement(String str) {
        if (C2092v.m5047a() && this.f2096q != null) {
            String str2 = this.tag;
            C2092v.m5053i(str2, "Placement for Ad Unit ID (" + this.adUnitId + ") was set after load was called. For the ads to be correctly attributed to this placement, please set the placement before loading the " + this.adFormat.getLabel() + ".");
        }
        this.f2088i = str;
    }

    public void setPublisherBackgroundColor(int i) {
        this.f2084e = (long) i;
    }

    public void startAutoRefresh() {
        String str;
        String str2;
        C2092v vVar;
        this.f2098s = false;
        if (this.f2092m.mo14088f()) {
            this.f2092m.mo14087e();
            if (C2092v.m5047a()) {
                vVar = this.logger;
                str2 = this.tag;
                str = "Resumed auto-refresh with remaining time: " + this.f2092m.mo14084b() + "ms";
            } else {
                return;
            }
        } else if (C2092v.m5047a()) {
            vVar = this.logger;
            str2 = this.tag;
            str = "Ignoring call to startAutoRefresh() - ad refresh is not paused";
        } else {
            return;
        }
        vVar.mo14789b(str2, str);
    }

    public void stopAutoRefresh() {
        if (this.f2096q != null) {
            if (C2092v.m5047a()) {
                C2092v vVar = this.logger;
                String str = this.tag;
                vVar.mo14789b(str, "Pausing auto-refresh with remaining time: " + this.f2092m.mo14084b() + "ms");
            }
            this.f2092m.mo14086d();
        } else if (this.f2102w || ((Boolean) this.sdk.mo14311a(C1856a.f3060u)).booleanValue()) {
            this.f2098s = true;
        } else if (C2092v.m5047a()) {
            C2092v.m5052h(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MaxAdView{adUnitId='");
        sb.append(this.adUnitId);
        sb.append('\'');
        sb.append(", adListener=");
        sb.append(this.adListener == this.f2081b ? "this" : this.adListener);
        sb.append(", isDestroyed=");
        sb.append(m3087e());
        sb.append('}');
        return sb.toString();
    }
}
