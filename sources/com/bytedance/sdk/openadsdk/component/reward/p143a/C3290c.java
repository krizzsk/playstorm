package com.bytedance.sdk.openadsdk.component.reward.p143a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.C2690c;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.component.reward.top.C3379b;
import com.bytedance.sdk.openadsdk.component.reward.top.TopProxyLayout;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.utils.C4020v;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a.c */
/* compiled from: RewardFullTopProxyManager */
public class C3290c {

    /* renamed from: a */
    TopProxyLayout f7811a;

    /* renamed from: b */
    C2690c f7812b;

    /* renamed from: c */
    private Activity f7813c;

    /* renamed from: d */
    private boolean f7814d = false;

    public C3290c(Activity activity) {
        this.f7813c = activity;
    }

    /* renamed from: a */
    public void mo19023a() {
        if (!this.f7814d) {
            this.f7814d = true;
            m9651e();
        }
    }

    /* renamed from: e */
    private void m9651e() {
        Activity activity = this.f7813c;
        this.f7811a = (TopProxyLayout) activity.findViewById(C2984t.m8432e(activity, "tt_top_layout_proxy"));
    }

    /* renamed from: a */
    public void mo19029a(boolean z, C3498n nVar) {
        TopProxyLayout topProxyLayout = this.f7811a;
        if (topProxyLayout != null) {
            topProxyLayout.mo19255a(z, nVar);
        }
    }

    /* renamed from: a */
    public void mo19028a(boolean z) {
        TopProxyLayout topProxyLayout = this.f7811a;
        if (topProxyLayout != null) {
            topProxyLayout.setShowDislike(z);
        }
    }

    /* renamed from: b */
    public void mo19032b(boolean z) {
        TopProxyLayout topProxyLayout = this.f7811a;
        if (topProxyLayout != null) {
            topProxyLayout.setSoundMute(z);
        }
        C2690c cVar = this.f7812b;
        if (cVar != null) {
            cVar.setSoundMute(z);
        }
    }

    /* renamed from: c */
    public void mo19035c(boolean z) {
        TopProxyLayout topProxyLayout = this.f7811a;
        if (topProxyLayout != null) {
            topProxyLayout.setShowSound(z);
        }
    }

    /* renamed from: d */
    public void mo19037d(boolean z) {
        TopProxyLayout topProxyLayout = this.f7811a;
        if (topProxyLayout != null) {
            topProxyLayout.setShowSkip(z);
        }
    }

    /* renamed from: a */
    public void mo19027a(String str, CharSequence charSequence) {
        TopProxyLayout topProxyLayout = this.f7811a;
        if (topProxyLayout != null) {
            topProxyLayout.mo19243a((CharSequence) String.valueOf(str), charSequence);
        }
    }

    /* renamed from: e */
    public void mo19038e(boolean z) {
        TopProxyLayout topProxyLayout = this.f7811a;
        if (topProxyLayout != null) {
            topProxyLayout.setSkipEnable(z);
        }
    }

    /* renamed from: b */
    public void mo19030b() {
        TopProxyLayout topProxyLayout = this.f7811a;
        if (topProxyLayout != null) {
            topProxyLayout.mo19242a();
        }
    }

    /* renamed from: c */
    public void mo19033c() {
        TopProxyLayout topProxyLayout = this.f7811a;
        if (topProxyLayout != null) {
            topProxyLayout.mo19244b();
        }
    }

    /* renamed from: d */
    public void mo19036d() {
        TopProxyLayout topProxyLayout = this.f7811a;
        if (topProxyLayout != null) {
            topProxyLayout.mo19245c();
        }
    }

    /* renamed from: a */
    public void mo19026a(C3379b bVar) {
        TopProxyLayout topProxyLayout = this.f7811a;
        if (topProxyLayout != null) {
            topProxyLayout.setListener(bVar);
        }
    }

    /* renamed from: a */
    public void mo19025a(C2690c cVar) {
        this.f7812b = cVar;
    }

    /* renamed from: a */
    public void mo19024a(int i) {
        TopProxyLayout topProxyLayout = this.f7811a;
        if (topProxyLayout != null && (topProxyLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ((ViewGroup.MarginLayoutParams) this.f7811a.getLayoutParams()).topMargin = i - C4020v.m13315e(this.f7813c, 20.0f);
        }
    }

    /* renamed from: b */
    public void mo19031b(int i) {
        View findViewById;
        TopProxyLayout topProxyLayout = this.f7811a;
        if (topProxyLayout != null && topProxyLayout.getITopLayout() != null && (findViewById = this.f7811a.getITopLayout().findViewById(C2984t.m8432e(C3578m.m11231a(), "tt_top_dislike"))) != null && (findViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && findViewById.getWidth() > 0 && findViewById.getVisibility() == 0) {
            int[] iArr = new int[2];
            findViewById.getLocationOnScreen(iArr);
            int width = i - (iArr[0] + findViewById.getWidth());
            if (width < C4020v.m13315e(this.f7813c, 16.0f)) {
                ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin += C4020v.m13315e(this.f7813c, 16.0f) - width;
                findViewById.requestLayout();
            }
        }
    }

    /* renamed from: c */
    public void mo19034c(int i) {
        this.f7811a.setVisibility(i);
    }
}
