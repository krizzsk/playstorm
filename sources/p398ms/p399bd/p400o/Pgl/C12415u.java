package p398ms.p399bd.p400o.Pgl;

import android.content.Context;
import android.content.SharedPreferences;
import p398ms.p399bd.p400o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.u */
final class C12415u extends pblb.pgla {
    C12415u() {
    }

    /* renamed from: a */
    public Object mo16530a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.m34772a().mo76482b();
        String[] split = str.split((String) pblk.m34714a(16777217, 0, 0, "cea70a", new byte[]{78, 123}));
        String str2 = split[0];
        String str3 = split[1];
        SharedPreferences.Editor edit = b.getSharedPreferences(str2, 0).edit();
        edit.putString(str3, (String) obj);
        edit.commit();
        return null;
    }
}
