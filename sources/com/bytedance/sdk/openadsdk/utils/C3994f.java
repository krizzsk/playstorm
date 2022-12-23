package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2985u;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.p185d.C3966a;

/* renamed from: com.bytedance.sdk.openadsdk.utils.f */
/* compiled from: ExternalSpUtils */
public class C3994f {
    /* renamed from: a */
    public static void m13099a(String str) {
        m13100a("any_door_id", str);
    }

    /* renamed from: a */
    public static String m13098a() {
        return m13101b("any_door_id", (String) null);
    }

    /* renamed from: a */
    private static void m13100a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (C3953b.m12901c()) {
                    C3966a.m12966a(str, str2);
                } else {
                    C2985u.m8442a("", C3578m.m11231a()).mo17903a(str, str2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private static String m13101b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            if (C3953b.m12901c()) {
                return C3966a.m12977b((String) null, str, str2);
            }
            return C2985u.m8442a("", C3578m.m11231a()).mo17910b(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
