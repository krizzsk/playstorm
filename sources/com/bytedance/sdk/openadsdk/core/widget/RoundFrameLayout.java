package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Arrays;

public class RoundFrameLayout extends FrameLayout {

    /* renamed from: a */
    private Path f9646a;

    /* renamed from: b */
    private Paint f9647b;

    /* renamed from: c */
    private RectF f9648c;

    /* renamed from: d */
    private float[] f9649d;

    public RoundFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9646a = new Path();
        this.f9648c = new RectF();
        Paint paint = new Paint();
        this.f9647b = paint;
        paint.setAntiAlias(true);
        this.f9647b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f9649d = new float[8];
    }

    /* renamed from: a */
    public void mo20483a(float f, float f2, float f3, float f4) {
        float[] fArr = this.f9649d;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f2;
        fArr[3] = f2;
        fArr[4] = f4;
        fArr[5] = f4;
        fArr[6] = f3;
        fArr[7] = f3;
        postInvalidate();
    }

    public void setRadius(float f) {
        Arrays.fill(this.f9649d, f);
        postInvalidate();
    }

    public void setTopLeftRadius(float f) {
        float[] fArr = this.f9649d;
        fArr[0] = f;
        fArr[1] = f;
        postInvalidate();
    }

    public void setTopRightRadius(float f) {
        float[] fArr = this.f9649d;
        fArr[2] = f;
        fArr[3] = f;
        postInvalidate();
    }

    public void setBottomRightRadius(float f) {
        float[] fArr = this.f9649d;
        fArr[5] = f;
        fArr[6] = f;
        postInvalidate();
    }

    public void setBottomLeftRadius(float f) {
        float[] fArr = this.f9649d;
        fArr[6] = f;
        fArr[7] = f;
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f9648c.set(0.0f, 0.0f, (float) i, (float) i2);
    }

    public void draw(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 28) {
            canvas.save();
            canvas.clipPath(m12271a());
            super.draw(canvas);
        } else {
            canvas.saveLayer(this.f9648c, (Paint) null, 31);
            super.draw(canvas);
            canvas.drawPath(m12271a(), this.f9647b);
        }
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 28) {
            canvas.save();
            canvas.clipPath(m12271a());
            super.dispatchDraw(canvas);
        } else {
            canvas.saveLayer(this.f9648c, (Paint) null, 31);
            super.dispatchDraw(canvas);
            canvas.drawPath(m12271a(), this.f9647b);
        }
        canvas.restore();
    }

    /* renamed from: a */
    private Path m12271a() {
        this.f9646a.reset();
        this.f9646a.addRoundRect(this.f9648c, this.f9649d, Path.Direction.CW);
        return this.f9646a;
    }
}
