package com.applovin.impl.adview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.adview.activity.p027b.C1440a;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p046ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p046ad.C1836g;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p049d.C1871f;
import com.applovin.impl.sdk.utils.C2040h;
import com.applovin.impl.sdk.utils.C2043j;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.adview.o */
public class C1542o implements AppLovinInterstitialAdDialog {

    /* renamed from: a */
    protected final C1959m f1933a;

    /* renamed from: b */
    private final WeakReference<Context> f1934b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile AppLovinAdLoadListener f1935c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile AppLovinAdDisplayListener f1936d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile AppLovinAdVideoPlaybackListener f1937e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile AppLovinAdClickListener f1938f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public volatile C1829e f1939g;

    /* renamed from: h */
    private volatile C1829e.C1832b f1940h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ViewGroup f1941i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public AppLovinFullscreenAdViewObserver f1942j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C1440a f1943k;

    public C1542o(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (context != null) {
            this.f1933a = appLovinSdk.coreSdk;
            this.f1934b = new WeakReference<>(context);
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2836a(final int i) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1542o.this.f1935c != null) {
                    C1542o.this.f1935c.failedToReceiveAd(i);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2837a(Context context) {
        Intent intent = new Intent(context, AppLovinFullscreenActivity.class);
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f1933a.mo14374z());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* renamed from: a */
    private void m2841a(C1829e eVar, final Context context) {
        if (this.f1933a.mo14333af().mo13824b() == null) {
            this.f1933a.mo14304T().mo14128a(C1871f.f3448m);
        }
        this.f1939g = eVar;
        this.f1940h = this.f1939g.mo14009p();
        final long max = Math.max(0, ((Long) this.f1933a.mo14311a(C1857b.f3213cl)).longValue());
        if (C2092v.m5047a()) {
            C2092v A = this.f1933a.mo14286A();
            A.mo14789b("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        }
        m2842a(eVar, context, new Runnable() {
            public void run() {
                new Handler(context.getMainLooper()).postDelayed(new Runnable() {
                    public void run() {
                        if (C1542o.this.f1941i == null || C1542o.this.f1942j == null) {
                            if (C2092v.m5047a()) {
                                C1542o.this.f1933a.mo14286A().mo14789b("InterstitialAdDialogWrapper", "Presenting ad in a fullscreen activity");
                            }
                            C1542o.this.m2837a(context);
                            return;
                        }
                        if (C2092v.m5047a()) {
                            C2092v A = C1542o.this.f1933a.mo14286A();
                            A.mo14789b("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + C1542o.this.f1941i + ")");
                        }
                        C1542o.this.f1941i.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                        C1440a.m2492a(C1542o.this.f1939g, C1542o.this.f1938f, C1542o.this.f1936d, C1542o.this.f1937e, C1542o.this.f1933a, (Activity) C1542o.this.m2850f(), new C1440a.C1452a() {
                            /* renamed from: a */
                            public void mo12566a(C1440a aVar) {
                                C1440a unused = C1542o.this.f1943k = aVar;
                                C1542o.this.f1942j.setPresenter(aVar);
                                aVar.mo12761a(C1542o.this.f1941i);
                            }

                            /* renamed from: a */
                            public void mo12567a(String str, Throwable th) {
                                C1542o.m2843a(C1542o.this.f1939g, C1542o.this.f1936d, str, th, (AppLovinFullscreenActivity) null);
                            }
                        });
                    }
                }, max);
            }
        });
    }

    /* renamed from: a */
    private void m2842a(C1829e eVar, Context context, final Runnable runnable) {
        if (!TextUtils.isEmpty(eVar.mo13951N()) || !eVar.mo13988ah() || C2040h.m4900a(context) || !(context instanceof Activity)) {
            runnable.run();
            return;
        }
        AlertDialog create = new AlertDialog.Builder(context).setTitle(eVar.mo13989ai()).setMessage(eVar.mo13990aj()).setPositiveButton(eVar.mo13991ak(), (DialogInterface.OnClickListener) null).create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() {
            public void onDismiss(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
        create.show();
    }

    /* renamed from: a */
    public static void m2843a(C1829e eVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        if (C2092v.m5047a()) {
            C2092v.m5049c("InterstitialAdDialogWrapper", str, th);
        }
        if (appLovinAdDisplayListener instanceof C1836g) {
            C2043j.m4942a(appLovinAdDisplayListener, str);
        } else {
            C2043j.m4953b(appLovinAdDisplayListener, (AppLovinAd) eVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss();
        }
    }

    /* renamed from: a */
    private void m2844a(AppLovinAd appLovinAd) {
        if (this.f1936d != null) {
            this.f1936d.adHidden(appLovinAd);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2846b(final AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C1542o.this.f1935c != null) {
                    C1542o.this.f1935c.adReceived(appLovinAd);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public Context m2850f() {
        return (Context) this.f1934b.get();
    }

    /* renamed from: a */
    public C1829e mo12988a() {
        return this.f1939g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12989a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f1933a.mo14369u().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    /* renamed from: b */
    public AppLovinAdVideoPlaybackListener mo12990b() {
        return this.f1937e;
    }

    /* renamed from: c */
    public AppLovinAdDisplayListener mo12991c() {
        return this.f1936d;
    }

    /* renamed from: d */
    public AppLovinAdClickListener mo12992d() {
        return this.f1938f;
    }

    /* renamed from: e */
    public void mo12993e() {
        this.f1941i = null;
        this.f1942j = null;
        this.f1938f = null;
        this.f1935c = null;
        this.f1937e = null;
        this.f1936d = null;
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f1938f = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f1936d = appLovinAdDisplayListener;
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f1935c = appLovinAdLoadListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f1937e = appLovinAdVideoPlaybackListener;
    }

    public void show() {
        mo12989a((AppLovinAdLoadListener) new AppLovinAdLoadListener() {
            public void adReceived(AppLovinAd appLovinAd) {
                C1542o.this.m2846b(appLovinAd);
                C1542o.this.showAndRender(appLovinAd);
            }

            public void failedToReceiveAd(int i) {
                C1542o.this.m2836a(i);
            }
        });
    }

    public void showAndRender(AppLovinAd appLovinAd) {
        Context f = m2850f();
        if (f == null) {
            if (C2092v.m5047a()) {
                C2092v.m5053i("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            }
            m2844a(appLovinAd);
            return;
        }
        AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f1933a);
        if (maybeRetrieveNonDummyAd == null) {
            if (C2092v.m5047a()) {
                C2092v.m5053i("InterstitialAdDialogWrapper", "Failed to show ad: " + appLovinAd);
            }
            m2844a(appLovinAd);
        } else if (((AppLovinAdImpl) maybeRetrieveNonDummyAd).hasShown() && ((Boolean) this.f1933a.mo14311a(C1857b.f3149bZ)).booleanValue()) {
            throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
        } else if (maybeRetrieveNonDummyAd instanceof C1829e) {
            m2841a((C1829e) maybeRetrieveNonDummyAd, f);
        } else {
            if (C2092v.m5047a()) {
                C2092v A = this.f1933a.mo14286A();
                A.mo14793e("InterstitialAdDialogWrapper", "Failed to show interstitial: unknown ad type provided: '" + maybeRetrieveNonDummyAd + "'");
            }
            m2844a(maybeRetrieveNonDummyAd);
        }
    }

    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle) {
        if (viewGroup == null || lifecycle == null) {
            if (C2092v.m5047a()) {
                C2092v.m5053i("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null containerView or lifecycle");
            }
            m2844a(appLovinAd);
            return;
        }
        this.f1941i = viewGroup;
        AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver = new AppLovinFullscreenAdViewObserver(lifecycle, this, this.f1933a);
        this.f1942j = appLovinFullscreenAdViewObserver;
        lifecycle.addObserver(appLovinFullscreenAdViewObserver);
        showAndRender(appLovinAd);
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }
}
