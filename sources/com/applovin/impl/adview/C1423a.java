package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.a */
public class C1423a extends RelativeLayout {

    /* renamed from: a */
    private final ProgressBar f1640a;

    public C1423a(Context context, int i, int i2) {
        super(context);
        RelativeLayout.LayoutParams layoutParams;
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, (AttributeSet) null, i2);
        this.f1640a = progressBar;
        progressBar.setIndeterminate(true);
        this.f1640a.setClickable(false);
        if (i == -2 || i == -1) {
            layoutParams = new RelativeLayout.LayoutParams(i, i);
        } else {
            int dpToPx = AppLovinSdkUtils.dpToPx(context, i);
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        }
        layoutParams.addRule(13);
        this.f1640a.setLayoutParams(layoutParams);
        addView(this.f1640a);
    }

    /* renamed from: a */
    public void mo12732a() {
        setVisibility(0);
    }

    /* renamed from: b */
    public void mo12733b() {
        setVisibility(8);
    }

    public void setColor(int i) {
        this.f1640a.getIndeterminateDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}
