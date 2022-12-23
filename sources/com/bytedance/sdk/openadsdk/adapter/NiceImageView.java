package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.utils.C4020v;

public class NiceImageView extends ImageView {

    /* renamed from: a */
    private Context f7311a;

    /* renamed from: b */
    private boolean f7312b;

    /* renamed from: c */
    private boolean f7313c;

    /* renamed from: d */
    private int f7314d;

    /* renamed from: e */
    private int f7315e;

    /* renamed from: f */
    private int f7316f;

    /* renamed from: g */
    private int f7317g;

    /* renamed from: h */
    private int f7318h;

    /* renamed from: i */
    private int f7319i;

    /* renamed from: j */
    private int f7320j;

    /* renamed from: k */
    private int f7321k;

    /* renamed from: l */
    private int f7322l;

    /* renamed from: m */
    private int f7323m;

    /* renamed from: n */
    private Xfermode f7324n;

    /* renamed from: o */
    private int f7325o;

    /* renamed from: p */
    private int f7326p;

    /* renamed from: q */
    private float f7327q;

    /* renamed from: r */
    private float[] f7328r;

    /* renamed from: s */
    private float[] f7329s;

    /* renamed from: t */
    private RectF f7330t;

    /* renamed from: u */
    private RectF f7331u;

    /* renamed from: v */
    private Paint f7332v;

    /* renamed from: w */
    private Path f7333w;

    /* renamed from: x */
    private Path f7334x;

    public NiceImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NiceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7315e = -1;
        this.f7317g = -1;
        this.f7311a = context;
        this.f7318h = C4020v.m13315e(context, 10.0f);
        this.f7328r = new float[8];
        this.f7329s = new float[8];
        this.f7331u = new RectF();
        this.f7330t = new RectF();
        this.f7332v = new Paint();
        this.f7333w = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.f7324n = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.f7324n = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.f7334x = new Path();
        }
        m8993c();
        m8994d();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f7325o = i;
        this.f7326p = i2;
        m8986a();
        m8992b();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.f7330t, (Paint) null, 31);
        if (!this.f7313c) {
            int i = this.f7325o;
            int i2 = this.f7314d;
            int i3 = this.f7316f;
            int i4 = this.f7326p;
            canvas.scale((((float) ((i - (i2 * 2)) - (i3 * 2))) * 1.0f) / ((float) i), (((float) ((i4 - (i2 * 2)) - (i3 * 2))) * 1.0f) / ((float) i4), ((float) i) / 2.0f, ((float) i4) / 2.0f);
        }
        super.onDraw(canvas);
        this.f7332v.reset();
        this.f7333w.reset();
        if (this.f7312b) {
            this.f7333w.addCircle(((float) this.f7325o) / 2.0f, ((float) this.f7326p) / 2.0f, this.f7327q, Path.Direction.CCW);
        } else {
            this.f7333w.addRoundRect(this.f7330t, this.f7329s, Path.Direction.CCW);
        }
        this.f7332v.setAntiAlias(true);
        this.f7332v.setStyle(Paint.Style.FILL);
        this.f7332v.setXfermode(this.f7324n);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.f7333w, this.f7332v);
        } else {
            this.f7334x.addRect(this.f7330t, Path.Direction.CCW);
            this.f7334x.op(this.f7333w, Path.Op.DIFFERENCE);
            canvas.drawPath(this.f7334x, this.f7332v);
        }
        this.f7332v.setXfermode((Xfermode) null);
        int i5 = this.f7323m;
        if (i5 != 0) {
            this.f7332v.setColor(i5);
            canvas.drawPath(this.f7333w, this.f7332v);
        }
        canvas.restore();
        m8988a(canvas);
    }

    /* renamed from: a */
    private void m8988a(Canvas canvas) {
        if (this.f7312b) {
            int i = this.f7314d;
            if (i > 0) {
                m8989a(canvas, i, this.f7315e, this.f7327q - (((float) i) / 2.0f));
            }
            int i2 = this.f7316f;
            if (i2 > 0) {
                m8989a(canvas, i2, this.f7317g, (this.f7327q - ((float) this.f7314d)) - (((float) i2) / 2.0f));
                return;
            }
            return;
        }
        int i3 = this.f7314d;
        if (i3 > 0) {
            m8990a(canvas, i3, this.f7315e, this.f7331u, this.f7328r);
        }
    }

    /* renamed from: a */
    private void m8989a(Canvas canvas, int i, int i2, float f) {
        m8987a(i, i2);
        this.f7333w.addCircle(((float) this.f7325o) / 2.0f, ((float) this.f7326p) / 2.0f, f, Path.Direction.CCW);
        canvas.drawPath(this.f7333w, this.f7332v);
    }

    /* renamed from: a */
    private void m8990a(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        m8987a(i, i2);
        this.f7333w.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.f7333w, this.f7332v);
    }

    /* renamed from: a */
    private void m8987a(int i, int i2) {
        this.f7333w.reset();
        this.f7332v.setStrokeWidth((float) i);
        this.f7332v.setColor(i2);
        this.f7332v.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    private void m8986a() {
        if (!this.f7312b) {
            RectF rectF = this.f7331u;
            int i = this.f7314d;
            rectF.set(((float) i) / 2.0f, ((float) i) / 2.0f, ((float) this.f7325o) - (((float) i) / 2.0f), ((float) this.f7326p) - (((float) i) / 2.0f));
        }
    }

    /* renamed from: b */
    private void m8992b() {
        if (this.f7312b) {
            float min = ((float) Math.min(this.f7325o, this.f7326p)) / 2.0f;
            this.f7327q = min;
            RectF rectF = this.f7330t;
            int i = this.f7325o;
            int i2 = this.f7326p;
            rectF.set((((float) i) / 2.0f) - min, (((float) i2) / 2.0f) - min, (((float) i) / 2.0f) + min, (((float) i2) / 2.0f) + min);
            return;
        }
        this.f7330t.set(0.0f, 0.0f, (float) this.f7325o, (float) this.f7326p);
        if (this.f7313c) {
            this.f7330t = this.f7331u;
        }
    }

    /* renamed from: c */
    private void m8993c() {
        if (!this.f7312b) {
            int i = 0;
            if (this.f7318h > 0) {
                while (true) {
                    float[] fArr = this.f7328r;
                    if (i < fArr.length) {
                        int i2 = this.f7318h;
                        fArr[i] = (float) i2;
                        this.f7329s[i] = ((float) i2) - (((float) this.f7314d) / 2.0f);
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                float[] fArr2 = this.f7328r;
                int i3 = this.f7319i;
                float f = (float) i3;
                fArr2[1] = f;
                fArr2[0] = f;
                int i4 = this.f7320j;
                float f2 = (float) i4;
                fArr2[3] = f2;
                fArr2[2] = f2;
                int i5 = this.f7322l;
                float f3 = (float) i5;
                fArr2[5] = f3;
                fArr2[4] = f3;
                int i6 = this.f7321k;
                float f4 = (float) i6;
                fArr2[7] = f4;
                fArr2[6] = f4;
                float[] fArr3 = this.f7329s;
                int i7 = this.f7314d;
                float f5 = ((float) i3) - (((float) i7) / 2.0f);
                fArr3[1] = f5;
                fArr3[0] = f5;
                float f6 = ((float) i4) - (((float) i7) / 2.0f);
                fArr3[3] = f6;
                fArr3[2] = f6;
                float f7 = ((float) i5) - (((float) i7) / 2.0f);
                fArr3[5] = f7;
                fArr3[4] = f7;
                float f8 = ((float) i6) - (((float) i7) / 2.0f);
                fArr3[7] = f8;
                fArr3[6] = f8;
            }
        }
    }

    /* renamed from: a */
    private void m8991a(boolean z) {
        if (z) {
            this.f7318h = 0;
        }
        m8993c();
        m8986a();
        invalidate();
    }

    /* renamed from: d */
    private void m8994d() {
        if (!this.f7312b) {
            this.f7316f = 0;
        }
    }

    public void isCoverSrc(boolean z) {
        this.f7313c = z;
        m8992b();
        invalidate();
    }

    public void isCircle(boolean z) {
        this.f7312b = z;
        m8994d();
        m8992b();
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.f7314d = C4020v.m13315e(this.f7311a, (float) i);
        m8991a(false);
    }

    public void setBorderColor(int i) {
        this.f7315e = i;
        invalidate();
    }

    public void setInnerBorderWidth(int i) {
        this.f7316f = C4020v.m13315e(this.f7311a, (float) i);
        m8994d();
        invalidate();
    }

    public void setInnerBorderColor(int i) {
        this.f7317g = i;
        invalidate();
    }

    public void setCornerRadius(int i) {
        this.f7318h = C4020v.m13315e(this.f7311a, (float) i);
        m8991a(false);
    }

    public void setCornerTopLeftRadius(int i) {
        this.f7319i = C4020v.m13315e(this.f7311a, (float) i);
        m8991a(true);
    }

    public void setCornerTopRightRadius(int i) {
        this.f7320j = C4020v.m13315e(this.f7311a, (float) i);
        m8991a(true);
    }

    public void setCornerBottomLeftRadius(int i) {
        this.f7321k = C4020v.m13315e(this.f7311a, (float) i);
        m8991a(true);
    }

    public void setCornerBottomRightRadius(int i) {
        this.f7322l = C4020v.m13315e(this.f7311a, (float) i);
        m8991a(true);
    }

    public void setMaskColor(int i) {
        this.f7323m = i;
        invalidate();
    }
}
