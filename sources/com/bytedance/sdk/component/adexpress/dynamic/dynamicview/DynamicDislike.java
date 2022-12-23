package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.adexpress.widget.DislikeView;

public class DynamicDislike extends DynamicBaseWidgetImp {
    public DynamicDislike(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5977o = new DislikeView(context);
        this.f5977o.setTag(3);
        addView(this.f5977o, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.f5977o);
    }

    /* renamed from: h */
    public boolean mo17249h() {
        super.mo17249h();
        int a = (int) C2642b.m6894a(this.f5973k, this.f5974l.mo17128q());
        if (!(this.f5977o instanceof DislikeView)) {
            return true;
        }
        ((DislikeView) this.f5977o).setRadius((int) C2642b.m6894a(this.f5973k, this.f5974l.mo17126o()));
        ((DislikeView) this.f5977o).setStrokeWidth(a);
        ((DislikeView) this.f5977o).setStrokeColor(this.f5974l.mo17127p());
        ((DislikeView) this.f5977o).setBgColor(this.f5974l.mo17134w());
        ((DislikeView) this.f5977o).setDislikeColor(this.f5974l.mo17118g());
        ((DislikeView) this.f5977o).setDislikeWidth((int) C2642b.m6894a(this.f5973k, 1.0f));
        return true;
    }
}
