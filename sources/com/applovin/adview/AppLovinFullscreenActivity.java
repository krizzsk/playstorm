package com.applovin.adview;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.webkit.WebView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.C1531k;
import com.applovin.impl.adview.C1542o;
import com.applovin.impl.adview.activity.C1427a;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.p027b.C1440a;
import com.applovin.impl.adview.activity.p027b.C1463e;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.utils.C2039g;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import java.util.concurrent.atomic.AtomicBoolean;

public class AppLovinFullscreenActivity extends Activity implements C1531k {
    public static C1542o parentInterstitialWrapper;

    /* renamed from: a */
    private C1959m f1497a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1440a f1498b;

    /* renamed from: c */
    private final AtomicBoolean f1499c = new AtomicBoolean(true);

    /* renamed from: d */
    private C1427a f1500d;

    /* renamed from: e */
    private boolean f1501e;

    /* renamed from: a */
    private void m2325a() {
        WindowInsetsController insetsController;
        if (!this.f1501e || !C2039g.m4891j() || (insetsController = getWindow().getInsetsController()) == null) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        insetsController.setSystemBarsBehavior(2);
        insetsController.hide(WindowInsets.Type.systemBars());
    }

    public void dismiss() {
        C1440a aVar = this.f1498b;
        if (aVar != null) {
            aVar.mo12776h();
        } else {
            finish();
        }
    }

    public void onBackPressed() {
        C1440a aVar = this.f1498b;
        if (aVar != null) {
            aVar.mo12780l();
        }
        if (Utils.isAppLovinTestEnvironment(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1440a aVar = this.f1498b;
        if (aVar != null) {
            aVar.mo12760a(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            if (bundle.getBoolean("com.applovin.dismiss_on_restore", false)) {
                if (C2092v.m5047a()) {
                    C2092v.m5052h("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
                }
                dismiss();
                return;
            } else if (C2092v.m5047a()) {
                C2092v.m5050f("AppLovinFullscreenActivity", "Activity was destroyed while in background.");
            }
        }
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        View findViewById = findViewById(16908290);
        findViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        C1959m mVar = AppLovinSdk.getInstance(getIntent().getStringExtra("com.applovin.interstitial.sdk_key"), new AppLovinSdkSettings(this), this).coreSdk;
        this.f1497a = mVar;
        this.f1501e = ((Boolean) mVar.mo14311a(C1857b.f3181cF)).booleanValue();
        if (((Boolean) this.f1497a.mo14311a(C1857b.f3182cG)).booleanValue()) {
            findViewById.setFitsSystemWindows(true);
        }
        m2325a();
        C1542o oVar = parentInterstitialWrapper;
        if (oVar != null) {
            C1440a.m2492a(oVar.mo12988a(), parentInterstitialWrapper.mo12992d(), parentInterstitialWrapper.mo12991c(), parentInterstitialWrapper.mo12990b(), this.f1497a, this, new C1440a.C1452a() {
                /* renamed from: a */
                public void mo12566a(C1440a aVar) {
                    C1440a unused = AppLovinFullscreenActivity.this.f1498b = aVar;
                    aVar.mo12772d();
                }

                /* renamed from: a */
                public void mo12567a(String str, Throwable th) {
                    C1542o.m2843a(AppLovinFullscreenActivity.parentInterstitialWrapper.mo12988a(), AppLovinFullscreenActivity.parentInterstitialWrapper.mo12991c(), str, th, AppLovinFullscreenActivity.this);
                }
            });
            return;
        }
        Intent intent = new Intent(this, FullscreenAdService.class);
        C1427a aVar = new C1427a(this, this.f1497a);
        this.f1500d = aVar;
        bindService(intent, aVar, 1);
        if (C2039g.m4889h()) {
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        parentInterstitialWrapper = null;
        C1427a aVar = this.f1500d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        C1440a aVar2 = this.f1498b;
        if (aVar2 != null) {
            if (!aVar2.mo12777i()) {
                this.f1498b.mo12776h();
            }
            this.f1498b.mo12779k();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C1440a aVar = this.f1498b;
        if (aVar != null) {
            aVar.mo12757a(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C1440a aVar = this.f1498b;
        if (aVar != null) {
            aVar.mo12775g();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C1440a aVar;
        try {
            super.onResume();
            if (!this.f1499c.get() && (aVar = this.f1498b) != null) {
                aVar.mo12774f();
            }
        } catch (IllegalArgumentException e) {
            if (C2092v.m5047a()) {
                this.f1497a.mo14286A().mo14790b("AppLovinFullscreenActivity", "Error was encountered in onResume().", e);
            }
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C1959m mVar = this.f1497a;
        if (mVar != null) {
            bundle.putBoolean("com.applovin.dismiss_on_restore", ((Boolean) mVar.mo14311a(C1857b.f3293eN)).booleanValue());
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C1440a aVar = this.f1498b;
        if (aVar != null) {
            aVar.mo12778j();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.f1498b != null) {
            if (!this.f1499c.getAndSet(false) || (this.f1498b instanceof C1463e)) {
                this.f1498b.mo12771c(z);
            }
            if (z) {
                m2325a();
            }
        }
        super.onWindowFocusChanged(z);
    }

    public void setPresenter(C1440a aVar) {
        this.f1498b = aVar;
    }
}
