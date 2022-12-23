package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3610e;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3611f;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3617j;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.utils.C4020v;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import com.com.bytedance.overseas.sdk.p186a.C4027d;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.view.b */
/* compiled from: RewardFullExpressVideoLayout */
public class C3387b {

    /* renamed from: a */
    C4026c f8135a;

    /* renamed from: b */
    Handler f8136b;

    /* renamed from: c */
    boolean f8137c = false;

    /* renamed from: d */
    boolean f8138d = false;

    /* renamed from: e */
    boolean f8139e = false;

    /* renamed from: f */
    private Activity f8140f;

    /* renamed from: g */
    private C3498n f8141g;

    /* renamed from: h */
    private String f8142h;

    /* renamed from: i */
    private FullRewardExpressView f8143i;

    public C3387b(Activity activity) {
        this.f8140f = activity;
    }

    /* renamed from: a */
    public void mo19288a(C3498n nVar, AdSlot adSlot, String str, boolean z) {
        if (!this.f8139e) {
            this.f8139e = true;
            this.f8141g = nVar;
            this.f8142h = str;
            this.f8143i = new FullRewardExpressView(this.f8140f, nVar, adSlot, str, z);
        }
    }

    /* renamed from: a */
    public FullRewardExpressView mo19285a() {
        return this.f8143i;
    }

    /* renamed from: b */
    public FrameLayout mo19292b() {
        FullRewardExpressView fullRewardExpressView = this.f8143i;
        if (fullRewardExpressView == null) {
            return null;
        }
        FrameLayout videoFrameLayout = fullRewardExpressView.getVideoFrameLayout();
        if (this.f8143i.mo20129n()) {
            mo19286a(videoFrameLayout);
        }
        return videoFrameLayout;
    }

    /* renamed from: c */
    public boolean mo19294c() {
        return this.f8137c;
    }

    /* renamed from: a */
    public void mo19291a(boolean z) {
        this.f8137c = z;
    }

    /* renamed from: d */
    public boolean mo19295d() {
        return this.f8138d;
    }

    /* renamed from: b */
    public void mo19293b(boolean z) {
        this.f8138d = z;
    }

    /* renamed from: a */
    public void mo19289a(C3611f fVar, C3610e eVar) {
        C3498n nVar;
        if (this.f8143i != null && (nVar = this.f8141g) != null) {
            this.f8135a = m10109a(nVar);
            C3156e.m9179a(this.f8141g);
            EmptyView a = m10108a((ViewGroup) this.f8143i);
            if (a == null) {
                a = new EmptyView(this.f8140f, this.f8143i);
                this.f8143i.addView(a);
            }
            fVar.mo19396a((View) this.f8143i);
            fVar.mo19402a(this.f8135a);
            this.f8143i.setClickListener(fVar);
            eVar.mo19396a((View) this.f8143i);
            eVar.mo19402a(this.f8135a);
            this.f8143i.setClickCreativeListener(eVar);
            a.setNeedCheckingShow(false);
        }
    }

    /* renamed from: a */
    private C4026c m10109a(C3498n nVar) {
        if (nVar.mo19609L() == 4) {
            return C4027d.m13342a(this.f8140f, nVar, this.f8142h);
        }
        return null;
    }

    /* renamed from: a */
    private EmptyView m10108a(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof EmptyView) {
                return (EmptyView) childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo19290a(C3617j jVar) {
        FullRewardExpressView fullRewardExpressView = this.f8143i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.setExpressVideoListenerProxy(jVar);
        }
    }

    /* renamed from: a */
    public void mo19287a(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
        FullRewardExpressView fullRewardExpressView = this.f8143i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.setExpressInteractionListener(expressAdInteractionListener);
        }
    }

    /* renamed from: e */
    public Handler mo19296e() {
        if (this.f8136b == null) {
            this.f8136b = new Handler(Looper.getMainLooper());
        }
        return this.f8136b;
    }

    /* renamed from: f */
    public void mo19297f() {
        FullRewardExpressView fullRewardExpressView = this.f8143i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.mo20127l();
        }
        Handler handler = this.f8136b;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: g */
    public void mo19298g() {
        FullRewardExpressView fullRewardExpressView = this.f8143i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.mo20126k();
        }
    }

    /* renamed from: h */
    public boolean mo19299h() {
        FullRewardExpressView fullRewardExpressView = this.f8143i;
        if (fullRewardExpressView == null) {
            return false;
        }
        return fullRewardExpressView.mo20129n();
    }

    /* renamed from: i */
    public int mo19300i() {
        FullRewardExpressView fullRewardExpressView = this.f8143i;
        if (fullRewardExpressView != null) {
            return fullRewardExpressView.getDynamicShowType();
        }
        return 0;
    }

    /* renamed from: j */
    public void mo19301j() {
        FullRewardExpressView fullRewardExpressView = this.f8143i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.mo20124i();
        }
    }

    /* renamed from: k */
    public void mo19302k() {
        FullRewardExpressView fullRewardExpressView = this.f8143i;
        if (fullRewardExpressView != null) {
            fullRewardExpressView.mo20125j();
            this.f8143i.mo20126k();
        }
    }

    /* renamed from: a */
    public void mo19286a(FrameLayout frameLayout) {
        C3498n nVar = this.f8141g;
        if (nVar != null && C3498n.m10583c(nVar) && this.f8141g.mo19746t() == 3 && this.f8141g.mo19750v() == 0) {
            try {
                if (this.f8141g.mo19669am() == 1) {
                    int e = C4020v.m13315e(C3578m.m11231a(), 90.0f);
                    FrameLayout frameLayout2 = (FrameLayout) this.f8143i.getBackupContainerBackgroundView();
                    if (frameLayout2 != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
                        layoutParams.bottomMargin = e;
                        frameLayout2.setLayoutParams(layoutParams);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
