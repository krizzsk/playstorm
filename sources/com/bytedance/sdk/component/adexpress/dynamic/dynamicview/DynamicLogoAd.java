package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.adexpress.dynamic.p101c.C2710l;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.utils.C2984t;

public class DynamicLogoAd extends DynamicBaseWidgetImp {
    public DynamicLogoAd(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5977o = new TextView(context);
        this.f5977o.setTag(Integer.valueOf(getClickArea()));
        addView(this.f5977o, getWidgetLayoutParams());
    }

    /* renamed from: h */
    public boolean mo17249h() {
        super.mo17249h();
        if (Build.VERSION.SDK_INT >= 17) {
            this.f5977o.setTextAlignment(this.f5974l.mo17119h());
        }
        ((TextView) this.f5977o).setTextColor(this.f5974l.mo17118g());
        ((TextView) this.f5977o).setTextSize(this.f5974l.mo17116e());
        if (C2640c.m6891b()) {
            ((TextView) this.f5977o).setIncludeFontPadding(false);
            ((TextView) this.f5977o).setTextSize(Math.min(((float) ((C2642b.m6898b(C2640c.m6890a(), (float) this.f5970h) - this.f5974l.mo17113b()) - this.f5974l.mo17110a())) - 0.5f, this.f5974l.mo17116e()));
            ((TextView) this.f5977o).setText(C2984t.m8428b(getContext(), "tt_logo_en"));
            return true;
        } else if (!m7390a()) {
            ((TextView) this.f5977o).setText(C2984t.m8428b(getContext(), "tt_logo_cn"));
            return true;
        } else if (C2710l.m7358b()) {
            ((TextView) this.f5977o).setText(C2710l.m7352a());
            return true;
        } else {
            ((TextView) this.f5977o).setText(C2710l.m7353a(this.f5974l.f5888b));
            return true;
        }
    }

    /* renamed from: a */
    private boolean m7390a() {
        if (C2640c.m6891b()) {
            return false;
        }
        if ((TextUtils.isEmpty(this.f5974l.f5888b) || !this.f5974l.f5888b.contains("adx:")) && !C2710l.m7358b()) {
            return false;
        }
        return true;
    }
}
