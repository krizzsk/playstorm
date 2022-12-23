package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.utils.C2984t;

public class SlideUpView extends RelativeLayout {

    /* renamed from: a */
    private ImageView f6203a;

    /* renamed from: b */
    private ImageView f6204b;

    /* renamed from: c */
    private ImageView f6205c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageView f6206d;

    /* renamed from: e */
    private TextView f6207e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AnimatorSet f6208f = new AnimatorSet();

    /* renamed from: g */
    private AnimatorSet f6209g = new AnimatorSet();

    /* renamed from: h */
    private AnimatorSet f6210h = new AnimatorSet();

    /* renamed from: i */
    private AnimatorSet f6211i = new AnimatorSet();

    public SlideUpView(Context context) {
        super(context);
        m7565a(context);
    }

    /* renamed from: a */
    private void m7565a(Context context) {
        if (context == null) {
            context = C2640c.m6890a();
        }
        inflate(context, C2984t.m8433f(context, "tt_dynamic_splash_slide_up"), this);
        this.f6205c = (ImageView) findViewById(C2984t.m8432e(context, "tt_splash_slide_up_guide_bar"));
        this.f6203a = (ImageView) findViewById(C2984t.m8432e(context, "tt_splash_slide_up_finger"));
        this.f6204b = (ImageView) findViewById(C2984t.m8432e(context, "tt_splash_slide_up_circle"));
        this.f6207e = (TextView) findViewById(C2984t.m8432e(context, "slide_guide_text"));
        this.f6206d = (ImageView) findViewById(C2984t.m8432e(context, "tt_splash_slide_up_bg"));
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.f6208f;
    }

    /* renamed from: a */
    public void mo17422a() {
        mo17423b();
        this.f6208f.start();
        this.f6208f.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SlideUpView.this.postDelayed(new Runnable() {
                    public void run() {
                        SlideUpView.this.f6208f.start();
                    }
                }, 200);
            }
        });
    }

    /* renamed from: b */
    public void mo17423b() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f6203a, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f6203a, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f6203a, "translationY", new float[]{0.0f, C2642b.m6894a(getContext(), -100.0f)});
        ofFloat3.setInterpolator(new C2780a(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, (int) C2642b.m6894a(getContext(), 100.0f)});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) SlideUpView.this.f6206d.getLayoutParams();
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SlideUpView.this.f6206d.setLayoutParams(layoutParams);
            }
        });
        ofInt.setInterpolator(new C2780a(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f6206d, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f6206d, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f6204b, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f6204b, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f6204b, "scaleX", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f6204b, "scaleY", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f6204b, "translationY", new float[]{0.0f, C2642b.m6894a(getContext(), -100.0f)});
        ValueAnimator valueAnimator = ofInt;
        ofFloat10.setInterpolator(new C2780a(0.2f, 0.0f, 0.3f, 1.0f));
        this.f6209g.setDuration(50);
        this.f6211i.setDuration(1500);
        this.f6210h.setDuration(50);
        this.f6209g.playTogether(new Animator[]{ofFloat2, ofFloat7, ofFloat5});
        this.f6210h.playTogether(new Animator[]{ofFloat, ofFloat6, ofFloat8, ofFloat9, ofFloat4});
        this.f6211i.playTogether(new Animator[]{ofFloat3, valueAnimator, ofFloat10});
        this.f6208f.playSequentially(new Animator[]{this.f6210h, this.f6211i, this.f6209g});
    }

    /* renamed from: c */
    public void mo17424c() {
        AnimatorSet animatorSet = this.f6208f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f6210h;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.f6209g;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.f6211i;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
    }

    public void setGuideText(String str) {
        this.f6207e.setText(str);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo17424c();
    }
}
