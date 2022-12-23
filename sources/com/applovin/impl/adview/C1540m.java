package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.C1525i;

/* renamed from: com.applovin.impl.adview.m */
public class C1540m extends FrameLayout {

    /* renamed from: a */
    private C1525i f1931a;

    /* renamed from: b */
    private int f1932b;

    public C1540m(C1525i.C1526a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        C1525i a = C1525i.m2800a(aVar, activity);
        this.f1931a = a;
        addView(a);
    }

    /* renamed from: a */
    public void mo12986a(int i, int i2, int i3, int i4) {
        this.f1932b = i;
        int i5 = i2 + i + i3;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i5;
            layoutParams.width = i5;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i, i4);
        layoutParams2.setMargins(i3, i3, i3, 0);
        this.f1931a.setLayoutParams(layoutParams2);
        this.f1931a.mo12959a(i);
    }

    /* renamed from: a */
    public void mo12987a(C1525i.C1526a aVar) {
        if (aVar != null && aVar != this.f1931a.getStyle()) {
            ViewGroup.LayoutParams layoutParams = this.f1931a.getLayoutParams();
            removeView(this.f1931a);
            C1525i a = C1525i.m2800a(aVar, getContext());
            this.f1931a = a;
            addView(a);
            this.f1931a.setLayoutParams(layoutParams);
            this.f1931a.mo12959a(this.f1932b);
        }
    }
}
