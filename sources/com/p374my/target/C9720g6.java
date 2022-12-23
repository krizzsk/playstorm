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

/* renamed from: com.my.target.g6 */
public class C9720g6 extends View {

    /* renamed from: a */
    public final Rect f23950a;

    /* renamed from: b */
    public final Paint f23951b;

    /* renamed from: c */
    public final ColorFilter f23952c;

    /* renamed from: d */
    public final float f23953d = C10059y8.m29821a();

    /* renamed from: e */
    public final int f23954e;

    /* renamed from: f */
    public Bitmap f23955f;

    /* renamed from: g */
    public int f23956g;

    /* renamed from: h */
    public int f23957h;

    public C9720g6(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f23951b = paint;
        paint.setFilterBitmap(true);
        this.f23954e = C10059y8.m29824a(10, context);
        this.f23950a = new Rect();
        this.f23952c = new LightingColorFilter(-3355444, 1);
    }

    /* renamed from: a */
    public void mo64102a(Bitmap bitmap, boolean z) {
        int i;
        this.f23955f = bitmap;
        if (bitmap == null) {
            i = 0;
            this.f23957h = 0;
        } else if (z) {
            float f = 1.0f;
            if (this.f23953d > 1.0f) {
                f = 2.0f;
            }
            this.f23957h = (int) ((((float) bitmap.getHeight()) / f) * this.f23953d);
            i = (int) ((((float) this.f23955f.getWidth()) / f) * this.f23953d);
        } else {
            this.f23956g = bitmap.getWidth();
            this.f23957h = this.f23955f.getHeight();
            int i2 = this.f23956g;
            int i3 = this.f23954e * 2;
            setMeasuredDimension(i2 + i3, this.f23957h + i3);
            requestLayout();
        }
        this.f23956g = i;
        int i22 = this.f23956g;
        int i32 = this.f23954e * 2;
        setMeasuredDimension(i22 + i32, this.f23957h + i32);
        requestLayout();
    }

    public int getPadding() {
        return this.f23954e;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f23955f;
        if (bitmap != null) {
            Rect rect = this.f23950a;
            int i = this.f23954e;
            rect.left = i;
            rect.top = i;
            rect.right = this.f23956g + i;
            rect.bottom = this.f23957h + i;
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f23951b);
        }
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
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
            paint = this.f23951b;
            colorFilter = null;
        } else {
            paint = this.f23951b;
            colorFilter = this.f23952c;
        }
        paint.setColorFilter(colorFilter);
        invalidate();
        return true;
    }
}
