package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2687g;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.adexpress.widget.SlideUpView;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.j */
/* compiled from: SlideUpInteract */
public class C2742j implements C2733b<SlideUpView> {

    /* renamed from: a */
    private SlideUpView f6077a;

    /* renamed from: b */
    private Context f6078b;

    /* renamed from: c */
    private DynamicBaseWidget f6079c;

    /* renamed from: d */
    private C2687g f6080d;

    public C2742j(Context context, DynamicBaseWidget dynamicBaseWidget, C2687g gVar) {
        this.f6078b = context;
        this.f6079c = dynamicBaseWidget;
        this.f6080d = gVar;
        m7486e();
    }

    /* renamed from: e */
    private void m7486e() {
        this.f6077a = new SlideUpView(this.f6078b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) C2642b.m6894a(this.f6078b, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) C2642b.m6894a(this.f6078b, 100.0f);
        this.f6077a.setLayoutParams(layoutParams);
        this.f6077a.setGuideText(this.f6080d.mo17107I());
    }

    /* renamed from: a */
    public void mo17299a() {
        this.f6077a.mo17422a();
    }

    /* renamed from: b */
    public void mo17300b() {
        this.f6077a.mo17424c();
    }

    /* renamed from: c */
    public SlideUpView mo17302d() {
        return this.f6077a;
    }
}
