package com.applovin.impl.adview;

import android.os.Handler;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.applovin.impl.adview.j */
public final class C1527j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2092v f1907a;

    /* renamed from: b */
    private final Handler f1908b;

    /* renamed from: c */
    private final Set<C1530b> f1909c = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final AtomicInteger f1910d = new AtomicInteger();

    /* renamed from: com.applovin.impl.adview.j$a */
    public interface C1529a {
        /* renamed from: a */
        void mo12815a();

        /* renamed from: b */
        boolean mo12816b();
    }

    /* renamed from: com.applovin.impl.adview.j$b */
    private static class C1530b {

        /* renamed from: a */
        private final String f1914a;

        /* renamed from: b */
        private final C1529a f1915b;

        /* renamed from: c */
        private final long f1916c;

        private C1530b(String str, long j, C1529a aVar) {
            this.f1914a = str;
            this.f1916c = j;
            this.f1915b = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String m2813a() {
            return this.f1914a;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public long m2815b() {
            return this.f1916c;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C1529a m2818c() {
            return this.f1915b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1530b)) {
                return false;
            }
            String str = this.f1914a;
            String str2 = ((C1530b) obj).f1914a;
            return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
        }

        public int hashCode() {
            String str = this.f1914a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f1914a + '\'' + ", countdownStepMillis=" + this.f1916c + '}';
        }
    }

    public C1527j(Handler handler, C1959m mVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        } else if (mVar != null) {
            this.f1908b = handler;
            this.f1907a = mVar.mo14286A();
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2804a(final C1530b bVar, final int i) {
        this.f1908b.postDelayed(new Runnable() {
            public void run() {
                C1529a b = bVar.m2818c();
                if (b.mo12816b()) {
                    if (C1527j.this.f1910d.get() == i) {
                        try {
                            b.mo12815a();
                            C1527j.this.m2804a(bVar, i);
                        } catch (Throwable th) {
                            if (C2092v.m5047a()) {
                                C2092v b2 = C1527j.this.f1907a;
                                b2.mo14790b("CountdownManager", "Encountered error on countdown step for: " + bVar.m2813a(), th);
                            }
                            C1527j.this.mo12966b();
                        }
                    } else if (C2092v.m5047a()) {
                        C2092v b3 = C1527j.this.f1907a;
                        b3.mo14792d("CountdownManager", "Killing duplicate countdown from previous generation: " + bVar.m2813a());
                    }
                } else if (C2092v.m5047a()) {
                    C2092v b4 = C1527j.this.f1907a;
                    b4.mo14789b("CountdownManager", "Ending countdown for " + bVar.m2813a());
                }
            }
        }, bVar.m2815b());
    }

    /* renamed from: a */
    public void mo12964a() {
        HashSet<C1530b> hashSet = new HashSet<>(this.f1909c);
        if (C2092v.m5047a()) {
            C2092v vVar = this.f1907a;
            vVar.mo14789b("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int incrementAndGet = this.f1910d.incrementAndGet();
        for (C1530b bVar : hashSet) {
            if (C2092v.m5047a()) {
                C2092v vVar2 = this.f1907a;
                vVar2.mo14789b("CountdownManager", "Starting countdown: " + bVar.m2813a() + " for generation " + incrementAndGet + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            m2804a(bVar, incrementAndGet);
        }
    }

    /* renamed from: a */
    public void mo12965a(String str, long j, C1529a aVar) {
        if (j <= 0) {
            throw new IllegalArgumentException("Invalid step specified.");
        } else if (this.f1908b != null) {
            if (C2092v.m5047a()) {
                C2092v vVar = this.f1907a;
                vVar.mo14789b("CountdownManager", "Adding countdown: " + str);
            }
            this.f1909c.add(new C1530b(str, j, aVar));
        } else {
            throw new IllegalArgumentException("No handler specified.");
        }
    }

    /* renamed from: b */
    public void mo12966b() {
        if (C2092v.m5047a()) {
            this.f1907a.mo14789b("CountdownManager", "Removing all countdowns...");
        }
        mo12967c();
        this.f1909c.clear();
    }

    /* renamed from: c */
    public void mo12967c() {
        if (C2092v.m5047a()) {
            this.f1907a.mo14789b("CountdownManager", "Stopping countdowns...");
        }
        this.f1910d.incrementAndGet();
        this.f1908b.removeCallbacksAndMessages((Object) null);
    }
}
