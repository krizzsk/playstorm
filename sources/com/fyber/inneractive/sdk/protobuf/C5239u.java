package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5126c0;
import com.fyber.inneractive.sdk.protobuf.C5207q0;
import com.fyber.inneractive.sdk.protobuf.C5227t1;
import com.fyber.inneractive.sdk.protobuf.C5239u.C5240a;
import com.fyber.inneractive.sdk.protobuf.C5252z;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: com.fyber.inneractive.sdk.protobuf.u */
public final class C5239u<T extends C5240a<T>> {

    /* renamed from: d */
    public static final C5239u f13934d;

    /* renamed from: a */
    public final C5164i1<T, Object> f13935a;

    /* renamed from: b */
    public boolean f13936b;

    /* renamed from: c */
    public boolean f13937c;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.u$a */
    public interface C5240a<T extends C5240a<T>> extends Comparable<T> {
        /* renamed from: a */
        int mo25814a();

        /* renamed from: a */
        C5207q0.C5208a mo25815a(C5207q0.C5208a aVar, C5207q0 q0Var);

        /* renamed from: b */
        boolean mo25816b();

        /* renamed from: c */
        C5227t1.C5229b mo25817c();

        /* renamed from: d */
        C5227t1.C5234c mo25819d();

        /* renamed from: e */
        boolean mo25820e();
    }

    static {
        C5239u uVar = new C5239u(C5164i1.m15807b(0));
        uVar.mo26289g();
        f13934d = uVar;
    }

    public C5239u() {
        this.f13935a = C5164i1.m15807b(16);
    }

    /* renamed from: b */
    public static <T extends C5240a<T>> C5239u<T> m16385b() {
        return f13934d;
    }

    /* renamed from: a */
    public C5239u<T> clone() {
        C5239u<T> uVar = new C5239u<>();
        for (int i = 0; i < this.f13935a.f13780b.size(); i++) {
            Map.Entry<T, Object> a = this.f13935a.mo26009a(i);
            uVar.mo26281c((C5240a) a.getKey(), a.getValue());
        }
        for (Map.Entry next : this.f13935a.mo26011b()) {
            uVar.mo26281c((C5240a) next.getKey(), next.getValue());
        }
        uVar.f13937c = this.f13937c;
        return uVar;
    }

    /* renamed from: c */
    public void mo26281c(T t, Object obj) {
        if (!t.mo25816b()) {
            mo26285d(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mo26285d(t, it.next());
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C5126c0) {
            this.f13937c = true;
        }
        this.f13935a.put(t, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if ((r7 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r0 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new java.lang.Object[]{java.lang.Integer.valueOf(r6.mo25814a()), r6.mo25817c().f13918a, r7.getClass().getName()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r7 instanceof com.fyber.inneractive.sdk.protobuf.C5126c0) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r7 instanceof com.fyber.inneractive.sdk.protobuf.C5252z.C5255c) == false) goto L_0x0043;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26285d(T r6, java.lang.Object r7) {
        /*
            r5 = this;
            com.fyber.inneractive.sdk.protobuf.t1$b r0 = r6.mo25817c()
            java.nio.charset.Charset r1 = com.fyber.inneractive.sdk.protobuf.C5252z.f13963a
            r7.getClass()
            com.fyber.inneractive.sdk.protobuf.t1$c r0 = r0.f13918a
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x0040;
                case 1: goto L_0x003d;
                case 2: goto L_0x003a;
                case 3: goto L_0x0037;
                case 4: goto L_0x0034;
                case 5: goto L_0x0031;
                case 6: goto L_0x0027;
                case 7: goto L_0x001e;
                case 8: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0043
        L_0x0015:
            boolean r0 = r7 instanceof com.fyber.inneractive.sdk.protobuf.C5207q0
            if (r0 != 0) goto L_0x002f
            boolean r0 = r7 instanceof com.fyber.inneractive.sdk.protobuf.C5126c0
            if (r0 == 0) goto L_0x0043
            goto L_0x002f
        L_0x001e:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x002f
            boolean r0 = r7 instanceof com.fyber.inneractive.sdk.protobuf.C5252z.C5255c
            if (r0 == 0) goto L_0x0043
            goto L_0x002f
        L_0x0027:
            boolean r0 = r7 instanceof com.fyber.inneractive.sdk.protobuf.C5151i
            if (r0 != 0) goto L_0x002f
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L_0x0043
        L_0x002f:
            r0 = r2
            goto L_0x0044
        L_0x0031:
            boolean r0 = r7 instanceof java.lang.String
            goto L_0x0044
        L_0x0034:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L_0x0044
        L_0x0037:
            boolean r0 = r7 instanceof java.lang.Double
            goto L_0x0044
        L_0x003a:
            boolean r0 = r7 instanceof java.lang.Float
            goto L_0x0044
        L_0x003d:
            boolean r0 = r7 instanceof java.lang.Long
            goto L_0x0044
        L_0x0040:
            boolean r0 = r7 instanceof java.lang.Integer
            goto L_0x0044
        L_0x0043:
            r0 = r1
        L_0x0044:
            if (r0 == 0) goto L_0x0047
            return
        L_0x0047:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r6.mo25814a()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r1] = r4
            com.fyber.inneractive.sdk.protobuf.t1$b r6 = r6.mo25817c()
            com.fyber.inneractive.sdk.protobuf.t1$c r6 = r6.f13918a
            r3[r2] = r6
            java.lang.Class r6 = r7.getClass()
            java.lang.String r6 = r6.getName()
            r7 = 2
            r3[r7] = r6
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5239u.mo26285d(com.fyber.inneractive.sdk.protobuf.u$a, java.lang.Object):void");
    }

    /* renamed from: e */
    public boolean mo26286e() {
        for (int i = 0; i < this.f13935a.f13780b.size(); i++) {
            if (!m16386b(this.f13935a.mo26009a(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> b : this.f13935a.mo26011b()) {
            if (!m16386b(b)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5239u)) {
            return false;
        }
        return this.f13935a.equals(((C5239u) obj).f13935a);
    }

    /* renamed from: f */
    public Iterator<Map.Entry<T, Object>> mo26288f() {
        if (this.f13937c) {
            return new C5126c0.C5128b(this.f13935a.entrySet().iterator());
        }
        return this.f13935a.entrySet().iterator();
    }

    /* renamed from: g */
    public void mo26289g() {
        if (!this.f13936b) {
            this.f13935a.mo26016d();
            this.f13936b = true;
        }
    }

    public int hashCode() {
        return this.f13935a.hashCode();
    }

    /* renamed from: b */
    public static <T extends C5240a<T>> boolean m16386b(Map.Entry<T, Object> entry) {
        C5240a aVar = (C5240a) entry.getKey();
        if (aVar.mo25819d() == C5227t1.C5234c.MESSAGE) {
            if (aVar.mo25816b()) {
                for (C5207q0 isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C5207q0) {
                    if (!((C5207q0) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof C5126c0) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public C5239u(C5164i1<T, Object> i1Var) {
        this.f13935a = i1Var;
        mo26289g();
    }

    /* renamed from: a */
    public static int m16382a(C5227t1.C5229b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.f13919b;
    }

    /* renamed from: a */
    public Object mo26277a(T t) {
        Object obj = this.f13935a.get(t);
        return obj instanceof C5126c0 ? ((C5126c0) obj).mo25868a((C5207q0) null) : obj;
    }

    /* renamed from: a */
    public void mo26278a(T t, Object obj) {
        List list;
        if (((GeneratedMessageLite.C5110c) t).f13694d) {
            mo26285d(t, obj);
            Object a = mo26277a(t);
            if (a == null) {
                list = new ArrayList();
                this.f13935a.put(t, list);
            } else {
                list = (List) a;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public static int m16384b(C5240a<?> aVar, Object obj) {
        C5227t1.C5229b c = aVar.mo25817c();
        int a = aVar.mo25814a();
        if (!aVar.mo25816b()) {
            return m16380a(c, a, obj);
        }
        int i = 0;
        if (aVar.mo25820e()) {
            for (Object a2 : (List) obj) {
                i += m16381a(c, a2);
            }
            return C5183l.m16034b(a) + i + C5183l.m16038c(i);
        }
        for (Object a3 : (List) obj) {
            i += m16380a(c, a, a3);
        }
        return i;
    }

    /* renamed from: a */
    public void mo26279a(C5239u<T> uVar) {
        for (int i = 0; i < uVar.f13935a.f13780b.size(); i++) {
            mo26282c(uVar.f13935a.mo26009a(i));
        }
        for (Map.Entry<T, Object> c : uVar.f13935a.mo26011b()) {
            mo26282c(c);
        }
    }

    /* renamed from: c */
    public final void mo26282c(Map.Entry<T, Object> entry) {
        C5240a aVar = (C5240a) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C5126c0) {
            value = ((C5126c0) value).mo25868a((C5207q0) null);
        }
        if (aVar.mo25816b()) {
            Object a = mo26277a(aVar);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m16383a(a2));
            }
            this.f13935a.put(aVar, a);
        } else if (aVar.mo25819d() == C5227t1.C5234c.MESSAGE) {
            Object a3 = mo26277a(aVar);
            if (a3 == null) {
                this.f13935a.put(aVar, m16383a(value));
                return;
            }
            this.f13935a.put(aVar, ((GeneratedMessageLite.C5108a) aVar.mo25815a(((C5207q0) a3).toBuilder(), (C5207q0) value)).mo25809a());
        } else {
            this.f13935a.put(aVar, m16383a(value));
        }
    }

    /* renamed from: a */
    public static Object m16383a(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    public final int mo26275a(Map.Entry<T, Object> entry) {
        int b;
        int c;
        C5240a aVar = (C5240a) entry.getKey();
        Object value = entry.getValue();
        if (aVar.mo25819d() != C5227t1.C5234c.MESSAGE || aVar.mo25816b() || aVar.mo25820e()) {
            return m16384b(aVar, value);
        }
        if (value instanceof C5126c0) {
            b = (C5183l.m16034b(1) * 2) + C5183l.m16046f(2, ((C5240a) entry.getKey()).mo25814a());
            c = C5183l.m16034b(3) + C5183l.m16030a((C5131d0) (C5126c0) value);
        } else {
            b = (C5183l.m16034b(1) * 2) + C5183l.m16046f(2, ((C5240a) entry.getKey()).mo25814a());
            int b2 = C5183l.m16034b(3);
            int serializedSize = ((C5207q0) value).getSerializedSize();
            c = b2 + C5183l.m16038c(serializedSize) + serializedSize;
        }
        return b + c;
    }

    /* renamed from: d */
    public int mo26284d() {
        int i = 0;
        for (int i2 = 0; i2 < this.f13935a.f13780b.size(); i2++) {
            Map.Entry<T, Object> a = this.f13935a.mo26009a(i2);
            i += m16384b((C5240a) a.getKey(), a.getValue());
        }
        for (Map.Entry next : this.f13935a.mo26011b()) {
            i += m16384b((C5240a) next.getKey(), next.getValue());
        }
        return i;
    }

    /* renamed from: a */
    public static int m16380a(C5227t1.C5229b bVar, int i, Object obj) {
        int b = C5183l.m16034b(i);
        if (bVar == C5227t1.C5229b.GROUP) {
            b *= 2;
        }
        return b + m16381a(bVar, obj);
    }

    /* renamed from: c */
    public int mo26280c() {
        int i = 0;
        for (int i2 = 0; i2 < this.f13935a.f13780b.size(); i2++) {
            i += mo26275a(this.f13935a.mo26009a(i2));
        }
        for (Map.Entry<T, Object> a : this.f13935a.mo26011b()) {
            i += mo26275a(a);
        }
        return i;
    }

    /* renamed from: a */
    public static int m16381a(C5227t1.C5229b bVar, Object obj) {
        int serializedSize;
        int c;
        switch (bVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = C5183l.f13830b;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = C5183l.f13830b;
                return 4;
            case 2:
                return C5183l.m16029a(((Long) obj).longValue());
            case 3:
                return C5183l.m16029a(((Long) obj).longValue());
            case 4:
                return C5183l.m16020a(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                Logger logger3 = C5183l.f13830b;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                Logger logger4 = C5183l.f13830b;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger5 = C5183l.f13830b;
                return 1;
            case 8:
                if (obj instanceof C5151i) {
                    return C5183l.m16031a((C5151i) obj);
                }
                return C5183l.m16032a((String) obj);
            case 9:
                Logger logger6 = C5183l.f13830b;
                return ((C5207q0) obj).getSerializedSize();
            case 10:
                if (!(obj instanceof C5126c0)) {
                    Logger logger7 = C5183l.f13830b;
                    serializedSize = ((C5207q0) obj).getSerializedSize();
                    c = C5183l.m16038c(serializedSize);
                    break;
                } else {
                    return C5183l.m16030a((C5131d0) (C5126c0) obj);
                }
            case 11:
                if (!(obj instanceof C5151i)) {
                    Logger logger8 = C5183l.f13830b;
                    serializedSize = ((byte[]) obj).length;
                    c = C5183l.m16038c(serializedSize);
                    break;
                } else {
                    return C5183l.m16031a((C5151i) obj);
                }
            case 12:
                return C5183l.m16038c(((Integer) obj).intValue());
            case 13:
                if (obj instanceof C5252z.C5255c) {
                    return C5183l.m16020a(((C5252z.C5255c) obj).mo24088a());
                }
                return C5183l.m16020a(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger9 = C5183l.f13830b;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger10 = C5183l.f13830b;
                return 8;
            case 16:
                return C5183l.m16038c(C5183l.m16041d(((Integer) obj).intValue()));
            case 17:
                return C5183l.m16029a(C5183l.m16037b(((Long) obj).longValue()));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return c + serializedSize;
    }
}
