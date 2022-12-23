package com.p374my.target;

import android.content.Context;
import android.view.View;
import com.p374my.target.C9853n0;
import com.p374my.target.C9897p3;
import com.p374my.target.common.models.VideoData;
import com.p374my.target.nativeads.NativeAd;
import com.p374my.target.nativeads.banners.NativePromoBanner;
import com.p374my.target.nativeads.views.MediaAdView;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.f1 */
public final class C9695f1 implements C9914q0 {

    /* renamed from: a */
    public final NativeAd f23864a;

    /* renamed from: b */
    public final ArrayList<C9751i2> f23865b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<C9751i2> f23866c = new ArrayList<>();

    /* renamed from: d */
    public final C9733h2 f23867d;

    /* renamed from: e */
    public final C9722g8 f23868e = C9722g8.m28089a();

    /* renamed from: f */
    public final C9853n0 f23869f;

    /* renamed from: g */
    public final NativePromoBanner f23870g;

    /* renamed from: h */
    public final C9897p3 f23871h;

    /* renamed from: i */
    public NativeAd.NativeAdMediaListener f23872i;

    /* renamed from: j */
    public boolean f23873j;

    /* renamed from: com.my.target.f1$a */
    public static class C9696a implements C9853n0.C9856c {

        /* renamed from: a */
        public final C9695f1 f23874a;

        /* renamed from: b */
        public final NativeAd f23875b;

        public C9696a(C9695f1 f1Var, NativeAd nativeAd) {
            this.f23874a = f1Var;
            this.f23875b = nativeAd;
        }

        /* renamed from: a */
        public void mo63985a(int i, Context context) {
            this.f23874a.mo63972a(i, context);
        }

        /* renamed from: a */
        public void mo63986a(View view) {
            this.f23874a.mo63980b(view);
        }

        /* renamed from: a */
        public void mo63987a(View view, int i) {
            this.f23874a.mo63974a(view, i);
        }

        /* renamed from: a */
        public void mo63988a(C9777j2 j2Var, String str, Context context) {
            this.f23874a.mo63975a(j2Var, str, context);
        }

        /* renamed from: a */
        public void mo63989a(int[] iArr, Context context) {
            this.f23874a.mo63978a(iArr, context);
        }

        /* renamed from: b */
        public void mo63990b() {
            NativeAd.NativeAdMediaListener a = this.f23874a.f23872i;
            if (a != null) {
                a.onIconLoad(this.f23875b);
            }
        }

        /* renamed from: c */
        public void mo63991c() {
            this.f23874a.mo63979b();
        }

        /* renamed from: d */
        public void mo63992d() {
            this.f23874a.mo63983e();
        }

        /* renamed from: e */
        public void mo63993e() {
            this.f23874a.mo63971a();
        }

        /* renamed from: f */
        public void mo63994f() {
            this.f23874a.mo63984f();
        }

        /* renamed from: g */
        public void mo63995g() {
            NativeAd.NativeAdMediaListener a = this.f23874a.f23872i;
            if (a != null) {
                a.onImageLoad(this.f23875b);
            }
        }

        public void onClick(View view) {
            this.f23874a.mo63973a(view);
        }
    }

    public C9695f1(NativeAd nativeAd, C9733h2 h2Var, Context context) {
        this.f23864a = nativeAd;
        this.f23867d = h2Var;
        this.f23870g = NativePromoBanner.newBanner(h2Var);
        C9711g2<VideoData> videoBanner = h2Var.getVideoBanner();
        C9897p3 a = C9897p3.m28962a(h2Var, videoBanner != null ? 3 : 2, videoBanner, context);
        this.f23871h = a;
        C9750i1 a2 = C9750i1.m28217a(a, context);
        a2.mo64234a(nativeAd.isUseExoPlayer());
        this.f23869f = C9853n0.m28755a(h2Var, (C9853n0.C9856c) new C9696a(this, nativeAd), a2);
    }

    /* renamed from: a */
    public static C9695f1 m27984a(NativeAd nativeAd, C9733h2 h2Var, Context context) {
        return new C9695f1(nativeAd, h2Var, context);
    }

    /* renamed from: a */
    public void mo63971a() {
        NativeAd.NativeAdListener listener = this.f23864a.getListener();
        if (listener != null) {
            listener.onVideoComplete(this.f23864a);
        }
    }

    /* renamed from: a */
    public void mo63972a(int i, Context context) {
        List<C9751i2> nativeAdCards = this.f23867d.getNativeAdCards();
        C9751i2 i2Var = (i < 0 || i >= nativeAdCards.size()) ? null : nativeAdCards.get(i);
        if (i2Var != null && !this.f23866c.contains(i2Var)) {
            C10039x8.m29720c((List<C9626b3>) i2Var.getStatHolder().mo63675a("render"), context);
            this.f23866c.add(i2Var);
        }
    }

    /* renamed from: a */
    public void mo63973a(View view) {
        C9672e0.m27882a("Click received by native ad");
        if (view != null) {
            mo63976a((C10066z1) this.f23867d, view.getContext());
        }
    }

    /* renamed from: a */
    public void mo63974a(View view, int i) {
        C9672e0.m27882a("Click on native card received");
        List<C9751i2> nativeAdCards = this.f23867d.getNativeAdCards();
        if (i >= 0 && i < nativeAdCards.size()) {
            mo63976a((C10066z1) nativeAdCards.get(i), view.getContext());
        }
        C9641c3 statHolder = this.f23867d.getStatHolder();
        Context context = view.getContext();
        if (context != null) {
            C10039x8.m29720c((List<C9626b3>) statHolder.mo63675a("click"), context);
        }
    }

    /* renamed from: a */
    public void mo63573a(View view, List<View> list, int i, MediaAdView mediaAdView) {
        unregisterView();
        C9897p3 p3Var = this.f23871h;
        if (p3Var != null) {
            p3Var.mo65200a(view, new C9897p3.C9900c[0]);
        }
        this.f23869f.mo64812a(view, list, i, mediaAdView);
    }

    /* renamed from: a */
    public void mo63975a(C9777j2 j2Var, String str, Context context) {
        C9672e0.m27882a("Click on native content received");
        mo63977a((C10066z1) j2Var, str, context);
        C10039x8.m29720c((List<C9626b3>) this.f23867d.getStatHolder().mo63675a("click"), context);
    }

    /* renamed from: a */
    public void mo63576a(NativeAd.NativeAdMediaListener nativeAdMediaListener) {
        this.f23872i = nativeAdMediaListener;
    }

    /* renamed from: a */
    public final void mo63976a(C10066z1 z1Var, Context context) {
        mo63977a(z1Var, (String) null, context);
    }

    /* renamed from: a */
    public final void mo63977a(C10066z1 z1Var, String str, Context context) {
        if (z1Var != null) {
            if (str != null) {
                this.f23868e.mo64120a(z1Var, str, context);
            } else {
                this.f23868e.mo64119a(z1Var, context);
            }
        }
        NativeAd.NativeAdListener listener = this.f23864a.getListener();
        if (listener != null) {
            listener.onClick(this.f23864a);
        }
    }

    /* renamed from: a */
    public void mo63978a(int[] iArr, Context context) {
        if (this.f23873j) {
            List<C9751i2> nativeAdCards = this.f23867d.getNativeAdCards();
            for (int i : iArr) {
                C9751i2 i2Var = null;
                if (i >= 0 && i < nativeAdCards.size()) {
                    i2Var = nativeAdCards.get(i);
                }
                if (i2Var != null && !this.f23865b.contains(i2Var)) {
                    C10039x8.m29720c((List<C9626b3>) i2Var.getStatHolder().mo63675a("playbackStarted"), context);
                    C10039x8.m29720c((List<C9626b3>) i2Var.getStatHolder().mo63675a(TJAdUnitConstants.String.BEACON_SHOW_PATH), context);
                    this.f23865b.add(i2Var);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo63979b() {
        C9672e0.m27882a("Video error");
        this.f23869f.mo64809a();
    }

    /* renamed from: b */
    public void mo63980b(View view) {
        C9897p3 p3Var = this.f23871h;
        if (p3Var != null) {
            p3Var.mo65205c();
        }
        if (!this.f23873j) {
            this.f23873j = true;
            C10039x8.m29720c((List<C9626b3>) this.f23867d.getStatHolder().mo63675a("playbackStarted"), view.getContext());
            int[] b = this.f23869f.mo64823b();
            if (b != null) {
                mo63978a(b, view.getContext());
            }
            NativeAd.NativeAdListener listener = this.f23864a.getListener();
            C9672e0.m27882a("Ad shown, banner Id = " + this.f23867d.getId());
            if (listener != null) {
                listener.onShow(this.f23864a);
            }
        }
    }

    /* renamed from: c */
    public String mo63981c() {
        return "myTarget";
    }

    /* renamed from: d */
    public float mo63982d() {
        return 0.0f;
    }

    /* renamed from: e */
    public void mo63983e() {
        NativeAd.NativeAdListener listener = this.f23864a.getListener();
        if (listener != null) {
            listener.onVideoPause(this.f23864a);
        }
    }

    /* renamed from: f */
    public void mo63984f() {
        NativeAd.NativeAdListener listener = this.f23864a.getListener();
        if (listener != null) {
            listener.onVideoPlay(this.f23864a);
        }
    }

    /* renamed from: g */
    public NativePromoBanner mo63579g() {
        return this.f23870g;
    }

    public void unregisterView() {
        this.f23869f.mo64833f();
        C9897p3 p3Var = this.f23871h;
        if (p3Var != null) {
            p3Var.mo65195a();
        }
    }
}
