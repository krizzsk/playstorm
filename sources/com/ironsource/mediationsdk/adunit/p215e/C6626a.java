package com.ironsource.mediationsdk.adunit.p215e;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.p210c.p212b.C6607a;
import com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.mediationsdk.adunit.e.a */
public final class C6626a<Smash extends C6622c<?>> {

    /* renamed from: a */
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f17208a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public String f17209b = "";

    /* renamed from: c */
    ConcurrentHashMap<String, AdInfo> f17210c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private String f17211d = "";

    /* renamed from: e */
    private C6622c<?> f17212e;

    /* renamed from: f */
    private final List<String> f17213f;

    /* renamed from: g */
    private final int f17214g;

    /* renamed from: h */
    private final Timer f17215h = new Timer();

    /* renamed from: i */
    private C6628b f17216i;

    /* renamed from: j */
    private final int f17217j = 5;

    public C6626a(List<String> list, int i, C6628b bVar) {
        this.f17213f = list;
        this.f17214g = i;
        this.f17216i = bVar;
    }

    /* renamed from: b */
    private synchronized void m20205b() {
        if (this.f17212e != null) {
            this.f17212e.mo36593c();
        }
    }

    /* renamed from: c */
    private synchronized boolean m20206c() {
        return this.f17212e != null && this.f17212e.mo36608p() && this.f17212e.mo36607o().equals(this.f17211d);
    }

    /* renamed from: d */
    private void m20207d() {
        Iterator it = mo36611a().iterator();
        while (it.hasNext()) {
            C6622c cVar = (C6622c) it.next();
            if (!cVar.equals(this.f17212e)) {
                cVar.mo36593c();
            }
        }
    }

    /* renamed from: a */
    public final AdInfo mo36610a(String str) {
        if (this.f17210c.containsKey(str)) {
            return this.f17210c.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public final CopyOnWriteArrayList<Smash> mo36611a() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f17208a.get(this.f17209b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    /* renamed from: a */
    public final void mo36612a(C6607a.C6608a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        m20207d();
        if (aVar == C6607a.C6608a.AUTOMATIC_LOAD_WHILE_SHOW) {
            this.f17208a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.f17211d)) {
                if (m20206c()) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose("ad from previous waterfall " + this.f17211d + " is still showing - the current waterfall " + this.f17209b + " will be deleted instead");
                    String str2 = this.f17209b;
                    this.f17209b = this.f17211d;
                    this.f17211d = str2;
                }
                final String str3 = this.f17211d;
                this.f17215h.schedule(new TimerTask() {
                    public final void run() {
                        try {
                            IronLog ironLog = IronLog.INTERNAL;
                            ironLog.verbose("removing waterfall with id " + str3 + " from memory");
                            C6626a.this.f17208a.remove(str3);
                            IronLog ironLog2 = IronLog.INTERNAL;
                            ironLog2.verbose("waterfall size is currently " + C6626a.this.f17208a.size());
                            IronLog ironLog3 = IronLog.INTERNAL;
                            ironLog3.verbose("removing adInfo with id " + str3 + " from memory");
                            C6626a.this.f17210c.remove(str3);
                            IronLog ironLog4 = IronLog.INTERNAL;
                            ironLog4.verbose("adInfo size is currently " + C6626a.this.f17210c.size());
                        } finally {
                            cancel();
                        }
                    }
                }, (long) this.f17214g);
            }
        } else {
            this.f17208a.clear();
            this.f17208a.put(str, copyOnWriteArrayList);
        }
        this.f17211d = this.f17209b;
        this.f17209b = str;
        if (this.f17208a.size() > 5) {
            this.f17216i.mo36576a(this.f17208a.size());
        }
    }

    /* renamed from: a */
    public final synchronized void mo36613a(C6622c<?> cVar) {
        IronLog.INTERNAL.verbose("");
        if (this.f17212e != null && !this.f17212e.equals(cVar)) {
            m20205b();
        }
        this.f17212e = cVar;
    }

    /* renamed from: a */
    public final void mo36614a(String str, ImpressionData impressionData) {
        if (!TextUtils.isEmpty(str) && impressionData != null) {
            this.f17210c.put(str, new AdInfo(impressionData));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r3.f17213f.contains(r6) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r3.f17212e.mo36606n().equals(r6) == false) goto L_0x0007;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo36615a(com.ironsource.mediationsdk.adunit.p210c.p212b.C6607a.C6608a r4, java.lang.String r5, java.lang.String r6, com.ironsource.mediationsdk.LoadWhileShowSupportState r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.mediationsdk.adunit.c.b.a$a r0 = com.ironsource.mediationsdk.adunit.p210c.p212b.C6607a.C6608a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch:{ all -> 0x0059 }
            r1 = 0
            r2 = 1
            if (r4 == r0) goto L_0x0009
        L_0x0007:
            r1 = r2
            goto L_0x003f
        L_0x0009:
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f17212e     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0007
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f17212e     // Catch:{ all -> 0x0059 }
            boolean r4 = r4.mo36608p()     // Catch:{ all -> 0x0059 }
            if (r4 != 0) goto L_0x0016
            goto L_0x0007
        L_0x0016:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK     // Catch:{ all -> 0x0059 }
            if (r7 != r4) goto L_0x0027
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f17212e     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = r4.mo36401k()     // Catch:{ all -> 0x0059 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0027
            goto L_0x003f
        L_0x0027:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE     // Catch:{ all -> 0x0059 }
            if (r7 == r4) goto L_0x0033
            java.util.List<java.lang.String> r4 = r3.f17213f     // Catch:{ all -> 0x0059 }
            boolean r4 = r4.contains(r6)     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0007
        L_0x0033:
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f17212e     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = r4.mo36606n()     // Catch:{ all -> 0x0059 }
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0007
        L_0x003f:
            if (r1 != 0) goto L_0x0057
            com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r6.<init>()     // Catch:{ all -> 0x0059 }
            r6.append(r5)     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = " does not support load while show and will not be added to the auction request"
            r6.append(r5)     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x0059 }
            r4.verbose(r5)     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r3)
            return r1
        L_0x0059:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p215e.C6626a.mo36615a(com.ironsource.mediationsdk.adunit.c.b.a$a, java.lang.String, java.lang.String, com.ironsource.mediationsdk.LoadWhileShowSupportState):boolean");
    }
}
