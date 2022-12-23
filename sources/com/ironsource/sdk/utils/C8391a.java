package com.ironsource.sdk.utils;

import android.content.Context;
import com.ironsource.environment.C6429h;

/* renamed from: com.ironsource.sdk.utils.a */
public final class C8391a {

    /* renamed from: g */
    private static C8391a f20128g;

    /* renamed from: a */
    public String f20129a = C6429h.m19321h();

    /* renamed from: b */
    public String f20130b = C6429h.m19319g();

    /* renamed from: c */
    public String f20131c = C6429h.m19323i();

    /* renamed from: d */
    public String f20132d = C6429h.m19315e();

    /* renamed from: e */
    public int f20133e = C6429h.m19317f();

    /* renamed from: f */
    public String f20134f;

    private C8391a(Context context) {
        this.f20134f = C6429h.m19324i(context);
    }

    /* renamed from: a */
    public static C8391a m24034a(Context context) {
        if (f20128g == null) {
            f20128g = new C8391a(context);
        }
        return f20128g;
    }

    /* renamed from: a */
    public static void m24035a() {
        f20128g = null;
    }

    /* renamed from: b */
    public static float m24036b(Context context) {
        return C6429h.m19329l(context);
    }
}
