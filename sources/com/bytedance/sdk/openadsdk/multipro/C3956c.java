package com.bytedance.sdk.openadsdk.multipro;

import android.text.TextUtils;
import android.util.Base64;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.c */
/* compiled from: ParamEncode */
public class C3956c {
    /* renamed from: a */
    public static String m12912a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Base64.encodeToString(str.getBytes(), 10);
    }

    /* renamed from: b */
    public static String m12913b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new String(Base64.decode(str, 10));
    }
}
