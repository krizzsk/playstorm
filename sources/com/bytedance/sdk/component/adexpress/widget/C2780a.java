package com.bytedance.sdk.component.adexpress.widget;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: com.bytedance.sdk.component.adexpress.widget.a */
/* compiled from: CubicBezierInterpolator */
public class C2780a implements Interpolator {

    /* renamed from: a */
    private int f6258a = 0;

    /* renamed from: b */
    private final PointF f6259b = new PointF();

    /* renamed from: c */
    private final PointF f6260c = new PointF();

    /* renamed from: d */
    private float f6261d = 0.0f;

    /* renamed from: a */
    public static double m7587a(double d, double d2, double d3) {
        double d4 = 1.0d - d;
        double d5 = d * d;
        return (d4 * d4 * 3.0d * d * d2) + (d4 * 3.0d * d5 * d3) + (d5 * d);
    }

    public C2780a(float f, float f2, float f3, float f4) {
        this.f6259b.x = f;
        this.f6259b.y = f2;
        this.f6260c.x = f3;
        this.f6260c.y = f4;
    }

    public float getInterpolation(float f) {
        if (f < ((float) this.f6258a)) {
            this.f6258a = 0;
        }
        int i = this.f6258a;
        float f2 = f;
        while (true) {
            if (i >= 4096) {
                break;
            }
            f2 = ((float) i) * 2.4414062E-4f;
            if (m7587a((double) f2, (double) this.f6259b.x, (double) this.f6260c.x) >= ((double) f)) {
                this.f6258a = i;
                break;
            }
            i++;
        }
        return (float) m7587a((double) f2, (double) this.f6259b.y, (double) this.f6260c.y);
    }
}
