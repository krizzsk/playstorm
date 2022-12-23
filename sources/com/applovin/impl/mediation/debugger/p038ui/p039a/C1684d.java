package com.applovin.impl.mediation.debugger.p038ui.p039a;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C2392R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.a.d */
public class C1684d extends Dialog {

    /* renamed from: a */
    private ViewGroup f2453a;

    /* renamed from: b */
    private AppLovinSdkUtils.Size f2454b;

    /* renamed from: c */
    private Activity f2455c;

    /* renamed from: d */
    private RelativeLayout f2456d;

    public C1684d(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, 16973840);
        this.f2453a = viewGroup;
        this.f2454b = size;
        this.f2455c = activity;
        requestWindowFeature(1);
    }

    public void dismiss() {
        this.f2456d.removeView(this.f2453a);
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f2455c, this.f2454b.getWidth()), AppLovinSdkUtils.dpToPx(this.f2455c, this.f2454b.getHeight()));
        layoutParams.addRule(13);
        this.f2453a.setLayoutParams(layoutParams);
        int dpToPx = AppLovinSdkUtils.dpToPx(this.f2455c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f2455c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f2455c.getResources().getDrawable(C2392R.C2393drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground((Drawable) null);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C1684d.this.dismiss();
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f2455c);
        this.f2456d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f2456d.setBackgroundColor(Integer.MIN_VALUE);
        this.f2456d.addView(imageButton);
        this.f2456d.addView(this.f2453a);
        this.f2456d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C1684d.this.dismiss();
            }
        });
        setContentView(this.f2456d);
    }
}
