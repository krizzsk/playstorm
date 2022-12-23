package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2687g;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.adexpress.widget.SlideRightView;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.i */
/* compiled from: SlideRightInteract */
public class C2741i implements C2733b {

    /* renamed from: a */
    private SlideRightView f6073a;

    /* renamed from: b */
    private Context f6074b;

    /* renamed from: c */
    private DynamicBaseWidget f6075c;

    /* renamed from: d */
    private C2687g f6076d;

    /* renamed from: b */
    public void mo17300b() {
    }

    public C2741i(Context context, DynamicBaseWidget dynamicBaseWidget, C2687g gVar) {
        this.f6074b = context;
        this.f6075c = dynamicBaseWidget;
        this.f6076d = gVar;
        m7482c();
    }

    /* renamed from: c */
    private void m7482c() {
        this.f6073a = new SlideRightView(this.f6074b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C2642b.m6894a(this.f6074b, 120.0f), (int) C2642b.m6894a(this.f6074b, 120.0f));
        layoutParams.gravity = 17;
        this.f6073a.setLayoutParams(layoutParams);
        this.f6073a.setClipChildren(false);
        this.f6073a.setGuideText(this.f6076d.mo17107I());
    }

    /* renamed from: a */
    public void mo17299a() {
        this.f6073a.mo17415a();
    }

    /* renamed from: d */
    public ViewGroup mo17302d() {
        return this.f6073a;
    }
}
