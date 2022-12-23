package com.p374my.target;

import android.content.Context;

/* renamed from: com.my.target.m8 */
public final class C9851m8 {

    /* renamed from: a */
    public static boolean f24351a;

    /* renamed from: a */
    public static void m28751a(Context context) {
        if (!C9672e0.f23794a && !f24351a) {
            try {
                Integer num = (Integer) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("com.my.target.debugMode");
                if (num != null && num.intValue() == 1) {
                    C9672e0.f23794a = true;
                }
            } catch (Throwable unused) {
            }
            f24351a = true;
        }
    }
}
