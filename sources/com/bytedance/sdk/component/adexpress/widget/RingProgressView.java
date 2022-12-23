package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class RingProgressView extends View {

    /* renamed from: a */
    private Context f6157a;

    /* renamed from: b */
    private Paint f6158b;

    /* renamed from: c */
    private RectF f6159c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f6160d;

    /* renamed from: e */
    private ValueAnimator f6161e;

    /* renamed from: f */
    private int f6162f = 1500;

    /* renamed from: g */
    private boolean f6163g;

    public RingProgressView(Context context) {
        super(context);
        this.f6157a = context;
        Paint paint = new Paint();
        this.f6158b = paint;
        paint.setAntiAlias(true);
        this.f6158b.setStyle(Paint.Style.STROKE);
        this.f6158b.setStrokeWidth(10.0f);
        this.f6158b.setColor(Color.parseColor("#80FFFFFF"));
        this.f6159c = new RectF();
    }

    /* renamed from: a */
    public void mo17383a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 360.0f});
        this.f6161e = ofFloat;
        ofFloat.setDuration((long) this.f6162f);
        this.f6161e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = RingProgressView.this.f6160d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RingProgressView.this.requestLayout();
            }
        });
        this.f6161e.start();
    }

    /* renamed from: b */
    public void mo17384b() {
        ValueAnimator valueAnimator = this.f6161e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo17385c() {
        this.f6163g = true;
        invalidate();
    }

    public void setDuration(int i) {
        this.f6162f = i;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f6163g) {
            canvas.drawArc(this.f6159c, 270.0f, this.f6160d, false, this.f6158b);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f6159c.set(5.0f, 5.0f, (float) (i - 5), (float) (i2 - 5));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }
}
