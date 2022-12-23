package com.bytedance.sdk.openadsdk.core;

import com.bykv.p068vk.openvk.component.video.api.p086d.C2526c;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.com.bytedance.overseas.sdk.p186a.C4026c;

/* renamed from: com.bytedance.sdk.openadsdk.core.t */
/* compiled from: SingleAppData */
public class C3645t {

    /* renamed from: a */
    private static C3645t f9252a;

    /* renamed from: b */
    private C2526c f9253b;

    /* renamed from: c */
    private boolean f9254c = true;

    /* renamed from: d */
    private C3498n f9255d;

    /* renamed from: e */
    private TTRewardVideoAd.RewardAdInteractionListener f9256e;

    /* renamed from: f */
    private C4026c f9257f;

    /* renamed from: g */
    private TTFullScreenVideoAd.FullScreenVideoAdInteractionListener f9258g;

    /* renamed from: h */
    private TTAppOpenAd.AppOpenAdInteractionListener f9259h;

    /* renamed from: i */
    private boolean f9260i = false;

    private C3645t() {
    }

    /* renamed from: a */
    public static C3645t m11590a() {
        if (f9252a == null) {
            f9252a = new C3645t();
        }
        return f9252a;
    }

    /* renamed from: a */
    public void mo20222a(boolean z) {
        this.f9254c = z;
    }

    /* renamed from: b */
    public boolean mo20224b() {
        return this.f9254c;
    }

    /* renamed from: c */
    public C3498n mo20225c() {
        return this.f9255d;
    }

    /* renamed from: a */
    public void mo20220a(C3498n nVar) {
        this.f9255d = nVar;
    }

    /* renamed from: d */
    public TTRewardVideoAd.RewardAdInteractionListener mo20226d() {
        return this.f9256e;
    }

    /* renamed from: e */
    public TTFullScreenVideoAd.FullScreenVideoAdInteractionListener mo20227e() {
        return this.f9258g;
    }

    /* renamed from: f */
    public TTAppOpenAd.AppOpenAdInteractionListener mo20228f() {
        return this.f9259h;
    }

    /* renamed from: a */
    public void mo20218a(TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener) {
        this.f9258g = fullScreenVideoAdInteractionListener;
    }

    /* renamed from: a */
    public void mo20219a(TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener) {
        this.f9256e = rewardAdInteractionListener;
    }

    /* renamed from: a */
    public void mo20217a(TTAppOpenAd.AppOpenAdInteractionListener appOpenAdInteractionListener) {
        this.f9259h = appOpenAdInteractionListener;
    }

    /* renamed from: g */
    public C4026c mo20229g() {
        return this.f9257f;
    }

    /* renamed from: a */
    public void mo20221a(C4026c cVar) {
        this.f9257f = cVar;
    }

    /* renamed from: b */
    public void mo20223b(boolean z) {
        this.f9260i = z;
    }

    /* renamed from: h */
    public void mo20230h() {
        this.f9253b = null;
        this.f9255d = null;
        this.f9256e = null;
        this.f9258g = null;
        this.f9259h = null;
        this.f9257f = null;
        this.f9260i = false;
        this.f9254c = true;
    }
}
