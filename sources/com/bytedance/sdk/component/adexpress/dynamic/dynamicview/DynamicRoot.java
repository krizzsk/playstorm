package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;

public class DynamicRoot extends DynamicBaseWidgetImp {

    /* renamed from: a */
    public C2723a f5996a;

    public DynamicRoot(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
    }

    /* renamed from: h */
    public boolean mo17249h() {
        return super.mo17249h();
    }

    /* access modifiers changed from: protected */
    public GradientDrawable getDrawable() {
        C2723a aVar = new C2723a();
        this.f5996a = aVar;
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public GradientDrawable mo17225a(GradientDrawable.Orientation orientation, int[] iArr) {
        C2723a aVar = new C2723a(orientation, iArr);
        this.f5996a = aVar;
        return aVar;
    }
}
