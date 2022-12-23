package com.ogury.p376ed.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ir */
public final class C10636ir {

    /* renamed from: a */
    private final C10633io f26841a;

    /* renamed from: b */
    private final List<C10635iq> f26842b;

    /* renamed from: c */
    private final C10629il f26843c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f26844d;

    /* renamed from: e */
    private int f26845e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f26846f;

    /* renamed from: g */
    private Handler f26847g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C10632in f26848h;

    /* renamed from: i */
    private C10621if f26849i;

    private C10636ir(C10633io ioVar) {
        C10765mq.m32773b(ioVar, "loadStrategyFactory");
        this.f26841a = ioVar;
        this.f26842b = new LinkedList();
        this.f26843c = m32441c();
        this.f26847g = new Handler(Looper.getMainLooper());
    }

    public /* synthetic */ C10636ir() {
        this(new C10633io());
    }

    /* renamed from: a */
    public final C10621if mo67636a() {
        return this.f26849i;
    }

    /* renamed from: a */
    public final void mo67637a(C10621if ifVar) {
        this.f26849i = ifVar;
    }

    /* renamed from: com.ogury.ed.internal.ir$a */
    public static final class C10637a implements C10629il {

        /* renamed from: a */
        final /* synthetic */ C10636ir f26850a;

        C10637a(C10636ir irVar) {
            this.f26850a = irVar;
        }

        /* renamed from: a */
        public final void mo67634a(C10483eb ebVar) {
            C10765mq.m32773b(ebVar, "ad");
            C10621if a = this.f26850a.mo67636a();
            if (a != null) {
                a.mo67619a(ebVar);
            }
            C10636ir irVar = this.f26850a;
            irVar.f26844d = irVar.f26844d + 1;
            C10632in b = this.f26850a.f26848h;
            if (b != null) {
                b.mo67626a();
            }
            this.f26850a.m32443d();
        }

        /* renamed from: a */
        public final void mo67633a() {
            C10636ir irVar = this.f26850a;
            irVar.f26844d = irVar.f26844d + 1;
            C10632in b = this.f26850a.f26848h;
            if (b != null) {
                b.mo67626a();
            }
            if (this.f26850a.m32445e() && !this.f26850a.f26846f) {
                this.f26850a.m32449g();
            }
        }

        /* renamed from: b */
        public final void mo67635b() {
            this.f26850a.m32451h();
        }
    }

    /* renamed from: c */
    private final C10629il m32441c() {
        return new C10637a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m32443d() {
        if (m32448f()) {
            m32451h();
        } else if (m32445e()) {
            m32449g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final boolean m32445e() {
        return this.f26844d == this.f26842b.size();
    }

    /* renamed from: f */
    private final boolean m32448f() {
        return this.f26845e == 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m32449g() {
        this.f26842b.clear();
        m32453i();
        C10621if ifVar = this.f26849i;
        if (ifVar != null) {
            ifVar.mo67618a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m32451h() {
        m32453i();
        this.f26846f = true;
        C10621if ifVar = this.f26849i;
        if (ifVar != null) {
            ifVar.mo67620b();
        }
    }

    /* renamed from: a */
    public final void mo67639a(C10635iq iqVar) {
        C10765mq.m32773b(iqVar, "command");
        this.f26842b.add(iqVar);
    }

    /* renamed from: a */
    public final void mo67638a(C10624ii iiVar, long j, int i) {
        C10765mq.m32773b(iiVar, "chromeVersionHelper");
        this.f26845e = i;
        C10632in a = C10633io.m32430a(this.f26843c, iiVar);
        this.f26848h = a;
        if (a != null) {
            a.mo67627a(this.f26842b);
        }
        m32438a(j);
    }

    /* renamed from: i */
    private final void m32453i() {
        this.f26847g.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: a */
    private final void m32438a(long j) {
        C10765mq.m32765a("load timeout ", (Object) Long.valueOf(j));
        this.f26847g.postDelayed(new Runnable() {
            public final void run() {
                C10636ir.m32452h(C10636ir.this);
            }
        }, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m32452h(C10636ir irVar) {
        C10765mq.m32773b(irVar, "this$0");
        irVar.m32454j();
    }

    /* renamed from: j */
    private final void m32454j() {
        if (m32456l()) {
            m32455k();
            m32449g();
            return;
        }
        m32457m();
        C10621if ifVar = this.f26849i;
        if (ifVar != null) {
            ifVar.mo67620b();
        }
    }

    /* renamed from: k */
    private final void m32455k() {
        for (C10635iq next : this.f26842b) {
            if (next instanceof C10630im) {
                next.mo67630b();
            }
        }
    }

    /* renamed from: l */
    private final boolean m32456l() {
        for (C10635iq next : this.f26842b) {
            if (!next.mo67629a() && !(next instanceof C10630im)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    private final void m32457m() {
        for (C10635iq b : this.f26842b) {
            b.mo67630b();
        }
    }

    /* renamed from: b */
    public final void mo67640b() {
        m32453i();
        m32457m();
        this.f26842b.clear();
        this.f26844d = 0;
        this.f26846f = false;
    }
}
