package com.adcolony.sdk;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class AdColonyInterstitialActivity extends C0730b {

    /* renamed from: j */
    AdColonyInterstitial f156j;

    /* renamed from: k */
    private C0842i f157k;

    public AdColonyInterstitialActivity() {
        AdColonyInterstitial adColonyInterstitial;
        if (!C0714a.m139d()) {
            adColonyInterstitial = null;
        } else {
            adColonyInterstitial = C0714a.m136b().mo10839j();
        }
        this.f156j = adColonyInterstitial;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10415a(C0841h0 h0Var) {
        String e;
        super.mo10415a(h0Var);
        C0781d c = C0714a.m136b().mo10827c();
        C0823f1 f = C0764c0.m334f(h0Var.mo10772a(), "v4iap");
        C0819e1 a = C0764c0.m309a(f, "product_ids");
        AdColonyInterstitial adColonyInterstitial = this.f156j;
        if (!(adColonyInterstitial == null || adColonyInterstitial.getListener() == null || (e = a.mo10697e(0)) == null)) {
            this.f156j.getListener().onIAPEvent(this.f156j, e, C0764c0.m332d(f, "engagement_type"));
        }
        c.mo10649a(this.f251a);
        if (this.f156j != null) {
            c.mo10661f().remove(this.f156j.mo10375b());
            if (this.f156j.getListener() != null) {
                this.f156j.getListener().onClosed(this.f156j);
                this.f156j.mo10370a((C0752c) null);
                this.f156j.setListener((AdColonyInterstitialListener) null);
            }
            this.f156j.mo10398o();
            this.f156j = null;
        }
        C0842i iVar = this.f157k;
        if (iVar != null) {
            iVar.mo10777a();
            this.f157k = null;
        }
    }

    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        int i;
        AdColonyInterstitial adColonyInterstitial;
        AdColonyInterstitial adColonyInterstitial2 = this.f156j;
        if (adColonyInterstitial2 == null) {
            i = -1;
        } else {
            i = adColonyInterstitial2.mo10386f();
        }
        this.f252b = i;
        super.onCreate(bundle);
        if (C0714a.m139d() && (adColonyInterstitial = this.f156j) != null) {
            C0930p0 e = adColonyInterstitial.mo10384e();
            if (e != null) {
                e.mo10939a(this.f251a);
            }
            this.f157k = new C0842i(new Handler(Looper.getMainLooper()), this.f156j);
            if (this.f156j.getListener() != null) {
                this.f156j.getListener().onOpened(this.f156j);
            }
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
