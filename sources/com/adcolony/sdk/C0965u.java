package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.MotionEventCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.adcolony.sdk.u */
class C0965u extends EditText {

    /* renamed from: a */
    private int f775a;

    /* renamed from: b */
    private int f776b;

    /* renamed from: c */
    private int f777c;

    /* renamed from: d */
    private int f778d;

    /* renamed from: e */
    private int f779e;

    /* renamed from: f */
    private int f780f;

    /* renamed from: g */
    private int f781g;

    /* renamed from: h */
    private int f782h;

    /* renamed from: i */
    private int f783i;

    /* renamed from: j */
    private int f784j;

    /* renamed from: k */
    private String f785k;

    /* renamed from: l */
    private String f786l;

    /* renamed from: m */
    private String f787m;

    /* renamed from: n */
    private String f788n;

    /* renamed from: o */
    private C0752c f789o;

    /* renamed from: p */
    private C0841h0 f790p;

    /* renamed from: com.adcolony.sdk.u$a */
    class C0966a implements C0856j0 {
        C0966a() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0965u.this.mo11068c(h0Var)) {
                C0965u.this.mo11066a(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$b */
    class C0967b implements C0856j0 {
        C0967b() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0965u.this.mo11068c(h0Var)) {
                C0965u.this.mo11076k(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$c */
    class C0968c implements C0856j0 {
        C0968c() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0965u.this.mo11068c(h0Var)) {
                C0965u.this.mo11070e(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$d */
    class C0969d implements C0856j0 {
        C0969d() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0965u.this.mo11068c(h0Var)) {
                C0965u.this.mo11071f(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$e */
    class C0970e implements C0856j0 {
        C0970e() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0965u.this.mo11068c(h0Var)) {
                C0965u.this.mo11069d(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$f */
    class C0971f implements C0856j0 {
        C0971f() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0965u.this.mo11068c(h0Var)) {
                C0965u.this.mo11075j(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$g */
    class C0972g implements C0856j0 {
        C0972g() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0965u.this.mo11068c(h0Var)) {
                C0965u.this.mo11072g(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$h */
    class C0973h implements C0856j0 {
        C0973h() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0965u.this.mo11068c(h0Var)) {
                C0965u.this.mo11073h(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$i */
    class C0974i implements C0856j0 {
        C0974i() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0965u.this.mo11068c(h0Var)) {
                C0965u.this.mo11067b(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.u$j */
    class C0975j implements C0856j0 {
        C0975j() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0965u.this.mo11068c(h0Var)) {
                C0965u.this.mo11074i(h0Var);
            }
        }
    }

    C0965u(Context context, C0841h0 h0Var, int i, C0752c cVar) {
        super(context);
        this.f775a = i;
        this.f790p = h0Var;
        this.f789o = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo11064a(boolean z, int i) {
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
    public void mo11066a(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        this.f783i = C0764c0.m332d(a, "x");
        this.f784j = C0764c0.m332d(a, "y");
        setGravity(mo11064a(true, this.f783i) | mo11064a(false, this.f784j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11067b(C0841h0 h0Var) {
        C0823f1 b = C0764c0.m322b();
        C0764c0.m319a(b, "text", getText().toString());
        h0Var.mo10773a(b).mo10776c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo11068c(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        return C0764c0.m332d(a, "id") == this.f775a && C0764c0.m332d(a, "container_id") == this.f789o.mo10572c() && C0764c0.m336h(a, "ad_session_id").equals(this.f789o.mo10563a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo11069d(C0841h0 h0Var) {
        String h = C0764c0.m336h(h0Var.mo10772a(), "background_color");
        this.f786l = h;
        setBackgroundColor(C1038z0.m1215f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo11070e(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        this.f776b = C0764c0.m332d(a, "x");
        this.f777c = C0764c0.m332d(a, "y");
        this.f778d = C0764c0.m332d(a, "width");
        this.f779e = C0764c0.m332d(a, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f776b, this.f777c, 0, 0);
        layoutParams.width = this.f778d;
        layoutParams.height = this.f779e;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo11071f(C0841h0 h0Var) {
        String h = C0764c0.m336h(h0Var.mo10772a(), "font_color");
        this.f787m = h;
        setTextColor(C1038z0.m1215f(h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo11072g(C0841h0 h0Var) {
        int d = C0764c0.m332d(h0Var.mo10772a(), ViewHierarchyConstants.TEXT_SIZE);
        this.f782h = d;
        setTextSize((float) d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo11073h(C0841h0 h0Var) {
        int d = C0764c0.m332d(h0Var.mo10772a(), "font_style");
        this.f780f = d;
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
    public void mo11074i(C0841h0 h0Var) {
        String h = C0764c0.m336h(h0Var.mo10772a(), "text");
        this.f788n = h;
        setText(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo11075j(C0841h0 h0Var) {
        int d = C0764c0.m332d(h0Var.mo10772a(), "font_family");
        this.f781g = d;
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
    public void mo11076k(C0841h0 h0Var) {
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
        C0764c0.m326b(b2, "view_id", this.f775a);
        C0764c0.m319a(b2, "ad_session_id", this.f785k);
        C0764c0.m326b(b2, "container_x", this.f776b + x);
        C0764c0.m326b(b2, "container_y", this.f777c + y);
        C0764c0.m326b(b2, "view_x", x);
        C0764c0.m326b(b2, "view_y", y);
        C0764c0.m326b(b2, "id", this.f789o.mo10572c());
        if (action == 0) {
            new C0841h0("AdContainer.on_touch_began", this.f789o.mo10591k(), b2).mo10776c();
        } else if (action == 1) {
            if (!this.f789o.mo10598p()) {
                b.mo10817a(c.mo10658d().get(this.f785k));
            }
            new C0841h0("AdContainer.on_touch_ended", this.f789o.mo10591k(), b2).mo10776c();
        } else if (action == 2) {
            new C0841h0("AdContainer.on_touch_moved", this.f789o.mo10591k(), b2).mo10776c();
        } else if (action == 3) {
            new C0841h0("AdContainer.on_touch_cancelled", this.f789o.mo10591k(), b2).mo10776c();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            C0764c0.m326b(b2, "container_x", ((int) motionEvent2.getX(action2)) + this.f776b);
            C0764c0.m326b(b2, "container_y", ((int) motionEvent2.getY(action2)) + this.f777c);
            C0764c0.m326b(b2, "view_x", (int) motionEvent2.getX(action2));
            C0764c0.m326b(b2, "view_y", (int) motionEvent2.getY(action2));
            new C0841h0("AdContainer.on_touch_began", this.f789o.mo10591k(), b2).mo10776c();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            C0764c0.m326b(b2, "container_x", ((int) motionEvent2.getX(action3)) + this.f776b);
            C0764c0.m326b(b2, "container_y", ((int) motionEvent2.getY(action3)) + this.f777c);
            C0764c0.m326b(b2, "view_x", (int) motionEvent2.getX(action3));
            C0764c0.m326b(b2, "view_y", (int) motionEvent2.getY(action3));
            if (!this.f789o.mo10598p()) {
                b.mo10817a(c.mo10658d().get(this.f785k));
            }
            new C0841h0("AdContainer.on_touch_ended", this.f789o.mo10591k(), b2).mo10776c();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11065a() {
        C0823f1 a = this.f790p.mo10772a();
        this.f785k = C0764c0.m336h(a, "ad_session_id");
        this.f776b = C0764c0.m332d(a, "x");
        this.f777c = C0764c0.m332d(a, "y");
        this.f778d = C0764c0.m332d(a, "width");
        this.f779e = C0764c0.m332d(a, "height");
        this.f781g = C0764c0.m332d(a, "font_family");
        this.f780f = C0764c0.m332d(a, "font_style");
        this.f782h = C0764c0.m332d(a, ViewHierarchyConstants.TEXT_SIZE);
        this.f786l = C0764c0.m336h(a, "background_color");
        this.f787m = C0764c0.m336h(a, "font_color");
        this.f788n = C0764c0.m336h(a, "text");
        this.f783i = C0764c0.m332d(a, "align_x");
        this.f784j = C0764c0.m332d(a, "align_y");
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f778d, this.f779e);
        layoutParams.setMargins(this.f776b, this.f777c, 0, 0);
        layoutParams.gravity = 0;
        this.f789o.addView(this, layoutParams);
        int i = this.f781g;
        if (i == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (i == 1) {
            setTypeface(Typeface.SERIF);
        } else if (i == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (i == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
        int i2 = this.f780f;
        if (i2 == 0) {
            setTypeface(getTypeface(), 0);
        } else if (i2 == 1) {
            setTypeface(getTypeface(), 1);
        } else if (i2 == 2) {
            setTypeface(getTypeface(), 2);
        } else if (i2 == 3) {
            setTypeface(getTypeface(), 3);
        }
        setText(this.f788n);
        setTextSize((float) this.f782h);
        setGravity(mo11064a(true, this.f783i) | mo11064a(false, this.f784j));
        if (!this.f786l.equals("")) {
            setBackgroundColor(C1038z0.m1215f(this.f786l));
        }
        if (!this.f787m.equals("")) {
            setTextColor(C1038z0.m1215f(this.f787m));
        }
        this.f789o.mo10587i().add(C0714a.m130a("TextView.set_visible", (C0856j0) new C0967b(), true));
        this.f789o.mo10587i().add(C0714a.m130a("TextView.set_bounds", (C0856j0) new C0968c(), true));
        this.f789o.mo10587i().add(C0714a.m130a("TextView.set_font_color", (C0856j0) new C0969d(), true));
        this.f789o.mo10587i().add(C0714a.m130a("TextView.set_background_color", (C0856j0) new C0970e(), true));
        this.f789o.mo10587i().add(C0714a.m130a("TextView.set_typeface", (C0856j0) new C0971f(), true));
        this.f789o.mo10587i().add(C0714a.m130a("TextView.set_font_size", (C0856j0) new C0972g(), true));
        this.f789o.mo10587i().add(C0714a.m130a("TextView.set_font_style", (C0856j0) new C0973h(), true));
        this.f789o.mo10587i().add(C0714a.m130a("TextView.get_text", (C0856j0) new C0974i(), true));
        this.f789o.mo10587i().add(C0714a.m130a("TextView.set_text", (C0856j0) new C0975j(), true));
        this.f789o.mo10587i().add(C0714a.m130a("TextView.align", (C0856j0) new C0966a(), true));
        this.f789o.mo10589j().add("TextView.set_visible");
        this.f789o.mo10589j().add("TextView.set_bounds");
        this.f789o.mo10589j().add("TextView.set_font_color");
        this.f789o.mo10589j().add("TextView.set_background_color");
        this.f789o.mo10589j().add("TextView.set_typeface");
        this.f789o.mo10589j().add("TextView.set_font_size");
        this.f789o.mo10589j().add("TextView.set_font_style");
        this.f789o.mo10589j().add("TextView.get_text");
        this.f789o.mo10589j().add("TextView.set_text");
        this.f789o.mo10589j().add("TextView.align");
    }
}
