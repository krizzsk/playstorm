package com.applovin.impl.adview.activity.p027b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.C1513d;
import com.applovin.impl.adview.C1525i;
import com.applovin.impl.adview.C1540m;
import com.applovin.impl.adview.C1541n;
import com.applovin.impl.adview.activity.C1439b;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1940h;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p047b.C1846b;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p049d.C1869d;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.p050e.C1927v;
import com.applovin.impl.sdk.p050e.C1934z;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.C2032a;
import com.applovin.impl.sdk.utils.C2043j;
import com.applovin.impl.sdk.utils.C2082o;
import com.applovin.impl.sdk.utils.C2085q;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.a */
public abstract class C1440a implements C1846b.C1853a {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f1678A = 0;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final ArrayList<Long> f1679B = new ArrayList<>();

    /* renamed from: a */
    protected final C1829e f1680a;

    /* renamed from: b */
    protected final C1959m f1681b;

    /* renamed from: c */
    protected final C2092v f1682c;

    /* renamed from: d */
    protected final C1869d f1683d;

    /* renamed from: e */
    protected Activity f1684e;

    /* renamed from: f */
    protected AppLovinAdView f1685f;

    /* renamed from: g */
    protected final C1540m f1686g;

    /* renamed from: h */
    protected final long f1687h = SystemClock.elapsedRealtime();

    /* renamed from: i */
    protected long f1688i = -1;

    /* renamed from: j */
    protected int f1689j = 0;

    /* renamed from: k */
    protected int f1690k = 0;

    /* renamed from: l */
    protected int f1691l = C1940h.f3603a;

    /* renamed from: m */
    protected boolean f1692m;

    /* renamed from: n */
    protected AppLovinAdClickListener f1693n;

    /* renamed from: o */
    protected AppLovinAdDisplayListener f1694o;

    /* renamed from: p */
    protected AppLovinAdVideoPlaybackListener f1695p;

    /* renamed from: q */
    protected final C1846b f1696q;

    /* renamed from: r */
    protected C2082o f1697r;

    /* renamed from: s */
    private final Handler f1698s = new Handler(Looper.getMainLooper());

    /* renamed from: t */
    private final C2032a f1699t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final AppLovinBroadcastManager.Receiver f1700u;

    /* renamed from: v */
    private final C1940h.C1942a f1701v;

    /* renamed from: w */
    private final AtomicBoolean f1702w = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final AtomicBoolean f1703x = new AtomicBoolean();

    /* renamed from: y */
    private long f1704y;

    /* renamed from: z */
    private boolean f1705z;

    /* renamed from: com.applovin.impl.adview.activity.b.a$a */
    public interface C1452a {
        /* renamed from: a */
        void mo12566a(C1440a aVar);

        /* renamed from: a */
        void mo12567a(String str, Throwable th);
    }

    /* renamed from: com.applovin.impl.adview.activity.b.a$b */
    private class C1453b implements View.OnClickListener, AppLovinAdClickListener {
        private C1453b() {
        }

        public void adClicked(AppLovinAd appLovinAd) {
            if (C2092v.m5047a()) {
                C1440a.this.f1682c.mo14789b("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            C2043j.m4940a(C1440a.this.f1693n, appLovinAd);
            C1440a.this.f1683d.mo14104b();
            C1440a.this.f1690k++;
        }

        public void onClick(View view) {
            if (view == C1440a.this.f1686g && ((Boolean) C1440a.this.f1681b.mo14311a(C1857b.f3215cn)).booleanValue()) {
                C1440a.m2494c(C1440a.this);
                if (C1440a.this.f1680a.mo13959V()) {
                    C1440a aVar = C1440a.this;
                    aVar.mo12769b("javascript:al_onCloseButtonTapped(" + C1440a.this.f1678A + "," + C1440a.this.f1689j + "," + C1440a.this.f1690k + ");");
                }
                List<Integer> t = C1440a.this.f1680a.mo14013t();
                if (C2092v.m5047a()) {
                    C2092v vVar = C1440a.this.f1682c;
                    vVar.mo14789b("AppLovinFullscreenActivity", "Handling close button tap " + C1440a.this.f1678A + " with multi close delay: " + t);
                }
                if (t == null || t.size() <= C1440a.this.f1678A) {
                    C1440a.this.mo12776h();
                    return;
                }
                C1440a.this.f1679B.add(Long.valueOf(SystemClock.elapsedRealtime() - C1440a.this.f1688i));
                List<C1525i.C1526a> v = C1440a.this.f1680a.mo14015v();
                if (v != null && v.size() > C1440a.this.f1678A) {
                    C1440a.this.f1686g.mo12987a(v.get(C1440a.this.f1678A));
                }
                if (C2092v.m5047a()) {
                    C2092v vVar2 = C1440a.this.f1682c;
                    vVar2.mo14789b("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + t.get(C1440a.this.f1678A));
                }
                C1440a.this.f1686g.setVisibility(8);
                C1440a aVar2 = C1440a.this;
                aVar2.mo12762a(aVar2.f1686g, (long) t.get(C1440a.this.f1678A).intValue(), new Runnable() {
                    public void run() {
                        C1440a.this.f1688i = SystemClock.elapsedRealtime();
                    }
                });
            } else if (C2092v.m5047a()) {
                C2092v vVar3 = C1440a.this.f1682c;
                vVar3.mo14793e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    C1440a(final C1829e eVar, Activity activity, final C1959m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f1680a = eVar;
        this.f1681b = mVar;
        this.f1682c = mVar.mo14286A();
        this.f1684e = activity;
        this.f1693n = appLovinAdClickListener;
        this.f1694o = appLovinAdDisplayListener;
        this.f1695p = appLovinAdVideoPlaybackListener;
        C1846b bVar = new C1846b(activity, mVar);
        this.f1696q = bVar;
        bVar.mo14040a((C1846b.C1853a) this);
        this.f1683d = new C1869d(eVar, mVar);
        C1453b bVar2 = new C1453b();
        C1541n nVar = new C1541n(mVar.mo14309Y(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f1685f = nVar;
        nVar.setAdClickListener(bVar2);
        this.f1685f.setAdDisplayListener(new AppLovinAdDisplayListener() {
            public void adDisplayed(AppLovinAd appLovinAd) {
                if (C2092v.m5047a()) {
                    C1440a.this.f1682c.mo14789b("AppLovinFullscreenActivity", "Web content rendered");
                }
            }

            public void adHidden(AppLovinAd appLovinAd) {
                if (C2092v.m5047a()) {
                    C1440a.this.f1682c.mo14789b("AppLovinFullscreenActivity", "Closing from WebView");
                }
                C1440a.this.mo12776h();
            }
        });
        this.f1685f.getController().mo12881a(this.f1683d);
        mVar.mo14369u().trackImpression(eVar);
        List<Integer> t = eVar.mo14013t();
        if (eVar.mo14012s() >= 0 || t != null) {
            C1540m mVar2 = new C1540m(eVar.mo14014u(), activity);
            this.f1686g = mVar2;
            mVar2.setVisibility(8);
            this.f1686g.setOnClickListener(bVar2);
        } else {
            this.f1686g = null;
        }
        if (((Boolean) mVar.mo14311a(C1857b.f3217cp)).booleanValue()) {
            this.f1700u = new AppLovinBroadcastManager.Receiver() {
                public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                    mVar.mo14369u().trackAppKilled(eVar);
                    mVar.mo14337aj().unregisterReceiver(this);
                }
            };
        } else {
            this.f1700u = null;
        }
        if (eVar.mo13992al()) {
            this.f1701v = new C1940h.C1942a() {
                /* renamed from: a */
                public void mo12791a(int i) {
                    String str;
                    if (C1440a.this.f1691l != C1940h.f3603a) {
                        C1440a.this.f1692m = true;
                    }
                    C1513d s = C1440a.this.f1685f.getController().mo12906s();
                    if (!C1940h.m4342a(i) || C1940h.m4342a(C1440a.this.f1691l)) {
                        if (i == 2) {
                            str = "javascript:al_muteSwitchOff();";
                        }
                        C1440a.this.f1691l = i;
                    }
                    str = "javascript:al_muteSwitchOn();";
                    s.mo12927a(str);
                    C1440a.this.f1691l = i;
                }
            };
        } else {
            this.f1701v = null;
        }
        if (((Boolean) mVar.mo14311a(C1857b.f3282eC)).booleanValue()) {
            this.f1699t = new C2032a() {
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    if (!C1440a.this.f1703x.get()) {
                        if (activity.getClass().getName().equals(Utils.retrieveLauncherActivityFullyQualifiedName(activity.getApplicationContext()))) {
                            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                                public void run() {
                                    C2092v.m5053i("AppLovinFullscreenActivity", "Dismissing on-screen ad due to app relaunched via launcher.");
                                    try {
                                        C1440a.this.mo12776h();
                                    } catch (Throwable unused) {
                                    }
                                }
                            });
                        }
                    }
                }
            };
        } else {
            this.f1699t = null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.applovin.impl.adview.activity.b.a] */
    /* JADX WARNING: type inference failed for: r1v27, types: [com.applovin.impl.adview.activity.b.b] */
    /* JADX WARNING: type inference failed for: r1v28, types: [com.applovin.impl.adview.activity.b.f] */
    /* JADX WARNING: type inference failed for: r1v29, types: [com.applovin.impl.adview.activity.b.f] */
    /* JADX WARNING: type inference failed for: r1v30, types: [com.applovin.impl.adview.activity.b.e] */
    /* JADX WARNING: type inference failed for: r1v31, types: [com.applovin.impl.adview.activity.b.g] */
    /* JADX WARNING: type inference failed for: r1v32, types: [com.applovin.impl.adview.activity.b.d] */
    /* JADX WARNING: type inference failed for: r1v33, types: [com.applovin.impl.adview.activity.b.d] */
    /* JADX WARNING: type inference failed for: r1v34, types: [com.applovin.impl.adview.activity.b.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2492a(com.applovin.impl.sdk.p046ad.C1829e r16, com.applovin.sdk.AppLovinAdClickListener r17, com.applovin.sdk.AppLovinAdDisplayListener r18, com.applovin.sdk.AppLovinAdVideoPlaybackListener r19, com.applovin.impl.sdk.C1959m r20, android.app.Activity r21, com.applovin.impl.adview.activity.p027b.C1440a.C1452a r22) {
        /*
            r8 = r20
            r9 = r22
            boolean r0 = r16.mo13976aH()
            r1 = 0
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x0016
            boolean r0 = com.applovin.impl.sdk.utils.Utils.checkExoPlayerEligibility(r20)
            if (r0 == 0) goto L_0x0016
            r1 = 1
        L_0x0016:
            r11 = r16
            boolean r0 = r11 instanceof com.applovin.impl.p025a.C1401a
            java.lang.String r12 = "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter."
            java.lang.String r13 = "AppLovinFullscreenActivity"
            java.lang.String r14 = " and throwable: "
            if (r0 == 0) goto L_0x00ae
            java.lang.String r15 = "Failed to create FullscreenVastVideoAdPresenter with sdk: "
            if (r1 == 0) goto L_0x007c
            com.applovin.impl.adview.activity.b.c r0 = new com.applovin.impl.adview.activity.b.c     // Catch:{ all -> 0x003a }
            r1 = r0
            r2 = r16
            r3 = r21
            r4 = r20
            r5 = r17
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x003a }
            goto L_0x018c
        L_0x003a:
            r0 = move-exception
            boolean r1 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r1 == 0) goto L_0x0048
            com.applovin.impl.sdk.v r1 = r20.mo14286A()
            r1.mo14788a((java.lang.String) r13, (java.lang.String) r12, (java.lang.Throwable) r0)
        L_0x0048:
            com.applovin.impl.sdk.utils.Utils.isExoPlayerEligible = r10
            com.applovin.impl.adview.activity.b.d r0 = new com.applovin.impl.adview.activity.b.d     // Catch:{ all -> 0x005e }
            r1 = r0
            r2 = r16
            r3 = r21
            r4 = r20
            r5 = r17
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x005e }
            goto L_0x018c
        L_0x005e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r8)
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.mo12567a(r1, r0)
            return
        L_0x007c:
            com.applovin.impl.adview.activity.b.d r0 = new com.applovin.impl.adview.activity.b.d     // Catch:{ all -> 0x0090 }
            r1 = r0
            r2 = r16
            r3 = r21
            r4 = r20
            r5 = r17
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0090 }
            goto L_0x018c
        L_0x0090:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r8)
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.mo12567a(r1, r0)
            return
        L_0x00ae:
            boolean r0 = r16.hasVideoUrl()
            if (r0 == 0) goto L_0x017a
            boolean r0 = r16.mo13979aK()
            if (r0 == 0) goto L_0x00ee
            com.applovin.impl.adview.activity.b.g r0 = new com.applovin.impl.adview.activity.b.g     // Catch:{ all -> 0x00ce }
            r1 = r0
            r2 = r16
            r3 = r21
            r4 = r20
            r5 = r17
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00ce }
            goto L_0x018c
        L_0x00ce:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenWebVideoAdPresenter with sdk: "
            r1.append(r2)
            r1.append(r8)
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.mo12567a(r1, r0)
            return
        L_0x00ee:
            if (r1 == 0) goto L_0x0147
            com.applovin.impl.adview.activity.b.e r0 = new com.applovin.impl.adview.activity.b.e     // Catch:{ all -> 0x0104 }
            r1 = r0
            r2 = r16
            r3 = r21
            r4 = r20
            r5 = r17
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0104 }
            goto L_0x018c
        L_0x0104:
            r0 = move-exception
            boolean r1 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r1 == 0) goto L_0x0112
            com.applovin.impl.sdk.v r1 = r20.mo14286A()
            r1.mo14788a((java.lang.String) r13, (java.lang.String) r12, (java.lang.Throwable) r0)
        L_0x0112:
            com.applovin.impl.sdk.utils.Utils.isExoPlayerEligible = r10
            com.applovin.impl.adview.activity.b.f r0 = new com.applovin.impl.adview.activity.b.f     // Catch:{ all -> 0x0127 }
            r1 = r0
            r2 = r16
            r3 = r21
            r4 = r20
            r5 = r17
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0127 }
            goto L_0x018c
        L_0x0127:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenVideoAdExoPlayerPresenter with sdk: "
            r1.append(r2)
            r1.append(r8)
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.mo12567a(r1, r0)
            return
        L_0x0147:
            com.applovin.impl.adview.activity.b.f r0 = new com.applovin.impl.adview.activity.b.f     // Catch:{ all -> 0x015a }
            r1 = r0
            r2 = r16
            r3 = r21
            r4 = r20
            r5 = r17
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x015a }
            goto L_0x018c
        L_0x015a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenVideoAdPresenter with sdk: "
            r1.append(r2)
            r1.append(r8)
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.mo12567a(r1, r0)
            return
        L_0x017a:
            com.applovin.impl.adview.activity.b.b r0 = new com.applovin.impl.adview.activity.b.b     // Catch:{ all -> 0x0193 }
            r1 = r0
            r2 = r16
            r3 = r21
            r4 = r20
            r5 = r17
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0193 }
        L_0x018c:
            r0.mo12808c()
            r9.mo12566a(r0)
            return
        L_0x0193:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create FullscreenGraphicAdPresenter with sdk: "
            r1.append(r2)
            r1.append(r8)
            r1.append(r14)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.mo12567a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.activity.p027b.C1440a.m2492a(com.applovin.impl.sdk.ad.e, com.applovin.sdk.AppLovinAdClickListener, com.applovin.sdk.AppLovinAdDisplayListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener, com.applovin.impl.sdk.m, android.app.Activity, com.applovin.impl.adview.activity.b.a$a):void");
    }

    /* renamed from: c */
    static /* synthetic */ int m2494c(C1440a aVar) {
        int i = aVar.f1678A;
        aVar.f1678A = i + 1;
        return i;
    }

    /* renamed from: c */
    private void mo12808c() {
        if (this.f1700u != null) {
            this.f1681b.mo14337aj().registerReceiver(this.f1700u, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
        if (this.f1701v != null) {
            this.f1681b.mo14336ai().mo14252a(this.f1701v);
        }
        if (this.f1699t != null) {
            this.f1681b.mo14333af().mo13823a(this.f1699t);
        }
    }

    /* renamed from: a */
    public void mo12757a(int i, KeyEvent keyEvent) {
        if (this.f1682c != null && C2092v.m5047a()) {
            C2092v vVar = this.f1682c;
            vVar.mo14791c("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i + ", " + keyEvent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12758a(int i, boolean z, boolean z2, long j) {
        int i2 = i;
        if (this.f1702w.compareAndSet(false, true)) {
            if (this.f1680a.hasVideoUrl() || mo12788t()) {
                C2043j.m4946a(this.f1695p, (AppLovinAd) this.f1680a, (double) i2, z2);
            }
            if (this.f1680a.hasVideoUrl()) {
                this.f1683d.mo14107c((long) i2);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f1687h;
            this.f1681b.mo14369u().trackVideoEnd(this.f1680a, TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime), i, z);
            long j2 = -1;
            if (this.f1688i != -1) {
                j2 = SystemClock.elapsedRealtime() - this.f1688i;
            }
            this.f1681b.mo14369u().trackFullScreenAdClosed(this.f1680a, j2, this.f1679B, j, this.f1692m, this.f1691l);
            if (C2092v.m5047a()) {
                C2092v vVar = this.f1682c;
                vVar.mo14789b("AppLovinFullscreenActivity", "Video ad ended at percent: " + i2 + "%, elapsedTime: " + elapsedRealtime + "ms, skipTimeMillis: " + j + "ms, closeTimeMillis: " + j2 + "ms");
            }
        }
    }

    /* renamed from: a */
    public abstract void mo12759a(long j);

    /* renamed from: a */
    public void mo12760a(Configuration configuration) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.f1682c;
            vVar.mo14791c("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    /* renamed from: a */
    public abstract void mo12761a(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12762a(final C1540m mVar, long j, final Runnable runnable) {
        if (j < ((Long) this.f1681b.mo14311a(C1857b.f3214cm)).longValue()) {
            this.f1681b.mo14303S().mo14208a(new C1934z(this.f1681b, new Runnable() {
                public void run() {
                    AppLovinSdkUtils.runOnUiThread(new Runnable() {
                        public void run() {
                            C2085q.m5018a((View) mVar, 400, (Runnable) new Runnable() {
                                public void run() {
                                    mVar.bringToFront();
                                    runnable.run();
                                }
                            });
                        }
                    });
                }
            }), C1908o.C1910a.MAIN, TimeUnit.SECONDS.toMillis(j), true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12763a(Runnable runnable, long j) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j, this.f1698s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12764a(String str) {
        if (this.f1680a.mo13960W()) {
            mo12765a(str, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12765a(final String str, long j) {
        if (j >= 0) {
            mo12763a((Runnable) new Runnable() {
                public void run() {
                    C1513d s;
                    if (StringUtils.isValidString(str) && C1440a.this.f1685f != null && (s = C1440a.this.f1685f.getController().mo12906s()) != null) {
                        s.mo12927a(str);
                    }
                }
            }, j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12766a(boolean z) {
        List<Uri> checkCachedResourcesExist = Utils.checkCachedResourcesExist(z, this.f1680a, this.f1681b, this.f1684e);
        if (checkCachedResourcesExist.isEmpty()) {
            return;
        }
        if (!((Boolean) this.f1681b.mo14311a(C1857b.f3286eG)).booleanValue()) {
            this.f1680a.mo12611a();
            return;
        }
        throw new IllegalStateException("Missing cached resource(s): " + checkCachedResourcesExist);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12767a(boolean z, long j) {
        if (this.f1680a.mo13958U()) {
            mo12765a(z ? "javascript:al_mute();" : "javascript:al_unmute();", j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12768b(long j) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.f1682c;
            vVar.mo14789b("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds...");
        }
        this.f1697r = C2082o.m5001a(j, this.f1681b, new Runnable() {
            public void run() {
                if (!C1440a.this.f1680a.mo13987ag().getAndSet(true)) {
                    C1440a.this.f1681b.mo14303S().mo14206a((C1877a) new C1927v(C1440a.this.f1680a, C1440a.this.f1681b), C1908o.C1910a.REWARD);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12769b(String str) {
        mo12765a(str, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12770b(boolean z) {
        mo12767a(z, ((Long) this.f1681b.mo14311a(C1857b.f3178cC)).longValue());
        C2043j.m4941a(this.f1694o, (AppLovinAd) this.f1680a);
        this.f1681b.mo14332ae().mo14643a((Object) this.f1680a);
        this.f1681b.mo14338ak().mo14381a((Object) this.f1680a);
        if (this.f1680a.hasVideoUrl() || mo12788t()) {
            C2043j.m4945a(this.f1695p, (AppLovinAd) this.f1680a);
        }
        new C1439b(this.f1684e).mo12756a(this.f1680a);
        this.f1683d.mo14102a();
        this.f1680a.setHasShown(true);
    }

    /* renamed from: c */
    public void mo12771c(boolean z) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.f1682c;
            vVar.mo14791c("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z);
        }
        mo12764a("javascript:al_onWindowFocusChanged( " + z + " );");
    }

    /* renamed from: d */
    public abstract void mo12772d();

    /* renamed from: e */
    public abstract void mo12773e();

    /* renamed from: f */
    public void mo12774f() {
        if (C2092v.m5047a()) {
            this.f1682c.mo14791c("AppLovinFullscreenActivity", "onResume()");
        }
        this.f1683d.mo14109d(SystemClock.elapsedRealtime() - this.f1704y);
        mo12764a("javascript:al_onAppResumed();");
        mo12785q();
        if (this.f1696q.mo14042c()) {
            this.f1696q.mo14038a();
        }
    }

    /* renamed from: g */
    public void mo12775g() {
        if (C2092v.m5047a()) {
            this.f1682c.mo14791c("AppLovinFullscreenActivity", "onPause()");
        }
        this.f1704y = SystemClock.elapsedRealtime();
        mo12764a("javascript:al_onAppPaused();");
        if (this.f1696q.mo14042c()) {
            this.f1696q.mo14038a();
        }
        mo12784p();
    }

    /* renamed from: h */
    public void mo12776h() {
        this.f1705z = true;
        if (C2092v.m5047a()) {
            this.f1682c.mo14791c("AppLovinFullscreenActivity", "dismiss()");
        }
        C1829e eVar = this.f1680a;
        if (eVar != null) {
            eVar.mo12640o().mo13847e();
        }
        this.f1698s.removeCallbacksAndMessages((Object) null);
        mo12765a("javascript:al_onPoststitialDismiss();", (long) this.f1680a.mo13957T());
        mo12782n();
        this.f1683d.mo14106c();
        if (this.f1700u != null) {
            C2082o.m5001a(TimeUnit.SECONDS.toMillis(2), this.f1681b, new Runnable() {
                public void run() {
                    C1440a.this.f1684e.stopService(new Intent(C1440a.this.f1684e.getApplicationContext(), AppKilledService.class));
                    C1440a.this.f1681b.mo14337aj().unregisterReceiver(C1440a.this.f1700u);
                }
            });
        }
        if (this.f1701v != null) {
            this.f1681b.mo14336ai().mo14253b(this.f1701v);
        }
        if (this.f1699t != null) {
            this.f1681b.mo14333af().mo13825b(this.f1699t);
        }
        if (mo12783o()) {
            this.f1684e.finish();
            return;
        }
        if (C2092v.m5047a()) {
            this.f1681b.mo14286A().mo14789b("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        mo12779k();
    }

    /* renamed from: i */
    public boolean mo12777i() {
        return this.f1705z;
    }

    /* renamed from: j */
    public void mo12778j() {
        if (C2092v.m5047a()) {
            this.f1682c.mo14791c("AppLovinFullscreenActivity", "onStop()");
        }
    }

    /* renamed from: k */
    public void mo12779k() {
        AppLovinAdView appLovinAdView = this.f1685f;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f1685f.destroy();
            this.f1685f = null;
            if ((parent instanceof ViewGroup) && mo12783o()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        mo12781m();
        mo12782n();
        this.f1693n = null;
        this.f1694o = null;
        this.f1695p = null;
        this.f1684e = null;
    }

    /* renamed from: l */
    public void mo12780l() {
        if (C2092v.m5047a()) {
            this.f1682c.mo14791c("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.f1680a.mo13959V()) {
            mo12769b("javascript:onBackPressed();");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo12781m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo12782n() {
        if (this.f1703x.compareAndSet(false, true)) {
            C2043j.m4953b(this.f1694o, (AppLovinAd) this.f1680a);
            this.f1681b.mo14332ae().mo14646b((Object) this.f1680a);
            this.f1681b.mo14338ak().mo14380a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo12783o() {
        return this.f1684e instanceof AppLovinFullscreenActivity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo12784p() {
        C2082o oVar = this.f1697r;
        if (oVar != null) {
            oVar.mo14751b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo12785q() {
        C2082o oVar = this.f1697r;
        if (oVar != null) {
            oVar.mo14752c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract boolean mo12786r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract boolean mo12787s();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo12788t() {
        return AppLovinAdType.INCENTIVIZED == this.f1680a.getType() || AppLovinAdType.AUTO_INCENTIVIZED == this.f1680a.getType();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract void mo12789u();
}
