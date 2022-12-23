package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.multipro.p185d.C3966a;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.b */
/* compiled from: MultiGlobalInfo */
public class C3953b {

    /* renamed from: a */
    public static boolean f10166a;

    /* renamed from: b */
    public static boolean f10167b;

    /* renamed from: a */
    public static void m12899a() {
        C3966a.m12967a("sp_multi_info", "is_support_multi_process", (Boolean) true);
        f10166a = true;
        f10167b = true;
    }

    /* renamed from: b */
    public static void m12900b() {
        f10166a = false;
        f10167b = true;
    }

    /* renamed from: c */
    public static boolean m12901c() {
        if (!f10167b) {
            f10166a = C3966a.m12974a("sp_multi_info", "is_support_multi_process", false);
            f10167b = true;
        }
        return f10166a;
    }
}
