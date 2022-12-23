package com.p374my.target;

import android.content.Context;
import android.view.View;
import com.p374my.target.C9874o0;
import com.p374my.target.C9897p3;
import com.p374my.target.common.models.VideoData;
import com.p374my.target.nativeads.NativeBannerAd;
import com.p374my.target.nativeads.banners.NativeBanner;
import java.util.List;

/* renamed from: com.my.target.h1 */
public final class C9731h1 implements C9928r0 {

    /* renamed from: a */
    public final NativeBannerAd f23979a;

    /* renamed from: b */
    public final C9733h2 f23980b;

    /* renamed from: c */
    public final C9722g8 f23981c = C9722g8.m28089a();

    /* renamed from: d */
    public final C9874o0 f23982d;

    /* renamed from: e */
    public final NativeBanner f23983e;

    /* renamed from: f */
    public final C9897p3 f23984f;

    /* renamed from: g */
    public NativeBannerAd.NativeBannerAdMediaListener f23985g;

    /* renamed from: com.my.target.h1$a */
    public static class C9732a implements C9874o0.C9877c {

        /* renamed from: a */
        public final C9731h1 f23986a;

        /* renamed from: b */
        public final NativeBannerAd f23987b;

        public C9732a(C9731h1 h1Var, NativeBannerAd nativeBannerAd) {
            this.f23986a = h1Var;
            this.f23987b = nativeBannerAd;
        }

        /* renamed from: a */
        public void mo64149a(View view) {
            this.f23986a.mo64146b(view);
        }

        /* renamed from: b */
        public void mo64150b() {
            NativeBannerAd.NativeBannerAdMediaListener a = this.f23986a.f23985g;
            if (a != null) {
                a.onIconLoad(this.f23987b);
            }
        }

        public void onClick(View view) {
            this.f23986a.mo64144a(view);
        }
    }

    public C9731h1(NativeBannerAd nativeBannerAd, C9733h2 h2Var, Context context) {
        this.f23979a = nativeBannerAd;
        this.f23980b = h2Var;
        this.f23983e = NativeBanner.newBanner(h2Var);
        this.f23982d = C9874o0.m28863a(h2Var, (C9874o0.C9877c) new C9732a(this, nativeBannerAd));
        this.f23984f = C9897p3.m28962a(h2Var, 2, (C9711g2<VideoData>) null, context);
    }

    /* renamed from: a */
    public static C9731h1 m28125a(NativeBannerAd nativeBannerAd, C9733h2 h2Var, Context context) {
        return new C9731h1(nativeBannerAd, h2Var, context);
    }

    /* renamed from: a */
    public void mo64144a(View view) {
        C9672e0.m27882a("Click received by native banner ad");
        if (view != null) {
            mo64145a(this.f23980b, view);
        }
    }

    /* renamed from: a */
    public void mo63658a(NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener) {
        this.f23985g = nativeBannerAdMediaListener;
    }

    /* renamed from: a */
    public final void mo64145a(C10066z1 z1Var, View view) {
        Context context;
        if (!(z1Var == null || (context = view.getContext()) == null)) {
            this.f23981c.mo64119a(z1Var, context);
        }
        NativeBannerAd.NativeBannerAdListener listener = this.f23979a.getListener();
        if (listener != null) {
            listener.onClick(this.f23979a);
        }
    }

    /* renamed from: b */
    public void mo64146b(View view) {
        C9897p3 p3Var = this.f23984f;
        if (p3Var != null) {
            p3Var.mo65205c();
        }
        C10039x8.m29720c((List<C9626b3>) this.f23980b.getStatHolder().mo63675a("playbackStarted"), view.getContext());
        NativeBannerAd.NativeBannerAdListener listener = this.f23979a.getListener();
        C9672e0.m27882a("Ad shown, banner Id = " + this.f23980b.getId());
        if (listener != null) {
            listener.onShow(this.f23979a);
        }
    }

    /* renamed from: c */
    public String mo64147c() {
        return "myTarget";
    }

    /* renamed from: d */
    public float mo64148d() {
        return 0.0f;
    }

    /* renamed from: h */
    public NativeBanner mo63661h() {
        return this.f23983e;
    }

    public void registerView(View view, List<View> list, int i) {
        unregisterView();
        C9897p3 p3Var = this.f23984f;
        if (p3Var != null) {
            p3Var.mo65200a(view, new C9897p3.C9900c[0]);
        }
        this.f23982d.mo65140a(view, list, i);
    }

    public void unregisterView() {
        this.f23982d.mo65146c();
        C9897p3 p3Var = this.f23984f;
        if (p3Var != null) {
            p3Var.mo65195a();
        }
    }
}
