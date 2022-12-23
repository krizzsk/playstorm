package com.inmobi.media;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import androidx.core.view.ViewCompat;

/* renamed from: com.inmobi.media.cp */
/* compiled from: CustomView */
public class C5933cp extends View {

    /* renamed from: a */
    private static final String f15042a = C5933cp.class.getSimpleName();

    /* renamed from: b */
    private float f15043b;

    /* renamed from: c */
    private float f15044c;

    /* renamed from: d */
    private float f15045d;

    /* renamed from: e */
    private float f15046e;

    /* renamed from: f */
    private float f15047f;

    /* renamed from: g */
    private byte f15048g;

    /* renamed from: h */
    private int f15049h;

    /* renamed from: i */
    private Paint f15050i;

    /* renamed from: j */
    private Path f15051j;

    /* renamed from: k */
    private RectF f15052k;

    private C5933cp(Context context) {
        super(context);
    }

    public C5933cp(Context context, float f, byte b) {
        this(context);
        this.f15048g = b;
        this.f15043b = f;
        this.f15049h = 15;
        this.f15050i = new Paint(1);
        this.f15052k = new RectF();
        this.f15051j = new Path();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        this.f15050i.reset();
        switch (this.f15048g) {
            case 0:
                float f = this.f15043b;
                float f2 = (50.0f * f) / 2.0f;
                float f3 = (f * 30.0f) / 2.0f;
                float f4 = f3 / 3.0f;
                float f5 = f2 - f4;
                float f6 = f2 + f4;
                this.f15050i.setAntiAlias(true);
                this.f15050i.setColor(ViewCompat.MEASURED_STATE_MASK);
                this.f15050i.setStrokeWidth(3.0f);
                this.f15050i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawCircle(f2, f2, f3, this.f15050i);
                this.f15050i.setColor(-1);
                this.f15050i.setStyle(Paint.Style.STROKE);
                Canvas canvas3 = canvas;
                float f7 = f5;
                float f8 = f6;
                canvas3.drawLine(f7, f5, f8, f6, this.f15050i);
                canvas3.drawLine(f7, f6, f8, f5, this.f15050i);
                canvas2.drawCircle(f2, f2, f3, this.f15050i);
                return;
            case 1:
                float f9 = (this.f15043b * 50.0f) / 2.0f;
                this.f15050i.setAntiAlias(true);
                this.f15050i.setColor(0);
                this.f15050i.setStrokeWidth(3.0f);
                this.f15050i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawCircle(f9, f9, f9, this.f15050i);
                return;
            case 2:
                this.f15050i.setAntiAlias(true);
                this.f15050i.setColor(-1);
                this.f15050i.setStrokeWidth(5.0f);
                this.f15050i.setStyle(Paint.Style.STROKE);
                Canvas canvas4 = canvas;
                canvas4.drawLine(((float) (getWidth() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f), ((((float) this.f15049h) * this.f15043b) / 2.0f) + ((float) (getWidth() / 2)), ((((float) this.f15049h) * this.f15043b) / 2.0f) + ((float) (getHeight() / 2)), this.f15050i);
                Canvas canvas5 = canvas;
                canvas5.drawLine(((float) (getWidth() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f), ((((float) this.f15049h) * this.f15043b) / 2.0f) + ((float) (getHeight() / 2)), ((((float) this.f15049h) * this.f15043b) / 2.0f) + ((float) (getWidth() / 2)), ((float) (getHeight() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f), this.f15050i);
                return;
            case 3:
                float width = ((float) getWidth()) / 2.0f;
                float height = ((float) getHeight()) / 2.0f;
                float f10 = (this.f15043b * 30.0f) / 2.0f;
                this.f15051j.reset();
                this.f15050i.setAntiAlias(true);
                this.f15050i.setColor(ViewCompat.MEASURED_STATE_MASK);
                this.f15050i.setStrokeWidth(3.0f);
                this.f15050i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawCircle(width, height, f10, this.f15050i);
                this.f15050i.setColor(-1);
                this.f15050i.setStyle(Paint.Style.STROKE);
                canvas2.drawCircle(width, height, f10, this.f15050i);
                this.f15052k.set(((float) (getWidth() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f), ((float) (getWidth() / 2)) + ((((float) this.f15049h) * this.f15043b) / 2.0f), ((float) (getHeight() / 2)) + ((((float) this.f15049h) * this.f15043b) / 2.0f));
                canvas.drawArc(this.f15052k, 0.0f, 270.0f, false, this.f15050i);
                this.f15051j.setFillType(Path.FillType.EVEN_ODD);
                this.f15051j.moveTo(((float) (getWidth() / 2)) + ((((float) this.f15049h) * this.f15043b) / 2.0f), ((float) (getHeight() / 2)) - (this.f15043b * 2.0f));
                Path path = this.f15051j;
                float f11 = this.f15043b;
                path.lineTo((((float) (getWidth() / 2)) + ((((float) this.f15049h) * f11) / 2.0f)) - (f11 * 2.0f), (float) (getHeight() / 2));
                Path path2 = this.f15051j;
                float f12 = this.f15043b;
                path2.lineTo(((float) (getWidth() / 2)) + ((((float) this.f15049h) * f12) / 2.0f) + (f12 * 2.0f), (float) (getHeight() / 2));
                this.f15051j.lineTo(((float) (getWidth() / 2)) + ((((float) this.f15049h) * this.f15043b) / 2.0f), ((float) (getHeight() / 2)) - (this.f15043b * 2.0f));
                this.f15051j.close();
                this.f15050i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawPath(this.f15051j, this.f15050i);
                return;
            case 4:
                this.f15051j.reset();
                this.f15051j.setFillType(Path.FillType.EVEN_ODD);
                this.f15051j.moveTo(((float) (getWidth() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f), (float) (getHeight() / 2));
                this.f15051j.lineTo(((float) (getWidth() / 2)) + ((((float) this.f15049h) * this.f15043b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f));
                this.f15051j.lineTo(((float) (getWidth() / 2)) + ((((float) this.f15049h) * this.f15043b) / 2.0f), ((float) (getHeight() / 2)) + ((((float) this.f15049h) * this.f15043b) / 2.0f));
                this.f15051j.lineTo(((float) (getWidth() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f), (float) (getHeight() / 2));
                this.f15051j.close();
                this.f15050i.setAntiAlias(true);
                this.f15050i.setColor(ViewCompat.MEASURED_STATE_MASK);
                this.f15050i.setStrokeWidth(3.0f);
                this.f15050i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawPath(this.f15051j, this.f15050i);
                return;
            case 5:
                this.f15051j.reset();
                this.f15051j.setFillType(Path.FillType.EVEN_ODD);
                this.f15051j.moveTo(((float) (getWidth() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f));
                this.f15051j.lineTo(((float) (getWidth() / 2)) + ((((float) this.f15049h) * this.f15043b) / 2.0f), (float) (getHeight() / 2));
                this.f15051j.lineTo(((float) (getWidth() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f), ((float) (getHeight() / 2)) + ((((float) this.f15049h) * this.f15043b) / 2.0f));
                this.f15051j.lineTo(((float) (getWidth() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f));
                this.f15051j.close();
                this.f15050i.setAntiAlias(true);
                this.f15050i.setColor(ViewCompat.MEASURED_STATE_MASK);
                this.f15050i.setStrokeWidth(3.0f);
                this.f15050i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawPath(this.f15051j, this.f15050i);
                return;
            case 6:
                this.f15051j.reset();
                this.f15051j.setFillType(Path.FillType.EVEN_ODD);
                this.f15051j.moveTo(((float) (getWidth() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f));
                this.f15051j.lineTo(((float) (getWidth() / 2)) + ((((float) this.f15049h) * this.f15043b) / 2.0f), (float) (getHeight() / 2));
                this.f15051j.lineTo(((float) (getWidth() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f), ((float) (getHeight() / 2)) + ((((float) this.f15049h) * this.f15043b) / 2.0f));
                this.f15051j.lineTo(((float) (getWidth() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f), ((float) (getHeight() / 2)) - ((((float) this.f15049h) * this.f15043b) / 2.0f));
                this.f15051j.close();
                this.f15050i.setAntiAlias(true);
                this.f15050i.setColor(-12303292);
                this.f15050i.setStrokeWidth(3.0f);
                this.f15050i.setStyle(Paint.Style.FILL_AND_STROKE);
                canvas2.drawPath(this.f15051j, this.f15050i);
                return;
            case 7:
                m17736b(canvas);
                float f13 = this.f15047f;
                this.f15044c = f13 / 3.0f;
                this.f15045d = f13 / 3.0f;
                this.f15050i.setStyle(Paint.Style.FILL);
                Path path3 = this.f15051j;
                float f14 = this.f15046e;
                path3.moveTo(this.f15044c + f14, f14);
                Path path4 = this.f15051j;
                float f15 = this.f15046e;
                path4.lineTo(f15 - this.f15044c, f15 - this.f15045d);
                Path path5 = this.f15051j;
                float f16 = this.f15046e;
                path5.lineTo(f16 - this.f15044c, f16 + this.f15045d);
                Path path6 = this.f15051j;
                float f17 = this.f15046e;
                path6.lineTo(this.f15044c + f17, f17);
                canvas2.drawPath(this.f15051j, this.f15050i);
                return;
            case 8:
                m17736b(canvas);
                float f18 = this.f15047f;
                float f19 = f18 / 4.0f;
                this.f15044c = f19;
                float f20 = f18 / 3.0f;
                this.f15045d = f20;
                float f21 = this.f15046e;
                canvas.drawLine(f21 - f19, f21 - f20, f21 - f19, f21 + f20, this.f15050i);
                float f22 = this.f15046e;
                float f23 = this.f15044c;
                float f24 = this.f15045d;
                canvas.drawLine(f22 + f23, f22 - f24, f22 + f23, f22 + f24, this.f15050i);
                return;
            case 9:
                m17735a(canvas);
                float f25 = this.f15046e;
                float f26 = this.f15043b;
                float f27 = this.f15045d;
                RectF rectF = new RectF(f25 - (f26 * 10.0f), (f25 - f27) - (f26 * 2.0f), (14.0f * f26) + f25, f25 + f27 + (f26 * 2.0f));
                float f28 = this.f15046e;
                float f29 = this.f15043b;
                float f30 = this.f15045d;
                RectF rectF2 = new RectF(f28 - (10.0f * f29), (f28 - f30) - (f29 * 4.0f), (18.0f * f29) + f28, f28 + f30 + (f29 * 4.0f));
                this.f15050i.setColor(-1);
                this.f15050i.setStrokeWidth(4.0f);
                this.f15050i.setStyle(Paint.Style.STROKE);
                Canvas canvas6 = canvas;
                canvas6.drawArc(rectF, -45.0f, 90.0f, false, this.f15050i);
                canvas6.drawArc(rectF2, -45.0f, 90.0f, false, this.f15050i);
                canvas2.drawPath(this.f15051j, this.f15050i);
                canvas2.drawPath(this.f15051j, this.f15050i);
                return;
            case 11:
                m17735a(canvas);
                this.f15050i.setColor(-1);
                this.f15050i.setStrokeWidth(4.0f);
                this.f15050i.setStyle(Paint.Style.STROKE);
                Path path7 = this.f15051j;
                float f31 = this.f15046e;
                path7.moveTo((this.f15043b * 10.0f) + f31, f31 - this.f15045d);
                Path path8 = this.f15051j;
                float f32 = this.f15046e;
                path8.lineTo((this.f15043b * 18.0f) + f32, f32 + this.f15045d);
                Path path9 = this.f15051j;
                float f33 = this.f15046e;
                path9.moveTo((this.f15043b * 18.0f) + f33, f33 - this.f15045d);
                Path path10 = this.f15051j;
                float f34 = this.f15046e;
                path10.lineTo((this.f15043b * 10.0f) + f34, f34 + this.f15045d);
                canvas2.drawPath(this.f15051j, this.f15050i);
                return;
            case 12:
                float f35 = this.f15043b;
                this.f15046e = (50.0f * f35) / 2.0f;
                this.f15044c = f35 * 3.0f;
                this.f15045d = f35 * 3.0f;
                this.f15050i.setStyle(Paint.Style.STROKE);
                this.f15050i.setStrokeWidth(4.0f);
                this.f15050i.setColor(-1);
                Path path11 = this.f15051j;
                float f36 = this.f15046e;
                path11.moveTo(f36 - this.f15044c, (f36 - this.f15045d) - (this.f15043b * 5.0f));
                Path path12 = this.f15051j;
                float f37 = this.f15046e;
                path12.lineTo(f37 - this.f15044c, f37 - this.f15045d);
                Path path13 = this.f15051j;
                float f38 = this.f15046e;
                path13.lineTo((f38 - this.f15044c) - (this.f15043b * 5.0f), f38 - this.f15045d);
                Path path14 = this.f15051j;
                float f39 = this.f15046e;
                path14.moveTo(this.f15044c + f39, (f39 - this.f15045d) - (this.f15043b * 5.0f));
                Path path15 = this.f15051j;
                float f40 = this.f15046e;
                path15.lineTo(this.f15044c + f40, f40 - this.f15045d);
                Path path16 = this.f15051j;
                float f41 = this.f15046e;
                path16.lineTo(this.f15044c + f41 + (this.f15043b * 5.0f), f41 - this.f15045d);
                Path path17 = this.f15051j;
                float f42 = this.f15046e;
                path17.moveTo(f42 - this.f15044c, f42 + this.f15045d + (this.f15043b * 5.0f));
                Path path18 = this.f15051j;
                float f43 = this.f15046e;
                path18.lineTo(f43 - this.f15044c, f43 + this.f15045d);
                Path path19 = this.f15051j;
                float f44 = this.f15046e;
                path19.lineTo((f44 - this.f15044c) - (this.f15043b * 5.0f), f44 + this.f15045d);
                Path path20 = this.f15051j;
                float f45 = this.f15046e;
                path20.moveTo(this.f15044c + f45, f45 + this.f15045d + (this.f15043b * 5.0f));
                Path path21 = this.f15051j;
                float f46 = this.f15046e;
                path21.lineTo(this.f15044c + f46, f46 + this.f15045d);
                Path path22 = this.f15051j;
                float f47 = this.f15046e;
                path22.lineTo(this.f15044c + f47 + (this.f15043b * 5.0f), f47 + this.f15045d);
                canvas2.drawPath(this.f15051j, this.f15050i);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m17735a(Canvas canvas) {
        float f = this.f15043b;
        this.f15046e = ((30.0f * f) / 2.0f) - (f * 5.0f);
        this.f15044c = f * 5.0f;
        this.f15045d = f * 5.0f;
        this.f15050i.setStyle(Paint.Style.FILL);
        this.f15050i.setColor(-1);
        this.f15050i.setStrokeWidth(4.0f);
        this.f15050i.setAntiAlias(true);
        Path path = this.f15051j;
        float f2 = this.f15046e;
        path.moveTo(f2 - this.f15044c, f2 - this.f15045d);
        Path path2 = this.f15051j;
        float f3 = this.f15046e;
        path2.lineTo(f3, f3 - this.f15045d);
        Path path3 = this.f15051j;
        float f4 = this.f15046e;
        float f5 = this.f15043b;
        path3.lineTo((f5 * 6.0f) + f4, (f4 - this.f15045d) - (f5 * 4.0f));
        Path path4 = this.f15051j;
        float f6 = this.f15046e;
        float f7 = this.f15043b;
        path4.lineTo((6.0f * f7) + f6, f6 + this.f15045d + (f7 * 4.0f));
        Path path5 = this.f15051j;
        float f8 = this.f15046e;
        path5.lineTo(f8, this.f15045d + f8);
        Path path6 = this.f15051j;
        float f9 = this.f15046e;
        path6.lineTo(f9 - this.f15044c, f9 + this.f15045d);
        Path path7 = this.f15051j;
        float f10 = this.f15046e;
        path7.lineTo(f10 - this.f15044c, f10 - this.f15045d);
        canvas.drawPath(this.f15051j, this.f15050i);
    }

    /* renamed from: b */
    private void m17736b(Canvas canvas) {
        float f = this.f15043b;
        this.f15047f = 25.0f * f;
        this.f15046e = f * 30.0f;
        this.f15050i.setAntiAlias(true);
        this.f15050i.setColor(-1);
        this.f15050i.setStrokeWidth(7.0f);
        this.f15050i.setStyle(Paint.Style.STROKE);
        float f2 = this.f15046e;
        canvas.drawCircle(f2, f2, this.f15047f, this.f15050i);
    }
}
