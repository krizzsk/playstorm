package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2687g;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.adexpress.widget.PressInteractView;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.g */
/* compiled from: PressInteract */
public class C2738g implements C2733b<PressInteractView> {

    /* renamed from: a */
    private PressInteractView f6065a;

    public C2738g(Context context, DynamicBaseWidget dynamicBaseWidget, C2687g gVar) {
        this.f6065a = new PressInteractView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C2642b.m6894a(context, 180.0f), (int) C2642b.m6894a(context, 180.0f));
        layoutParams.gravity = 17;
        this.f6065a.setLayoutParams(layoutParams);
        this.f6065a.setGuideText(gVar.mo17107I());
    }

    /* renamed from: a */
    public void mo17299a() {
        this.f6065a.mo17374a();
    }

    /* renamed from: b */
    public void mo17300b() {
        this.f6065a.mo17375b();
    }

    /* renamed from: c */
    public PressInteractView mo17302d() {
        return this.f6065a;
    }
}
