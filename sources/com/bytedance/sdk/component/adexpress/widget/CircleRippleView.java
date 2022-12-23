package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

public class CircleRippleView extends View {

    /* renamed from: a */
    private int f6112a;

    /* renamed from: b */
    private int f6113b;

    /* renamed from: c */
    private float f6114c;

    /* renamed from: d */
    private int f6115d;

    /* renamed from: e */
    private float f6116e;

    /* renamed from: f */
    private int f6117f;

    /* renamed from: g */
    private boolean f6118g;

    /* renamed from: h */
    private List<Integer> f6119h;

    /* renamed from: i */
    private List<Integer> f6120i;

    /* renamed from: j */
    private Paint f6121j;

    /* renamed from: k */
    private Paint f6122k;

    /* renamed from: l */
    private float f6123l;

    /* renamed from: m */
    private float f6124m;

    /* renamed from: n */
    private int f6125n;

    public CircleRippleView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CircleRippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CircleRippleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6112a = -1;
        this.f6113b = SupportMenu.CATEGORY_MASK;
        this.f6114c = 18.0f;
        this.f6115d = 3;
        this.f6116e = 50.0f;
        this.f6117f = 2;
        this.f6118g = false;
        this.f6119h = new ArrayList();
        this.f6120i = new ArrayList();
        this.f6125n = 24;
        m7513c();
    }

    /* renamed from: c */
    private void m7513c() {
        Paint paint = new Paint();
        this.f6121j = paint;
        paint.setAntiAlias(true);
        this.f6121j.setStrokeWidth((float) this.f6125n);
        this.f6119h.add(255);
        this.f6120i.add(0);
        Paint paint2 = new Paint();
        this.f6122k = paint2;
        paint2.setAntiAlias(true);
        this.f6122k.setColor(Color.parseColor("#0FFFFFFF"));
        this.f6122k.setStyle(Paint.Style.FILL);
    }

    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = ((float) i) / 2.0f;
        this.f6123l = f;
        this.f6124m = ((float) i2) / 2.0f;
        float f2 = f - (((float) this.f6125n) / 2.0f);
        this.f6116e = f2;
        this.f6114c = f2 / 4.0f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    public void onDraw(Canvas canvas) {
        this.f6121j.setShader(new LinearGradient(this.f6123l, 0.0f, this.f6124m, (float) getMeasuredHeight(), -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= this.f6119h.size()) {
                break;
            }
            Integer num = this.f6119h.get(i);
            this.f6121j.setAlpha(num.intValue());
            Integer num2 = this.f6120i.get(i);
            if (this.f6114c + ((float) num2.intValue()) < this.f6116e) {
                canvas.drawCircle(this.f6123l, this.f6124m, this.f6114c + ((float) num2.intValue()), this.f6121j);
            }
            if (num.intValue() > 0 && ((float) num2.intValue()) < this.f6116e) {
                List<Integer> list = this.f6119h;
                if (num.intValue() - this.f6117f > 0) {
                    i2 = num.intValue() - (this.f6117f * 3);
                }
                list.set(i, Integer.valueOf(i2));
                this.f6120i.set(i, Integer.valueOf(num2.intValue() + this.f6117f));
            }
            i++;
        }
        List<Integer> list2 = this.f6120i;
        if (((float) list2.get(list2.size() - 1).intValue()) >= this.f6116e / ((float) this.f6115d)) {
            this.f6119h.add(255);
            this.f6120i.add(0);
        }
        if (this.f6120i.size() >= 3) {
            this.f6120i.remove(0);
            this.f6119h.remove(0);
        }
        this.f6121j.setAlpha(255);
        this.f6121j.setColor(this.f6113b);
        canvas.drawCircle(this.f6123l, this.f6124m, this.f6114c, this.f6122k);
        if (this.f6118g) {
            invalidate();
        }
    }

    /* renamed from: a */
    public void mo17337a() {
        this.f6118g = true;
        invalidate();
    }

    /* renamed from: b */
    public void mo17338b() {
        this.f6118g = false;
        this.f6120i.clear();
        this.f6119h.clear();
        this.f6119h.add(255);
        this.f6120i.add(0);
        invalidate();
    }

    public void setColor(int i) {
        this.f6112a = i;
    }

    public void setCoreColor(int i) {
        this.f6113b = i;
    }

    public void setCoreRadius(int i) {
        this.f6114c = (float) i;
    }

    public void setDiffuseWidth(int i) {
        this.f6115d = i;
    }

    public void setMaxWidth(int i) {
        this.f6116e = (float) i;
    }

    public void setDiffuseSpeed(int i) {
        this.f6117f = i;
    }
}
