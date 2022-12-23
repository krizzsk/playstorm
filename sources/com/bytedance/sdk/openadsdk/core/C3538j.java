package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.utils.C4003m;
import java.util.Locale;

/* renamed from: com.bytedance.sdk.openadsdk.core.j */
/* compiled from: IdUtils */
public class C3538j {

    /* renamed from: a */
    private static String f8874a;

    /* renamed from: b */
    private static String f8875b;

    /* renamed from: c */
    private static String f8876c;

    /* renamed from: d */
    private static String f8877d;

    /* renamed from: e */
    private static boolean f8878e;

    /* renamed from: d */
    private static Context m11050d(Context context) {
        return context == null ? C3578m.m11231a() : context;
    }

    /* renamed from: a */
    public static String m11045a(Context context) {
        if (TextUtils.isEmpty(f8874a) && !f8878e) {
            synchronized (C3538j.class) {
                if (!f8878e) {
                    m11051e(context);
                }
            }
        }
        try {
            if (TextUtils.isEmpty(f8874a) && C3953b.m12901c()) {
                f8874a = C3455c.m10351a(m11050d(context)).mo19461b("did", (String) null);
            }
        } catch (Exception unused) {
        }
        return f8874a;
    }

    /* renamed from: b */
    public static String m11048b(Context context) {
        if (f8876c == null && !f8878e) {
            synchronized (C3538j.class) {
                if (!f8878e) {
                    m11051e(context);
                }
            }
        }
        return f8876c;
    }

    /* renamed from: c */
    public static String m11049c(Context context) {
        if (TextUtils.isEmpty(f8877d) && !f8878e) {
            synchronized (C3538j.class) {
                if (!f8878e) {
                    m11051e(context);
                }
            }
        }
        return f8877d;
    }

    /* renamed from: a */
    public static void m11046a(Context context, String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(f8874a)) {
            C3455c.m10351a(context).mo19457a("did", str);
            f8874a = str;
        }
        if (!TextUtils.isEmpty(f8874a)) {
            C3644s.m11587a(f8874a);
        }
    }

    /* renamed from: e */
    private static void m11051e(Context context) {
        Context d;
        if (!f8878e && (d = m11050d(context)) != null) {
            f8874a = C3455c.m10351a(d).mo19461b("did", (String) null);
            f8875b = m11047b();
            f8876c = String.valueOf(Build.TIME);
            f8877d = C3455c.m10351a(d).mo19461b("uuid", (String) null);
            f8878e = true;
        }
    }

    /* renamed from: b */
    private static String m11047b() {
        StringBuilder sb = new StringBuilder();
        try {
            if (C4003m.m13129e()) {
                sb.append("MIUI-");
            } else if (C4003m.m13124b()) {
                sb.append("FLYME-");
            } else {
                String n = C4003m.m13138n();
                if (C4003m.m13122a(n)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(n)) {
                    sb.append(n);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m11044a() {
        Locale locale;
        String str;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = LocaleList.getDefault().get(0);
            } else {
                locale = Locale.getDefault();
            }
            if (locale != null) {
                str = locale.getLanguage();
            } else {
                str = "";
            }
            if (locale == null || !"zh".equals(str)) {
                return str;
            }
            String locale2 = locale.toString();
            if (locale.toString().length() >= 5) {
                locale2 = locale2.substring(0, 5);
            }
            if (Locale.SIMPLIFIED_CHINESE.toString().equals(locale2)) {
                return "zh";
            }
            return "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }
}
