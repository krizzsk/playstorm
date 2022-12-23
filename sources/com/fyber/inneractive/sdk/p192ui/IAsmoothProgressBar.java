package com.fyber.inneractive.sdk.p192ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;

/* renamed from: com.fyber.inneractive.sdk.ui.IAsmoothProgressBar */
public class IAsmoothProgressBar extends ProgressBar {

    /* renamed from: c */
    public static final Interpolator f14132c = new AccelerateDecelerateInterpolator();

    /* renamed from: a */
    public ValueAnimator f14133a;

    /* renamed from: b */
    public ValueAnimator f14134b;

    /* renamed from: com.fyber.inneractive.sdk.ui.IAsmoothProgressBar$a */
    public class C5308a implements ValueAnimator.AnimatorUpdateListener {
        public C5308a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IAsmoothProgressBar.super.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.ui.IAsmoothProgressBar$b */
    public class C5309b implements ValueAnimator.AnimatorUpdateListener {
        public C5309b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IAsmoothProgressBar.super.setSecondaryProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f14133a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f14134b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public synchronized void setProgress(int i) {
        if (!(Build.VERSION.SDK_INT >= 11)) {
            super.setProgress(i);
            return;
        }
        ValueAnimator valueAnimator = this.f14133a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f14133a;
        if (valueAnimator2 == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getProgress(), i});
            this.f14133a = ofInt;
            ofInt.setInterpolator(f14132c);
            this.f14133a.addUpdateListener(new C5308a());
        } else {
            valueAnimator2.setIntValues(new int[]{getProgress(), i});
        }
        this.f14133a.start();
    }

    public synchronized void setSecondaryProgress(int i) {
        if (!(Build.VERSION.SDK_INT >= 11)) {
            super.setSecondaryProgress(i);
            return;
        }
        ValueAnimator valueAnimator = this.f14134b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f14134b;
        if (valueAnimator2 == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getProgress(), i});
            this.f14134b = ofInt;
            ofInt.setInterpolator(f14132c);
            this.f14134b.addUpdateListener(new C5309b());
        } else {
            valueAnimator2.setIntValues(new int[]{getProgress(), i});
        }
        this.f14134b.start();
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
