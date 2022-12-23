package com.tapjoy.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.tapjoy.TJContentActivity;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.C11793iy;
import java.util.Iterator;

/* renamed from: com.tapjoy.internal.hf */
public class C11706hf extends C11734hq {

    /* renamed from: h */
    private static final String f28445h = C11706hf.class.getSimpleName();

    /* renamed from: i */
    private static C11706hf f28446i;

    /* renamed from: a */
    final String f28447a;

    /* renamed from: b */
    final C11752ib f28448b;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C11714hj f28449j;

    /* renamed from: k */
    private boolean f28450k;

    /* renamed from: l */
    private boolean f28451l;

    /* renamed from: m */
    private long f28452m;

    /* renamed from: n */
    private Context f28453n;

    /* renamed from: o */
    private C11793iy f28454o;

    /* renamed from: p */
    private Activity f28455p;

    /* renamed from: q */
    private C11716hk f28456q;

    /* renamed from: r */
    private Handler f28457r;

    /* renamed from: s */
    private Runnable f28458s;

    /* renamed from: a */
    public static void m33966a() {
        C11706hf hfVar = f28446i;
        if (hfVar != null) {
            C117071 r1 = new Runnable(hfVar) {

                /* renamed from: a */
                final /* synthetic */ C11706hf f28459a;

                {
                    this.f28459a = r1;
                }

                public final void run() {
                    C11706hf.m33968a(this.f28459a);
                }
            };
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null && mainLooper.getThread() == Thread.currentThread()) {
                r1.run();
            } else {
                C11839t.m34404a().post(r1);
            }
        }
    }

    public C11706hf(C11714hj hjVar, String str, C11752ib ibVar, Context context) {
        this.f28449j = hjVar;
        this.f28447a = str;
        this.f28448b = ibVar;
        this.f28453n = context;
    }

    /* renamed from: b */
    public final void mo72592b() {
        Iterator<C11772ik> it = this.f28448b.f28618a.iterator();
        while (it.hasNext()) {
            Iterator<C11770ij> it2 = it.next().f28690c.iterator();
            while (it2.hasNext()) {
                C11770ij next = it2.next();
                if (next.f28685l != null) {
                    next.f28685l.mo72696b();
                }
                if (next.f28686m != null) {
                    next.f28686m.mo72696b();
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo72593c() {
        Iterator<C11772ik> it = this.f28448b.f28618a.iterator();
        boolean z = true;
        while (it.hasNext()) {
            Iterator<C11770ij> it2 = it.next().f28690c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = true;
                    continue;
                    break;
                }
                C11770ij next = it2.next();
                if ((next.f28685l == null || next.f28685l.mo72695a()) && (next.f28686m == null || next.f28686m.mo72695a())) {
                }
            }
            z = false;
            continue;
            if (!z) {
                return false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo72591a(C11716hk hkVar, C11652fy fyVar) {
        this.f28456q = hkVar;
        Activity a = C11700hb.m33954a();
        this.f28455p = a;
        if (a != null && !a.isFinishing()) {
            try {
                m33967a(this.f28455p, hkVar, fyVar);
                Object[] objArr = new Object[1];
                return;
            } catch (WindowManager.BadTokenException unused) {
            }
        }
        Activity a2 = C11410a.m33201a(this.f28453n);
        this.f28455p = a2;
        if (a2 != null && !a2.isFinishing()) {
            try {
                m33967a(this.f28455p, hkVar, fyVar);
                Class<C11752ib> cls = C11752ib.class;
                Object[] objArr2 = new Object[1];
                return;
            } catch (WindowManager.BadTokenException unused2) {
            }
        }
        C11710hg.m33981b("Failed to show the content for \"{}\". No usable activity found.", this.f28447a);
        hkVar.mo71658a(this.f28447a, this.f28553f, (C11693gv) null);
    }

    /* renamed from: a */
    private void m33967a(final Activity activity, final C11716hk hkVar, C11652fy fyVar) {
        if (this.f28450k) {
            TapjoyLog.m33195e(f28445h, new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "Content is already displayed"));
            return;
        }
        this.f28450k = true;
        this.f28451l = true;
        f28446i = this;
        this.f28554g = fyVar.f28331a;
        this.f28454o = new C11793iy(activity, this.f28448b, new C11793iy.C11796a() {
            /* renamed from: a */
            public final void mo72596a(C11770ij ijVar) {
                C11651fx fxVar;
                if (!(!(C11706hf.this.f28554g instanceof C11651fx) || (fxVar = (C11651fx) C11706hf.this.f28554g) == null || fxVar.f28330b == null)) {
                    fxVar.f28330b.mo72513a();
                }
                C11706hf.this.f28449j.mo72621a(C11706hf.this.f28448b.f28619b, ijVar.f28684k);
                if (!TextUtils.isEmpty(ijVar.f28681h)) {
                    C11706hf.this.f28552e.mo71894a(activity, ijVar.f28681h, C11690gs.m33927b(ijVar.f28682i));
                    C11706hf.this.f28551d = true;
                } else if (!TextUtils.isEmpty(ijVar.f28680g)) {
                    C11734hq.m34095a((Context) activity, ijVar.f28680g);
                }
                hkVar.mo71657a(C11706hf.this.f28447a, (C11693gv) null);
                if (ijVar.f28683j) {
                    C11706hf.m33968a(C11706hf.this);
                }
            }

            /* renamed from: a */
            public final void mo72595a() {
                C11706hf.m33968a(C11706hf.this);
            }
        });
        C11415ac.m33205a(activity.getWindow(), this.f28454o, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f28452m = SystemClock.elapsedRealtime();
        this.f28449j.mo72619a(this.f28448b.f28619b);
        fyVar.mo72523b();
        C11644fs fsVar = this.f28554g;
        if (fsVar != null) {
            fsVar.mo72516b();
        }
        hkVar.mo71660c(this.f28447a);
        if (this.f28448b.f28620c > 0.0f) {
            this.f28457r = new Handler(Looper.getMainLooper());
            C117093 r5 = new Runnable() {
                public final void run() {
                    C11706hf.m33968a(C11706hf.this);
                }
            };
            this.f28458s = r5;
            this.f28457r.postDelayed(r5, (long) (this.f28448b.f28620c * 1000.0f));
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m33968a(C11706hf hfVar) {
        C11716hk hkVar;
        if (hfVar.f28451l) {
            hfVar.f28451l = false;
            Handler handler = hfVar.f28457r;
            if (handler != null) {
                handler.removeCallbacks(hfVar.f28458s);
                hfVar.f28458s = null;
                hfVar.f28457r = null;
            }
            if (f28446i == hfVar) {
                f28446i = null;
            }
            hfVar.f28449j.mo72620a(hfVar.f28448b.f28619b, SystemClock.elapsedRealtime() - hfVar.f28452m);
            if (!hfVar.f28551d && (hkVar = hfVar.f28456q) != null) {
                hkVar.mo71658a(hfVar.f28447a, hfVar.f28553f, (C11693gv) null);
                hfVar.f28456q = null;
            }
            ViewGroup viewGroup = (ViewGroup) hfVar.f28454o.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(hfVar.f28454o);
            }
            hfVar.f28454o = null;
            Activity activity = hfVar.f28455p;
            if (activity instanceof TJContentActivity) {
                activity.finish();
            }
            hfVar.f28455p = null;
        }
    }
}
