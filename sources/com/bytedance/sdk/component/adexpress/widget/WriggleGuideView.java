package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.sdk.component.utils.C2984t;
import java.util.ArrayList;
import java.util.List;

public class WriggleGuideView extends View {

    /* renamed from: a */
    private int f6245a;

    /* renamed from: b */
    private int f6246b;

    /* renamed from: c */
    private Bitmap f6247c;

    /* renamed from: d */
    private Bitmap f6248d;

    /* renamed from: e */
    private Paint f6249e;

    /* renamed from: f */
    private int f6250f;

    /* renamed from: g */
    private final List<C2779b> f6251g;

    /* renamed from: h */
    private boolean f6252h;

    /* renamed from: i */
    private boolean f6253i;

    /* renamed from: j */
    private C2778a f6254j;

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.WriggleGuideView$a */
    public interface C2778a {
        /* renamed from: a */
        void mo17314a();
    }

    public WriggleGuideView(Context context) {
        this(context, (AttributeSet) null);
    }

    public WriggleGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WriggleGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6245a = 0;
        this.f6246b = 0;
        this.f6250f = 0;
        this.f6251g = new ArrayList();
        this.f6252h = true;
        this.f6253i = false;
        setLayerType(1, (Paint) null);
        this.f6249e = new Paint();
        this.f6249e = new Paint(1);
        this.f6251g.clear();
    }

    /* renamed from: a */
    private Bitmap m7582a(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(BitmapFactory.decodeResource(getContext().getResources(), C2984t.m8431d(getContext(), "tt_wriggle_union")), (Rect) null, new RectF(0.0f, 0.0f, (float) i, (float) i2), this.f6249e);
        return createBitmap;
    }

    /* renamed from: b */
    private Bitmap m7583b(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(BitmapFactory.decodeResource(getContext().getResources(), C2984t.m8431d(getContext(), "tt_wriggle_union_white")), (Rect) null, new RectF(0.0f, 0.0f, (float) i, (float) i2), new Paint(1));
        return createBitmap;
    }

    /* renamed from: c */
    private Bitmap m7584c(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        float f = ((float) this.f6250f) / ((float) this.f6245a);
        if (f >= 0.5f) {
            f = Math.abs(f - 1.0f);
        }
        int i3 = this.f6246b;
        this.f6251g.add(new C2779b((float) (i - this.f6250f), ((float) i2) - ((f * 2.0f) * ((float) i3)), ((float) Math.min(this.f6245a, i3)) / 2.0f));
        for (C2779b next : this.f6251g) {
            canvas.drawCircle(next.f6255a, next.f6256b, next.f6257c, paint);
        }
        return createBitmap;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f6252h) {
            this.f6245a = getWidth();
            int height = getHeight();
            this.f6246b = height;
            this.f6247c = m7582a(this.f6245a, height);
            this.f6248d = m7583b(this.f6245a, this.f6246b);
            this.f6252h = false;
        }
        canvas.drawBitmap(this.f6247c, 0.0f, 0.0f, this.f6249e);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (Paint) null, 31);
        canvas.drawBitmap(this.f6248d, 0.0f, 0.0f, this.f6249e);
        this.f6249e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(m7584c(this.f6245a, this.f6246b), 0.0f, 0.0f, this.f6249e);
        this.f6249e.setXfermode((Xfermode) null);
        canvas.restoreToCount(saveLayer);
        if (this.f6253i) {
            this.f6250f += 2;
            invalidate();
            if (this.f6250f >= this.f6245a) {
                C2778a aVar = this.f6254j;
                if (aVar != null) {
                    aVar.mo17314a();
                }
                this.f6253i = false;
            }
        }
    }

    /* renamed from: a */
    public void mo17461a(C2778a aVar) {
        this.f6254j = aVar;
        this.f6250f = 0;
        this.f6253i = true;
        invalidate();
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.WriggleGuideView$b */
    private static class C2779b {

        /* renamed from: a */
        public float f6255a;

        /* renamed from: b */
        public float f6256b;

        /* renamed from: c */
        public float f6257c;

        C2779b(float f, float f2, float f3) {
            this.f6255a = f;
            this.f6256b = f2;
            this.f6257c = f3;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f6254j != null) {
            this.f6254j = null;
        }
    }
}
