package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p048c.C1856a;
import com.applovin.impl.sdk.utils.C2082o;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.d */
public class C1862d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private C2082o f3372a;

    /* renamed from: b */
    private final Object f3373b = new Object();

    /* renamed from: c */
    private final AtomicBoolean f3374c = new AtomicBoolean();

    /* renamed from: d */
    private boolean f3375d;

    /* renamed from: e */
    private final C1959m f3376e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final WeakReference<C1864a> f3377f;

    /* renamed from: g */
    private long f3378g;

    /* renamed from: com.applovin.impl.sdk.d$a */
    public interface C1864a {
        void onAdRefresh();
    }

    public C1862d(C1959m mVar, C1864a aVar) {
        this.f3377f = new WeakReference<>(aVar);
        this.f3376e = mVar;
    }

    /* renamed from: i */
    private void m4057i() {
        synchronized (this.f3373b) {
            if (this.f3372a != null) {
                this.f3372a.mo14751b();
            } else {
                if (C2092v.m5047a()) {
                    this.f3376e.mo14286A().mo14789b("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                }
                this.f3374c.set(true);
            }
        }
    }

    /* renamed from: j */
    private void m4058j() {
        synchronized (this.f3373b) {
            if (this.f3372a != null) {
                this.f3372a.mo14752c();
            } else {
                this.f3374c.set(false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m4059k() {
        synchronized (this.f3373b) {
            this.f3372a = null;
            if (!((Boolean) this.f3376e.mo14311a(C1856a.f3058s)).booleanValue()) {
                this.f3376e.mo14337aj().unregisterReceiver(this);
            }
        }
    }

    /* renamed from: l */
    private void m4060l() {
        if (((Boolean) this.f3376e.mo14311a(C1856a.f3057r)).booleanValue()) {
            m4057i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4061m() {
        /*
            r4 = this;
            com.applovin.impl.sdk.m r0 = r4.f3376e
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r1 = com.applovin.impl.sdk.p048c.C1856a.f3057r
            java.lang.Object r0 = r0.mo14311a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r4.f3373b
            monitor-enter(r0)
            boolean r1 = r4.f3375d     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x002c
            boolean r1 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x002a
            com.applovin.impl.sdk.m r1 = r4.f3376e     // Catch:{ all -> 0x0058 }
            com.applovin.impl.sdk.v r1 = r1.mo14286A()     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh."
            r1.mo14789b(r2, r3)     // Catch:{ all -> 0x0058 }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return
        L_0x002c:
            com.applovin.impl.sdk.m r1 = r4.f3376e     // Catch:{ all -> 0x0058 }
            com.applovin.impl.sdk.y r1 = r1.mo14331ad()     // Catch:{ all -> 0x0058 }
            boolean r1 = r1.mo14802a()     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x004d
            boolean r1 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x004b
            com.applovin.impl.sdk.m r1 = r4.f3376e     // Catch:{ all -> 0x0058 }
            com.applovin.impl.sdk.v r1 = r1.mo14286A()     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Waiting for the application to enter foreground to resume the timer."
            r1.mo14789b(r2, r3)     // Catch:{ all -> 0x0058 }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return
        L_0x004d:
            com.applovin.impl.sdk.utils.o r1 = r4.f3372a     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0056
            com.applovin.impl.sdk.utils.o r1 = r4.f3372a     // Catch:{ all -> 0x0058 }
            r1.mo14752c()     // Catch:{ all -> 0x0058 }
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            goto L_0x005b
        L_0x0058:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            throw r1
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1862d.m4061m():void");
    }

    /* renamed from: a */
    public void mo14082a(long j) {
        synchronized (this.f3373b) {
            mo14085c();
            this.f3378g = j;
            this.f3372a = C2082o.m5001a(j, this.f3376e, new Runnable() {
                public void run() {
                    C1862d.this.m4059k();
                    C1864a aVar = (C1864a) C1862d.this.f3377f.get();
                    if (aVar != null) {
                        aVar.onAdRefresh();
                    }
                }
            });
            if (!((Boolean) this.f3376e.mo14311a(C1856a.f3058s)).booleanValue()) {
                this.f3376e.mo14337aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
                this.f3376e.mo14337aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
                this.f3376e.mo14337aj().registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                this.f3376e.mo14337aj().registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.f3376e.mo14311a(C1856a.f3057r)).booleanValue() && (this.f3376e.mo14332ae().mo14647b() || this.f3376e.mo14331ad().mo14802a())) {
                this.f3372a.mo14751b();
            }
            if (this.f3374c.compareAndSet(true, false) && ((Boolean) this.f3376e.mo14311a(C1856a.f3059t)).booleanValue()) {
                if (C2092v.m5047a()) {
                    this.f3376e.mo14286A().mo14789b("AdRefreshManager", "Pausing refresh for a previous request.");
                }
                this.f3372a.mo14751b();
            }
        }
    }

    /* renamed from: a */
    public boolean mo14083a() {
        boolean z;
        synchronized (this.f3373b) {
            z = this.f3372a != null;
        }
        return z;
    }

    /* renamed from: b */
    public long mo14084b() {
        long a;
        synchronized (this.f3373b) {
            a = this.f3372a != null ? this.f3372a.mo14750a() : -1;
        }
        return a;
    }

    /* renamed from: c */
    public void mo14085c() {
        synchronized (this.f3373b) {
            if (this.f3372a != null) {
                this.f3372a.mo14753d();
                m4059k();
            }
        }
    }

    /* renamed from: d */
    public void mo14086d() {
        synchronized (this.f3373b) {
            m4057i();
            this.f3375d = true;
        }
    }

    /* renamed from: e */
    public void mo14087e() {
        synchronized (this.f3373b) {
            m4058j();
            this.f3375d = false;
        }
    }

    /* renamed from: f */
    public boolean mo14088f() {
        return this.f3375d;
    }

    /* renamed from: g */
    public void mo14089g() {
        if (((Boolean) this.f3376e.mo14311a(C1856a.f3056q)).booleanValue()) {
            m4057i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        r0 = (com.applovin.impl.sdk.C1862d.C1864a) r9.f3377f.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        r0.onAdRefresh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14090h() {
        /*
            r9 = this;
            com.applovin.impl.sdk.m r0 = r9.f3376e
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r1 = com.applovin.impl.sdk.p048c.C1856a.f3056q
            java.lang.Object r0 = r0.mo14311a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r0 = r9.f3373b
            monitor-enter(r0)
            boolean r1 = r9.f3375d     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x002c
            boolean r1 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x002a
            com.applovin.impl.sdk.m r1 = r9.f3376e     // Catch:{ all -> 0x008d }
            com.applovin.impl.sdk.v r1 = r1.mo14286A()     // Catch:{ all -> 0x008d }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh."
            r1.mo14789b(r2, r3)     // Catch:{ all -> 0x008d }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            return
        L_0x002c:
            com.applovin.impl.sdk.m r1 = r9.f3376e     // Catch:{ all -> 0x008d }
            com.applovin.impl.sdk.s r1 = r1.mo14332ae()     // Catch:{ all -> 0x008d }
            boolean r1 = r1.mo14647b()     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x004d
            boolean r1 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x004b
            com.applovin.impl.sdk.m r1 = r9.f3376e     // Catch:{ all -> 0x008d }
            com.applovin.impl.sdk.v r1 = r1.mo14286A()     // Catch:{ all -> 0x008d }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Waiting for the full screen ad to be dismissed to resume the timer."
            r1.mo14789b(r2, r3)     // Catch:{ all -> 0x008d }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            return
        L_0x004d:
            com.applovin.impl.sdk.utils.o r1 = r9.f3372a     // Catch:{ all -> 0x008d }
            r2 = 0
            if (r1 == 0) goto L_0x007c
            long r3 = r9.f3378g     // Catch:{ all -> 0x008d }
            long r5 = r9.mo14084b()     // Catch:{ all -> 0x008d }
            long r3 = r3 - r5
            com.applovin.impl.sdk.m r1 = r9.f3376e     // Catch:{ all -> 0x008d }
            com.applovin.impl.sdk.c.b<java.lang.Long> r5 = com.applovin.impl.sdk.p048c.C1856a.f3055p     // Catch:{ all -> 0x008d }
            java.lang.Object r1 = r1.mo14311a(r5)     // Catch:{ all -> 0x008d }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x008d }
            long r5 = r1.longValue()     // Catch:{ all -> 0x008d }
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x0077
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0077
            r9.mo14085c()     // Catch:{ all -> 0x008d }
            r1 = 1
            r2 = r1
            goto L_0x007c
        L_0x0077:
            com.applovin.impl.sdk.utils.o r1 = r9.f3372a     // Catch:{ all -> 0x008d }
            r1.mo14752c()     // Catch:{ all -> 0x008d }
        L_0x007c:
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x0090
            java.lang.ref.WeakReference<com.applovin.impl.sdk.d$a> r0 = r9.f3377f
            java.lang.Object r0 = r0.get()
            com.applovin.impl.sdk.d$a r0 = (com.applovin.impl.sdk.C1862d.C1864a) r0
            if (r0 == 0) goto L_0x0090
            r0.onAdRefresh()
            goto L_0x0090
        L_0x008d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008d }
            throw r1
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1862d.mo14090h():void");
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            mo14089g();
        } else if ("com.applovin.application_resumed".equals(action)) {
            mo14090h();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            m4060l();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            m4061m();
        }
    }
}
