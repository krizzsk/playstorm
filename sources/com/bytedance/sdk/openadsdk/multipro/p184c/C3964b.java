package com.bytedance.sdk.openadsdk.multipro.p184c;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p150d.C3462a;
import com.bytedance.sdk.openadsdk.multipro.C3913a;
import com.bytedance.sdk.openadsdk.multipro.C3969e;
import com.bytedance.sdk.openadsdk.multipro.p180a.C3914a;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.c.b */
/* compiled from: FrequentCallProviderImpl */
public class C3964b implements C3913a {
    /* renamed from: a */
    public int mo20801a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    public int mo20802a(Uri uri, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    public Cursor mo20803a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    /* renamed from: a */
    public Uri mo20804a(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* renamed from: a */
    public String mo20805a() {
        return "t_frequent";
    }

    /* renamed from: b */
    public void mo20807b() {
    }

    /* renamed from: e */
    private static IListenerManager m12946e() {
        try {
            if (C3578m.m11231a() != null) {
                return C3914a.m12850a(C3578m.m11231a());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m12943a(String str) {
        if (C3578m.m11231a() == null) {
            return false;
        }
        try {
            IListenerManager e = m12946e();
            if (e != null) {
                return "true".equals(e.getType(Uri.parse(m12947f() + "checkFrequency" + "?rit=" + String.valueOf(str))));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m12944c() {
        if (C3578m.m11231a() == null) {
            return false;
        }
        try {
            IListenerManager e = m12946e();
            if (e != null) {
                return "true".equals(e.getType(Uri.parse(m12947f() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: d */
    public static String m12945d() {
        if (C3578m.m11231a() == null) {
            return null;
        }
        try {
            IListenerManager e = m12946e();
            if (e != null) {
                return e.getType(Uri.parse(m12947f() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: f */
    private static String m12947f() {
        return C3969e.f10187b + "/" + "t_frequent" + "/";
    }

    /* renamed from: a */
    public String mo20806a(Uri uri) {
        C2975l.m8384b("FrequentCallProviderImpl", "get type uri: " + String.valueOf(uri));
        String str = uri.getPath().split("/")[2];
        if ("checkFrequency".equals(str)) {
            return C3462a.m10377a().mo19467a(uri.getQueryParameter("rit")) ? "true" : "false";
        } else if ("isSilent".equals(str)) {
            return C3462a.m10377a().mo19468b() ? "true" : "false";
        } else {
            if ("maxRit".equals(str)) {
                return C3462a.m10377a().mo19469c();
            }
            return null;
        }
    }
}
