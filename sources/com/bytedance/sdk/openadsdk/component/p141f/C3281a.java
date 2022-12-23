package com.bytedance.sdk.openadsdk.component.p141f;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.C2518b;
import com.bytedance.sdk.component.utils.C2964f;
import com.bytedance.sdk.openadsdk.component.C3245a;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import java.io.File;

/* renamed from: com.bytedance.sdk.openadsdk.component.f.a */
/* compiled from: TTAppOpenUtils */
public class C3281a {

    /* renamed from: a */
    private static String f7780a;

    /* renamed from: a */
    public static File m9584a(String str, int i) {
        return m9583a(C3578m.m11231a(), C3245a.m9453a(C3578m.m11231a()).mo18916a(String.valueOf(i)), str);
    }

    /* renamed from: a */
    public static String m9585a() {
        if (TextUtils.isEmpty(f7780a)) {
            f7780a = C2518b.m6270a().getCacheDir() + File.separator + "proxy_cache";
        }
        return f7780a;
    }

    /* renamed from: b */
    public static File m9589b(String str, int i) {
        return m9583a(C3578m.m11231a(), C3245a.m9453a(C3578m.m11231a()).mo18932h(i), str);
    }

    /* renamed from: a */
    public static String m9586a(Context context, int i) {
        return C2964f.m8353a(context, C3953b.m12901c(), C3245a.m9453a(C3578m.m11231a()).mo18916a(String.valueOf(i))).getAbsolutePath();
    }

    /* renamed from: a */
    public static File m9583a(Context context, String str, String str2) {
        return C2964f.m8354a(context, C3953b.m12901c(), str, str2);
    }

    /* renamed from: a */
    public static void m9588a(File file) {
        if (file != null) {
            try {
                C2964f.m8358b(file);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m9587a(Context context) {
        try {
            C3245a.m9453a(context).mo18917a();
        } catch (Throwable unused) {
        }
    }
}
