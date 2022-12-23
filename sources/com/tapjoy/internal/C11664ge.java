package com.tapjoy.internal;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tapjoy.TJConnectListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.tapjoy.internal.ge */
public abstract class C11664ge {

    /* renamed from: a */
    private final ReentrantLock f28366a;

    /* renamed from: b */
    volatile int f28367b = C11672c.f28389a;

    /* renamed from: c */
    C11669b f28368c;

    /* renamed from: d */
    long f28369d = 1000;

    /* renamed from: e */
    C11668a f28370e;

    /* renamed from: f */
    private final Condition f28371f;

    /* renamed from: g */
    private final LinkedList<TJConnectListener> f28372g = new LinkedList<>();

    /* renamed from: h */
    private C11668a f28373h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo72445a(Context context, String str, Hashtable<String, ?> hashtable, TJConnectListener tJConnectListener);

    public C11664ge() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f28366a = reentrantLock;
        this.f28371f = reentrantLock.newCondition();
    }

    /* renamed from: com.tapjoy.internal.ge$c */
    enum C11672c {
        ;
        

        /* renamed from: a */
        public static final int f28389a = 1;

        /* renamed from: b */
        public static final int f28390b = 2;

        /* renamed from: c */
        public static final int f28391c = 3;

        /* renamed from: d */
        public static final int f28392d = 4;

        /* renamed from: e */
        public static final int f28393e = 5;

        static {
            f28394f = new int[]{1, 2, 3, 4, 5};
        }

        /* renamed from: a */
        public static int[] m33862a() {
            return (int[]) f28394f.clone();
        }
    }

    /* renamed from: b */
    public final boolean mo72547b(Context context, String str, Hashtable<String, ?> hashtable, TJConnectListener tJConnectListener) {
        this.f28366a.lock();
        if (tJConnectListener != null) {
            try {
                this.f28372g.addLast(C11637fp.m33802a(tJConnectListener, TJConnectListener.class));
            } catch (Throwable th) {
                this.f28366a.unlock();
                throw th;
            }
        }
        C11668a aVar = new C11668a(context, str, hashtable);
        int i = C116673.f28376a[this.f28367b - 1];
        if (i != 1) {
            if (i == 2) {
                this.f28370e = aVar;
                C11647fu.f28325b.addObserver(new Observer() {
                    public final void update(Observable observable, Object obj) {
                        C11647fu.f28325b.deleteObserver(this);
                        if (!Boolean.TRUE.equals(obj) && C11664ge.this.f28370e != null && C11664ge.this.f28370e.f28377a != null) {
                            C11664ge.this.f28368c = new C11669b(C11664ge.this, (byte) 0);
                            new Thread(C11664ge.this.f28368c).start();
                        }
                    }
                });
                if (mo72445a(aVar.f28377a, aVar.f28378b, aVar.f28379c, new TJConnectListener() {
                    public final void onConnectSuccess() {
                        C11664ge geVar = C11664ge.this;
                        int i = C11672c.f28393e;
                        int i2 = C11672c.f28390b;
                        geVar.mo72543a(i);
                        C11664ge.this.mo72544a(true);
                    }

                    public final void onConnectFailure() {
                        C11664ge.this.mo72544a(false);
                    }
                })) {
                    int i2 = C11672c.f28390b;
                    int i3 = C11672c.f28389a;
                    mo72543a(i2);
                } else {
                    this.f28372g.clear();
                }
            } else if (i == 3 || i == 4) {
                this.f28373h = aVar;
            } else if (i != 5) {
                mo72543a(C11672c.f28389a);
            } else {
                this.f28373h = aVar;
                mo72546b();
            }
            this.f28366a.unlock();
            return false;
        }
        mo72544a(true);
        this.f28366a.unlock();
        return true;
    }

    /* renamed from: com.tapjoy.internal.ge$3 */
    static /* synthetic */ class C116673 {

        /* renamed from: a */
        static final /* synthetic */ int[] f28376a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0027 */
        static {
            /*
                int[] r0 = com.tapjoy.internal.C11664ge.C11672c.m33862a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28376a = r0
                r1 = 1
                int r2 = com.tapjoy.internal.C11664ge.C11672c.f28393e     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = f28376a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.tapjoy.internal.C11664ge.C11672c.f28389a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r0 = f28376a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = com.tapjoy.internal.C11664ge.C11672c.f28390b     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = r2 - r1
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f28376a     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = com.tapjoy.internal.C11664ge.C11672c.f28391c     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = r2 - r1
                r3 = 4
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                int[] r0 = f28376a     // Catch:{ NoSuchFieldError -> 0x002f }
                int r2 = com.tapjoy.internal.C11664ge.C11672c.f28392d     // Catch:{ NoSuchFieldError -> 0x002f }
                int r2 = r2 - r1
                r1 = 5
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11664ge.C116673.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo72543a(int i) {
        this.f28366a.lock();
        try {
            this.f28367b = i;
        } finally {
            this.f28366a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C11668a mo72542a() {
        this.f28366a.lock();
        try {
            if (this.f28373h != null) {
                this.f28370e = this.f28373h;
                this.f28373h = null;
            }
            return this.f28370e;
        } finally {
            this.f28366a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo72544a(boolean z) {
        this.f28366a.lock();
        try {
            if (this.f28372g.size() != 0) {
                ArrayList arrayList = new ArrayList(this.f28372g);
                this.f28372g.clear();
                this.f28366a.unlock();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    TJConnectListener tJConnectListener = (TJConnectListener) it.next();
                    if (z) {
                        tJConnectListener.onConnectSuccess();
                    } else {
                        tJConnectListener.onConnectFailure();
                    }
                }
            }
        } finally {
            this.f28366a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo72546b() {
        this.f28366a.lock();
        try {
            this.f28369d = 1000;
            this.f28371f.signal();
        } finally {
            this.f28366a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo72545a(long j) {
        this.f28366a.lock();
        try {
            int i = C11672c.f28392d;
            int i2 = C11672c.f28391c;
            mo72543a(i);
            if (this.f28371f.await(j, TimeUnit.MILLISECONDS)) {
                this.f28369d = 1000;
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            int i3 = C11672c.f28391c;
            int i4 = C11672c.f28392d;
            mo72543a(i3);
            this.f28366a.unlock();
            throw th;
        }
        int i5 = C11672c.f28391c;
        int i6 = C11672c.f28392d;
        mo72543a(i5);
        this.f28366a.unlock();
        return false;
    }

    /* renamed from: com.tapjoy.internal.ge$a */
    class C11668a {

        /* renamed from: a */
        public final Context f28377a;

        /* renamed from: b */
        public final String f28378b;

        /* renamed from: c */
        public final Hashtable<String, ?> f28379c;

        public C11668a(Context context, String str, Hashtable<String, ?> hashtable) {
            Context context2;
            if (context == null) {
                context2 = null;
            } else if (context instanceof Application) {
                context2 = context;
            } else {
                context2 = context.getApplicationContext();
            }
            this.f28377a = context2 != null ? context2 : context;
            this.f28378b = str;
            this.f28379c = hashtable;
        }
    }

    /* renamed from: com.tapjoy.internal.ge$b */
    class C11669b implements Runnable {

        /* renamed from: b */
        private boolean f28382b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f28383c;

        /* renamed from: d */
        private Context f28384d;

        /* renamed from: e */
        private BroadcastReceiver f28385e;

        private C11669b() {
            this.f28385e = new BroadcastReceiver() {
                public final void onReceive(Context context, Intent intent) {
                    C11664ge.this.mo72546b();
                }
            };
        }

        /* synthetic */ C11669b(C11664ge geVar, byte b) {
            this();
        }

        /* renamed from: a */
        private void m33859a() {
            if (C11664ge.this.f28368c == this) {
                C11664ge.this.f28368c = null;
            }
            if (C11664ge.this.f28367b == C11672c.f28391c) {
                C11664ge geVar = C11664ge.this;
                int i = C11672c.f28389a;
                int i2 = C11672c.f28391c;
                geVar.mo72543a(i);
            }
        }

        /* renamed from: b */
        private void m33861b() {
            this.f28384d.unregisterReceiver(this.f28385e);
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x005a */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x006d A[Catch:{ all -> 0x0090 }, LOOP:0: B:1:0x0021->B:15:0x006d, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005e A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                com.tapjoy.internal.ge r0 = com.tapjoy.internal.C11664ge.this
                int r1 = com.tapjoy.internal.C11664ge.C11672c.f28391c
                int r2 = com.tapjoy.internal.C11664ge.C11672c.f28390b
                r0.mo72543a((int) r1)
                com.tapjoy.internal.ge r0 = com.tapjoy.internal.C11664ge.this
                com.tapjoy.internal.ge$a r0 = r0.mo72542a()
                android.content.Context r0 = r0.f28377a
                r7.f28384d = r0
                android.content.IntentFilter r0 = new android.content.IntentFilter
                java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
                r0.<init>(r1)
                android.content.Context r1 = r7.f28384d
                android.content.BroadcastReceiver r2 = r7.f28385e
                r1.registerReceiver(r2, r0)
            L_0x0021:
                boolean r0 = r7.f28382b     // Catch:{ all -> 0x0090 }
                if (r0 != 0) goto L_0x0050
                java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0090 }
                r1 = 1
                r0.<init>(r1)     // Catch:{ all -> 0x0090 }
                com.tapjoy.internal.fu$a r2 = com.tapjoy.internal.C11647fu.f28325b     // Catch:{ all -> 0x0090 }
                com.tapjoy.internal.ge$b$1 r3 = new com.tapjoy.internal.ge$b$1     // Catch:{ all -> 0x0090 }
                r3.<init>(r0)     // Catch:{ all -> 0x0090 }
                r2.addObserver(r3)     // Catch:{ all -> 0x0090 }
                com.tapjoy.internal.ge r2 = com.tapjoy.internal.C11664ge.this     // Catch:{ all -> 0x0090 }
                com.tapjoy.internal.ge$a r2 = r2.mo72542a()     // Catch:{ all -> 0x0090 }
                com.tapjoy.internal.ge r3 = com.tapjoy.internal.C11664ge.this     // Catch:{ all -> 0x0090 }
                android.content.Context r4 = r2.f28377a     // Catch:{ all -> 0x0090 }
                java.lang.String r5 = r2.f28378b     // Catch:{ all -> 0x0090 }
                java.util.Hashtable<java.lang.String, ?> r2 = r2.f28379c     // Catch:{ all -> 0x0090 }
                r6 = 0
                boolean r2 = r3.mo72445a(r4, r5, r2, r6)     // Catch:{ all -> 0x0090 }
                r3 = 0
                if (r2 != 0) goto L_0x0057
                com.tapjoy.internal.ge r0 = com.tapjoy.internal.C11664ge.this     // Catch:{ all -> 0x0090 }
                r0.mo72544a((boolean) r3)     // Catch:{ all -> 0x0090 }
            L_0x0050:
                r7.m33861b()
                r7.m33859a()
                return
            L_0x0057:
                r0.await()     // Catch:{ InterruptedException -> 0x005a }
            L_0x005a:
                boolean r0 = r7.f28383c     // Catch:{ all -> 0x0090 }
                if (r0 == 0) goto L_0x006d
                com.tapjoy.internal.ge r0 = com.tapjoy.internal.C11664ge.this     // Catch:{ all -> 0x0090 }
                int r2 = com.tapjoy.internal.C11664ge.C11672c.f28393e     // Catch:{ all -> 0x0090 }
                int r3 = com.tapjoy.internal.C11664ge.C11672c.f28391c     // Catch:{ all -> 0x0090 }
                r0.mo72543a((int) r2)     // Catch:{ all -> 0x0090 }
                com.tapjoy.internal.ge r0 = com.tapjoy.internal.C11664ge.this     // Catch:{ all -> 0x0090 }
                r0.mo72544a((boolean) r1)     // Catch:{ all -> 0x0090 }
                goto L_0x0050
            L_0x006d:
                com.tapjoy.internal.ge r0 = com.tapjoy.internal.C11664ge.this     // Catch:{ all -> 0x0090 }
                r0.mo72544a((boolean) r3)     // Catch:{ all -> 0x0090 }
                com.tapjoy.internal.ge r0 = com.tapjoy.internal.C11664ge.this     // Catch:{ all -> 0x0090 }
                long r0 = r0.f28369d     // Catch:{ all -> 0x0090 }
                r2 = 1000(0x3e8, double:4.94E-321)
                long r0 = java.lang.Math.max(r0, r2)     // Catch:{ all -> 0x0090 }
                com.tapjoy.internal.ge r2 = com.tapjoy.internal.C11664ge.this     // Catch:{ all -> 0x0090 }
                r3 = 2
                long r3 = r0 << r3
                r5 = 3600000(0x36ee80, double:1.7786363E-317)
                long r3 = java.lang.Math.min(r3, r5)     // Catch:{ all -> 0x0090 }
                r2.f28369d = r3     // Catch:{ all -> 0x0090 }
                com.tapjoy.internal.ge r2 = com.tapjoy.internal.C11664ge.this     // Catch:{ all -> 0x0090 }
                r2.mo72545a((long) r0)     // Catch:{ all -> 0x0090 }
                goto L_0x0021
            L_0x0090:
                r0 = move-exception
                r7.m33861b()
                r7.m33859a()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11664ge.C11669b.run():void");
        }
    }
}
