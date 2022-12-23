package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2687g;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.adexpress.widget.HandLongPressView;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.e */
/* compiled from: LongPressInteract */
public class C2736e implements C2733b {

    /* renamed from: a */
    private HandLongPressView f6063a;

    public C2736e(Context context, DynamicBaseWidget dynamicBaseWidget, C2687g gVar) {
        this.f6063a = new HandLongPressView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C2642b.m6894a(context, 180.0f), (int) C2642b.m6894a(context, 180.0f));
        layoutParams.gravity = 17;
        this.f6063a.setLayoutParams(layoutParams);
        this.f6063a.setGuideText(gVar.mo17107I());
    }

    /* renamed from: a */
    public void mo17299a() {
        this.f6063a.mo17358a();
    }

    /* renamed from: b */
    public void mo17300b() {
        this.f6063a.mo17359b();
    }

    /* renamed from: d */
    public ViewGroup mo17302d() {
        return this.f6063a;
    }
}
