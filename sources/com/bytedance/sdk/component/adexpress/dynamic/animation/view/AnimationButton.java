package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;

public class AnimationButton extends TextView implements C2678b {

    /* renamed from: a */
    C2677a f5765a = new C2677a();

    /* renamed from: b */
    private float f5766b;

    /* renamed from: c */
    private float f5767c;

    /* renamed from: d */
    private float f5768d;

    public float getShineValue() {
        return this.f5767c;
    }

    public void setShineValue(float f) {
        this.f5767c = f;
        postInvalidate();
    }

    public float getRippleValue() {
        return this.f5766b;
    }

    public void setRippleValue(float f) {
        this.f5766b = f;
        postInvalidate();
    }

    public float getMarqueeValue() {
        return this.f5768d;
    }

    public void setMarqueeValue(float f) {
        this.f5768d = f;
        postInvalidate();
    }

    public AnimationButton(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f5765a.mo16908a(canvas, (C2678b) this, (View) this);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f5765a.mo16909a((View) this, i, i2);
    }
}
