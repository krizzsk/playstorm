package com.p374my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* renamed from: com.my.target.n6 */
public class C9862n6 extends View {

    /* renamed from: a */
    public final Paint f24390a = new Paint();

    /* renamed from: b */
    public final Paint f24391b = new Paint();

    /* renamed from: c */
    public final Paint f24392c = new Paint();

    /* renamed from: d */
    public final C10059y8 f24393d;

    /* renamed from: e */
    public RectF f24394e = new RectF();

    /* renamed from: f */
    public long f24395f = 0;

    /* renamed from: g */
    public float f24396g = 0.0f;

    /* renamed from: h */
    public float f24397h = 0.0f;

    /* renamed from: i */
    public float f24398i = 230.0f;

    /* renamed from: j */
    public boolean f24399j = false;

    /* renamed from: k */
    public int f24400k;

    /* renamed from: l */
    public int f24401l;

    public C9862n6(Context context) {
        super(context);
        C10059y8 c = C10059y8.m29843c(context);
        this.f24393d = c;
        this.f24401l = c.mo65778b(28);
    }

    /* renamed from: a */
    public final void mo64870a() {
        this.f24390a.setColor(-1);
        this.f24390a.setAntiAlias(true);
        this.f24390a.setStyle(Paint.Style.STROKE);
        this.f24390a.setStrokeWidth((float) this.f24393d.mo65778b(1));
        this.f24391b.setColor(-2013265920);
        this.f24391b.setAntiAlias(true);
        this.f24391b.setStyle(Paint.Style.FILL);
        this.f24391b.setStrokeWidth((float) this.f24393d.mo65778b(4));
    }

    /* renamed from: a */
    public final void mo64871a(int i, int i2) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        this.f24394e = new RectF((float) (getPaddingLeft() + this.f24393d.mo65778b(1)), (float) (paddingTop + this.f24393d.mo65778b(1)), (float) ((i - getPaddingRight()) - this.f24393d.mo65778b(1)), (float) ((i2 - paddingBottom) - this.f24393d.mo65778b(1)));
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        canvas.drawOval(this.f24394e, this.f24391b);
        if (this.f24396g != this.f24397h) {
            this.f24396g = Math.min(this.f24396g + ((((float) (SystemClock.uptimeMillis() - this.f24395f)) / 1000.0f) * this.f24398i), this.f24397h);
            this.f24395f = SystemClock.uptimeMillis();
            z = true;
        } else {
            z = false;
        }
        float f = this.f24396g;
        if (isInEditMode()) {
            f = 360.0f;
        }
        canvas.drawArc(this.f24394e, -90.0f, f, false, this.f24390a);
        this.f24392c.setColor(-1);
        this.f24392c.setTextSize((float) this.f24393d.mo65778b(12));
        this.f24392c.setTextAlign(Paint.Align.CENTER);
        this.f24392c.setAntiAlias(true);
        canvas.drawText(String.valueOf(this.f24400k), (float) ((int) this.f24394e.centerX()), (float) ((int) (this.f24394e.centerY() - ((this.f24392c.descent() + this.f24392c.ascent()) / 2.0f))), this.f24392c);
        if (z) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        int paddingLeft = this.f24401l + getPaddingLeft() + getPaddingRight();
        int paddingTop = this.f24401l + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, size);
        } else if (mode == 1073741824) {
            paddingLeft = size;
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingTop = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingTop = Math.min(paddingTop, size2);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo64871a(i, i2);
        mo64870a();
        invalidate();
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.f24395f = SystemClock.uptimeMillis();
        }
    }

    public void setDigit(int i) {
        this.f24400k = i;
    }

    public void setMax(float f) {
        if (f > 0.0f) {
            this.f24398i = 360.0f / f;
        }
    }

    public void setProgress(float f) {
        if (this.f24399j) {
            this.f24396g = 0.0f;
            this.f24399j = false;
        }
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.f24397h;
        if (f != f2) {
            if (this.f24396g == f2) {
                this.f24395f = SystemClock.uptimeMillis();
            }
            this.f24397h = Math.min(f * 360.0f, 360.0f);
            invalidate();
        }
    }

    public void setSize(int i) {
        this.f24401l = i;
    }
}
