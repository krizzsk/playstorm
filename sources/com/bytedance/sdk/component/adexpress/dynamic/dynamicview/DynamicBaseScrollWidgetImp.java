package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;

public class DynamicBaseScrollWidgetImp extends DynamicBaseWidgetImp implements C2725c {

    /* renamed from: a */
    ObjectAnimator f5954a;

    /* renamed from: b */
    ObjectAnimator f5955b;

    /* renamed from: s */
    private int f5956s = 0;

    /* renamed from: t */
    private Runnable f5957t = new Runnable() {
        public void run() {
            DynamicBaseScrollWidgetImp.this.m7364a();
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7364a() {
        final View childAt = getChildAt(this.f5956s);
        final View childAt2 = getChildAt((this.f5956s + 1) % getChildCount());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "translationY", new float[]{0.0f, (float) ((-(this.f5970h + getChildAt(this.f5956s).getHeight())) / 2)});
        this.f5954a = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f5954a.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", new float[]{(float) ((this.f5970h + childAt2.getHeight()) / 2), 0.0f});
        this.f5955b = ofFloat2;
        ofFloat2.setInterpolator(new LinearInterpolator());
        this.f5955b.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                childAt2.setVisibility(0);
            }
        });
        this.f5954a.setDuration(500);
        this.f5955b.setDuration(500);
        this.f5954a.start();
        this.f5955b.start();
        int i = this.f5956s + 1;
        this.f5956s = i;
        this.f5956s = i % getChildCount();
        postDelayed(this.f5957t, 2000);
    }

    public DynamicBaseScrollWidgetImp(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context, dynamicRootView, hVar);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.f5970h - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.f5957t, 2500);
    }

    /* renamed from: b */
    public void mo16881b() {
        removeCallbacks(this.f5957t);
        ObjectAnimator objectAnimator = this.f5954a;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.f5954a.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f5955b;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f5955b.cancel();
        }
        super.mo16881b();
    }
}
