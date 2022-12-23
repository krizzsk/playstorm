package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.utils.C2984t;

public class HandLongPressView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f6134a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f6135b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public CircleRippleView f6136c;

    /* renamed from: d */
    private AnimatorSet f6137d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f6138e = true;

    /* renamed from: f */
    private TextView f6139f;

    public HandLongPressView(Context context) {
        super(context);
        this.f6134a = context;
        this.f6137d = new AnimatorSet();
        m7521c();
        m7522d();
        post(new Runnable() {
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) HandLongPressView.this.f6135b.getLayoutParams();
                layoutParams.topMargin = ((int) ((((float) HandLongPressView.this.f6136c.getMeasuredHeight()) / 2.0f) - C2642b.m6894a(HandLongPressView.this.getContext(), 5.0f))) + ((int) C2642b.m6894a(HandLongPressView.this.f6134a, 20.0f));
                layoutParams.leftMargin = ((int) ((((float) HandLongPressView.this.f6136c.getMeasuredWidth()) / 2.0f) - C2642b.m6894a(HandLongPressView.this.getContext(), 5.0f))) + ((int) C2642b.m6894a(HandLongPressView.this.f6134a, 20.0f));
                layoutParams.bottomMargin = (int) ((((float) (-HandLongPressView.this.f6136c.getMeasuredHeight())) / 2.0f) + C2642b.m6894a(HandLongPressView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) ((((float) (-HandLongPressView.this.f6136c.getMeasuredWidth())) / 2.0f) + C2642b.m6894a(HandLongPressView.this.getContext(), 5.0f));
                HandLongPressView.this.f6135b.setLayoutParams(layoutParams);
            }
        });
    }

    /* renamed from: c */
    private void m7521c() {
        this.f6136c = new CircleRippleView(this.f6134a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C2642b.m6894a(this.f6134a, 80.0f), (int) C2642b.m6894a(this.f6134a, 80.0f));
        layoutParams.gravity = 51;
        layoutParams.topMargin = (int) C2642b.m6894a(this.f6134a, 20.0f);
        layoutParams.leftMargin = (int) C2642b.m6894a(this.f6134a, 20.0f);
        addView(this.f6136c, layoutParams);
        this.f6136c.mo17337a();
        this.f6135b = new ImageView(this.f6134a);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C2642b.m6894a(this.f6134a, 80.0f), (int) C2642b.m6894a(this.f6134a, 80.0f));
        this.f6135b.setImageResource(C2984t.m8431d(this.f6134a, "tt_splash_hand"));
        addView(this.f6135b, layoutParams2);
        TextView textView = new TextView(this.f6134a);
        this.f6139f = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) C2642b.m6894a(this.f6134a, 10.0f);
        addView(this.f6139f, layoutParams3);
    }

    /* renamed from: d */
    private void m7522d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f6135b, "scaleX", new float[]{1.0f, 0.8f});
        ofFloat.setDuration(1000);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(HandLongPressView.this.f6135b, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(200);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.start();
                HandLongPressView.this.f6135b.setVisibility(0);
            }

            public void onAnimationRepeat(Animator animator) {
                if (HandLongPressView.this.f6138e) {
                    HandLongPressView.this.f6136c.mo17337a();
                    HandLongPressView.this.f6136c.setAlpha(1.0f);
                } else {
                    HandLongPressView.this.f6136c.mo17338b();
                    HandLongPressView.this.f6136c.setAlpha(0.0f);
                }
                HandLongPressView handLongPressView = HandLongPressView.this;
                boolean unused = handLongPressView.f6138e = !handLongPressView.f6138e;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f6135b, "scaleY", new float[]{1.0f, 0.8f});
        ofFloat2.setDuration(1000);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.f6137d.playTogether(new Animator[]{ofFloat, ofFloat2});
    }

    public void setGuideText(String str) {
        this.f6139f.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.f6139f.setTextColor(i);
    }

    /* renamed from: a */
    public void mo17358a() {
        this.f6137d.start();
    }

    /* renamed from: b */
    public void mo17359b() {
        AnimatorSet animatorSet = this.f6137d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        CircleRippleView circleRippleView = this.f6136c;
        if (circleRippleView != null) {
            circleRippleView.mo17338b();
        }
    }
}
