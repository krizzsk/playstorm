package p398ms.p399bd.p400o.Pgl;

import android.telephony.TelephonyManager;
import com.google.common.base.Ascii;
import p398ms.p399bd.p400o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.o */
final class C12403o extends pblb.pgla {
    C12403o() {
    }

    /* renamed from: a */
    public Object mo16530a(int i, long j, String str, Object obj) throws Throwable {
        Boolean bool = Boolean.FALSE;
        TelephonyManager telephonyManager = (TelephonyManager) pgla.m34772a().mo76482b().getApplicationContext().getSystemService((String) pblk.m34714a(16777217, 0, 0, "9f4f2e", new byte[]{56, 108, 72, Ascii.f17938FS, 8}));
        return (telephonyManager == null || telephonyManager.getSimState() != 5) ? bool : Boolean.TRUE;
    }
}
