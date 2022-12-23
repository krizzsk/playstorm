package p398ms.p399bd.p400o.Pgl;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.File;
import p398ms.p399bd.p400o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.pble */
final class pble extends pblb.pgla {
    pble() {
    }

    /* renamed from: a */
    public Object mo16530a(int i, long j, String str, Object obj) throws Throwable {
        File file = new File(pgla.m34772a().mo76482b().getFilesDir(), (String) pblk.m34714a(16777217, 0, 0, "304015", new byte[]{108, 63, 84, SignedBytes.MAX_POWER_OF_TWO, Ascii.f17944SI, 54, 49}));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }
}
