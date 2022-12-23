package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;

/* renamed from: com.bytedance.sdk.component.utils.i */
/* compiled from: LanguageUtils */
public class C2969i {

    /* renamed from: a */
    private static Context f6737a;

    /* renamed from: a */
    public static void m8368a(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            Configuration b = m8369b(context, str, str2);
            if (Build.VERSION.SDK_INT >= 17) {
                f6737a = context.createConfigurationContext(b);
            }
        } catch (Throwable th) {
            C2975l.m8383b(th.getMessage());
        }
        C2984t.m8426a(f6737a);
    }

    /* renamed from: b */
    private static Configuration m8369b(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        if (Build.VERSION.SDK_INT >= 17) {
            configuration.setLocale(new Locale(str, str2));
        }
        return configuration;
    }
}
