package com.bytedance.sdk.component.p090a;

import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.component.a.y */
/* compiled from: SerializeHelper */
class C2595y {

    /* renamed from: a */
    private static boolean f5555a;

    /* renamed from: a */
    static String m6597a() {
        return "";
    }

    /* renamed from: a */
    static String m6599a(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"code\":");
        sb.append(th instanceof C2583s ? ((C2583s) th).f5523a : 0);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    static String m6598a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String substring = f5555a ? str.substring(1, str.length() - 1) : "";
        String str2 = "{\"code\":1,\"__data\":" + str;
        if (!substring.isEmpty()) {
            return str2 + "," + substring + "}";
        }
        return str2 + "}";
    }

    /* renamed from: a */
    static void m6600a(boolean z) {
        f5555a = z;
    }
}
