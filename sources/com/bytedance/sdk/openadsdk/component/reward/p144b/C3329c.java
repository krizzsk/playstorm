package com.bytedance.sdk.openadsdk.component.reward.p144b;

import android.app.Activity;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.p143a.C3290c;
import com.bytedance.sdk.openadsdk.component.reward.p144b.C3322a;
import com.bytedance.sdk.openadsdk.component.reward.view.C3389d;
import com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.b.c */
/* compiled from: RewardFullTypeInteraction */
public class C3329c extends C3322a {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public FullInteractionStyleView f7950i;

    public C3329c(Activity activity, C3498n nVar, int i, int i2) {
        super(activity, nVar, i, i2);
    }

    /* renamed from: a */
    public void mo19171a(FrameLayout frameLayout) {
        FullInteractionStyleView fullInteractionStyleView = new FullInteractionStyleView(this.f7925a, this.f7931g);
        this.f7950i = fullInteractionStyleView;
        fullInteractionStyleView.setDownloadListener(this.f7932h);
        this.f7950i.mo19261a(this.f7926b, this.f7930f, this.f7929e, this.f7927c, this.f7928d);
        frameLayout.addView(this.f7950i.getInteractionStyleRootView());
    }

    /* renamed from: a */
    public static boolean m9897a(C3498n nVar) {
        return (nVar == null || nVar.mo19670an() == 100.0f) ? false : true;
    }

    /* renamed from: a */
    public C3322a.C3323a mo19168a() {
        return new C3322a.C3323a() {
            /* renamed from: a */
            public void mo19177a(boolean z) {
                if (C3329c.this.f7950i != null) {
                    C3329c.this.f7950i.setIsMute(z);
                }
            }
        };
    }

    /* renamed from: d */
    public FrameLayout mo19185d() {
        FullInteractionStyleView fullInteractionStyleView = this.f7950i;
        if (fullInteractionStyleView != null) {
            return fullInteractionStyleView.getVideoContainer();
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo19175b() {
        return m9898e();
    }

    /* renamed from: c */
    public boolean mo19176c() {
        return m9898e();
    }

    /* renamed from: a */
    public void mo19172a(C3290c cVar, C3389d dVar) {
        dVar.mo19316b(8);
        dVar.mo19307a(8);
        if (this.f7926b.mo19724l() == 2) {
            cVar.mo19028a(false);
            cVar.mo19035c(false);
            cVar.mo19037d(false);
            dVar.mo19321d(8);
            return;
        }
        cVar.mo19028a(this.f7926b.mo19672ap());
        cVar.mo19035c(m9898e());
        cVar.mo19037d(m9898e());
        if (m9898e()) {
            dVar.mo19321d(8);
            return;
        }
        cVar.mo19036d();
        dVar.mo19321d(0);
    }

    /* renamed from: e */
    private boolean m9898e() {
        return C3498n.m10583c(this.f7926b);
    }
}
