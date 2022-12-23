package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.C3578m;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.c */
/* compiled from: TTCustomShadowBackground */
public class C3756c extends Drawable {

    /* renamed from: a */
    private int f9758a;

    /* renamed from: b */
    private int f9759b;

    /* renamed from: c */
    private int[] f9760c;

    /* renamed from: d */
    private float[] f9761d;

    /* renamed from: e */
    private LinearGradient f9762e;

    /* renamed from: f */
    private int f9763f;

    /* renamed from: g */
    private int f9764g;

    /* renamed from: h */
    private int f9765h;

    /* renamed from: i */
    private int f9766i;

    /* renamed from: j */
    private RectF f9767j;

    /* renamed from: k */
    private Paint f9768k;

    public int getOpacity() {
        return -3;
    }

    public C3756c(int i, int[] iArr, float[] fArr, int i2, LinearGradient linearGradient, int i3, int i4, int i5, int i6) {
        this.f9758a = i;
        this.f9760c = iArr;
        this.f9761d = fArr;
        this.f9759b = i2;
        this.f9762e = linearGradient;
        this.f9763f = i3;
        this.f9764g = i4;
        this.f9765h = i5;
        this.f9766i = i6;
    }

    public void draw(Canvas canvas) {
        if (this.f9767j == null) {
            Rect bounds = getBounds();
            this.f9767j = new RectF((float) ((bounds.left + this.f9764g) - this.f9765h), (float) ((bounds.top + this.f9764g) - this.f9766i), (float) ((bounds.right - this.f9764g) - this.f9765h), (float) ((bounds.bottom - this.f9764g) - this.f9766i));
        }
        if (this.f9768k == null) {
            m12320a();
        }
        RectF rectF = this.f9767j;
        int i = this.f9763f;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f9768k);
    }

    public void setAlpha(int i) {
        Paint paint = this.f9768k;
        if (paint != null) {
            paint.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.f9768k;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    /* renamed from: a */
    private void m12320a() {
        int[] iArr;
        Paint paint = new Paint();
        this.f9768k = paint;
        boolean z = true;
        paint.setAntiAlias(true);
        this.f9768k.setShadowLayer((float) this.f9764g, (float) this.f9765h, (float) this.f9766i, this.f9759b);
        if (this.f9767j == null || (iArr = this.f9760c) == null || iArr.length <= 1) {
            this.f9768k.setColor(this.f9758a);
            return;
        }
        float[] fArr = this.f9761d;
        if (fArr == null || fArr.length <= 0 || fArr.length != iArr.length) {
            z = false;
        }
        Paint paint2 = this.f9768k;
        LinearGradient linearGradient = this.f9762e;
        if (linearGradient == null) {
            linearGradient = new LinearGradient(this.f9767j.left, 0.0f, this.f9767j.right, 0.0f, this.f9760c, z ? this.f9761d : null, Shader.TileMode.CLAMP);
        }
        paint2.setShader(linearGradient);
    }

    /* renamed from: a */
    public static void m12321a(View view, C3757a aVar) {
        if (view != null && aVar != null) {
            view.setLayerType(1, (Paint) null);
            ViewCompat.setBackground(view, aVar.mo20559a());
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.c$a */
    /* compiled from: TTCustomShadowBackground */
    public static class C3757a {

        /* renamed from: a */
        private int f9769a;

        /* renamed from: b */
        private int f9770b;

        /* renamed from: c */
        private int[] f9771c;

        /* renamed from: d */
        private float[] f9772d;

        /* renamed from: e */
        private LinearGradient f9773e;

        /* renamed from: f */
        private int f9774f;

        /* renamed from: g */
        private int f9775g;

        /* renamed from: h */
        private int f9776h;

        /* renamed from: i */
        private int f9777i;

        public C3757a() {
            this.f9776h = 0;
            this.f9777i = 0;
            this.f9769a = C2984t.m8438k(C3578m.m11231a(), "tt_ssxinmian8");
            this.f9770b = C2984t.m8438k(C3578m.m11231a(), "tt_ssxinxian3");
            this.f9774f = 10;
            this.f9775g = 16;
            this.f9776h = 0;
            this.f9777i = 0;
        }

        /* renamed from: a */
        public C3757a mo20557a(int i) {
            this.f9769a = i;
            return this;
        }

        /* renamed from: b */
        public C3757a mo20560b(int i) {
            this.f9770b = i;
            return this;
        }

        /* renamed from: a */
        public C3757a mo20558a(int[] iArr) {
            this.f9771c = iArr;
            return this;
        }

        /* renamed from: c */
        public C3757a mo20561c(int i) {
            this.f9774f = i;
            return this;
        }

        /* renamed from: d */
        public C3757a mo20562d(int i) {
            this.f9776h = i;
            return this;
        }

        /* renamed from: e */
        public C3757a mo20563e(int i) {
            this.f9777i = i;
            return this;
        }

        /* renamed from: a */
        public C3756c mo20559a() {
            return new C3756c(this.f9769a, this.f9771c, this.f9772d, this.f9770b, this.f9773e, this.f9774f, this.f9775g, this.f9776h, this.f9777i);
        }
    }
}
