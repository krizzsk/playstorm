package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.C2651a;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.utils.C2984t;

public class DynamicMutedView extends DynamicBaseWidgetImp implements C2651a {
    /* renamed from: e */
    public boolean mo17230e() {
        return true;
    }

    public DynamicMutedView(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5977o = new ImageView(context);
        this.f5977o.setTag(5);
        addView(this.f5977o, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
    }

    /* renamed from: h */
    public boolean mo17249h() {
        super.mo17249h();
        ((ImageView) this.f5977o).setScaleType(ImageView.ScaleType.CENTER);
        setSoundMute(this.f5976n.f5998b);
        GradientDrawable gradientDrawable = (GradientDrawable) C2984t.m8430c(getContext(), "tt_ad_skip_btn_bg");
        gradientDrawable.setCornerRadius((float) (this.f5970h / 2));
        gradientDrawable.setColor(this.f5974l.mo17134w());
        ((ImageView) this.f5977o).setBackgroundDrawable(gradientDrawable);
        return true;
    }

    public void setSoundMute(boolean z) {
        int i;
        if (z) {
            i = C2984t.m8431d(getContext(), "tt_mute");
        } else {
            i = C2984t.m8431d(getContext(), "tt_unmute");
        }
        ((ImageView) this.f5977o).setImageResource(i);
    }
}
