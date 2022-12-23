package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.applovin.impl.adview.C1525i;

/* renamed from: com.applovin.impl.adview.r */
public final class C1552r extends C1525i {

    /* renamed from: c */
    private static final Paint f1958c = new Paint(1);

    /* renamed from: d */
    private static final Paint f1959d = new Paint(1);

    /* renamed from: e */
    private final float[] f1960e = {30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};

    /* renamed from: f */
    private Path f1961f;

    public C1552r(Context context) {
        super(context);
        f1958c.setARGB(80, 0, 0, 0);
        f1959d.setColor(-1);
        f1959d.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    private void m2864a() {
        int i = 0;
        while (true) {
            float[] fArr = this.f1960e;
            if (i < fArr.length) {
                fArr[i] = fArr[i] * 0.3f * this.f1899a;
                i++;
            } else {
                Path path = new Path();
                this.f1961f = path;
                float[] fArr2 = this.f1960e;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f1961f;
                float[] fArr3 = this.f1960e;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f1961f;
                float[] fArr4 = this.f1960e;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f1961f;
                float[] fArr5 = this.f1960e;
                path4.moveTo(fArr5[6], fArr5[7]);
                Path path5 = this.f1961f;
                float[] fArr6 = this.f1960e;
                path5.lineTo(fArr6[8], fArr6[9]);
                Path path6 = this.f1961f;
                float[] fArr7 = this.f1960e;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo12959a(int i) {
        setViewScale(((float) i) / 30.0f);
        m2864a();
    }

    /* access modifiers changed from: protected */
    public float getCenter() {
        return getSize() / 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getStrokeWidth() {
        return this.f1899a * 2.0f;
    }

    public C1525i.C1526a getStyle() {
        return C1525i.C1526a.TRANSPARENT_SKIP;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f1958c);
        f1959d.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.f1961f, f1959d);
    }
}
