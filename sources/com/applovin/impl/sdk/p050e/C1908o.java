package com.applovin.impl.sdk.p050e;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.utils.C2036e;
import com.applovin.impl.sdk.utils.Utils;
import com.facebook.internal.security.CertificateUtil;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.e.o */
public class C1908o {

    /* renamed from: a */
    private final String f3513a = "TaskManager";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1959m f3514b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2092v f3515c;

    /* renamed from: d */
    private final ScheduledThreadPoolExecutor f3516d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ScheduledThreadPoolExecutor f3517e;

    /* renamed from: f */
    private final List<C1913c> f3518f = new ArrayList(5);

    /* renamed from: g */
    private final Object f3519g = new Object();

    /* renamed from: h */
    private boolean f3520h;

    /* renamed from: com.applovin.impl.sdk.e.o$a */
    public enum C1910a {
        MAIN,
        TIMEOUT,
        BACKGROUND,
        ADVERTISING_INFO_COLLECTION,
        POSTBACKS,
        CACHING_INTERSTITIAL,
        CACHING_INCENTIVIZED,
        CACHING_OTHER,
        REWARD,
        MEDIATION_MAIN,
        MEDIATION_TIMEOUT,
        MEDIATION_BACKGROUND,
        MEDIATION_POSTBACKS,
        MEDIATION_BANNER,
        MEDIATION_INTERSTITIAL,
        MEDIATION_INCENTIVIZED,
        MEDIATION_REWARDED_INTERSTITIAL,
        MEDIATION_REWARD
    }

    /* renamed from: com.applovin.impl.sdk.e.o$b */
    private class C1911b implements ThreadFactory {

        /* renamed from: b */
        private final String f3543b;

        C1911b(String str) {
            this.f3543b = str;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f3543b + CertificateUtil.DELIMITER + Utils.shortenKey(C1908o.this.f3514b.mo14374z()));
            thread.setDaemon(true);
            thread.setPriority(10);
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                public void uncaughtException(Thread thread, Throwable th) {
                    if (C2092v.m5047a()) {
                        C1908o.this.f3515c.mo14790b("TaskManager", "Caught unhandled exception", th);
                    }
                }
            });
            return thread;
        }
    }

    /* renamed from: com.applovin.impl.sdk.e.o$c */
    private static class C1913c implements Runnable {

        /* renamed from: a */
        private final C1959m f3545a;

        /* renamed from: b */
        private final String f3546b;

        /* renamed from: c */
        private final C2092v f3547c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C1877a f3548d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C1910a f3549e;

        C1913c(C1959m mVar, C1877a aVar, C1910a aVar2) {
            this.f3545a = mVar;
            this.f3547c = mVar.mo14286A();
            this.f3546b = aVar.mo14148e();
            this.f3548d = aVar;
            this.f3549e = aVar2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = " queue finished task "
                com.applovin.impl.sdk.utils.C2039g.m4881a()     // Catch:{ all -> 0x004a }
                com.applovin.impl.sdk.m r1 = r6.f3545a     // Catch:{ all -> 0x004a }
                boolean r1 = r1.mo14350c()     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0035
                com.applovin.impl.sdk.e.a r1 = r6.f3548d     // Catch:{ all -> 0x004a }
                boolean r1 = r1.mo14150g()     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0016
                goto L_0x0035
            L_0x0016:
                boolean r1 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x004a }
                if (r1 == 0) goto L_0x0025
                com.applovin.impl.sdk.v r1 = r6.f3547c     // Catch:{ all -> 0x004a }
                java.lang.String r2 = r6.f3546b     // Catch:{ all -> 0x004a }
                java.lang.String r3 = "Task re-scheduled..."
                r1.mo14791c(r2, r3)     // Catch:{ all -> 0x004a }
            L_0x0025:
                com.applovin.impl.sdk.m r1 = r6.f3545a     // Catch:{ all -> 0x004a }
                com.applovin.impl.sdk.e.o r1 = r1.mo14303S()     // Catch:{ all -> 0x004a }
                com.applovin.impl.sdk.e.a r2 = r6.f3548d     // Catch:{ all -> 0x004a }
                com.applovin.impl.sdk.e.o$a r3 = r6.f3549e     // Catch:{ all -> 0x004a }
                r4 = 2000(0x7d0, double:9.88E-321)
                r1.mo14207a((com.applovin.impl.sdk.p050e.C1877a) r2, (com.applovin.impl.sdk.p050e.C1908o.C1910a) r3, (long) r4)     // Catch:{ all -> 0x004a }
                goto L_0x003a
            L_0x0035:
                com.applovin.impl.sdk.e.a r1 = r6.f3548d     // Catch:{ all -> 0x004a }
                r1.run()     // Catch:{ all -> 0x004a }
            L_0x003a:
                boolean r1 = com.applovin.impl.sdk.C2092v.m5047a()
                if (r1 == 0) goto L_0x0081
                com.applovin.impl.sdk.v r1 = r6.f3547c
                java.lang.String r2 = r6.f3546b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                goto L_0x0069
            L_0x004a:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x0082 }
                if (r2 == 0) goto L_0x005a
                com.applovin.impl.sdk.v r2 = r6.f3547c     // Catch:{ all -> 0x0082 }
                java.lang.String r3 = r6.f3546b     // Catch:{ all -> 0x0082 }
                java.lang.String r4 = "Task failed execution"
                r2.mo14790b(r3, r4, r1)     // Catch:{ all -> 0x0082 }
            L_0x005a:
                boolean r1 = com.applovin.impl.sdk.C2092v.m5047a()
                if (r1 == 0) goto L_0x0081
                com.applovin.impl.sdk.v r1 = r6.f3547c
                java.lang.String r2 = r6.f3546b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
            L_0x0069:
                com.applovin.impl.sdk.e.o$a r4 = r6.f3549e
                r3.append(r4)
                r3.append(r0)
                com.applovin.impl.sdk.e.a r0 = r6.f3548d
                java.lang.String r0 = r0.mo14148e()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.mo14791c(r2, r0)
            L_0x0081:
                return
            L_0x0082:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.C2092v.m5047a()
                if (r2 == 0) goto L_0x00aa
                com.applovin.impl.sdk.v r2 = r6.f3547c
                java.lang.String r3 = r6.f3546b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                com.applovin.impl.sdk.e.o$a r5 = r6.f3549e
                r4.append(r5)
                r4.append(r0)
                com.applovin.impl.sdk.e.a r0 = r6.f3548d
                java.lang.String r0 = r0.mo14148e()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.mo14791c(r3, r0)
            L_0x00aa:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p050e.C1908o.C1913c.run():void");
        }
    }

    public C1908o(C1959m mVar) {
        this.f3514b = mVar;
        this.f3515c = mVar.mo14286A();
        this.f3516d = m4248a("auxiliary_operations", ((Integer) mVar.mo14311a(C1857b.f3205cd)).intValue());
        this.f3517e = m4248a("shared_thread_pool", ((Integer) mVar.mo14311a(C1857b.f3109am)).intValue());
    }

    /* renamed from: a */
    private ScheduledThreadPoolExecutor m4248a(String str, int i) {
        return new ScheduledThreadPoolExecutor(i, new C1911b(str));
    }

    /* renamed from: a */
    private void m4249a(final Runnable runnable, long j, boolean z) {
        if (j <= 0) {
            this.f3517e.submit(runnable);
        } else if (z) {
            C2036e.m4876a(j, this.f3514b, new Runnable() {
                public void run() {
                    C1908o.this.f3517e.execute(runnable);
                }
            });
        } else {
            this.f3517e.schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    private boolean m4250a(C1913c cVar) {
        if (cVar.f3548d.mo14150g()) {
            return false;
        }
        synchronized (this.f3519g) {
            if (this.f3520h) {
                return false;
            }
            this.f3518f.add(cVar);
            return true;
        }
    }

    /* renamed from: a */
    public void mo14205a(C1877a aVar) {
        if (aVar != null) {
            try {
                aVar.run();
            } catch (Throwable th) {
                if (C2092v.m5047a()) {
                    this.f3515c.mo14790b(aVar.mo14148e(), "Task failed execution", th);
                }
            }
        } else if (C2092v.m5047a()) {
            this.f3515c.mo14793e("TaskManager", "Attempted to execute null task immediately");
        }
    }

    /* renamed from: a */
    public void mo14206a(C1877a aVar, C1910a aVar2) {
        mo14207a(aVar, aVar2, 0);
    }

    /* renamed from: a */
    public void mo14207a(C1877a aVar, C1910a aVar2, long j) {
        mo14208a(aVar, aVar2, j, false);
    }

    /* renamed from: a */
    public void mo14208a(C1877a aVar, C1910a aVar2, long j, boolean z) {
        if (aVar == null) {
            throw new IllegalArgumentException("No task specified");
        } else if (j < 0) {
            throw new IllegalArgumentException("Invalid delay (millis) specified: " + j);
        } else if (!m4250a(new C1913c(this.f3514b, aVar, aVar2))) {
            m4249a((Runnable) aVar, j, z);
        } else if (C2092v.m5047a()) {
            this.f3515c.mo14791c(aVar.mo14148e(), "Task execution delayed until after init");
        }
    }

    /* renamed from: a */
    public void mo14209a(Runnable runnable) {
        this.f3516d.submit(runnable);
    }

    /* renamed from: a */
    public boolean mo14210a() {
        return this.f3520h;
    }

    /* renamed from: b */
    public Executor mo14211b() {
        return this.f3517e;
    }

    /* renamed from: c */
    public void mo14212c() {
        synchronized (this.f3519g) {
            this.f3520h = false;
        }
    }

    /* renamed from: d */
    public void mo14213d() {
        synchronized (this.f3519g) {
            this.f3520h = true;
            for (C1913c next : this.f3518f) {
                mo14206a(next.f3548d, next.f3549e);
            }
            this.f3518f.clear();
        }
    }
}
