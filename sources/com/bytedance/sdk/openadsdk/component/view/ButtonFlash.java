package com.bytedance.sdk.openadsdk.component.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.view.ViewCompat;

public class ButtonFlash extends TextView {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f8185a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f8186b;

    /* renamed from: c */
    private Paint f8187c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public LinearGradient f8188d;

    /* renamed from: e */
    private RectF f8189e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Matrix f8190f;

    /* renamed from: g */
    private ValueAnimator f8191g;

    /* renamed from: h */
    private boolean f8192h = true;

    public ButtonFlash(Context context) {
        super(context);
        m10173b();
    }

    public ButtonFlash(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m10173b();
    }

    public ButtonFlash(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m10173b();
    }

    /* renamed from: b */
    private void m10173b() {
        this.f8189e = new RectF();
        this.f8187c = new Paint();
        m10175c();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f8185a = i;
        this.f8186b = i2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, ((float) this.f8185a) / 2.0f, (float) this.f8186b, new int[]{ViewCompat.MEASURED_SIZE_MASK, 1358954495, ViewCompat.MEASURED_SIZE_MASK}, new float[]{0.1f, 0.3f, 0.5f}, Shader.TileMode.CLAMP);
        this.f8188d = linearGradient;
        this.f8187c.setShader(linearGradient);
        this.f8187c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        Matrix matrix = new Matrix();
        this.f8190f = matrix;
        matrix.setTranslate((float) (-this.f8185a), (float) this.f8186b);
        this.f8188d.setLocalMatrix(this.f8190f);
        this.f8189e.set(0.0f, 0.0f, (float) this.f8185a, (float) this.f8186b);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f8190f != null) {
            canvas.drawRoundRect(this.f8189e, 100.0f, 100.0f, this.f8187c);
        }
    }

    /* renamed from: c */
    private void m10175c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f8191g = ofFloat;
        ofFloat.setDuration(3000);
        this.f8191g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float a = (((float) (ButtonFlash.this.f8185a * 2)) * ((Float) valueAnimator.getAnimatedValue()).floatValue()) - ((float) ButtonFlash.this.f8185a);
                if (ButtonFlash.this.f8190f != null) {
                    ButtonFlash.this.f8190f.setTranslate(a, (float) ButtonFlash.this.f8186b);
                }
                if (ButtonFlash.this.f8188d != null) {
                    ButtonFlash.this.f8188d.setLocalMatrix(ButtonFlash.this.f8190f);
                }
                ButtonFlash.this.invalidate();
            }
        });
        if (this.f8192h) {
            this.f8191g.setRepeatCount(-1);
            ValueAnimator valueAnimator = this.f8191g;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    public void setAutoRun(boolean z) {
        this.f8192h = z;
    }

    /* renamed from: a */
    public void mo19340a() {
        ValueAnimator valueAnimator = this.f8191g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            invalidate();
        }
    }
}
