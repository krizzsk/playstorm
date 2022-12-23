package com.p374my.target;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.my.target.a9 */
public class C9609a9 {

    /* renamed from: a */
    public final C9641c3 f23633a;

    /* renamed from: b */
    public final C9611b f23634b = new C9611b();

    /* renamed from: c */
    public final C10008v8 f23635c;

    /* renamed from: d */
    public final boolean f23636d;

    /* renamed from: e */
    public final float f23637e;

    /* renamed from: f */
    public final long f23638f;

    /* renamed from: g */
    public boolean f23639g;

    /* renamed from: h */
    public boolean f23640h;

    /* renamed from: i */
    public long f23641i = 0;

    /* renamed from: j */
    public C9612c f23642j;

    /* renamed from: k */
    public WeakReference<View> f23643k;

    /* renamed from: l */
    public boolean f23644l = false;

    /* renamed from: m */
    public boolean f23645m;

    /* renamed from: com.my.target.a9$b */
    public class C9611b implements Runnable {
        public C9611b() {
        }

        public void run() {
            C9609a9.this.mo63493a();
        }
    }

    /* renamed from: com.my.target.a9$c */
    public static abstract class C9612c {
        /* renamed from: a */
        public void mo63500a() {
        }

        /* renamed from: a */
        public void mo63501a(boolean z) {
        }
    }

    public C9609a9(C10044y1 y1Var, C9641c3 c3Var, boolean z) {
        float b = y1Var.mo65737b();
        this.f23637e = y1Var.mo65739c() * 100.0f;
        this.f23638f = (long) (y1Var.mo65735a() * 1000.0f);
        this.f23633a = c3Var;
        this.f23636d = z;
        this.f23635c = b == 1.0f ? C10008v8.f24831a : C10008v8.m29579a((int) (b * 1000.0f));
    }

    /* renamed from: a */
    public static double m27614a(View view) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null || view.getAlpha() < 0.5f) {
            return 0.0d;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (height <= 0 || width <= 0) {
            return 0.0d;
        }
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            return ((double) (rect.width() * rect.height())) / (((double) (width * height)) / 100.0d);
        }
        return 0.0d;
    }

    /* renamed from: a */
    public static C9609a9 m27615a(C10044y1 y1Var, C9641c3 c3Var) {
        return new C9609a9(y1Var, c3Var, true);
    }

    /* renamed from: a */
    public static C9609a9 m27616a(C10044y1 y1Var, C9641c3 c3Var, boolean z) {
        return new C9609a9(y1Var, c3Var, z);
    }

    /* renamed from: a */
    public void mo63493a() {
        WeakReference<View> weakReference = this.f23643k;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            C9672e0.m27882a("ViewabilityTracker: tracking view disappeared");
            mo63497b();
            return;
        }
        mo63496a(m27614a(view) >= ((double) this.f23637e));
        if (!this.f23639g) {
            if (!this.f23644l) {
                this.f23641i = 0;
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f23641i == 0) {
                this.f23641i = currentTimeMillis;
            }
            if (currentTimeMillis - this.f23641i >= this.f23638f) {
                if (this.f23636d) {
                    mo63497b();
                }
                this.f23639g = true;
                mo63494a(view.getContext());
            }
        }
    }

    /* renamed from: a */
    public final void mo63494a(Context context) {
        C10039x8.m29720c((List<C9626b3>) this.f23633a.mo63675a(TJAdUnitConstants.String.BEACON_SHOW_PATH), context);
        C9612c cVar = this.f23642j;
        if (cVar != null) {
            cVar.mo63500a();
        }
    }

    /* renamed from: a */
    public void mo63495a(C9612c cVar) {
        this.f23642j = cVar;
    }

    /* renamed from: a */
    public final void mo63496a(boolean z) {
        if (this.f23644l != z) {
            this.f23644l = z;
            C9612c cVar = this.f23642j;
            if (cVar != null) {
                cVar.mo63501a(z);
            }
        }
    }

    /* renamed from: b */
    public void mo63497b() {
        this.f23644l = false;
        this.f23645m = false;
        this.f23635c.mo65626b(this.f23634b);
        this.f23643k = null;
    }

    /* renamed from: b */
    public void mo63498b(View view) {
        if (this.f23645m) {
            return;
        }
        if (!this.f23639g || !this.f23636d) {
            this.f23645m = true;
            this.f23641i = 0;
            this.f23643k = new WeakReference<>(view);
            if (!this.f23640h) {
                C10039x8.m29720c((List<C9626b3>) this.f23633a.mo63675a("render"), view.getContext());
                this.f23640h = true;
            }
            mo63493a();
            if (!this.f23639g || !this.f23636d) {
                this.f23635c.mo65624a((Runnable) this.f23634b);
            }
        }
    }
}
