package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5252z;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* renamed from: com.fyber.inneractive.sdk.protobuf.h1 */
public final class C5150h1 {

    /* renamed from: a */
    public static final Class<?> f13762a;

    /* renamed from: b */
    public static final C5193m1<?, ?> f13763b = m15724a(false);

    /* renamed from: c */
    public static final C5193m1<?, ?> f13764c = m15724a(true);

    /* renamed from: d */
    public static final C5193m1<?, ?> f13765d = new C5199o1();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f13762a = cls;
    }

    /* renamed from: a */
    public static void m15730a(int i, List<Boolean> list, C5242u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5191m mVar = (C5191m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13841a.mo26134i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).booleanValue();
                    Logger logger = C5183l.f13830b;
                    i3++;
                }
                mVar.f13841a.mo26130g(i3);
                while (i2 < list.size()) {
                    mVar.f13841a.mo26117a(list.get(i2).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13841a.mo26123b(i, list.get(i2).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: b */
    public static void m15738b(int i, List<Double> list, C5242u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5191m mVar = (C5191m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13841a.mo26134i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).doubleValue();
                    Logger logger = C5183l.f13830b;
                    i3 += 8;
                }
                mVar.f13841a.mo26130g(i3);
                while (i2 < list.size()) {
                    C5183l lVar = mVar.f13841a;
                    double doubleValue = list.get(i2).doubleValue();
                    lVar.getClass();
                    lVar.mo26125c(Double.doubleToRawLongBits(doubleValue));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C5183l lVar2 = mVar.f13841a;
                double doubleValue2 = list.get(i2).doubleValue();
                lVar2.getClass();
                lVar2.mo26129f(i, Double.doubleToRawLongBits(doubleValue2));
                i2++;
            }
        }
    }

    /* renamed from: c */
    public static void m15741c(int i, List<Integer> list, C5242u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5191m mVar = (C5191m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13841a.mo26134i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C5183l.m16020a(list.get(i4).intValue());
                }
                mVar.f13841a.mo26130g(i3);
                while (i2 < list.size()) {
                    mVar.f13841a.mo26128f(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13841a.mo26133h(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: d */
    public static void m15744d(int i, List<Integer> list, C5242u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5191m mVar = (C5191m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13841a.mo26134i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).intValue();
                    Logger logger = C5183l.f13830b;
                    i3 += 4;
                }
                mVar.f13841a.mo26130g(i3);
                while (i2 < list.size()) {
                    mVar.f13841a.mo26127e(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13841a.mo26131g(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: e */
    public static void m15747e(int i, List<Long> list, C5242u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5191m mVar = (C5191m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13841a.mo26134i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).longValue();
                    Logger logger = C5183l.f13830b;
                    i3 += 8;
                }
                mVar.f13841a.mo26130g(i3);
                while (i2 < list.size()) {
                    mVar.f13841a.mo26125c(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13841a.mo26129f(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: f */
    public static void m15750f(int i, List<Float> list, C5242u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5191m mVar = (C5191m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13841a.mo26134i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).floatValue();
                    Logger logger = C5183l.f13830b;
                    i3 += 4;
                }
                mVar.f13841a.mo26130g(i3);
                while (i2 < list.size()) {
                    C5183l lVar = mVar.f13841a;
                    float floatValue = list.get(i2).floatValue();
                    lVar.getClass();
                    lVar.mo26127e(Float.floatToRawIntBits(floatValue));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C5183l lVar2 = mVar.f13841a;
                float floatValue2 = list.get(i2).floatValue();
                lVar2.getClass();
                lVar2.mo26131g(i, Float.floatToRawIntBits(floatValue2));
                i2++;
            }
        }
    }

    /* renamed from: g */
    public static void m15753g(int i, List<Integer> list, C5242u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5191m mVar = (C5191m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13841a.mo26134i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C5183l.m16020a(list.get(i4).intValue());
                }
                mVar.f13841a.mo26130g(i3);
                while (i2 < list.size()) {
                    mVar.f13841a.mo26128f(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13841a.mo26133h(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: h */
    public static void m15756h(int i, List<Long> list, C5242u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5191m mVar = (C5191m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13841a.mo26134i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C5183l.m16029a(list.get(i4).longValue());
                }
                mVar.f13841a.mo26130g(i3);
                while (i2 < list.size()) {
                    mVar.f13841a.mo26126d(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13841a.mo26132g(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: i */
    public static void m15759i(int i, List<Integer> list, C5242u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5191m mVar = (C5191m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13841a.mo26134i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).intValue();
                    Logger logger = C5183l.f13830b;
                    i3 += 4;
                }
                mVar.f13841a.mo26130g(i3);
                while (i2 < list.size()) {
                    mVar.f13841a.mo26127e(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13841a.mo26131g(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: j */
    public static void m15761j(int i, List<Long> list, C5242u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5191m mVar = (C5191m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13841a.mo26134i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).longValue();
                    Logger logger = C5183l.f13830b;
                    i3 += 8;
                }
                mVar.f13841a.mo26130g(i3);
                while (i2 < list.size()) {
                    mVar.f13841a.mo26125c(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13841a.mo26129f(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: k */
    public static void m15762k(int i, List<Integer> list, C5242u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5191m mVar = (C5191m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13841a.mo26134i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C5183l.m16038c(C5183l.m16041d(list.get(i4).intValue()));
                }
                mVar.f13841a.mo26130g(i3);
                while (i2 < list.size()) {
                    mVar.f13841a.mo26130g(C5183l.m16041d(list.get(i2).intValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13841a.mo26135j(i, C5183l.m16041d(list.get(i2).intValue()));
                i2++;
            }
        }
    }

    /* renamed from: l */
    public static void m15763l(int i, List<Long> list, C5242u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5191m mVar = (C5191m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13841a.mo26134i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C5183l.m16029a(C5183l.m16037b(list.get(i4).longValue()));
                }
                mVar.f13841a.mo26130g(i3);
                while (i2 < list.size()) {
                    mVar.f13841a.mo26126d(C5183l.m16037b(list.get(i2).longValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13841a.mo26132g(i, C5183l.m16037b(list.get(i2).longValue()));
                i2++;
            }
        }
    }

    /* renamed from: m */
    public static void m15764m(int i, List<Integer> list, C5242u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5191m mVar = (C5191m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13841a.mo26134i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C5183l.m16038c(list.get(i4).intValue());
                }
                mVar.f13841a.mo26130g(i3);
                while (i2 < list.size()) {
                    mVar.f13841a.mo26130g(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13841a.mo26135j(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: n */
    public static void m15765n(int i, List<Long> list, C5242u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5191m mVar = (C5191m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f13841a.mo26134i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C5183l.m16029a(list.get(i4).longValue());
                }
                mVar.f13841a.mo26130g(i3);
                while (i2 < list.size()) {
                    mVar.f13841a.mo26126d(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13841a.mo26132g(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static void m15728a(int i, List<C5151i> list, C5242u1 u1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5191m mVar = (C5191m) u1Var;
            mVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                mVar.f13841a.mo26120b(i, list.get(i2));
            }
        }
    }

    /* renamed from: b */
    public static void m15736b(int i, List<String> list, C5242u1 u1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5191m mVar = (C5191m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (list instanceof C5140f0) {
                C5140f0 f0Var = (C5140f0) list;
                while (i2 < list.size()) {
                    Object a = f0Var.mo25873a(i2);
                    if (a instanceof String) {
                        mVar.f13841a.mo26122b(i, (String) a);
                    } else {
                        mVar.f13841a.mo26120b(i, (C5151i) a);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f13841a.mo26122b(i, list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: c */
    public static int m15739c(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return size * C5183l.m16035b(i, 0);
        }
        int i2 = size * 4;
        return C5183l.m16034b(i) + C5183l.m16038c(i2) + i2;
    }

    /* renamed from: d */
    public static int m15743d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5250y) {
            C5250y yVar = (C5250y) list;
            i = 0;
            while (i2 < size) {
                i += C5183l.m16020a(yVar.mo26308e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5183l.m16020a(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public static int m15746e(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5149h0) {
            C5149h0 h0Var = (C5149h0) list;
            i = 0;
            while (i2 < size) {
                i += C5183l.m16029a(h0Var.mo25972d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5183l.m16029a(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static int m15748f(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int e = m15746e(list);
        if (z) {
            return C5183l.m16034b(i) + C5183l.m16038c(e) + e;
        }
        return e + (list.size() * C5183l.m16034b(i));
    }

    /* renamed from: g */
    public static int m15752g(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5149h0) {
            C5149h0 h0Var = (C5149h0) list;
            i = 0;
            while (i2 < size) {
                i += C5183l.m16029a(C5183l.m16037b(h0Var.mo25972d(i2)));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5183l.m16029a(C5183l.m16037b(list.get(i2).longValue()));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: h */
    public static int m15754h(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int g = m15752g(list);
        if (z) {
            return C5183l.m16034b(i) + C5183l.m16038c(g) + g;
        }
        return g + (size * C5183l.m16034b(i));
    }

    /* renamed from: i */
    public static int m15758i(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5149h0) {
            C5149h0 h0Var = (C5149h0) list;
            i = 0;
            while (i2 < size) {
                i += C5183l.m16029a(h0Var.mo25972d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5183l.m16029a(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: j */
    public static int m15760j(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = m15758i(list);
        if (z) {
            return C5183l.m16034b(i) + C5183l.m16038c(i2) + i2;
        }
        return i2 + (size * C5183l.m16034b(i));
    }

    /* renamed from: a */
    public static void m15729a(int i, List<?> list, C5242u1 u1Var, C5141f1 f1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5191m mVar = (C5191m) u1Var;
            mVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                mVar.mo26162a(i, list.get(i2), f1Var);
            }
        }
    }

    /* renamed from: a */
    public static int m15723a(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5250y) {
            C5250y yVar = (C5250y) list;
            i = 0;
            while (i2 < size) {
                i += C5183l.m16020a(yVar.mo26308e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5183l.m16020a(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static int m15740c(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: f */
    public static int m15749f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5250y) {
            C5250y yVar = (C5250y) list;
            i = 0;
            while (i2 < size) {
                i += C5183l.m16038c(C5183l.m16041d(yVar.mo26308e(i2)));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5183l.m16038c(C5183l.m16041d(list.get(i2).intValue()));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: h */
    public static int m15755h(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5250y) {
            C5250y yVar = (C5250y) list;
            i = 0;
            while (i2 < size) {
                i += C5183l.m16038c(yVar.mo26308e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C5183l.m16038c(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static void m15737b(int i, List<?> list, C5242u1 u1Var, C5141f1 f1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            C5191m mVar = (C5191m) u1Var;
            mVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                mVar.f13841a.mo26121b(i, (C5207q0) list.get(i2), f1Var);
            }
        }
    }

    /* renamed from: e */
    public static int m15745e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int d = m15743d(list);
        if (z) {
            return C5183l.m16034b(i) + C5183l.m16038c(d) + d;
        }
        return d + (size * C5183l.m16034b(i));
    }

    /* renamed from: g */
    public static int m15751g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int f = m15749f(list);
        if (z) {
            return C5183l.m16034b(i) + C5183l.m16038c(f) + f;
        }
        return f + (size * C5183l.m16034b(i));
    }

    /* renamed from: d */
    public static int m15742d(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return size * C5183l.m16024a(i, 0);
        }
        int i2 = size * 8;
        return C5183l.m16034b(i) + C5183l.m16038c(i2) + i2;
    }

    /* renamed from: i */
    public static int m15757i(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h = m15755h(list);
        if (z) {
            return C5183l.m16034b(i) + C5183l.m16038c(h) + h;
        }
        return h + (size * C5183l.m16034b(i));
    }

    /* renamed from: b */
    public static int m15734b(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int a = m15723a(list);
        if (z) {
            return C5183l.m16034b(i) + C5183l.m16038c(a) + a;
        }
        return a + (size * C5183l.m16034b(i));
    }

    /* renamed from: a */
    public static int m15722a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return C5183l.m16034b(i) + C5183l.m16038c(size) + size;
        }
        return size * C5183l.m16028a(i, true);
    }

    /* renamed from: b */
    public static int m15735b(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: b */
    public static int m15732b(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int b = C5183l.m16034b(i) * size;
        if (list instanceof C5140f0) {
            C5140f0 f0Var = (C5140f0) list;
            while (i4 < size) {
                Object a = f0Var.mo25873a(i4);
                if (a instanceof C5151i) {
                    i3 = C5183l.m16031a((C5151i) a);
                } else {
                    i3 = C5183l.m16032a((String) a);
                }
                b += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C5151i) {
                    i2 = C5183l.m16031a((C5151i) obj);
                } else {
                    i2 = C5183l.m16032a((String) obj);
                }
                b += i2;
                i4++;
            }
        }
        return b;
    }

    /* renamed from: a */
    public static int m15719a(int i, Object obj, C5141f1 f1Var) {
        if (obj instanceof C5131d0) {
            return C5183l.m16034b(i) + C5183l.m16030a((C5131d0) obj);
        }
        int b = C5183l.m16034b(i);
        int serializedSize = ((C5116a) ((C5207q0) obj)).getSerializedSize(f1Var);
        return b + C5183l.m16038c(serializedSize) + serializedSize;
    }

    /* renamed from: a */
    public static int m15720a(int i, List<C5151i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int b = size * C5183l.m16034b(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            b += C5183l.m16031a(list.get(i2));
        }
        return b;
    }

    /* renamed from: a */
    public static int m15721a(int i, List<C5207q0> list, C5141f1 f1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C5183l.m16026a(i, list.get(i3), f1Var);
        }
        return i2;
    }

    /* renamed from: b */
    public static int m15733b(int i, List<?> list, C5141f1 f1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int b = C5183l.m16034b(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C5131d0) {
                b += C5183l.m16030a((C5131d0) obj);
            } else {
                int serializedSize = ((C5116a) ((C5207q0) obj)).getSerializedSize(f1Var);
                b += C5183l.m16038c(serializedSize) + serializedSize;
            }
        }
        return b;
    }

    /* renamed from: a */
    public static C5193m1<?, ?> m15724a(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C5193m1) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m15731a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static <UT, UB> UB m15726a(int i, List<Integer> list, C5252z.C5256d<?> dVar, UB ub, C5193m1<UT, UB> m1Var) {
        if (dVar == null) {
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue = list.get(i3).intValue();
            if (dVar.mo26316a(intValue) != null) {
                if (i3 != i2) {
                    list.set(i2, Integer.valueOf(intValue));
                }
                i2++;
            } else {
                if (ub == null) {
                    ub = m1Var.mo26164a();
                }
                m1Var.mo26175b(ub, i, (long) intValue);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    /* renamed from: a */
    public static <UT, UB> UB m15727a(int i, List<Integer> list, C5252z.C5257e eVar, UB ub, C5193m1<UT, UB> m1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (eVar.mo26317a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    if (ub == null) {
                        ub = m1Var.mo26164a();
                    }
                    m1Var.mo26175b(ub, i, (long) intValue);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.mo26317a(intValue2)) {
                    if (ub == null) {
                        ub = m1Var.mo26164a();
                    }
                    m1Var.mo26175b(ub, i, (long) intValue2);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: a */
    public static <UT, UB> UB m15725a(int i, int i2, UB ub, C5193m1<UT, UB> m1Var) {
        if (ub == null) {
            ub = m1Var.mo26164a();
        }
        m1Var.mo26175b(ub, i, (long) i2);
        return ub;
    }
}
