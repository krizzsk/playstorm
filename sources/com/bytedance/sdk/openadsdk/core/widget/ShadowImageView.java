package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ShadowImageView extends ImageView {

    /* renamed from: a */
    private Paint f9652a;

    /* renamed from: b */
    private RectF f9653b;

    public ShadowImageView(Context context) {
        super(context);
        m12274a();
    }

    public ShadowImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12274a();
    }

    public ShadowImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12274a();
    }

    /* renamed from: a */
    private void m12274a() {
        Paint paint = new Paint();
        this.f9652a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f9652a.setColor(Color.parseColor("#99333333"));
        this.f9652a.setAntiAlias(true);
        this.f9652a.setStrokeWidth(0.0f);
        this.f9653b = new RectF();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f9653b.right != ((float) getMeasuredWidth()) || this.f9653b.bottom != ((float) getMeasuredHeight())) {
            this.f9653b.set(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f9653b;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, this.f9653b.bottom / 2.0f, this.f9652a);
        super.onDraw(canvas);
    }
}
