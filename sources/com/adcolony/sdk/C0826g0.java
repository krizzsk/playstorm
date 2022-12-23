package com.adcolony.sdk;

import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.g0 */
class C0826g0 {

    /* renamed from: f */
    static boolean f453f = false;

    /* renamed from: g */
    static int f454g = 3;

    /* renamed from: h */
    static int f455h = 1;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0823f1 f456a = C0764c0.m322b();

    /* renamed from: b */
    private C0819e1 f457b = null;

    /* renamed from: c */
    private ExecutorService f458c = null;

    /* renamed from: d */
    private final Queue<Runnable> f459d = new ConcurrentLinkedQueue();

    /* renamed from: e */
    C0953s0 f460e;

    /* renamed from: com.adcolony.sdk.g0$a */
    class C0827a implements C0856j0 {
        C0827a() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0826g0.this.mo10766b(C0764c0.m332d(h0Var.mo10772a(), "module"), 0, C0764c0.m336h(h0Var.mo10772a(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$b */
    class C0828b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f462a;

        /* renamed from: b */
        final /* synthetic */ String f463b;

        /* renamed from: c */
        final /* synthetic */ int f464c;

        /* renamed from: d */
        final /* synthetic */ boolean f465d;

        C0828b(int i, String str, int i2, boolean z) {
            this.f462a = i;
            this.f463b = str;
            this.f464c = i2;
            this.f465d = z;
        }

        public void run() {
            C0826g0.this.m535a(this.f462a, this.f463b, this.f464c);
            int i = 0;
            while (i <= this.f463b.length() / TTAdSdk.INIT_LOCAL_FAIL_CODE) {
                int i2 = i * TTAdSdk.INIT_LOCAL_FAIL_CODE;
                i++;
                int min = Math.min(i * TTAdSdk.INIT_LOCAL_FAIL_CODE, this.f463b.length());
                if (this.f464c == 3) {
                    C0826g0 g0Var = C0826g0.this;
                    if (g0Var.mo10764a(C0764c0.m334f(g0Var.f456a, Integer.toString(this.f462a)), 3, this.f465d)) {
                        Log.d("AdColony [TRACE]", this.f463b.substring(i2, min));
                    }
                }
                if (this.f464c == 2) {
                    C0826g0 g0Var2 = C0826g0.this;
                    if (g0Var2.mo10764a(C0764c0.m334f(g0Var2.f456a, Integer.toString(this.f462a)), 2, this.f465d)) {
                        Log.i("AdColony [INFO]", this.f463b.substring(i2, min));
                    }
                }
                if (this.f464c == 1) {
                    C0826g0 g0Var3 = C0826g0.this;
                    if (g0Var3.mo10764a(C0764c0.m334f(g0Var3.f456a, Integer.toString(this.f462a)), 1, this.f465d)) {
                        Log.w("AdColony [WARNING]", this.f463b.substring(i2, min));
                    }
                }
                if (this.f464c == 0) {
                    C0826g0 g0Var4 = C0826g0.this;
                    if (g0Var4.mo10764a(C0764c0.m334f(g0Var4.f456a, Integer.toString(this.f462a)), 0, this.f465d)) {
                        Log.e("AdColony [ERROR]", this.f463b.substring(i2, min));
                    }
                }
                if (this.f464c == -1 && C0826g0.f454g >= -1) {
                    Log.e("AdColony [FATAL]", this.f463b.substring(i2, min));
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.g0$c */
    class C0829c implements C0856j0 {
        C0829c(C0826g0 g0Var) {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0826g0.f454g = C0764c0.m332d(h0Var.mo10772a(), "level");
        }
    }

    /* renamed from: com.adcolony.sdk.g0$d */
    class C0830d implements C0856j0 {
        C0830d() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0826g0.this.mo10766b(C0764c0.m332d(h0Var.mo10772a(), "module"), 3, C0764c0.m336h(h0Var.mo10772a(), "message"), false);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$e */
    class C0831e implements C0856j0 {
        C0831e() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0826g0.this.mo10766b(C0764c0.m332d(h0Var.mo10772a(), "module"), 3, C0764c0.m336h(h0Var.mo10772a(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$f */
    class C0832f implements C0856j0 {
        C0832f() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0826g0.this.mo10766b(C0764c0.m332d(h0Var.mo10772a(), "module"), 2, C0764c0.m336h(h0Var.mo10772a(), "message"), false);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$g */
    class C0833g implements C0856j0 {
        C0833g() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0826g0.this.mo10766b(C0764c0.m332d(h0Var.mo10772a(), "module"), 2, C0764c0.m336h(h0Var.mo10772a(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$h */
    class C0834h implements C0856j0 {
        C0834h() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0826g0.this.mo10766b(C0764c0.m332d(h0Var.mo10772a(), "module"), 1, C0764c0.m336h(h0Var.mo10772a(), "message"), false);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$i */
    class C0835i implements C0856j0 {
        C0835i() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0826g0.this.mo10766b(C0764c0.m332d(h0Var.mo10772a(), "module"), 1, C0764c0.m336h(h0Var.mo10772a(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$j */
    class C0836j implements C0856j0 {
        C0836j() {
        }

        /* renamed from: a */
        public void mo10469a(C0841h0 h0Var) {
            C0826g0.this.mo10766b(C0764c0.m332d(h0Var.mo10772a(), "module"), 0, C0764c0.m336h(h0Var.mo10772a(), "message"), false);
        }
    }

    C0826g0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10766b(int i, int i2, String str, boolean z) {
        if (!m537a(m534a(i, i2, str, z))) {
            synchronized (this.f459d) {
                this.f459d.add(m534a(i, i2, str, z));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10768c() {
        C0714a.m135a("Log.set_log_level", (C0856j0) new C0829c(this));
        C0714a.m135a("Log.public.trace", (C0856j0) new C0830d());
        C0714a.m135a("Log.private.trace", (C0856j0) new C0831e());
        C0714a.m135a("Log.public.info", (C0856j0) new C0832f());
        C0714a.m135a("Log.private.info", (C0856j0) new C0833g());
        C0714a.m135a("Log.public.warning", (C0856j0) new C0834h());
        C0714a.m135a("Log.private.warning", (C0856j0) new C0835i());
        C0714a.m135a("Log.public.error", (C0856j0) new C0836j());
        C0714a.m135a("Log.private.error", (C0856j0) new C0827a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10770d() {
        ExecutorService executorService = this.f458c;
        if (executorService == null || executorService.isShutdown() || this.f458c.isTerminated()) {
            this.f458c = Executors.newSingleThreadExecutor();
        }
        synchronized (this.f459d) {
            while (!this.f459d.isEmpty()) {
                m537a(this.f459d.poll());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10761a(int i, String str, boolean z) {
        mo10766b(0, i, str, z);
    }

    /* renamed from: a */
    private Runnable m534a(int i, int i2, String str, boolean z) {
        return new C0828b(i, str, i2, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10764a(C0823f1 f1Var, int i, boolean z) {
        int d = C0764c0.m332d(f1Var, "print_level");
        boolean b = C0764c0.m325b(f1Var, "log_private");
        if (f1Var.mo10729b()) {
            d = f454g;
            b = f453f;
        }
        return (!z || b) && d != 4 && d >= i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10767b(C0819e1 e1Var) {
        this.f456a = mo10759a(e1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0819e1 mo10765b() {
        return this.f457b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10763a(C0823f1 f1Var, int i) {
        int d = C0764c0.m332d(f1Var, "send_level");
        if (f1Var.mo10729b()) {
            d = f455h;
        }
        return d >= i && d != 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10762a(HashMap<String, Object> hashMap) {
        try {
            C0953s0 s0Var = new C0953s0(new C0813d0(new URL("https://wd.adcolony.com/logs")), Executors.newSingleThreadScheduledExecutor(), hashMap);
            this.f460e = s0Var;
            s0Var.mo11028a(5, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m535a(int i, String str, int i2) {
        if (this.f460e != null) {
            if (i2 == 3 && mo10763a(C0764c0.m334f(this.f456a, Integer.toString(i)), 3)) {
                this.f460e.mo11029a(str);
            } else if (i2 == 2 && mo10763a(C0764c0.m334f(this.f456a, Integer.toString(i)), 2)) {
                this.f460e.mo11033c(str);
            } else if (i2 == 1 && mo10763a(C0764c0.m334f(this.f456a, Integer.toString(i)), 1)) {
                this.f460e.mo11034d(str);
            } else if (i2 == 0 && mo10763a(C0764c0.m334f(this.f456a, Integer.toString(i)), 0)) {
                this.f460e.mo11032b(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0823f1 mo10759a(C0819e1 e1Var) {
        C0823f1 b = C0764c0.m322b();
        for (int i = 0; i < e1Var.mo10690b(); i++) {
            C0823f1 a = C0764c0.m311a(e1Var, i);
            C0764c0.m318a(b, Integer.toString(C0764c0.m332d(a, "id")), a);
        }
        return b;
    }

    /* renamed from: a */
    private boolean m537a(Runnable runnable) {
        try {
            ExecutorService executorService = this.f458c;
            if (executorService == null || executorService.isShutdown() || this.f458c.isTerminated()) {
                return false;
            }
            this.f458c.submit(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting log to executor service.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10769c(C0819e1 e1Var) {
        if (e1Var != null) {
            e1Var.mo10692b("level");
            e1Var.mo10692b("message");
        }
        this.f457b = e1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0953s0 mo10760a() {
        return this.f460e;
    }
}
