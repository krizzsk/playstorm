package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.C2679b;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;

public class DynamicTimeOuter extends DynamicButton implements C2679b {
    public DynamicTimeOuter(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(hVar.mo17160i().mo16954b())) {
            dynamicRootView.setTimedown(this.f5970h);
        }
    }

    /* renamed from: h */
    public boolean mo17249h() {
        super.mo17249h();
        if ("timedown".equals(this.f5975m.mo17160i().mo16954b())) {
            ((TextView) this.f5977o).setText(String.valueOf((int) Double.parseDouble(this.f5974l.mo17121j())));
            return true;
        }
        ((TextView) this.f5977o).setText(((int) Double.parseDouble(this.f5974l.mo17121j())) + "s");
        return true;
    }

    /* renamed from: f */
    public void mo17231f() {
        if (TextUtils.equals("skip-with-countdowns-video-countdown", this.f5975m.mo17160i().mo16954b()) || TextUtils.equals("skip-with-time-countdown", this.f5975m.mo17160i().mo16954b())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f5969g, this.f5970h);
            layoutParams.gravity = 19;
            setLayoutParams(layoutParams);
            return;
        }
        super.mo17231f();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.f5977o).getText())) {
            setMeasuredDimension(0, this.f5970h);
        }
    }

    /* renamed from: a */
    public void mo16910a(CharSequence charSequence, boolean z, int i) {
        if ("timedown".equals(this.f5975m.mo17160i().mo16954b())) {
            ((TextView) this.f5977o).setText(charSequence);
            return;
        }
        ((TextView) this.f5977o).setText(charSequence + "s");
    }
}
