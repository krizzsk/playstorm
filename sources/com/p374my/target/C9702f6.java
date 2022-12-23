package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.my.target.f6 */
public class C9702f6 extends View {

    /* renamed from: a */
    public final Rect f23891a;

    /* renamed from: b */
    public final Paint f23892b;

    /* renamed from: c */
    public final ColorFilter f23893c;

    /* renamed from: d */
    public final float f23894d = C10059y8.m29821a();

    /* renamed from: e */
    public int f23895e;

    /* renamed from: f */
    public Bitmap f23896f;

    /* renamed from: g */
    public int f23897g;

    /* renamed from: h */
    public int f23898h;

    public C9702f6(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f23892b = paint;
        paint.setFilterBitmap(true);
        this.f23895e = C10059y8.m29824a(10, context);
        this.f23891a = new Rect();
        this.f23893c = new LightingColorFilter(-3355444, 1);
    }

    /* renamed from: a */
    public void mo64026a(Bitmap bitmap, boolean z) {
        int i;
        this.f23896f = bitmap;
        if (bitmap == null) {
            i = 0;
            this.f23898h = 0;
        } else if (z) {
            float f = 1.0f;
            if (this.f23894d > 1.0f) {
                f = 2.0f;
            }
            this.f23898h = (int) ((((float) bitmap.getHeight()) / f) * this.f23894d);
            i = (int) ((((float) this.f23896f.getWidth()) / f) * this.f23894d);
        } else {
            this.f23897g = bitmap.getWidth();
            this.f23898h = this.f23896f.getHeight();
            requestLayout();
        }
        this.f23897g = i;
        requestLayout();
    }

    public int getPadding() {
        return this.f23895e;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f23896f != null) {
            Rect rect = this.f23891a;
            int i = this.f23895e;
            rect.left = i;
            rect.top = i;
            rect.right = getMeasuredWidth() - this.f23895e;
            this.f23891a.bottom = getMeasuredHeight() - this.f23895e;
            canvas.drawBitmap(this.f23896f, (Rect) null, this.f23891a, this.f23892b);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = this.f23895e * 2;
        int i6 = size - i5;
        int i7 = size2 - i5;
        if (this.f23896f == null || (i3 = this.f23897g) <= 0 || (i4 = this.f23898h) <= 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        float f = (float) i3;
        float f2 = (float) i4;
        float f3 = f / f2;
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (mode == 0 && mode2 == 0) {
            i6 = i3;
            i7 = i4;
        } else if (mode == 0) {
            i6 = (int) (((float) i7) * f3);
        } else {
            float f4 = (float) i6;
            if (mode2 != 0) {
                float f5 = f4 / f;
                float f6 = (float) i7;
                if (Math.min(f5, f6 / f2) != f5 || f3 <= 0.0f) {
                    i6 = (int) (f6 * f3);
                }
            }
            i7 = (int) (f4 / f3);
        }
        int i8 = this.f23895e * 2;
        setMeasuredDimension(i6 + i8, i7 + i8);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Paint paint;
        ColorFilter colorFilter;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 3) {
                    return super.onTouchEvent(motionEvent);
                }
            } else if (motionEvent.getX() >= 0.0f && motionEvent.getX() <= ((float) getMeasuredWidth()) && motionEvent.getY() >= 0.0f && motionEvent.getY() <= ((float) getMeasuredHeight())) {
                performClick();
            }
            paint = this.f23892b;
            colorFilter = null;
        } else {
            paint = this.f23892b;
            colorFilter = this.f23893c;
        }
        paint.setColorFilter(colorFilter);
        invalidate();
        return true;
    }

    public void setPadding(int i) {
        this.f23895e = i;
    }
}
