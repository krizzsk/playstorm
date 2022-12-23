package com.p374my.target;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.p374my.target.C9887o7;

/* renamed from: com.my.target.p7 */
public class C9909p7 extends ViewGroup implements C9887o7, View.OnClickListener {

    /* renamed from: a */
    public final C9804k6 f24501a;

    /* renamed from: b */
    public final C9783j6 f24502b;

    /* renamed from: c */
    public final TextView f24503c;

    /* renamed from: d */
    public final TextView f24504d;

    /* renamed from: e */
    public final TextView f24505e;

    /* renamed from: f */
    public final TextView f24506f;

    /* renamed from: g */
    public final TextView f24507g;

    /* renamed from: h */
    public final Button f24508h;

    /* renamed from: i */
    public final C9887o7.C9888a f24509i;

    /* renamed from: j */
    public final int f24510j;

    /* renamed from: k */
    public final int f24511k;

    /* renamed from: l */
    public final int f24512l;

    /* renamed from: m */
    public final int f24513m;

    /* renamed from: n */
    public final int f24514n;

    /* renamed from: o */
    public final int f24515o;

    /* renamed from: p */
    public final int f24516p;

    /* renamed from: q */
    public final C10038x7 f24517q;

    /* renamed from: r */
    public final int f24518r;

    /* renamed from: s */
    public final int f24519s;

    /* renamed from: t */
    public final int f24520t;

    /* renamed from: u */
    public C9911b f24521u = C9911b.PORTRAIT;

    /* renamed from: v */
    public boolean f24522v;

    /* renamed from: com.my.target.p7$a */
    public static /* synthetic */ class C9910a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24523a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.my.target.p7$b[] r0 = com.p374my.target.C9909p7.C9911b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24523a = r0
                com.my.target.p7$b r1 = com.p374my.target.C9909p7.C9911b.SQUARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24523a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.my.target.p7$b r1 = com.p374my.target.C9909p7.C9911b.PORTRAIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f24523a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.my.target.p7$b r1 = com.p374my.target.C9909p7.C9911b.LANDSCAPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9909p7.C9910a.<clinit>():void");
        }
    }

    /* renamed from: com.my.target.p7$b */
    public enum C9911b {
        PORTRAIT,
        LANDSCAPE,
        SQUARE
    }

    public C9909p7(C10038x7 x7Var, Context context, C9887o7.C9888a aVar) {
        super(context);
        this.f24509i = aVar;
        this.f24517q = x7Var;
        this.f24510j = x7Var.mo65713a(C10038x7.f24906C);
        this.f24511k = x7Var.mo65713a(C10038x7.f24907D);
        this.f24520t = x7Var.mo65713a(C10038x7.f24908E);
        this.f24512l = x7Var.mo65713a(C10038x7.f24909F);
        this.f24513m = x7Var.mo65713a(C10038x7.f24938l);
        this.f24514n = x7Var.mo65713a(C10038x7.f24937k);
        int a = x7Var.mo65713a(C10038x7.f24914K);
        this.f24518r = a;
        int a2 = x7Var.mo65713a(C10038x7.f24921R);
        this.f24515o = a2;
        this.f24516p = x7Var.mo65713a(C10038x7.f24920Q);
        this.f24519s = C10059y8.m29824a(a, context);
        C9804k6 k6Var = new C9804k6(context);
        this.f24501a = k6Var;
        C9783j6 j6Var = new C9783j6(context);
        this.f24502b = j6Var;
        TextView textView = new TextView(context);
        this.f24503c = textView;
        textView.setMaxLines(1);
        textView.setTextSize(1, (float) x7Var.mo65713a(C10038x7.f24910G));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setIncludeFontPadding(false);
        TextView textView2 = new TextView(context);
        this.f24504d = textView2;
        textView2.setTextSize(1, (float) x7Var.mo65713a(C10038x7.f24912I));
        textView2.setMaxLines(x7Var.mo65713a(C10038x7.f24913J));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setIncludeFontPadding(false);
        TextView textView3 = new TextView(context);
        this.f24505e = textView3;
        float f = (float) a;
        textView3.setTextSize(1, f);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setLines(1);
        textView3.setIncludeFontPadding(false);
        TextView textView4 = new TextView(context);
        this.f24506f = textView4;
        textView4.setTextSize(1, f);
        textView4.setIncludeFontPadding(false);
        Button button = new Button(context);
        this.f24508h = button;
        button.setLines(1);
        button.setTextSize(1, (float) x7Var.mo65713a(C10038x7.f24946t));
        button.setEllipsize(TextUtils.TruncateAt.END);
        button.setMinimumWidth(a2);
        button.setIncludeFontPadding(false);
        int a3 = x7Var.mo65713a(C10038x7.f24947u);
        int i = a3 * 2;
        button.setPadding(i, a3, i, a3);
        TextView textView5 = new TextView(context);
        this.f24507g = textView5;
        textView5.setPadding(x7Var.mo65713a(C10038x7.f24948v), 0, 0, 0);
        textView5.setTextColor(-1);
        textView5.setMaxLines(x7Var.mo65713a(C10038x7.f24951y));
        textView5.setIncludeFontPadding(false);
        textView5.setTextSize(1, (float) x7Var.mo65713a(C10038x7.f24952z));
        C10059y8.m29833a((View) k6Var, "panel_icon");
        C10059y8.m29833a((View) textView, "panel_title");
        C10059y8.m29833a((View) textView2, "panel_description");
        C10059y8.m29833a((View) textView3, "panel_domain");
        C10059y8.m29833a((View) textView4, "panel_rating");
        C10059y8.m29833a((View) button, "panel_cta");
        C10059y8.m29833a((View) textView5, "age_bordering");
        addView(k6Var);
        addView(j6Var);
        addView(textView);
        addView(textView2);
        addView(textView3);
        addView(textView4);
        addView(button);
        addView(textView5);
    }

    private void setClickArea(C9929r1 r1Var) {
        if (r1Var.f24595o) {
            setOnClickListener(this);
            this.f24508h.setOnClickListener(this);
            return;
        }
        if (r1Var.f24589i) {
            this.f24508h.setOnClickListener(this);
        } else {
            this.f24508h.setEnabled(false);
        }
        if (r1Var.f24594n) {
            setOnClickListener(this);
        } else {
            setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f24583c) {
            this.f24503c.setOnClickListener(this);
        } else {
            this.f24503c.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f24585e) {
            this.f24501a.setOnClickListener(this);
        } else {
            this.f24501a.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f24584d) {
            this.f24504d.setOnClickListener(this);
        } else {
            this.f24504d.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f24587g) {
            this.f24506f.setOnClickListener(this);
            this.f24502b.setOnClickListener(this);
        } else {
            this.f24506f.setOnClickListener((View.OnClickListener) null);
            this.f24502b.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f24592l) {
            this.f24505e.setOnClickListener(this);
        } else {
            this.f24505e.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f24590j) {
            this.f24507g.setOnClickListener(this);
        } else {
            this.f24507g.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* renamed from: a */
    public View mo65181a() {
        return this;
    }

    /* renamed from: a */
    public final void mo65223a(int i, int i2) {
        this.f24503c.setGravity(1);
        this.f24504d.setGravity(1);
        this.f24504d.setVisibility(0);
        this.f24508h.setVisibility(0);
        this.f24507g.setVisibility(8);
        this.f24503c.setTypeface(Typeface.defaultFromStyle(0));
        this.f24503c.setTextSize(1, (float) this.f24517q.mo65713a(C10038x7.f24911H));
        this.f24508h.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f24516p, 1073741824));
        C10059y8.m29830a(this.f24503c, i2, i2, Integer.MIN_VALUE);
        C10059y8.m29830a(this.f24504d, i2, i2, Integer.MIN_VALUE);
        setMeasuredDimension(i, i);
    }

    /* renamed from: a */
    public final void mo65224a(int i, int i2, int i3) {
        C9804k6 k6Var = this.f24501a;
        int i4 = this.f24511k;
        C10059y8.m29844c(k6Var, i4, i4);
        int right = this.f24501a.getRight() + (this.f24511k / 2);
        int a = C10059y8.m29826a(this.f24506f.getMeasuredHeight(), i3, i2);
        int a2 = C10059y8.m29826a(i + this.f24511k, this.f24501a.getTop());
        if (this.f24501a.getMeasuredHeight() > 0) {
            a2 += (((this.f24501a.getMeasuredHeight() - this.f24503c.getMeasuredHeight()) - this.f24512l) - a) / 2;
        }
        TextView textView = this.f24503c;
        textView.layout(right, a2, textView.getMeasuredWidth() + right, this.f24503c.getMeasuredHeight() + a2);
        C10059y8.m29828a(this.f24503c.getBottom() + this.f24512l, right, this.f24503c.getBottom() + this.f24512l + a, this.f24511k / 4, this.f24502b, this.f24506f, this.f24505e);
        C10059y8.m29847e(this.f24507g, this.f24503c.getBottom(), this.f24503c.getRight() + this.f24512l);
    }

    /* renamed from: a */
    public final void mo65225a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int measuredHeight = this.f24501a.getMeasuredHeight();
        if (measuredHeight > 0) {
            i6 = measuredHeight + 0;
            i5 = 1;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int measuredHeight2 = this.f24503c.getMeasuredHeight();
        if (measuredHeight2 > 0) {
            i5++;
            i6 += measuredHeight2;
        }
        int measuredHeight3 = this.f24504d.getMeasuredHeight();
        if (measuredHeight3 > 0) {
            i5++;
            i6 += measuredHeight3;
        }
        int max = Math.max(this.f24502b.getMeasuredHeight(), this.f24505e.getMeasuredHeight());
        if (max > 0) {
            i5++;
            i6 += max;
        }
        int measuredHeight4 = this.f24508h.getMeasuredHeight();
        if (measuredHeight4 > 0) {
            i5++;
            i6 += measuredHeight4;
        }
        int i7 = (i4 - i2) - i6;
        int a = C10059y8.m29823a(this.f24512l, this.f24511k, i7 / i5);
        int i8 = (i7 - (i5 * a)) / 2;
        int i9 = i3 - i;
        C10059y8.m29831a((View) this.f24501a, 0, i8, i9, measuredHeight + i8);
        int a2 = C10059y8.m29826a(i8, this.f24501a.getBottom() + a);
        C10059y8.m29831a((View) this.f24503c, 0, a2, i9, measuredHeight2 + a2);
        int a3 = C10059y8.m29826a(a2, this.f24503c.getBottom() + a);
        C10059y8.m29831a((View) this.f24504d, 0, a3, i9, measuredHeight3 + a3);
        int a4 = C10059y8.m29826a(a3, this.f24504d.getBottom() + a);
        int measuredWidth = ((i9 - this.f24506f.getMeasuredWidth()) - this.f24502b.getMeasuredWidth()) - this.f24505e.getMeasuredWidth();
        int i10 = this.f24512l;
        C10059y8.m29828a(a4, (measuredWidth - (i10 * 2)) / 2, max + a4, i10, this.f24502b, this.f24506f, this.f24505e);
        int a5 = C10059y8.m29826a(a4, this.f24505e.getBottom(), this.f24502b.getBottom()) + a;
        C10059y8.m29831a((View) this.f24508h, 0, a5, i9, measuredHeight4 + a5);
    }

    /* renamed from: a */
    public final void mo65226a(int i, int i2, int i3, int i4, int i5, int i6) {
        C9804k6 k6Var = this.f24501a;
        int i7 = i4 - i2;
        int i8 = this.f24520t;
        C10059y8.m29847e(k6Var, i7 - i8, i8);
        Button button = this.f24508h;
        int i9 = this.f24520t;
        C10059y8.m29845d(button, i7 - i9, (i3 - i) - i9);
        int right = this.f24501a.getRight() + this.f24511k;
        int a = C10059y8.m29826a(this.f24506f.getMeasuredHeight(), i6, i5);
        int a2 = C10059y8.m29826a(this.f24501a.getTop(), this.f24512l) + ((((this.f24501a.getMeasuredHeight() - this.f24503c.getMeasuredHeight()) - this.f24512l) - a) / 2);
        TextView textView = this.f24503c;
        textView.layout(right, a2, textView.getMeasuredWidth() + right, this.f24503c.getMeasuredHeight() + a2);
        C10059y8.m29828a(this.f24503c.getBottom() + this.f24512l, right, this.f24503c.getBottom() + this.f24512l + a, this.f24511k / 4, this.f24502b, this.f24506f, this.f24505e);
        C10059y8.m29847e(this.f24507g, this.f24503c.getBottom(), this.f24503c.getRight() + (this.f24511k / 2));
    }

    /* renamed from: b */
    public final void mo65227b(int i, int i2, int i3) {
        this.f24503c.setGravity(GravityCompat.START);
        this.f24504d.setVisibility(8);
        this.f24508h.setVisibility(0);
        this.f24503c.setTextSize((float) this.f24517q.mo65713a(C10038x7.f24911H));
        this.f24507g.setVisibility(0);
        TextView textView = this.f24503c;
        textView.setTypeface(textView.getTypeface(), 1);
        this.f24503c.setTextSize(1, (float) this.f24517q.mo65713a(C10038x7.f24910G));
        this.f24508h.measure(View.MeasureSpec.makeMeasureSpec(i2 / 3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f24516p, 1073741824));
        C10059y8.m29830a(this.f24507g, i2, i3, Integer.MIN_VALUE);
        int measuredWidth = i2 - ((((this.f24501a.getMeasuredWidth() + this.f24508h.getMeasuredWidth()) + (this.f24511k * 2)) + this.f24507g.getMeasuredWidth()) + this.f24512l);
        C10059y8.m29830a(this.f24503c, measuredWidth, i3, Integer.MIN_VALUE);
        C10059y8.m29830a(this.f24505e, measuredWidth, i3, Integer.MIN_VALUE);
        int measuredHeight = this.f24508h.getMeasuredHeight() + (this.f24520t * 2);
        if (this.f24522v) {
            measuredHeight += this.f24514n;
        }
        setMeasuredDimension(i, measuredHeight);
    }

    /* renamed from: c */
    public final void mo65228c(int i, int i2, int i3) {
        this.f24503c.setGravity(GravityCompat.START);
        this.f24504d.setVisibility(8);
        this.f24508h.setVisibility(8);
        this.f24507g.setVisibility(0);
        TextView textView = this.f24503c;
        textView.setTypeface(textView.getTypeface(), 1);
        this.f24503c.setTextSize(1, (float) this.f24517q.mo65713a(C10038x7.f24910G));
        C10059y8.m29830a(this.f24507g, i2, i3, Integer.MIN_VALUE);
        C10059y8.m29830a(this.f24503c, ((i2 - this.f24501a.getMeasuredWidth()) - (this.f24511k * 2)) - this.f24507g.getMeasuredWidth(), this.f24501a.getMeasuredHeight() - (this.f24512l * 2), Integer.MIN_VALUE);
        setMeasuredDimension(i, C10059y8.m29826a(this.f24501a.getMeasuredHeight() + (this.f24511k * 2), this.f24503c.getMeasuredHeight() + C10059y8.m29826a(this.f24518r, this.f24505e.getMeasuredHeight()) + this.f24511k));
    }

    public void onClick(View view) {
        this.f24509i.mo65183a((C10066z1) null);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight = this.f24505e.getMeasuredHeight();
        int measuredHeight2 = this.f24502b.getMeasuredHeight();
        int i5 = C9910a.f24523a[this.f24521u.ordinal()];
        if (i5 == 1) {
            mo65225a(i, i2, i3, i4);
        } else if (i5 != 3) {
            mo65224a(i2, measuredHeight, measuredHeight2);
        } else {
            mo65226a(i, i2, i3, i4, measuredHeight, measuredHeight2);
        }
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.f24511k * 2;
        int i4 = size - i3;
        int i5 = size2 - i3;
        this.f24521u = i4 == i5 ? C9911b.SQUARE : i4 > i5 ? C9911b.LANDSCAPE : C9911b.PORTRAIT;
        C9804k6 k6Var = this.f24501a;
        int i6 = this.f24510j;
        C10059y8.m29830a(k6Var, i6, i6, 1073741824);
        if (this.f24506f.getVisibility() != 8) {
            C10059y8.m29830a(this.f24506f, (i4 - this.f24501a.getMeasuredWidth()) - this.f24512l, i5, Integer.MIN_VALUE);
            C9783j6 j6Var = this.f24502b;
            int i7 = this.f24519s;
            C10059y8.m29830a(j6Var, i7, i7, 1073741824);
        }
        if (this.f24505e.getVisibility() != 8) {
            C10059y8.m29830a(this.f24505e, (i4 - this.f24501a.getMeasuredWidth()) - (this.f24511k * 2), i5, Integer.MIN_VALUE);
        }
        C9911b bVar = this.f24521u;
        if (bVar == C9911b.SQUARE) {
            int i8 = this.f24520t * 2;
            mo65223a(size - i8, i4 - i8);
        } else if (bVar == C9911b.LANDSCAPE) {
            mo65227b(size, i4, i5);
        } else {
            mo65228c(size, i4, i5);
        }
    }

    public void setBanner(C9697f2 f2Var) {
        C9996v1 promoStyleSettings = f2Var.getPromoStyleSettings();
        int j = promoStyleSettings.mo65600j();
        this.f24503c.setTextColor(promoStyleSettings.mo65601k());
        this.f24504d.setTextColor(j);
        this.f24505e.setTextColor(j);
        this.f24506f.setTextColor(j);
        this.f24502b.setColor(j);
        this.f24522v = f2Var.getVideoBanner() != null;
        this.f24501a.setImageData(f2Var.getIcon());
        this.f24503c.setText(f2Var.getTitle());
        this.f24504d.setText(f2Var.getDescription());
        if (f2Var.getNavigationType().equals("store")) {
            this.f24505e.setVisibility(8);
            if (f2Var.getRating() > 0.0f) {
                this.f24506f.setVisibility(0);
                String valueOf = String.valueOf(f2Var.getRating());
                if (valueOf.length() > 3) {
                    valueOf = valueOf.substring(0, 3);
                }
                this.f24506f.setText(valueOf);
            } else {
                this.f24506f.setVisibility(8);
            }
        } else {
            this.f24506f.setVisibility(8);
            this.f24505e.setVisibility(0);
            this.f24505e.setText(f2Var.getDomain());
            this.f24505e.setTextColor(promoStyleSettings.mo65594g());
        }
        this.f24508h.setText(f2Var.getCtaText());
        C10059y8.m29839b(this.f24508h, promoStyleSettings.mo65588d(), promoStyleSettings.mo65592f(), this.f24513m);
        this.f24508h.setTextColor(promoStyleSettings.mo65600j());
        setClickArea(f2Var.getClickArea());
        this.f24507g.setText(f2Var.getAgeRestrictions());
    }
}
