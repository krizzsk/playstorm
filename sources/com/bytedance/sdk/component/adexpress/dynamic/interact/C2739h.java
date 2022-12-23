package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2687g;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import com.bytedance.sdk.component.utils.C2984t;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.h */
/* compiled from: ShakeInteract */
public class C2739h implements C2733b<ShakeAnimationView> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ShakeAnimationView f6066a;

    /* renamed from: b */
    private Context f6067b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public DynamicBaseWidget f6068c;

    /* renamed from: d */
    private C2687g f6069d;

    /* renamed from: e */
    private String f6070e;

    /* renamed from: f */
    private int f6071f;

    public C2739h(Context context, DynamicBaseWidget dynamicBaseWidget, C2687g gVar, String str, int i) {
        this.f6067b = context;
        this.f6068c = dynamicBaseWidget;
        this.f6069d = gVar;
        this.f6070e = str;
        this.f6071f = i;
        m7476e();
    }

    /* renamed from: e */
    private void m7476e() {
        if ("16".equals(this.f6070e)) {
            Context context = this.f6067b;
            ShakeAnimationView shakeAnimationView = new ShakeAnimationView(context, C2984t.m8433f(context, "tt_hand_shake_interaction_type_16"), this.f6071f);
            this.f6066a = shakeAnimationView;
            if (shakeAnimationView.getShakeLayout() != null) {
                this.f6066a.getShakeLayout().setOnClickListener((View.OnClickListener) this.f6068c.getDynamicClickListener());
            }
        } else {
            Context context2 = this.f6067b;
            this.f6066a = new ShakeAnimationView(context2, C2984t.m8433f(context2, "tt_hand_shake"), this.f6071f);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) C2642b.m6894a(this.f6067b, 80.0f);
        this.f6066a.setLayoutParams(layoutParams);
        this.f6066a.setShakeText(this.f6069d.mo17107I());
        this.f6066a.setClipChildren(false);
        this.f6066a.setOnShakeViewListener(new ShakeAnimationView.C2761a() {
            /* renamed from: a */
            public void mo17310a() {
                C2739h.this.f6066a.setOnClickListener((View.OnClickListener) C2739h.this.f6068c.getDynamicClickListener());
                C2739h.this.f6066a.performClick();
            }
        });
    }

    /* renamed from: a */
    public void mo17299a() {
        this.f6066a.mo17401a();
    }

    /* renamed from: b */
    public void mo17300b() {
        this.f6066a.clearAnimation();
    }

    /* renamed from: c */
    public ShakeAnimationView mo17302d() {
        return this.f6066a;
    }
}
