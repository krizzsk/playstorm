package com.mbridge.msdk.videocommon.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.widget.MBImageView;

public class RoundImageView extends MBImageView {

    /* renamed from: a */
    private int f23567a;

    /* renamed from: b */
    private int f23568b;

    /* renamed from: c */
    private Paint f23569c;

    /* renamed from: d */
    private int f23570d;

    /* renamed from: e */
    private Matrix f23571e = new Matrix();

    /* renamed from: f */
    private BitmapShader f23572f;

    /* renamed from: g */
    private int f23573g;

    /* renamed from: h */
    private RectF f23574h;

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f23569c = paint;
        paint.setAntiAlias(true);
        this.f23568b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f23567a = 1;
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f23569c = paint;
        paint.setAntiAlias(true);
        this.f23568b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f23567a = 1;
    }

    public RoundImageView(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f23569c = paint;
        paint.setAntiAlias(true);
        this.f23568b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f23567a = 1;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f23567a == 0) {
            int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f23573g = min;
            this.f23570d = min / 2;
            setMeasuredDimension(min, min);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        try {
            if (getDrawable() != null) {
                Drawable drawable = getDrawable();
                if (drawable != null) {
                    Bitmap a = m27535a(drawable);
                    this.f23572f = new BitmapShader(a, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                    float f = 1.0f;
                    if (this.f23567a == 0) {
                        f = (((float) this.f23573g) * 1.0f) / ((float) Math.min(a.getWidth(), a.getHeight()));
                    } else if (this.f23567a == 1) {
                        f = Math.max((((float) getWidth()) * 1.0f) / ((float) a.getWidth()), (((float) getHeight()) * 1.0f) / ((float) a.getHeight()));
                    }
                    this.f23571e.setScale(f, f);
                    this.f23572f.setLocalMatrix(this.f23571e);
                    this.f23569c.setShader(this.f23572f);
                }
                if (this.f23567a == 1) {
                    canvas.drawRoundRect(this.f23574h, (float) this.f23568b, (float) this.f23568b, this.f23569c);
                } else {
                    canvas.drawCircle((float) this.f23570d, (float) this.f23570d, (float) this.f23570d, this.f23569c);
                }
            }
        } catch (Throwable th) {
            C8608u.m24884d("RoundImageView", th.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f23567a == 1) {
            this.f23574h = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance", super.onSaveInstanceState());
        bundle.putInt("state_type", this.f23567a);
        bundle.putInt("state_border_radius", this.f23568b);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("state_instance"));
            this.f23567a = bundle.getInt("state_type");
            this.f23568b = bundle.getInt("state_border_radius");
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void setBorderRadius(int i) {
        int b = C8613y.m24929b(getContext(), (float) i);
        if (this.f23568b != b) {
            this.f23568b = b;
            invalidate();
        }
    }

    public void setType(int i) {
        if (this.f23567a != i) {
            this.f23567a = i;
            if (!(i == 1 || i == 0)) {
                this.f23567a = 0;
            }
            requestLayout();
        }
    }

    /* renamed from: a */
    private Bitmap m27535a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            C8608u.m24884d("View", th.getMessage());
            return null;
        }
    }
}
