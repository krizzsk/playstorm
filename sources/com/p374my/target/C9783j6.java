package com.p374my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* renamed from: com.my.target.j6 */
public class C9783j6 extends View {

    /* renamed from: a */
    public static final Paint f24135a;

    /* renamed from: b */
    public static final Path f24136b = new Path();

    static {
        Paint paint = new Paint();
        f24135a = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
    }

    public C9783j6(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static Path m28408a(float f) {
        Path path = f24136b;
        path.reset();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f2 = 0.45f * f;
        double d = (double) f;
        float f3 = f * 2.0f;
        path.moveTo((float) ((Math.sin(0.0d) * d) + d), f3 - ((float) ((Math.cos(0.0d) * d) + d)));
        double d2 = (double) f2;
        path.lineTo((float) ((Math.sin(0.6283185307179586d) * d2) + d), f3 - ((float) ((Math.cos(0.6283185307179586d) * d2) + d)));
        for (int i = 1; i < 5; i++) {
            Path path2 = f24136b;
            double d3 = ((double) i) * 1.2566370614359172d;
            path2.lineTo((float) ((Math.sin(d3) * d) + d), f3 - ((float) ((Math.cos(d3) * d) + d)));
            double d4 = d3 + 0.6283185307179586d;
            path2.lineTo((float) ((Math.sin(d4) * d2) + d), f3 - ((float) ((Math.cos(d4) * d2) + d)));
        }
        Path path3 = f24136b;
        path3.close();
        return path3;
    }

    public void onDraw(Canvas canvas) {
        float measuredHeight = ((float) getMeasuredHeight()) / 2.0f;
        if (measuredHeight != 0.0f) {
            canvas.drawPath(m28408a(measuredHeight), f24135a);
        }
    }

    public void onMeasure(int i, int i2) {
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i));
        setMeasuredDimension(min, min);
    }

    public void setColor(int i) {
        f24135a.setColor(i);
        invalidate();
    }
}
