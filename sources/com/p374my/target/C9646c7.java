package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.p374my.target.C9606a7;
import com.p374my.target.C9841m4;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.common.models.VideoData;

/* renamed from: com.my.target.c7 */
public class C9646c7 extends RelativeLayout implements C10079z6 {

    /* renamed from: a */
    public static final int f23722a = C10059y8.m29841c();

    /* renamed from: b */
    public final C9648b f23723b;

    /* renamed from: c */
    public final C9804k6 f23724c;

    /* renamed from: d */
    public final C9703f7 f23725d;

    /* renamed from: e */
    public final C9662d7 f23726e;

    /* renamed from: f */
    public final C9630b7 f23727f;

    /* renamed from: g */
    public final C9720g6 f23728g;

    /* renamed from: h */
    public final C9862n6 f23729h;

    /* renamed from: i */
    public final C10059y8 f23730i;

    /* renamed from: j */
    public final C9720g6 f23731j;

    /* renamed from: k */
    public final C10020w5 f23732k;

    /* renamed from: l */
    public final Bitmap f23733l;

    /* renamed from: m */
    public final Bitmap f23734m;

    /* renamed from: n */
    public final int f23735n;

    /* renamed from: o */
    public final int f23736o;

    /* renamed from: p */
    public final int f23737p;

    /* renamed from: q */
    public final int f23738q;

    /* renamed from: r */
    public float f23739r;

    /* renamed from: s */
    public C9606a7.C9607a f23740s;

    /* renamed from: t */
    public C9841m4.C9842a f23741t;

    /* renamed from: u */
    public final int f23742u;

    /* renamed from: com.my.target.c7$a */
    public class C9647a implements View.OnClickListener {
        public C9647a() {
        }

        public void onClick(View view) {
            if (C9646c7.this.f23740s != null) {
                C9646c7.this.f23740s.mo63484d();
            }
        }
    }

    /* renamed from: com.my.target.c7$b */
    public class C9648b implements View.OnClickListener {
        public C9648b() {
        }

        public void onClick(View view) {
            if (view.isEnabled() && C9646c7.this.f23740s != null) {
                C9646c7.this.f23740s.mo63485e();
            }
        }
    }

    public C9646c7(Context context, C9850m7 m7Var) {
        super(context);
        boolean z = (getContext().getResources().getConfiguration().screenLayout & 15) >= 3;
        C10059y8 c = C10059y8.m29843c(context);
        this.f23730i = c;
        C9804k6 k6Var = new C9804k6(context);
        this.f23724c = k6Var;
        C9703f7 b = m7Var.mo64770b(c, z);
        this.f23725d = b;
        C9662d7 a = m7Var.mo64766a(c, z);
        this.f23726e = a;
        int i = f23722a;
        a.setId(i);
        C9720g6 g6Var = new C9720g6(context);
        this.f23728g = g6Var;
        C9862n6 n6Var = new C9862n6(context);
        this.f23729h = n6Var;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(3, i);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14, -1);
        C9630b7 b7Var = new C9630b7(context, c);
        this.f23727f = b7Var;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(12, -1);
        b7Var.setLayoutParams(layoutParams3);
        C9720g6 g6Var2 = new C9720g6(context);
        this.f23731j = g6Var2;
        this.f23733l = C9920q5.m29096f(context);
        this.f23734m = C9920q5.m29095e(context);
        this.f23723b = new C9648b();
        this.f23735n = c.mo65778b(64);
        this.f23736o = c.mo65778b(20);
        C10020w5 w5Var = new C10020w5(context);
        this.f23732k = w5Var;
        int b2 = c.mo65778b(28);
        this.f23742u = b2;
        w5Var.setFixedHeight(b2);
        C10059y8.m29840b(k6Var, ViewHierarchyConstants.ICON_BITMAP);
        C10059y8.m29840b(g6Var2, "sound_button");
        C10059y8.m29840b(b, "vertical_view");
        C10059y8.m29840b(a, "media_view");
        C10059y8.m29840b(b7Var, "panel_view");
        C10059y8.m29840b(g6Var, "close_button");
        C10059y8.m29840b(n6Var, "progress_wheel");
        addView(b7Var, 0);
        addView(k6Var, 0);
        addView(b, 0, layoutParams);
        addView(a, 0, layoutParams2);
        addView(g6Var2);
        addView(w5Var);
        addView(g6Var);
        addView(n6Var);
        this.f23737p = c.mo65778b(28);
        this.f23738q = c.mo65778b(10);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m27759a(View view) {
        C9841m4.C9842a aVar = this.f23741t;
        if (aVar != null) {
            aVar.mo64744a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m27760b(View view) {
        C9606a7.C9607a aVar = this.f23740s;
        if (aVar != null) {
            aVar.mo63485e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m27761e() {
        this.f23727f.mo63630b(this.f23731j);
    }

    /* renamed from: a */
    public void mo63700a() {
        this.f23727f.mo63629a(this.f23731j);
        this.f23726e.mo63884f();
    }

    /* renamed from: a */
    public void mo63701a(int i) {
        this.f23726e.mo63873a(i);
    }

    /* renamed from: a */
    public void mo63702a(C9697f2 f2Var) {
        this.f23731j.setVisibility(8);
        this.f23728g.setVisibility(0);
        mo63704a(false);
        this.f23726e.mo63878b(f2Var);
    }

    /* renamed from: a */
    public final void mo63703a(C9894p1 p1Var) {
        this.f23732k.setImageBitmap(p1Var.mo65194c().getBitmap());
        this.f23732k.setOnClickListener(new C9647a());
    }

    /* renamed from: a */
    public void mo63704a(boolean z) {
        this.f23729h.setVisibility(8);
        this.f23727f.mo63633e(this.f23731j);
        this.f23726e.mo63880b(z);
    }

    /* renamed from: b */
    public void mo63705b() {
        this.f23727f.mo63633e(this.f23731j);
        this.f23726e.mo63883e();
    }

    /* renamed from: b */
    public final void mo63706b(boolean z) {
        C9720g6 g6Var;
        String str;
        if (z) {
            this.f23731j.mo64102a(this.f23734m, false);
            g6Var = this.f23731j;
            str = "sound_off";
        } else {
            this.f23731j.mo64102a(this.f23733l, false);
            g6Var = this.f23731j;
            str = "sound_on";
        }
        g6Var.setContentDescription(str);
    }

    /* renamed from: b */
    public final boolean mo63707b(C9697f2 f2Var) {
        int i;
        int i2;
        C9983u1 u1Var;
        C9711g2<VideoData> videoBanner = f2Var.getVideoBanner();
        if (videoBanner == null ? (u1Var = f2Var.getImage()) == null : (u1Var = videoBanner.getMediaData()) == null) {
            i = 0;
            i2 = 0;
        } else {
            i2 = u1Var.getHeight();
            i = u1Var.getWidth();
        }
        if (i2 <= 0 || i <= 0) {
            return false;
        }
        return i2 > i || ((float) i) / ((float) i2) < 1.4f;
    }

    /* renamed from: c */
    public void mo63708c(boolean z) {
        this.f23727f.mo63629a(this.f23731j);
        this.f23726e.mo63876a(z);
    }

    /* renamed from: c */
    public boolean mo63709c() {
        return this.f23726e.mo63882d();
    }

    /* renamed from: d */
    public void mo63478d() {
        this.f23728g.setVisibility(0);
    }

    public void destroy() {
        this.f23726e.mo63872a();
    }

    /* renamed from: f */
    public boolean mo63711f() {
        return this.f23726e.mo63881c();
    }

    /* renamed from: g */
    public void mo63712g() {
        this.f23726e.mo63888h();
    }

    public View getCloseButton() {
        return this.f23728g;
    }

    public C9662d7 getPromoMediaView() {
        return this.f23726e;
    }

    public View getView() {
        return this;
    }

    /* renamed from: h */
    public void mo63714h() {
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C9720g6 g6Var = this.f23728g;
        g6Var.layout(i3 - g6Var.getMeasuredWidth(), 0, i3, this.f23728g.getMeasuredHeight());
        C9862n6 n6Var = this.f23729h;
        int i5 = this.f23738q;
        n6Var.layout(i5, i5, n6Var.getMeasuredWidth() + this.f23738q, this.f23729h.getMeasuredHeight() + this.f23738q);
        C10059y8.m29831a((View) this.f23732k, this.f23728g.getLeft() - this.f23732k.getMeasuredWidth(), this.f23728g.getTop(), this.f23728g.getLeft(), this.f23728g.getBottom());
        if (i4 > i3) {
            if (this.f23731j.getTranslationY() > 0.0f) {
                this.f23731j.setTranslationY(0.0f);
            }
            setBackgroundColor(-1);
            int measuredWidth = (i3 - this.f23726e.getMeasuredWidth()) / 2;
            C9662d7 d7Var = this.f23726e;
            d7Var.layout(measuredWidth, 0, d7Var.getMeasuredWidth() + measuredWidth, this.f23726e.getMeasuredHeight());
            this.f23725d.layout(0, this.f23726e.getBottom(), i3, i4);
            int i6 = this.f23736o;
            if (this.f23726e.getMeasuredHeight() != 0) {
                i6 = this.f23726e.getBottom() - (this.f23724c.getMeasuredHeight() / 2);
            }
            C9804k6 k6Var = this.f23724c;
            int i7 = this.f23736o;
            k6Var.layout(i7, i6, k6Var.getMeasuredWidth() + i7, this.f23724c.getMeasuredHeight() + i6);
            this.f23727f.layout(0, 0, 0, 0);
            C9720g6 g6Var2 = this.f23731j;
            g6Var2.layout(i3 - g6Var2.getMeasuredWidth(), this.f23726e.getBottom() - this.f23731j.getMeasuredHeight(), i3, this.f23726e.getBottom());
            return;
        }
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        int measuredWidth2 = (i3 - this.f23726e.getMeasuredWidth()) / 2;
        int measuredHeight = (i4 - this.f23726e.getMeasuredHeight()) / 2;
        C9662d7 d7Var2 = this.f23726e;
        d7Var2.layout(measuredWidth2, measuredHeight, d7Var2.getMeasuredWidth() + measuredWidth2, this.f23726e.getMeasuredHeight() + measuredHeight);
        this.f23724c.layout(0, 0, 0, 0);
        this.f23725d.layout(0, 0, 0, 0);
        C9630b7 b7Var = this.f23727f;
        b7Var.layout(0, i4 - b7Var.getMeasuredHeight(), i3, i4);
        C9720g6 g6Var3 = this.f23731j;
        g6Var3.layout(i3 - g6Var3.getMeasuredWidth(), this.f23727f.getTop() - this.f23731j.getMeasuredHeight(), i3, this.f23727f.getTop());
        if (this.f23726e.mo63882d()) {
            this.f23727f.mo63630b(this.f23731j);
        }
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f23731j.measure(i, i2);
        this.f23728g.measure(i, i2);
        this.f23729h.measure(View.MeasureSpec.makeMeasureSpec(this.f23737p, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23737p, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        C10020w5 w5Var = this.f23732k;
        int i3 = this.f23742u;
        C10059y8.m29830a(w5Var, i3, i3, 1073741824);
        if (size2 > size) {
            this.f23727f.setVisibility(8);
            this.f23726e.measure(makeMeasureSpec, makeMeasureSpec2);
            this.f23725d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - this.f23726e.getMeasuredHeight(), Integer.MIN_VALUE));
            this.f23724c.measure(View.MeasureSpec.makeMeasureSpec(this.f23735n, Integer.MIN_VALUE), makeMeasureSpec2);
        } else {
            this.f23727f.setVisibility(0);
            this.f23726e.measure(makeMeasureSpec, makeMeasureSpec2);
            this.f23727f.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), makeMeasureSpec2);
        }
        setMeasuredDimension(i, i2);
    }

    public void setBanner(C9697f2 f2Var) {
        int i;
        int i2;
        String str;
        C9720g6 g6Var;
        this.f23729h.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f23737p, this.f23730i.mo65778b(28));
        layoutParams.addRule(9);
        layoutParams.topMargin = this.f23730i.mo65778b(10);
        layoutParams.leftMargin = this.f23730i.mo65778b(10);
        this.f23729h.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(11);
        this.f23728g.setVisibility(8);
        C9711g2<VideoData> videoBanner = f2Var.getVideoBanner();
        if (videoBanner == null) {
            this.f23731j.setVisibility(8);
        }
        this.f23728g.setLayoutParams(layoutParams2);
        Point b = C10059y8.m29837b(getContext());
        boolean z = b.x + b.y < 1280 || mo63707b(f2Var);
        this.f23727f.mo63626a();
        this.f23727f.setBanner(f2Var);
        this.f23725d.mo64032a(b.x, b.y, z);
        this.f23725d.setBanner(f2Var);
        this.f23726e.mo63877b();
        this.f23726e.mo63879b(f2Var, 0);
        ImageData closeIcon = f2Var.getCloseIcon();
        if (closeIcon == null || closeIcon.getData() == null) {
            Bitmap a = C9905p5.m28985a(this.f23742u);
            if (a != null) {
                this.f23728g.mo64102a(a, false);
            }
        } else {
            this.f23728g.mo64102a(closeIcon.getData(), true);
        }
        ImageData icon = f2Var.getIcon();
        if (icon != null) {
            i2 = icon.getWidth();
            i = icon.getHeight();
        } else {
            i2 = 0;
            i = 0;
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.bottomMargin = this.f23730i.mo65778b(4);
        if (!(i2 == 0 || i == 0)) {
            int b2 = (int) (((float) this.f23730i.mo65778b(64)) * (((float) i) / ((float) i2)));
            layoutParams3.width = this.f23735n;
            layoutParams3.height = b2;
            if (!z) {
                layoutParams3.bottomMargin = (-b2) / 2;
            }
        }
        layoutParams3.addRule(8, f23722a);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart(this.f23730i.mo65778b(20));
        } else {
            layoutParams3.leftMargin = this.f23730i.mo65778b(20);
        }
        this.f23724c.setLayoutParams(layoutParams3);
        if (icon != null) {
            this.f23724c.setImageBitmap(icon.getData());
        }
        if (videoBanner != null && videoBanner.isAutoPlay()) {
            mo63708c(true);
            post(new Runnable() {
                public final void run() {
                    C9646c7.this.m27761e();
                }
            });
        }
        if (videoBanner != null) {
            this.f23739r = videoBanner.getDuration();
            if (videoBanner.isAutoMute()) {
                this.f23731j.mo64102a(this.f23734m, false);
                g6Var = this.f23731j;
                str = "sound_off";
            } else {
                this.f23731j.mo64102a(this.f23733l, false);
                g6Var = this.f23731j;
                str = "sound_on";
            }
            g6Var.setContentDescription(str);
        }
        this.f23731j.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C9646c7.this.m27759a(view);
            }
        });
        C9894p1 adChoices = f2Var.getAdChoices();
        if (adChoices != null) {
            mo63703a(adChoices);
        } else {
            this.f23732k.setVisibility(8);
        }
    }

    public void setClickArea(C9929r1 r1Var) {
        C9672e0.m27882a("Apply click area " + r1Var.mo65320a() + " to view");
        if (r1Var.f24585e || r1Var.f24595o) {
            this.f23724c.setOnClickListener(this.f23723b);
        } else {
            this.f23724c.setOnClickListener((View.OnClickListener) null);
        }
        this.f23725d.mo64033a(r1Var, this.f23723b);
        this.f23727f.mo63628a(r1Var, (View.OnClickListener) this.f23723b);
        if (r1Var.f24586f || r1Var.f24595o) {
            this.f23726e.getClickableLayout().setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C9646c7.this.m27760b(view);
                }
            });
            return;
        }
        this.f23726e.getClickableLayout().setOnClickListener((View.OnClickListener) null);
        this.f23726e.getClickableLayout().setEnabled(false);
    }

    public void setInterstitialPromoViewListener(C9606a7.C9607a aVar) {
        this.f23740s = aVar;
    }

    public void setMediaListener(C9841m4.C9842a aVar) {
        this.f23741t = aVar;
        this.f23726e.setInterstitialPromoViewListener(aVar);
        this.f23726e.mo63885g();
    }

    public void setTimeChanged(float f) {
        this.f23729h.setVisibility(0);
        float f2 = this.f23739r;
        if (f2 > 0.0f) {
            this.f23729h.setProgress(f / f2);
        }
        this.f23729h.setDigit((int) ((this.f23739r - f) + 1.0f));
    }
}
