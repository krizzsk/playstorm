package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.C1607b;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.C1604a;
import com.applovin.impl.mediation.p028a.C1573a;
import com.applovin.impl.mediation.p028a.C1575c;
import com.applovin.impl.sdk.C1837b;
import com.applovin.impl.sdk.C1873e;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p048c.C1856a;
import com.applovin.impl.sdk.utils.C2040h;
import com.applovin.impl.sdk.utils.C2043j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class MaxFullscreenAdImpl extends C1604a implements C1837b.C1839a, C1873e.C1876a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1593a f2116a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1837b f2117b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1607b f2118c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f2119d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1575c f2120e = null;

    /* renamed from: f */
    private C1600c f2121f = C1600c.IDLE;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final AtomicBoolean f2122g = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f2123h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f2124i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public WeakReference<Activity> f2125j = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public WeakReference<ViewGroup> f2126k = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public WeakReference<Lifecycle> f2127l = new WeakReference<>((Object) null);
    protected final C1594b listenerWrapper;

    /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$a */
    public interface C1593a {
        Activity getActivity();
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b */
    private class C1594b implements C1604a.C1605a, MaxAdListener, MaxAdRevenueListener, MaxRewardedAdListener {
        private C1594b() {
        }

        public void onAdClicked(MaxAd maxAd) {
            C2043j.m4960d(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            final boolean e = MaxFullscreenAdImpl.this.f2124i;
            boolean unused = MaxFullscreenAdImpl.this.f2124i = false;
            final C1575c cVar = (C1575c) maxAd;
            final MaxAd maxAd2 = maxAd;
            final MaxError maxError2 = maxError;
            MaxFullscreenAdImpl.this.m3109a(C1600c.IDLE, (Runnable) new Runnable() {
                public void run() {
                    MaxFullscreenAdImpl.this.m3114a(maxAd2);
                    if (e || !cVar.mo13181B() || !MaxFullscreenAdImpl.this.sdk.mo14294I().mo13382a(MaxFullscreenAdImpl.this.adUnitId)) {
                        C2043j.m4927a(MaxFullscreenAdImpl.this.adListener, maxAd2, maxError2, true);
                    } else {
                        AppLovinSdkUtils.runOnUiThread(true, new Runnable() {
                            public void run() {
                                boolean unused = MaxFullscreenAdImpl.this.f2124i = true;
                                MaxFullscreenAdImpl.this.loadAd(MaxFullscreenAdImpl.this.f2116a.getActivity());
                            }
                        });
                    }
                }
            });
        }

        public void onAdDisplayed(MaxAd maxAd) {
            boolean unused = MaxFullscreenAdImpl.this.f2124i = false;
            MaxFullscreenAdImpl.this.f2117b.mo14024a();
            C2043j.m4952b(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onAdHidden(final MaxAd maxAd) {
            boolean unused = MaxFullscreenAdImpl.this.f2124i = false;
            MaxFullscreenAdImpl.this.f2118c.mo13309a(maxAd);
            MaxFullscreenAdImpl.this.m3109a(C1600c.IDLE, (Runnable) new Runnable() {
                public void run() {
                    MaxFullscreenAdImpl.this.m3114a(maxAd);
                    C2043j.m4957c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                }
            });
        }

        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.m3120b();
            MaxFullscreenAdImpl.this.m3109a(C1600c.IDLE, (Runnable) new Runnable() {
                public void run() {
                    C2043j.m4932a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
                }
            });
        }

        public void onAdLoaded(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.m3108a((C1575c) maxAd);
            if (MaxFullscreenAdImpl.this.f2122g.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            } else {
                MaxFullscreenAdImpl.this.m3109a(C1600c.READY, (Runnable) new Runnable() {
                    public void run() {
                        if (MaxFullscreenAdImpl.this.f2124i) {
                            Activity activity = (Activity) MaxFullscreenAdImpl.this.f2125j.get();
                            if (activity == null) {
                                activity = MaxFullscreenAdImpl.this.sdk.mo14341an();
                            }
                            Activity activity2 = activity;
                            if (MaxFullscreenAdImpl.this.f2123h) {
                                MaxFullscreenAdImpl.this.showAd(MaxFullscreenAdImpl.this.f2120e.getPlacement(), MaxFullscreenAdImpl.this.f2120e.mo13222Z(), (ViewGroup) MaxFullscreenAdImpl.this.f2126k.get(), (Lifecycle) MaxFullscreenAdImpl.this.f2127l.get(), activity2);
                            } else {
                                MaxFullscreenAdImpl.this.showAd(MaxFullscreenAdImpl.this.f2120e.getPlacement(), MaxFullscreenAdImpl.this.f2120e.mo13222Z(), activity2);
                            }
                        } else {
                            C2043j.m4930a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                        }
                    }
                });
            }
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
            C2043j.m4933a(MaxFullscreenAdImpl.this.revenueListener, maxAd);
        }

        public void onRewardedVideoCompleted(MaxAd maxAd) {
            C2043j.m4964f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onRewardedVideoStarted(MaxAd maxAd) {
            C2043j.m4962e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            C2043j.m4929a(MaxFullscreenAdImpl.this.adListener, maxAd, maxReward, true);
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c */
    public enum C1600c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, C1593a aVar, String str2, C1959m mVar) {
        super(str, maxAdFormat, str2, mVar);
        this.f2116a = aVar;
        this.listenerWrapper = new C1594b();
        this.f2117b = new C1837b(mVar, this);
        this.f2118c = new C1607b(mVar, this.listenerWrapper);
        mVar.mo14287B().mo14136a((C1873e.C1876a) this);
        if (C2092v.m5047a()) {
            C2092v.m5050f(str2, "Created new " + str2 + " (" + this + ")");
        }
    }

    /* renamed from: a */
    private void m3107a() {
        C1575c cVar;
        synchronized (this.f2119d) {
            cVar = this.f2120e;
            this.f2120e = null;
        }
        this.sdk.mo14290E().destroyAd(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3108a(C1575c cVar) {
        long u = cVar.mo13174u() - (SystemClock.elapsedRealtime() - cVar.mo13167q());
        if (u > TimeUnit.SECONDS.toMillis(2)) {
            this.f2120e = cVar;
            if (C2092v.m5047a()) {
                C2092v vVar = this.logger;
                String str = this.tag;
                vVar.mo14789b(str, "Handle ad loaded for regular ad: " + cVar);
                C2092v vVar2 = this.logger;
                String str2 = this.tag;
                vVar2.mo14789b(str2, "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(u) + " seconds from now for " + getAdUnitId() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            this.f2117b.mo14025a(u);
            return;
        }
        if (C2092v.m5047a()) {
            this.logger.mo14789b(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01ad  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m3109a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c r7, java.lang.Runnable r8) {
        /*
            r6 = this;
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = r6.f2121f
            java.lang.Object r1 = r6.f2119d
            monitor-enter(r1)
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.IDLE     // Catch:{ all -> 0x01de }
            r3 = 1
            r4 = 0
            if (r0 != r2) goto L_0x0045
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.LOADING     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x0011
            goto L_0x017b
        L_0x0011:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.DESTROYED     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x0017
            goto L_0x017b
        L_0x0017:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.SHOWING     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x0026
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.String r2 = "No ad is loading or loaded"
            goto L_0x005d
        L_0x0026:
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01de }
            r3.<init>()     // Catch:{ all -> 0x01de }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x01de }
            r3.append(r7)     // Catch:{ all -> 0x01de }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01de }
        L_0x0041:
            r0.mo14793e(r2, r3)     // Catch:{ all -> 0x01de }
            goto L_0x0060
        L_0x0045:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.LOADING     // Catch:{ all -> 0x01de }
            if (r0 != r2) goto L_0x009a
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.IDLE     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x004f
            goto L_0x017b
        L_0x004f:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.LOADING     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x0063
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.String r2 = "An ad is already loading"
        L_0x005d:
            com.applovin.impl.sdk.C2092v.m5053i(r0, r2)     // Catch:{ all -> 0x01de }
        L_0x0060:
            r3 = r4
            goto L_0x017b
        L_0x0063:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.READY     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x0069
            goto L_0x017b
        L_0x0069:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.SHOWING     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x0078
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.String r2 = "An ad is not ready to be shown yet"
            goto L_0x005d
        L_0x0078:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.DESTROYED     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x007e
            goto L_0x017b
        L_0x007e:
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01de }
            r3.<init>()     // Catch:{ all -> 0x01de }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x01de }
            r3.append(r7)     // Catch:{ all -> 0x01de }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01de }
            goto L_0x0041
        L_0x009a:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.READY     // Catch:{ all -> 0x01de }
            if (r0 != r2) goto L_0x00ee
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.IDLE     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x00a4
            goto L_0x017b
        L_0x00a4:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.LOADING     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x00b3
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.String r2 = "An ad is already loaded"
            goto L_0x005d
        L_0x00b3:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.READY     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x00c5
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.String r3 = "An ad is already marked as ready"
            goto L_0x0041
        L_0x00c5:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.SHOWING     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x00cb
            goto L_0x017b
        L_0x00cb:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.DESTROYED     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x00d1
            goto L_0x017b
        L_0x00d1:
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01de }
            r3.<init>()     // Catch:{ all -> 0x01de }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x01de }
            r3.append(r7)     // Catch:{ all -> 0x01de }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01de }
            goto L_0x0041
        L_0x00ee:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.SHOWING     // Catch:{ all -> 0x01de }
            if (r0 != r2) goto L_0x014c
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.IDLE     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x00f8
            goto L_0x017b
        L_0x00f8:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.LOADING     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x0108
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.String r2 = "Can not load another ad while the ad is showing"
            goto L_0x005d
        L_0x0108:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.READY     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x011a
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.String r3 = "An ad is already showing, ignoring"
            goto L_0x0041
        L_0x011a:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.SHOWING     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x012a
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.String r2 = "The ad is already showing, not showing another one"
            goto L_0x005d
        L_0x012a:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r0 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.DESTROYED     // Catch:{ all -> 0x01de }
            if (r7 != r0) goto L_0x012f
            goto L_0x017b
        L_0x012f:
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01de }
            r3.<init>()     // Catch:{ all -> 0x01de }
            java.lang.String r5 = "Unable to transition to: "
            r3.append(r5)     // Catch:{ all -> 0x01de }
            r3.append(r7)     // Catch:{ all -> 0x01de }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01de }
            goto L_0x0041
        L_0x014c:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r2 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1600c.DESTROYED     // Catch:{ all -> 0x01de }
            if (r0 != r2) goto L_0x015c
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.String r2 = "No operations are allowed on a destroyed instance"
            goto L_0x005d
        L_0x015c:
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x0060
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01de }
            r3.<init>()     // Catch:{ all -> 0x01de }
            java.lang.String r5 = "Unknown state: "
            r3.append(r5)     // Catch:{ all -> 0x01de }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r5 = r6.f2121f     // Catch:{ all -> 0x01de }
            r3.append(r5)     // Catch:{ all -> 0x01de }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01de }
            goto L_0x0041
        L_0x017b:
            if (r3 == 0) goto L_0x01ad
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x01aa
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01de }
            r4.<init>()     // Catch:{ all -> 0x01de }
            java.lang.String r5 = "Transitioning from "
            r4.append(r5)     // Catch:{ all -> 0x01de }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r5 = r6.f2121f     // Catch:{ all -> 0x01de }
            r4.append(r5)     // Catch:{ all -> 0x01de }
            java.lang.String r5 = " to "
            r4.append(r5)     // Catch:{ all -> 0x01de }
            r4.append(r7)     // Catch:{ all -> 0x01de }
            java.lang.String r5 = "..."
            r4.append(r5)     // Catch:{ all -> 0x01de }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01de }
            r0.mo14789b(r2, r4)     // Catch:{ all -> 0x01de }
        L_0x01aa:
            r6.f2121f = r7     // Catch:{ all -> 0x01de }
            goto L_0x01d5
        L_0x01ad:
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x01d5
            com.applovin.impl.sdk.v r0 = r6.logger     // Catch:{ all -> 0x01de }
            java.lang.String r2 = r6.tag     // Catch:{ all -> 0x01de }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01de }
            r4.<init>()     // Catch:{ all -> 0x01de }
            java.lang.String r5 = "Not allowed transition from "
            r4.append(r5)     // Catch:{ all -> 0x01de }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c r5 = r6.f2121f     // Catch:{ all -> 0x01de }
            r4.append(r5)     // Catch:{ all -> 0x01de }
            java.lang.String r5 = " to "
            r4.append(r5)     // Catch:{ all -> 0x01de }
            r4.append(r7)     // Catch:{ all -> 0x01de }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x01de }
            r0.mo14792d(r2, r7)     // Catch:{ all -> 0x01de }
        L_0x01d5:
            monitor-exit(r1)     // Catch:{ all -> 0x01de }
            if (r3 == 0) goto L_0x01dd
            if (r8 == 0) goto L_0x01dd
            r8.run()
        L_0x01dd:
            return
        L_0x01de:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01de }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.m3109a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c, java.lang.Runnable):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3114a(MaxAd maxAd) {
        this.f2117b.mo14024a();
        m3107a();
        this.sdk.mo14291F().mo14796b((C1573a) maxAd);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3115a(String str, String str2) {
        this.f2118c.mo13310b(this.f2120e);
        this.f2120e.mo13241d(str);
        this.f2120e.mo13242e(str2);
        if (C2092v.m5047a()) {
            C2092v vVar = this.logger;
            String str3 = this.tag;
            vVar.mo14789b(str3, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f2120e + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        mo13299a(this.f2120e);
    }

    /* renamed from: a */
    private boolean m3116a(Activity activity) {
        if (activity == null) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        } else if (!isReady()) {
            String str = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
            if (C2092v.m5047a()) {
                C2092v.m5053i(this.tag, str);
            }
            C2043j.m4927a(this.adListener, (MaxAd) this.f2120e, (MaxError) new MaxErrorImpl(-24, str), true);
            return false;
        } else {
            if (Utils.getAlwaysFinishActivitiesSetting(activity) != 0 && this.sdk.mo14363p().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
                if (Utils.isPubInDebugMode(activity, this.sdk)) {
                    throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                } else if (((Boolean) this.sdk.mo14311a(C1856a.f3037T)).booleanValue()) {
                    if (C2092v.m5047a()) {
                        C2092v.m5053i(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    }
                    C2043j.m4927a(this.adListener, (MaxAd) this.f2120e, (MaxError) new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!"), true);
                    return false;
                }
            }
            if (((Boolean) this.sdk.mo14311a(C1856a.f3018A)).booleanValue() && (this.sdk.mo14332ae().mo14645a() || this.sdk.mo14332ae().mo14647b())) {
                if (C2092v.m5047a()) {
                    C2092v.m5053i(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
                }
                C2043j.m4927a(this.adListener, (MaxAd) this.f2120e, (MaxError) new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing"), true);
                return false;
            } else if (!((Boolean) this.sdk.mo14311a(C1856a.f3019B)).booleanValue() || C2040h.m4900a((Context) activity)) {
                String str2 = this.sdk.mo14363p().getExtraParameters().get("fullscreen_ads_block_showing_if_activity_is_finishing");
                if ((!(StringUtils.isValidString(str2) && Boolean.valueOf(str2).booleanValue()) && !((Boolean) this.sdk.mo14311a(C1856a.f3020C)).booleanValue()) || !activity.isFinishing()) {
                    return true;
                }
                if (C2092v.m5047a()) {
                    C2092v.m5053i(this.tag, "Attempting to show ad when activity is finishing");
                }
                C2043j.m4927a(this.adListener, (MaxAd) this.f2120e, (MaxError) new MaxErrorImpl(-5601, "Attempting to show ad when activity is finishing"), true);
                return false;
            } else {
                if (C2092v.m5047a()) {
                    C2092v.m5053i(this.tag, "Attempting to show ad with no internet connection");
                }
                C2043j.m4927a(this.adListener, (MaxAd) this.f2120e, (MaxError) new MaxErrorImpl(-1009), true);
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3120b() {
        C1575c cVar;
        if (this.f2122g.compareAndSet(true, false)) {
            synchronized (this.f2119d) {
                cVar = this.f2120e;
                this.f2120e = null;
            }
            this.sdk.mo14290E().destroyAd(cVar);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    public void destroy() {
        m3109a(C1600c.DESTROYED, (Runnable) new Runnable() {
            public void run() {
                synchronized (MaxFullscreenAdImpl.this.f2119d) {
                    if (MaxFullscreenAdImpl.this.f2120e != null) {
                        if (C2092v.m5047a()) {
                            C2092v vVar = MaxFullscreenAdImpl.this.logger;
                            String str = MaxFullscreenAdImpl.this.tag;
                            vVar.mo14789b(str, "Destroying ad for '" + MaxFullscreenAdImpl.this.adUnitId + "'; current ad: " + MaxFullscreenAdImpl.this.f2120e + APSSharedUtil.TRUNCATE_SEPARATOR);
                        }
                        MaxFullscreenAdImpl.this.sdk.mo14290E().destroyAd(MaxFullscreenAdImpl.this.f2120e);
                    }
                }
                MaxFullscreenAdImpl.this.sdk.mo14287B().mo14138b((C1873e.C1876a) MaxFullscreenAdImpl.this);
                MaxFullscreenAdImpl.super.destroy();
            }
        });
    }

    public boolean isReady() {
        boolean z;
        synchronized (this.f2119d) {
            z = this.f2120e != null && this.f2120e.mo13141e() && this.f2121f == C1600c.READY;
        }
        return z;
    }

    public void loadAd(final Activity activity) {
        if (C2092v.m5047a()) {
            C2092v vVar = this.logger;
            String str = this.tag;
            vVar.mo14789b(str, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (isReady()) {
            if (C2092v.m5047a()) {
                C2092v vVar2 = this.logger;
                String str2 = this.tag;
                vVar2.mo14789b(str2, "An ad is already loaded for '" + this.adUnitId + "'");
            }
            C2043j.m4930a(this.adListener, (MaxAd) this.f2120e, true);
            return;
        }
        m3109a(C1600c.LOADING, (Runnable) new Runnable() {
            public void run() {
                Context context = activity;
                if (context == null) {
                    context = MaxFullscreenAdImpl.this.sdk.mo14341an() != null ? MaxFullscreenAdImpl.this.sdk.mo14341an() : MaxFullscreenAdImpl.this.sdk.mo14297L();
                }
                MaxFullscreenAdImpl.this.sdk.mo14290E().loadAd(MaxFullscreenAdImpl.this.adUnitId, (String) null, MaxFullscreenAdImpl.this.adFormat, MaxFullscreenAdImpl.this.localExtraParameters, MaxFullscreenAdImpl.this.extraParameters, context, MaxFullscreenAdImpl.this.listenerWrapper);
            }
        });
    }

    public void onAdExpired() {
        if (C2092v.m5047a()) {
            C2092v vVar = this.logger;
            String str = this.tag;
            vVar.mo14789b(str, "Ad expired " + getAdUnitId());
        }
        this.f2122g.set(true);
        Activity activity = this.f2116a.getActivity();
        if (activity == null && (activity = this.sdk.mo14333af().mo13822a()) == null) {
            m3120b();
            this.listenerWrapper.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
            return;
        }
        this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
        this.sdk.mo14290E().loadAd(this.adUnitId, (String) null, this.adFormat, this.localExtraParameters, this.extraParameters, activity, this.listenerWrapper);
    }

    public void onCreativeIdGenerated(String str, String str2) {
        C1575c cVar = this.f2120e;
        if (cVar != null && cVar.mo13142f().equalsIgnoreCase(str)) {
            C2043j.m4935a(this.adReviewListener, str2, (MaxAd) this.f2120e);
        }
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        if (activity == null) {
            activity = this.sdk.mo14341an();
        }
        if (m3116a(activity)) {
            m3109a(C1600c.SHOWING, (Runnable) new Runnable() {
                public void run() {
                    MaxFullscreenAdImpl.this.m3115a(str, str2);
                    boolean unused = MaxFullscreenAdImpl.this.f2123h = false;
                    WeakReference unused2 = MaxFullscreenAdImpl.this.f2125j = new WeakReference(activity);
                    MaxFullscreenAdImpl.this.sdk.mo14290E().showFullscreenAd(MaxFullscreenAdImpl.this.f2120e, activity, MaxFullscreenAdImpl.this.listenerWrapper);
                }
            });
        }
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        if (viewGroup == null || lifecycle == null) {
            if (C2092v.m5047a()) {
                C2092v.m5053i(this.tag, "Attempting to show ad with null containerView or lifecycle.");
            }
            C2043j.m4927a(this.adListener, (MaxAd) this.f2120e, (MaxError) new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle."), true);
            return;
        }
        if (activity == null) {
            activity = this.sdk.mo14341an();
        }
        final Activity activity2 = activity;
        if (m3116a(activity2)) {
            final String str3 = str;
            final String str4 = str2;
            final ViewGroup viewGroup2 = viewGroup;
            final Lifecycle lifecycle2 = lifecycle;
            m3109a(C1600c.SHOWING, (Runnable) new Runnable() {
                public void run() {
                    MaxFullscreenAdImpl.this.m3115a(str3, str4);
                    boolean unused = MaxFullscreenAdImpl.this.f2123h = true;
                    WeakReference unused2 = MaxFullscreenAdImpl.this.f2125j = new WeakReference(activity2);
                    WeakReference unused3 = MaxFullscreenAdImpl.this.f2126k = new WeakReference(viewGroup2);
                    WeakReference unused4 = MaxFullscreenAdImpl.this.f2127l = new WeakReference(lifecycle2);
                    MaxFullscreenAdImpl.this.sdk.mo14290E().showFullscreenAd(MaxFullscreenAdImpl.this.f2120e, viewGroup2, lifecycle2, activity2, MaxFullscreenAdImpl.this.listenerWrapper);
                }
            });
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tag);
        sb.append("{adUnitId='");
        sb.append(this.adUnitId);
        sb.append('\'');
        sb.append(", adListener=");
        sb.append(this.adListener == this.f2116a ? "this" : this.adListener);
        sb.append(", revenueListener=");
        sb.append(this.revenueListener);
        sb.append(", isReady=");
        sb.append(isReady());
        sb.append('}');
        return sb.toString();
    }
}
