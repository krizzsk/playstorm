package com.adcolony.sdk;

import android.util.Log;
import com.adcolony.sdk.C0821f0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.s0 */
class C0953s0 {

    /* renamed from: a */
    C0813d0 f740a;

    /* renamed from: b */
    ScheduledExecutorService f741b;

    /* renamed from: c */
    List<C0821f0> f742c = new ArrayList();

    /* renamed from: d */
    HashMap<String, Object> f743d;

    /* renamed from: e */
    private C0732b0 f744e = new C0732b0("adcolony_android", "4.8.0", "Production");

    /* renamed from: com.adcolony.sdk.s0$a */
    class C0954a implements Runnable {
        C0954a() {
        }

        public void run() {
            C0953s0.this.mo11027a();
        }
    }

    /* renamed from: com.adcolony.sdk.s0$b */
    class C0955b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0821f0 f746a;

        C0955b(C0821f0 f0Var) {
            this.f746a = f0Var;
        }

        public void run() {
            C0953s0.this.f742c.add(this.f746a);
        }
    }

    C0953s0(C0813d0 d0Var, ScheduledExecutorService scheduledExecutorService, HashMap<String, Object> hashMap) {
        this.f740a = d0Var;
        this.f741b = scheduledExecutorService;
        this.f743d = hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo11028a(long j, TimeUnit timeUnit) {
        try {
            if (!this.f741b.isShutdown() && !this.f741b.isTerminated()) {
                this.f741b.scheduleAtFixedRate(new C0954a(), j, j, timeUnit);
            }
        } catch (RuntimeException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f741b.shutdownNow();
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo11030b() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.ScheduledExecutorService r0 = r4.f741b     // Catch:{ all -> 0x004a }
            r0.shutdown()     // Catch:{ all -> 0x004a }
            java.util.concurrent.ScheduledExecutorService r0 = r4.f741b     // Catch:{ InterruptedException -> 0x003c }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x003c }
            r2 = 1
            boolean r0 = r0.awaitTermination(r2, r1)     // Catch:{ InterruptedException -> 0x003c }
            if (r0 != 0) goto L_0x0048
            java.util.concurrent.ScheduledExecutorService r0 = r4.f741b     // Catch:{ InterruptedException -> 0x003c }
            r0.shutdownNow()     // Catch:{ InterruptedException -> 0x003c }
            java.util.concurrent.ScheduledExecutorService r0 = r4.f741b     // Catch:{ InterruptedException -> 0x003c }
            boolean r0 = r0.awaitTermination(r2, r1)     // Catch:{ InterruptedException -> 0x003c }
            if (r0 != 0) goto L_0x0048
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ InterruptedException -> 0x003c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x003c }
            r1.<init>()     // Catch:{ InterruptedException -> 0x003c }
            java.lang.Class<com.adcolony.sdk.s0> r2 = com.adcolony.sdk.C0953s0.class
            java.lang.String r2 = r2.getSimpleName()     // Catch:{ InterruptedException -> 0x003c }
            r1.append(r2)     // Catch:{ InterruptedException -> 0x003c }
            java.lang.String r2 = ": ScheduledExecutorService did not terminate"
            r1.append(r2)     // Catch:{ InterruptedException -> 0x003c }
            java.lang.String r1 = r1.toString()     // Catch:{ InterruptedException -> 0x003c }
            r0.println(r1)     // Catch:{ InterruptedException -> 0x003c }
            goto L_0x0048
        L_0x003c:
            java.util.concurrent.ScheduledExecutorService r0 = r4.f741b     // Catch:{ all -> 0x004a }
            r0.shutdownNow()     // Catch:{ all -> 0x004a }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x004a }
            r0.interrupt()     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r4)
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0953s0.mo11030b():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo11033c(String str) {
        mo11031b(new C0821f0.C0822a().mo10708a(2).mo10709a(this.f744e).mo10710a(str).mo10711a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo11034d(String str) {
        mo11031b(new C0821f0.C0822a().mo10708a(1).mo10709a(this.f744e).mo10710a(str).mo10711a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo11035e(String str) {
        this.f743d.put("controllerVersion", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void mo11036f(String str) {
        this.f743d.put("sessionId", str);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11027a() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.adcolony.sdk.f0> r0 = r2.f742c     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            int r0 = r0.size()     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            if (r0 <= 0) goto L_0x0029
            com.adcolony.sdk.b0 r0 = r2.f744e     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            java.util.List<com.adcolony.sdk.f0> r1 = r2.f742c     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            java.lang.String r0 = r2.mo11026a((com.adcolony.sdk.C0732b0) r0, (java.util.List<com.adcolony.sdk.C0821f0>) r1)     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            com.adcolony.sdk.d0 r1 = r2.f740a     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            r1.mo10680a(r0)     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            java.util.List<com.adcolony.sdk.f0> r0 = r2.f742c     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            r0.clear()     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            goto L_0x0029
        L_0x001c:
            r0 = move-exception
            goto L_0x002b
        L_0x001e:
            java.util.List<com.adcolony.sdk.f0> r0 = r2.f742c     // Catch:{ all -> 0x001c }
            r0.clear()     // Catch:{ all -> 0x001c }
            goto L_0x0029
        L_0x0024:
            java.util.List<com.adcolony.sdk.f0> r0 = r2.f742c     // Catch:{ all -> 0x001c }
            r0.clear()     // Catch:{ all -> 0x001c }
        L_0x0029:
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            return
        L_0x002b:
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0953s0.mo11027a():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo11032b(String str) {
        mo11031b(new C0821f0.C0822a().mo10708a(0).mo10709a(this.f744e).mo10710a(str).mo10711a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo11031b(C0821f0 f0Var) {
        try {
            if (!this.f741b.isShutdown() && !this.f741b.isTerminated()) {
                this.f741b.submit(new C0955b(f0Var));
            }
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo11029a(String str) {
        mo11031b(new C0821f0.C0822a().mo10708a(3).mo10709a(this.f744e).mo10710a(str).mo10711a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo11026a(C0732b0 b0Var, List<C0821f0> list) throws JSONException {
        C0823f1 f1Var = new C0823f1();
        f1Var.mo10717a(FirebaseAnalytics.Param.INDEX, b0Var.mo10499b());
        f1Var.mo10717a("environment", b0Var.mo10498a());
        f1Var.mo10717a("version", b0Var.mo10500c());
        C0819e1 e1Var = new C0819e1();
        for (C0821f0 a : list) {
            e1Var.mo10686a(m954a(a));
        }
        f1Var.mo10715a("logs", e1Var);
        return f1Var.toString();
    }

    /* renamed from: a */
    private synchronized C0823f1 m954a(C0821f0 f0Var) throws JSONException {
        C0823f1 f1Var;
        f1Var = new C0823f1((Map<?, ?>) this.f743d);
        f1Var.mo10717a("environment", f0Var.mo10703a().mo10498a());
        f1Var.mo10717a("level", f0Var.mo10704b());
        f1Var.mo10717a("message", f0Var.mo10705c());
        f1Var.mo10717a("clientTimestamp", f0Var.mo10706d());
        C0823f1 f1Var2 = new C0823f1(C0714a.m136b().mo10850u().getMediationInfo());
        C0823f1 f1Var3 = new C0823f1(C0714a.m136b().mo10850u().getPluginInfo());
        f1Var.mo10717a("mediation_network", C0764c0.m336h(f1Var2, "name"));
        f1Var.mo10717a("mediation_network_version", C0764c0.m336h(f1Var2, "version"));
        f1Var.mo10717a(TapjoyConstants.TJC_PLUGIN, C0764c0.m336h(f1Var3, "name"));
        f1Var.mo10717a("plugin_version", C0764c0.m336h(f1Var3, "version"));
        C0819e1 b = C0714a.m136b().mo10846q().mo10765b();
        if (b == null || b.mo10689a("batteryInfo")) {
            f1Var.mo10725b("batteryInfo", C0714a.m136b().mo10843n().mo10989l());
        }
        if (b != null) {
            f1Var.mo10719a(b);
        }
        return f1Var;
    }
}
