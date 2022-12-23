package p398ms.p399bd.p400o.Pgl;

import java.util.TimeZone;
import p398ms.p399bd.p400o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.i0 */
final class C12392i0 extends pblb.pgla {
    C12392i0() {
    }

    /* renamed from: a */
    public Object mo16530a(int i, long j, String str, Object obj) throws Throwable {
        String str2;
        int i2;
        try {
            TimeZone timeZone = TimeZone.getDefault();
            str2 = timeZone.getID();
            try {
                i2 = ((timeZone.getRawOffset() / 60) / 60) / 1000;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str2 = null;
            i2 = 0;
            return str2 + ((String) pblk.m34714a(16777217, 0, 0, "329840", new byte[]{110})) + i2;
        }
        return str2 + ((String) pblk.m34714a(16777217, 0, 0, "329840", new byte[]{110})) + i2;
    }
}
