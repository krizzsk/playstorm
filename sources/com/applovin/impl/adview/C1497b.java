package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p046ad.C1824a;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p049d.C1869d;
import com.applovin.impl.sdk.p049d.C1871f;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.p050e.C1934z;
import com.applovin.impl.sdk.utils.C2033b;
import com.applovin.impl.sdk.utils.C2043j;
import com.applovin.impl.sdk.utils.C2078k;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.applovin.impl.adview.b */
public class C1497b implements AppLovinCommunicatorSubscriber {

    /* renamed from: A */
    private volatile AppLovinAdClickListener f1829A;

    /* renamed from: B */
    private volatile C1523g f1830B = null;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f1831a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ViewGroup f1832b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1959m f1833c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public AppLovinAdServiceImpl f1834d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2092v f1835e;

    /* renamed from: f */
    private AppLovinCommunicator f1836f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public AppLovinAdSize f1837g;

    /* renamed from: h */
    private String f1838h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C1869d f1839i;

    /* renamed from: j */
    private C1519e f1840j;

    /* renamed from: k */
    private C1511c f1841k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C1513d f1842l;

    /* renamed from: m */
    private Runnable f1843m;

    /* renamed from: n */
    private Runnable f1844n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public volatile C1829e f1845o = null;

    /* renamed from: p */
    private volatile AppLovinAd f1846p = null;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C1532l f1847q = null;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C1532l f1848r = null;

    /* renamed from: s */
    private final AtomicReference<AppLovinAd> f1849s = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final AtomicBoolean f1850t = new AtomicBoolean();

    /* renamed from: u */
    private volatile boolean f1851u = false;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public volatile boolean f1852v = false;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public volatile boolean f1853w = false;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public volatile AppLovinAdLoadListener f1854x;

    /* renamed from: y */
    private volatile AppLovinAdDisplayListener f1855y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public volatile AppLovinAdViewEventListener f1856z;

    /* renamed from: com.applovin.impl.adview.b$a */
    private class C1509a implements Runnable {
        private C1509a() {
        }

        public void run() {
            if (C1497b.this.f1842l != null) {
                C1497b.this.f1842l.setVisibility(8);
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.b$b */
    private class C1510b implements Runnable {
        private C1510b() {
        }

        public void run() {
            if (C1497b.this.f1845o == null) {
                return;
            }
            if (C1497b.this.f1842l != null) {
                C1497b.this.m2734x();
                if (C2092v.m5047a()) {
                    C2092v c = C1497b.this.f1835e;
                    c.mo14789b("AppLovinAdView", "Rendering advertisement ad for #" + C1497b.this.f1845o.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                C1497b.m2713b((View) C1497b.this.f1842l, C1497b.this.f1845o.getSize());
                C1497b.this.f1842l.mo12926a(C1497b.this.f1845o);
                if (C1497b.this.f1845o.getSize() != AppLovinAdSize.INTERSTITIAL && !C1497b.this.f1852v) {
                    C1869d unused = C1497b.this.f1839i = new C1869d(C1497b.this.f1845o, C1497b.this.f1833c);
                    C1497b.this.f1839i.mo14102a();
                    C1497b.this.f1842l.setStatsManagerHelper(C1497b.this.f1839i);
                    C1497b.this.f1845o.setHasShown(true);
                }
                if (C1497b.this.f1842l.getStatsManagerHelper() != null) {
                    C1497b.this.f1842l.getStatsManagerHelper().mo14103a(C1497b.this.f1845o.mo14019z() ? 0 : 1);
                    return;
                }
                return;
            }
            if (C2092v.m5047a()) {
                C2092v.m5053i("AppLovinAdView", "Unable to render advertisement for ad #" + C1497b.this.f1845o.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
            }
            C2043j.m4922a(C1497b.this.f1856z, (AppLovinAd) C1497b.this.f1845o, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
        }
    }

    /* renamed from: com.applovin.impl.adview.b$c */
    static class C1511c implements AppLovinAdLoadListener {

        /* renamed from: a */
        private final C1497b f1875a;

        C1511c(C1497b bVar, C1959m mVar) {
            if (bVar == null) {
                throw new IllegalArgumentException("No view specified");
            } else if (mVar != null) {
                this.f1875a = bVar;
            } else {
                throw new IllegalArgumentException("No sdk specified");
            }
        }

        /* renamed from: a */
        private C1497b m2769a() {
            return this.f1875a;
        }

        public void adReceived(AppLovinAd appLovinAd) {
            C1497b a = m2769a();
            if (a != null) {
                a.mo12889b(appLovinAd);
            } else if (C2092v.m5047a()) {
                C2092v.m5053i("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        public void failedToReceiveAd(int i) {
            C1497b a = m2769a();
            if (a != null) {
                a.mo12874a(i);
            }
        }
    }

    /* renamed from: a */
    private void m2709a(AppLovinAdView appLovinAdView, C1959m mVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        } else if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (appLovinAdSize != null) {
            this.f1833c = mVar;
            this.f1834d = mVar.mo14369u();
            this.f1835e = mVar.mo14286A();
            this.f1836f = AppLovinCommunicator.getInstance(context);
            this.f1837g = appLovinAdSize;
            this.f1838h = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f1831a = context;
            this.f1832b = appLovinAdView;
            this.f1840j = new C1519e(this, mVar);
            this.f1844n = new C1509a();
            this.f1843m = new C1510b();
            this.f1841k = new C1511c(this, mVar);
            mo12887a(appLovinAdSize);
        } else {
            throw new IllegalArgumentException("No ad size specified");
        }
    }

    /* renamed from: a */
    private void m2710a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m2713b(View view, AppLovinAdSize appLovinAdSize) {
        if (view != null) {
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            int i = -1;
            int applyDimension = appLovinAdSize.getLabel().equals(AppLovinAdSize.INTERSTITIAL.getLabel()) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, (float) appLovinAdSize.getWidth(), displayMetrics);
            if (!appLovinAdSize.getLabel().equals(AppLovinAdSize.INTERSTITIAL.getLabel())) {
                i = appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, (float) appLovinAdSize.getHeight(), displayMetrics);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            }
            layoutParams.width = applyDimension;
            layoutParams.height = i;
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.addRule(10);
                layoutParams2.addRule(9);
            }
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: t */
    private void m2730t() {
        C2092v vVar;
        if (C2092v.m5047a() && (vVar = this.f1835e) != null) {
            vVar.mo14789b("AppLovinAdView", "Destroying...");
        }
        C1513d dVar = this.f1842l;
        if (dVar != null) {
            ViewParent parent = dVar.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1842l);
            }
            this.f1842l.removeAllViews();
            this.f1842l.loadUrl("about:blank");
            this.f1842l.onPause();
            this.f1842l.destroyDrawingCache();
            this.f1842l.destroy();
            this.f1842l = null;
        }
        this.f1854x = null;
        this.f1855y = null;
        this.f1829A = null;
        this.f1856z = null;
        this.f1852v = true;
    }

    /* renamed from: u */
    private void m2731u() {
        m2710a((Runnable) new Runnable() {
            public void run() {
                if (C1497b.this.f1847q != null) {
                    if (C2092v.m5047a()) {
                        C2092v c = C1497b.this.f1835e;
                        c.mo14789b("AppLovinAdView", "Detaching expanded ad: " + C1497b.this.f1847q.mo12972a());
                    }
                    C1497b bVar = C1497b.this;
                    C1532l unused = bVar.f1848r = bVar.f1847q;
                    C1532l unused2 = C1497b.this.f1847q = null;
                    C1497b bVar2 = C1497b.this;
                    bVar2.mo12887a(bVar2.f1837g);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m2732v() {
        m2710a((Runnable) new Runnable() {
            public void run() {
                C1824a aVar;
                if (C1497b.this.f1848r != null || C1497b.this.f1847q != null) {
                    if (C1497b.this.f1848r != null) {
                        aVar = C1497b.this.f1848r.mo12972a();
                        C1497b.this.f1848r.dismiss();
                        C1532l unused = C1497b.this.f1848r = null;
                    } else {
                        aVar = C1497b.this.f1847q.mo12972a();
                        C1497b.this.f1847q.dismiss();
                        C1532l unused2 = C1497b.this.f1847q = null;
                    }
                    C2043j.m4950b(C1497b.this.f1856z, (AppLovinAd) aVar, (AppLovinAdView) C1497b.this.f1832b);
                }
            }
        });
    }

    /* renamed from: w */
    private void m2733w() {
        C1869d dVar = this.f1839i;
        if (dVar != null) {
            dVar.mo14106c();
            this.f1839i = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m2734x() {
        if (C2092v.m5047a()) {
            C1829e eVar = this.f1845o;
            C2078k kVar = new C2078k();
            kVar.mo14712a().mo14716a(eVar).mo14714a(mo12905r());
            if (!Utils.isBML(eVar.getSize())) {
                kVar.mo14712a().mo14718a("Fullscreen Ad Properties").mo14721b(eVar);
            }
            kVar.mo14717a(this.f1833c);
            kVar.mo14712a();
            this.f1835e.mo14789b("AppLovinAdView", kVar.toString());
        }
    }

    /* renamed from: a */
    public void mo12873a() {
        if (this.f1833c != null && this.f1841k != null && this.f1831a != null && this.f1851u) {
            this.f1834d.loadNextAd(this.f1838h, this.f1837g, this.f1841k);
        } else if (C2092v.m5047a()) {
            C2092v.m5051g("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12874a(final int i) {
        if (!this.f1852v) {
            m2710a(this.f1844n);
        }
        m2710a((Runnable) new Runnable() {
            public void run() {
                try {
                    if (C1497b.this.f1854x != null) {
                        C1497b.this.f1854x.failedToReceiveAd(i);
                    }
                } catch (Throwable th) {
                    if (C2092v.m5047a()) {
                        C2092v.m5049c("AppLovinAdView", "Exception while running app load  callback", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo12875a(final PointF pointF) {
        m2710a((Runnable) new Runnable() {
            public void run() {
                if (C1497b.this.f1847q == null && (C1497b.this.f1845o instanceof C1824a) && C1497b.this.f1842l != null) {
                    C1824a aVar = (C1824a) C1497b.this.f1845o;
                    Activity retrieveParentActivity = C1497b.this.f1831a instanceof Activity ? (Activity) C1497b.this.f1831a : Utils.retrieveParentActivity(C1497b.this.f1842l, C1497b.this.f1833c);
                    if (retrieveParentActivity != null) {
                        if (C1497b.this.f1832b != null) {
                            C1497b.this.f1832b.removeView(C1497b.this.f1842l);
                        }
                        C1532l unused = C1497b.this.f1847q = new C1532l(aVar, C1497b.this.f1842l, retrieveParentActivity, C1497b.this.f1833c);
                        C1497b.this.f1847q.setOnDismissListener(new DialogInterface.OnDismissListener() {
                            public void onDismiss(DialogInterface dialogInterface) {
                                C1497b.this.mo12898k();
                            }
                        });
                        C1497b.this.f1847q.show();
                        C2043j.m4921a(C1497b.this.f1856z, (AppLovinAd) C1497b.this.f1845o, (AppLovinAdView) C1497b.this.f1832b);
                        if (C1497b.this.f1839i != null) {
                            C1497b.this.f1839i.mo14108d();
                        }
                        if (C1497b.this.f1845o.isOpenMeasurementEnabled()) {
                            C1497b.this.f1845o.mo12640o().mo13838a((View) C1497b.this.f1847q.mo12973b());
                            return;
                        }
                        return;
                    }
                    if (C2092v.m5047a()) {
                        C2092v.m5053i("AppLovinAdView", "Unable to expand ad. No Activity found.");
                    }
                    Uri j = aVar.mo12635j();
                    if (j != null) {
                        AppLovinAdServiceImpl l = C1497b.this.f1834d;
                        AppLovinAdView r = C1497b.this.mo12905r();
                        C1497b bVar = C1497b.this;
                        l.trackAndLaunchClick(aVar, r, bVar, j, pointF, bVar.f1853w);
                        if (C1497b.this.f1839i != null) {
                            C1497b.this.f1839i.mo14104b();
                        }
                    }
                    C1497b.this.f1842l.mo12927a("javascript:al_onFailedExpand();");
                }
            }
        });
    }

    /* renamed from: a */
    public void mo12876a(final WebView webView) {
        m2710a((Runnable) new Runnable() {
            public void run() {
                webView.setVisibility(0);
            }
        });
        try {
            if (this.f1845o != this.f1846p) {
                this.f1846p = this.f1845o;
                if (this.f1855y != null) {
                    C2043j.m4941a(this.f1855y, (AppLovinAd) this.f1845o);
                    this.f1842l.mo12927a("javascript:al_onAdViewRendered();");
                }
                if ((this.f1845o instanceof C1824a) && this.f1845o.isOpenMeasurementEnabled()) {
                    this.f1833c.mo14303S().mo14207a((C1877a) new C1934z(this.f1833c, new Runnable() {
                        public void run() {
                            C1497b.this.f1845o.mo12640o().mo13844b(webView);
                            C1497b.this.f1845o.mo12640o().mo13838a((View) webView);
                            C1497b.this.f1845o.mo12640o().mo13845c();
                            C1497b.this.f1845o.mo12640o().mo13846d();
                        }
                    }), C1908o.C1910a.MAIN, 500);
                }
            }
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                C2092v.m5049c("AppLovinAdView", "Exception while notifying ad display listener", th);
            }
        }
    }

    /* renamed from: a */
    public void mo12877a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        } else if (context != null) {
            if (appLovinAdSize == null && (appLovinAdSize = C2033b.m4860a(attributeSet)) == null) {
                appLovinAdSize = AppLovinAdSize.BANNER;
            }
            AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
            if (appLovinSdk == null) {
                appLovinSdk = AppLovinSdk.getInstance(context);
            }
            if (appLovinSdk != null) {
                m2709a(appLovinAdView, appLovinSdk.coreSdk, appLovinAdSize2, str, context);
                if (C2033b.m4864b(attributeSet)) {
                    mo12873a();
                }
            }
        } else if (C2092v.m5047a()) {
            C2092v.m5053i("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
        }
    }

    /* renamed from: a */
    public void mo12878a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.f1856z = appLovinAdViewEventListener;
    }

    /* renamed from: a */
    public void mo12879a(C1523g gVar) {
        this.f1830B = gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12880a(C1829e eVar, AppLovinAdView appLovinAdView, Uri uri, PointF pointF) {
        if (appLovinAdView != null) {
            this.f1834d.trackAndLaunchClick(eVar, appLovinAdView, this, uri, pointF, this.f1853w);
        } else if (C2092v.m5047a()) {
            this.f1835e.mo14793e("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        C2043j.m4940a(this.f1829A, (AppLovinAd) eVar);
    }

    /* renamed from: a */
    public void mo12881a(C1869d dVar) {
        C1513d dVar2 = this.f1842l;
        if (dVar2 != null) {
            dVar2.setStatsManagerHelper(dVar);
        }
    }

    /* renamed from: a */
    public void mo12882a(AppLovinAd appLovinAd) {
        mo12883a(appLovinAd, (String) null);
    }

    /* renamed from: a */
    public void mo12883a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            Utils.validateAdSdkKey(appLovinAd, this.f1833c);
            if (this.f1851u) {
                C1829e eVar = (C1829e) Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f1833c);
                if (eVar != null && eVar != this.f1845o) {
                    if (C2092v.m5047a()) {
                        C2092v vVar = this.f1835e;
                        vVar.mo14789b("AppLovinAdView", "Rendering ad #" + eVar.getAdIdNumber() + " (" + eVar.getSize() + ")");
                    }
                    C2043j.m4953b(this.f1855y, (AppLovinAd) this.f1845o);
                    if (eVar.getSize() != AppLovinAdSize.INTERSTITIAL) {
                        m2733w();
                    }
                    if (this.f1845o != null && this.f1845o.isOpenMeasurementEnabled()) {
                        this.f1845o.mo12640o().mo13847e();
                    }
                    this.f1849s.set((Object) null);
                    this.f1846p = null;
                    this.f1845o = eVar;
                    if (!this.f1852v && Utils.isBML(this.f1837g)) {
                        this.f1833c.mo14369u().trackImpression(eVar);
                    }
                    if (this.f1847q != null) {
                        m2731u();
                    }
                    m2710a(this.f1843m);
                } else if (eVar != null) {
                    if (C2092v.m5047a()) {
                        C2092v vVar2 = this.f1835e;
                        vVar2.mo14792d("AppLovinAdView", "Ad #" + eVar.getAdIdNumber() + " is already showing, ignoring");
                    }
                    if (((Boolean) this.f1833c.mo14311a(C1857b.f3149bZ)).booleanValue()) {
                        throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
                    }
                } else if (C2092v.m5047a()) {
                    this.f1835e.mo14792d("AppLovinAdView", "Unable to render ad. Ad is null. Internal inconsistency error.");
                }
            } else if (C2092v.m5047a()) {
                C2092v.m5051g("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            }
        } else {
            throw new IllegalArgumentException("No ad specified");
        }
    }

    /* renamed from: a */
    public void mo12884a(AppLovinAdClickListener appLovinAdClickListener) {
        this.f1829A = appLovinAdClickListener;
    }

    /* renamed from: a */
    public void mo12885a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f1855y = appLovinAdDisplayListener;
    }

    /* renamed from: a */
    public void mo12886a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f1854x = appLovinAdLoadListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12887a(AppLovinAdSize appLovinAdSize) {
        try {
            C1513d dVar = new C1513d(this.f1840j, this.f1833c, this.f1831a);
            this.f1842l = dVar;
            dVar.setBackgroundColor(0);
            this.f1842l.setWillNotCacheDrawing(false);
            this.f1832b.setBackgroundColor(0);
            this.f1832b.addView(this.f1842l);
            m2713b((View) this.f1842l, appLovinAdSize);
            if (!this.f1851u) {
                m2710a(this.f1844n);
            }
            m2710a((Runnable) new Runnable() {
                public void run() {
                    C1497b.this.f1842l.loadDataWithBaseURL("/", "<html></html>", "text/html", (String) null, "");
                }
            });
            this.f1851u = true;
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                C2092v.m5049c("AppLovinAdView", "Failed to initialize AdWebView", th);
            }
            this.f1850t.set(true);
        }
    }

    /* renamed from: b */
    public AppLovinAdSize mo12888b() {
        return this.f1837g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo12889b(final AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f1852v) {
                mo12882a(appLovinAd);
            } else {
                this.f1849s.set(appLovinAd);
                if (C2092v.m5047a()) {
                    this.f1835e.mo14789b("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            m2710a((Runnable) new Runnable() {
                public void run() {
                    if (C1497b.this.f1850t.compareAndSet(true, false)) {
                        C1497b bVar = C1497b.this;
                        bVar.mo12887a(bVar.f1837g);
                    }
                    try {
                        if (C1497b.this.f1854x != null) {
                            C1497b.this.f1854x.adReceived(appLovinAd);
                        }
                    } catch (Throwable th) {
                        if (C2092v.m5047a()) {
                            C2092v.m5053i("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
                        }
                    }
                }
            });
            return;
        }
        if (C2092v.m5047a()) {
            this.f1835e.mo14793e("AppLovinAdView", "No provided when to the view controller");
        }
        mo12874a(-1);
    }

    /* renamed from: c */
    public String mo12890c() {
        return this.f1838h;
    }

    /* renamed from: d */
    public void mo12891d() {
        if (this.f1851u && !this.f1852v) {
            this.f1852v = true;
        }
    }

    /* renamed from: e */
    public void mo12892e() {
        if (this.f1851u) {
            AppLovinAd andSet = this.f1849s.getAndSet((Object) null);
            if (andSet != null) {
                mo12882a(andSet);
            }
            this.f1852v = false;
        }
    }

    /* renamed from: f */
    public void mo12893f() {
        if (!(this.f1842l == null || this.f1847q == null)) {
            mo12898k();
        }
        m2730t();
    }

    /* renamed from: g */
    public AppLovinAdViewEventListener mo12894g() {
        return this.f1856z;
    }

    public String getCommunicatorId() {
        return C1497b.class.getSimpleName();
    }

    /* renamed from: h */
    public C1523g mo12895h() {
        return this.f1830B;
    }

    /* renamed from: i */
    public void mo12896i() {
        if (C2033b.m4863a((View) this.f1842l)) {
            this.f1833c.mo14304T().mo14128a(C1871f.f3448m);
        }
    }

    /* renamed from: j */
    public void mo12897j() {
        if (this.f1851u) {
            C2043j.m4953b(this.f1855y, (AppLovinAd) this.f1845o);
            if (this.f1845o != null && this.f1845o.isOpenMeasurementEnabled() && Utils.isBML(this.f1845o.getSize())) {
                this.f1845o.mo12640o().mo13847e();
            }
            if (this.f1842l != null && this.f1847q != null) {
                if (C2092v.m5047a()) {
                    this.f1835e.mo14789b("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                m2731u();
            } else if (C2092v.m5047a()) {
                this.f1835e.mo14789b("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
        }
    }

    /* renamed from: k */
    public void mo12898k() {
        m2710a((Runnable) new Runnable() {
            public void run() {
                C1497b.this.m2732v();
                if (C1497b.this.f1832b != null && C1497b.this.f1842l != null && C1497b.this.f1842l.getParent() == null) {
                    C1497b.this.f1832b.addView(C1497b.this.f1842l);
                    C1497b.m2713b((View) C1497b.this.f1842l, C1497b.this.f1845o.getSize());
                    if (C1497b.this.f1845o.isOpenMeasurementEnabled()) {
                        C1497b.this.f1845o.mo12640o().mo13838a((View) C1497b.this.f1842l);
                    }
                }
            }
        });
    }

    /* renamed from: l */
    public void mo12899l() {
        if (this.f1847q == null && this.f1848r == null) {
            if (C2092v.m5047a()) {
                C2092v vVar = this.f1835e;
                vVar.mo14789b("AppLovinAdView", "Ad: " + this.f1845o + " closed.");
            }
            m2710a(this.f1844n);
            C2043j.m4953b(this.f1855y, (AppLovinAd) this.f1845o);
            this.f1845o = null;
            return;
        }
        mo12898k();
    }

    /* renamed from: m */
    public void mo12900m() {
        this.f1853w = true;
    }

    /* renamed from: n */
    public void mo12901n() {
        this.f1853w = false;
    }

    /* renamed from: o */
    public void mo12902o() {
        if ((this.f1831a instanceof C1531k) && this.f1845o != null) {
            if (this.f1845o.mo13943F() == C1829e.C1831a.DISMISS) {
                ((C1531k) this.f1831a).dismiss();
            }
        }
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            m2710a((Runnable) new Runnable() {
                public void run() {
                    C1497b.this.mo12906s().loadUrl("chrome://crash");
                }
            });
        }
    }

    /* renamed from: p */
    public C1829e mo12903p() {
        return this.f1845o;
    }

    /* renamed from: q */
    public C1959m mo12904q() {
        return this.f1833c;
    }

    /* renamed from: r */
    public AppLovinAdView mo12905r() {
        return (AppLovinAdView) this.f1832b;
    }

    /* renamed from: s */
    public C1513d mo12906s() {
        return this.f1842l;
    }
}
