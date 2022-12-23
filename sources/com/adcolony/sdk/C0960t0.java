package com.adcolony.sdk;

import android.os.SystemClock;
import com.adcolony.sdk.C0817e0;
import com.tapjoy.TapjoyConstants;
import java.util.LinkedHashMap;

/* renamed from: com.adcolony.sdk.t0 */
class C0960t0 {

    /* renamed from: a */
    private long f756a = TapjoyConstants.SESSION_ID_INACTIVITY_TIME;

    /* renamed from: b */
    private int f757b;

    /* renamed from: c */
    private long f758c;

    /* renamed from: d */
    private boolean f759d = true;

    /* renamed from: e */
    private boolean f760e = true;

    /* renamed from: f */
    private boolean f761f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f762g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f763h = false;

    /* renamed from: i */
    private boolean f764i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f765j;

    /* renamed from: k */
    private boolean f766k;

    /* renamed from: l */
    private C0976u0 f767l;

    /* renamed from: com.adcolony.sdk.t0$a */
    class C0961a implements C0856j0 {
        C0961a() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            boolean unused = C0960t0.this.f765j = true;
        }
    }

    /* renamed from: com.adcolony.sdk.t0$b */
    class C0962b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0890l f769a;

        /* renamed from: b */
        final /* synthetic */ C0857k f770b;

        C0962b(C0960t0 t0Var, C0890l lVar, C0857k kVar) {
            this.f769a = lVar;
            this.f770b = kVar;
        }

        public void run() {
            this.f769a.mo10606b();
            this.f770b.mo10846q().mo10770d();
        }
    }

    /* renamed from: com.adcolony.sdk.t0$c */
    class C0963c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f771a;

        C0963c(boolean z) {
            this.f771a = z;
        }

        public void run() {
            LinkedHashMap<Integer, C0889k0> d = C0714a.m136b().mo10847r().mo10789d();
            synchronized (d) {
                for (C0889k0 next : d.values()) {
                    C0823f1 b = C0764c0.m322b();
                    C0764c0.m328b(b, "from_window_focus", this.f771a);
                    if (C0960t0.this.f763h && !C0960t0.this.f762g) {
                        C0764c0.m328b(b, "app_in_foreground", false);
                        boolean unused = C0960t0.this.f763h = false;
                    }
                    new C0841h0("SessionInfo.on_pause", next.getModuleId(), b).mo10776c();
                }
            }
            C0714a.m141f();
        }
    }

    /* renamed from: com.adcolony.sdk.t0$d */
    class C0964d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f773a;

        C0964d(boolean z) {
            this.f773a = z;
        }

        public void run() {
            C0857k b = C0714a.m136b();
            LinkedHashMap<Integer, C0889k0> d = b.mo10847r().mo10789d();
            synchronized (d) {
                for (C0889k0 next : d.values()) {
                    C0823f1 b2 = C0764c0.m322b();
                    C0764c0.m328b(b2, "from_window_focus", this.f773a);
                    if (C0960t0.this.f763h && C0960t0.this.f762g) {
                        C0764c0.m328b(b2, "app_in_foreground", true);
                        boolean unused = C0960t0.this.f763h = false;
                    }
                    new C0841h0("SessionInfo.on_resume", next.getModuleId(), b2).mo10776c();
                }
            }
            b.mo10846q().mo10770d();
        }
    }

    C0960t0() {
    }

    /* renamed from: h */
    private void m981h() {
        mo11047a(false);
    }

    /* renamed from: i */
    private void m982i() {
        mo11049b(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11051c(boolean z) {
        C0857k b = C0714a.m136b();
        if (!this.f761f) {
            if (this.f764i) {
                b.mo10828c(false);
                this.f764i = false;
            }
            this.f757b = 0;
            this.f758c = SystemClock.uptimeMillis();
            this.f759d = true;
            this.f761f = true;
            this.f762g = true;
            this.f763h = false;
            AdColony.m39c();
            if (z) {
                C0823f1 b2 = C0764c0.m322b();
                C0764c0.m319a(b2, "id", C1038z0.m1178a());
                new C0841h0("SessionInfo.on_start", 1, b2).mo10776c();
                C0890l c = C0714a.m136b().mo10847r().mo10787c();
                if (c != null && !AdColony.m35a((Runnable) new C0962b(this, c, b))) {
                    new C0817e0.C0818a().mo10684a("RejectedExecutionException on controller update.").mo10685a(C0817e0.f434i);
                }
            }
            b.mo10847r().mo10792h();
            C0979v.m1032a().mo11087b();
        }
    }

    /* renamed from: d */
    public void mo11052d() {
        C0714a.m135a("SessionInfo.stopped", (C0856j0) new C0961a());
        this.f767l = new C0976u0(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo11055e() {
        return this.f759d;
    }

    /* renamed from: f */
    public void mo11056f(boolean z) {
        this.f764i = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo11058g(boolean z) {
        this.f766k = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo11060j() {
        C0953s0 a = C0714a.m136b().mo10846q().mo10760a();
        this.f761f = false;
        this.f759d = false;
        if (a != null) {
            a.mo11030b();
        }
        C0823f1 b = C0764c0.m322b();
        C0764c0.m316a(b, "session_length", ((double) (SystemClock.uptimeMillis() - this.f758c)) / 1000.0d);
        new C0841h0("SessionInfo.on_stop", 1, b).mo10776c();
        C0714a.m141f();
        AdColony.m43g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo11054e(boolean z) {
        if (this.f762g != z) {
            this.f762g = z;
            this.f763h = true;
            if (!z) {
                m981h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo11057f() {
        return this.f761f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo11059g() {
        return this.f766k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11047a(boolean z) {
        this.f760e = true;
        this.f767l.mo11078b();
        if (!AdColony.m35a((Runnable) new C0963c(z))) {
            new C0817e0.C0818a().mo10684a("RejectedExecutionException on session pause.").mo10685a(C0817e0.f434i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11049b(boolean z) {
        this.f760e = false;
        this.f767l.mo11079c();
        if (!AdColony.m35a((Runnable) new C0964d(z))) {
            new C0817e0.C0818a().mo10684a("RejectedExecutionException on session resume.").mo10685a(C0817e0.f434i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo11053d(boolean z) {
        if (z && this.f760e) {
            m982i();
        } else if (!z && !this.f760e) {
            m981h();
        }
        this.f759d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo11045a() {
        return this.f756a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11046a(int i) {
        this.f756a = i <= 0 ? this.f756a : (long) (i * 1000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo11048b() {
        return this.f757b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11050c() {
        this.f757b++;
    }
}
