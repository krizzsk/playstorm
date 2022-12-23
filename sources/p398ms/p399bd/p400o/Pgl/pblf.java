package p398ms.p399bd.p400o.Pgl;

import com.google.common.base.Ascii;
import p398ms.p399bd.p400o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.pblf */
final class pblf extends pblb.pgla {
    pblf() {
    }

    /* renamed from: a */
    public Object mo16530a(int i, long j, String str, Object obj) throws Throwable {
        boolean z;
        try {
            z = pblj.m34713b(pgla.m34772a().mo76482b(), str, obj.toString());
        } catch (Throwable unused) {
            String str2 = (String) pblk.m34714a(16777217, 0, 0, "9c0de9", new byte[]{47, 96, 69});
            z = false;
        }
        if (z) {
            return (String) pblk.m34714a(16777217, 0, 0, "b967ac", new byte[]{92, Ascii.DLE});
        }
        return null;
    }
}
