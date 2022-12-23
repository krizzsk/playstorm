package com.bytedance.sdk.component.adexpress.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.ImageView;

public class ShadowImageView extends ImageView {

    /* renamed from: a */
    private Paint f6176a;

    /* renamed from: b */
    private RectF f6177b;

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f6177b.right != ((float) getMeasuredWidth()) || this.f6177b.bottom != ((float) getMeasuredHeight())) {
            this.f6177b.set(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f6177b;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, this.f6177b.bottom / 2.0f, this.f6176a);
        super.onDraw(canvas);
    }
}
