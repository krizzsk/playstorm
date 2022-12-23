package com.adcolony.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.adcolony.sdk.b */
class C0730b extends Activity {

    /* renamed from: a */
    C0752c f251a;

    /* renamed from: b */
    int f252b = -1;

    /* renamed from: c */
    int f253c;

    /* renamed from: d */
    boolean f254d;

    /* renamed from: e */
    boolean f255e;

    /* renamed from: f */
    boolean f256f;

    /* renamed from: g */
    boolean f257g;

    /* renamed from: h */
    boolean f258h;

    /* renamed from: i */
    boolean f259i;

    /* renamed from: com.adcolony.sdk.b$a */
    class C0731a implements C0856j0 {
        C0731a() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0730b.this.mo10415a(h0Var);
        }
    }

    C0730b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10496a(boolean z) {
        Iterator<Map.Entry<Integer, C0719a1>> it = this.f251a.mo10593m().entrySet().iterator();
        while (it.hasNext() && !isFinishing()) {
            C0719a1 a1Var = (C0719a1) it.next().getValue();
            if (!a1Var.mo10475f() && a1Var.mo10471b().isPlaying()) {
                a1Var.mo10476h();
            }
        }
        AdColonyInterstitial j = C0714a.m136b().mo10839j();
        if (j != null && j.mo10392i() && j.mo10384e().mo10943c() != null && z && this.f258h) {
            j.mo10384e().mo10940a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10497b(boolean z) {
        for (Map.Entry<Integer, C0719a1> value : this.f251a.mo10593m().entrySet()) {
            C0719a1 a1Var = (C0719a1) value.getValue();
            if (!a1Var.mo10475f() && !a1Var.mo10471b().isPlaying() && !C0714a.m136b().mo10844o().mo11018b()) {
                a1Var.mo10477i();
            }
        }
        AdColonyInterstitial j = C0714a.m136b().mo10839j();
        if (j != null && j.mo10392i() && j.mo10384e().mo10943c() != null) {
            if ((!z || !this.f258h) && this.f259i) {
                j.mo10384e().mo10940a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
            }
        }
    }

    public void onBackPressed() {
        C0823f1 b = C0764c0.m322b();
        C0764c0.m319a(b, "id", this.f251a.mo10563a());
        new C0841h0("AdSession.on_back_button", this.f251a.mo10591k(), b).mo10776c();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this instanceof AdColonyInterstitialActivity) {
            mo10494a();
        } else {
            ((AdColonyAdViewActivity) this).mo10298c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C0714a.m139d() || C0714a.m136b().mo10841l() == null) {
            finish();
            return;
        }
        C0857k b = C0714a.m136b();
        this.f256f = false;
        C0752c l = b.mo10841l();
        this.f251a = l;
        l.mo10577d(false);
        if (C1038z0.m1218g()) {
            this.f251a.mo10577d(true);
        }
        this.f251a.mo10563a();
        this.f253c = this.f251a.mo10591k();
        boolean multiWindowEnabled = b.mo10850u().getMultiWindowEnabled();
        this.f257g = multiWindowEnabled;
        if (multiWindowEnabled) {
            getWindow().addFlags(2048);
            getWindow().clearFlags(1024);
        } else {
            getWindow().addFlags(1024);
            getWindow().clearFlags(2048);
        }
        requestWindowFeature(1);
        getWindow().getDecorView().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        if (b.mo10850u().getKeepScreenOn()) {
            getWindow().addFlags(128);
        }
        ViewParent parent = this.f251a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.f251a);
        }
        setContentView(this.f251a);
        this.f251a.mo10587i().add(C0714a.m130a("AdSession.finish_fullscreen_ad", (C0856j0) new C0731a(), true));
        this.f251a.mo10589j().add("AdSession.finish_fullscreen_ad");
        mo10495a(this.f252b);
        if (!this.f251a.mo10595o()) {
            C0823f1 b2 = C0764c0.m322b();
            C0764c0.m319a(b2, "id", this.f251a.mo10563a());
            C0764c0.m326b(b2, "screen_width", this.f251a.mo10575d());
            C0764c0.m326b(b2, "screen_height", this.f251a.mo10569b());
            new C0841h0("AdSession.on_fullscreen_ad_started", this.f251a.mo10591k(), b2).mo10776c();
            this.f251a.mo10579e(true);
            return;
        }
        mo10494a();
    }

    public void onDestroy() {
        super.onDestroy();
        if (C0714a.m139d() && this.f251a != null && !this.f254d) {
            if ((Build.VERSION.SDK_INT < 24 || !C1038z0.m1218g()) && !this.f251a.mo10599q()) {
                C0823f1 b = C0764c0.m322b();
                C0764c0.m319a(b, "id", this.f251a.mo10563a());
                new C0841h0("AdSession.on_error", this.f251a.mo10591k(), b).mo10776c();
                this.f256f = true;
            }
        }
    }

    public void onPause() {
        super.onPause();
        mo10496a(this.f255e);
        this.f255e = false;
    }

    public void onResume() {
        super.onResume();
        mo10494a();
        mo10497b(this.f255e);
        this.f255e = true;
        this.f259i = true;
    }

    public void onWindowFocusChanged(boolean z) {
        if (z && this.f255e) {
            C0714a.m136b().mo10853x().mo11049b(true);
            mo10497b(this.f255e);
            this.f258h = true;
        } else if (!z && this.f255e) {
            C0714a.m136b().mo10853x().mo11047a(true);
            mo10496a(this.f255e);
            this.f258h = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10494a() {
        Rect rect;
        C0857k b = C0714a.m136b();
        if (this.f251a == null) {
            this.f251a = b.mo10841l();
        }
        C0752c cVar = this.f251a;
        if (cVar != null) {
            cVar.mo10577d(false);
            if (C1038z0.m1218g()) {
                this.f251a.mo10577d(true);
            }
            if (this.f257g) {
                rect = b.mo10843n().mo11001x();
            } else {
                rect = b.mo10843n().mo11000w();
            }
            if (rect.width() > 0 && rect.height() > 0) {
                C0823f1 b2 = C0764c0.m322b();
                C0823f1 b3 = C0764c0.m322b();
                float s = b.mo10843n().mo10996s();
                C0764c0.m326b(b3, "width", (int) (((float) rect.width()) / s));
                C0764c0.m326b(b3, "height", (int) (((float) rect.height()) / s));
                C0764c0.m326b(b3, "app_orientation", C1038z0.m1209d(C1038z0.m1216f()));
                C0764c0.m326b(b3, "x", 0);
                C0764c0.m326b(b3, "y", 0);
                C0764c0.m319a(b3, "ad_session_id", this.f251a.mo10563a());
                C0764c0.m326b(b2, "screen_width", rect.width());
                C0764c0.m326b(b2, "screen_height", rect.height());
                C0764c0.m319a(b2, "ad_session_id", this.f251a.mo10563a());
                C0764c0.m326b(b2, "id", this.f251a.mo10572c());
                this.f251a.setLayoutParams(new FrameLayout.LayoutParams(rect.width(), rect.height()));
                this.f251a.mo10571b(rect.width());
                this.f251a.mo10564a(rect.height());
                new C0841h0("MRAID.on_size_change", this.f251a.mo10591k(), b3).mo10776c();
                new C0841h0("AdContainer.on_orientation_change", this.f251a.mo10591k(), b2).mo10776c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10415a(C0841h0 h0Var) {
        int d = C0764c0.m332d(h0Var.mo10772a(), "status");
        if ((d == 5 || d == 0 || d == 6 || d == 1) && !this.f254d) {
            C0857k b = C0714a.m136b();
            C0944r o = b.mo10844o();
            b.mo10830d(h0Var);
            if (o.mo11016a() != null) {
                o.mo11016a().dismiss();
                o.mo11017a((AlertDialog) null);
            }
            if (!this.f256f) {
                finish();
            }
            this.f254d = true;
            ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            b.mo10833e(false);
            C0823f1 b2 = C0764c0.m322b();
            C0764c0.m319a(b2, "id", this.f251a.mo10563a());
            new C0841h0("AdSession.on_close", this.f251a.mo10591k(), b2).mo10776c();
            b.mo10822a((C0752c) null);
            b.mo10820a((AdColonyInterstitial) null);
            b.mo10817a((AdColonyAdView) null);
            C0714a.m136b().mo10827c().mo10661f().remove(this.f251a.mo10563a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10495a(int i) {
        if (i == 0) {
            setRequestedOrientation(7);
        } else if (i != 1) {
            setRequestedOrientation(4);
        } else {
            setRequestedOrientation(6);
        }
        this.f252b = i;
    }
}
