package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5126c0;
import com.fyber.inneractive.sdk.protobuf.C5227t1;
import com.fyber.inneractive.sdk.protobuf.C5239u;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.u0 */
public final class C5241u0<T> implements C5141f1<T> {

    /* renamed from: a */
    public final C5207q0 f13938a;

    /* renamed from: b */
    public final C5193m1<?, ?> f13939b;

    /* renamed from: c */
    public final boolean f13940c;

    /* renamed from: d */
    public final C5210r<?> f13941d;

    public C5241u0(C5193m1<?, ?> m1Var, C5210r<?> rVar, C5207q0 q0Var) {
        this.f13939b = m1Var;
        this.f13940c = rVar.mo26227a(q0Var);
        this.f13941d = rVar;
        this.f13938a = q0Var;
    }

    /* renamed from: a */
    public T mo25943a() {
        return ((GeneratedMessageLite.C5108a) this.f13938a.newBuilderForType()).mo25811b();
    }

    /* renamed from: b */
    public boolean mo25950b(T t, T t2) {
        if (!this.f13939b.mo26174b(t).equals(this.f13939b.mo26174b(t2))) {
            return false;
        }
        if (this.f13940c) {
            return this.f13941d.mo26221a((Object) t).equals(this.f13941d.mo26221a((Object) t2));
        }
        return true;
    }

    /* renamed from: c */
    public void mo25951c(T t) {
        this.f13939b.mo26181e(t);
        this.f13941d.mo26229c(t);
    }

    /* renamed from: d */
    public int mo25952d(T t) {
        int hashCode = this.f13939b.mo26174b(t).hashCode();
        return this.f13940c ? (hashCode * 53) + this.f13941d.mo26221a((Object) t).f13935a.hashCode() : hashCode;
    }

    /* renamed from: a */
    public void mo25946a(T t, T t2) {
        C5193m1<?, ?> m1Var = this.f13939b;
        Class<?> cls = C5150h1.f13762a;
        m1Var.mo26179c(t, m1Var.mo26166a(m1Var.mo26174b(t), m1Var.mo26174b(t2)));
        if (this.f13940c) {
            C5210r<?> rVar = this.f13941d;
            C5239u<?> a = rVar.mo26221a((Object) t2);
            if (!a.f13935a.isEmpty()) {
                rVar.mo26228b(t).mo26279a(a);
            }
        }
    }

    /* renamed from: b */
    public int mo25949b(T t) {
        C5193m1<?, ?> m1Var = this.f13939b;
        int d = m1Var.mo26180d(m1Var.mo26174b(t)) + 0;
        return this.f13940c ? d + this.f13941d.mo26221a((Object) t).mo26280c() : d;
    }

    /* renamed from: a */
    public void mo25945a(T t, C5242u1 u1Var) throws IOException {
        Iterator<Map.Entry<?, Object>> f = this.f13941d.mo26221a((Object) t).mo26288f();
        while (f.hasNext()) {
            Map.Entry next = f.next();
            C5239u.C5240a aVar = (C5239u.C5240a) next.getKey();
            if (aVar.mo25819d() != C5227t1.C5234c.MESSAGE || aVar.mo25816b() || aVar.mo25820e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C5126c0.C5127a) {
                ((C5191m) u1Var).mo26161a(aVar.mo25814a(), (Object) ((C5126c0.C5127a) next).f13729a.getValue().mo25867a());
            } else {
                ((C5191m) u1Var).mo26161a(aVar.mo25814a(), next.getValue());
            }
        }
        C5193m1<?, ?> m1Var = this.f13939b;
        m1Var.mo26171a(m1Var.mo26174b(t), u1Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25947a(T r11, byte[] r12, int r13, int r14, com.fyber.inneractive.sdk.protobuf.C5133e.C5134a r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r0 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite) r0
            com.fyber.inneractive.sdk.protobuf.n1 r1 = r0.unknownFields
            com.fyber.inneractive.sdk.protobuf.n1 r2 = com.fyber.inneractive.sdk.protobuf.C5196n1.f13847f
            if (r1 != r2) goto L_0x000f
            com.fyber.inneractive.sdk.protobuf.n1 r1 = com.fyber.inneractive.sdk.protobuf.C5196n1.m16169c()
            r0.unknownFields = r1
        L_0x000f:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage r11 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.ExtendableMessage) r11
            com.fyber.inneractive.sdk.protobuf.u r11 = r11.ensureExtensionsAreMutable()
            r0 = 0
            r2 = r0
        L_0x0017:
            if (r13 >= r14) goto L_0x00c5
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r12, r13, r15)
            int r13 = r15.f13742a
            int r3 = com.fyber.inneractive.sdk.protobuf.C5227t1.f13895a
            r5 = 2
            if (r13 == r3) goto L_0x0061
            r3 = r13 & 7
            if (r3 != r5) goto L_0x005c
            com.fyber.inneractive.sdk.protobuf.r<?> r2 = r10.f13941d
            com.fyber.inneractive.sdk.protobuf.q r3 = r15.f13745d
            com.fyber.inneractive.sdk.protobuf.q0 r5 = r10.f13938a
            int r6 = r13 >>> 3
            java.lang.Object r2 = r2.mo26223a(r3, r5, r6)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d r8 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C5111d) r8
            if (r8 == 0) goto L_0x0051
            com.fyber.inneractive.sdk.protobuf.b1 r13 = com.fyber.inneractive.sdk.protobuf.C5124b1.f13725c
            com.fyber.inneractive.sdk.protobuf.q0 r2 = r8.f13698c
            java.lang.Class r2 = r2.getClass()
            com.fyber.inneractive.sdk.protobuf.f1 r13 = r13.mo25837a(r2)
            int r13 = com.fyber.inneractive.sdk.protobuf.C5133e.m15553a((com.fyber.inneractive.sdk.protobuf.C5141f1) r13, (byte[]) r12, (int) r4, (int) r14, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r15)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r8.f13699d
            java.lang.Object r3 = r15.f13744c
            r11.mo26281c(r2, r3)
            goto L_0x005a
        L_0x0051:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.fyber.inneractive.sdk.protobuf.C5133e.m15548a((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.fyber.inneractive.sdk.protobuf.C5196n1) r6, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r7)
        L_0x005a:
            r2 = r8
            goto L_0x0017
        L_0x005c:
            int r13 = com.fyber.inneractive.sdk.protobuf.C5133e.m15547a((int) r13, (byte[]) r12, (int) r4, (int) r14, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r15)
            goto L_0x0017
        L_0x0061:
            r13 = 0
            r3 = r0
        L_0x0063:
            if (r4 >= r14) goto L_0x00b9
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r12, r4, r15)
            int r6 = r15.f13742a
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r5) goto L_0x009a
            r9 = 3
            if (r7 == r9) goto L_0x0075
            goto L_0x00af
        L_0x0075:
            if (r2 == 0) goto L_0x008f
            com.fyber.inneractive.sdk.protobuf.b1 r6 = com.fyber.inneractive.sdk.protobuf.C5124b1.f13725c
            com.fyber.inneractive.sdk.protobuf.q0 r7 = r2.f13698c
            java.lang.Class r7 = r7.getClass()
            com.fyber.inneractive.sdk.protobuf.f1 r6 = r6.mo25837a(r7)
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15553a((com.fyber.inneractive.sdk.protobuf.C5141f1) r6, (byte[]) r12, (int) r4, (int) r14, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r15)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r6 = r2.f13699d
            java.lang.Object r7 = r15.f13744c
            r11.mo26281c(r6, r7)
            goto L_0x0063
        L_0x008f:
            if (r8 != r5) goto L_0x00af
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15555a(r12, r4, r15)
            java.lang.Object r3 = r15.f13744c
            com.fyber.inneractive.sdk.protobuf.i r3 = (com.fyber.inneractive.sdk.protobuf.C5151i) r3
            goto L_0x0063
        L_0x009a:
            if (r8 != 0) goto L_0x00af
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15562d(r12, r4, r15)
            int r13 = r15.f13742a
            com.fyber.inneractive.sdk.protobuf.r<?> r2 = r10.f13941d
            com.fyber.inneractive.sdk.protobuf.q r6 = r15.f13745d
            com.fyber.inneractive.sdk.protobuf.q0 r7 = r10.f13938a
            java.lang.Object r2 = r2.mo26223a(r6, r7, r13)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d r2 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C5111d) r2
            goto L_0x0063
        L_0x00af:
            int r7 = com.fyber.inneractive.sdk.protobuf.C5227t1.f13896b
            if (r6 != r7) goto L_0x00b4
            goto L_0x00b9
        L_0x00b4:
            int r4 = com.fyber.inneractive.sdk.protobuf.C5133e.m15547a((int) r6, (byte[]) r12, (int) r4, (int) r14, (com.fyber.inneractive.sdk.protobuf.C5133e.C5134a) r15)
            goto L_0x0063
        L_0x00b9:
            if (r3 == 0) goto L_0x00c2
            int r13 = com.fyber.inneractive.sdk.protobuf.C5227t1.m16370a(r13, r5)
            r1.mo26195a((int) r13, (java.lang.Object) r3)
        L_0x00c2:
            r13 = r4
            goto L_0x0017
        L_0x00c5:
            if (r13 != r14) goto L_0x00c8
            return
        L_0x00c8:
            com.fyber.inneractive.sdk.protobuf.a0 r11 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15530g()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5241u0.mo25947a(java.lang.Object, byte[], int, int, com.fyber.inneractive.sdk.protobuf.e$a):void");
    }

    /* renamed from: a */
    public void mo25944a(T t, C5136e1 e1Var, C5205q qVar) throws IOException {
        C5193m1<?, ?> m1Var = this.f13939b;
        C5210r<?> rVar = this.f13941d;
        Object a = m1Var.mo26165a((Object) t);
        C5239u<?> b = rVar.mo26228b(t);
        while (true) {
            try {
                if (e1Var.mo25922s() != Integer.MAX_VALUE) {
                    if (!mo26291a(e1Var, qVar, rVar, b, m1Var, a)) {
                        break;
                    }
                } else {
                    break;
                }
            } finally {
                m1Var.mo26177b((Object) t, a);
            }
        }
    }

    /* renamed from: a */
    public final <UT, UB, ET extends C5239u.C5240a<ET>> boolean mo26291a(C5136e1 e1Var, C5205q qVar, C5210r<ET> rVar, C5239u<ET> uVar, C5193m1<UT, UB> m1Var, UB ub) throws IOException {
        int e = e1Var.mo25895e();
        if (e == C5227t1.f13895a) {
            int i = 0;
            Object obj = null;
            C5151i iVar = null;
            while (e1Var.mo25922s() != Integer.MAX_VALUE) {
                int e2 = e1Var.mo25895e();
                if (e2 == C5227t1.f13897c) {
                    i = e1Var.mo25891c();
                    obj = rVar.mo26223a(qVar, this.f13938a, i);
                } else if (e2 == C5227t1.f13898d) {
                    if (obj != null) {
                        rVar.mo26224a(e1Var, obj, qVar, uVar);
                    } else {
                        iVar = e1Var.mo25880a();
                    }
                } else if (!e1Var.mo25904i()) {
                    break;
                }
            }
            if (e1Var.mo25895e() == C5227t1.f13896b) {
                if (iVar != null) {
                    if (obj != null) {
                        rVar.mo26225a(iVar, obj, qVar, uVar);
                    } else {
                        m1Var.mo26169a(ub, i, iVar);
                    }
                }
                return true;
            }
            throw C5119a0.m15524a();
        } else if ((e & 7) != 2) {
            return e1Var.mo25904i();
        } else {
            Object a = rVar.mo26223a(qVar, this.f13938a, e >>> 3);
            if (a == null) {
                return m1Var.mo26173a(ub, e1Var);
            }
            rVar.mo26224a(e1Var, a, qVar, uVar);
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo25948a(T t) {
        return this.f13941d.mo26221a((Object) t).mo26286e();
    }
}
