package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import com.applovin.impl.sdk.C1946k;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.utils.C2032a;
import com.applovin.impl.sdk.utils.C2040h;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.l */
public class C1952l implements C1946k.C1951a, AppLovinWebViewActivity.EventListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final AtomicBoolean f3631a = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static WeakReference<AppLovinWebViewActivity> f3632b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1959m f3633c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2092v f3634d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AppLovinUserService.OnConsentDialogDismissListener f3635e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C1946k f3636f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public WeakReference<Activity> f3637g = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C2032a f3638h;

    /* renamed from: i */
    private AtomicBoolean f3639i = new AtomicBoolean();

    C1952l(C1959m mVar) {
        this.f3633c = mVar;
        this.f3634d = mVar.mo14286A();
        if (mVar.mo14298N() != null) {
            this.f3637g = new WeakReference<>(mVar.mo14298N());
        }
        C1959m.m4402a(C1959m.m4401M()).mo13823a(new C2032a() {
            public void onActivityStarted(Activity activity) {
                WeakReference unused = C1952l.this.f3637g = new WeakReference(activity);
            }
        });
        this.f3636f = new C1946k(this, mVar);
    }

    /* renamed from: a */
    private void m4386a(boolean z, long j) {
        m4394g();
        if (z) {
            mo14276a(j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m4388a(C1959m mVar) {
        if (mo14279d()) {
            if (C2092v.m5047a()) {
                C2092v.m5053i("AppLovinSdk", "Consent dialog already showing");
            }
            return false;
        } else if (!C2040h.m4900a(mVar.mo14297L())) {
            if (C2092v.m5047a()) {
                C2092v.m5053i("AppLovinSdk", "No internet available, skip showing of consent dialog");
            }
            return false;
        } else if (!((Boolean) mVar.mo14311a(C1857b.f3115as)).booleanValue()) {
            if (C2092v.m5047a()) {
                this.f3634d.mo14793e("ConsentDialogManager", "Blocked publisher from showing consent dialog");
            }
            return false;
        } else if (StringUtils.isValidString((String) mVar.mo14311a(C1857b.f3116at))) {
            return true;
        } else {
            if (C2092v.m5047a()) {
                this.f3634d.mo14793e("ConsentDialogManager", "AdServer returned empty consent dialog URL");
            }
            return false;
        }
    }

    /* renamed from: g */
    private void m4394g() {
        this.f3633c.mo14333af().mo13825b(this.f3638h);
        if (mo14279d()) {
            AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) f3632b.get();
            f3632b = null;
            if (appLovinWebViewActivity != null) {
                appLovinWebViewActivity.finish();
                AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = this.f3635e;
                if (onConsentDialogDismissListener != null) {
                    onConsentDialogDismissListener.onDismiss();
                    this.f3635e = null;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo14274a() {
        final Activity activity = (Activity) this.f3637g.get();
        if (activity != null) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    C1952l.this.mo14277a(activity, (AppLovinUserService.OnConsentDialogDismissListener) null);
                }
            }, ((Long) this.f3633c.mo14311a(C1857b.f3118av)).longValue());
        }
    }

    /* renamed from: a */
    public void mo14276a(final long j) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (C2092v.m5047a()) {
                    C1952l.this.f3634d.mo14789b("ConsentDialogManager", "Scheduling repeating consent alert");
                }
                C1952l.this.f3636f.mo14269a(j, C1952l.this.f3633c, C1952l.this);
            }
        });
    }

    /* renamed from: a */
    public void mo14277a(final Activity activity, final AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        activity.runOnUiThread(new Runnable() {
            public void run() {
                C1952l lVar = C1952l.this;
                if (!lVar.m4388a(lVar.f3633c) || C1952l.f3631a.getAndSet(true)) {
                    AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = onConsentDialogDismissListener;
                    if (onConsentDialogDismissListener != null) {
                        onConsentDialogDismissListener.onDismiss();
                        return;
                    }
                    return;
                }
                WeakReference unused = C1952l.this.f3637g = new WeakReference(activity);
                AppLovinUserService.OnConsentDialogDismissListener unused2 = C1952l.this.f3635e = onConsentDialogDismissListener;
                C2032a unused3 = C1952l.this.f3638h = new C2032a() {
                    public void onActivityStarted(Activity activity) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            if (!C1952l.this.mo14279d() || C1952l.f3632b.get() != activity) {
                                AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) activity;
                                WeakReference unused = C1952l.f3632b = new WeakReference(appLovinWebViewActivity);
                                appLovinWebViewActivity.loadUrl((String) C1952l.this.f3633c.mo14311a(C1857b.f3116at), C1952l.this);
                            }
                            C1952l.f3631a.set(false);
                        }
                    }
                };
                C1952l.this.f3633c.mo14333af().mo13823a(C1952l.this.f3638h);
                Intent intent = new Intent(activity, AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, C1952l.this.f3633c.mo14374z());
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, (Serializable) C1952l.this.f3633c.mo14311a(C1857b.f3117au));
                activity.startActivity(intent);
            }
        });
    }

    /* renamed from: b */
    public void mo14275b() {
    }

    /* renamed from: c */
    public void mo14278c() {
        if (!this.f3639i.getAndSet(true)) {
            final String str = (String) this.f3633c.mo14311a(C1857b.f3116at);
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    WebView tryToCreateWebView = Utils.tryToCreateWebView(C1952l.this.f3633c.mo14297L(), "preloading consent dialog");
                    if (tryToCreateWebView != null) {
                        tryToCreateWebView.loadUrl(str);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo14279d() {
        WeakReference<AppLovinWebViewActivity> weakReference = f3632b;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public void onReceivedEvent(String str) {
        boolean booleanValue;
        C1959m mVar;
        C1857b bVar;
        if ("accepted".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(true, this.f3633c.mo14297L());
            m4394g();
            return;
        }
        if ("rejected".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(false, this.f3633c.mo14297L());
            booleanValue = ((Boolean) this.f3633c.mo14311a(C1857b.f3119aw)).booleanValue();
            mVar = this.f3633c;
            bVar = C1857b.f3072aB;
        } else if ("closed".equalsIgnoreCase(str)) {
            booleanValue = ((Boolean) this.f3633c.mo14311a(C1857b.f3120ax)).booleanValue();
            mVar = this.f3633c;
            bVar = C1857b.f3073aC;
        } else if (AppLovinWebViewActivity.EVENT_DISMISSED_VIA_BACK_BUTTON.equalsIgnoreCase(str)) {
            booleanValue = ((Boolean) this.f3633c.mo14311a(C1857b.f3121ay)).booleanValue();
            mVar = this.f3633c;
            bVar = C1857b.f3074aD;
        } else {
            return;
        }
        m4386a(booleanValue, ((Long) mVar.mo14311a(bVar)).longValue());
    }
}
