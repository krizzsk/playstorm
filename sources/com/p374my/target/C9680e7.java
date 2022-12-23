package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.p374my.target.C9606a7;
import com.p374my.target.C9841m4;
import com.p374my.target.common.models.VideoData;
import com.p374my.target.common.views.StarsRatingView;

/* renamed from: com.my.target.e7 */
public class C9680e7 extends ViewGroup implements C10079z6 {

    /* renamed from: A */
    public C9841m4.C9842a f23801A;

    /* renamed from: B */
    public int f23802B;

    /* renamed from: C */
    public float f23803C;

    /* renamed from: D */
    public boolean f23804D;

    /* renamed from: E */
    public boolean f23805E;

    /* renamed from: F */
    public final int f23806F;

    /* renamed from: G */
    public String f23807G;

    /* renamed from: H */
    public String f23808H;

    /* renamed from: I */
    public boolean f23809I;

    /* renamed from: a */
    public final C9683c f23810a;

    /* renamed from: b */
    public final TextView f23811b;

    /* renamed from: c */
    public final StarsRatingView f23812c;

    /* renamed from: d */
    public final Button f23813d;

    /* renamed from: e */
    public final TextView f23814e;

    /* renamed from: f */
    public final C10059y8 f23815f;

    /* renamed from: g */
    public final LinearLayout f23816g;

    /* renamed from: h */
    public final TextView f23817h;

    /* renamed from: i */
    public final FrameLayout f23818i;

    /* renamed from: j */
    public final C9662d7 f23819j;

    /* renamed from: k */
    public final TextView f23820k;

    /* renamed from: l */
    public final C9862n6 f23821l;

    /* renamed from: m */
    public final C9720g6 f23822m;

    /* renamed from: n */
    public final C10057y6 f23823n;

    /* renamed from: o */
    public final C10057y6 f23824o;

    /* renamed from: p */
    public final C10057y6 f23825p;

    /* renamed from: q */
    public final Runnable f23826q = new C9684d();

    /* renamed from: r */
    public final C9685e f23827r = new C9685e();

    /* renamed from: s */
    public final C9682b f23828s = new C9682b();

    /* renamed from: t */
    public final C10020w5 f23829t;

    /* renamed from: u */
    public final int f23830u;

    /* renamed from: v */
    public final int f23831v;

    /* renamed from: w */
    public final Bitmap f23832w;

    /* renamed from: x */
    public final Bitmap f23833x;

    /* renamed from: y */
    public float f23834y;

    /* renamed from: z */
    public C9606a7.C9607a f23835z;

    /* renamed from: com.my.target.e7$b */
    public class C9682b implements View.OnClickListener {
        public C9682b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
            if (com.p374my.target.C9680e7.m27913e(r1.f23836a) != null) goto L_0x0059;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r2) {
            /*
                r1 = this;
                com.my.target.e7 r0 = com.p374my.target.C9680e7.this
                android.widget.LinearLayout r0 = r0.f23816g
                if (r2 != r0) goto L_0x0011
                com.my.target.e7 r2 = com.p374my.target.C9680e7.this
                com.my.target.m4$a r2 = r2.f23801A
                if (r2 == 0) goto L_0x0062
                goto L_0x0059
            L_0x0011:
                com.my.target.e7 r0 = com.p374my.target.C9680e7.this
                com.my.target.y6 r0 = r0.f23823n
                if (r2 != r0) goto L_0x0037
                com.my.target.e7 r2 = com.p374my.target.C9680e7.this
                com.my.target.d7 r2 = r2.f23819j
                boolean r2 = r2.mo63882d()
                if (r2 == 0) goto L_0x0081
                com.my.target.e7 r2 = com.p374my.target.C9680e7.this
                com.my.target.m4$a r2 = r2.f23801A
                if (r2 == 0) goto L_0x0081
                com.my.target.e7 r2 = com.p374my.target.C9680e7.this
                com.my.target.m4$a r2 = r2.f23801A
                r2.mo63894c()
                goto L_0x0081
            L_0x0037:
                com.my.target.e7 r0 = com.p374my.target.C9680e7.this
                com.my.target.y6 r0 = r0.f23824o
                if (r2 != r0) goto L_0x0068
                com.my.target.e7 r2 = com.p374my.target.C9680e7.this
                com.my.target.m4$a r2 = r2.f23801A
                if (r2 == 0) goto L_0x0062
                com.my.target.e7 r2 = com.p374my.target.C9680e7.this
                boolean r2 = r2.mo63711f()
                if (r2 == 0) goto L_0x0059
                com.my.target.e7 r2 = com.p374my.target.C9680e7.this
                com.my.target.m4$a r2 = r2.f23801A
                r2.mo63896n()
                goto L_0x0062
            L_0x0059:
                com.my.target.e7 r2 = com.p374my.target.C9680e7.this
                com.my.target.m4$a r2 = r2.f23801A
                r2.mo63895m()
            L_0x0062:
                com.my.target.e7 r2 = com.p374my.target.C9680e7.this
                r2.mo63949e()
                goto L_0x0081
            L_0x0068:
                com.my.target.e7 r0 = com.p374my.target.C9680e7.this
                com.my.target.w5 r0 = r0.f23829t
                if (r2 != r0) goto L_0x0081
                com.my.target.e7 r2 = com.p374my.target.C9680e7.this
                com.my.target.a7$a r2 = r2.f23835z
                if (r2 == 0) goto L_0x0081
                com.my.target.e7 r2 = com.p374my.target.C9680e7.this
                com.my.target.a7$a r2 = r2.f23835z
                r2.mo63484d()
            L_0x0081:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9680e7.C9682b.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.my.target.e7$c */
    public class C9683c implements View.OnClickListener {
        public C9683c() {
        }

        public void onClick(View view) {
            if (view.isEnabled() && C9680e7.this.f23835z != null) {
                C9680e7.this.f23835z.mo63485e();
            }
        }
    }

    /* renamed from: com.my.target.e7$d */
    public class C9684d implements Runnable {
        public C9684d() {
        }

        public void run() {
            if (C9680e7.this.f23802B == 2 || C9680e7.this.f23802B == 0) {
                C9680e7.this.mo63949e();
            }
        }
    }

    /* renamed from: com.my.target.e7$e */
    public class C9685e implements View.OnClickListener {
        public C9685e() {
        }

        public void onClick(View view) {
            C9680e7 e7Var = C9680e7.this;
            e7Var.removeCallbacks(e7Var.f23826q);
            if (C9680e7.this.f23802B == 2) {
                C9680e7.this.mo63949e();
                return;
            }
            if (C9680e7.this.f23802B == 0 || C9680e7.this.f23802B == 3) {
                C9680e7.this.mo63951j();
            }
            C9680e7 e7Var2 = C9680e7.this;
            e7Var2.postDelayed(e7Var2.f23826q, 4000);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9680e7(Context context, boolean z) {
        super(context);
        Context context2 = context;
        TextView textView = new TextView(context2);
        this.f23814e = textView;
        TextView textView2 = new TextView(context2);
        this.f23811b = textView2;
        StarsRatingView starsRatingView = new StarsRatingView(context2);
        this.f23812c = starsRatingView;
        Button button = new Button(context2);
        this.f23813d = button;
        TextView textView3 = new TextView(context2);
        this.f23817h = textView3;
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f23818i = frameLayout;
        C10057y6 y6Var = new C10057y6(context2);
        this.f23823n = y6Var;
        C10057y6 y6Var2 = new C10057y6(context2);
        this.f23824o = y6Var2;
        C10057y6 y6Var3 = new C10057y6(context2);
        this.f23825p = y6Var3;
        TextView textView4 = new TextView(context2);
        this.f23820k = textView4;
        C9662d7 d7Var = new C9662d7(context2, C10059y8.m29843c(context), false, z);
        this.f23819j = d7Var;
        C9862n6 n6Var = new C9862n6(context2);
        this.f23821l = n6Var;
        C9720g6 g6Var = new C9720g6(context2);
        this.f23822m = g6Var;
        this.f23816g = new LinearLayout(context2);
        C10059y8 c = C10059y8.m29843c(context);
        this.f23815f = c;
        this.f23829t = new C10020w5(context2);
        C10059y8.m29840b(textView, "dismiss_button");
        C10059y8.m29840b(textView2, "title_text");
        C10059y8.m29840b(starsRatingView, "stars_view");
        C10059y8.m29840b(button, "cta_button");
        C10059y8.m29840b(textView3, "replay_text");
        C10059y8.m29840b(frameLayout, "shadow");
        C10059y8.m29840b(y6Var, "pause_button");
        C10059y8.m29840b(y6Var2, "play_button");
        C10059y8.m29840b(y6Var3, "replay_button");
        C10059y8.m29840b(textView4, "domain_text");
        C10059y8.m29840b(d7Var, "media_view");
        C10059y8.m29840b(n6Var, "video_progress_wheel");
        C10059y8.m29840b(g6Var, "sound_button");
        C10059y8 y8Var = c;
        this.f23806F = y8Var.mo65778b(28);
        this.f23830u = y8Var.mo65778b(16);
        this.f23831v = y8Var.mo65778b(4);
        this.f23832w = C9920q5.m29096f(context);
        this.f23833x = C9920q5.m29095e(context);
        this.f23810a = new C9683c();
        mo63950i();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m27909a(View view) {
        C9841m4.C9842a aVar = this.f23801A;
        if (aVar != null) {
            aVar.mo64744a();
        }
    }

    /* renamed from: a */
    public void mo63700a() {
        this.f23819j.mo63884f();
    }

    /* renamed from: a */
    public void mo63701a(int i) {
        this.f23819j.mo63873a(i);
    }

    /* renamed from: a */
    public void mo63702a(C9697f2 f2Var) {
        this.f23819j.setOnClickListener((View.OnClickListener) null);
        this.f23822m.setVisibility(8);
        this.f23819j.mo63878b(f2Var);
        mo63478d();
        this.f23802B = 4;
        this.f23816g.setVisibility(8);
        this.f23824o.setVisibility(8);
        this.f23823n.setVisibility(8);
        this.f23818i.setVisibility(8);
        this.f23821l.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo63948a(C9894p1 p1Var) {
        this.f23829t.setImageBitmap(p1Var.mo65194c().getBitmap());
        this.f23829t.setOnClickListener(this.f23828s);
    }

    /* renamed from: a */
    public void mo63704a(boolean z) {
        this.f23819j.mo63880b(true);
    }

    /* renamed from: b */
    public void mo63705b() {
        int i = this.f23802B;
        if (i == 0 || i == 2) {
            mo63952k();
            this.f23819j.mo63883e();
        }
    }

    /* renamed from: b */
    public final void mo63706b(boolean z) {
        String str;
        C9720g6 g6Var = this.f23822m;
        if (z) {
            g6Var.mo64102a(this.f23833x, false);
            str = "sound_off";
        } else {
            g6Var.mo64102a(this.f23832w, false);
            str = "sound_on";
        }
        g6Var.setContentDescription(str);
    }

    /* renamed from: c */
    public void mo63708c(boolean z) {
        this.f23819j.mo63876a(z);
        mo63949e();
    }

    /* renamed from: c */
    public boolean mo63709c() {
        return this.f23819j.mo63882d();
    }

    /* renamed from: d */
    public void mo63478d() {
        this.f23814e.setText(this.f23807G);
        this.f23814e.setTextSize(2, 16.0f);
        this.f23814e.setVisibility(0);
        this.f23814e.setTextColor(-1);
        this.f23814e.setEnabled(true);
        TextView textView = this.f23814e;
        int i = this.f23830u;
        textView.setPadding(i, i, i, i);
        C10059y8.m29832a(this.f23814e, -2013265920, -1, -1, this.f23815f.mo65778b(1), this.f23815f.mo65778b(4));
        this.f23809I = true;
    }

    public void destroy() {
        this.f23819j.mo63872a();
    }

    /* renamed from: e */
    public void mo63949e() {
        this.f23802B = 0;
        this.f23816g.setVisibility(8);
        this.f23824o.setVisibility(8);
        this.f23823n.setVisibility(8);
        this.f23818i.setVisibility(8);
    }

    /* renamed from: f */
    public boolean mo63711f() {
        return this.f23819j.mo63881c();
    }

    /* renamed from: g */
    public void mo63712g() {
        this.f23819j.mo63888h();
        mo63953l();
    }

    public View getCloseButton() {
        return this.f23814e;
    }

    public C9662d7 getPromoMediaView() {
        return this.f23819j;
    }

    public View getView() {
        return this;
    }

    /* renamed from: h */
    public void mo63714h() {
        this.f23821l.setVisibility(8);
        mo63954m();
    }

    /* renamed from: i */
    public final void mo63950i() {
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        int i = this.f23830u;
        this.f23819j.setOnClickListener(this.f23827r);
        this.f23819j.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f23819j.mo63877b();
        this.f23818i.setBackgroundColor(-1728053248);
        this.f23818i.setVisibility(8);
        this.f23814e.setTextSize(2, 16.0f);
        this.f23814e.setTransformationMethod((TransformationMethod) null);
        this.f23814e.setEllipsize(TextUtils.TruncateAt.END);
        this.f23814e.setVisibility(8);
        if (Build.VERSION.SDK_INT >= 17) {
            this.f23814e.setTextAlignment(4);
        }
        this.f23814e.setTextColor(-1);
        C10059y8.m29832a(this.f23814e, -2013265920, -1, -1, this.f23815f.mo65778b(1), this.f23815f.mo65778b(4));
        this.f23811b.setMaxLines(2);
        this.f23811b.setEllipsize(TextUtils.TruncateAt.END);
        this.f23811b.setTextSize(2, 18.0f);
        this.f23811b.setTextColor(-1);
        C10059y8.m29832a(this.f23813d, -2013265920, -1, -1, this.f23815f.mo65778b(1), this.f23815f.mo65778b(4));
        this.f23813d.setTextColor(-1);
        this.f23813d.setTransformationMethod((TransformationMethod) null);
        this.f23813d.setGravity(1);
        this.f23813d.setTextSize(2, 16.0f);
        this.f23813d.setMinimumWidth(this.f23815f.mo65778b(100));
        this.f23813d.setPadding(i, i, i, i);
        this.f23811b.setShadowLayer((float) this.f23815f.mo65778b(1), (float) this.f23815f.mo65778b(1), (float) this.f23815f.mo65778b(1), ViewCompat.MEASURED_STATE_MASK);
        this.f23820k.setTextColor(-3355444);
        this.f23820k.setMaxEms(10);
        this.f23820k.setShadowLayer((float) this.f23815f.mo65778b(1), (float) this.f23815f.mo65778b(1), (float) this.f23815f.mo65778b(1), ViewCompat.MEASURED_STATE_MASK);
        this.f23816g.setOnClickListener(this.f23828s);
        this.f23816g.setGravity(17);
        this.f23816g.setVisibility(8);
        this.f23816g.setPadding(this.f23815f.mo65778b(8), 0, this.f23815f.mo65778b(8), 0);
        this.f23817h.setSingleLine();
        this.f23817h.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView = this.f23817h;
        textView.setTypeface(textView.getTypeface(), 1);
        this.f23817h.setTextColor(-1);
        this.f23817h.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.f23815f.mo65778b(4);
        this.f23825p.setPadding(this.f23815f.mo65778b(16), this.f23815f.mo65778b(16), this.f23815f.mo65778b(16), this.f23815f.mo65778b(16));
        this.f23823n.setOnClickListener(this.f23828s);
        this.f23823n.setVisibility(8);
        this.f23823n.setPadding(this.f23815f.mo65778b(16), this.f23815f.mo65778b(16), this.f23815f.mo65778b(16), this.f23815f.mo65778b(16));
        this.f23824o.setOnClickListener(this.f23828s);
        this.f23824o.setVisibility(8);
        this.f23824o.setPadding(this.f23815f.mo65778b(16), this.f23815f.mo65778b(16), this.f23815f.mo65778b(16), this.f23815f.mo65778b(16));
        Bitmap c = C9920q5.m29093c(getContext());
        if (c != null) {
            this.f23824o.setImageBitmap(c);
        }
        Bitmap b = C9920q5.m29092b(getContext());
        if (b != null) {
            this.f23823n.setImageBitmap(b);
        }
        C10059y8.m29832a(this.f23823n, -2013265920, -1, -1, this.f23815f.mo65778b(1), this.f23815f.mo65778b(4));
        C10059y8.m29832a(this.f23824o, -2013265920, -1, -1, this.f23815f.mo65778b(1), this.f23815f.mo65778b(4));
        C10059y8.m29832a(this.f23825p, -2013265920, -1, -1, this.f23815f.mo65778b(1), this.f23815f.mo65778b(4));
        this.f23812c.setStarSize(this.f23815f.mo65778b(12));
        this.f23821l.setVisibility(8);
        this.f23829t.setFixedHeight(this.f23806F);
        addView(this.f23819j);
        addView(this.f23818i);
        addView(this.f23822m);
        addView(this.f23814e);
        addView(this.f23821l);
        addView(this.f23816g);
        addView(this.f23823n);
        addView(this.f23824o);
        addView(this.f23812c);
        addView(this.f23820k);
        addView(this.f23813d);
        addView(this.f23811b);
        addView(this.f23829t);
        this.f23816g.addView(this.f23825p);
        this.f23816g.addView(this.f23817h, layoutParams);
    }

    /* renamed from: j */
    public final void mo63951j() {
        this.f23802B = 2;
        this.f23816g.setVisibility(8);
        this.f23824o.setVisibility(8);
        this.f23823n.setVisibility(0);
        this.f23818i.setVisibility(8);
    }

    /* renamed from: k */
    public final void mo63952k() {
        this.f23802B = 1;
        this.f23816g.setVisibility(8);
        this.f23824o.setVisibility(0);
        this.f23823n.setVisibility(8);
        this.f23818i.setVisibility(0);
    }

    /* renamed from: l */
    public final void mo63953l() {
        this.f23816g.setVisibility(8);
        this.f23824o.setVisibility(8);
        if (this.f23802B != 2) {
            this.f23823n.setVisibility(8);
        }
    }

    /* renamed from: m */
    public final void mo63954m() {
        this.f23802B = 4;
        if (this.f23805E) {
            this.f23816g.setVisibility(0);
            this.f23818i.setVisibility(0);
        }
        this.f23824o.setVisibility(8);
        this.f23823n.setVisibility(8);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = this.f23819j.getMeasuredWidth();
        int measuredHeight = this.f23819j.getMeasuredHeight();
        int i7 = (i5 - measuredWidth) >> 1;
        int i8 = (i6 - measuredHeight) >> 1;
        this.f23819j.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
        this.f23818i.layout(this.f23819j.getLeft(), this.f23819j.getTop(), this.f23819j.getRight(), this.f23819j.getBottom());
        int measuredWidth2 = this.f23824o.getMeasuredWidth();
        int i9 = i3 >> 1;
        int i10 = measuredWidth2 >> 1;
        int i11 = i4 >> 1;
        int measuredHeight2 = this.f23824o.getMeasuredHeight() >> 1;
        this.f23824o.layout(i9 - i10, i11 - measuredHeight2, i10 + i9, measuredHeight2 + i11);
        int measuredWidth3 = this.f23823n.getMeasuredWidth();
        int i12 = measuredWidth3 >> 1;
        int measuredHeight3 = this.f23823n.getMeasuredHeight() >> 1;
        this.f23823n.layout(i9 - i12, i11 - measuredHeight3, i12 + i9, measuredHeight3 + i11);
        int measuredWidth4 = this.f23816g.getMeasuredWidth();
        int i13 = measuredWidth4 >> 1;
        int measuredHeight4 = this.f23816g.getMeasuredHeight() >> 1;
        this.f23816g.layout(i9 - i13, i11 - measuredHeight4, i9 + i13, i11 + measuredHeight4);
        TextView textView = this.f23814e;
        int i14 = this.f23830u;
        textView.layout(i14, i14, textView.getMeasuredWidth() + i14, this.f23830u + this.f23814e.getMeasuredHeight());
        if (i5 > i6) {
            int max = Math.max(this.f23813d.getMeasuredHeight(), Math.max(this.f23811b.getMeasuredHeight(), this.f23812c.getMeasuredHeight()));
            Button button = this.f23813d;
            int measuredWidth5 = (i5 - this.f23830u) - button.getMeasuredWidth();
            int measuredHeight5 = ((i6 - this.f23830u) - this.f23813d.getMeasuredHeight()) - ((max - this.f23813d.getMeasuredHeight()) >> 1);
            int i15 = this.f23830u;
            button.layout(measuredWidth5, measuredHeight5, i5 - i15, (i6 - i15) - ((max - this.f23813d.getMeasuredHeight()) >> 1));
            this.f23822m.layout((this.f23813d.getRight() - this.f23822m.getMeasuredWidth()) + this.f23822m.getPadding(), (((this.f23819j.getBottom() - (this.f23830u << 1)) - this.f23822m.getMeasuredHeight()) - max) + this.f23822m.getPadding(), this.f23813d.getRight() + this.f23822m.getPadding(), ((this.f23819j.getBottom() - (this.f23830u << 1)) - max) + this.f23822m.getPadding());
            this.f23829t.layout(this.f23813d.getRight() - this.f23829t.getMeasuredWidth(), this.f23830u, this.f23813d.getRight(), this.f23830u + this.f23829t.getMeasuredHeight());
            StarsRatingView starsRatingView = this.f23812c;
            int left = (this.f23813d.getLeft() - this.f23830u) - this.f23812c.getMeasuredWidth();
            int measuredHeight6 = ((i6 - this.f23830u) - this.f23812c.getMeasuredHeight()) - ((max - this.f23812c.getMeasuredHeight()) >> 1);
            int left2 = this.f23813d.getLeft();
            int i16 = this.f23830u;
            starsRatingView.layout(left, measuredHeight6, left2 - i16, (i6 - i16) - ((max - this.f23812c.getMeasuredHeight()) >> 1));
            TextView textView2 = this.f23820k;
            int left3 = (this.f23813d.getLeft() - this.f23830u) - this.f23820k.getMeasuredWidth();
            int measuredHeight7 = ((i6 - this.f23830u) - this.f23820k.getMeasuredHeight()) - ((max - this.f23820k.getMeasuredHeight()) >> 1);
            int left4 = this.f23813d.getLeft();
            int i17 = this.f23830u;
            textView2.layout(left3, measuredHeight7, left4 - i17, (i6 - i17) - ((max - this.f23820k.getMeasuredHeight()) >> 1));
            int min = Math.min(this.f23812c.getLeft(), this.f23820k.getLeft());
            TextView textView3 = this.f23811b;
            int measuredWidth6 = (min - this.f23830u) - textView3.getMeasuredWidth();
            int measuredHeight8 = ((i6 - this.f23830u) - this.f23811b.getMeasuredHeight()) - ((max - this.f23811b.getMeasuredHeight()) >> 1);
            int i18 = this.f23830u;
            textView3.layout(measuredWidth6, measuredHeight8, min - i18, (i6 - i18) - ((max - this.f23811b.getMeasuredHeight()) >> 1));
            C9862n6 n6Var = this.f23821l;
            int i19 = this.f23830u;
            n6Var.layout(i19, ((i6 - i19) - n6Var.getMeasuredHeight()) - ((max - this.f23821l.getMeasuredHeight()) >> 1), this.f23830u + this.f23821l.getMeasuredWidth(), (i6 - this.f23830u) - ((max - this.f23821l.getMeasuredHeight()) >> 1));
            return;
        }
        this.f23822m.layout(((this.f23819j.getRight() - this.f23830u) - this.f23822m.getMeasuredWidth()) + this.f23822m.getPadding(), ((this.f23819j.getBottom() - this.f23830u) - this.f23822m.getMeasuredHeight()) + this.f23822m.getPadding(), (this.f23819j.getRight() - this.f23830u) + this.f23822m.getPadding(), (this.f23819j.getBottom() - this.f23830u) + this.f23822m.getPadding());
        this.f23829t.layout((this.f23819j.getRight() - this.f23830u) - this.f23829t.getMeasuredWidth(), this.f23819j.getTop() + this.f23830u, this.f23819j.getRight() - this.f23830u, this.f23819j.getTop() + this.f23830u + this.f23829t.getMeasuredHeight());
        int i20 = this.f23830u;
        int measuredHeight9 = this.f23811b.getMeasuredHeight() + this.f23812c.getMeasuredHeight() + this.f23820k.getMeasuredHeight() + this.f23813d.getMeasuredHeight();
        int bottom = getBottom() - this.f23819j.getBottom();
        if ((i20 * 3) + measuredHeight9 > bottom) {
            i20 = (bottom - measuredHeight9) / 3;
        }
        TextView textView4 = this.f23811b;
        int i21 = i5 >> 1;
        textView4.layout(i21 - (textView4.getMeasuredWidth() >> 1), this.f23819j.getBottom() + i20, (this.f23811b.getMeasuredWidth() >> 1) + i21, this.f23819j.getBottom() + i20 + this.f23811b.getMeasuredHeight());
        StarsRatingView starsRatingView2 = this.f23812c;
        starsRatingView2.layout(i21 - (starsRatingView2.getMeasuredWidth() >> 1), this.f23811b.getBottom() + i20, (this.f23812c.getMeasuredWidth() >> 1) + i21, this.f23811b.getBottom() + i20 + this.f23812c.getMeasuredHeight());
        TextView textView5 = this.f23820k;
        textView5.layout(i21 - (textView5.getMeasuredWidth() >> 1), this.f23811b.getBottom() + i20, (this.f23820k.getMeasuredWidth() >> 1) + i21, this.f23811b.getBottom() + i20 + this.f23820k.getMeasuredHeight());
        Button button2 = this.f23813d;
        button2.layout(i21 - (button2.getMeasuredWidth() >> 1), this.f23812c.getBottom() + i20, i21 + (this.f23813d.getMeasuredWidth() >> 1), this.f23812c.getBottom() + i20 + this.f23813d.getMeasuredHeight());
        this.f23821l.layout(this.f23830u, (this.f23819j.getBottom() - this.f23830u) - this.f23821l.getMeasuredHeight(), this.f23830u + this.f23821l.getMeasuredWidth(), this.f23819j.getBottom() - this.f23830u);
    }

    public void onMeasure(int i, int i2) {
        this.f23822m.measure(View.MeasureSpec.makeMeasureSpec(this.f23806F, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23806F, 1073741824));
        this.f23821l.measure(View.MeasureSpec.makeMeasureSpec(this.f23806F, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23806F, 1073741824));
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f23819j.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int i3 = this.f23830u << 1;
        int i4 = size - i3;
        int i5 = size2 - i3;
        this.f23814e.measure(View.MeasureSpec.makeMeasureSpec(i4 / 2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f23829t.measure(View.MeasureSpec.makeMeasureSpec(this.f23806F, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f23806F, Integer.MIN_VALUE));
        this.f23823n.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f23824o.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f23816g.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f23812c.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f23818i.measure(View.MeasureSpec.makeMeasureSpec(this.f23819j.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23819j.getMeasuredHeight(), 1073741824));
        this.f23813d.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f23811b.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f23820k.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        if (size > size2) {
            int measuredWidth = this.f23813d.getMeasuredWidth();
            int measuredWidth2 = this.f23811b.getMeasuredWidth();
            if (this.f23821l.getMeasuredWidth() + measuredWidth2 + Math.max(this.f23812c.getMeasuredWidth(), this.f23820k.getMeasuredWidth()) + measuredWidth + (this.f23830u * 3) > i4) {
                int measuredWidth3 = (i4 - this.f23821l.getMeasuredWidth()) - (this.f23830u * 3);
                int i6 = measuredWidth3 / 3;
                this.f23813d.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.f23812c.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.f23820k.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
                this.f23811b.measure(View.MeasureSpec.makeMeasureSpec(((measuredWidth3 - this.f23813d.getMeasuredWidth()) - this.f23820k.getMeasuredWidth()) - this.f23812c.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            }
        } else {
            int measuredHeight = this.f23811b.getMeasuredHeight() + this.f23812c.getMeasuredHeight() + this.f23820k.getMeasuredHeight() + this.f23813d.getMeasuredHeight();
            int measuredHeight2 = (size2 - this.f23819j.getMeasuredHeight()) / 2;
            int i7 = this.f23830u;
            if (measuredHeight + (i7 * 3) > measuredHeight2) {
                int i8 = i7 / 2;
                this.f23813d.setPadding(i7, i8, i7, i8);
                this.f23813d.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setBanner(C9697f2 f2Var) {
        String str;
        this.f23819j.mo63879b(f2Var, 1);
        C9711g2<VideoData> videoBanner = f2Var.getVideoBanner();
        if (videoBanner != null) {
            this.f23821l.setMax(f2Var.getDuration());
            this.f23805E = videoBanner.isAllowReplay();
            this.f23804D = f2Var.isAllowClose();
            this.f23813d.setText(f2Var.getCtaText());
            this.f23811b.setText(f2Var.getTitle());
            if ("store".equals(f2Var.getNavigationType())) {
                if (f2Var.getRating() > 0.0f) {
                    this.f23812c.setVisibility(0);
                    this.f23812c.setRating(f2Var.getRating());
                } else {
                    this.f23812c.setVisibility(8);
                }
                this.f23820k.setVisibility(8);
            } else {
                this.f23812c.setVisibility(8);
                this.f23820k.setVisibility(0);
                this.f23820k.setText(f2Var.getDomain());
            }
            this.f23807G = videoBanner.getCloseActionText();
            this.f23808H = videoBanner.getCloseDelayActionText();
            this.f23814e.setText(this.f23807G);
            if (videoBanner.isAllowClose() && videoBanner.isAutoPlay()) {
                if (videoBanner.getAllowCloseDelay() > 0.0f) {
                    this.f23803C = videoBanner.getAllowCloseDelay();
                    this.f23814e.setEnabled(false);
                    this.f23814e.setTextColor(-3355444);
                    TextView textView = this.f23814e;
                    int i = this.f23831v;
                    textView.setPadding(i, i, i, i);
                    C10059y8.m29832a(this.f23814e, -2013265920, -2013265920, -3355444, this.f23815f.mo65778b(1), this.f23815f.mo65778b(4));
                    this.f23814e.setTextSize(2, 12.0f);
                } else {
                    TextView textView2 = this.f23814e;
                    int i2 = this.f23830u;
                    textView2.setPadding(i2, i2, i2, i2);
                    this.f23814e.setVisibility(0);
                }
            }
            this.f23817h.setText(videoBanner.getReplayActionText());
            Bitmap d = C9920q5.m29094d(getContext());
            if (d != null) {
                this.f23825p.setImageBitmap(d);
            }
            if (videoBanner.isAutoPlay()) {
                mo63708c(true);
                mo63949e();
            } else {
                mo63952k();
            }
            this.f23834y = videoBanner.getDuration();
            C9720g6 g6Var = this.f23822m;
            g6Var.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C9680e7.this.m27909a(view);
                }
            });
            if (videoBanner.isAutoMute()) {
                g6Var.mo64102a(this.f23833x, false);
                str = "sound_off";
            } else {
                g6Var.mo64102a(this.f23832w, false);
                str = "sound_on";
            }
            g6Var.setContentDescription(str);
            C9894p1 adChoices = f2Var.getAdChoices();
            if (adChoices != null) {
                mo63948a(adChoices);
            } else {
                this.f23829t.setVisibility(8);
            }
        }
    }

    public void setClickArea(C9929r1 r1Var) {
        TextView textView;
        C9672e0.m27882a("Apply click area " + r1Var.mo65320a() + " to view");
        if (r1Var.f24595o) {
            setOnClickListener(this.f23810a);
        }
        C9683c cVar = null;
        if (r1Var.f24589i || r1Var.f24595o) {
            this.f23813d.setOnClickListener(this.f23810a);
        } else {
            this.f23813d.setOnClickListener((View.OnClickListener) null);
            this.f23813d.setEnabled(false);
        }
        if (r1Var.f24583c || r1Var.f24595o) {
            this.f23811b.setOnClickListener(this.f23810a);
        } else {
            this.f23811b.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f24587g || r1Var.f24595o) {
            this.f23812c.setOnClickListener(this.f23810a);
        } else {
            this.f23812c.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f24592l || r1Var.f24595o) {
            textView = this.f23820k;
            cVar = this.f23810a;
        } else {
            textView = this.f23820k;
        }
        textView.setOnClickListener(cVar);
        if (r1Var.f24594n || r1Var.f24595o) {
            setOnClickListener(this.f23810a);
        }
    }

    public void setInterstitialPromoViewListener(C9606a7.C9607a aVar) {
        this.f23835z = aVar;
    }

    public void setMediaListener(C9841m4.C9842a aVar) {
        this.f23801A = aVar;
        this.f23819j.setInterstitialPromoViewListener(aVar);
    }

    public void setTimeChanged(float f) {
        if (!this.f23809I && this.f23804D) {
            float f2 = this.f23803C;
            if (f2 > 0.0f && f2 >= f) {
                if (this.f23814e.getVisibility() != 0) {
                    this.f23814e.setVisibility(0);
                }
                if (this.f23808H != null) {
                    int ceil = (int) Math.ceil((double) (this.f23803C - f));
                    String valueOf = String.valueOf(ceil);
                    if (this.f23803C > 9.0f && ceil <= 9) {
                        valueOf = "0" + valueOf;
                    }
                    this.f23814e.setText(this.f23808H.replace("%d", valueOf));
                }
            }
        }
        if (this.f23821l.getVisibility() != 0) {
            this.f23821l.setVisibility(0);
        }
        this.f23821l.setProgress(f / this.f23834y);
        this.f23821l.setDigit((int) Math.ceil((double) (this.f23834y - f)));
    }
}
