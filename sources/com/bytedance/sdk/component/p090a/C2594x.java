package com.bytedance.sdk.component.p090a;

import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.component.a.x */
/* compiled from: PermissionGroup */
public enum C2594x {
    PUBLIC,
    PROTECTED,
    PRIVATE;

    /* renamed from: a */
    static C2594x m6596a(String str) {
        if (TextUtils.isEmpty(str)) {
            return PUBLIC;
        }
        String lowerCase = str.toLowerCase();
        if (TextUtils.equals("protected", lowerCase)) {
            return PROTECTED;
        }
        if (TextUtils.equals("private", lowerCase)) {
            return PRIVATE;
        }
        return PUBLIC;
    }

    public String toString() {
        if (this == PRIVATE) {
            return "private";
        }
        return this == PROTECTED ? "protected" : "public";
    }
}
