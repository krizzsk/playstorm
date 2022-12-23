package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.adexpress.p095b.C2633l;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.utils.C2968h;

public class DynamicBaseWidgetImp extends DynamicBaseWidget {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public InteractViewContainer f5982a;

    public DynamicBaseWidgetImp(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        setTag(Integer.valueOf(getClickArea()));
        String b = hVar.mo17160i().mo16954b();
        if ("logo-union".equals(b)) {
            dynamicRootView.setLogoUnionHeight(this.f5970h - ((int) C2642b.m6894a(context, (float) (this.f5974l.mo17113b() + this.f5974l.mo17110a()))));
        } else if ("scoreCountWithIcon".equals(b)) {
            dynamicRootView.setScoreCountWithIcon(this.f5970h - ((int) C2642b.m6894a(context, (float) (this.f5974l.mo17113b() + this.f5974l.mo17110a()))));
        }
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.f5969g, this.f5970h);
    }

    /* renamed from: h */
    public boolean mo17249h() {
        final View view = this.f5977o == null ? this : this.f5977o;
        view.setContentDescription(this.f5974l.mo17109K());
        Drawable backgroundDrawable = getBackgroundDrawable();
        if (backgroundDrawable != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.f5974l.mo17135x() > 0) {
            postDelayed(new Runnable() {
                public void run() {
                    try {
                        view.setBackground(DynamicBaseWidgetImp.this.mo17223a(true, DynamicBaseWidgetImp.this.f5976n.getBgColor()));
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.f5974l.mo17135x() * 1000));
        }
        if (this.f5977o != null) {
            this.f5977o.setPadding((int) C2642b.m6894a(this.f5973k, (float) this.f5974l.mo17114c()), (int) C2642b.m6894a(this.f5973k, (float) this.f5974l.mo17113b()), (int) C2642b.m6894a(this.f5973k, (float) this.f5974l.mo17115d()), (int) C2642b.m6894a(this.f5973k, (float) this.f5974l.mo17110a()));
        }
        if (this.f5978p || this.f5974l.mo17125n() > 0.0d) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        final View view = this.f5977o == null ? this : this.f5977o;
        double l = this.f5975m.mo17160i().mo16960e().mo17061l();
        if (l < 90.0d && l > 0.0d) {
            C2968h.m8367b().postDelayed(new Runnable() {
                public void run() {
                    DynamicBaseWidgetImp.this.setVisibility(8);
                }
            }, (long) (l * 1000.0d));
        }
        double k = this.f5975m.mo17160i().mo16960e().mo17057k();
        if (k > 0.0d) {
            C2968h.m8367b().postDelayed(new Runnable() {
                public void run() {
                    if (DynamicBaseWidgetImp.this.f5975m.mo17160i().mo16960e().mo16999ac() == null) {
                        view.setVisibility(0);
                        DynamicBaseWidgetImp.this.setVisibility(0);
                    }
                }
            }, (long) (k * 1000.0d));
        }
        if (!TextUtils.isEmpty(this.f5974l.mo17102D())) {
            mo17208a();
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    private void mo17208a() {
        int G = this.f5974l.mo17105G();
        int H = this.f5974l.mo17106H();
        postDelayed(new Runnable() {
            public void run() {
                if (DynamicBaseWidgetImp.this.f5976n == null || DynamicBaseWidgetImp.this.f5976n.getRenderRequest() == null) {
                    DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                    Context context = DynamicBaseWidgetImp.this.f5973k;
                    DynamicBaseWidgetImp dynamicBaseWidgetImp2 = DynamicBaseWidgetImp.this;
                    InteractViewContainer unused = dynamicBaseWidgetImp.f5982a = new InteractViewContainer(context, dynamicBaseWidgetImp2, dynamicBaseWidgetImp2.f5974l);
                } else {
                    C2633l renderRequest = DynamicBaseWidgetImp.this.f5976n.getRenderRequest();
                    int p = renderRequest.mo16764p();
                    int q = renderRequest.mo16765q();
                    DynamicBaseWidgetImp dynamicBaseWidgetImp3 = DynamicBaseWidgetImp.this;
                    Context context2 = DynamicBaseWidgetImp.this.f5973k;
                    DynamicBaseWidgetImp dynamicBaseWidgetImp4 = DynamicBaseWidgetImp.this;
                    InteractViewContainer unused2 = dynamicBaseWidgetImp3.f5982a = new InteractViewContainer(context2, dynamicBaseWidgetImp4, dynamicBaseWidgetImp4.f5974l, p, q);
                }
                DynamicBaseWidgetImp dynamicBaseWidgetImp5 = DynamicBaseWidgetImp.this;
                dynamicBaseWidgetImp5.mo17227a((View) dynamicBaseWidgetImp5.f5982a);
                DynamicBaseWidgetImp.this.f5982a.setTag(2);
                DynamicBaseWidgetImp dynamicBaseWidgetImp6 = DynamicBaseWidgetImp.this;
                dynamicBaseWidgetImp6.addView(dynamicBaseWidgetImp6.f5982a, new FrameLayout.LayoutParams(-1, -1));
                DynamicBaseWidgetImp.this.f5982a.mo17293b();
            }
        }, ((long) G) * 1000);
        if (H < Integer.MAX_VALUE && G < H) {
            postDelayed(new Runnable() {
                public void run() {
                    if (DynamicBaseWidgetImp.this.f5982a != null) {
                        DynamicBaseWidgetImp.this.f5982a.setVisibility(8);
                    }
                }
            }, ((long) H) * 1000);
        }
    }
}
