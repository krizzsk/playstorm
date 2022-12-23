package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2687g;
import com.bytedance.sdk.component.adexpress.widget.PressButtonInteractView;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.f */
/* compiled from: PressButtonInteract */
public class C2737f implements C2733b {

    /* renamed from: a */
    private PressButtonInteractView f6064a;

    public C2737f(Context context, DynamicBaseWidget dynamicBaseWidget, C2687g gVar) {
        this.f6064a = new PressButtonInteractView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicBaseWidget.getDynamicHeight(), dynamicBaseWidget.getDynamicHeight());
        layoutParams.gravity = 21;
        this.f6064a.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo17299a() {
        this.f6064a.mo17367a();
    }

    /* renamed from: b */
    public void mo17300b() {
        this.f6064a.mo17368b();
    }

    /* renamed from: c */
    public PressButtonInteractView mo17302d() {
        return this.f6064a;
    }
}
