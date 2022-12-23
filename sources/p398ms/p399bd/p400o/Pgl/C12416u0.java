package p398ms.p399bd.p400o.Pgl;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: ms.bd.o.Pgl.u0 */
public class C12416u0 {

    /* renamed from: a */
    private static int f29441a;

    /* renamed from: a */
    public static String m34788a(Context context) {
        if (context != null) {
            try {
                new DisplayMetrics();
                f29441a = context.getResources().getDisplayMetrics().densityDpi;
            } catch (Throwable unused) {
            }
        }
        return "" + f29441a;
    }
}
