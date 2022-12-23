package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.C1525i;

/* renamed from: com.applovin.impl.adview.w */
public final class C1558w extends C1525i {

    /* renamed from: c */
    private static final Paint f1975c = new Paint(1);

    /* renamed from: d */
    private static final Paint f1976d = new Paint(1);

    /* renamed from: e */
    private static final Paint f1977e = new Paint(1);

    public C1558w(Context context) {
        super(context);
        f1975c.setColor(-1);
        f1976d.setColor(ViewCompat.MEASURED_STATE_MASK);
        f1977e.setColor(-1);
        f1977e.setStyle(Paint.Style.STROKE);
    }

    /* access modifiers changed from: protected */
    public float getCenter() {
        return getSize() / 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getCrossOffset() {
        return this.f1899a * 10.0f;
    }

    /* access modifiers changed from: protected */
    public float getInnerCircleOffset() {
        return this.f1899a * 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    /* access modifiers changed from: protected */
    public float getStrokeWidth() {
        return this.f1899a * 3.0f;
    }

    public C1525i.C1526a getStyle() {
        return C1525i.C1526a.WHITE_ON_BLACK;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f1975c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f1976d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        f1977e.setStrokeWidth(getStrokeWidth());
        Canvas canvas2 = canvas;
        float f = crossOffset;
        float f2 = size;
        canvas2.drawLine(f, crossOffset, f2, size, f1977e);
        canvas2.drawLine(f, size, f2, crossOffset, f1977e);
    }
}
