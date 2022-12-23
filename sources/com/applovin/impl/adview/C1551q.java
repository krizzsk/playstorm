package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.C1525i;

/* renamed from: com.applovin.impl.adview.q */
public final class C1551q extends C1525i {

    /* renamed from: c */
    private static final Paint f1956c = new Paint(1);

    /* renamed from: d */
    private static final Paint f1957d = new Paint(1);

    public C1551q(Context context) {
        super(context);
        f1956c.setARGB(80, 0, 0, 0);
        f1957d.setColor(-1);
        f1957d.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public void mo12959a(int i) {
        setViewScale(((float) i) / 30.0f);
    }

    /* access modifiers changed from: protected */
    public float getCenter() {
        return getSize() / 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getCrossOffset() {
        return this.f1899a * 8.0f;
    }

    /* access modifiers changed from: protected */
    public float getStrokeWidth() {
        return this.f1899a * 2.0f;
    }

    public C1525i.C1526a getStyle() {
        return C1525i.C1526a.WHITE_ON_TRANSPARENT;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f1956c);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        f1957d.setStrokeWidth(getStrokeWidth());
        Canvas canvas2 = canvas;
        float f = crossOffset;
        float f2 = size;
        canvas2.drawLine(f, crossOffset, f2, size, f1957d);
        canvas2.drawLine(f, size, f2, crossOffset, f1957d);
    }
}
