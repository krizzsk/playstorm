package com.p374my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* renamed from: com.my.target.o6 */
public class C9886o6 extends View {

    /* renamed from: a */
    public final Paint f24455a = new Paint();

    /* renamed from: b */
    public final Paint f24456b = new Paint();

    /* renamed from: c */
    public final Paint f24457c = new Paint();

    /* renamed from: d */
    public final C10059y8 f24458d;

    /* renamed from: e */
    public RectF f24459e = new RectF();

    /* renamed from: f */
    public long f24460f = 0;

    /* renamed from: g */
    public float f24461g = 0.0f;

    /* renamed from: h */
    public float f24462h = 0.0f;

    /* renamed from: i */
    public float f24463i = 230.0f;

    /* renamed from: j */
    public boolean f24464j = false;

    /* renamed from: k */
    public int f24465k;

    public C9886o6(Context context) {
        super(context);
        this.f24458d = C10059y8.m29843c(context);
    }

    /* renamed from: a */
    public final void mo65172a() {
        this.f24455a.setColor(-1);
        this.f24455a.setAntiAlias(true);
        this.f24455a.setStyle(Paint.Style.STROKE);
        this.f24455a.setStrokeWidth((float) this.f24458d.mo65778b(1));
        this.f24456b.setColor(-2013265920);
        this.f24456b.setAntiAlias(true);
        this.f24456b.setStyle(Paint.Style.FILL);
        this.f24456b.setStrokeWidth((float) this.f24458d.mo65778b(4));
    }

    /* renamed from: a */
    public final void mo65173a(int i, int i2) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        this.f24459e = new RectF((float) (getPaddingLeft() + this.f24458d.mo65778b(1)), (float) (paddingTop + this.f24458d.mo65778b(1)), (float) ((i - getPaddingRight()) - this.f24458d.mo65778b(1)), (float) ((i2 - paddingBottom) - this.f24458d.mo65778b(1)));
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        canvas.drawOval(this.f24459e, this.f24456b);
        if (this.f24461g != this.f24462h) {
            this.f24461g = Math.min(this.f24461g + ((((float) (SystemClock.uptimeMillis() - this.f24460f)) / 1000.0f) * this.f24463i), this.f24462h);
            this.f24460f = SystemClock.uptimeMillis();
            z = true;
        } else {
            z = false;
        }
        float f = this.f24461g;
        if (isInEditMode()) {
            f = 360.0f;
        }
        canvas.drawArc(this.f24459e, -90.0f, f, false, this.f24455a);
        this.f24457c.setColor(-1);
        this.f24457c.setTextSize((float) this.f24458d.mo65778b(12));
        this.f24457c.setTextAlign(Paint.Align.CENTER);
        this.f24457c.setAntiAlias(true);
        canvas.drawText(String.valueOf(this.f24465k), (float) ((int) this.f24459e.centerX()), (float) ((int) (this.f24459e.centerY() - ((this.f24457c.descent() + this.f24457c.ascent()) / 2.0f))), this.f24457c);
        if (z) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        int b = this.f24458d.mo65778b(28) + getPaddingLeft() + getPaddingRight();
        int b2 = this.f24458d.mo65778b(28) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            b = size;
        } else if (mode == Integer.MIN_VALUE) {
            b = Math.min(b, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            b2 = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            b2 = Math.min(b2, size2);
        }
        setMeasuredDimension(b, b2);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo65173a(i, i2);
        mo65172a();
        invalidate();
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.f24460f = SystemClock.uptimeMillis();
        }
    }

    public void setDigit(int i) {
        this.f24465k = i;
    }

    public void setMax(float f) {
        if (f > 0.0f) {
            this.f24463i = 360.0f / f;
        }
    }

    public void setProgress(float f) {
        if (this.f24464j) {
            this.f24461g = 0.0f;
            this.f24464j = false;
        }
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.f24462h;
        if (f != f2) {
            if (this.f24461g == f2) {
                this.f24460f = SystemClock.uptimeMillis();
            }
            this.f24462h = Math.min(f * 360.0f, 360.0f);
            invalidate();
        }
    }
}
