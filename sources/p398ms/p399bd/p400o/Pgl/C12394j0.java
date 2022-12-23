package p398ms.p399bd.p400o.Pgl;

import com.google.common.base.Ascii;
import java.util.Locale;
import p398ms.p399bd.p400o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.j0 */
final class C12394j0 extends pblb.pgla {
    C12394j0() {
    }

    /* renamed from: a */
    public Object mo16530a(int i, long j, String str, Object obj) throws Throwable {
        String str2;
        try {
            Locale locale = pgla.m34772a().mo76482b().getResources().getConfiguration().locale;
            String language = locale.getLanguage();
            String country = locale.getCountry();
            StringBuilder sb = new StringBuilder();
            sb.append(language);
            sb.append((String) pblk.m34714a(16777217, 0, 0, "4a3a24", new byte[]{Ascii.SUB}));
            sb.append(country);
            str2 = sb.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        return C12426z0.m34807a(str2);
    }
}
