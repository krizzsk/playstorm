package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class DislikeView extends View {

    /* renamed from: a */
    private int f6126a;

    /* renamed from: b */
    private int f6127b;

    /* renamed from: c */
    private RectF f6128c;

    /* renamed from: d */
    private Paint f6129d;

    /* renamed from: e */
    private Paint f6130e;

    /* renamed from: f */
    private int f6131f;

    /* renamed from: g */
    private Paint f6132g;

    /* renamed from: h */
    private int f6133h;

    public DislikeView(Context context) {
        super(context);
        m7516a();
    }

    /* renamed from: a */
    private void m7516a() {
        Paint paint = new Paint();
        this.f6129d = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f6132g = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f6130e = paint3;
        paint3.setAntiAlias(true);
    }

    public void setRadius(int i) {
        this.f6131f = i;
    }

    public void setDislikeColor(int i) {
        this.f6132g.setColor(i);
    }

    public void setDislikeWidth(int i) {
        this.f6132g.setStrokeWidth((float) i);
    }

    public void setStrokeColor(int i) {
        this.f6129d.setStyle(Paint.Style.STROKE);
        this.f6129d.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.f6129d.setStrokeWidth((float) i);
        this.f6133h = i;
    }

    public void setBgColor(int i) {
        this.f6130e.setStyle(Paint.Style.FILL);
        this.f6130e.setColor(i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f6128c;
        int i = this.f6131f;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f6130e);
        RectF rectF2 = this.f6128c;
        int i2 = this.f6131f;
        canvas.drawRoundRect(rectF2, (float) i2, (float) i2, this.f6129d);
        int i3 = this.f6126a;
        int i4 = this.f6127b;
        Canvas canvas2 = canvas;
        canvas2.drawLine(((float) i3) * 0.3f, ((float) i4) * 0.3f, ((float) i3) * 0.7f, ((float) i4) * 0.7f, this.f6132g);
        int i5 = this.f6126a;
        int i6 = this.f6127b;
        Canvas canvas3 = canvas;
        canvas3.drawLine(((float) i5) * 0.7f, ((float) i6) * 0.3f, ((float) i5) * 0.3f, ((float) i6) * 0.7f, this.f6132g);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f6126a = i;
        this.f6127b = i2;
        int i5 = this.f6133h;
        this.f6128c = new RectF((float) i5, (float) i5, (float) (this.f6126a - i5), (float) (this.f6127b - i5));
    }
}
