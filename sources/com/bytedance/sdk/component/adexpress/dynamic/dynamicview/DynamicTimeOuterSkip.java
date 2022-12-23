package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.dynamic.C2679b;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.utils.C2984t;

public class DynamicTimeOuterSkip extends DynamicButton implements C2679b {

    /* renamed from: a */
    private boolean f6024a;

    public DynamicTimeOuterSkip(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null) {
            this.f6024a = dynamicRootView.getRenderRequest().mo16762n();
        }
    }

    /* renamed from: h */
    public boolean mo17249h() {
        super.mo17249h();
        if (!TextUtils.equals(this.f5975m.mo17160i().mo16954b(), "skip-with-time-skip-btn")) {
            return true;
        }
        ((TextView) this.f5977o).setText("");
        return true;
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
        if (TextUtils.equals("skip-with-time-skip-btn", this.f5975m.mo17160i().mo16954b())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f5969g, this.f5970h);
            layoutParams.gravity = 21;
            setLayoutParams(layoutParams);
        } else {
            super.mo17231f();
        }
        if (!"skip-with-time-skip-btn".equals(this.f5975m.mo17160i().mo16954b()) && Build.VERSION.SDK_INT >= 17) {
            this.f5977o.setTextAlignment(1);
            ((TextView) this.f5977o).setGravity(17);
        }
        setVisibility(8);
    }

    /* renamed from: a */
    public void mo16910a(CharSequence charSequence, boolean z, int i) {
        String a = C2984t.m8425a(C2640c.m6890a(), "tt_reward_screen_skip_tx");
        if (z) {
            if ("skip-with-time-skip-btn".equals(this.f5975m.mo17160i().mo16954b())) {
                if (C2640c.m6891b() && this.f6024a) {
                    a = "X";
                }
                ((TextView) this.f5977o).setText(" | " + a);
            } else {
                ((TextView) this.f5977o).setText(a);
            }
            setVisibility(0);
        } else {
            setVisibility(8);
        }
        requestLayout();
    }
}
