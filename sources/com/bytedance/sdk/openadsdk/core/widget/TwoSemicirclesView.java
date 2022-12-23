package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class TwoSemicirclesView extends View {

    /* renamed from: a */
    private final RectF f9702a;

    /* renamed from: b */
    private int f9703b;

    /* renamed from: c */
    private int f9704c;

    /* renamed from: d */
    private Paint f9705d;

    /* renamed from: e */
    private Paint f9706e;

    /* renamed from: f */
    private float f9707f = -90.0f;

    /* renamed from: g */
    private float f9708g = 220.0f;

    /* renamed from: h */
    private int f9709h = Color.parseColor("#FFFFFF");

    /* renamed from: i */
    private int f9710i = Color.parseColor("#C4C4C4");

    public TwoSemicirclesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12289a();
        float f = this.f9708g;
        this.f9702a = new RectF(-f, -f, f, f);
    }

    /* renamed from: a */
    private void m12289a() {
        Paint paint = new Paint();
        this.f9705d = paint;
        paint.setColor(this.f9709h);
        this.f9705d.setStyle(Paint.Style.STROKE);
        this.f9705d.setStrokeWidth(4.0f);
        this.f9705d.setAlpha(20);
        Paint paint2 = new Paint(this.f9705d);
        this.f9706e = paint2;
        paint2.setColor(this.f9710i);
        this.f9706e.setAlpha(255);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f9703b = i;
        this.f9704c = i2;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f9702a;
        float f = this.f9708g;
        rectF.set(-f, -f, f, f);
        canvas.translate((float) (this.f9703b / 2), (float) (this.f9704c / 2));
        canvas.drawArc(this.f9702a, this.f9707f, 180.0f, false, this.f9705d);
        canvas.drawArc(this.f9702a, this.f9707f + 180.0f, 180.0f, false, this.f9706e);
    }

    public void setCurrentStartAngle(float f) {
        this.f9707f = f;
        postInvalidate();
    }

    public void setRadius(float f) {
        this.f9708g = f;
        postInvalidate();
    }

    public void setPaintOne(Paint paint) {
        this.f9705d = paint;
        postInvalidate();
    }

    public Paint getPaintOne() {
        return this.f9705d;
    }

    public void setPaintTwo(Paint paint) {
        this.f9706e = paint;
        postInvalidate();
    }

    public Paint getPaintTwo() {
        return this.f9706e;
    }
}
