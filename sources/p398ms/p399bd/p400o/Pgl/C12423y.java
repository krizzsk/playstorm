package p398ms.p399bd.p400o.Pgl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import p398ms.p399bd.p400o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.y */
final class C12423y extends pblb.pgla {
    C12423y() {
    }

    /* renamed from: a */
    public Object mo16530a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.m34772a().mo76482b();
        ApplicationInfo applicationInfo = b.getPackageManager().getApplicationInfo(b.getPackageName(), 0);
        String str2 = applicationInfo.sourceDir;
        return str2 != null ? str2 : applicationInfo.publicSourceDir;
    }
}
