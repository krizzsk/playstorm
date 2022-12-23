package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.graphics.drawable.GradientDrawable;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a */
/* compiled from: CoverDrawable */
public class C2723a extends GradientDrawable {

    /* renamed from: a */
    private Paint f6027a;

    /* renamed from: b */
    private Path f6028b = new Path();

    public C2723a() {
        Paint paint = new Paint(1);
        this.f6027a = paint;
        paint.setColor(-1);
    }

    public C2723a(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        Paint paint = new Paint(1);
        this.f6027a = paint;
        paint.setColor(-1);
    }

    public void draw(Canvas canvas) {
        Path path = this.f6028b;
        if (path == null || path.isEmpty()) {
            super.draw(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.f6027a, 31);
        super.draw(canvas);
        this.f6027a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.f6028b, this.f6027a);
        this.f6027a.setXfermode((Xfermode) null);
        canvas.restoreToCount(saveLayer);
    }

    /* renamed from: a */
    public void mo17290a(int i, int i2, int i3, int i4) {
        this.f6028b.addRect((float) i, (float) i2, (float) i3, (float) i4, Path.Direction.CW);
        invalidateSelf();
    }
}
