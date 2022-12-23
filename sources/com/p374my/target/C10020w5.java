package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;

/* renamed from: com.my.target.w5 */
public class C10020w5 extends C9804k6 {
    public static final int DEFAULT_HEIGHT = 20;
    private int fixedHeight;

    public C10020w5(Context context) {
        this(context, (AttributeSet) null);
    }

    public C10020w5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C10020w5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fixedHeight = -1;
        this.fixedHeight = C10059y8.m29824a(20, context);
    }

    public void onMeasure(int i, int i2) {
        if (this.fixedHeight >= 0) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setFixedHeight(int i) {
        this.fixedHeight = i;
    }

    public void setImageBitmap(Bitmap bitmap) {
        int i;
        int i2;
        int i3 = this.fixedHeight;
        int i4 = 0;
        if (i3 >= 0) {
            i = (i3 - getPaddingTop()) - getPaddingBottom();
            if (i < 0) {
                i = 0;
            }
        } else {
            i = -1;
        }
        if (i >= 0) {
            if (bitmap != null) {
                i2 = bitmap.getWidth();
                i4 = bitmap.getHeight();
            } else {
                i2 = 0;
            }
            float f = 0.0f;
            if (i4 > 0) {
                f = ((float) i2) / ((float) i4);
            }
            setMeasuredDimension(((int) (((float) i) * f)) + getPaddingLeft() + getPaddingRight(), this.fixedHeight);
        }
        super.setImageBitmap(bitmap);
    }
}
