package com.p374my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

/* renamed from: com.my.target.b6 */
public class C9629b6 extends TextView {

    /* renamed from: a */
    public final GradientDrawable f23672a;

    /* renamed from: b */
    public int f23673b;

    public C9629b6(Context context) {
        this(context, (AttributeSet) null);
    }

    public C9629b6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9629b6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f23672a = gradientDrawable;
        gradientDrawable.setStroke(0, -13421773);
        gradientDrawable.setColor(0);
        this.f23673b = (int) TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public void mo63621a(int i, int i2) {
        mo63622a(i, i2, 0);
    }

    /* renamed from: a */
    public void mo63622a(int i, int i2, int i3) {
        this.f23672a.setStroke(i, i2);
        this.f23672a.setCornerRadius((float) i3);
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        this.f23672a.setBounds(getPaddingLeft() - this.f23673b, getPaddingTop(), getWidth(), getHeight());
        this.f23672a.draw(canvas);
        super.onDraw(canvas);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth() + (this.f23673b * 2), getMeasuredHeight());
    }

    public void setBackgroundColor(int i) {
        this.f23672a.setColor(i);
        invalidate();
    }
}
