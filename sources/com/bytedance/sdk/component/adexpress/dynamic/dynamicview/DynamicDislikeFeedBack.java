package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.utils.C2984t;

public class DynamicDislikeFeedBack extends DynamicBaseWidgetImp {
    public DynamicDislikeFeedBack(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5977o = new TextView(context);
        this.f5977o.setTag(3);
        addView(this.f5977o, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.f5977o);
    }

    /* renamed from: h */
    public boolean mo17249h() {
        super.mo17249h();
        ((TextView) this.f5977o).setText(getText());
        if (Build.VERSION.SDK_INT >= 17) {
            this.f5977o.setTextAlignment(this.f5974l.mo17119h());
        }
        ((TextView) this.f5977o).setTextColor(this.f5974l.mo17118g());
        ((TextView) this.f5977o).setTextSize(this.f5974l.mo17116e());
        if (Build.VERSION.SDK_INT >= 16) {
            this.f5977o.setBackground(getBackgroundDrawable());
        }
        if (!this.f5974l.mo17131t()) {
            ((TextView) this.f5977o).setMaxLines(1);
            ((TextView) this.f5977o).setGravity(17);
            ((TextView) this.f5977o).setEllipsize(TextUtils.TruncateAt.END);
        } else {
            int u = this.f5974l.mo17132u();
            if (u > 0) {
                ((TextView) this.f5977o).setLines(u);
                ((TextView) this.f5977o).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        this.f5977o.setPadding((int) C2642b.m6894a(C2640c.m6890a(), (float) this.f5974l.mo17114c()), (int) C2642b.m6894a(C2640c.m6890a(), (float) this.f5974l.mo17113b()), (int) C2642b.m6894a(C2640c.m6890a(), (float) this.f5974l.mo17115d()), (int) C2642b.m6894a(C2640c.m6890a(), (float) this.f5974l.mo17110a()));
        ((TextView) this.f5977o).setGravity(17);
        return true;
    }

    public String getText() {
        return C2984t.m8425a(C2640c.m6890a(), "tt_reward_feedback");
    }
}
