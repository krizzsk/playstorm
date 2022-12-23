package com.bytedance.sdk.component.p090a;

import com.bytedance.sdk.component.p090a.C2558d;
import com.bytedance.sdk.component.p090a.C2584t;
import com.bytedance.sdk.component.p090a.C2587v;
import com.bytedance.sdk.component.p090a.C2592w;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* renamed from: com.bytedance.sdk.component.a.g */
/* compiled from: CallHandler */
class C2563g implements C2592w.C2593a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2567h f5465a;

    /* renamed from: b */
    private final C2586u f5466b;

    /* renamed from: c */
    private final Map<String, C2556b> f5467c = new HashMap();

    /* renamed from: d */
    private final Map<String, C2558d.C2560b> f5468d = new HashMap();

    /* renamed from: e */
    private final List<C2579q> f5469e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Set<C2558d> f5470f = new HashSet();

    /* renamed from: g */
    private final C2575m f5471g;

    /* renamed from: h */
    private final boolean f5472h;

    /* renamed from: i */
    private final boolean f5473i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C2554a f5474j;

    C2563g(C2569j jVar, C2554a aVar, C2587v vVar) {
        this.f5474j = aVar;
        this.f5465a = jVar.f5487d;
        C2586u uVar = new C2586u(vVar, jVar.f5495l, jVar.f5496m);
        this.f5466b = uVar;
        uVar.mo16610a((C2592w.C2593a) this);
        this.f5466b.mo16609a(jVar.f5499p);
        this.f5471g = jVar.f5492i;
        this.f5472h = jVar.f5491h;
        this.f5473i = jVar.f5498o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2566a mo16565a(C2579q qVar, C2562f fVar) throws Exception {
        C2556b bVar = this.f5467c.get(qVar.f5504d);
        if (bVar != null) {
            try {
                C2594x b = m6510b(fVar.f5462b, bVar);
                fVar.f5464d = b;
                if (b == null) {
                    if (this.f5471g != null) {
                        this.f5471g.mo16588a(fVar.f5462b, qVar.f5504d, 1);
                    }
                    C2568i.m6523a("Permission denied, call: " + qVar);
                    throw new C2583s(-1);
                } else if (bVar instanceof C2561e) {
                    C2568i.m6523a("Processing stateless call: " + qVar);
                    return m6506a(qVar, (C2561e) bVar, fVar);
                } else if (bVar instanceof C2557c) {
                    C2568i.m6523a("Processing raw call: " + qVar);
                    return m6504a(qVar, (C2557c) bVar, b);
                }
            } catch (C2587v.C2589a e) {
                C2568i.m6524a("No remote permission config fetched, call pending: " + qVar, e);
                this.f5469e.add(qVar);
                return new C2566a(false, C2595y.m6597a());
            }
        }
        C2558d.C2560b bVar2 = this.f5468d.get(qVar.f5504d);
        if (bVar2 != null) {
            C2558d a = bVar2.mo16563a();
            a.mo16550a(qVar.f5504d);
            C2594x b2 = m6510b(fVar.f5462b, a);
            fVar.f5464d = b2;
            if (b2 != null) {
                C2568i.m6523a("Processing stateful call: " + qVar);
                return m6505a(qVar, a, fVar);
            }
            C2568i.m6523a("Permission denied, call: " + qVar);
            a.mo16559e();
            throw new C2583s(-1);
        }
        C2575m mVar = this.f5471g;
        if (mVar != null) {
            mVar.mo16588a(fVar.f5462b, qVar.f5504d, 2);
        }
        C2568i.m6526b("Received call: " + qVar + ", but not registered.");
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16568a(String str, C2561e<?, ?> eVar) {
        eVar.mo16550a(str);
        this.f5467c.put(str, eVar);
        C2568i.m6523a("JsBridge stateless method registered: " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16567a(String str, C2558d.C2560b bVar) {
        this.f5468d.put(str, bVar);
        C2568i.m6523a("JsBridge stateful method registered: " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16566a() {
        for (C2558d f : this.f5470f) {
            f.mo16560f();
        }
        this.f5470f.clear();
        this.f5467c.clear();
        this.f5468d.clear();
        this.f5466b.mo16612b(this);
    }

    /* renamed from: a */
    private C2566a m6506a(C2579q qVar, C2561e eVar, C2562f fVar) throws Exception {
        return new C2566a(true, C2595y.m6598a(this.f5465a.mo16570a(eVar.mo16564a(m6507a(qVar.f5505e, (C2556b) eVar), fVar))));
    }

    /* renamed from: a */
    private C2566a m6505a(final C2579q qVar, final C2558d dVar, C2562f fVar) throws Exception {
        this.f5470f.add(dVar);
        dVar.mo16555a(m6507a(qVar.f5505e, (C2556b) dVar), fVar, new C2558d.C2559a() {
            /* renamed from: a */
            public void mo16561a(Object obj) {
                if (C2563g.this.f5474j != null) {
                    C2563g.this.f5474j.mo16546b(C2595y.m6598a(C2563g.this.f5465a.mo16570a(obj)), qVar);
                    C2563g.this.f5470f.remove(dVar);
                }
            }

            /* renamed from: a */
            public void mo16562a(Throwable th) {
                if (C2563g.this.f5474j != null) {
                    C2563g.this.f5474j.mo16546b(C2595y.m6599a(th), qVar);
                    C2563g.this.f5470f.remove(dVar);
                }
            }
        });
        return new C2566a(false, C2595y.m6597a());
    }

    /* renamed from: a */
    private C2566a m6504a(final C2579q qVar, C2557c cVar, C2594x xVar) throws Exception {
        cVar.mo16552a(qVar, new C2584t(qVar.f5504d, xVar, new C2584t.C2585a() {
        }));
        return new C2566a(false, C2595y.m6597a());
    }

    /* renamed from: a */
    private Object m6507a(String str, C2556b bVar) throws JSONException {
        return this.f5465a.mo16569a(str, m6508a((Object) bVar)[0]);
    }

    /* renamed from: b */
    private C2594x m6510b(String str, C2556b bVar) {
        if (this.f5473i) {
            return C2594x.PRIVATE;
        }
        return this.f5466b.mo16608a(this.f5472h, str, bVar);
    }

    /* renamed from: a */
    private static Type[] m6508a(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }

    /* renamed from: com.bytedance.sdk.component.a.g$a */
    /* compiled from: CallHandler */
    static final class C2566a {

        /* renamed from: a */
        boolean f5480a;

        /* renamed from: b */
        String f5481b;

        private C2566a(boolean z, String str) {
            this.f5480a = z;
            this.f5481b = str;
        }
    }
}
