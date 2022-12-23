package com.bykv.p068vk.openvk.component.video.p069a.p073b;

import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2473i;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2480l;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p074a.C2410a;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p074a.C2411b;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p075b.C2427c;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p076c.C2432a;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p077d.C2445a;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p078e.C2448a;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p078e.C2449b;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p078e.C2450c;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p078e.C2453e;
import com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a;
import com.google.common.net.HttpHeaders;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.a */
/* compiled from: AbsTask */
abstract class C2408a implements C2479k {

    /* renamed from: m */
    private static final AtomicLong f5085m = new AtomicLong();

    /* renamed from: a */
    protected volatile C2410a f5086a;

    /* renamed from: b */
    protected final C2427c f5087b;

    /* renamed from: c */
    protected final AtomicInteger f5088c = new AtomicInteger();

    /* renamed from: d */
    protected final AtomicLong f5089d = new AtomicLong();

    /* renamed from: e */
    protected C2445a f5090e;

    /* renamed from: f */
    protected volatile List<C2473i.C2475b> f5091f;

    /* renamed from: g */
    protected volatile String f5092g;

    /* renamed from: h */
    protected volatile String f5093h;

    /* renamed from: i */
    protected volatile C2473i f5094i;

    /* renamed from: j */
    protected volatile C2480l f5095j;

    /* renamed from: k */
    protected volatile boolean f5096k = false;

    /* renamed from: l */
    public final long f5097l = f5085m.incrementAndGet();

    /* renamed from: n */
    private final AtomicInteger f5098n = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f5099o = -1;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16089a(Boolean bool, String str, Throwable th) {
    }

    public C2408a(C2410a aVar, C2427c cVar) {
        this.f5086a = aVar;
        this.f5087b = cVar;
    }

    /* renamed from: a */
    public void mo16087a() {
        this.f5098n.compareAndSet(0, 1);
    }

    /* renamed from: b */
    public boolean mo16090b() {
        return this.f5098n.get() == 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo16091c() {
        this.f5098n.compareAndSet(0, 2);
    }

    /* renamed from: d */
    public boolean mo16092d() {
        return this.f5098n.get() == 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo16093e() throws C2432a {
        if (mo16090b()) {
            throw new C2432a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2448a mo16086a(C2480l.C2481a aVar, int i, int i2, String str) throws IOException {
        C2449b b = C2450c.m5950a().mo16177b();
        C2453e eVar = new C2453e();
        HashMap hashMap = new HashMap();
        eVar.f5201b = aVar.f5283a;
        eVar.f5200a = 0;
        if (VersionInfo.GIT_BRANCH.equalsIgnoreCase(str)) {
            eVar.f5200a = 4;
        }
        List<C2473i.C2475b> list = this.f5091f;
        if (list != null && !list.isEmpty()) {
            for (C2473i.C2475b next : list) {
                if (!"Range".equalsIgnoreCase(next.f5267a) && !"Connection".equalsIgnoreCase(next.f5267a) && !"Proxy-Connection".equalsIgnoreCase(next.f5267a) && !HttpHeaders.HOST.equalsIgnoreCase(next.f5267a)) {
                    hashMap.put(next.f5267a, next.f5268b);
                }
            }
        }
        String a = C2482a.m6048a(i, i2);
        if (a != null) {
            hashMap.put("Range", a);
        }
        if (C2446e.f5190f) {
            hashMap.put("Cache-Control", "no-cache");
        }
        C2436d c = C2436d.m5913c();
        C2455f a2 = C2455f.m5963a();
        boolean z = this.f5094i == null;
        C2431c a3 = z ? c.mo16144a() : a2.mo16182b();
        C2431c b2 = z ? c.mo16154b() : a2.mo16183c();
        if (!(a3 == null && b2 == null)) {
            if (a3 != null) {
                eVar.f5202c = a3.mo16143a(aVar.f5284b);
            }
            if (b2 != null) {
                eVar.f5203d = b2.mo16143a(aVar.f5284b);
            }
        }
        eVar.f5204e = hashMap;
        if (!this.f5096k) {
            return b.mo16176a(eVar);
        }
        this.f5096k = false;
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo16094f() {
        if (this.f5094i != null) {
            return this.f5094i.f5259c.f5260a;
        }
        return this.f5086a instanceof C2411b ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo16095g() {
        return mo16094f() == 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16088a(int i, int i2) {
        if (i > 0 && i2 >= 0) {
            int i3 = C2446e.f5191g;
            int f = mo16094f();
            if (i3 == 1 || (i3 == 2 && f == 1)) {
                int i4 = (int) ((((float) i2) / ((float) i)) * 100.0f);
                if (i4 > 100) {
                    i4 = 100;
                }
                synchronized (this) {
                    if (i4 > this.f5099o) {
                        this.f5099o = i4;
                        C2482a.m6058a((Runnable) new Runnable() {
                            public void run() {
                                if (C2408a.this.f5090e != null) {
                                    C2408a.this.f5090e.mo16165a(C2408a.this.f5095j, C2408a.this.f5099o);
                                }
                            }
                        });
                    }
                }
            }
        }
    }
}
