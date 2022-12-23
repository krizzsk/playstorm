package com.inmobi.media;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.gn */
/* compiled from: EventProcessor */
public class C6190gn implements C6195gp {

    /* renamed from: f */
    private static final String f15658f = C6190gn.class.getSimpleName();

    /* renamed from: a */
    public AtomicBoolean f15659a = new AtomicBoolean(false);

    /* renamed from: b */
    public AtomicBoolean f15660b = new AtomicBoolean(false);

    /* renamed from: c */
    public HashMap<String, C6187gk> f15661c = new HashMap<>(1);

    /* renamed from: d */
    public List<String> f15662d = new LinkedList();

    /* renamed from: e */
    public ScheduledExecutorService f15663e;

    /* renamed from: g */
    private C6188gl f15664g;

    /* renamed from: h */
    private C6196gq f15665h;

    public C6190gn(C6188gl glVar, C6196gq gqVar, C6187gk gkVar) {
        this.f15664g = glVar;
        this.f15665h = gqVar;
        mo35371a(gkVar);
    }

    /* renamed from: a */
    public final void mo35374a(String str, boolean z) {
        if (!this.f15660b.get()) {
            m18428a(str, m18429b(str).f15648f, z);
        }
    }

    /* renamed from: a */
    private void m18428a(final String str, long j, final boolean z) {
        if (!this.f15662d.contains(str)) {
            this.f15662d.add(str);
            if (this.f15663e == null) {
                this.f15663e = Executors.newSingleThreadScheduledExecutor(new C6237ht(f15658f));
            }
            this.f15663e.scheduleAtFixedRate(new Runnable() {

                /* renamed from: b */
                final /* synthetic */ C6271ir f15667b = null;

                public final void run() {
                    C6190gn.m18427a(C6190gn.this, str, this.f15667b, z);
                }
            }, m18426a(str), j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: a */
    private long m18426a(String str) {
        C6187gk b = m18429b(str);
        long c = this.f15664g.mo35366c();
        if (c == -1) {
            this.f15664g.mo35367c(System.currentTimeMillis());
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(c) + b.f15648f;
        if (seconds - TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) > 0) {
            return seconds - TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }
        return 0;
    }

    /* renamed from: b */
    private C6187gk m18429b(String str) {
        return this.f15661c.get(str);
    }

    /* renamed from: a */
    public final void mo35371a(C6187gk gkVar) {
        String str = gkVar.f15644b;
        if (str == null) {
            str = "default";
        }
        this.f15661c.put(str, gkVar);
    }

    /* renamed from: a */
    public final void mo35372a(C6189gm gmVar) {
        gmVar.f15655a.get(0).intValue();
        this.f15664g.mo35362a(gmVar.f15655a);
        this.f15664g.mo35367c(System.currentTimeMillis());
        this.f15659a.set(false);
    }

    /* renamed from: a */
    public final void mo35373a(C6189gm gmVar, boolean z) {
        gmVar.f15655a.get(0).intValue();
        if (gmVar.f15657c && z) {
            this.f15664g.mo35362a(gmVar.f15655a);
        }
        this.f15664g.mo35367c(System.currentTimeMillis());
        this.f15659a.set(false);
    }

    /* renamed from: a */
    static /* synthetic */ void m18427a(C6190gn gnVar, String str, C6271ir irVar, boolean z) {
        int i;
        long j;
        C6189gm c;
        if (!gnVar.f15660b.get() && !gnVar.f15659a.get()) {
            gnVar.f15664g.mo35365b(gnVar.m18429b(str).f15643a);
            int a = gnVar.f15664g.mo35361a();
            int a2 = C6251ib.m18647a();
            if (a2 != 1) {
                i = gnVar.m18429b(str).f15651i;
            } else {
                i = gnVar.m18429b(str).f15649g;
            }
            if (a2 != 1) {
                j = gnVar.m18429b(str).f15652j;
            } else {
                j = gnVar.m18429b(str).f15650h;
            }
            long j2 = j;
            if ((i <= a || gnVar.f15664g.mo35363a(gnVar.m18429b(str).f15645c) || gnVar.f15664g.mo35364a(gnVar.m18429b(str).f15648f, gnVar.m18429b(str).f15645c)) && (c = gnVar.f15665h.mo35359c()) != null) {
                gnVar.f15659a.set(true);
                C6187gk b = gnVar.m18429b(str);
                C6192go a3 = C6192go.m18434a();
                String str2 = b.f15647e;
                int i2 = b.f15646d + 1;
                a3.mo35376a(c, str2, i2, i2, j2, irVar, gnVar, z);
            }
        }
    }
}
