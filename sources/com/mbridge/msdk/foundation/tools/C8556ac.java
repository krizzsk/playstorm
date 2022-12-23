package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;

/* renamed from: com.mbridge.msdk.foundation.tools.ac */
/* compiled from: StringUtils */
public final class C8556ac {
    /* renamed from: a */
    public static boolean m24737a(String str) {
        return str == null || TextUtils.isEmpty(str.trim()) || "null".equals(str);
    }

    /* renamed from: b */
    public static boolean m24738b(String str) {
        return str != null && !TextUtils.isEmpty(str.trim()) && !"null".equals(str);
    }
}
