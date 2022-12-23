package com.inmobi.media;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.ce */
/* compiled from: NativeTimerView */
public class C5919ce extends View {

    /* renamed from: a */
    public long f14984a;

    /* renamed from: b */
    public long f14985b;

    /* renamed from: c */
    public ValueAnimator f14986c;

    /* renamed from: d */
    private Bitmap f14987d;

    /* renamed from: e */
    private Canvas f14988e;

    /* renamed from: f */
    private RectF f14989f;

    /* renamed from: g */
    private RectF f14990g;

    /* renamed from: h */
    private Rect f14991h;

    /* renamed from: i */
    private Paint f14992i;

    /* renamed from: j */
    private Paint f14993j;

    /* renamed from: k */
    private Paint f14994k;

    /* renamed from: l */
    private Paint f14995l;

    /* renamed from: m */
    private Paint f14996m;

    /* renamed from: n */
    private float f14997n;

    /* renamed from: o */
    private C5921b f14998o;

    /* renamed from: com.inmobi.media.ce$b */
    /* compiled from: NativeTimerView */
    public interface C5921b {
        /* renamed from: a */
        void mo34916a();
    }

    public C5919ce(Context context) {
        this(context, (byte) 0);
    }

    private C5919ce(Context context, byte b) {
        this(context, 0);
    }

    private C5919ce(Context context, char c) {
        super(context, (AttributeSet) null, 0);
        this.f14984a = 0;
        Paint paint = new Paint();
        this.f14992i = paint;
        paint.setAntiAlias(true);
        this.f14992i.setColor(-723724);
        Paint paint2 = new Paint();
        this.f14996m = paint2;
        paint2.setAntiAlias(true);
        this.f14996m.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f14996m.setTextAlign(Paint.Align.CENTER);
        this.f14996m.setAntiAlias(true);
        this.f14991h = new Rect();
        Paint paint3 = new Paint();
        this.f14993j = paint3;
        paint3.setAntiAlias(true);
        this.f14993j.setColor(ViewCompat.MEASURED_STATE_MASK);
        Paint paint4 = new Paint();
        this.f14994k = paint4;
        paint4.setAntiAlias(true);
        this.f14994k.setColor(0);
        this.f14994k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint5 = new Paint();
        this.f14995l = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        this.f14995l.setAntiAlias(true);
        this.f14995l.setColor(ViewCompat.MEASURED_STATE_MASK);
    }

    public void setTimerEventsListener(C5921b bVar) {
        this.f14998o = bVar;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!(i == i3 && i2 == i4)) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.f14987d = createBitmap;
            createBitmap.eraseColor(0);
            this.f14988e = new Canvas(this.f14987d);
        }
        super.onSizeChanged(i, i2, i3, i4);
        float a = (float) C6252ic.m18654a((int) (((float) getWidth()) * 4.0f * 0.007f));
        float a2 = (float) C6252ic.m18654a((int) (((float) getWidth()) * 5.0f * 0.007f));
        this.f14989f = new RectF(a2, a2, ((float) getWidth()) - a2, ((float) getHeight()) - a2);
        this.f14990g = new RectF(this.f14989f.left + a, this.f14989f.top + a, this.f14989f.right - a, this.f14989f.bottom - a);
        this.f14995l.setStrokeWidth((float) C6252ic.m18654a((int) (((float) getWidth()) * 1.5f * 0.007f)));
        this.f14996m.setTextSize((float) C6252ic.m18654a((int) (((float) getWidth()) * 14.0f * 0.007f)));
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f14988e.drawColor(0, PorterDuff.Mode.CLEAR);
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int min = Math.min(width, height);
        int a = C6252ic.m18654a((int) (((float) getWidth()) * 7.0f * 0.007f));
        float f = (float) width;
        float f2 = (float) height;
        canvas.drawCircle(f, f2, (float) min, this.f14992i);
        canvas.drawCircle(f, f2, (float) (min - a), this.f14995l);
        ValueAnimator valueAnimator = this.f14986c;
        if (valueAnimator != null) {
            int currentPlayTime = (int) (this.f14984a - (valueAnimator.getCurrentPlayTime() / 1000));
            if (((double) ((Float) this.f14986c.getAnimatedValue()).floatValue()) >= 1.0d) {
                currentPlayTime = 0;
            }
            Paint paint = this.f14996m;
            Rect rect = this.f14991h;
            String valueOf = String.valueOf(currentPlayTime);
            paint.getTextBounds(valueOf, 0, valueOf.length(), rect);
            canvas.drawText(valueOf, (float) (getWidth() / 2), ((float) (getHeight() / 2)) + (((paint.descent() - paint.ascent()) / 2.0f) - paint.descent()), paint);
            if (((double) ((Float) this.f14986c.getAnimatedValue()).floatValue()) >= 1.0d) {
                m17720c();
            }
        }
        float f3 = this.f14997n;
        if (f3 > 0.0f) {
            this.f14988e.drawArc(this.f14989f, 270.0f, f3, true, this.f14993j);
            this.f14988e.drawOval(this.f14990g, this.f14994k);
        }
        canvas.drawBitmap(this.f14987d, 0.0f, 0.0f, (Paint) null);
    }

    public void setTimerValue(long j) {
        this.f14984a = j;
    }

    /* renamed from: com.inmobi.media.ce$a */
    /* compiled from: NativeTimerView */
    public static class C5920a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public WeakReference<C5919ce> f14999a;

        public C5920a(C5919ce ceVar) {
            this.f14999a = new WeakReference<>(ceVar);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C5919ce ceVar = (C5919ce) this.f14999a.get();
            if (ceVar != null) {
                int visibility = ceVar.getVisibility();
                if (visibility != 4 && visibility != 8) {
                    ceVar.mo34908a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                } else if (((double) ((Float) valueAnimator.getAnimatedValue()).floatValue()) >= 1.0d) {
                    ceVar.m17720c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo34907a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f14986c = ofFloat;
        ofFloat.setDuration(TimeUnit.SECONDS.toMillis(this.f14984a));
        this.f14986c.setInterpolator(new LinearInterpolator());
        this.f14986c.addUpdateListener(new C5920a(this));
        this.f14986c.start();
    }

    /* renamed from: b */
    public final void mo34909b() {
        ValueAnimator valueAnimator = this.f14986c;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f14985b = this.f14986c.getCurrentPlayTime();
            this.f14986c.cancel();
        }
    }

    /* renamed from: a */
    public final void mo34908a(float f) {
        this.f14997n = f * 360.0f;
        invalidate();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m17720c() {
        C5921b bVar = this.f14998o;
        if (bVar != null) {
            bVar.mo34916a();
            this.f14986c.cancel();
            this.f14986c = null;
        }
    }
}
