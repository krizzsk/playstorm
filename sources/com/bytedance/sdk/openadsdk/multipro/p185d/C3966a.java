package com.bytedance.sdk.openadsdk.multipro.p185d;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.C3969e;
import com.bytedance.sdk.openadsdk.multipro.aidl.p181a.C3928g;
import com.bytedance.sdk.openadsdk.multipro.p180a.C3914a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.d.a */
/* compiled from: SPMultiHelper */
public class C3966a {

    /* renamed from: a */
    private static Context f10183a;

    /* renamed from: a */
    public static boolean m12973a() {
        if (f10183a != null && C3578m.m11231a() != null) {
            return true;
        }
        C2975l.m8383b("The context of SPHelper is null, please initialize sdk in main process");
        return false;
    }

    /* renamed from: b */
    private static IListenerManager m12975b() {
        try {
            if (!m12973a()) {
                return null;
            }
            if (!C3953b.m12901c()) {
                return C3928g.m12883a();
            }
            return C3914a.m12850a(C3578m.m11231a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m12964a(Context context) {
        f10183a = context == null ? C3578m.m11231a() : context.getApplicationContext();
    }

    /* renamed from: c */
    private static String m12980c() {
        return C3969e.f10187b + "/" + "t_sp" + "/";
    }

    /* renamed from: b */
    private static String m12976b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "?sp_file_name=" + str;
    }

    /* renamed from: a */
    public static synchronized void m12967a(String str, String str2, Boolean bool) {
        synchronized (C3966a.class) {
            if (m12973a()) {
                try {
                    IListenerManager b = m12975b();
                    if (b != null) {
                        Uri parse = Uri.parse(m12980c() + "boolean" + "/" + str2 + m12976b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", bool);
                        b.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m12966a(String str, String str2) {
        synchronized (C3966a.class) {
            m12971a((String) null, str, str2);
        }
    }

    /* renamed from: a */
    public static synchronized void m12971a(String str, String str2, String str3) {
        synchronized (C3966a.class) {
            if (m12973a()) {
                try {
                    IListenerManager b = m12975b();
                    if (b != null) {
                        Uri parse = Uri.parse(m12980c() + "string" + "/" + str2 + m12976b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", str3);
                        b.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m12969a(String str, String str2, Integer num) {
        synchronized (C3966a.class) {
            if (m12973a()) {
                try {
                    IListenerManager b = m12975b();
                    if (b != null) {
                        Uri parse = Uri.parse(m12980c() + "int" + "/" + str2 + m12976b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", num);
                        b.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m12970a(String str, String str2, Long l) {
        synchronized (C3966a.class) {
            if (m12973a()) {
                try {
                    IListenerManager b = m12975b();
                    if (b != null) {
                        Uri parse = Uri.parse(m12980c() + Constants.LONG + "/" + str2 + m12976b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", l);
                        b.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m12968a(String str, String str2, Float f) {
        synchronized (C3966a.class) {
            if (m12973a()) {
                try {
                    IListenerManager b = m12975b();
                    if (b != null) {
                        Uri parse = Uri.parse(m12980c() + "float" + "/" + str2 + m12976b(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", f);
                        b.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m12972a(String str, String str2, Set<String> set) {
        synchronized (C3966a.class) {
            if (m12973a()) {
                try {
                    IListenerManager b = m12975b();
                    if (b != null) {
                        Uri parse = Uri.parse(m12980c() + "string_set" + "/" + str2 + m12976b(str));
                        ContentValues contentValues = new ContentValues();
                        HashSet hashSet = new HashSet();
                        for (String replace : set) {
                            hashSet.add(replace.replace(",", "__COMMA__"));
                        }
                        contentValues.put("value", hashSet.toString());
                        b.update(parse, contentValues, (String) null, (String[]) null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public static String m12977b(String str, String str2, String str3) {
        if (!m12973a()) {
            return str3;
        }
        try {
            IListenerManager b = m12975b();
            if (b != null) {
                String type = b.getType(Uri.parse(m12980c() + "string" + "/" + str2 + m12976b(str)));
                return (type == null || type.equals("null")) ? str3 : type;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static int m12962a(String str, String str2, int i) {
        if (!m12973a()) {
            return i;
        }
        try {
            IListenerManager b = m12975b();
            if (b != null) {
                String type = b.getType(Uri.parse(m12980c() + "int" + "/" + str2 + m12976b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        return Integer.parseInt(type);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return i;
    }

    /* renamed from: a */
    public static float m12961a(String str, String str2, float f) {
        if (!m12973a()) {
            return f;
        }
        try {
            IListenerManager b = m12975b();
            if (b != null) {
                String type = b.getType(Uri.parse(m12980c() + "float" + "/" + str2 + m12976b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        return Float.parseFloat(type);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return f;
    }

    /* renamed from: a */
    public static boolean m12974a(String str, String str2, boolean z) {
        if (!m12973a()) {
            return z;
        }
        try {
            IListenerManager b = m12975b();
            if (b != null) {
                String type = b.getType(Uri.parse(m12980c() + "boolean" + "/" + str2 + m12976b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        return Boolean.parseBoolean(type);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return z;
    }

    /* renamed from: a */
    public static long m12963a(String str, String str2, long j) {
        if (!m12973a()) {
            return j;
        }
        try {
            IListenerManager b = m12975b();
            if (b != null) {
                String type = b.getType(Uri.parse(m12980c() + Constants.LONG + "/" + str2 + m12976b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        return Long.parseLong(type);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return j;
    }

    /* renamed from: b */
    public static Set<String> m12978b(String str, String str2, Set<String> set) {
        if (!m12973a()) {
            return set;
        }
        try {
            IListenerManager b = m12975b();
            if (b != null) {
                String type = b.getType(Uri.parse(m12980c() + "string_set" + "/" + str2 + m12976b(str)));
                if (type != null) {
                    if (!type.equals("null")) {
                        if (!type.matches("\\[.*\\]")) {
                            return set;
                        }
                        String[] split = type.substring(1, type.length() - 1).split(", ");
                        HashSet hashSet = new HashSet();
                        for (String replace : split) {
                            hashSet.add(replace.replace("__COMMA__", ", "));
                        }
                        return hashSet;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return set;
    }

    /* renamed from: b */
    public static void m12979b(String str, String str2) {
        if (m12973a()) {
            try {
                IListenerManager b = m12975b();
                if (b != null) {
                    b.delete(Uri.parse(m12980c() + Constants.LONG + "/" + str2 + m12976b(str)), (String) null, (String[]) null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m12965a(String str) {
        if (m12973a()) {
            try {
                IListenerManager b = m12975b();
                if (b != null) {
                    b.delete(Uri.parse(m12980c() + "clean" + m12976b(str)), (String) null, (String[]) null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
