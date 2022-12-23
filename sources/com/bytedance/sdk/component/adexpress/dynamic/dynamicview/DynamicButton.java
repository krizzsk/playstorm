package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.AnimationButton;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;

public class DynamicButton extends DynamicBaseWidgetImp {
    public DynamicButton(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5977o = new AnimationButton(context);
        this.f5977o.setTag(Integer.valueOf(getClickArea()));
        addView(this.f5977o, getWidgetLayoutParams());
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (C2640c.m6891b() && "fillButton".equals(this.f5975m.mo17160i().mo16954b())) {
            ((TextView) this.f5977o).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView) this.f5977o).setMaxLines(1);
        }
        return super.getWidgetLayoutParams();
    }

    /* renamed from: h */
    public boolean mo17249h() {
        super.mo17249h();
        if (!TextUtils.equals("download-progress-button", this.f5975m.mo17160i().mo16954b()) || !TextUtils.isEmpty(this.f5974l.mo17121j())) {
            if (Build.VERSION.SDK_INT >= 17) {
                this.f5977o.setTextAlignment(this.f5974l.mo17119h());
            }
            ((TextView) this.f5977o).setText(this.f5974l.mo17121j());
            ((TextView) this.f5977o).setTextColor(this.f5974l.mo17118g());
            ((TextView) this.f5977o).setTextSize(this.f5974l.mo17116e());
            ((TextView) this.f5977o).setGravity(17);
            ((TextView) this.f5977o).setIncludeFontPadding(false);
            if ("fillButton".equals(this.f5975m.mo17160i().mo16954b())) {
                this.f5977o.setPadding(0, 0, 0, 0);
            } else {
                this.f5977o.setPadding(this.f5974l.mo17114c(), this.f5974l.mo17113b(), this.f5974l.mo17115d(), this.f5974l.mo17110a());
            }
            return true;
        }
        this.f5977o.setVisibility(4);
        return true;
    }
}
