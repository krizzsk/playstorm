package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.utils.C2984t;

public class DynamicLogoUnion extends DynamicBaseWidgetImp {
    public DynamicLogoUnion(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5977o = new ImageView(context);
        this.f5977o.setTag(Integer.valueOf(getClickArea()));
        if (C2640c.m6891b()) {
            this.f5970h = Math.max(dynamicRootView.getLogoUnionHeight(), this.f5970h);
        }
        addView(this.f5977o, getWidgetLayoutParams());
    }

    /* renamed from: h */
    public boolean mo17249h() {
        super.mo17249h();
        if (C2640c.m6891b()) {
            ((ImageView) this.f5977o).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.f5977o).setImageResource(C2984t.m8431d(getContext(), "tt_ad_logo_reward_full"));
        } else {
            ((ImageView) this.f5977o).setImageResource(C2984t.m8431d(getContext(), "tt_ad_logo"));
        }
        ((ImageView) this.f5977o).setColorFilter(this.f5974l.mo17118g());
        return true;
    }
}
