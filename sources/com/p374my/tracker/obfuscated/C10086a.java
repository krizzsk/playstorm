package com.p374my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.tracker.obfuscated.a */
public final class C10086a {

    /* renamed from: a */
    final Map<Activity, Boolean> f25097a = new WeakHashMap();

    /* renamed from: b */
    final Handler f25098b = C10104d.f25156a;

    /* renamed from: c */
    final AtomicBoolean f25099c = new AtomicBoolean();

    /* renamed from: d */
    final C10126m f25100d;

    /* renamed from: e */
    final C10178v0 f25101e;

    /* renamed from: f */
    final C10166r0 f25102f;

    /* renamed from: g */
    final Application f25103g;

    /* renamed from: h */
    final Runnable f25104h;

    /* renamed from: i */
    final Runnable f25105i;

    /* renamed from: j */
    final Runnable f25106j;

    /* renamed from: k */
    long f25107k = 0;

    /* renamed from: l */
    long f25108l = 0;

    /* renamed from: com.my.tracker.obfuscated.a$b */
    private final class C10088b implements Application.ActivityLifecycleCallbacks {
        private C10088b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            C10086a.this.m29934a(activity);
        }

        public void onActivityStopped(Activity activity) {
            C10086a.this.mo66039c(activity);
        }
    }

    private C10086a(C10126m mVar, C10178v0 v0Var, C10166r0 r0Var, Application application) {
        this.f25100d = mVar;
        this.f25101e = v0Var;
        this.f25102f = r0Var;
        this.f25103g = application;
        this.f25104h = new Runnable() {
            public final void run() {
                C10086a.this.m29935b();
            }
        };
        this.f25105i = new Runnable() {
            public final void run() {
                C10086a.this.m29936c();
            }
        };
        this.f25106j = new Runnable() {
            public final void run() {
                C10086a.this.m29937d();
            }
        };
    }

    /* renamed from: a */
    public static C10086a m29933a(C10126m mVar, C10178v0 v0Var, C10166r0 r0Var, Application application) {
        return new C10086a(mVar, v0Var, r0Var, application);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m29935b() {
        if (this.f25099c.get()) {
            mo66042f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m29936c() {
        mo66037a(C10173t0.m30434a((long) this.f25101e.mo66413d()));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m29937d() {
        C10121k0.m30104a((Context) this.f25103g).mo66190c(C10173t0.m30435b(this.f25107k));
    }

    /* renamed from: a */
    public void mo66036a() {
        this.f25103g.registerActivityLifecycleCallbacks(new C10088b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66037a(long j) {
        this.f25098b.removeCallbacks(this.f25104h);
        this.f25099c.set(true);
        this.f25098b.postDelayed(this.f25104h, j);
        this.f25108l = System.currentTimeMillis() + j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void m29934a(Activity activity) {
        if (this.f25097a.put(activity, Boolean.TRUE) == null && this.f25097a.size() <= 1) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f25107k >= C10173t0.m30434a((long) this.f25101e.mo66421h())) {
                this.f25102f.mo66379c();
                if (this.f25101e.mo66428o()) {
                    this.f25100d.mo66256g();
                    mo66037a(C10173t0.m30434a((long) this.f25101e.mo66413d()));
                    return;
                }
            }
            long j = this.f25108l - currentTimeMillis;
            if (j > 0) {
                mo66037a(j);
            } else {
                mo66042f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo66039c(Activity activity) {
        if (this.f25097a.remove(activity) != null && this.f25097a.isEmpty()) {
            this.f25099c.set(false);
            this.f25098b.removeCallbacks(this.f25104h);
            this.f25107k = System.currentTimeMillis();
            C10104d.m30023a(this.f25106j);
        }
    }

    /* renamed from: d */
    public void mo66040d(Activity activity) {
        C10104d.m30025c(new Runnable(activity) {
            public final /* synthetic */ Activity f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C10086a.this.m29934a(this.f$1);
            }
        });
    }

    /* renamed from: e */
    public void mo66041e() {
        if (this.f25099c.get()) {
            C10104d.m30025c(this.f25105i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo66042f() {
        C10175u0.m30440a("ActivityHandler: timer tick for buffering period");
        this.f25100d.mo66228a();
        mo66041e();
    }
}
