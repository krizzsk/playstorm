package com.ogury.p376ed.internal;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;

/* renamed from: com.ogury.ed.internal.jk */
public final class C10663jk {
    /* renamed from: a */
    public static final void m32606a(C10660jh jhVar, String str) {
        C10765mq.m32773b(jhVar, "<this>");
        C10765mq.m32773b(str, "javascript");
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(C10594hn.m32229b(jhVar));
            sb.append(" >> ");
            sb.append(str);
            jhVar.loadUrl(C10765mq.m32765a("javascript:", (Object) str));
        } catch (Throwable th) {
            C10427da daVar = C10427da.f26371a;
            C10427da.m31544a(th);
        }
    }

    /* renamed from: a */
    public static final void m32605a(C10660jh jhVar, C10483eb ebVar) {
        C10765mq.m32773b(jhVar, "<this>");
        C10765mq.m32773b(ebVar, "ad");
        boolean z = true;
        String h = ebVar.mo67239h().length() > 0 ? ebVar.mo67239h() : "http://ads-test.st.ogury.com/";
        if (ebVar.mo67225c().length() <= 0) {
            z = false;
        }
        try {
            jhVar.loadDataWithBaseURL(h, z ? ebVar.mo67225c() : "The ad contains no ad_content", "text/html", "UTF-8", (String) null);
        } catch (Throwable th) {
            C10427da daVar = C10427da.f26371a;
            C10427da.m31544a(th);
        }
    }

    /* renamed from: a */
    public static final C10660jh m32604a(Context context, C10483eb ebVar) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(ebVar, "ad");
        try {
            C10660jh jhVar = new C10660jh(context, ebVar);
            jhVar.setBackgroundColor(0);
            if (Build.VERSION.SDK_INT >= 19) {
                jhVar.setLayerType(2, (Paint) null);
            }
            return jhVar;
        } catch (Throwable th) {
            C10427da daVar = C10427da.f26371a;
            C10427da.m31544a(th);
            return null;
        }
    }
}
