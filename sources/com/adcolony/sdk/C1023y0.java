package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.MotionEventCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.adcolony.sdk.y0 */
class C1023y0 extends Button {

    /* renamed from: a */
    private int f874a;

    /* renamed from: b */
    private int f875b;

    /* renamed from: c */
    private int f876c;

    /* renamed from: d */
    private int f877d;

    /* renamed from: e */
    private int f878e;

    /* renamed from: f */
    private int f879f;

    /* renamed from: g */
    private int f880g;

    /* renamed from: h */
    private int f881h;

    /* renamed from: i */
    private int f882i;

    /* renamed from: j */
    private int f883j;

    /* renamed from: k */
    private String f884k;

    /* renamed from: l */
    private String f885l;

    /* renamed from: m */
    private String f886m;

    /* renamed from: n */
    private String f887n;

    /* renamed from: o */
    private C0752c f888o;

    /* renamed from: p */
    private C0841h0 f889p;

    /* renamed from: com.adcolony.sdk.y0$a */
    class C1024a implements C0856j0 {
        C1024a() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C1023y0.this.mo11137c(h0Var)) {
                C1023y0.this.mo11135a(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$b */
    class C1025b implements C0856j0 {
        C1025b() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C1023y0.this.mo11137c(h0Var)) {
                C1023y0.this.mo11145k(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$c */
    class C1026c implements C0856j0 {
        C1026c() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C1023y0.this.mo11137c(h0Var)) {
                C1023y0.this.mo11139e(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$d */
    class C1027d implements C0856j0 {
        C1027d() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C1023y0.this.mo11137c(h0Var)) {
                C1023y0.this.mo11140f(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$e */
    class C1028e implements C0856j0 {
        C1028e() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C1023y0.this.mo11137c(h0Var)) {
                C1023y0.this.mo11138d(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$f */
    class C1029f implements C0856j0 {
        C1029f() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C1023y0.this.mo11137c(h0Var)) {
                C1023y0.this.mo11144j(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$g */
    class C1030g implements C0856j0 {
        C1030g() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C1023y0.this.mo11137c(h0Var)) {
                C1023y0.this.mo11141g(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$h */
    class C1031h implements C0856j0 {
        C1031h() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C1023y0.this.mo11137c(h0Var)) {
                C1023y0.this.mo11142h(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$i */
    class C1032i implements C0856j0 {
        C1032i() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C1023y0.this.mo11137c(h0Var)) {
                C1023y0.this.mo11136b(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.y0$j */
    class C1033j implements C0856j0 {
        C1033j() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C1023y0.this.mo11137c(h0Var)) {
                C1023y0.this.mo11143i(h0Var);
            }
        }
    }

    C1023y0(Context context, C0841h0 h0Var, int i, C0752c cVar) {
        super(context);
        this.f874a = i;
        this.f889p = h0Var;
        this.f888o = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo11133a(boolean z, int i) {
        if (i == 0) {
            return z ? 1 : 16;
        }
        if (i != 1) {
            if (i != 2) {
                return 17;
            }
            if (z) {
                return GravityCompat.END;
            }
            return 80;
        } else if (z) {
            return GravityCompat.START;
        } else {
            return 48;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11135a(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        this.f882i = C0764c0.m332d(a, "x");
        this.f883j = C0764c0.m332d(a, "y");
        setGravity(mo11133a(true, this.f882i) | mo11133a(false, this.f883j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11136b(C0841h0 h0Var) {
        C0823f1 b = C0764c0.m322b();
        C0764c0.m319a(b, "text", getText().toString());
        h0Var.mo10773a(b).mo10776c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo11137c(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        return C0764c0.m332d(a, "id") == this.f874a && C0764c0.m332d(a, "container_id") == this.f888o.mo10572c() && C0764c0.m336h(a, "ad_session_id").equals(this.f888o.mo10563a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo11138d(C0841h0 h0Var) {
        String h = C0764c0.m336h(h0Var.mo10772a(), "background_color");
        this.f884k = h;
        setBackgroundColor(C1038z0.m1215f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo11139e(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        this.f875b = C0764c0.m332d(a, "x");
        this.f876c = C0764c0.m332d(a, "y");
        this.f877d = C0764c0.m332d(a, "width");
        this.f878e = C0764c0.m332d(a, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f875b, this.f876c, 0, 0);
        layoutParams.width = this.f877d;
        layoutParams.height = this.f878e;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo11140f(C0841h0 h0Var) {
        String h = C0764c0.m336h(h0Var.mo10772a(), "font_color");
        this.f885l = h;
        setTextColor(C1038z0.m1215f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo11141g(C0841h0 h0Var) {
        int d = C0764c0.m332d(h0Var.mo10772a(), ViewHierarchyConstants.TEXT_SIZE);
        this.f881h = d;
        setTextSize((float) d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo11142h(C0841h0 h0Var) {
        int d = C0764c0.m332d(h0Var.mo10772a(), "font_style");
        this.f879f = d;
        if (d == 0) {
            setTypeface(getTypeface(), 0);
        } else if (d == 1) {
            setTypeface(getTypeface(), 1);
        } else if (d == 2) {
            setTypeface(getTypeface(), 2);
        } else if (d == 3) {
            setTypeface(getTypeface(), 3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo11143i(C0841h0 h0Var) {
        String h = C0764c0.m336h(h0Var.mo10772a(), "text");
        this.f886m = h;
        setText(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo11144j(C0841h0 h0Var) {
        int d = C0764c0.m332d(h0Var.mo10772a(), "font_family");
        this.f880g = d;
        if (d == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (d == 1) {
            setTypeface(Typeface.SERIF);
        } else if (d == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (d == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo11145k(C0841h0 h0Var) {
        if (C0764c0.m325b(h0Var.mo10772a(), TJAdUnitConstants.String.VISIBLE)) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        C0857k b = C0714a.m136b();
        C0781d c = b.mo10827c();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C0823f1 b2 = C0764c0.m322b();
        C0764c0.m326b(b2, "view_id", this.f874a);
        C0764c0.m319a(b2, "ad_session_id", this.f887n);
        C0764c0.m326b(b2, "container_x", this.f875b + x);
        C0764c0.m326b(b2, "container_y", this.f876c + y);
        C0764c0.m326b(b2, "view_x", x);
        C0764c0.m326b(b2, "view_y", y);
        C0764c0.m326b(b2, "id", this.f888o.getId());
        if (action != 0) {
            int i = y;
            if (action == 1) {
                if (!this.f888o.mo10598p()) {
                    b.mo10817a(c.mo10658d().get(this.f887n));
                }
                if (x <= 0 || x >= getWidth() || i <= 0 || i >= getHeight()) {
                    new C0841h0("AdContainer.on_touch_cancelled", this.f888o.mo10591k(), b2).mo10776c();
                } else {
                    new C0841h0("AdContainer.on_touch_ended", this.f888o.mo10591k(), b2).mo10776c();
                }
            } else if (action == 2) {
                new C0841h0("AdContainer.on_touch_moved", this.f888o.mo10591k(), b2).mo10776c();
            } else if (action == 3) {
                new C0841h0("AdContainer.on_touch_cancelled", this.f888o.mo10591k(), b2).mo10776c();
            } else if (action == 5) {
                int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                C0764c0.m326b(b2, "container_x", ((int) motionEvent2.getX(action2)) + this.f875b);
                C0764c0.m326b(b2, "container_y", ((int) motionEvent2.getY(action2)) + this.f876c);
                C0764c0.m326b(b2, "view_x", (int) motionEvent2.getX(action2));
                C0764c0.m326b(b2, "view_y", (int) motionEvent2.getY(action2));
                new C0841h0("AdContainer.on_touch_began", this.f888o.mo10591k(), b2).mo10776c();
            } else if (action != 6) {
                return true;
            } else {
                int action3 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                int x2 = (int) motionEvent2.getX(action3);
                int y2 = (int) motionEvent2.getY(action3);
                C0764c0.m326b(b2, "container_x", ((int) motionEvent2.getX(action3)) + this.f875b);
                C0764c0.m326b(b2, "container_y", ((int) motionEvent2.getY(action3)) + this.f876c);
                C0764c0.m326b(b2, "view_x", (int) motionEvent2.getX(action3));
                C0764c0.m326b(b2, "view_y", (int) motionEvent2.getY(action3));
                if (!this.f888o.mo10598p()) {
                    b.mo10817a(c.mo10658d().get(this.f887n));
                }
                if (x2 <= 0 || x2 >= getWidth() || y2 <= 0 || y2 >= getHeight()) {
                    new C0841h0("AdContainer.on_touch_cancelled", this.f888o.mo10591k(), b2).mo10776c();
                } else {
                    new C0841h0("AdContainer.on_touch_ended", this.f888o.mo10591k(), b2).mo10776c();
                }
            }
        } else {
            new C0841h0("AdContainer.on_touch_began", this.f888o.mo10591k(), b2).mo10776c();
        }
        return true;
    }

    C1023y0(Context context, int i, C0841h0 h0Var, int i2, C0752c cVar) {
        super(context, (AttributeSet) null, i);
        this.f874a = i2;
        this.f889p = h0Var;
        this.f888o = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11134a() {
        FrameLayout.LayoutParams layoutParams;
        int i;
        int i2;
        C0823f1 a = this.f889p.mo10772a();
        this.f887n = C0764c0.m336h(a, "ad_session_id");
        this.f875b = C0764c0.m332d(a, "x");
        this.f876c = C0764c0.m332d(a, "y");
        this.f877d = C0764c0.m332d(a, "width");
        this.f878e = C0764c0.m332d(a, "height");
        this.f880g = C0764c0.m332d(a, "font_family");
        this.f879f = C0764c0.m332d(a, "font_style");
        this.f881h = C0764c0.m332d(a, ViewHierarchyConstants.TEXT_SIZE);
        this.f884k = C0764c0.m336h(a, "background_color");
        this.f885l = C0764c0.m336h(a, "font_color");
        this.f886m = C0764c0.m336h(a, "text");
        this.f882i = C0764c0.m332d(a, "align_x");
        this.f883j = C0764c0.m332d(a, "align_y");
        C0857k b = C0714a.m136b();
        if (this.f886m.equals("")) {
            this.f886m = "Learn More";
        }
        setVisibility(4);
        if (C0764c0.m325b(a, "wrap_content")) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f877d, this.f878e);
        }
        layoutParams.gravity = 0;
        setText(this.f886m);
        setTextSize((float) this.f881h);
        if (C0764c0.m325b(a, "overlay")) {
            this.f875b = 0;
            this.f876c = 0;
            i2 = (int) (b.mo10843n().mo10996s() * 6.0f);
            i = (int) (b.mo10843n().mo10996s() * 6.0f);
            int s = (int) (b.mo10843n().mo10996s() * 4.0f);
            setPadding(s, s, s, s);
            layoutParams.gravity = 8388693;
        } else {
            i2 = 0;
            i = 0;
        }
        layoutParams.setMargins(this.f875b, this.f876c, i2, i);
        this.f888o.addView(this, layoutParams);
        int i3 = this.f880g;
        if (i3 == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (i3 == 1) {
            setTypeface(Typeface.SERIF);
        } else if (i3 == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (i3 == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
        int i4 = this.f879f;
        if (i4 == 0) {
            setTypeface(getTypeface(), 0);
        } else if (i4 == 1) {
            setTypeface(getTypeface(), 1);
        } else if (i4 == 2) {
            setTypeface(getTypeface(), 2);
        } else if (i4 == 3) {
            setTypeface(getTypeface(), 3);
        }
        setGravity(mo11133a(true, this.f882i) | mo11133a(false, this.f883j));
        if (!this.f884k.equals("")) {
            setBackgroundColor(C1038z0.m1215f(this.f884k));
        }
        if (!this.f885l.equals("")) {
            setTextColor(C1038z0.m1215f(this.f885l));
        }
        this.f888o.mo10587i().add(C0714a.m130a("TextView.set_visible", (C0856j0) new C1025b(), true));
        this.f888o.mo10587i().add(C0714a.m130a("TextView.set_bounds", (C0856j0) new C1026c(), true));
        this.f888o.mo10587i().add(C0714a.m130a("TextView.set_font_color", (C0856j0) new C1027d(), true));
        this.f888o.mo10587i().add(C0714a.m130a("TextView.set_background_color", (C0856j0) new C1028e(), true));
        this.f888o.mo10587i().add(C0714a.m130a("TextView.set_typeface", (C0856j0) new C1029f(), true));
        this.f888o.mo10587i().add(C0714a.m130a("TextView.set_font_size", (C0856j0) new C1030g(), true));
        this.f888o.mo10587i().add(C0714a.m130a("TextView.set_font_style", (C0856j0) new C1031h(), true));
        this.f888o.mo10587i().add(C0714a.m130a("TextView.get_text", (C0856j0) new C1032i(), true));
        this.f888o.mo10587i().add(C0714a.m130a("TextView.set_text", (C0856j0) new C1033j(), true));
        this.f888o.mo10587i().add(C0714a.m130a("TextView.align", (C0856j0) new C1024a(), true));
        this.f888o.mo10589j().add("TextView.set_visible");
        this.f888o.mo10589j().add("TextView.set_bounds");
        this.f888o.mo10589j().add("TextView.set_font_color");
        this.f888o.mo10589j().add("TextView.set_background_color");
        this.f888o.mo10589j().add("TextView.set_typeface");
        this.f888o.mo10589j().add("TextView.set_font_size");
        this.f888o.mo10589j().add("TextView.set_font_style");
        this.f888o.mo10589j().add("TextView.get_text");
        this.f888o.mo10589j().add("TextView.set_text");
        this.f888o.mo10589j().add("TextView.align");
    }
}
