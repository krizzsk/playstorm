package com.bytedance.sdk.openadsdk.p135c;

import android.text.TextUtils;
import com.bytedance.sdk.component.p120e.p122b.C2918c;
import com.bytedance.sdk.openadsdk.utils.C4012s;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.c.d */
/* compiled from: NetHook */
public final class C3217d extends C3214a {

    /* renamed from: a */
    public static C3216c f7605a;

    /* renamed from: a */
    public String mo18866a() {
        return "net";
    }

    /* renamed from: a */
    public static String m9387a(C2918c cVar, String str) {
        C3216c a;
        if (!C4012s.m13173c() || (a = C3215b.m9385a("net")) == null) {
            return str;
        }
        Map map = (Map) a.mo18865a(1, str);
        if (map == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                cVar.mo17792b(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
