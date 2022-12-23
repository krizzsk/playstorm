package com.apm.insight.p022k;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.apm.insight.C1229g;
import com.apm.insight.Npth;
import com.apm.insight.entity.C1220c;
import com.apm.insight.p023l.C1311q;
import com.apm.insight.runtime.C1341a;
import com.apm.insight.runtime.C1379o;
import com.apm.insight.runtime.C1384p;
import com.apm.insight.runtime.C1393u;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;

/* renamed from: com.apm.insight.k.g */
public final class C1274g {

    /* renamed from: a */
    private static final ConcurrentHashMap<Object, ConcurrentLinkedQueue<C1220c>> f1252a = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final HashMap<Object, HashMap<String, ConcurrentLinkedQueue<C1220c>>> f1253b = new HashMap<>();

    /* renamed from: c */
    private static volatile C1274g f1254c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1393u f1255d = C1384p.m2264b();

    /* renamed from: e */
    private volatile boolean f1256e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Runnable f1257f = new Runnable() {
        public void run() {
            if (!Npth.isStopUpload()) {
                if (!C1274g.f1253b.isEmpty() && C1379o.m2250e()) {
                    C1274g.m1689f();
                }
                C1274g.this.mo12339c();
                C1274g.this.f1255d.mo12527a(C1274g.this.f1257f, 30000);
            }
        }
    };

    private C1274g() {
    }

    /* renamed from: a */
    public static C1274g m1680a() {
        if (f1254c == null) {
            synchronized (C1274g.class) {
                if (f1254c == null) {
                    f1254c = new C1274g();
                }
            }
        }
        return f1254c;
    }

    /* renamed from: a */
    public static void m1682a(C1220c cVar) {
        m1683a(C1229g.m1492a(), cVar);
    }

    /* renamed from: a */
    public static void m1683a(final Object obj, final C1220c cVar) {
        Handler a = C1384p.m2264b().mo12524a();
        if (a == null || a.getLooper() != Looper.myLooper()) {
            C1384p.m2264b().mo12526a((Runnable) new Runnable() {
                public void run() {
                    C1274g.m1683a(obj, cVar);
                }
            });
            return;
        }
        if (obj == null) {
            obj = C1229g.m1492a();
        }
        if (!C1379o.m2250e()) {
            C1311q.m1872a("EventUploadQueue", (Object) "enqueue before init.");
            m1686c(obj, cVar);
            return;
        }
        if (!C1341a.m2040a(obj)) {
            C1256a.m1608b();
        }
        m1689f();
        String str = null;
        try {
            str = cVar.mo12265h().getString("log_type");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (TextUtils.isEmpty(str) || !C1341a.m2041a(obj, str)) {
            C1311q.m1872a("EventUploadQueue", (Object) "logType " + str + " not sampled");
            return;
        }
        C1311q.m1872a("EventUploadQueue", (Object) "logType " + str + " enqueued");
        m1685b(obj, cVar);
    }

    /* renamed from: b */
    private static void m1685b(Object obj, C1220c cVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        synchronized (obj) {
            concurrentLinkedQueue = f1252a.get(obj);
            if (concurrentLinkedQueue == null) {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                f1252a.put(obj, concurrentLinkedQueue);
            }
        }
        concurrentLinkedQueue.add(cVar);
        int size = f1252a.size();
        boolean z = size >= 30;
        C1311q.m1876b((Object) "[enqueue] size=" + size);
        if (z) {
            m1690g();
        }
    }

    /* renamed from: c */
    private static void m1686c(Object obj, C1220c cVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        try {
            String string = cVar.mo12265h().getString("log_type");
            synchronized (f1253b) {
                HashMap hashMap = f1253b.get(string);
                if (hashMap == null) {
                    hashMap = new HashMap();
                    f1253b.put(obj, hashMap);
                }
                concurrentLinkedQueue = (ConcurrentLinkedQueue) hashMap.get(string);
                if (concurrentLinkedQueue == null) {
                    concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    hashMap.put(string, concurrentLinkedQueue);
                }
            }
            concurrentLinkedQueue.add(cVar);
            if (concurrentLinkedQueue.size() > 100) {
                concurrentLinkedQueue.poll();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m1689f() {
        HashMap hashMap;
        synchronized (f1253b) {
            hashMap = new HashMap(f1253b);
            f1253b.clear();
        }
        if (!C1341a.m2043b()) {
            C1311q.m1872a("EventUploadQueue", (Object) "ApmConfig not inited, clear cache.");
            return;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                String str = (String) entry2.getKey();
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) entry2.getValue();
                if (concurrentLinkedQueue == null || (C1341a.m2043b() && !C1341a.m2041a(entry.getKey(), str))) {
                    C1311q.m1872a("EventUploadQueue", (Object) "logType " + str + " not sampled");
                } else {
                    while (!concurrentLinkedQueue.isEmpty()) {
                        try {
                            C1220c cVar = (C1220c) concurrentLinkedQueue.poll();
                            if (cVar == null) {
                                break;
                            }
                            m1685b(entry.getKey(), cVar);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    private static void m1690g() {
        if (C1379o.m2250e() && !Npth.isStopUpload()) {
            try {
                C1384p.m2264b().mo12526a((Runnable) new Runnable() {
                    public void run() {
                        C1274g.m1680a().mo12339c();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo12338b() {
        if (f1252a.isEmpty()) {
            this.f1255d.mo12527a(this.f1257f, 30000);
        } else {
            this.f1255d.mo12526a(this.f1257f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r1.hasNext() == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        r2 = r1.next();
        r4 = (java.util.concurrent.ConcurrentLinkedQueue) r2.getValue();
        r2 = r2.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        r7.f1256e = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        r0 = new java.util.LinkedList();
        r1 = f1252a.entrySet().iterator();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12339c() {
        /*
            r7 = this;
            com.apm.insight.runtime.u r0 = r7.f1255d
            monitor-enter(r0)
            boolean r1 = r7.f1256e     // Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            return
        L_0x0009:
            r1 = 1
            r7.f1256e = r1     // Catch:{ all -> 0x0080 }
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.util.concurrent.ConcurrentLinkedQueue<com.apm.insight.entity.c>> r1 = f1252a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x001c:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x007d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getValue()
            java.util.concurrent.ConcurrentLinkedQueue r4 = (java.util.concurrent.ConcurrentLinkedQueue) r4
            java.lang.Object r2 = r2.getKey()
        L_0x0033:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x001c
            r5 = r3
        L_0x003a:
            r6 = 30
            if (r5 >= r6) goto L_0x004f
            boolean r6 = r4.isEmpty()     // Catch:{ all -> 0x0078 }
            if (r6 == 0) goto L_0x0045
            goto L_0x004f
        L_0x0045:
            java.lang.Object r6 = r4.poll()     // Catch:{ all -> 0x0078 }
            r0.add(r6)     // Catch:{ all -> 0x0078 }
            int r5 = r5 + 1
            goto L_0x003a
        L_0x004f:
            boolean r5 = r0.isEmpty()     // Catch:{ all -> 0x0078 }
            if (r5 == 0) goto L_0x0056
            goto L_0x001c
        L_0x0056:
            com.apm.insight.runtime.a.f r5 = com.apm.insight.runtime.p024a.C1352f.m2138a()     // Catch:{ all -> 0x0078 }
            org.json.JSONArray r6 = com.apm.insight.entity.C1218b.m1445a((java.lang.Object) r2)     // Catch:{ all -> 0x0078 }
            com.apm.insight.entity.a r5 = r5.mo12479a((java.util.List<com.apm.insight.entity.C1217a>) r0, (org.json.JSONArray) r6)     // Catch:{ all -> 0x0078 }
            if (r5 == 0) goto L_0x0074
            java.lang.String r6 = "upload events"
            com.apm.insight.p023l.C1311q.m1870a((java.lang.Object) r6)     // Catch:{ all -> 0x0078 }
            com.apm.insight.k.d r6 = com.apm.insight.p022k.C1268d.m1648a()     // Catch:{ all -> 0x0078 }
            org.json.JSONObject r5 = r5.mo12265h()     // Catch:{ all -> 0x0078 }
            r6.mo12330a(r5)     // Catch:{ all -> 0x0078 }
        L_0x0074:
            r0.clear()     // Catch:{ all -> 0x0078 }
            goto L_0x0033
        L_0x0078:
            r5 = move-exception
            com.apm.insight.p023l.C1311q.m1877b((java.lang.Throwable) r5)
            goto L_0x0033
        L_0x007d:
            r7.f1256e = r3
            return
        L_0x0080:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p022k.C1274g.mo12339c():void");
    }
}
