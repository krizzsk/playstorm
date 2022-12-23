package com.p374my.target;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.p374my.target.C10018w4;
import com.p374my.target.C9707g0;
import com.p374my.target.C9887o7;
import com.p374my.target.C9894p1;
import com.p374my.target.C9903p4;
import com.p374my.target.C9947s4;
import com.p374my.target.C9955s7;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.common.models.VideoData;
import com.tapjoy.TJAdUnitConstants;
import java.util.List;

/* renamed from: com.my.target.u4 */
public final class C9986u4 implements C9903p4, C9955s7.C9956a, C9947s4.C9948a, C9887o7.C9888a, C10018w4.C10019a {

    /* renamed from: a */
    public final C9697f2 f24774a;

    /* renamed from: b */
    public final C9988b f24775b;

    /* renamed from: c */
    public final C9955s7 f24776c;

    /* renamed from: d */
    public final C9989c f24777d;

    /* renamed from: e */
    public final C9926q7 f24778e;

    /* renamed from: f */
    public final Handler f24779f;

    /* renamed from: g */
    public final Runnable f24780g = new Runnable() {
        public final void run() {
            C9986u4.this.mo65549s();
        }
    };

    /* renamed from: h */
    public C9860n4 f24781h;

    /* renamed from: i */
    public C9730h0 f24782i;

    /* renamed from: j */
    public C9987a f24783j = C9987a.DISABLED;

    /* renamed from: k */
    public long f24784k;

    /* renamed from: l */
    public long f24785l;

    /* renamed from: m */
    public boolean f24786m;

    /* renamed from: n */
    public boolean f24787n;

    /* renamed from: com.my.target.u4$a */
    public enum C9987a {
        DISABLED,
        RULED_BY_POST,
        RULED_BY_VIDEO
    }

    /* renamed from: com.my.target.u4$b */
    public interface C9988b extends C9903p4.C9904a {
        /* renamed from: a */
        void mo65554a(Context context);
    }

    /* renamed from: com.my.target.u4$c */
    public static class C9989c implements Runnable {

        /* renamed from: a */
        public final C9986u4 f24792a;

        public C9989c(C9986u4 u4Var) {
            this.f24792a = u4Var;
        }

        public void run() {
            if (this.f24792a.mo65548r()) {
                this.f24792a.mo65550t();
            } else {
                this.f24792a.mo65552v();
            }
        }
    }

    public C9986u4(C9863n7 n7Var, C9697f2 f2Var, C9988b bVar) {
        this.f24774a = f2Var;
        this.f24775b = bVar;
        this.f24779f = n7Var.mo64890d();
        C9926q7 e = n7Var.mo64891e();
        this.f24778e = e;
        e.setColor(f2Var.getPromoStyleSettings().mo65596h());
        C9887o7 a = n7Var.mo64881a((C9887o7.C9888a) this);
        a.setBanner(f2Var);
        C9711g2<VideoData> videoBanner = f2Var.getVideoBanner();
        List<C9640c2> interstitialAdCards = f2Var.getInterstitialAdCards();
        if (!interstitialAdCards.isEmpty()) {
            C9686e8 c = n7Var.mo64889c();
            n7Var.mo64885a(c, interstitialAdCards, (C10018w4.C10019a) this);
            this.f24776c = n7Var.mo64883a(f2Var, a.mo65181a(), e.mo65315a(), c, this);
        } else if (videoBanner != null) {
            C10055y5 b = n7Var.mo64888b();
            C9955s7 a2 = n7Var.mo64883a(f2Var, a.mo65181a(), e.mo65315a(), b, this);
            this.f24776c = a2;
            b.mo65764a(videoBanner.getWidth(), videoBanner.getHeight());
            this.f24781h = n7Var.mo64880a(videoBanner, b, (C9947s4.C9948a) this);
            e.setMaxTime(videoBanner.getDuration());
            ImageData preview = videoBanner.getPreview();
            a2.setBackgroundImage(preview == null ? f2Var.getImage() : preview);
        } else {
            C9955s7 a3 = n7Var.mo64883a(f2Var, a.mo65181a(), e.mo65315a(), (View) null, this);
            this.f24776c = a3;
            a3.mo65400f();
            a3.setBackgroundImage(f2Var.getImage());
        }
        this.f24776c.setBanner(f2Var);
        this.f24777d = new C9989c(this);
        mo65543a(f2Var);
        bVar.mo65210a((C10066z1) f2Var, this.f24776c.mo65391a());
        mo65544a(f2Var.getAdChoices());
    }

    /* renamed from: a */
    public static C9986u4 m29464a(C9863n7 n7Var, C9697f2 f2Var, C9988b bVar) {
        return new C9986u4(n7Var, f2Var, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29465a(Context context) {
        mo65547q();
    }

    /* renamed from: a */
    public void mo64581a() {
        if (this.f24783j != C9987a.DISABLED && this.f24784k > 0) {
            mo65552v();
        }
        mo65553w();
    }

    /* renamed from: a */
    public void mo65371a(float f, float f2) {
        if (this.f24783j == C9987a.RULED_BY_VIDEO) {
            this.f24784k = (long) (((float) this.f24785l) - (1000.0f * f));
        }
        this.f24778e.setTimeChanged(f);
    }

    /* renamed from: a */
    public final void mo65543a(C9697f2 f2Var) {
        C9987a aVar;
        C9711g2<VideoData> videoBanner = f2Var.getVideoBanner();
        if (videoBanner != null && videoBanner.isAutoPlay()) {
            if (videoBanner.isAllowClose()) {
                long allowCloseDelay = (long) (videoBanner.getAllowCloseDelay() * 1000.0f);
                this.f24785l = allowCloseDelay;
                this.f24784k = allowCloseDelay;
                if (allowCloseDelay > 0) {
                    aVar = C9987a.RULED_BY_VIDEO;
                }
                mo65550t();
                return;
            }
            this.f24776c.mo65399e();
            return;
        } else if (f2Var.isAllowClose()) {
            long allowCloseDelay2 = (long) (f2Var.getAllowCloseDelay() * 1000.0f);
            this.f24785l = allowCloseDelay2;
            this.f24784k = allowCloseDelay2;
            if (allowCloseDelay2 > 0) {
                C9672e0.m27882a("banner will be allowed to close in " + this.f24784k + " millis");
                aVar = C9987a.RULED_BY_POST;
            } else {
                C9672e0.m27882a("banner is allowed to close");
                mo65550t();
                return;
            }
        } else {
            this.f24783j = C9987a.DISABLED;
            this.f24776c.mo65399e();
            return;
        }
        this.f24783j = aVar;
        mo65552v();
    }

    /* renamed from: a */
    public final void mo65544a(C9894p1 p1Var) {
        List<C9894p1.C9895a> a;
        if (p1Var != null && (a = p1Var.mo65191a()) != null) {
            C9730h0 a2 = C9730h0.m28115a(a);
            this.f24782i = a2;
            a2.mo64137a((C9707g0.C9709b) new C9707g0.C9709b() {
                /* renamed from: a */
                public final void mo63363a(Context context) {
                    C9986u4.this.m29465a(context);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo65406a(C10066z1 z1Var) {
        if (z1Var != null) {
            this.f24775b.mo65211a(z1Var, (String) null, mo64595j().getContext());
        } else {
            this.f24775b.mo65211a(this.f24774a, (String) null, mo64595j().getContext());
        }
    }

    /* renamed from: a */
    public void mo65407a(boolean z) {
        C9996v1 promoStyleSettings = this.f24774a.getPromoStyleSettings();
        int b = promoStyleSettings.mo65584b();
        int argb = Color.argb((int) (promoStyleSettings.mo65586c() * 255.0f), Color.red(b), Color.green(b), Color.blue(b));
        C9955s7 s7Var = this.f24776c;
        if (z) {
            b = argb;
        }
        s7Var.setPanelColor(b);
    }

    /* renamed from: b */
    public void mo64587b() {
        C9860n4 n4Var = this.f24781h;
        if (n4Var != null) {
            n4Var.mo64867i();
        }
        this.f24779f.removeCallbacks(this.f24777d);
        mo65553w();
    }

    /* renamed from: b */
    public void mo65408b(int i) {
        C9860n4 n4Var = this.f24781h;
        if (n4Var != null) {
            n4Var.mo64869q();
        }
        mo65553w();
    }

    /* renamed from: b */
    public void mo65545b(C10066z1 z1Var) {
        C10039x8.m29720c((List<C9626b3>) z1Var.getStatHolder().mo63675a("playbackStarted"), this.f24776c.mo65391a().getContext());
        C10039x8.m29720c((List<C9626b3>) z1Var.getStatHolder().mo63675a(TJAdUnitConstants.String.BEACON_SHOW_PATH), this.f24776c.mo65391a().getContext());
    }

    /* renamed from: c */
    public void mo65372c() {
        this.f24776c.mo65397c(false);
        this.f24776c.mo65394a(true);
        this.f24776c.mo65400f();
        this.f24776c.mo65395b(false);
        this.f24776c.mo65398d();
        this.f24778e.setVisible(false);
        mo65550t();
    }

    /* renamed from: c */
    public void mo65546c(C10066z1 z1Var) {
        C10039x8.m29720c((List<C9626b3>) z1Var.getStatHolder().mo63675a("render"), this.f24776c.mo65391a().getContext());
    }

    /* renamed from: d */
    public void mo65409d() {
        C9894p1 adChoices = this.f24774a.getAdChoices();
        if (adChoices != null) {
            mo65553w();
            C9730h0 h0Var = this.f24782i;
            if (h0Var == null || !h0Var.mo64142c()) {
                Context context = this.f24776c.mo65391a().getContext();
                C9730h0 h0Var2 = this.f24782i;
                if (h0Var2 == null) {
                    C9832l8.m28605a(adChoices.mo65193b(), context);
                } else {
                    h0Var2.mo64136a(context);
                }
            }
        }
    }

    public void destroy() {
        C9860n4 n4Var = this.f24781h;
        if (n4Var != null) {
            n4Var.destroy();
        }
        mo65553w();
    }

    /* renamed from: e */
    public void mo64593e() {
        C9860n4 n4Var = this.f24781h;
        if (n4Var != null) {
            n4Var.mo64867i();
        }
        mo65553w();
    }

    /* renamed from: f */
    public void mo65373f() {
        this.f24776c.mo65397c(true);
        this.f24776c.mo65393a(0, (String) null);
        this.f24776c.mo65395b(false);
    }

    /* renamed from: g */
    public void mo65374g() {
        this.f24776c.mo65397c(true);
        this.f24776c.mo65400f();
        this.f24776c.mo65394a(false);
        this.f24776c.mo65395b(true);
        this.f24778e.setVisible(true);
    }

    public View getCloseButton() {
        return this.f24776c.getCloseButton();
    }

    /* renamed from: h */
    public void mo65375h() {
        this.f24776c.mo65397c(false);
        this.f24776c.mo65394a(false);
        this.f24776c.mo65400f();
        this.f24776c.mo65395b(false);
    }

    /* renamed from: i */
    public void mo65410i() {
        C9860n4 n4Var = this.f24781h;
        if (n4Var != null) {
            n4Var.mo64864d();
        }
    }

    /* renamed from: j */
    public View mo64595j() {
        return this.f24776c.mo65391a();
    }

    /* renamed from: k */
    public void mo65376k() {
        this.f24776c.mo65397c(false);
        this.f24776c.mo65394a(false);
        this.f24776c.mo65400f();
        this.f24776c.mo65395b(false);
        this.f24778e.setVisible(true);
    }

    /* renamed from: l */
    public void mo65377l() {
        this.f24776c.mo65397c(true);
        this.f24776c.mo65393a(0, (String) null);
        this.f24776c.mo65395b(false);
        this.f24778e.setVisible(false);
    }

    /* renamed from: m */
    public void mo65411m() {
        C9860n4 n4Var = this.f24781h;
        if (n4Var != null) {
            n4Var.mo64866e();
        }
        mo65553w();
        this.f24775b.mo65208a();
    }

    /* renamed from: n */
    public void mo65412n() {
        mo65553w();
        String adIconClickLink = this.f24774a.getAdIconClickLink();
        if (adIconClickLink != null) {
            C9832l8.m28605a(adIconClickLink, this.f24776c.mo65391a().getContext());
        }
    }

    /* renamed from: o */
    public void mo65413o() {
        if (!this.f24787n) {
            this.f24776c.mo65397c(true);
            this.f24776c.mo65393a(1, (String) null);
            this.f24776c.mo65395b(false);
            mo65553w();
            this.f24779f.postDelayed(this.f24780g, 4000);
            this.f24786m = true;
        } else if (this.f24774a.getClickArea().f24586f) {
            mo65406a((C10066z1) null);
        }
    }

    public void onVideoCompleted() {
        C9711g2<VideoData> videoBanner = this.f24774a.getVideoBanner();
        if (videoBanner != null) {
            if (videoBanner.isAllowReplay()) {
                this.f24776c.mo65393a(2, !TextUtils.isEmpty(videoBanner.getReplayActionText()) ? videoBanner.getReplayActionText() : null);
                this.f24776c.mo65397c(true);
            } else {
                this.f24787n = true;
            }
        }
        this.f24776c.mo65394a(true);
        this.f24776c.mo65395b(false);
        this.f24778e.setVisible(false);
        this.f24778e.setTimeChanged(0.0f);
        this.f24775b.mo65554a(this.f24776c.mo65391a().getContext());
        mo65550t();
    }

    public void onVolumeChanged(float f) {
        this.f24776c.setSoundState(f != 0.0f);
    }

    /* renamed from: p */
    public void mo65414p() {
        if (this.f24786m) {
            mo65549s();
        }
    }

    /* renamed from: q */
    public void mo65547q() {
        C9860n4 n4Var = this.f24781h;
        if (n4Var != null) {
            n4Var.destroy();
        }
        mo65553w();
        this.f24775b.mo65209a((C10066z1) this.f24774a, mo64595j().getContext());
    }

    /* renamed from: r */
    public final boolean mo65548r() {
        C9987a aVar = this.f24783j;
        if (aVar == C9987a.DISABLED) {
            return true;
        }
        if (aVar == C9987a.RULED_BY_POST) {
            this.f24784k -= 200;
        }
        return this.f24784k <= 0;
    }

    /* renamed from: s */
    public final void mo65549s() {
        if (this.f24786m) {
            mo65553w();
            this.f24776c.mo65397c(false);
            this.f24776c.mo65400f();
            this.f24786m = false;
        }
    }

    /* renamed from: t */
    public final void mo65550t() {
        this.f24776c.mo65396c();
        this.f24779f.removeCallbacks(this.f24777d);
        this.f24783j = C9987a.DISABLED;
    }

    /* renamed from: u */
    public void mo65551u() {
        C9860n4 n4Var = this.f24781h;
        if (n4Var != null) {
            n4Var.mo64868k();
        }
    }

    /* renamed from: v */
    public final void mo65552v() {
        this.f24779f.removeCallbacks(this.f24777d);
        this.f24779f.postDelayed(this.f24777d, 200);
        float f = (float) this.f24785l;
        long j = this.f24784k;
        this.f24776c.mo65392a((int) ((j / 1000) + 1), (f - ((float) j)) / f);
    }

    /* renamed from: w */
    public final void mo65553w() {
        this.f24786m = false;
        this.f24779f.removeCallbacks(this.f24780g);
    }
}
