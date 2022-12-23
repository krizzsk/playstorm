package com.inmobi.media;

import android.content.Context;

/* renamed from: com.inmobi.media.hw */
/* compiled from: PermissionUtils */
public class C6240hw {

    /* renamed from: a */
    private static final String f15801a = C6240hw.class.getSimpleName();

    /* renamed from: a */
    public static boolean m18620a(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception unused) {
        }
    }
}
