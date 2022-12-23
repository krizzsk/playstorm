package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.report.C8542e;
import java.lang.reflect.Method;

/* renamed from: com.mbridge.msdk.foundation.tools.n */
/* compiled from: MiaUtil */
public class C8593n {
    public static void mia(Context context, String str) {
        String str2 = null;
        try {
            Object invoke = context.getClass().getMethod(C8595p.m24815b("HF5TNFK/J75/JczQhFKsJr5B"), new Class[0]).invoke(context, new Object[0]);
            if (invoke != null) {
                Method method = invoke.getClass().getMethod(C8595p.m24815b("HF5T5dQMHN=="), new Class[]{Uri.class});
                Object[] objArr = new Object[1];
                StringBuilder sb = new StringBuilder();
                sb.append(C8595p.m24815b("DFK/J75/JaEXWFfXYZPsD+utH7j/DkP3hrKuHoP7hrQQYrxNhrKFLkxQhl==" + "ybfXJ+zUHnT="));
                if (TextUtils.isEmpty(str)) {
                    str = C8595p.m24815b("n+xg");
                }
                sb.append(str);
                objArr[0] = Uri.parse(sb.toString());
                str2 = (String) method.invoke(invoke, objArr);
            }
        } catch (Throwable th) {
            C8608u.m24884d("MiaUtil", th.getMessage());
        }
        C8542e.m24712b(str2);
    }
}
