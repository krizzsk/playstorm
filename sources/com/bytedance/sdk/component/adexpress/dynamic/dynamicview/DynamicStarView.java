package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.adexpress.widget.TTRatingBar2;

public class DynamicStarView extends DynamicBaseWidgetImp {

    /* renamed from: a */
    private int f6019a = 0;

    /* renamed from: b */
    private int f6020b = 0;

    public DynamicStarView(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5977o = new TTRatingBar2(context, (AttributeSet) null);
        this.f5977o.setTag(Integer.valueOf(getClickArea()));
        addView(this.f5977o, getWidgetLayoutParams());
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        this.f5970h = (int) (((float) this.f5970h) + C2642b.m6894a(this.f5973k, (float) (this.f5974l.mo17113b() + this.f5974l.mo17110a())));
        int a = (int) ((C2642b.m6894a(C2640c.m6890a(), this.f5974l.mo17116e()) * 5.0f) + C2642b.m6894a(C2640c.m6890a(), ((float) this.f5974l.mo17114c()) + C2642b.m6894a(C2640c.m6890a(), (float) this.f5974l.mo17115d())));
        if (this.f5969g > a && 4 == this.f5974l.mo17119h()) {
            this.f6019a = (this.f5969g - a) / 2;
        }
        this.f6020b = (int) C2642b.m6894a(this.f5973k, (float) this.f5974l.mo17113b());
        this.f5969g = a;
        return new FrameLayout.LayoutParams(this.f5969g, this.f5970h);
    }

    /* renamed from: f */
    public void mo17231f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f5969g, this.f5970h);
        layoutParams.topMargin = this.f5972j + this.f6020b;
        layoutParams.leftMargin = this.f5971i + this.f6019a;
        setLayoutParams(layoutParams);
    }

    /* renamed from: h */
    public boolean mo17249h() {
        super.mo17249h();
        double m = this.f5974l.mo17124m();
        if (!C2640c.m6891b() || (m >= 0.0d && m <= 5.0d && (this.f5976n == null || this.f5976n.getRenderRequest() == null || this.f5976n.getRenderRequest().mo16759k() == 4))) {
            if (m < 0.0d || m > 5.0d) {
                m = 5.0d;
            }
            this.f5977o.setVisibility(0);
            ((TTRatingBar2) this.f5977o).mo17439a(m, this.f5974l.mo17118g(), (int) this.f5974l.mo17116e());
            return true;
        }
        this.f5977o.setVisibility(8);
        return true;
    }
}
