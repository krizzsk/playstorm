package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2687g;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideView;
import com.bytedance.sdk.component.utils.C2984t;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.k */
/* compiled from: WriggleGuideInteract */
public class C2743k implements C2733b<WriggleGuideAnimationView> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WriggleGuideAnimationView f6081a;

    /* renamed from: b */
    private Context f6082b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public DynamicBaseWidget f6083c;

    /* renamed from: d */
    private C2687g f6084d;

    /* renamed from: e */
    private String f6085e;

    /* renamed from: f */
    private int f6086f;

    public C2743k(Context context, DynamicBaseWidget dynamicBaseWidget, C2687g gVar, String str, int i) {
        this.f6082b = context;
        this.f6083c = dynamicBaseWidget;
        this.f6084d = gVar;
        this.f6085e = str;
        this.f6086f = i;
        m7493e();
    }

    /* renamed from: e */
    private void m7493e() {
        int F = this.f6084d.mo17104F();
        if ("18".equals(this.f6085e)) {
            Context context = this.f6082b;
            WriggleGuideAnimationView wriggleGuideAnimationView = new WriggleGuideAnimationView(context, C2984t.m8433f(context, "tt_hand_wriggle_guide"), this.f6086f);
            this.f6081a = wriggleGuideAnimationView;
            if (wriggleGuideAnimationView.getWriggleLayout() != null) {
                this.f6081a.getWriggleLayout().setOnClickListener((View.OnClickListener) this.f6083c.getDynamicClickListener());
            }
            if (this.f6081a.getTopTextView() != null) {
                this.f6081a.getTopTextView().setText(C2984t.m8428b(this.f6082b, "tt_splash_wriggle_top_text_style_17"));
            }
        } else {
            Context context2 = this.f6082b;
            this.f6081a = new WriggleGuideAnimationView(context2, C2984t.m8433f(context2, "tt_hand_wriggle_guide"), this.f6086f);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) C2642b.m6894a(this.f6082b, (float) F);
        this.f6081a.setLayoutParams(layoutParams);
        this.f6081a.setShakeText(this.f6084d.mo17107I());
        this.f6081a.setClipChildren(false);
        final WriggleGuideView wriggleProgressIv = this.f6081a.getWriggleProgressIv();
        this.f6081a.setOnShakeViewListener(new WriggleGuideAnimationView.C2776a() {
            /* renamed from: a */
            public void mo17313a() {
                WriggleGuideView wriggleGuideView = wriggleProgressIv;
                if (wriggleGuideView != null) {
                    wriggleGuideView.mo17461a(new WriggleGuideView.C2778a() {
                        /* renamed from: a */
                        public void mo17314a() {
                            C2743k.this.f6081a.setOnClickListener((View.OnClickListener) C2743k.this.f6083c.getDynamicClickListener());
                            C2743k.this.f6081a.performClick();
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public void mo17299a() {
        this.f6081a.mo17446a();
    }

    /* renamed from: b */
    public void mo17300b() {
        this.f6081a.clearAnimation();
    }

    /* renamed from: c */
    public WriggleGuideAnimationView mo17302d() {
        return this.f6081a;
    }
}
