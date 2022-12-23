package com.adcolony.sdk;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;

public class AdColonyAdViewActivity extends C0730b {

    /* renamed from: j */
    AdColonyAdView f113j;

    public AdColonyAdViewActivity() {
        AdColonyAdView adColonyAdView;
        if (!C0714a.m139d()) {
            adColonyAdView = null;
        } else {
            adColonyAdView = C0714a.m136b().mo10840k();
        }
        this.f113j = adColonyAdView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10297b() {
        ViewParent parent = this.f251a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f251a);
        }
        this.f113j.mo10268a();
        C0714a.m136b().mo10817a((AdColonyAdView) null);
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10298c() {
        this.f113j.mo10269b();
    }

    public void onBackPressed() {
        mo10297b();
    }

    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        AdColonyAdView adColonyAdView;
        if (!C0714a.m139d() || (adColonyAdView = this.f113j) == null) {
            C0714a.m136b().mo10817a((AdColonyAdView) null);
            finish();
            return;
        }
        this.f252b = adColonyAdView.getOrientation();
        super.onCreate(bundle);
        this.f113j.mo10269b();
        AdColonyAdViewListener listener = this.f113j.getListener();
        if (listener != null) {
            listener.onOpened(this.f113j);
        }
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    public /* bridge */ /* synthetic */ void onResume() {
        super.onResume();
    }

    public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
