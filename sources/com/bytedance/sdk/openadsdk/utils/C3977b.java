package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.C3524h;
import com.bytedance.sdk.openadsdk.core.p151e.C3474e;

/* renamed from: com.bytedance.sdk.openadsdk.utils.b */
/* compiled from: AutoTestUtils */
public class C3977b {
    /* renamed from: a */
    public static String m13032a(String str) {
        if (!C2975l.m8389c() || TextUtils.isEmpty(str)) {
            return str;
        }
        C3474e eVar = new C3474e(C3524h.m10852d().mo19864n());
        StringBuilder sb = new StringBuilder(str);
        for (String contains : eVar.mo19509b()) {
            if (sb.toString().contains(contains)) {
                if (sb.toString().contains("?")) {
                    sb.append("&");
                    sb.append(eVar.mo19508a());
                } else {
                    sb.append("?");
                    sb.append(eVar.mo19508a());
                }
            }
        }
        return sb.toString();
    }
}
