package p398ms.p399bd.p400o.Pgl;

import com.google.common.base.Ascii;
import kotlin.text.Typography;

/* renamed from: ms.bd.o.Pgl.z0 */
public class C12426z0 {
    static {
        String str = (String) pblk.m34714a(16777217, 0, 0, "1772ea", new byte[]{Ascii.ESC, 105, 5, Ascii.CAN, 103});
    }

    /* renamed from: a */
    public static String m34807a(String str) {
        return (str == null || str.length() <= 0) ? "" : str.trim().replace('\'', ' ').replace(Typography.quote, ' ').replace(13, ' ').replace(10, ' ');
    }
}
