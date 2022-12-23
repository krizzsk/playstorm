package com.mbridge.msdk.shake;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.tools.C8613y;

public class MBShakeView extends LinearLayout {

    /* renamed from: a */
    private ImageView f22122a;

    /* renamed from: b */
    private Animation f22123b;

    public MBShakeView(Context context) {
        super(context);
    }

    public MBShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBShakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MBShakeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void initView(String str) {
        initView(str, false);
    }

    public void initView(String str, boolean z) {
        setOrientation(1);
        setGravity(1);
        ImageView imageView = new ImageView(getContext());
        float f = 60.0f;
        int b = C8613y.m24929b(getContext(), z ? 60.0f : 80.0f);
        Context context = getContext();
        if (!z) {
            f = 80.0f;
        }
        imageView.setLayoutParams(new LinearLayout.LayoutParams(b, C8613y.m24929b(context, f)));
        int parseColor = Color.parseColor("#80000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setCornerRadius((float) 200);
        imageView.setBackground(gradientDrawable);
        this.f22122a = new ImageView(getContext());
        float f2 = 40.0f;
        float f3 = 20.0f;
        int b2 = C8613y.m24929b(getContext(), z ? 20.0f : 40.0f);
        Context context2 = getContext();
        if (z) {
            f2 = 20.0f;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b2, C8613y.m24929b(context2, f2));
        layoutParams.gravity = 17;
        this.f22122a.setLayoutParams(layoutParams);
        this.f22122a.setImageResource(getResources().getIdentifier("mbridge_splash_btn_shake", "drawable", C2350a.m5601e().mo15783b()));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        frameLayout.addView(imageView);
        frameLayout.addView(this.f22122a);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = C8613y.m24929b(getContext(), 10.0f);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        if (getContext().getResources().getConfiguration().locale.getLanguage().contains("en")) {
            textView.setText("Shake your phone");
        } else {
            textView.setText("摇动手机 或 点击图标");
        }
        float f4 = 16.0f;
        if (z) {
            f3 = 16.0f;
        }
        textView.setTextSize(f3);
        textView.setTextColor(-1);
        textView.setShadowLayer(8.0f, 3.0f, 3.0f, ViewCompat.MEASURED_STATE_MASK);
        if (TextUtils.isEmpty(str)) {
            str = getContext().getResources().getConfiguration().locale.getLanguage().contains("en") ? "Redirect to third party application" : "浏览第三方应用";
        }
        TextView textView2 = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = C8613y.m24929b(getContext(), 5.0f);
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(17);
        textView2.setText(str);
        if (z) {
            f4 = 12.0f;
        }
        textView2.setTextSize(f4);
        textView2.setTextColor(-1);
        textView2.setShadowLayer(8.0f, 3.0f, 3.0f, ViewCompat.MEASURED_STATE_MASK);
        addView(frameLayout);
        addView(textView);
        addView(textView2);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 10.0f, 1, 0.5f, 1, 0.5f);
        this.f22123b = rotateAnimation;
        rotateAnimation.setDuration(100);
        this.f22123b.setRepeatMode(2);
        this.f22123b.setRepeatCount(-1);
        this.f22122a.startAnimation(this.f22123b);
    }
}
