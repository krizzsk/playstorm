package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.apm.insight.runtime.u */
public class C1393u {

    /* renamed from: a */
    static final C1397b<C1399d, Runnable> f1482a = new C1397b<C1399d, Runnable>() {
    };

    /* renamed from: b */
    static final C1397b<Message, Runnable> f1483b = new C1397b<Message, Runnable>() {
    };

    /* renamed from: c */
    private final HandlerThread f1484c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Queue<C1399d> f1485d = new ConcurrentLinkedQueue();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Queue<Message> f1486e = new ConcurrentLinkedQueue();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public volatile Handler f1487f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f1488g = new Object();

    /* renamed from: com.apm.insight.runtime.u$a */
    class C1396a implements Runnable {
        C1396a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo12531a() {
            while (!C1393u.this.f1485d.isEmpty()) {
                C1399d dVar = (C1399d) C1393u.this.f1485d.poll();
                if (C1393u.this.f1487f != null) {
                    try {
                        C1393u.this.f1487f.sendMessageAtTime(dVar.f1493a, dVar.f1494b);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo12532b() {
            while (!C1393u.this.f1486e.isEmpty()) {
                if (C1393u.this.f1487f != null) {
                    try {
                        C1393u.this.f1487f.sendMessageAtFrontOfQueue((Message) C1393u.this.f1486e.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        public void run() {
            mo12532b();
            mo12531a();
        }
    }

    /* renamed from: com.apm.insight.runtime.u$b */
    public interface C1397b<A, B> {
    }

    /* renamed from: com.apm.insight.runtime.u$c */
    class C1398c extends HandlerThread {

        /* renamed from: a */
        volatile int f1490a = 0;

        /* renamed from: b */
        volatile boolean f1491b = false;

        C1398c(String str) {
            super(str);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|22|21) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            com.apm.insight.p011b.C1187g.m1299a(com.apm.insight.C1240h.m1558g()).mo12196a().mo12183c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
            if (r4.f1490a < 5) goto L_0x003f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
            com.apm.insight.C1176b.m1249a().mo12218a("NPTH_CATCH", r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
            if (r4.f1491b == false) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
            r4.f1491b = true;
            com.apm.insight.C1176b.m1249a().mo12218a("NPTH_ERR_MAX", (java.lang.Throwable) new java.lang.RuntimeException());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
            r4.f1490a++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0025 */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0025 A[LOOP:0: B:6:0x0025->B:21:0x0025, LOOP_START, SYNTHETIC, Splitter:B:6:0x0025] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onLooperPrepared() {
            /*
                r4 = this;
                super.onLooperPrepared()
                com.apm.insight.runtime.u r0 = com.apm.insight.runtime.C1393u.this
                java.lang.Object r0 = r0.f1488g
                monitor-enter(r0)
                com.apm.insight.runtime.u r1 = com.apm.insight.runtime.C1393u.this     // Catch:{ all -> 0x0063 }
                android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x0063 }
                r2.<init>()     // Catch:{ all -> 0x0063 }
                android.os.Handler unused = r1.f1487f = r2     // Catch:{ all -> 0x0063 }
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                com.apm.insight.runtime.u r0 = com.apm.insight.runtime.C1393u.this
                android.os.Handler r0 = r0.f1487f
                com.apm.insight.runtime.u$a r1 = new com.apm.insight.runtime.u$a
                com.apm.insight.runtime.u r2 = com.apm.insight.runtime.C1393u.this
                r1.<init>()
                r0.post(r1)
            L_0x0025:
                android.os.Looper.loop()     // Catch:{ all -> 0x0029 }
                goto L_0x0025
            L_0x0029:
                r0 = move-exception
                android.content.Context r1 = com.apm.insight.C1240h.m1558g()     // Catch:{ all -> 0x0025 }
                com.apm.insight.b.g r1 = com.apm.insight.p011b.C1187g.m1299a(r1)     // Catch:{ all -> 0x0025 }
                com.apm.insight.b.b r1 = r1.mo12196a()     // Catch:{ all -> 0x0025 }
                r1.mo12183c()     // Catch:{ all -> 0x0025 }
                int r1 = r4.f1490a     // Catch:{ all -> 0x0025 }
                r2 = 5
                r3 = 1
                if (r1 >= r2) goto L_0x0049
                com.apm.insight.c r1 = com.apm.insight.C1176b.m1249a()     // Catch:{ all -> 0x0025 }
                java.lang.String r2 = "NPTH_CATCH"
                r1.mo12218a((java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0025 }
                goto L_0x005d
            L_0x0049:
                boolean r0 = r4.f1491b     // Catch:{ all -> 0x0025 }
                if (r0 != 0) goto L_0x005d
                r4.f1491b = r3     // Catch:{ all -> 0x0025 }
                com.apm.insight.c r0 = com.apm.insight.C1176b.m1249a()     // Catch:{ all -> 0x0025 }
                java.lang.String r1 = "NPTH_ERR_MAX"
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0025 }
                r2.<init>()     // Catch:{ all -> 0x0025 }
                r0.mo12218a((java.lang.String) r1, (java.lang.Throwable) r2)     // Catch:{ all -> 0x0025 }
            L_0x005d:
                int r0 = r4.f1490a     // Catch:{ all -> 0x0025 }
                int r0 = r0 + r3
                r4.f1490a = r0     // Catch:{ all -> 0x0025 }
                goto L_0x0025
            L_0x0063:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.C1393u.C1398c.onLooperPrepared():void");
        }
    }

    /* renamed from: com.apm.insight.runtime.u$d */
    static class C1399d {

        /* renamed from: a */
        Message f1493a;

        /* renamed from: b */
        long f1494b;

        C1399d(Message message, long j) {
            this.f1493a = message;
            this.f1494b = j;
        }
    }

    public C1393u(String str) {
        this.f1484c = new C1398c(str);
    }

    /* renamed from: b */
    private Message m2310b(Runnable runnable) {
        return Message.obtain(this.f1487f, runnable);
    }

    /* renamed from: a */
    public Handler mo12524a() {
        return this.f1487f;
    }

    /* renamed from: a */
    public final boolean mo12525a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return mo12529b(message, SystemClock.uptimeMillis() + j);
    }

    /* renamed from: a */
    public final boolean mo12526a(Runnable runnable) {
        return mo12525a(m2310b(runnable), 0);
    }

    /* renamed from: a */
    public final boolean mo12527a(Runnable runnable, long j) {
        return mo12525a(m2310b(runnable), j);
    }

    /* renamed from: b */
    public void mo12528b() {
        this.f1484c.start();
    }

    /* renamed from: b */
    public final boolean mo12529b(Message message, long j) {
        if (this.f1487f == null) {
            synchronized (this.f1488g) {
                if (this.f1487f == null) {
                    this.f1485d.add(new C1399d(message, j));
                    return true;
                }
            }
        }
        try {
            return this.f1487f.sendMessageAtTime(message, j);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: c */
    public HandlerThread mo12530c() {
        return this.f1484c;
    }
}
