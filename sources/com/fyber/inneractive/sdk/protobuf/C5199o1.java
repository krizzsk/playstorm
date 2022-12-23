package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.o1 */
public class C5199o1 extends C5193m1<C5196n1, C5196n1> {
    /* renamed from: a */
    public void mo26167a(Object obj, int i, int i2) {
        ((C5196n1) obj).mo26195a(C5227t1.m16370a(i, 5), (Object) Integer.valueOf(i2));
    }

    /* renamed from: a */
    public boolean mo26172a(C5136e1 e1Var) {
        return false;
    }

    /* renamed from: b */
    public void mo26175b(Object obj, int i, long j) {
        ((C5196n1) obj).mo26195a(C5227t1.m16370a(i, 0), (Object) Long.valueOf(j));
    }

    /* renamed from: c */
    public int mo26178c(Object obj) {
        return ((C5196n1) obj).mo26198b();
    }

    /* renamed from: d */
    public int mo26180d(Object obj) {
        C5196n1 n1Var = (C5196n1) obj;
        int i = n1Var.f13851d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < n1Var.f13848a; i3++) {
            int i4 = n1Var.f13849b[i3];
            int i5 = C5227t1.f13895a;
            i2 += (C5183l.m16034b(1) * 2) + C5183l.m16046f(2, i4 >>> 3) + C5183l.m16025a(3, (C5151i) n1Var.f13850c[i3]);
        }
        n1Var.f13851d = i2;
        return i2;
    }

    /* renamed from: e */
    public void mo26181e(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.f13852e = false;
    }

    /* renamed from: f */
    public Object mo26182f(Object obj) {
        C5196n1 n1Var = (C5196n1) obj;
        n1Var.f13852e = false;
        return n1Var;
    }

    /* renamed from: a */
    public void mo26168a(Object obj, int i, long j) {
        ((C5196n1) obj).mo26195a(C5227t1.m16370a(i, 1), (Object) Long.valueOf(j));
    }

    /* renamed from: b */
    public void mo26177b(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (C5196n1) obj2;
    }

    /* renamed from: c */
    public void mo26179c(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).unknownFields = (C5196n1) obj2;
    }

    /* renamed from: a */
    public void mo26170a(Object obj, int i, Object obj2) {
        ((C5196n1) obj).mo26195a(C5227t1.m16370a(i, 3), (Object) (C5196n1) obj2);
    }

    /* renamed from: b */
    public void mo26176b(Object obj, C5242u1 u1Var) throws IOException {
        ((C5196n1) obj).mo26196a(u1Var);
    }

    /* renamed from: a */
    public void mo26169a(Object obj, int i, C5151i iVar) {
        ((C5196n1) obj).mo26195a(C5227t1.m16370a(i, 2), (Object) iVar);
    }

    /* renamed from: b */
    public Object mo26174b(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* renamed from: a */
    public Object mo26166a(Object obj, Object obj2) {
        C5196n1 n1Var = (C5196n1) obj;
        C5196n1 n1Var2 = (C5196n1) obj2;
        return n1Var2.equals(C5196n1.f13847f) ? n1Var : C5196n1.m16167a(n1Var, n1Var2);
    }

    /* renamed from: a */
    public void mo26171a(Object obj, C5242u1 u1Var) throws IOException {
        C5196n1 n1Var = (C5196n1) obj;
        n1Var.getClass();
        u1Var.getClass();
        for (int i = 0; i < n1Var.f13848a; i++) {
            int i2 = n1Var.f13849b[i];
            int i3 = C5227t1.f13895a;
            ((C5191m) u1Var).mo26161a(i2 >>> 3, n1Var.f13850c[i]);
        }
    }

    /* renamed from: a */
    public Object mo26164a() {
        return C5196n1.m16169c();
    }

    /* renamed from: a */
    public Object mo26165a(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C5196n1 n1Var = generatedMessageLite.unknownFields;
        if (n1Var != C5196n1.f13847f) {
            return n1Var;
        }
        C5196n1 c = C5196n1.m16169c();
        generatedMessageLite.unknownFields = c;
        return c;
    }
}
