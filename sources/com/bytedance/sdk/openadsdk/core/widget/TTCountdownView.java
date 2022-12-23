package com.bytedance.sdk.openadsdk.core.widget;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.C3578m;

public class TTCountdownView extends View {

    /* renamed from: a */
    public static final String f9664a = C2984t.m8425a(C3578m.m11231a(), "tt_count_down_view");

    /* renamed from: b */
    private float f9665b;

    /* renamed from: c */
    private float f9666c;

    /* renamed from: d */
    private int f9667d;

    /* renamed from: e */
    private boolean f9668e;

    /* renamed from: f */
    private float f9669f;

    /* renamed from: g */
    private float f9670g;

    /* renamed from: h */
    private String f9671h;

    /* renamed from: i */
    private boolean f9672i;

    /* renamed from: j */
    private Paint f9673j;

    /* renamed from: k */
    private Paint f9674k;

    /* renamed from: l */
    private Paint f9675l;

    /* renamed from: m */
    private Paint f9676m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f9677n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f9678o;

    /* renamed from: p */
    private RectF f9679p;

    /* renamed from: q */
    private C3741a f9680q;

    /* renamed from: r */
    private AnimatorSet f9681r;

    /* renamed from: s */
    private ValueAnimator f9682s;

    /* renamed from: t */
    private ValueAnimator f9683t;

    /* renamed from: u */
    private ValueAnimator f9684u;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.TTCountdownView$a */
    public interface C3741a {
    }

    /* renamed from: a */
    public float mo20500a(float f, float f2) {
        return f * f2;
    }

    /* renamed from: a */
    public float mo20501a(float f, int i) {
        return ((float) i) * f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            size = m12282b();
        }
        if (mode2 != 1073741824) {
            size2 = m12282b();
        }
        setMeasuredDimension(size, size2);
    }

    /* renamed from: b */
    private int m12282b() {
        return (int) ((((this.f9665b / 2.0f) + this.f9666c) * 2.0f) + m12278a(4.0f));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(((float) getMeasuredWidth()) / 2.0f, ((float) getMeasuredHeight()) / 2.0f);
        m12283b(canvas);
        m12280a(canvas);
    }

    /* renamed from: a */
    private void m12280a(Canvas canvas) {
        String str;
        canvas.save();
        Paint.FontMetrics fontMetrics = this.f9676m.getFontMetrics();
        if (this.f9672i) {
            str = "" + ((int) Math.ceil((double) mo20500a(this.f9678o, this.f9670g)));
        } else {
            str = this.f9671h;
        }
        if (TextUtils.isEmpty(str)) {
            str = f9664a;
        }
        canvas.drawText(str, 0.0f, 0.0f - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), this.f9676m);
        canvas.restore();
    }

    /* renamed from: b */
    private void m12283b(Canvas canvas) {
        float f;
        canvas.save();
        float a = mo20501a(this.f9677n, 360);
        if (this.f9668e) {
            f = ((float) this.f9667d) - a;
        } else {
            f = (float) this.f9667d;
        }
        canvas.drawCircle(0.0f, 0.0f, this.f9666c, this.f9674k);
        canvas.drawCircle(0.0f, 0.0f, this.f9666c, this.f9675l);
        Canvas canvas2 = canvas;
        canvas2.drawArc(this.f9679p, f, a, false, this.f9673j);
        canvas.restore();
    }

    private ValueAnimator getNumAnim() {
        ValueAnimator valueAnimator = this.f9682s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9682s = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f9678o, 0.0f});
        this.f9682s = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f9682s.setDuration((long) (mo20500a(this.f9678o, this.f9670g) * 1000.0f));
        this.f9682s.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = TTCountdownView.this.f9678o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TTCountdownView.this.postInvalidate();
            }
        });
        return this.f9682s;
    }

    private ValueAnimator getArcAnim() {
        ValueAnimator valueAnimator = this.f9683t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9683t = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f9677n, 0.0f});
        this.f9683t = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f9683t.setDuration((long) (mo20500a(this.f9677n, this.f9669f) * 1000.0f));
        this.f9683t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = TTCountdownView.this.f9677n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TTCountdownView.this.postInvalidate();
            }
        });
        return this.f9683t;
    }

    /* renamed from: a */
    public void mo20502a() {
        AnimatorSet animatorSet = this.f9681r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f9681r = null;
        }
        ValueAnimator valueAnimator = this.f9684u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9684u = null;
        }
        ValueAnimator valueAnimator2 = this.f9682s;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f9682s = null;
        }
        ValueAnimator valueAnimator3 = this.f9683t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.f9683t = null;
        }
        this.f9677n = 1.0f;
        this.f9678o = 1.0f;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        mo20502a();
        super.onDetachedFromWindow();
    }

    public void setCountDownTime(int i) {
        float f = (float) i;
        this.f9670g = f;
        this.f9669f = f;
        mo20502a();
    }

    /* renamed from: a */
    private float m12278a(float f) {
        return TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    public C3741a getCountdownListener() {
        return this.f9680q;
    }

    public void setCountdownListener(C3741a aVar) {
        this.f9680q = aVar;
    }
}
