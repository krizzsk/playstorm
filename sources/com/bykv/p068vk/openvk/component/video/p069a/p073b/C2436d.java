package com.bykv.p068vk.openvk.component.video.p069a.p073b;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2535b;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2422b;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p074a.C2411b;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p074a.C2413c;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p075b.C2426b;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p075b.C2427c;
import com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a;
import com.bytedance.sdk.component.p125f.C2955g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.d */
/* compiled from: Preloader */
public class C2436d {

    /* renamed from: e */
    private static volatile C2436d f5156e;

    /* renamed from: a */
    private volatile int f5157a = 163840;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final SparseArray<Map<String, C2422b>> f5158b = new SparseArray<>(2);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2444b<Runnable> f5159c;

    /* renamed from: d */
    private final ExecutorService f5160d;

    /* renamed from: f */
    private volatile C2427c f5161f;

    /* renamed from: g */
    private volatile C2413c f5162g;

    /* renamed from: h */
    private volatile C2411b f5163h;

    /* renamed from: i */
    private final HashSet<C2443a> f5164i = new HashSet<>();

    /* renamed from: j */
    private final C2422b.C2424b f5165j = new C2422b.C2424b() {
        /* renamed from: a */
        public void mo16134a(C2422b bVar) {
            int f = bVar.mo16094f();
            synchronized (C2436d.this.f5158b) {
                Map map = (Map) C2436d.this.f5158b.get(f);
                if (map != null) {
                    map.remove(bVar.f5093h);
                }
            }
            if (C2446e.f5187c) {
                Log.d("TAG_PROXY_Preloader", "afterExecute, key: " + bVar.f5093h);
            }
        }
    };

    /* renamed from: k */
    private volatile C2431c f5166k;

    /* renamed from: l */
    private volatile C2431c f5167l;

    /* renamed from: m */
    private volatile String f5168m;

    /* renamed from: n */
    private volatile boolean f5169n;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16147a(C2413c cVar) {
        this.f5162g = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16148a(C2427c cVar) {
        this.f5161f = cVar;
    }

    /* renamed from: a */
    public void mo16145a(int i) {
        if (i > 0) {
            this.f5157a = i;
        }
        if (C2446e.f5187c) {
            Log.i("TAG_PROXY_Preloader", "MaxPreloadSize: " + i);
        }
    }

    private C2436d() {
        C2444b<Runnable> bVar = new C2444b<>();
        this.f5159c = bVar;
        ExecutorService a = m5911a(bVar);
        this.f5160d = a;
        this.f5159c.mo16163a((ThreadPoolExecutor) a);
        this.f5158b.put(0, new HashMap());
        this.f5158b.put(1, new HashMap());
    }

    /* renamed from: a */
    public synchronized void mo16146a(long j, long j2, long j3) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2431c mo16144a() {
        return this.f5166k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2431c mo16154b() {
        return this.f5167l;
    }

    /* renamed from: c */
    public static C2436d m5913c() {
        if (f5156e == null) {
            synchronized (C2436d.class) {
                if (f5156e == null) {
                    f5156e = new C2436d();
                }
            }
        }
        return f5156e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.bykv.vk.openvk.component.video.a.b.b} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.HashSet] */
    /* JADX WARNING: type inference failed for: r0v15, types: [java.util.HashSet] */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v29 */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16150a(boolean r8, java.lang.String r9) {
        /*
            r7 = this;
            r7.f5168m = r9
            r7.f5169n = r8
            boolean r0 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setCurrentPlayKey, "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r0, r1)
        L_0x001e:
            r0 = 0
            if (r9 != 0) goto L_0x007b
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r1 = r7.f5164i
            monitor-enter(r1)
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r8 = r7.f5164i     // Catch:{ all -> 0x0078 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0078 }
            if (r8 != 0) goto L_0x0038
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0078 }
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r8 = r7.f5164i     // Catch:{ all -> 0x0078 }
            r0.<init>(r8)     // Catch:{ all -> 0x0078 }
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r8 = r7.f5164i     // Catch:{ all -> 0x0078 }
            r8.clear()     // Catch:{ all -> 0x0078 }
        L_0x0038:
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0141
            java.util.Iterator r8 = r0.iterator()
        L_0x003f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0141
            java.lang.Object r9 = r8.next()
            com.bykv.vk.openvk.component.video.a.b.d$a r9 = (com.bykv.p068vk.openvk.component.video.p069a.p073b.C2436d.C2443a) r9
            boolean r1 = r9.f5178a
            boolean r2 = r9.f5179b
            int r3 = r9.f5180c
            java.lang.String r4 = r9.f5181d
            java.util.Map<java.lang.String, java.lang.String> r5 = r9.f5182e
            java.lang.String[] r6 = r9.f5183f
            r0 = r7
            r0.mo16151a(r1, r2, r3, r4, r5, r6)
            boolean r0 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setCurrentPlayKey, resume preload: "
            r1.append(r2)
            java.lang.String r9 = r9.f5181d
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            android.util.Log.i(r0, r9)
            goto L_0x003f
        L_0x0078:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            throw r8
        L_0x007b:
            int r1 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5192h
            r2 = 3
            if (r1 == r2) goto L_0x00aa
            r3 = 2
            if (r1 != r3) goto L_0x0084
            goto L_0x00aa
        L_0x0084:
            r2 = 1
            if (r1 != r2) goto L_0x0141
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r1 = r7.f5158b
            monitor-enter(r1)
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r2 = r7.f5158b     // Catch:{ all -> 0x00a7 }
            int r8 = com.bykv.p068vk.openvk.component.video.p069a.p073b.p075b.C2426b.m5899a(r8)     // Catch:{ all -> 0x00a7 }
            java.lang.Object r8 = r2.get(r8)     // Catch:{ all -> 0x00a7 }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ all -> 0x00a7 }
            if (r8 == 0) goto L_0x009f
            java.lang.Object r8 = r8.remove(r9)     // Catch:{ all -> 0x00a7 }
            r0 = r8
            com.bykv.vk.openvk.component.video.a.b.b r0 = (com.bykv.p068vk.openvk.component.video.p069a.p073b.C2422b) r0     // Catch:{ all -> 0x00a7 }
        L_0x009f:
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0141
            r0.mo16087a()
            goto L_0x0141
        L_0x00a7:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            throw r8
        L_0x00aa:
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r8 = r7.f5158b
            monitor-enter(r8)
            r9 = 0
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r3 = r7.f5158b     // Catch:{ all -> 0x0142 }
            int r3 = r3.size()     // Catch:{ all -> 0x0142 }
        L_0x00b4:
            if (r9 >= r3) goto L_0x00e2
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r4 = r7.f5158b     // Catch:{ all -> 0x0142 }
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r5 = r7.f5158b     // Catch:{ all -> 0x0142 }
            int r5 = r5.keyAt(r9)     // Catch:{ all -> 0x0142 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0142 }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x0142 }
            if (r4 == 0) goto L_0x00df
            java.util.Collection r5 = r4.values()     // Catch:{ all -> 0x0142 }
            if (r5 == 0) goto L_0x00dc
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x0142 }
            if (r6 != 0) goto L_0x00dc
            if (r0 != 0) goto L_0x00d9
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0142 }
            r0.<init>()     // Catch:{ all -> 0x0142 }
        L_0x00d9:
            r0.addAll(r5)     // Catch:{ all -> 0x0142 }
        L_0x00dc:
            r4.clear()     // Catch:{ all -> 0x0142 }
        L_0x00df:
            int r9 = r9 + 1
            goto L_0x00b4
        L_0x00e2:
            monitor-exit(r8)     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x0141
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L_0x0141
            java.util.Iterator r8 = r0.iterator()
        L_0x00ef:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x011b
            java.lang.Object r9 = r8.next()
            com.bykv.vk.openvk.component.video.a.b.b r9 = (com.bykv.p068vk.openvk.component.video.p069a.p073b.C2422b) r9
            r9.mo16087a()
            boolean r3 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c
            if (r3 == 0) goto L_0x00ef
            java.lang.String r3 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "setCurrentPlayKey, cancel preload: "
            r4.append(r5)
            java.lang.String r9 = r9.f5092g
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            android.util.Log.i(r3, r9)
            goto L_0x00ef
        L_0x011b:
            if (r1 != r2) goto L_0x0141
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r8 = r7.f5164i
            monitor-enter(r8)
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x013e }
        L_0x0124:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x013c
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x013e }
            com.bykv.vk.openvk.component.video.a.b.b r0 = (com.bykv.p068vk.openvk.component.video.p069a.p073b.C2422b) r0     // Catch:{ all -> 0x013e }
            java.lang.Object r0 = r0.f5124n     // Catch:{ all -> 0x013e }
            com.bykv.vk.openvk.component.video.a.b.d$a r0 = (com.bykv.p068vk.openvk.component.video.p069a.p073b.C2436d.C2443a) r0     // Catch:{ all -> 0x013e }
            if (r0 == 0) goto L_0x0124
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r1 = r7.f5164i     // Catch:{ all -> 0x013e }
            r1.add(r0)     // Catch:{ all -> 0x013e }
            goto L_0x0124
        L_0x013c:
            monitor-exit(r8)     // Catch:{ all -> 0x013e }
            goto L_0x0141
        L_0x013e:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x013e }
            throw r9
        L_0x0141:
            return
        L_0x0142:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0142 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p068vk.openvk.component.video.p069a.p073b.C2436d.mo16150a(boolean, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo16152a(boolean z, boolean z2, int i, String str, String... strArr) {
        mo16151a(z, z2, i, str, (Map<String, String>) null, strArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0106, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0128, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0155, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16151a(boolean r19, boolean r20, int r21, java.lang.String r22, java.util.Map<java.lang.String, java.lang.String> r23, java.lang.String... r24) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r9 = r22
            r10 = r24
            boolean r2 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c
            if (r2 == 0) goto L_0x0013
            java.lang.String r2 = "TAG_PROXY_Preloader"
            java.lang.String r3 = "preload start ！！！！"
            android.util.Log.d(r2, r3)
        L_0x0013:
            if (r0 == 0) goto L_0x0018
            com.bykv.vk.openvk.component.video.a.b.a.b r2 = r1.f5163h
            goto L_0x001a
        L_0x0018:
            com.bykv.vk.openvk.component.video.a.b.a.c r2 = r1.f5162g
        L_0x001a:
            r11 = r2
            com.bykv.vk.openvk.component.video.a.b.b.c r12 = r1.f5161f
            if (r11 == 0) goto L_0x01d3
            if (r12 != 0) goto L_0x0023
            goto L_0x01d3
        L_0x0023:
            boolean r2 = android.text.TextUtils.isEmpty(r22)
            if (r2 != 0) goto L_0x01d2
            if (r10 == 0) goto L_0x01d2
            int r2 = r10.length
            if (r2 > 0) goto L_0x0030
            goto L_0x01d2
        L_0x0030:
            if (r21 > 0) goto L_0x0036
            int r2 = r1.f5157a
            r13 = r2
            goto L_0x0038
        L_0x0036:
            r13 = r21
        L_0x0038:
            if (r20 == 0) goto L_0x003c
            r14 = r9
            goto L_0x0041
        L_0x003c:
            java.lang.String r2 = com.bykv.p068vk.openvk.component.video.api.p088f.C2535b.m6426a((java.lang.String) r22)
            r14 = r2
        L_0x0041:
            java.io.File r2 = r11.mo16100d(r14)
            if (r2 == 0) goto L_0x0077
            long r3 = r2.length()
            long r5 = (long) r13
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0077
            boolean r0 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "no need preload, file size: "
            r3.append(r4)
            long r4 = r2.length()
            r3.append(r4)
            java.lang.String r2 = ", need preload size: "
            r3.append(r2)
            r3.append(r13)
            java.lang.String r2 = r3.toString()
            android.util.Log.i(r0, r2)
        L_0x0076:
            return
        L_0x0077:
            com.bykv.vk.openvk.component.video.a.b.f r2 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2455f.m5963a()
            int r3 = com.bykv.p068vk.openvk.component.video.p069a.p073b.p075b.C2426b.m5899a(r19)
            boolean r2 = r2.mo16181a((int) r3, (java.lang.String) r14)
            if (r2 == 0) goto L_0x00a0
            boolean r0 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "has running proxy task, skip preload for key: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r0, r2)
        L_0x009f:
            return
        L_0x00a0:
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r15 = r1.f5158b
            monitor-enter(r15)
            android.util.SparseArray<java.util.Map<java.lang.String, com.bykv.vk.openvk.component.video.a.b.b>> r2 = r1.f5158b     // Catch:{ all -> 0x01cf }
            r16 = 0
            r8 = 1
            if (r0 == 0) goto L_0x00ac
            r3 = r8
            goto L_0x00ae
        L_0x00ac:
            r3 = r16
        L_0x00ae:
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x01cf }
            r7 = r2
            java.util.Map r7 = (java.util.Map) r7     // Catch:{ all -> 0x01cf }
            boolean r2 = r7.containsKey(r14)     // Catch:{ all -> 0x01cf }
            if (r2 == 0) goto L_0x00bd
            monitor-exit(r15)     // Catch:{ all -> 0x01cf }
            return
        L_0x00bd:
            com.bykv.vk.openvk.component.video.a.b.d$a r6 = new com.bykv.vk.openvk.component.video.a.b.d$a     // Catch:{ all -> 0x01cf }
            r2 = r6
            r3 = r19
            r4 = r20
            r5 = r13
            r10 = r6
            r6 = r22
            r17 = r7
            r7 = r23
            r21 = r13
            r13 = r8
            r8 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x01cf }
            java.lang.String r2 = r1.f5168m     // Catch:{ all -> 0x01cf }
            if (r2 == 0) goto L_0x0156
            int r3 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5192h     // Catch:{ all -> 0x01cf }
            r4 = 3
            if (r3 != r4) goto L_0x010a
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r2 = r1.f5164i     // Catch:{ all -> 0x01cf }
            monitor-enter(r2)     // Catch:{ all -> 0x01cf }
            java.util.HashSet<com.bykv.vk.openvk.component.video.a.b.d$a> r0 = r1.f5164i     // Catch:{ all -> 0x0107 }
            r0.add(r10)     // Catch:{ all -> 0x0107 }
            monitor-exit(r2)     // Catch:{ all -> 0x0107 }
            boolean r0 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x0105
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cf }
            r2.<init>()     // Catch:{ all -> 0x01cf }
            java.lang.String r3 = "cancel preload: "
            r2.append(r3)     // Catch:{ all -> 0x01cf }
            r2.append(r9)     // Catch:{ all -> 0x01cf }
            java.lang.String r3 = ", add to pending queue"
            r2.append(r3)     // Catch:{ all -> 0x01cf }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01cf }
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x01cf }
        L_0x0105:
            monitor-exit(r15)     // Catch:{ all -> 0x01cf }
            return
        L_0x0107:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0107 }
            throw r0     // Catch:{ all -> 0x01cf }
        L_0x010a:
            r4 = 2
            if (r3 != r4) goto L_0x0129
            boolean r0 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x0127
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cf }
            r2.<init>()     // Catch:{ all -> 0x01cf }
            java.lang.String r3 = "cancel preload: "
            r2.append(r3)     // Catch:{ all -> 0x01cf }
            r2.append(r9)     // Catch:{ all -> 0x01cf }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01cf }
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x01cf }
        L_0x0127:
            monitor-exit(r15)     // Catch:{ all -> 0x01cf }
            return
        L_0x0129:
            if (r3 != r13) goto L_0x0156
            boolean r3 = r1.f5169n     // Catch:{ all -> 0x01cf }
            if (r3 != r0) goto L_0x0156
            boolean r0 = r2.equals(r14)     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x0156
            boolean r0 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x0154
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cf }
            r2.<init>()     // Catch:{ all -> 0x01cf }
            java.lang.String r3 = "cancel preload: "
            r2.append(r3)     // Catch:{ all -> 0x01cf }
            r2.append(r9)     // Catch:{ all -> 0x01cf }
            java.lang.String r3 = ", it is playing"
            r2.append(r3)     // Catch:{ all -> 0x01cf }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01cf }
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x01cf }
        L_0x0154:
            monitor-exit(r15)     // Catch:{ all -> 0x01cf }
            return
        L_0x0156:
            r0 = 0
            java.util.List r2 = com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a.m6053a((java.util.Map<java.lang.String, java.lang.String>) r23)     // Catch:{ all -> 0x01cf }
            java.util.List r2 = com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a.m6052a((java.util.List<com.bykv.p068vk.openvk.component.video.p069a.p073b.C2473i.C2475b>) r2)     // Catch:{ all -> 0x01cf }
            if (r2 == 0) goto L_0x0189
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01cf }
            int r3 = r2.size()     // Catch:{ all -> 0x01cf }
            r0.<init>(r3)     // Catch:{ all -> 0x01cf }
            int r3 = r2.size()     // Catch:{ all -> 0x01cf }
            r4 = r16
        L_0x0170:
            if (r4 >= r3) goto L_0x0189
            java.lang.Object r5 = r2.get(r4)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.i$b r5 = (com.bykv.p068vk.openvk.component.video.p069a.p073b.C2473i.C2475b) r5     // Catch:{ all -> 0x01cf }
            if (r5 == 0) goto L_0x0186
            com.bykv.vk.openvk.component.video.a.b.i$b r6 = new com.bykv.vk.openvk.component.video.a.b.i$b     // Catch:{ all -> 0x01cf }
            java.lang.String r7 = r5.f5267a     // Catch:{ all -> 0x01cf }
            java.lang.String r5 = r5.f5268b     // Catch:{ all -> 0x01cf }
            r6.<init>(r7, r5)     // Catch:{ all -> 0x01cf }
            r0.add(r6)     // Catch:{ all -> 0x01cf }
        L_0x0186:
            int r4 = r4 + 1
            goto L_0x0170
        L_0x0189:
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = new com.bykv.vk.openvk.component.video.a.b.b$a     // Catch:{ all -> 0x01cf }
            r2.<init>()     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo16124a((com.bykv.p068vk.openvk.component.video.p069a.p073b.p074a.C2410a) r11)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo16126a((com.bykv.p068vk.openvk.component.video.p069a.p073b.p075b.C2427c) r12)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo16130a((java.lang.String) r9)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo16133b(r14)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.l r3 = new com.bykv.vk.openvk.component.video.a.b.l     // Catch:{ all -> 0x01cf }
            java.util.List r4 = com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a.m6054a((java.lang.String[]) r24)     // Catch:{ all -> 0x01cf }
            r3.<init>((java.util.List<java.lang.String>) r4)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo16128a((com.bykv.p068vk.openvk.component.video.p069a.p073b.C2480l) r3)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b$a r0 = r2.mo16131a((java.util.List<com.bykv.p068vk.openvk.component.video.p069a.p073b.C2473i.C2475b>) r0)     // Catch:{ all -> 0x01cf }
            r2 = r21
            com.bykv.vk.openvk.component.video.a.b.b$a r0 = r0.mo16123a((int) r2)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b$b r2 = r1.f5165j     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b$a r0 = r0.mo16125a((com.bykv.p068vk.openvk.component.video.p069a.p073b.C2422b.C2424b) r2)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b$a r0 = r0.mo16129a((java.lang.Object) r10)     // Catch:{ all -> 0x01cf }
            com.bykv.vk.openvk.component.video.a.b.b r0 = r0.mo16132a()     // Catch:{ all -> 0x01cf }
            r2 = r17
            r2.put(r14, r0)     // Catch:{ all -> 0x01cf }
            monitor-exit(r15)     // Catch:{ all -> 0x01cf }
            java.util.concurrent.ExecutorService r2 = r1.f5160d
            r2.execute(r0)
            return
        L_0x01cf:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x01cf }
            throw r0
        L_0x01d2:
            return
        L_0x01d3:
            boolean r0 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c
            if (r0 == 0) goto L_0x01de
            java.lang.String r0 = "TAG_PROXY_Preloader"
            java.lang.String r2 = "cache or videoProxyDB null in Preloader!!!"
            android.util.Log.e(r0, r2)
        L_0x01de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p068vk.openvk.component.video.p069a.p073b.C2436d.mo16151a(boolean, boolean, int, java.lang.String, java.util.Map, java.lang.String[]):void");
    }

    /* renamed from: a */
    public void mo16149a(String str) {
        mo16153a(false, false, str);
    }

    /* renamed from: a */
    public void mo16153a(boolean z, boolean z2, String str) {
        if (!TextUtils.isEmpty(str)) {
            final boolean z3 = z;
            final boolean z4 = z2;
            final String str2 = str;
            C2482a.m6055a((C2955g) new C2955g("cancel b b S") {
                public void run() {
                    C2422b bVar;
                    synchronized (C2436d.this.f5158b) {
                        Map map = (Map) C2436d.this.f5158b.get(C2426b.m5899a(z3));
                        if (map != null) {
                            bVar = (C2422b) map.remove(z4 ? str2 : C2535b.m6426a(str2));
                        } else {
                            bVar = null;
                        }
                    }
                    if (bVar != null) {
                        bVar.mo16087a();
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public void mo16155d() {
        C2482a.m6055a((C2955g) new C2955g("cancelAll") {
            public void run() {
                ArrayList<C2422b> arrayList = new ArrayList<>();
                synchronized (C2436d.this.f5158b) {
                    int size = C2436d.this.f5158b.size();
                    for (int i = 0; i < size; i++) {
                        Map map = (Map) C2436d.this.f5158b.get(C2436d.this.f5158b.keyAt(i));
                        if (map != null) {
                            arrayList.addAll(map.values());
                            map.clear();
                        }
                    }
                    C2436d.this.f5159c.clear();
                }
                for (C2422b bVar : arrayList) {
                    bVar.mo16087a();
                    if (C2446e.f5187c) {
                        Log.w("TAG_PROXY_Preloader", "PreloadTask: " + bVar + ", canceled!!!");
                    }
                }
            }
        });
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.d$a */
    /* compiled from: Preloader */
    private static final class C2443a {

        /* renamed from: a */
        final boolean f5178a;

        /* renamed from: b */
        final boolean f5179b;

        /* renamed from: c */
        final int f5180c;

        /* renamed from: d */
        final String f5181d;

        /* renamed from: e */
        final Map<String, String> f5182e;

        /* renamed from: f */
        final String[] f5183f;

        C2443a(boolean z, boolean z2, int i, String str, Map<String, String> map, String[] strArr) {
            this.f5178a = z;
            this.f5179b = z2;
            this.f5180c = i;
            this.f5181d = str;
            this.f5182e = map;
            this.f5183f = strArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2443a aVar = (C2443a) obj;
            if (this.f5178a == aVar.f5178a && this.f5179b == aVar.f5179b && this.f5180c == aVar.f5180c) {
                return this.f5181d.equals(aVar.f5181d);
            }
            return false;
        }

        public int hashCode() {
            return ((((((this.f5178a ? 1 : 0) * true) + (this.f5179b ? 1 : 0)) * 31) + this.f5180c) * 31) + this.f5181d.hashCode();
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.d$b */
    /* compiled from: Preloader */
    private static final class C2444b<T> extends LinkedBlockingDeque<T> {

        /* renamed from: a */
        private ThreadPoolExecutor f5184a;

        private C2444b() {
        }

        /* renamed from: a */
        public void mo16163a(ThreadPoolExecutor threadPoolExecutor) {
            synchronized (this) {
                if (this.f5184a != null) {
                    throw new IllegalStateException("You can only call setExecutor() once!");
                } else if (threadPoolExecutor != null) {
                    this.f5184a = threadPoolExecutor;
                } else {
                    throw new NullPointerException("executor argument can't be null!");
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return offerFirst(r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean offer(T r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.util.concurrent.ThreadPoolExecutor r0 = r3.f5184a     // Catch:{ all -> 0x002b }
                int r0 = r0.getPoolSize()     // Catch:{ all -> 0x002b }
                java.util.concurrent.ThreadPoolExecutor r1 = r3.f5184a     // Catch:{ all -> 0x002b }
                int r1 = r1.getActiveCount()     // Catch:{ all -> 0x002b }
                java.util.concurrent.ThreadPoolExecutor r2 = r3.f5184a     // Catch:{ all -> 0x002b }
                int r2 = r2.getMaximumPoolSize()     // Catch:{ all -> 0x002b }
                if (r1 < r0) goto L_0x0025
                if (r0 >= r2) goto L_0x0025
                boolean r4 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c     // Catch:{ all -> 0x002b }
                if (r4 == 0) goto L_0x0022
                java.lang.String r4 = "TAG_PROXY_TT"
                java.lang.String r0 = "create new preloader thread"
                android.util.Log.i(r4, r0)     // Catch:{ all -> 0x002b }
            L_0x0022:
                r4 = 0
                monitor-exit(r3)     // Catch:{ all -> 0x002b }
                return r4
            L_0x0025:
                monitor-exit(r3)     // Catch:{ all -> 0x002b }
                boolean r4 = r3.offerFirst(r4)
                return r4
            L_0x002b:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x002b }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bykv.p068vk.openvk.component.video.p069a.p073b.C2436d.C2444b.offer(java.lang.Object):boolean");
        }
    }

    /* renamed from: a */
    private static ExecutorService m5911a(final C2444b<Runnable> bVar) {
        int a = C2482a.m6044a();
        return new ThreadPoolExecutor(0, a < 1 ? 1 : a > 4 ? 4 : a, 60, TimeUnit.SECONDS, bVar, new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                C24411 r0 = new Thread(runnable) {
                    public void run() {
                        try {
                            Process.setThreadPriority(10);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        super.run();
                    }
                };
                r0.setName("tt_pangle_thread_video_preload_" + r0.getId());
                r0.setDaemon(true);
                if (C2446e.f5187c) {
                    Log.i("TAG_PROXY_Preloader", "new preload thead: " + r0.getName());
                }
                return r0;
            }
        }, new RejectedExecutionHandler() {
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                try {
                    bVar.offerFirst(runnable);
                    if (C2446e.f5187c) {
                        Log.i("TAG_PROXY_TT", "task rejected in preloader, put first!!!");
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }
}
