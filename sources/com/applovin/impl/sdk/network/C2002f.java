package com.applovin.impl.sdk.network;

import android.content.SharedPreferences;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p048c.C1859d;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.p050e.C1934z;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.f */
public class C2002f {

    /* renamed from: a */
    private final C1959m f3849a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2092v f3850b;

    /* renamed from: c */
    private final int f3851c;

    /* renamed from: d */
    private final C2006g f3852d;

    /* renamed from: e */
    private final SharedPreferences f3853e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Object f3854f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ArrayList<C2007h> f3855g;

    /* renamed from: h */
    private final ArrayList<C2007h> f3856h = new ArrayList<>();

    /* renamed from: i */
    private long f3857i = 0;

    /* renamed from: j */
    private final Set<C2007h> f3858j = new HashSet();

    public C2002f(C1959m mVar) {
        if (mVar != null) {
            this.f3849a = mVar;
            this.f3850b = mVar.mo14286A();
            this.f3851c = ((Integer) mVar.mo14311a(C1857b.f3187cL)).intValue();
            if (mVar.mo14328aa() != null) {
                this.f3853e = mVar.mo14297L().getSharedPreferences("com.applovin.sdk.impl.postbackQueue.domain", 0);
                this.f3855g = m4661d();
                this.f3852d = null;
                return;
            }
            C2006g gVar = new C2006g(this, mVar);
            this.f3852d = gVar;
            this.f3855g = gVar.mo14548a(this.f3851c);
            this.f3852d.mo14549a();
            this.f3853e = null;
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        r0 = ((java.lang.Integer) r4.f3849a.mo14311a(com.applovin.impl.sdk.p048c.C1857b.f3185cJ)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r5.mo14563k() <= r0) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0090, code lost:
        if (com.applovin.impl.sdk.C2092v.m5047a() == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        r6 = r4.f3850b;
        r6.mo14792d("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + r0 + ". Dequeuing postback: " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b2, code lost:
        m4664d(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        r1 = r4.f3854f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b9, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r4.f3858j.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bf, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        if (r5.mo14557f() == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c6, code lost:
        r0 = new org.json.JSONObject(r5.mo14557f());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d0, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
        r4.f3849a.mo14308X().dispatchPostbackRequest(com.applovin.impl.sdk.network.C2010i.m4714b(r4.f3849a).mo14587d(r5.mo14552b()).mo14590e(r5.mo14553c()).mo14585c(r5.mo14554d()).mo14593f(r5.mo14551a()).mo14588d(r5.mo14555e()).mo14583b(r0).mo14594f(r5.mo14559h()).mo14591e(r5.mo14558g()).mo14596g(r5.mo14561i()).mo14595g(r5.mo14562j()).mo14584b(), new com.applovin.impl.sdk.network.C2002f.C20042(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m4654a(final com.applovin.impl.sdk.network.C2007h r5, final com.applovin.sdk.AppLovinPostbackListener r6) {
        /*
            r4 = this;
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r0 == 0) goto L_0x001e
            com.applovin.impl.sdk.v r0 = r4.f3850b
            java.lang.String r1 = "PersistentPostbackManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Preparing to submit postback..."
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.mo14789b(r1, r2)
        L_0x001e:
            com.applovin.impl.sdk.m r0 = r4.f3849a
            boolean r0 = r0.mo14350c()
            if (r0 == 0) goto L_0x0036
            boolean r5 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r5 == 0) goto L_0x0035
            com.applovin.impl.sdk.v r5 = r4.f3850b
            java.lang.String r6 = "PersistentPostbackManager"
            java.lang.String r0 = "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards"
            r5.mo14789b(r6, r0)
        L_0x0035:
            return
        L_0x0036:
            java.lang.Object r0 = r4.f3854f
            monitor-enter(r0)
            java.util.Set<com.applovin.impl.sdk.network.h> r1 = r4.f3858j     // Catch:{ all -> 0x0139 }
            boolean r1 = r1.contains(r5)     // Catch:{ all -> 0x0139 }
            if (r1 == 0) goto L_0x0065
            boolean r6 = com.applovin.impl.sdk.C2092v.m5047a()     // Catch:{ all -> 0x0139 }
            if (r6 == 0) goto L_0x0063
            com.applovin.impl.sdk.v r6 = r4.f3850b     // Catch:{ all -> 0x0139 }
            java.lang.String r1 = "PersistentPostbackManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0139 }
            r2.<init>()     // Catch:{ all -> 0x0139 }
            java.lang.String r3 = "Skip pending postback: "
            r2.append(r3)     // Catch:{ all -> 0x0139 }
            java.lang.String r5 = r5.mo14552b()     // Catch:{ all -> 0x0139 }
            r2.append(r5)     // Catch:{ all -> 0x0139 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0139 }
            r6.mo14789b(r1, r5)     // Catch:{ all -> 0x0139 }
        L_0x0063:
            monitor-exit(r0)     // Catch:{ all -> 0x0139 }
            return
        L_0x0065:
            r5.mo14564l()     // Catch:{ all -> 0x0139 }
            com.applovin.impl.sdk.m r1 = r4.f3849a     // Catch:{ all -> 0x0139 }
            com.applovin.impl.sdk.r r1 = r1.mo14328aa()     // Catch:{ all -> 0x0139 }
            if (r1 == 0) goto L_0x0074
            r4.m4667f()     // Catch:{ all -> 0x0139 }
            goto L_0x0077
        L_0x0074:
            r4.m4665e()     // Catch:{ all -> 0x0139 }
        L_0x0077:
            monitor-exit(r0)     // Catch:{ all -> 0x0139 }
            com.applovin.impl.sdk.m r0 = r4.f3849a
            com.applovin.impl.sdk.c.b<java.lang.Integer> r1 = com.applovin.impl.sdk.p048c.C1857b.f3185cJ
            java.lang.Object r0 = r0.mo14311a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r1 = r5.mo14563k()
            if (r1 <= r0) goto L_0x00b7
            boolean r6 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r6 == 0) goto L_0x00b2
            com.applovin.impl.sdk.v r6 = r4.f3850b
            java.lang.String r1 = "PersistentPostbackManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exceeded maximum persisted attempt count of "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ". Dequeuing postback: "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            r6.mo14792d(r1, r0)
        L_0x00b2:
            r4.m4664d((com.applovin.impl.sdk.network.C2007h) r5)
            goto L_0x0135
        L_0x00b7:
            java.lang.Object r1 = r4.f3854f
            monitor-enter(r1)
            java.util.Set<com.applovin.impl.sdk.network.h> r0 = r4.f3858j     // Catch:{ all -> 0x0136 }
            r0.add(r5)     // Catch:{ all -> 0x0136 }
            monitor-exit(r1)     // Catch:{ all -> 0x0136 }
            java.util.Map r0 = r5.mo14557f()
            if (r0 == 0) goto L_0x00d0
            org.json.JSONObject r0 = new org.json.JSONObject
            java.util.Map r1 = r5.mo14557f()
            r0.<init>(r1)
            goto L_0x00d1
        L_0x00d0:
            r0 = 0
        L_0x00d1:
            com.applovin.impl.sdk.m r1 = r4.f3849a
            com.applovin.impl.sdk.network.i$a r1 = com.applovin.impl.sdk.network.C2010i.m4714b(r1)
            java.lang.String r2 = r5.mo14552b()
            com.applovin.impl.sdk.network.i$a r1 = r1.mo14501a((java.lang.String) r2)
            java.lang.String r2 = r5.mo14553c()
            com.applovin.impl.sdk.network.i$a r1 = r1.mo14511c((java.lang.String) r2)
            java.util.Map r2 = r5.mo14554d()
            com.applovin.impl.sdk.network.i$a r1 = r1.mo14502a((java.util.Map<java.lang.String, java.lang.String>) r2)
            java.lang.String r2 = r5.mo14551a()
            com.applovin.impl.sdk.network.i$a r1 = r1.mo14507b((java.lang.String) r2)
            java.util.Map r2 = r5.mo14555e()
            com.applovin.impl.sdk.network.i$a r1 = r1.mo14508b((java.util.Map<java.lang.String, java.lang.String>) r2)
            com.applovin.impl.sdk.network.i$a r0 = r1.mo14503a((org.json.JSONObject) r0)
            boolean r1 = r5.mo14559h()
            com.applovin.impl.sdk.network.i$a r0 = r0.mo14513d((boolean) r1)
            boolean r1 = r5.mo14558g()
            com.applovin.impl.sdk.network.i$a r0 = r0.mo14512c((boolean) r1)
            boolean r1 = r5.mo14561i()
            com.applovin.impl.sdk.network.i$a r0 = r0.mo14596g((boolean) r1)
            java.lang.String r1 = r5.mo14562j()
            com.applovin.impl.sdk.network.i$a r0 = r0.mo14595g((java.lang.String) r1)
            com.applovin.impl.sdk.network.i r0 = r0.mo14505a()
            com.applovin.impl.sdk.m r1 = r4.f3849a
            com.applovin.impl.sdk.network.PostbackServiceImpl r1 = r1.mo14308X()
            com.applovin.impl.sdk.network.f$2 r2 = new com.applovin.impl.sdk.network.f$2
            r2.<init>(r5, r6)
            r1.dispatchPostbackRequest(r0, r2)
        L_0x0135:
            return
        L_0x0136:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0136 }
            throw r5
        L_0x0139:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0139 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.network.C2002f.m4654a(com.applovin.impl.sdk.network.h, com.applovin.sdk.AppLovinPostbackListener):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m4657b(C2007h hVar) {
        synchronized (this.f3854f) {
            if (this.f3849a.mo14328aa() != null) {
                this.f3855g.add(hVar);
                m4667f();
            } else {
                while (this.f3855g.size() > this.f3851c) {
                    this.f3855g.remove(0);
                }
                this.f3855g.add(hVar);
                m4665e();
            }
            if (C2092v.m5047a()) {
                C2092v vVar = this.f3850b;
                vVar.mo14789b("PersistentPostbackManager", "Enqueued postback: " + hVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m4660c(C2007h hVar) {
        m4654a(hVar, (AppLovinPostbackListener) null);
    }

    /* renamed from: d */
    private ArrayList<C2007h> m4661d() {
        Set<String> set = (Set) this.f3849a.mo14343b(C1859d.f3355p, new LinkedHashSet(0), this.f3853e);
        ArrayList<C2007h> arrayList = new ArrayList<>(Math.max(1, set.size()));
        int intValue = ((Integer) this.f3849a.mo14311a(C1857b.f3185cJ)).intValue();
        C2092v vVar = this.f3850b;
        vVar.mo14789b("PersistentPostbackManager", "Deserializing " + set.size() + " postback(s).");
        for (String str : set) {
            try {
                C2007h hVar = new C2007h(new JSONObject(str), this.f3849a);
                if (hVar.mo14563k() < intValue) {
                    arrayList.add(hVar);
                } else if (C2092v.m5048a(this.f3849a)) {
                    C2092v vVar2 = this.f3850b;
                    vVar2.mo14789b("PersistentPostbackManager", "Skipping deserialization because maximum attempt count exceeded for postback: " + hVar);
                }
            } catch (Throwable th) {
                if (C2092v.m5048a(this.f3849a)) {
                    C2092v vVar3 = this.f3850b;
                    vVar3.mo14790b("PersistentPostbackManager", "Unable to deserialize postback request from json: " + str, th);
                }
            }
        }
        if (C2092v.m5048a(this.f3849a)) {
            C2092v vVar4 = this.f3850b;
            vVar4.mo14789b("PersistentPostbackManager", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m4664d(C2007h hVar) {
        synchronized (this.f3854f) {
            this.f3858j.remove(hVar);
            this.f3855g.remove(hVar);
            if (this.f3849a.mo14328aa() != null) {
                m4667f();
            } else {
                m4665e();
            }
        }
        if (C2092v.m5047a()) {
            C2092v vVar = this.f3850b;
            vVar.mo14789b("PersistentPostbackManager", "Dequeued successfully transmitted postback: " + hVar);
        }
    }

    /* renamed from: e */
    private void m4665e() {
        this.f3857i = System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m4666e(C2007h hVar) {
        synchronized (this.f3854f) {
            this.f3858j.remove(hVar);
            this.f3856h.add(hVar);
        }
    }

    /* renamed from: f */
    private void m4667f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.f3855g.size());
        Iterator<C2007h> it = this.f3855g.iterator();
        while (it.hasNext()) {
            try {
                linkedHashSet.add(it.next().mo14566n().toString());
            } catch (Throwable th) {
                this.f3850b.mo14790b("PersistentPostbackManager", "Unable to serialize postback request to JSON.", th);
            }
        }
        this.f3849a.mo14319a(C1859d.f3355p, linkedHashSet, this.f3853e);
        this.f3850b.mo14789b("PersistentPostbackManager", "Wrote updated postback queue to disk.");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m4668g() {
        synchronized (this.f3854f) {
            Iterator<C2007h> it = this.f3856h.iterator();
            while (it.hasNext()) {
                m4660c(it.next());
            }
            this.f3856h.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo14540a() {
        return this.f3857i;
    }

    /* renamed from: a */
    public void mo14541a(C2007h hVar) {
        mo14542a(hVar, true);
    }

    /* renamed from: a */
    public void mo14542a(C2007h hVar, boolean z) {
        mo14543a(hVar, z, (AppLovinPostbackListener) null);
    }

    /* renamed from: a */
    public void mo14543a(final C2007h hVar, boolean z, final AppLovinPostbackListener appLovinPostbackListener) {
        if (StringUtils.isValidString(hVar.mo14552b())) {
            if (z) {
                hVar.mo14565m();
            }
            C20031 r3 = new Runnable() {
                public void run() {
                    synchronized (C2002f.this.f3854f) {
                        C2002f.this.m4657b(hVar);
                        C2002f.this.m4654a(hVar, appLovinPostbackListener);
                    }
                }
            };
            if (Utils.isMainThread()) {
                this.f3849a.mo14303S().mo14206a((C1877a) new C1934z(this.f3849a, r3), C1908o.C1910a.POSTBACKS);
                return;
            }
            r3.run();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<C2007h> mo14544b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f3854f) {
            arrayList.ensureCapacity(this.f3855g.size());
            arrayList.addAll(this.f3855g);
        }
        return arrayList;
    }

    /* renamed from: c */
    public void mo14545c() {
        C20053 r0 = new Runnable() {
            public void run() {
                synchronized (C2002f.this.f3854f) {
                    if (C2002f.this.f3855g != null) {
                        for (C2007h d : new ArrayList(C2002f.this.f3855g)) {
                            C2002f.this.m4660c(d);
                        }
                    }
                }
            }
        };
        if (((Boolean) this.f3849a.mo14311a(C1857b.f3186cK)).booleanValue()) {
            this.f3849a.mo14303S().mo14206a((C1877a) new C1934z(this.f3849a, r0), C1908o.C1910a.POSTBACKS);
            return;
        }
        r0.run();
    }
}
