package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;

public class DynamicSplitLineView extends DynamicBaseWidgetImp {
    public DynamicSplitLineView(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5977o = new View(context);
        addView(this.f5977o, getWidgetLayoutParams());
    }

    /* renamed from: h */
    public boolean mo17249h() {
        super.mo17249h();
        this.f5977o.setBackgroundColor(this.f5974l.mo17134w());
        return true;
    }
}
