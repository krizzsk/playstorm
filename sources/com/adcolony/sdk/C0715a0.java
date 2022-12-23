package com.adcolony.sdk;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.MotionEventCompat;
import com.tapjoy.TJAdUnitConstants;
import java.io.File;

/* renamed from: com.adcolony.sdk.a0 */
class C0715a0 extends ImageView {

    /* renamed from: a */
    private int f181a;

    /* renamed from: b */
    private int f182b;

    /* renamed from: c */
    private int f183c;

    /* renamed from: d */
    private int f184d;

    /* renamed from: e */
    private int f185e;

    /* renamed from: f */
    private boolean f186f;

    /* renamed from: g */
    private boolean f187g;

    /* renamed from: h */
    private boolean f188h;

    /* renamed from: i */
    private String f189i;

    /* renamed from: j */
    private String f190j;

    /* renamed from: k */
    private C0841h0 f191k;

    /* renamed from: l */
    private C0752c f192l;

    /* renamed from: com.adcolony.sdk.a0$a */
    class C0716a implements C0856j0 {
        C0716a() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0715a0.this.m143a(h0Var)) {
                C0715a0.this.m149d(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a0$b */
    class C0717b implements C0856j0 {
        C0717b() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0715a0.this.m143a(h0Var)) {
                C0715a0.this.m145b(h0Var);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.a0$c */
    class C0718c implements C0856j0 {
        C0718c() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            if (C0715a0.this.m143a(h0Var)) {
                C0715a0.this.m147c(h0Var);
            }
        }
    }

    C0715a0(Context context, C0841h0 h0Var, int i, C0752c cVar) {
        super(context);
        this.f181a = i;
        this.f191k = h0Var;
        this.f192l = cVar;
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
        C0764c0.m326b(b2, "view_id", this.f181a);
        C0764c0.m319a(b2, "ad_session_id", this.f190j);
        C0764c0.m326b(b2, "container_x", this.f182b + x);
        C0764c0.m326b(b2, "container_y", this.f183c + y);
        C0764c0.m326b(b2, "view_x", x);
        C0764c0.m326b(b2, "view_y", y);
        C0764c0.m326b(b2, "id", this.f192l.getId());
        if (action != 0) {
            int i = y;
            if (action == 1) {
                if (!this.f192l.mo10598p()) {
                    b.mo10817a(c.mo10658d().get(this.f190j));
                }
                if (x <= 0 || x >= this.f184d || i <= 0 || i >= this.f185e) {
                    new C0841h0("AdContainer.on_touch_cancelled", this.f192l.mo10591k(), b2).mo10776c();
                } else {
                    new C0841h0("AdContainer.on_touch_ended", this.f192l.mo10591k(), b2).mo10776c();
                }
            } else if (action == 2) {
                new C0841h0("AdContainer.on_touch_moved", this.f192l.mo10591k(), b2).mo10776c();
            } else if (action == 3) {
                new C0841h0("AdContainer.on_touch_cancelled", this.f192l.mo10591k(), b2).mo10776c();
            } else if (action == 5) {
                int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                C0764c0.m326b(b2, "container_x", ((int) motionEvent2.getX(action2)) + this.f182b);
                C0764c0.m326b(b2, "container_y", ((int) motionEvent2.getY(action2)) + this.f183c);
                C0764c0.m326b(b2, "view_x", (int) motionEvent2.getX(action2));
                C0764c0.m326b(b2, "view_y", (int) motionEvent2.getY(action2));
                new C0841h0("AdContainer.on_touch_began", this.f192l.mo10591k(), b2).mo10776c();
            } else if (action != 6) {
                return true;
            } else {
                int action3 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                int x2 = (int) motionEvent2.getX(action3);
                int y2 = (int) motionEvent2.getY(action3);
                C0764c0.m326b(b2, "container_x", ((int) motionEvent2.getX(action3)) + this.f182b);
                C0764c0.m326b(b2, "container_y", ((int) motionEvent2.getY(action3)) + this.f183c);
                C0764c0.m326b(b2, "view_x", (int) motionEvent2.getX(action3));
                C0764c0.m326b(b2, "view_y", (int) motionEvent2.getY(action3));
                if (!this.f192l.mo10598p()) {
                    b.mo10817a(c.mo10658d().get(this.f190j));
                }
                if (x2 <= 0 || x2 >= this.f184d || y2 <= 0 || y2 >= this.f185e) {
                    new C0841h0("AdContainer.on_touch_cancelled", this.f192l.mo10591k(), b2).mo10776c();
                } else {
                    new C0841h0("AdContainer.on_touch_ended", this.f192l.mo10591k(), b2).mo10776c();
                }
            }
        } else {
            new C0841h0("AdContainer.on_touch_began", this.f192l.mo10591k(), b2).mo10776c();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m143a(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        return C0764c0.m332d(a, "id") == this.f181a && C0764c0.m332d(a, "container_id") == this.f192l.mo10572c() && C0764c0.m336h(a, "ad_session_id").equals(this.f192l.mo10563a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m145b(C0841h0 h0Var) {
        C0823f1 a = h0Var.mo10772a();
        this.f182b = C0764c0.m332d(a, "x");
        this.f183c = C0764c0.m332d(a, "y");
        this.f184d = C0764c0.m332d(a, "width");
        this.f185e = C0764c0.m332d(a, "height");
        if (this.f186f) {
            float s = (((float) this.f185e) * C0714a.m136b().mo10843n().mo10996s()) / ((float) getDrawable().getIntrinsicHeight());
            this.f185e = (int) (((float) getDrawable().getIntrinsicHeight()) * s);
            int intrinsicWidth = (int) (((float) getDrawable().getIntrinsicWidth()) * s);
            this.f184d = intrinsicWidth;
            this.f182b -= intrinsicWidth;
            this.f183c -= this.f185e;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f182b, this.f183c, 0, 0);
        layoutParams.width = this.f184d;
        layoutParams.height = this.f185e;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m147c(C0841h0 h0Var) {
        this.f189i = C0764c0.m336h(h0Var.mo10772a(), "filepath");
        setImageURI(Uri.fromFile(new File(this.f189i)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m149d(C0841h0 h0Var) {
        if (C0764c0.m325b(h0Var.mo10772a(), TJAdUnitConstants.String.VISIBLE)) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10467a() {
        FrameLayout.LayoutParams layoutParams;
        int i;
        C0823f1 a = this.f191k.mo10772a();
        this.f190j = C0764c0.m336h(a, "ad_session_id");
        this.f182b = C0764c0.m332d(a, "x");
        this.f183c = C0764c0.m332d(a, "y");
        this.f184d = C0764c0.m332d(a, "width");
        this.f185e = C0764c0.m332d(a, "height");
        this.f189i = C0764c0.m336h(a, "filepath");
        this.f186f = C0764c0.m325b(a, "dpi");
        this.f187g = C0764c0.m325b(a, "invert_y");
        this.f188h = C0764c0.m325b(a, "wrap_content");
        setImageURI(Uri.fromFile(new File(this.f189i)));
        if (this.f186f) {
            float s = (((float) this.f185e) * C0714a.m136b().mo10843n().mo10996s()) / ((float) getDrawable().getIntrinsicHeight());
            this.f185e = (int) (((float) getDrawable().getIntrinsicHeight()) * s);
            int intrinsicWidth = (int) (((float) getDrawable().getIntrinsicWidth()) * s);
            this.f184d = intrinsicWidth;
            this.f182b -= intrinsicWidth;
            if (this.f187g) {
                i = this.f183c + this.f185e;
            } else {
                i = this.f183c - this.f185e;
            }
            this.f183c = i;
        }
        setVisibility(4);
        if (this.f188h) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f184d, this.f185e);
        }
        layoutParams.setMargins(this.f182b, this.f183c, 0, 0);
        layoutParams.gravity = 0;
        this.f192l.addView(this, layoutParams);
        this.f192l.mo10587i().add(C0714a.m130a("ImageView.set_visible", (C0856j0) new C0716a(), true));
        this.f192l.mo10587i().add(C0714a.m130a("ImageView.set_bounds", (C0856j0) new C0717b(), true));
        this.f192l.mo10587i().add(C0714a.m130a("ImageView.set_image", (C0856j0) new C0718c(), true));
        this.f192l.mo10589j().add("ImageView.set_visible");
        this.f192l.mo10589j().add("ImageView.set_bounds");
        this.f192l.mo10589j().add("ImageView.set_image");
    }
}
