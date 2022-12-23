package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.cache.session.C4246c;
import com.fyber.inneractive.sdk.cache.session.C4247d;
import com.fyber.inneractive.sdk.cache.session.enums.C4250a;
import com.fyber.inneractive.sdk.cache.session.enums.C4251b;
import com.fyber.inneractive.sdk.config.C4311i;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.C5384w0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.fyber.inneractive.sdk.config.b */
public class C4263b implements C4311i.C4313b {

    /* renamed from: a */
    public final AtomicBoolean f10581a = new AtomicBoolean(false);

    /* renamed from: b */
    public boolean f10582b = false;

    /* renamed from: c */
    public C5384w0 f10583c;

    /* renamed from: d */
    public final C4274e0 f10584d;

    /* renamed from: e */
    public final Handler f10585e = new Handler(Looper.getMainLooper(), new C4264a());

    /* renamed from: f */
    public final C5384w0.C5386b f10586f;

    /* renamed from: com.fyber.inneractive.sdk.config.b$a */
    public class C4264a implements Handler.Callback {
        public C4264a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 123) {
                return false;
            }
            C4263b bVar = C4263b.this;
            if (bVar.f10581a.compareAndSet(false, true)) {
                if (bVar.f10581a.get() && bVar.f10583c != null) {
                    IAlog.m16699a("startCounting", new Object[0]);
                    bVar.f10583c.mo26486c();
                }
                IAlog.m16699a("Pause signal", new Object[0]);
            }
            return true;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.b$b */
    public class C4265b implements Application.ActivityLifecycleCallbacks {
        public C4265b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
            if (!C4263b.this.f10585e.hasMessages(123) && !C4263b.this.f10581a.get()) {
                C4263b.this.f10585e.sendEmptyMessageDelayed(123, 3000);
            }
        }

        public void onActivityResumed(Activity activity) {
            C4263b.this.f10585e.removeMessages(123);
            C4263b bVar = C4263b.this;
            if (bVar.f10581a.compareAndSet(true, false)) {
                if (bVar.f10582b) {
                    IAlog.m16699a("onActivityResumed: restartSession", new Object[0]);
                    bVar.f10582b = false;
                    C4274e0 e0Var = bVar.f10584d;
                    if (e0Var != null) {
                        C4247d dVar = ((C4271d0) e0Var).f10601a;
                        if (dVar != null) {
                            dVar.mo24252a(dVar.f10498a);
                            C5357n.m16773a(new C4246c(dVar, C4250a.NEW_SESSION, C4251b.NONE));
                        }
                        C4274e0 e0Var2 = bVar.f10584d;
                        ((C4271d0) e0Var2).f10603c.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                        ((C4271d0) bVar.f10584d).f10602b.clear();
                    }
                }
                C5384w0 w0Var = bVar.f10583c;
                if (w0Var != null) {
                    w0Var.f14265d = false;
                    w0Var.f14267f = 0;
                    Handler handler = w0Var.f14264c;
                    if (handler != null) {
                        handler.removeMessages(1932593528);
                    }
                }
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.config.b$c */
    public class C4266c implements C5384w0.C5386b {
        public C4266c() {
        }

        /* renamed from: a */
        public void mo24274a(C5384w0 w0Var) {
            IAlog.m16699a("onVisibleTimeReached: %s", Long.valueOf(System.currentTimeMillis()));
            boolean unused = C4263b.this.f10582b = true;
        }
    }

    public C4263b(C4274e0 e0Var) {
        C4265b bVar = new C4265b();
        this.f10586f = new C4266c();
        this.f10584d = e0Var;
        Application a = C5350l.m16754a();
        if (a != null) {
            a.registerActivityLifecycleCallbacks(bVar);
        }
    }

    public void onGlobalConfigChanged(C4311i iVar, C4310h hVar) {
        C5384w0 w0Var = this.f10583c;
        if (w0Var != null) {
            w0Var.f14265d = false;
            w0Var.f14267f = 0;
            Handler handler = w0Var.f14264c;
            if (handler != null) {
                handler.removeMessages(1932593528);
            }
            C5384w0 w0Var2 = new C5384w0(TimeUnit.MINUTES, (long) hVar.mo24345a("session_duration", 30, 1), this.f10583c.f14267f);
            this.f10583c = w0Var2;
            w0Var2.f14266e = this.f10586f;
        }
        iVar.f10661c.remove(this);
    }
}
