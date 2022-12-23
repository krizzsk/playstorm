package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2959b;

/* renamed from: com.bytedance.sdk.openadsdk.utils.k */
/* compiled from: OpenUtils */
public class C4001k {
    /* renamed from: a */
    public static void m13116a(Activity activity, String str) {
        if (m13119c(activity, str)) {
            C2959b.m8339a(activity, new Intent("android.intent.action.VIEW", Uri.parse(str)), (C2959b.C2960a) null);
        }
    }

    /* renamed from: b */
    public static boolean m13118b(Activity activity, String str) {
        if (!m13119c(activity, str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        try {
            activity.startActivity(intent);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m13119c(Activity activity, String str) {
        return m13117a(activity) && !TextUtils.isEmpty(str);
    }

    /* renamed from: a */
    public static boolean m13117a(Activity activity) {
        return activity != null && !activity.isDestroyed() && !activity.isFinishing();
    }
}
