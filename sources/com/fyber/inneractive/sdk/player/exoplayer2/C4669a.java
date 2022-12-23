package com.fyber.inneractive.sdk.player.exoplayer2;

import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4701b;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4944o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5030g;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.a */
public abstract class C4669a implements C4911n {

    /* renamed from: a */
    public final int f11666a;

    /* renamed from: b */
    public C4912o f11667b;

    /* renamed from: c */
    public int f11668c;

    /* renamed from: d */
    public int f11669d;

    /* renamed from: e */
    public C4944o f11670e;

    /* renamed from: f */
    public long f11671f;

    /* renamed from: g */
    public boolean f11672g = true;

    /* renamed from: h */
    public boolean f11673h;

    public C4669a(int i) {
        this.f11666a = i;
    }

    /* renamed from: a */
    public final void mo25008a(int i) {
        this.f11668c = i;
    }

    /* renamed from: a */
    public abstract void mo25010a(long j, boolean z) throws C4697d;

    /* renamed from: a */
    public abstract void mo25012a(boolean z) throws C4697d;

    /* renamed from: a */
    public void mo25013a(C4869i[] iVarArr) throws C4697d {
    }

    /* renamed from: c */
    public final void mo25015c() {
        this.f11673h = true;
    }

    /* renamed from: d */
    public final void mo25016d() throws C4697d {
        C5023a.m15304b(this.f11669d == 2);
        this.f11669d = 1;
        mo25028r();
    }

    /* renamed from: e */
    public final void mo25017e() throws IOException {
        this.f11670e.mo25210a();
    }

    /* renamed from: f */
    public final void mo25018f() throws C4697d {
        boolean z = true;
        if (this.f11669d != 1) {
            z = false;
        }
        C5023a.m15304b(z);
        this.f11669d = 2;
        mo25027q();
    }

    /* renamed from: g */
    public final boolean mo25019g() {
        return this.f11672g;
    }

    /* renamed from: h */
    public final boolean mo25020h() {
        return this.f11673h;
    }

    /* renamed from: j */
    public C5030g mo25021j() {
        return null;
    }

    /* renamed from: k */
    public final int mo25022k() {
        return this.f11666a;
    }

    /* renamed from: l */
    public final void mo25023l() {
        boolean z = true;
        if (this.f11669d != 1) {
            z = false;
        }
        C5023a.m15304b(z);
        this.f11669d = 0;
        this.f11670e = null;
        this.f11673h = false;
        mo25026p();
    }

    /* renamed from: m */
    public final C4669a mo25024m() {
        return this;
    }

    /* renamed from: n */
    public final C4944o mo25025n() {
        return this.f11670e;
    }

    /* renamed from: p */
    public abstract void mo25026p();

    /* renamed from: q */
    public abstract void mo25027q() throws C4697d;

    /* renamed from: r */
    public abstract void mo25028r() throws C4697d;

    /* renamed from: a */
    public final int mo25006a() {
        return this.f11669d;
    }

    /* renamed from: a */
    public final void mo25011a(C4912o oVar, C4869i[] iVarArr, C4944o oVar2, long j, boolean z, long j2) throws C4697d {
        C5023a.m15304b(this.f11669d == 0);
        this.f11667b = oVar;
        this.f11669d = 1;
        mo25012a(z);
        C5023a.m15304b(!this.f11673h);
        this.f11670e = oVar2;
        this.f11672g = false;
        this.f11671f = j2;
        mo25013a(iVarArr);
        mo25010a(j, z);
    }

    /* renamed from: a */
    public final void mo25014a(C4869i[] iVarArr, C4944o oVar, long j) throws C4697d {
        C5023a.m15304b(!this.f11673h);
        this.f11670e = oVar;
        this.f11672g = false;
        this.f11671f = j;
        mo25013a(iVarArr);
    }

    /* renamed from: a */
    public final void mo25009a(long j) throws C4697d {
        this.f11673h = false;
        this.f11672g = false;
        mo25010a(j, false);
    }

    /* renamed from: a */
    public final int mo25007a(C4871j jVar, C4701b bVar, boolean z) {
        int a = this.f11670e.mo25209a(jVar, bVar, z);
        if (a == -4) {
            if (bVar.mo25109b(4)) {
                this.f11672g = true;
                if (this.f11673h) {
                    return -4;
                }
                return -3;
            }
            bVar.f11852d += this.f11671f;
        } else if (a == -5) {
            C4869i iVar = jVar.f12977a;
            long j = iVar.f12973w;
            if (j != Long.MAX_VALUE) {
                jVar.f12977a = iVar.mo25374a(j + this.f11671f);
            }
        }
        return a;
    }
}
