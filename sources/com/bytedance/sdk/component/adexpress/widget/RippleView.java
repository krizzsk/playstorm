package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

public class RippleView extends View {

    /* renamed from: a */
    private float f6165a;

    /* renamed from: b */
    private float f6166b;

    /* renamed from: c */
    private ValueAnimator f6167c;

    /* renamed from: d */
    private ValueAnimator f6168d;

    /* renamed from: e */
    private Paint f6169e;

    /* renamed from: f */
    private long f6170f = 300;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public float f6171g = 0.0f;

    /* renamed from: h */
    private float f6172h;

    /* renamed from: i */
    private Animator.AnimatorListener f6173i;

    public RippleView(Context context) {
        super(context);
        mo17391a();
    }

    /* renamed from: a */
    public void mo17391a() {
        Paint paint = new Paint(1);
        this.f6169e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f6169e.setColor(Color.parseColor("#99000000"));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f6165a = ((float) i) / 2.0f;
        this.f6166b = ((float) i2) / 2.0f;
        this.f6172h = (float) (Math.hypot((double) i, (double) i2) / 2.0d);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f6165a, this.f6166b, this.f6171g, this.f6169e);
    }

    /* renamed from: b */
    public void mo17392b() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, this.f6172h});
        this.f6167c = ofFloat;
        ofFloat.setDuration(this.f6170f);
        this.f6167c.setInterpolator(new LinearInterpolator());
        this.f6167c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = RippleView.this.f6171g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        this.f6167c.start();
    }

    /* renamed from: c */
    public void mo17393c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f6172h, 0.0f});
        this.f6168d = ofFloat;
        ofFloat.setDuration(this.f6170f);
        this.f6168d.setInterpolator(new LinearInterpolator());
        this.f6168d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = RippleView.this.f6171g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.f6173i;
        if (animatorListener != null) {
            this.f6168d.addListener(animatorListener);
        }
        this.f6168d.start();
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f6173i = animatorListener;
    }
}
