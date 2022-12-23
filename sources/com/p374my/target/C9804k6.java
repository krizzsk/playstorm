package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.p374my.target.common.models.ImageData;

/* renamed from: com.my.target.k6 */
public class C9804k6 extends ImageView {
    private Bitmap bitmap;
    private int maxHeight;
    private int maxWidth;
    private int placeholderHeight;
    private int placeholderWidth;

    public C9804k6(Context context) {
        super(context);
        init();
    }

    public C9804k6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public C9804k6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setAdjustViewBounds(true);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = this.placeholderHeight;
        if (i6 == 0 || (i3 = this.placeholderWidth) == 0) {
            Bitmap bitmap2 = this.bitmap;
            if (bitmap2 != null) {
                i3 = bitmap2.getWidth();
                i6 = this.bitmap.getHeight();
            } else {
                setMeasuredDimension(0, 0);
                return;
            }
        }
        if (i3 <= 0 || i4 <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        float f = (float) i3;
        float f2 = (float) i4;
        float f3 = f / f2;
        int i7 = this.maxHeight;
        if (i7 > 0) {
            size2 = Math.min(i7, size2);
        }
        int i8 = this.maxWidth;
        if (i8 > 0) {
            size = Math.min(i8, size);
        }
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (!(mode == 0 && mode2 == 0)) {
            if (mode == 0) {
                i5 = (int) (((float) size2) * f3);
            } else {
                if (mode2 == 0) {
                    i4 = (int) (((float) size) / f3);
                } else {
                    float f4 = (float) size;
                    float f5 = f4 / f;
                    float f6 = (float) size2;
                    if (Math.min(f5, f6 / f2) != f5 || f3 <= 0.0f) {
                        i5 = (int) (f6 * f3);
                    } else {
                        i4 = (int) (f4 / f3);
                    }
                }
                i3 = size;
            }
            i4 = size2;
        }
        setMeasuredDimension(i3, i4);
    }

    public void setImageBitmap(Bitmap bitmap2) {
        this.bitmap = bitmap2;
        super.setImageBitmap(bitmap2);
    }

    public void setImageBitmap(Bitmap bitmap2, boolean z) {
        if (z) {
            setAlpha(0.0f);
            setImageBitmap(bitmap2);
            animate().alpha(1.0f).setDuration(300);
            return;
        }
        setImageBitmap(bitmap2);
    }

    public void setImageData(ImageData imageData) {
        Bitmap bitmap2;
        if (imageData == null) {
            this.placeholderHeight = 0;
            this.placeholderWidth = 0;
            bitmap2 = null;
        } else {
            this.placeholderHeight = imageData.getHeight();
            this.placeholderWidth = imageData.getWidth();
            bitmap2 = imageData.getBitmap();
        }
        setImageBitmap(bitmap2);
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public void setPlaceholderDimensions(int i, int i2) {
        this.placeholderWidth = i;
        this.placeholderHeight = i2;
    }
}
