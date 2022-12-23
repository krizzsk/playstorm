package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.dynamic.C2679b;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.utils.C2984t;

public class DynamicSkipCountDownBtn extends DynamicButton implements C2679b {

    /* renamed from: a */
    private int[] f6013a;

    /* renamed from: b */
    private int f6014b;

    /* renamed from: s */
    private int f6015s;

    public DynamicSkipCountDownBtn(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
    }

    /* renamed from: h */
    public boolean mo17249h() {
        super.mo17249h();
        ((TextView) this.f5977o).setText("");
        return true;
    }

    /* renamed from: f */
    public void mo17231f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f5969g, this.f5970h);
        layoutParams.gravity = 21;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.f5977o).getText())) {
            setMeasuredDimension(0, this.f5970h);
        } else {
            setMeasuredDimension(this.f5969g, this.f5970h);
        }
    }

    /* renamed from: a */
    public void mo16910a(CharSequence charSequence, boolean z, int i) {
        String a = C2984t.m8425a(C2640c.m6890a(), "tt_reward_screen_skip_tx");
        if (i == 0) {
            this.f5977o.setVisibility(0);
            ((TextView) this.f5977o).setText(" | " + a);
            this.f5977o.measure(-2, -2);
            this.f6013a = new int[]{this.f5977o.getMeasuredWidth() + 1, this.f5977o.getMeasuredHeight()};
            View view = this.f5977o;
            int[] iArr = this.f6013a;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.f5977o).setGravity(17);
            ((TextView) this.f5977o).setIncludeFontPadding(false);
            m7410a();
            this.f5977o.setPadding(this.f5974l.mo17114c(), this.f6014b, this.f5974l.mo17115d(), this.f6015s);
        }
        requestLayout();
    }

    /* renamed from: a */
    private void m7410a() {
        this.f6014b = ((this.f5970h - ((int) C2642b.m6894a(this.f5973k, this.f5974l.mo17116e()))) / 2) - this.f5974l.mo17110a();
        this.f6015s = 0;
    }
}
