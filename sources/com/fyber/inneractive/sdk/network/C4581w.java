package com.fyber.inneractive.sdk.network;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.fyber.inneractive.sdk.util.IAlog;
import java.net.UnknownHostException;
import java.util.Comparator;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.network.w */
public class C4581w {

    /* renamed from: f */
    public static final ThreadFactory f11386f = new C4582a();

    /* renamed from: a */
    public BlockingQueue<C4532b0<?>> f11387a = new PriorityBlockingQueue(100, new C4584c((C4582a) null));

    /* renamed from: b */
    public volatile boolean f11388b = false;

    /* renamed from: c */
    public final Handler f11389c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public final ThreadPoolExecutor f11390d = new ThreadPoolExecutor(6, 6, 1000, TimeUnit.SECONDS, new LinkedBlockingQueue(100), f11386f);

    /* renamed from: e */
    public final Runnable f11391e = new C4583b();

    /* renamed from: com.fyber.inneractive.sdk.network.w$a */
    public class C4582a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f11392a = new AtomicInteger(100);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format(Locale.ENGLISH, "FyberMarketplace-Network-%02d", new Object[]{Integer.valueOf(this.f11392a.getAndIncrement())}));
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.network.w$b */
    public class C4583b implements Runnable {
        public C4583b() {
        }

        public void run() {
            C4532b0 b0Var;
            C4529a aVar;
            C4530a0 a0Var;
            C4581w wVar = C4581w.this;
            wVar.getClass();
            Process.setThreadPriority(10);
            while (wVar.f11388b) {
                try {
                    b0Var = wVar.f11387a.take();
                } catch (InterruptedException unused) {
                    if (!wVar.f11388b) {
                        Thread.currentThread().interrupt();
                    }
                    b0Var = null;
                }
                if (b0Var != null && !b0Var.mo24721e()) {
                    b0Var.mo24717a(C4559m0.RUNNING);
                    try {
                        if (!b0Var.mo24721e() && b0Var.mo24720c() != null) {
                            aVar = b0Var.mo24723g();
                            if (!(aVar == null || aVar.f11196b == null || b0Var.mo24721e())) {
                                b0Var.mo24718a(aVar.f11196b, (Exception) null, true);
                            }
                            C4551j a = wVar.mo24776a((C4532b0<?>) b0Var, (C4529a<?>) aVar);
                            a0Var = wVar.mo24775a(b0Var, a);
                            wVar.mo24779a(b0Var, a, a0Var);
                            wVar.mo24778a(b0Var, a0Var);
                            wVar.mo24780b(b0Var);
                        }
                    } catch (Exception e) {
                        IAlog.m16698a("failed fetching cache data", e, new Object[0]);
                        b0Var.mo24718a(null, e, true);
                    }
                    aVar = null;
                    b0Var.mo24718a(aVar.f11196b, (Exception) null, true);
                    try {
                        C4551j a2 = wVar.mo24776a((C4532b0<?>) b0Var, (C4529a<?>) aVar);
                        a0Var = wVar.mo24775a(b0Var, a2);
                        try {
                            wVar.mo24779a(b0Var, a2, a0Var);
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        a0Var = null;
                        try {
                            b0Var.mo24718a(null, e, false);
                            wVar.mo24778a(b0Var, a0Var);
                            wVar.mo24780b(b0Var);
                        } catch (Throwable th) {
                            th = th;
                            wVar.mo24778a(b0Var, a0Var);
                            wVar.mo24780b(b0Var);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        a0Var = null;
                        th = th2;
                        wVar.mo24778a(b0Var, a0Var);
                        wVar.mo24780b(b0Var);
                        throw th;
                    }
                    wVar.mo24778a(b0Var, a0Var);
                    wVar.mo24780b(b0Var);
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.network.w$c */
    public static class C4584c implements Comparator<C4532b0> {
        public C4584c() {
        }

        public int compare(Object obj, Object obj2) {
            return ((C4532b0) obj).mo24722f().ordinal() - ((C4532b0) obj2).mo24722f().ordinal();
        }

        public /* synthetic */ C4584c(C4582a aVar) {
            this();
        }
    }

    /* renamed from: a */
    public final <T> void mo24778a(C4532b0<T> b0Var, C4530a0 a0Var) {
        try {
            if (!b0Var.mo24721e() && a0Var != null) {
                b0Var.mo24718a(a0Var.f11197a, (Exception) null, false);
            }
        } catch (Exception e) {
            IAlog.m16698a("failed notifying the listener request complete", e, new Object[0]);
            b0Var.mo24718a(null, e, false);
        }
    }

    /* renamed from: b */
    public final void mo24780b(C4532b0<?> b0Var) {
        try {
            b0Var.mo24719b();
        } catch (Exception unused) {
        }
        b0Var.mo24717a(C4559m0.DONE);
    }

    /* renamed from: c */
    public void mo24781c(C4532b0<?> b0Var) {
        this.f11387a.offer(b0Var);
        b0Var.mo24717a(C4559m0.QUEUED);
    }

    /* renamed from: a */
    public final <T> void mo24779a(C4532b0<T> b0Var, C4551j jVar, C4530a0 a0Var) {
        try {
            if (!b0Var.mo24721e() && b0Var.mo24720c() != null && a0Var != null && jVar != null && jVar.f11243a == 200) {
                b0Var.mo24716a(a0Var, b0Var.mo24720c(), jVar.f11247e);
            }
        } catch (Exception e) {
            IAlog.m16698a("Failed cache network response data", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final <T> C4530a0 mo24775a(C4532b0<T> b0Var, C4551j jVar) throws Exception {
        if (jVar == null) {
            return null;
        }
        try {
            if (b0Var.mo24721e()) {
                return null;
            }
            int i = jVar.f11243a;
            if (i == 200) {
                return b0Var.mo24713a(jVar.f11245c, jVar.f11246d, i);
            }
            if (i == 304) {
                b0Var.mo24718a(null, (Exception) new C4542f(), false);
                return null;
            }
            b0Var.mo24718a(null, (Exception) new C4564n0(jVar.f11243a, jVar.f11244b), false);
            return null;
        } catch (Exception e) {
            IAlog.m16698a("failed parsing network request", e, new Object[0]);
            throw e;
        }
    }

    /* renamed from: a */
    public final C4551j mo24776a(C4532b0<?> b0Var, C4529a<?> aVar) throws Exception {
        try {
            if (b0Var.mo24721e()) {
                return null;
            }
            String str = aVar != null ? aVar.f11195a : "";
            mo24777a(b0Var);
            return b0Var.mo24714a(str);
        } catch (C4531b | UnknownHostException e) {
            IAlog.m16698a("failed sending network request", e, new Object[0]);
            if (b0Var.mo24726j()) {
                this.f11389c.postDelayed(new C4585x(this, b0Var), (long) b0Var.mo24731p());
            }
            throw e;
        } catch (Exception e2) {
            IAlog.m16698a("failed sending network request", e2, new Object[0]);
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r0.isConnectedOrConnecting() != false) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24777a(com.fyber.inneractive.sdk.network.C4532b0<?> r4) throws com.fyber.inneractive.sdk.network.C4531b {
        /*
            r3 = this;
            com.fyber.inneractive.sdk.config.global.s r4 = r4.mo24724h()
            if (r4 == 0) goto L_0x0050
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.g> r0 = com.fyber.inneractive.sdk.config.global.features.C4289g.class
            com.fyber.inneractive.sdk.config.global.features.e r4 = r4.mo24338a(r0)
            com.fyber.inneractive.sdk.config.global.features.g r4 = (com.fyber.inneractive.sdk.config.global.features.C4289g) r4
            if (r4 == 0) goto L_0x0050
            java.lang.String r0 = "should_use_is_network_connected"
            r1 = 0
            boolean r4 = r4.mo24313a((java.lang.String) r0, (boolean) r1)
            if (r4 == 0) goto L_0x0050
            r4 = 1
            android.app.Application r0 = com.fyber.inneractive.sdk.util.C5350l.f14216a     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ all -> 0x003d }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x002b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ all -> 0x003d }
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r2 = com.fyber.inneractive.sdk.util.C5350l.m16763b((java.lang.String) r2)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0045
            if (r0 == 0) goto L_0x0045
            boolean r0 = r0.isConnectedOrConnecting()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0045
            goto L_0x0044
        L_0x003d:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Error retrieved when trying to get the network state - Perhaps you forgot to declare android.permission.ACCESS_NETWORK_STATE in your Android manifest file."
            com.fyber.inneractive.sdk.util.IAlog.m16700b(r1, r0)
        L_0x0044:
            r1 = r4
        L_0x0045:
            if (r1 == 0) goto L_0x0048
            goto L_0x0050
        L_0x0048:
            com.fyber.inneractive.sdk.network.b r4 = new com.fyber.inneractive.sdk.network.b
            java.lang.String r0 = "No network connection"
            r4.<init>((java.lang.String) r0)
            throw r4
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C4581w.mo24777a(com.fyber.inneractive.sdk.network.b0):void");
    }
}
