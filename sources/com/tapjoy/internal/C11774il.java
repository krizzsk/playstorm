package com.tapjoy.internal;

import android.text.TextUtils;

/* renamed from: com.tapjoy.internal.il */
public final class C11774il {

    /* renamed from: a */
    public float f28691a;

    /* renamed from: b */
    public int f28692b;

    /* renamed from: a */
    public static C11774il m34173a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C11774il ilVar = new C11774il();
            int length = str.length() - 1;
            char charAt = str.charAt(length);
            if (charAt == 'w') {
                ilVar.f28691a = Float.valueOf(str.substring(0, length)).floatValue();
                ilVar.f28692b = 1;
            } else if (charAt == 'h') {
                ilVar.f28691a = Float.valueOf(str.substring(0, length)).floatValue();
                ilVar.f28692b = 2;
            } else {
                ilVar.f28691a = Float.valueOf(str).floatValue();
                ilVar.f28692b = 0;
            }
            return ilVar;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final float mo72697a(float f, float f2) {
        int i = this.f28692b;
        if (i == 1) {
            return (this.f28691a * f) / 100.0f;
        }
        if (i == 2) {
            return (this.f28691a * f2) / 100.0f;
        }
        return this.f28691a;
    }
}
