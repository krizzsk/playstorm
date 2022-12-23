package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2687g;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.adexpress.widget.CircleLongPressView;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.a */
/* compiled from: CircleLongPressInteract */
public class C2728a implements C2733b {

    /* renamed from: a */
    private CircleLongPressView f6042a;

    public C2728a(Context context, DynamicBaseWidget dynamicBaseWidget, C2687g gVar) {
        this.f6042a = new CircleLongPressView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C2642b.m6894a(context, 180.0f), (int) C2642b.m6894a(context, 180.0f));
        layoutParams.gravity = 17;
        this.f6042a.setLayoutParams(layoutParams);
        this.f6042a.setGuideText(gVar.mo17107I());
    }

    /* renamed from: a */
    public void mo17299a() {
        this.f6042a.mo17332a();
    }

    /* renamed from: b */
    public void mo17300b() {
        this.f6042a.mo17333b();
    }

    /* renamed from: c */
    public CircleLongPressView mo17302d() {
        return this.f6042a;
    }
}
