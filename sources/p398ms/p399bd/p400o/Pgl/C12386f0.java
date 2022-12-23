package p398ms.p399bd.p400o.Pgl;

import android.content.Context;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.lang.reflect.Method;
import p398ms.p399bd.p400o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.f0 */
final class C12386f0 extends pblb.pgla {
    C12386f0() {
    }

    /* renamed from: a */
    public Object mo16530a(int i, long j, String str, Object obj) throws Throwable {
        double d;
        Context b = pgla.m34772a().mo76482b();
        try {
            Class<?> cls = Class.forName(new String(pblz.m34771a((String) pblk.m34714a(16777217, 0, 0, "f65904", new byte[]{33, 103, Ascii.DLE, 75, 89, 39, 55, Ascii.DC2, 50, 56, 33, 49, Ascii.DLE, Ascii.f17936EM, 88, 113, 51, 17, 50, 48, 33, 96, Ascii.DC4, 72, 89, 122, 51, Ascii.DC2, 51, 61, 33, 97, 17, Ascii.f17947US, 89, 38, 51, 70, 50, 106, 37, 49, Ascii.DLE, 75, 88, 112, 55, Ascii.DC2, 49, 57, 33, 50, 17, Ascii.SUB, 89, 118, 50, 69, 49, 57, 32, 102, Ascii.DLE, 75, 89, 117, 51, 78, 50, 106, 33, 97}))));
            Object newInstance = cls.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{b});
            Method declaredMethod = cls.getDeclaredMethod(new String(pblz.m34771a((String) pblk.m34714a(16777217, 0, 0, "db84f7", new byte[]{35, 55, Ascii.f17939GS, Ascii.NAK, Ascii.f17945SO, 116, 51, Ascii.DC2, 62, 50, 35, 53, Ascii.f17938FS, Ascii.DC2, Ascii.f17944SI, 113, 49, Ascii.DC4, 63, 49, 32, 48, Ascii.f17939GS, 70, Ascii.f17945SO, 119, 49, Ascii.SYN, 62, 54}))), new Class[]{String.class});
            declaredMethod.setAccessible(true);
            Object[] objArr = new Object[1];
            objArr[0] = new String(pblz.m34771a((String) pblk.m34714a(16777217, 0, 0, "fdef88", new byte[]{33, 52, SignedBytes.MAX_POWER_OF_TWO, 67, 80, 123, 50, 17, 98, 99, 32, 52, 65, 75, 85, 42, 51, Ascii.SYN, 98, 103, 32, 54, SignedBytes.MAX_POWER_OF_TWO, 67, 81, 124, 51, Ascii.f17938FS, 99, 98, 32, 63})));
            d = ((Double) declaredMethod.invoke(newInstance, objArr)).doubleValue();
        } catch (Throwable unused) {
            d = 0.0d;
        }
        return Integer.toString((int) d);
    }
}
