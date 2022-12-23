package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.C2711d;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.facebook.internal.security.CertificateUtil;

public class DynamicVideoView extends DynamicBaseWidgetImp implements C2711d {

    /* renamed from: a */
    TextView f6025a;

    /* renamed from: b */
    boolean f6026b = false;

    /* renamed from: e */
    public boolean mo17230e() {
        return true;
    }

    public DynamicVideoView(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5977o = new View(context);
        this.f5977o.setTag(Integer.valueOf(getClickArea()));
        this.f6025a = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C2642b.m6894a(context, 40.0f), (int) C2642b.m6894a(context, 15.0f));
        layoutParams.gravity = 85;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.f6025a.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f6025a.setBackground(gradientDrawable);
        this.f6025a.setTextSize(10.0f);
        this.f6025a.setGravity(17);
        this.f6025a.setTextColor(-1);
        this.f6025a.setVisibility(8);
        addView(this.f6025a);
        addView(this.f5977o, getWidgetLayoutParams());
        dynamicRootView.setVideoListener(this);
    }

    /* renamed from: h */
    public boolean mo17249h() {
        super.mo17249h();
        double d = 0.0d;
        double d2 = 0.0d;
        for (C2688h hVar = this.f5975m; hVar != null; hVar = hVar.mo17162k()) {
            double e = d2 + ((double) hVar.mo17153e());
            double f = d + ((double) hVar.mo17155f());
            d2 = e - ((double) hVar.mo17149c());
            d = f - ((double) hVar.mo17151d());
        }
        try {
            float f2 = (float) d2;
            float f3 = (float) d;
            ((DynamicRoot) this.f5976n.getChildAt(0)).f5996a.mo17290a((int) C2642b.m6894a(getContext(), f2), (int) C2642b.m6894a(getContext(), f3), (int) C2642b.m6894a(getContext(), f2 + this.f5967e), (int) C2642b.m6894a(getContext(), f3 + this.f5968f));
        } catch (Exception unused) {
        }
        this.f5976n.mo17259a(d2, d, (double) this.f5967e, (double) this.f5968f, this.f5974l.mo17126o());
        return true;
    }

    public void setTimeUpdate(int i) {
        String str;
        String str2;
        if (!this.f5975m.mo17160i().mo16960e().mo17004ah() || i <= 0 || this.f6026b) {
            this.f6026b = true;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                m7437b(getChildAt(i2));
            }
            this.f6025a.setVisibility(8);
            return;
        }
        if (i >= 60) {
            str = "" + "0" + (i / 60);
        } else {
            str = "00";
        }
        String str3 = str + CertificateUtil.DELIMITER;
        int i3 = i % 60;
        if (i3 > 9) {
            str2 = str3 + i3;
        } else {
            str2 = str3 + "0" + i3;
        }
        this.f6025a.setText(str2);
        this.f6025a.setVisibility(0);
    }

    /* renamed from: b */
    private void m7437b(View view) {
        if (view != this.f6025a) {
            int i = 0;
            view.setVisibility(0);
            if (view instanceof ViewGroup) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i < viewGroup.getChildCount()) {
                        m7437b(viewGroup.getChildAt(i));
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17208a() {
        this.f6025a.setVisibility(8);
    }
}
