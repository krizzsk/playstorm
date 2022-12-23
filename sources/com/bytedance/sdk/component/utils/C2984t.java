package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: com.bytedance.sdk.component.utils.t */
/* compiled from: ResourceHelp */
public final class C2984t {

    /* renamed from: a */
    private static String f6750a;

    /* renamed from: b */
    private static Resources f6751b;

    /* renamed from: c */
    private static Context f6752c;

    /* renamed from: a */
    public static void m8427a(String str) {
        f6750a = str;
    }

    /* renamed from: b */
    private static String m8429b(Context context) {
        if (f6750a == null) {
            f6750a = context.getPackageName();
        }
        return f6750a;
    }

    /* renamed from: a */
    private static int m8424a(Context context, String str, String str2) {
        if (f6751b == null) {
            f6751b = context.getResources();
        }
        return f6751b.getIdentifier(str, str2, m8429b(context));
    }

    /* renamed from: a */
    public static String m8425a(Context context, String str) {
        Context context2 = f6752c;
        if (context2 == null) {
            return context.getResources().getString(m8428b(context, str));
        }
        return context2.getResources().getString(m8428b(f6752c, str));
    }

    /* renamed from: a */
    public static void m8426a(Context context) {
        f6752c = context;
    }

    /* renamed from: b */
    public static int m8428b(Context context, String str) {
        return m8424a(context, str, "string");
    }

    /* renamed from: c */
    public static Drawable m8430c(Context context, String str) {
        return context.getResources().getDrawable(m8431d(context, str));
    }

    /* renamed from: d */
    public static int m8431d(Context context, String str) {
        return m8424a(context, str, "drawable");
    }

    /* renamed from: e */
    public static int m8432e(Context context, String str) {
        return m8424a(context, str, "id");
    }

    /* renamed from: f */
    public static int m8433f(Context context, String str) {
        return m8424a(context, str, "layout");
    }

    /* renamed from: g */
    public static int m8434g(Context context, String str) {
        return m8424a(context, str, "style");
    }

    /* renamed from: h */
    public static int m8435h(Context context, String str) {
        return m8424a(context, str, "attr");
    }

    /* renamed from: i */
    public static int m8436i(Context context, String str) {
        return m8424a(context, str, "dimen");
    }

    /* renamed from: j */
    public static int m8437j(Context context, String str) {
        return context.getResources().getColor(m8438k(context, str));
    }

    /* renamed from: k */
    public static int m8438k(Context context, String str) {
        return m8424a(context, str, "color");
    }

    /* renamed from: l */
    public static int m8439l(Context context, String str) {
        return m8424a(context, str, "anim");
    }

    /* renamed from: m */
    public static int m8440m(Context context, String str) {
        return m8424a(context, str, "integer");
    }

    /* renamed from: n */
    public static int m8441n(Context context, String str) {
        return context.getResources().getInteger(m8440m(context, str));
    }
}
