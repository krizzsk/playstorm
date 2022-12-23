package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.animation.p099a.C2660b;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.C2677a;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.C2678b;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2685e;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2686f;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2687g;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.adexpress.dynamic.p102d.C2712a;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.utils.C2984t;
import java.util.List;

public abstract class DynamicBaseWidget extends FrameLayout implements C2678b, C2724b, C2725c {

    /* renamed from: a */
    private float f5963a;

    /* renamed from: b */
    private float f5964b;

    /* renamed from: c */
    protected float f5965c;

    /* renamed from: d */
    protected float f5966d;

    /* renamed from: e */
    protected float f5967e;

    /* renamed from: f */
    protected float f5968f;

    /* renamed from: g */
    protected int f5969g = ((int) C2642b.m6894a(this.f5973k, this.f5967e));

    /* renamed from: h */
    protected int f5970h = ((int) C2642b.m6894a(this.f5973k, this.f5968f));

    /* renamed from: i */
    protected int f5971i = ((int) C2642b.m6894a(this.f5973k, this.f5965c));

    /* renamed from: j */
    protected int f5972j = ((int) C2642b.m6894a(this.f5973k, this.f5966d));

    /* renamed from: k */
    protected Context f5973k;

    /* renamed from: l */
    protected C2687g f5974l;

    /* renamed from: m */
    protected C2688h f5975m;

    /* renamed from: n */
    protected DynamicRootView f5976n;

    /* renamed from: o */
    protected View f5977o;

    /* renamed from: p */
    protected boolean f5978p;

    /* renamed from: q */
    protected C2660b f5979q;

    /* renamed from: r */
    C2677a f5980r;

    /* renamed from: s */
    private float f5981s;

    public float getShineValue() {
        return this.f5964b;
    }

    public void setShineValue(float f) {
        this.f5964b = f;
        postInvalidate();
    }

    public float getRippleValue() {
        return this.f5963a;
    }

    public void setRippleValue(float f) {
        this.f5963a = f;
        postInvalidate();
    }

    public float getMarqueeValue() {
        return this.f5981s;
    }

    public void setMarqueeValue(float f) {
        this.f5981s = f;
        postInvalidate();
    }

    public DynamicBaseWidget(Context context, DynamicRootView dynamicRootView, C2688h hVar) {
        super(context);
        this.f5973k = context;
        this.f5976n = dynamicRootView;
        this.f5975m = hVar;
        this.f5965c = hVar.mo17153e();
        this.f5966d = hVar.mo17155f();
        this.f5967e = hVar.mo17157g();
        this.f5968f = hVar.mo17159h();
        C2687g gVar = new C2687g(hVar.mo17160i());
        this.f5974l = gVar;
        if (gVar.mo17129r() > 0) {
            this.f5969g += this.f5974l.mo17129r() * 2;
            this.f5970h += this.f5974l.mo17129r() * 2;
            this.f5971i -= this.f5974l.mo17129r();
            this.f5972j -= this.f5974l.mo17129r();
            List<C2688h> j = hVar.mo17161j();
            if (j != null) {
                for (C2688h next : j) {
                    next.mo17150c(next.mo17153e() + ((float) C2642b.m6898b(this.f5973k, (float) this.f5974l.mo17129r())));
                    next.mo17152d(next.mo17155f() + ((float) C2642b.m6898b(this.f5973k, (float) this.f5974l.mo17129r())));
                    next.mo17139a((float) C2642b.m6898b(this.f5973k, (float) this.f5974l.mo17129r()));
                    next.mo17145b((float) C2642b.m6898b(this.f5973k, (float) this.f5974l.mo17129r()));
                }
            }
        }
        this.f5978p = this.f5974l.mo17125n() > 0.0d;
        this.f5980r = new C2677a();
    }

    public void setShouldInvisible(boolean z) {
        this.f5978p = z;
    }

    public boolean getBeginInvisibleAndShow() {
        return this.f5978p;
    }

    /* renamed from: c */
    public boolean mo17228c() {
        mo17249h();
        mo17231f();
        mo17229d();
        return true;
    }

    /* renamed from: a */
    public void mo17226a(int i) {
        C2687g gVar = this.f5974l;
        if (gVar != null && gVar.mo17112a(i)) {
            mo17249h();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null && (getChildAt(i2) instanceof DynamicBaseWidget)) {
                    ((DynamicBaseWidget) childAt).mo17226a(i);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo17229d() {
        if (!mo17230e()) {
            return true;
        }
        View view = this.f5977o;
        if (view == null) {
            view = this;
        }
        view.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        view.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        view.setTag(C2984t.m8432e(getContext(), "tt_id_click_tag"), this.f5974l.mo17137z());
        view.setTag(C2984t.m8432e(getContext(), "tt_id_click_area_type"), this.f5975m.mo17160i().mo16954b());
        mo17227a(view);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17227a(View view) {
        C2686f e;
        C2688h hVar = this.f5975m;
        if (hVar != null && (e = hVar.mo17160i().mo16960e()) != null) {
            view.setTag(C2984t.m8432e(getContext(), "tt_id_open_landing_page"), Boolean.valueOf(e.mo17007ak()));
        }
    }

    /* renamed from: e */
    public boolean mo17230e() {
        C2687g gVar = this.f5974l;
        return (gVar == null || gVar.mo17133v() == 0) ? false : true;
    }

    /* renamed from: f */
    public void mo17231f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f5969g, this.f5970h);
        layoutParams.topMargin = this.f5972j;
        layoutParams.leftMargin = this.f5971i;
        setLayoutParams(layoutParams);
    }

    public int getClickArea() {
        return this.f5974l.mo17133v();
    }

    public C2712a getDynamicClickListener() {
        return this.f5976n.getDynamicClickListener();
    }

    /* access modifiers changed from: protected */
    public Drawable getBackgroundDrawable() {
        return mo17223a(false, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Drawable mo17223a(boolean z, String str) {
        int i;
        if (!TextUtils.isEmpty(this.f5974l.mo17136y())) {
            try {
                String y = this.f5974l.mo17136y();
                String[] split = y.substring(y.indexOf("(") + 1, y.length() - 1).split(", ");
                GradientDrawable a = mo17225a(mo17224a(split[0]), new int[]{C2687g.m7189a(split[1].substring(0, 7)), C2687g.m7189a(split[2].substring(0, 7))});
                a.setShape(0);
                a.setCornerRadius(C2642b.m6894a(this.f5973k, this.f5974l.mo17126o()));
                return a;
            } catch (Exception unused) {
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        drawable.setCornerRadius(C2642b.m6894a(this.f5973k, this.f5974l.mo17126o()));
        if (z) {
            i = Color.parseColor(str);
        } else {
            i = this.f5974l.mo17134w();
        }
        drawable.setColor(i);
        if (this.f5974l.mo17128q() > 0.0f) {
            drawable.setStroke((int) C2642b.m6894a(this.f5973k, this.f5974l.mo17128q()), this.f5974l.mo17127p());
        } else if (this.f5974l.mo17129r() > 0) {
            drawable.setStroke(this.f5974l.mo17129r(), this.f5974l.mo17127p());
            drawable.setAlpha(50);
        }
        return drawable;
    }

    /* access modifiers changed from: protected */
    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public GradientDrawable mo17225a(GradientDrawable.Orientation orientation, int[] iArr) {
        return new GradientDrawable(orientation, iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public GradientDrawable.Orientation mo17224a(String str) {
        try {
            int parseInt = Integer.parseInt(str.substring(0, str.length() - 3));
            if (parseInt <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (parseInt <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (parseInt <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f5980r.mo16908a(canvas, (C2678b) this, (View) this);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C2677a aVar = this.f5980r;
        View view = this.f5977o;
        if (view == null) {
            view = this;
        }
        aVar.mo16909a(view, i, i2);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo17232g();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        mo16881b();
        super.onDetachedFromWindow();
    }

    /* renamed from: g */
    public void mo17232g() {
        if (!mo17208a()) {
            View view = this.f5977o;
            if (view == null) {
                view = this;
            }
            C2660b bVar = new C2660b(view, this.f5975m.mo17160i().mo16960e().mo16999ac());
            this.f5979q = bVar;
            bVar.mo16880a();
        }
    }

    /* renamed from: b */
    public void mo16881b() {
        C2660b bVar = this.f5979q;
        if (bVar != null) {
            bVar.mo16881b();
        }
    }

    /* renamed from: a */
    private boolean mo17208a() {
        C2688h hVar = this.f5975m;
        return hVar == null || hVar.mo17160i() == null || this.f5975m.mo17160i().mo16960e() == null || this.f5975m.mo17160i().mo16960e().mo16999ac() == null;
    }

    public int getDynamicWidth() {
        return this.f5969g;
    }

    public int getDynamicHeight() {
        return this.f5970h;
    }

    public C2686f getDynamicLayoutBrickValue() {
        C2685e i;
        C2688h hVar = this.f5975m;
        if (hVar == null || (i = hVar.mo17160i()) == null) {
            return null;
        }
        return i.mo16960e();
    }
}
