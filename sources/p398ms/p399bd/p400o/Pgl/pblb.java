package p398ms.p399bd.p400o.Pgl;

import android.util.SparseArray;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;

/* renamed from: ms.bd.o.Pgl.pblb */
public final class pblb {

    /* renamed from: a */
    private static final SparseArray<pgla> f29398a = new SparseArray<>();

    /* renamed from: ms.bd.o.Pgl.pblb$pgla */
    public static abstract class pgla {
        /* renamed from: a */
        public Object mo76450a(int i, int i2, long j, String str, Object obj) throws Throwable {
            return mo16530a(i2, j, str, obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo16530a(int i, long j, String str, Object obj) throws Throwable {
            return null;
        }
    }

    /* renamed from: a */
    public static Object m34696a(int i) {
        return pblk.m34714a(i, 0, 0, (String) null, (Object) null);
    }

    /* renamed from: a */
    public static Object m34697a(int i, int i2, long j, String str, Object obj) {
        return pblk.m34714a(i, i2, j, str, obj);
    }

    /* renamed from: a */
    public static void m34700a(int i, pgla pgla2) {
        pgla pgla3 = f29398a.get(i);
        if (pgla3 == null) {
            f29398a.put(i, pgla2);
        } else {
            throw new RuntimeException(String.format((String) pblk.m34714a(16777217, 0, 0, "4fa152", new byte[]{96, 119, 82, 77, Ascii.f17948VT, 33, 119, 69, 53, 100, 43, 36, 0, SignedBytes.MAX_POWER_OF_TWO, Ascii.f17935CR, 44, 36, 83, 53, 115, 107}), new Object[]{pgla3.toString()}));
        }
    }

    /* renamed from: b */
    public static Object m34701b(int i, int i2, long j, String str, Object obj) {
        pgla pgla2 = f29398a.get(i);
        if (pgla2 != null) {
            try {
                return pgla2.mo76450a(i, i2, j, str, obj);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        } else {
            throw new RuntimeException(String.format((String) pblk.m34714a(16777217, 0, 0, "0b8fa0", new byte[]{46, 112, Ascii.f17948VT, 17, 81, 35, 54, 3, 44, 50, 97, 105, 88, 82, 87, 41, 37, 66, 101, 63, 37}), new Object[]{Integer.valueOf(i)}));
        }
    }

    /* renamed from: a */
    public static Object m34698a(int i, long j) {
        return pblk.m34714a(i, 0, j, (String) null, (Object) null);
    }

    /* renamed from: a */
    public static Object m34699a(int i, String str) {
        return pblk.m34714a(i, 0, 0, str, (Object) null);
    }
}
