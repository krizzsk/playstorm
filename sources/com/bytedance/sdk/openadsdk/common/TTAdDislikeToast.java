package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.utils.C4020v;

public class TTAdDislikeToast extends FrameLayout {

    /* renamed from: a */
    private Handler f7620a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public TextView f7621b;

    public TTAdDislikeToast(Context context) {
        this(context, (AttributeSet) null);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7620a = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        m9405a(context);
    }

    /* renamed from: a */
    private void m9405a(Context context) {
        TextView textView = new TextView(context);
        this.f7621b = textView;
        textView.setClickable(false);
        this.f7621b.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        int b = (int) C4020v.m13297b(C3578m.m11231a(), 20.0f);
        int b2 = (int) C4020v.m13297b(C3578m.m11231a(), 12.0f);
        this.f7621b.setPadding(b, b2, b, b2);
        this.f7621b.setLayoutParams(layoutParams);
        this.f7621b.setTextColor(-1);
        this.f7621b.setTextSize(16.0f);
        this.f7621b.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#CC000000"));
        gradientDrawable.setCornerRadius(C4020v.m13297b(C3578m.m11231a(), 6.0f));
        this.f7621b.setBackgroundDrawable(gradientDrawable);
        addView(this.f7621b);
    }

    /* renamed from: a */
    public void mo18875a(final String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f7620a.removeCallbacksAndMessages((Object) null);
            this.f7620a.post(new Runnable() {
                public void run() {
                    if (TTAdDislikeToast.this.f7621b != null) {
                        TTAdDislikeToast.this.f7621b.setText(String.valueOf(str));
                    }
                    TTAdDislikeToast.this.setVisibility(0);
                }
            });
            this.f7620a.postDelayed(new Runnable() {
                public void run() {
                    TTAdDislikeToast.this.setVisibility(8);
                }
            }, 2000);
        }
    }

    /* renamed from: a */
    public void mo18874a() {
        setVisibility(8);
        this.f7620a.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: b */
    public void mo18876b() {
        setVisibility(8);
        this.f7620a.removeCallbacksAndMessages((Object) null);
    }
}
