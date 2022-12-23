package com.fyber.inneractive.sdk.p192ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.fyber.inneractive.sdk.util.C5350l;

/* renamed from: com.fyber.inneractive.sdk.ui.IAcloseButton */
public class IAcloseButton extends View {

    /* renamed from: a */
    public Paint f14116a;

    /* renamed from: b */
    public Path f14117b;

    public IAcloseButton(Context context, int i, boolean z) {
        super(context);
        int b = C5350l.m16760b(10);
        int i2 = (z ? (i - (b * 2)) / 4 : 0) + b;
        Point point = new Point(i2, i2);
        int i3 = i - i2;
        Point point2 = new Point(i2, i3);
        Point point3 = new Point(i3, i3);
        Point point4 = new Point(i3, i2);
        Path path = new Path();
        this.f14117b = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f14117b.moveTo((float) point.x, (float) point.y);
        this.f14117b.lineTo((float) point3.x, (float) point3.y);
        this.f14117b.moveTo((float) point2.x, (float) point2.y);
        this.f14117b.lineTo((float) point4.x, (float) point4.y);
        this.f14117b.close();
        Paint paint = new Paint(1);
        this.f14116a = paint;
        paint.setStrokeWidth((float) C5350l.m16760b(2));
        this.f14116a.setColor(-1);
        this.f14116a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f14116a.setAntiAlias(true);
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(-1436657061);
            gradientDrawable.setStroke(C5350l.m16760b(2), -1);
            C5350l.m16756a((View) this, (Drawable) gradientDrawable);
        }
        setPadding(b, b, b, b);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f14117b, this.f14116a);
    }
}
