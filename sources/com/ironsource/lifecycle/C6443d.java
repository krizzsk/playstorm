package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ironsource.environment.p205e.C6423c;
import com.ironsource.lifecycle.C6440b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ironsource.lifecycle.d */
public final class C6443d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    static AtomicBoolean f16354a = new AtomicBoolean(false);

    /* renamed from: j */
    private static C6443d f16355j = new C6443d();

    /* renamed from: b */
    int f16356b = 0;

    /* renamed from: c */
    int f16357c = 0;

    /* renamed from: d */
    boolean f16358d = true;

    /* renamed from: e */
    boolean f16359e = true;

    /* renamed from: f */
    int f16360f = C6450e.f16371a;
    /* access modifiers changed from: package-private */

    /* renamed from: g */
    public List<C6442c> f16361g = new CopyOnWriteArrayList();

    /* renamed from: h */
    Runnable f16362h = new Runnable() {
        public final void run() {
            C6443d.m19367a(C6443d.this);
            C6443d.this.m19370c();
        }
    };

    /* renamed from: i */
    private String f16363i = "IronsourceLifecycleManager";

    /* renamed from: k */
    private C6440b.C6441a f16364k = new C6440b.C6441a() {
        /* renamed from: a */
        public final void mo35955a(Activity activity) {
            C6443d dVar = C6443d.this;
            dVar.f16356b++;
            if (dVar.f16356b == 1 && dVar.f16359e) {
                C6423c.f16330a.mo35934c(new Runnable() {
                    public final void run() {
                        for (C6442c a : C6443d.this.f16361g) {
                            a.mo35947a();
                        }
                    }
                });
                dVar.f16359e = false;
                dVar.f16360f = C6450e.f16372b;
            }
        }

        /* renamed from: b */
        public final void mo35956b(Activity activity) {
            C6443d dVar = C6443d.this;
            dVar.f16357c++;
            if (dVar.f16357c != 1) {
                return;
            }
            if (dVar.f16358d) {
                C6423c.f16330a.mo35934c(new Runnable() {
                    public final void run() {
                        Iterator it = C6443d.this.f16361g.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                });
                dVar.f16358d = false;
                dVar.f16360f = C6450e.f16373c;
                return;
            }
            C6423c cVar = C6423c.f16330a;
            C6423c.m19279b(dVar.f16362h);
        }
    };

    /* renamed from: a */
    public static C6443d m19366a() {
        return f16355j;
    }

    /* renamed from: a */
    static /* synthetic */ void m19367a(C6443d dVar) {
        if (dVar.f16357c == 0) {
            dVar.f16358d = true;
            C6423c.f16330a.mo35934c(new Runnable() {
                public final void run() {
                    Iterator it = C6443d.this.f16361g.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
            dVar.f16360f = C6450e.f16374d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m19370c() {
        if (this.f16356b == 0 && this.f16358d) {
            C6423c.f16330a.mo35934c(new Runnable() {
                public final void run() {
                    for (C6442c b : C6443d.this.f16361g) {
                        b.mo35948b();
                    }
                }
            });
            this.f16359e = true;
            this.f16360f = C6450e.f16375e;
        }
    }

    /* renamed from: a */
    public final void mo35957a(C6442c cVar) {
        if (IronsourceLifecycleProvider.m19357a() && !this.f16361g.contains(cVar)) {
            this.f16361g.add(cVar);
        }
    }

    /* renamed from: b */
    public final boolean mo35958b() {
        return this.f16360f == C6450e.f16375e;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C6440b.m19361b(activity);
        C6440b a = C6440b.m19360a(activity);
        if (a != null) {
            a.f16353a = this.f16364k;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        int i = this.f16357c - 1;
        this.f16357c = i;
        if (i == 0) {
            C6423c cVar = C6423c.f16330a;
            C6423c.m19277a(this.f16362h, 700);
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
        this.f16356b--;
        m19370c();
    }
}
