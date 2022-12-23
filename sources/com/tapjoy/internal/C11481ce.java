package com.tapjoy.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/* renamed from: com.tapjoy.internal.ce */
public final class C11481ce {

    /* renamed from: a */
    private static C11506dc f27754a = new C11506dc();

    /* renamed from: a */
    public static String m33385a() {
        return "1.3.16-tapjoy";
    }

    /* renamed from: a */
    public static void m33386a(Context context) {
        C11506dc dcVar = f27754a;
        Context applicationContext = context.getApplicationContext();
        C11524dq.m33446a((Object) applicationContext, "Application Context cannot be null");
        if (!dcVar.f27849a) {
            dcVar.f27849a = true;
            C11514di a = C11514di.m33422a();
            a.f27869b = new C11486cj(new Handler(), applicationContext, new C11483cg(), a);
            C11508de a2 = C11508de.m33407a();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(a2);
            }
            C11521do.m33434a(applicationContext);
            C11511dg.m33411a().f27862a = applicationContext != null ? applicationContext.getApplicationContext() : null;
        }
    }

    /* renamed from: b */
    public static boolean m33387b() {
        return f27754a.f27849a;
    }
}
