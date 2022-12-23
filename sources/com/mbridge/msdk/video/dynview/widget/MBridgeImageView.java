package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.C8608u;

public class MBridgeImageView extends ImageView {

    /* renamed from: a */
    private Xfermode f22652a;

    /* renamed from: b */
    private int f22653b;

    /* renamed from: c */
    private int f22654c;

    /* renamed from: d */
    private int f22655d;

    /* renamed from: e */
    private int f22656e;

    /* renamed from: f */
    private int f22657f;

    /* renamed from: g */
    private int f22658g;

    /* renamed from: h */
    private int f22659h;

    /* renamed from: i */
    private int f22660i;

    /* renamed from: j */
    private int f22661j;

    /* renamed from: k */
    private float[] f22662k;

    /* renamed from: l */
    private float[] f22663l;

    /* renamed from: m */
    private RectF f22664m;

    /* renamed from: n */
    private RectF f22665n;

    /* renamed from: o */
    private boolean f22666o;

    /* renamed from: p */
    private boolean f22667p;

    /* renamed from: q */
    private Path f22668q;

    /* renamed from: r */
    private Paint f22669r;

    public MBridgeImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22668q = new Path();
        this.f22669r = new Paint();
        this.f22662k = new float[8];
        this.f22663l = new float[8];
        this.f22665n = new RectF();
        this.f22664m = new RectF();
        this.f22652a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        super.onSizeChanged(i, i2, i3, i4);
        this.f22653b = i;
        this.f22654c = i2;
        int i8 = 0;
        if (this.f22667p) {
            try {
                if (!(this.f22662k == null || this.f22663l == null)) {
                    while (true) {
                        i5 = 2;
                        if (i8 >= 2) {
                            break;
                        }
                        this.f22662k[i8] = (float) this.f22656e;
                        this.f22663l[i8] = ((float) this.f22656e) - (((float) this.f22660i) / 2.0f);
                        i8++;
                    }
                    while (true) {
                        i6 = 4;
                        if (i5 >= 4) {
                            break;
                        }
                        this.f22662k[i5] = (float) this.f22657f;
                        this.f22663l[i5] = ((float) this.f22657f) - (((float) this.f22660i) / 2.0f);
                        i5++;
                    }
                    while (true) {
                        if (i6 >= 6) {
                            break;
                        }
                        this.f22662k[i6] = (float) this.f22658g;
                        this.f22663l[i6] = ((float) this.f22658g) - (((float) this.f22660i) / 2.0f);
                        i6++;
                    }
                    for (i7 = 6; i7 < 8; i7++) {
                        this.f22662k[i7] = (float) this.f22659h;
                        this.f22663l[i7] = ((float) this.f22659h) - (((float) this.f22660i) / 2.0f);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (!(this.f22662k == null || this.f22663l == null)) {
            while (i8 < this.f22662k.length) {
                try {
                    this.f22662k[i8] = (float) this.f22655d;
                    this.f22663l[i8] = ((float) this.f22655d) - (((float) this.f22660i) / 2.0f);
                    i8++;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        RectF rectF = this.f22665n;
        if (rectF != null) {
            int i9 = this.f22660i;
            rectF.set(((float) i9) / 2.0f, ((float) i9) / 2.0f, ((float) this.f22653b) - (((float) i9) / 2.0f), ((float) this.f22654c) - (((float) i9) / 2.0f));
        }
        RectF rectF2 = this.f22664m;
        if (rectF2 != null) {
            rectF2.set(0.0f, 0.0f, (float) this.f22653b, (float) this.f22654c);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (canvas != null) {
            try {
                canvas.saveLayer(this.f22664m, (Paint) null, 31);
                canvas.scale((((float) (this.f22653b - (this.f22660i * 2))) * 1.0f) / ((float) this.f22653b), (((float) (this.f22654c - (this.f22660i * 2))) * 1.0f) / ((float) this.f22654c), ((float) this.f22653b) / 2.0f, ((float) this.f22654c) / 2.0f);
                super.onDraw(canvas);
                if (this.f22669r != null) {
                    this.f22669r.reset();
                    this.f22669r.setAntiAlias(true);
                    this.f22669r.setStyle(Paint.Style.FILL);
                    this.f22669r.setXfermode(this.f22652a);
                }
                if (this.f22668q != null) {
                    this.f22668q.reset();
                    this.f22668q.addRoundRect(this.f22664m, this.f22663l, Path.Direction.CCW);
                }
                canvas.drawPath(this.f22668q, this.f22669r);
                if (this.f22669r != null) {
                    this.f22669r.setXfermode((Xfermode) null);
                }
                canvas.restore();
                if (this.f22666o) {
                    int i = this.f22660i;
                    int i2 = this.f22661j;
                    RectF rectF = this.f22665n;
                    float[] fArr = this.f22662k;
                    try {
                        if (this.f22668q != null) {
                            this.f22668q.reset();
                        }
                        if (this.f22669r != null) {
                            this.f22669r.setStrokeWidth((float) i);
                            this.f22669r.setColor(i2);
                            this.f22669r.setStyle(Paint.Style.STROKE);
                        }
                        if (this.f22668q != null) {
                            this.f22668q.addRoundRect(rectF, fArr, Path.Direction.CCW);
                        }
                        if (canvas != null) {
                            canvas.drawPath(this.f22668q, this.f22669r);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e2) {
                C8608u.m24880a("MBridgeImageView", e2.getMessage());
            }
        }
    }

    public void setCornerRadius(int i) {
        this.f22655d = i;
    }

    public void setBorder(int i, int i2, int i3) {
        this.f22666o = true;
        this.f22660i = i2;
        this.f22661j = i3;
        this.f22655d = i;
    }

    public void setCustomBorder(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f22666o = true;
        this.f22667p = true;
        this.f22660i = i5;
        this.f22661j = i6;
        this.f22656e = i;
        this.f22658g = i3;
        this.f22657f = i2;
        this.f22659h = i4;
    }
}
