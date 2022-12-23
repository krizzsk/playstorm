package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;

public class DynamicPrivacyView extends DynamicBaseWidgetImp {

    /* renamed from: a */
    private TextView f5992a = new TextView(this.f5973k);

    /* renamed from: b */
    private TextView f5993b = new TextView(this.f5973k);

    /* renamed from: s */
    private TextView f5994s = new TextView(this.f5973k);

    /* renamed from: t */
    private LinearLayout f5995t = new LinearLayout(this.f5973k);

    public DynamicPrivacyView(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
        this.f5992a.setTag(9);
        this.f5993b.setTag(10);
        addView(this.f5995t, getWidgetLayoutParams());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo17229d() {
        this.f5992a.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.f5992a.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.f5993b.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.f5993b.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.f5969g, this.f5970h);
    }

    /* renamed from: h */
    public boolean mo17249h() {
        this.f5993b.setText("权限列表");
        this.f5994s.setText(" | ");
        this.f5992a.setText("隐私政策");
        if (this.f5974l != null) {
            this.f5993b.setTextColor(this.f5974l.mo17118g());
            this.f5993b.setTextSize(this.f5974l.mo17116e());
            this.f5994s.setTextColor(this.f5974l.mo17118g());
            this.f5992a.setTextColor(this.f5974l.mo17118g());
            this.f5992a.setTextSize(this.f5974l.mo17116e());
        } else {
            this.f5993b.setTextColor(-1);
            this.f5993b.setTextSize(12.0f);
            this.f5994s.setTextColor(-1);
            this.f5992a.setTextColor(-1);
            this.f5992a.setTextSize(12.0f);
        }
        this.f5995t.addView(this.f5993b);
        this.f5995t.addView(this.f5994s);
        this.f5995t.addView(this.f5992a);
        return false;
    }
}
