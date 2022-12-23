package com.ogury.p376ed.internal;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import com.ogury.core.internal.OguryIntegrationLogger;

/* renamed from: com.ogury.ed.internal.df */
public final class C10442df {

    /* renamed from: a */
    public static final C10442df f26404a = new C10442df();

    private C10442df() {
    }

    /* renamed from: a */
    public static void m31596a(Context context) {
        C10765mq.m32773b(context, "context");
        if (!m31599b(context)) {
            OguryIntegrationLogger.m30996d("[Ads][setup] Checking permissions...");
            if (!C10555gh.m32084a(context, "android.permission.INTERNET")) {
                OguryIntegrationLogger.m30997e("[Ads][setup] No Internet permission");
            } else {
                OguryIntegrationLogger.m30996d("[Ads][setup] Permissions checked");
            }
            m31600c(context);
        }
    }

    /* renamed from: b */
    private static boolean m31599b(Context context) {
        return (context.getApplicationInfo().flags & 2) == 0;
    }

    /* renamed from: c */
    private static void m31600c(Context context) {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
        OguryIntegrationLogger.m30996d("[Ads][setup] Checking components...");
        C10765mq.m32770a((Object) packageInfo, "activitiesInfo");
        m31597a(packageInfo);
        OguryIntegrationLogger.m30996d("[Ads][setup] Components checked");
    }

    /* renamed from: a */
    private static void m31597a(PackageInfo packageInfo) {
        ActivityInfo[] activityInfoArr = packageInfo.activities;
        if (activityInfoArr != null) {
            m31598a(activityInfoArr, "io.presage.interstitial.ui.InterstitialActivity");
            m31598a(activityInfoArr, "io.presage.interstitial.ui.InterstitialAndroid8TransparentActivity");
            m31598a(activityInfoArr, "io.presage.interstitial.ui.InterstitialAndroid8RotableActivity");
        }
    }

    /* renamed from: a */
    private static void m31598a(ActivityInfo[] activityInfoArr, String str) {
        int length = activityInfoArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (C10765mq.m32772a((Object) activityInfoArr[i].name, (Object) str)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            OguryIntegrationLogger.m30997e(C10765mq.m32765a("[Ads][setup] Missing activity: ", (Object) str));
        }
    }
}
