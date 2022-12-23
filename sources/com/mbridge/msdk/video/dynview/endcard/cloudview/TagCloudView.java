package com.mbridge.msdk.video.dynview.endcard.cloudview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.mbridge.msdk.video.dynview.endcard.cloudview.C9275d;

public class TagCloudView extends ViewGroup implements C9275d.C9276a, Runnable {
    public static final int MODE_DECELERATE = 1;
    public static final int MODE_DISABLE = 0;
    public static final int MODE_UNIFORM = 2;

    /* renamed from: a */
    private float f22447a = 2.0f;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C9274c f22448b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public float f22449c = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public float f22450d = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public float f22451e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public float f22452f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public float f22453g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public float f22454h = 0.9f;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public float[] f22455i = {1.0f, 0.0f, 0.0f, 1.0f};
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float[] f22456j = {0.9412f, 0.7686f, 0.2f, 1.0f};

    /* renamed from: k */
    private boolean f22457k;

    /* renamed from: l */
    private ViewGroup.MarginLayoutParams f22458l;

    /* renamed from: m */
    private int f22459m;
    public int mMode;

    /* renamed from: n */
    private boolean f22460n = false;

    /* renamed from: o */
    private Handler f22461o = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C9275d f22462p = new C9273b();

    /* renamed from: q */
    private C9269a f22463q;

    /* renamed from: r */
    private C9270b f22464r;

    /* renamed from: com.mbridge.msdk.video.dynview.endcard.cloudview.TagCloudView$a */
    public interface C9269a {
    }

    /* renamed from: com.mbridge.msdk.video.dynview.endcard.cloudview.TagCloudView$b */
    public interface C9270b {
    }

    public TagCloudView(Context context) {
        super(context);
        m26548a(context, (AttributeSet) null);
    }

    public TagCloudView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26548a(context, attributeSet);
    }

    public TagCloudView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26548a(context, attributeSet);
    }

    /* renamed from: a */
    private void m26548a(Context context, AttributeSet attributeSet) {
        try {
            setFocusableInTouchMode(true);
            this.f22448b = new C9274c();
            this.mMode = 2;
            setManualScroll(true);
            setLightColor(Color.parseColor("#b1c914"));
            setDarkColor(Color.parseColor("#206fa1"));
            setRadiusPercent(0.6f);
            setScrollSpeed(1.0f);
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 13) {
                windowManager.getDefaultDisplay().getSize(point);
            } else {
                point.x = windowManager.getDefaultDisplay().getWidth();
                point.y = windowManager.getDefaultDisplay().getHeight();
            }
            int i = point.x;
            int i2 = point.y;
            if (i2 < i) {
                i = i2;
            }
            this.f22459m = i;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setAutoScrollMode(int i) {
        this.mMode = i;
    }

    public int getAutoScrollMode() {
        return this.mMode;
    }

    public final void setAdapter(C9275d dVar) {
        this.f22462p = dVar;
        dVar.mo62455a((C9275d.C9276a) this);
        onChange();
    }

    public void setManualScroll(boolean z) {
        this.f22457k = z;
    }

    public void setLightColor(int i) {
        float[] fArr = new float[4];
        fArr[3] = (((float) Color.alpha(i)) / 1.0f) / 255.0f;
        fArr[0] = (((float) Color.red(i)) / 1.0f) / 255.0f;
        fArr[1] = (((float) Color.green(i)) / 1.0f) / 255.0f;
        fArr[2] = (((float) Color.blue(i)) / 1.0f) / 255.0f;
        this.f22456j = (float[]) fArr.clone();
        onChange();
    }

    public void setDarkColor(int i) {
        float[] fArr = new float[4];
        fArr[3] = (((float) Color.alpha(i)) / 1.0f) / 255.0f;
        fArr[0] = (((float) Color.red(i)) / 1.0f) / 255.0f;
        fArr[1] = (((float) Color.green(i)) / 1.0f) / 255.0f;
        fArr[2] = (((float) Color.blue(i)) / 1.0f) / 255.0f;
        this.f22455i = (float[]) fArr.clone();
        onChange();
    }

    public void setRadiusPercent(float f) {
        if (f > 1.0f || f < 0.0f) {
            throw new IllegalArgumentException("percent value not in range 0 to 1");
        }
        this.f22454h = f;
        onChange();
    }

    public void setScrollSpeed(float f) {
        this.f22447a = f;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26547a() {
        removeAllViews();
        for (C9271a e : this.f22448b.mo62450b()) {
            addView(e.mo62434e());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.f22458l == null) {
            this.f22458l = (ViewGroup.MarginLayoutParams) getLayoutParams();
        }
        if (mode != 1073741824) {
            size = (this.f22459m - this.f22458l.leftMargin) - this.f22458l.rightMargin;
        }
        if (mode2 != 1073741824) {
            size2 = (this.f22459m - this.f22458l.leftMargin) - this.f22458l.rightMargin;
        }
        setMeasuredDimension(size, size2);
        measureChildren(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22461o.post(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22461o.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            C9271a a = this.f22448b.mo62444a(i5);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                this.f22462p.mo62403a(childAt, a.mo62442j(), a.mo62441i());
                childAt.setScaleX(a.mo62432d());
                childAt.setScaleY(a.mo62432d());
                int g = ((int) (this.f22451e + a.mo62438g())) - (childAt.getMeasuredWidth() / 2);
                int h = ((int) (this.f22452f + a.mo62440h())) - (childAt.getMeasuredHeight() / 2);
                childAt.layout(g, h, childAt.getMeasuredWidth() + g, childAt.getMeasuredHeight() + h);
            }
        }
    }

    public void reset() {
        this.f22448b.mo62453c();
        m26547a();
    }

    public void run() {
        int i;
        if (!this.f22460n && (i = this.mMode) != 0) {
            if (i == 1) {
                float f = this.f22449c;
                if (f > 0.04f) {
                    this.f22449c = f - 0.02f;
                }
                float f2 = this.f22450d;
                if (f2 > 0.04f) {
                    this.f22450d = f2 - 0.02f;
                }
                float f3 = this.f22449c;
                if (f3 < -0.04f) {
                    this.f22449c = f3 + 0.02f;
                }
                float f4 = this.f22450d;
                if (f4 < -0.04f) {
                    this.f22450d = f4 + 0.02f;
                }
            }
            C9274c cVar = this.f22448b;
            if (cVar != null) {
                cVar.mo62446a(this.f22449c, this.f22450d);
                this.f22448b.mo62454d();
            }
            m26547a();
        }
        this.f22461o.postDelayed(this, 16);
    }

    public void setOnTagClickListener(C9269a aVar) {
        this.f22463q = aVar;
    }

    public void setOnTagViewClickListener(C9270b bVar) {
        this.f22464r = bVar;
    }

    public void onChange() {
        postDelayed(new Runnable() {
            public final void run() {
                TagCloudView tagCloudView = TagCloudView.this;
                float unused = tagCloudView.f22451e = (float) ((tagCloudView.getRight() - TagCloudView.this.getLeft()) / 2);
                TagCloudView tagCloudView2 = TagCloudView.this;
                float unused2 = tagCloudView2.f22452f = (float) ((tagCloudView2.getBottom() - TagCloudView.this.getTop()) / 2);
                TagCloudView tagCloudView3 = TagCloudView.this;
                float unused3 = tagCloudView3.f22453g = Math.min(tagCloudView3.f22451e * TagCloudView.this.f22454h, TagCloudView.this.f22452f * TagCloudView.this.f22454h);
                TagCloudView.this.f22448b.mo62451b((int) TagCloudView.this.f22453g);
                TagCloudView.this.f22448b.mo62449a(TagCloudView.this.f22456j);
                TagCloudView.this.f22448b.mo62452b(TagCloudView.this.f22455i);
                TagCloudView.this.f22448b.mo62445a();
                TagCloudView.this.removeAllViews();
                for (int i = 0; i < TagCloudView.this.f22462p.mo62400a(); i++) {
                    C9271a aVar = new C9271a(TagCloudView.this.f22462p.mo62401a(i));
                    aVar.mo62425a(TagCloudView.this.f22462p.mo62402a(TagCloudView.this.getContext(), i, (ViewGroup) TagCloudView.this));
                    TagCloudView.this.f22448b.mo62447a(aVar);
                }
                TagCloudView.this.f22448b.mo62446a(TagCloudView.this.f22449c, TagCloudView.this.f22450d);
                TagCloudView.this.f22448b.mo62448a(true);
                TagCloudView.this.m26547a();
            }
        }, 0);
    }
}
