package p398ms.p399bd.p400o.Pgl;

import android.content.Context;
import android.content.pm.Signature;
import p398ms.p399bd.p400o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.n */
final class C12401n extends pblb.pgla {
    C12401n() {
    }

    /* renamed from: a */
    public Object mo16530a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.m34772a().mo76482b();
        Signature[] signatureArr = b.getPackageManager().getPackageInfo(b.getPackageName(), 64).signatures;
        if (signatureArr == null || signatureArr.length <= 0) {
            return null;
        }
        return signatureArr[0].toByteArray();
    }
}
