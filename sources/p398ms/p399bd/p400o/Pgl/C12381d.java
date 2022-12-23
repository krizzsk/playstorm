package p398ms.p399bd.p400o.Pgl;

import java.io.File;
import p398ms.p399bd.p400o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.d */
final class C12381d extends pblb.pgla {
    C12381d() {
    }

    /* renamed from: a */
    public Object mo16530a(int i, long j, String str, Object obj) throws Throwable {
        File file = new File(pgla.m34772a().mo76482b().getFilesDir(), (String) pblk.m34714a(16777217, 0, 0, "d556c6", new byte[]{59, 58, 85, 70, 93, 53, 102}));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }
}
