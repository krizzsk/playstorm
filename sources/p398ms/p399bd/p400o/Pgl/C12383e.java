package p398ms.p399bd.p400o.Pgl;

import android.content.Context;
import p398ms.p399bd.p400o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.e */
final class C12383e extends pblb.pgla {
    C12383e() {
    }

    /* renamed from: a */
    public Object mo16530a(int i, long j, String str, Object obj) throws Throwable {
        int i2;
        Context b = pgla.m34772a().mo76482b();
        try {
            i2 = b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            i2 = -1;
        }
        return Integer.valueOf(i2);
    }
}
