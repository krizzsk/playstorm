package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.m */
public final class C5191m implements C5242u1 {

    /* renamed from: a */
    public final C5183l f13841a;

    public C5191m(C5183l lVar) {
        C5183l lVar2 = (C5183l) C5252z.m16435a(lVar, "output");
        this.f13841a = lVar2;
        lVar2.f13832a = this;
    }

    /* renamed from: a */
    public void mo26158a(int i, float f) throws IOException {
        C5183l lVar = this.f13841a;
        lVar.getClass();
        lVar.mo26131g(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: b */
    public void mo26163b(int i, Object obj, C5141f1 f1Var) throws IOException {
        this.f13841a.mo26121b(i, (C5207q0) obj, f1Var);
    }

    /* renamed from: a */
    public void mo26157a(int i, double d) throws IOException {
        C5183l lVar = this.f13841a;
        lVar.getClass();
        lVar.mo26129f(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public void mo26159a(int i, int i2) throws IOException {
        this.f13841a.mo26135j(i, C5183l.m16041d(i2));
    }

    /* renamed from: a */
    public void mo26160a(int i, long j) throws IOException {
        this.f13841a.mo26132g(i, C5183l.m16037b(j));
    }

    /* renamed from: a */
    public void mo26162a(int i, Object obj, C5141f1 f1Var) throws IOException {
        C5183l lVar = this.f13841a;
        lVar.mo26134i(i, 3);
        f1Var.mo25945a((C5207q0) obj, (C5242u1) lVar.f13832a);
        lVar.mo26134i(i, 4);
    }

    /* renamed from: a */
    public final void mo26161a(int i, Object obj) throws IOException {
        if (obj instanceof C5151i) {
            this.f13841a.mo26124c(i, (C5151i) obj);
        } else {
            this.f13841a.mo26118a(i, (C5207q0) obj);
        }
    }
}
