package com.ogury.p376ed.internal;

import com.ogury.p376ed.OguryAdClickCallback;
import p394io.presage.interstitial.PresageInterstitialCallback;

/* renamed from: com.ogury.ed.internal.gt */
public class C10569gt implements C10578h {

    /* renamed from: a */
    private final PresageInterstitialCallback f26684a;

    /* renamed from: b */
    private OguryAdClickCallback f26685b;

    public C10569gt(PresageInterstitialCallback presageInterstitialCallback) {
        C10765mq.m32773b(presageInterstitialCallback, "presageInterstitialCallback");
        this.f26684a = presageInterstitialCallback;
    }

    /* renamed from: a */
    public final void mo67509a(OguryAdClickCallback oguryAdClickCallback) {
        this.f26685b = oguryAdClickCallback;
    }

    /* renamed from: b */
    public final void mo67349b() {
        this.f26684a.onAdAvailable();
    }

    /* renamed from: c */
    public final void mo67350c() {
        this.f26684a.onAdNotAvailable();
    }

    /* renamed from: d */
    public final void mo67351d() {
        this.f26684a.onAdLoaded();
    }

    /* renamed from: e */
    public final void mo67352e() {
        this.f26684a.onAdNotLoaded();
    }

    /* renamed from: f */
    public final void mo67353f() {
        this.f26684a.onAdDisplayed();
    }

    /* renamed from: g */
    public final void mo67354g() {
        this.f26684a.onAdClosed();
    }

    /* renamed from: a */
    public final void mo67348a(int i) {
        C10548ga gaVar = C10548ga.f26676a;
        C10545fz fzVar = C10545fz.f26659a;
        C10548ga.m32073b(C10545fz.m32056a(i));
        this.f26684a.onAdError(i);
    }

    /* renamed from: a */
    public void mo67087a() {
        OguryAdClickCallback oguryAdClickCallback = this.f26685b;
        if (oguryAdClickCallback != null) {
            oguryAdClickCallback.onAdClicked();
        }
    }
}
