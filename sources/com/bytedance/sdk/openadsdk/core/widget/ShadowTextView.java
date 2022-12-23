package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.TextView;

public class ShadowTextView extends TextView {

    /* renamed from: a */
    private Paint f9654a;

    /* renamed from: b */
    private RectF f9655b;

    /* renamed from: c */
    private int f9656c;

    public ShadowTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9656c = 0;
        m12275a();
    }

    /* renamed from: a */
    private void m12275a() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.f9654a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f9654a.setColor(Color.parseColor("#99333333"));
        this.f9654a.setAntiAlias(true);
        this.f9654a.setStrokeWidth(0.0f);
        this.f9655b = new RectF();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.f9655b.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        int measureText = (int) getPaint().measureText("00");
        this.f9656c = measureText;
        if (measuredWidth < measureText) {
            measuredWidth = measureText;
        }
        int i3 = measuredWidth + ((measuredHeight / 2) * 2);
        setMeasuredDimension(i3, measuredHeight);
        this.f9655b.set(0.0f, 0.0f, (float) i3, (float) measuredHeight);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f9655b;
        canvas.drawRoundRect(rectF, rectF.bottom / 2.0f, this.f9655b.bottom / 2.0f, this.f9654a);
        canvas.translate((this.f9655b.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }
}
