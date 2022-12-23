package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.utils.C4020v;

public class TTCornersWebView extends WebView {

    /* renamed from: a */
    private int f9657a;

    /* renamed from: b */
    private int f9658b;

    /* renamed from: c */
    private int f9659c;

    /* renamed from: d */
    private int f9660d;

    /* renamed from: e */
    private Paint f9661e;

    /* renamed from: f */
    private Paint f9662f;

    /* renamed from: g */
    private float[] f9663g = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    public TTCornersWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12276a(context, attributeSet);
    }

    public TTCornersWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m12276a(context, attributeSet);
    }

    /* renamed from: a */
    private void m12276a(Context context, AttributeSet attributeSet) {
        Paint paint = new Paint();
        this.f9661e = paint;
        paint.setColor(-1);
        this.f9661e.setAntiAlias(true);
        this.f9661e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Paint paint2 = new Paint();
        this.f9662f = paint2;
        paint2.setXfermode((Xfermode) null);
        this.f9662f.setAntiAlias(true);
        float b = C4020v.m13297b(context, 14.0f);
        mo20497a(b, b, 0.0f, 0.0f);
    }

    /* renamed from: a */
    public void mo20497a(float f, float f2, float f3, float f4) {
        float[] fArr = this.f9663g;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f2;
        fArr[3] = f2;
        fArr[4] = f3;
        fArr[5] = f3;
        fArr[6] = f4;
        fArr[7] = f4;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f9657a = getMeasuredWidth();
        this.f9658b = getMeasuredHeight();
    }

    public void onDraw(Canvas canvas) {
        this.f9659c = getScrollX();
        this.f9660d = getScrollY();
        Path path = new Path();
        int i = this.f9660d;
        path.addRoundRect(new RectF(0.0f, (float) i, (float) (this.f9659c + this.f9657a), (float) (i + this.f9658b)), this.f9663g, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }
}
