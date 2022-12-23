package p398ms.p399bd.p400o.Pgl;

import android.content.Context;
import p398ms.p399bd.p400o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.pblc */
final class pblc extends pblb.pgla {
    pblc() {
    }

    /* renamed from: a */
    public Object mo16530a(int i, long j, String str, Object obj) throws Throwable {
        try {
            Context b = pgla.m34772a().mo76482b();
            return b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            String str2 = (String) pblk.m34714a(16777217, 0, 0, "b2bafb", new byte[]{122, 57});
            return "";
        }
    }
}
