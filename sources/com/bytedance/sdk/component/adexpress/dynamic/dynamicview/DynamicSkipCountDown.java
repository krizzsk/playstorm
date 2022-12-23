package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.dynamic.C2679b;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.utils.C2984t;

public class DynamicSkipCountDown extends DynamicButton implements C2679b {
    public DynamicSkipCountDown(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.f5977o).getText())) {
            setMeasuredDimension(0, this.f5970h);
        }
    }

    /* renamed from: f */
    public void mo17231f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f5969g, this.f5970h);
        layoutParams.leftMargin = this.f5971i;
        layoutParams.gravity = 16;
        setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo16910a(CharSequence charSequence, boolean z, int i) {
        if (i != 0) {
            String a = C2984t.m8425a(C2640c.m6890a(), "tt_reward_full_skip_count_down");
            ((TextView) this.f5977o).setText(" | " + String.format(a, new Object[]{Integer.valueOf(i)}));
        } else if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        requestLayout();
    }
}
