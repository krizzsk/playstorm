package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.inmobi.media.h */
/* compiled from: CustomTabsPackageHelper */
public final class C6209h {

    /* renamed from: a */
    private static final String f15732a = C6209h.class.getSimpleName();

    /* renamed from: b */
    private static String f15733b;

    private C6209h() {
    }

    /* renamed from: a */
    public static String m18477a(Context context) {
        if (context == null || f15733b != null) {
            return f15733b;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            String str = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo next : queryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                intent2.setPackage(next.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(next.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                f15733b = null;
            } else if (arrayList.size() == 1) {
                f15733b = (String) arrayList.get(0);
            } else if (!TextUtils.isEmpty(str) && !m18478a(context, intent) && arrayList.contains(str)) {
                f15733b = str;
            } else if (arrayList.contains("com.android.chrome")) {
                f15733b = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                f15733b = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f15733b = "com.chrome.dev";
            } else if (arrayList.contains("com.google.android.apps.chrome")) {
                f15733b = "com.google.android.apps.chrome";
            }
        } catch (Exception unused) {
        }
        return f15733b;
    }

    /* renamed from: a */
    private static boolean m18478a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (queryIntentActivities != null) {
                if (queryIntentActivities.size() != 0) {
                    for (ResolveInfo next : queryIntentActivities) {
                        IntentFilter intentFilter = next.filter;
                        if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && next.activityInfo != null) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (RuntimeException unused) {
            Log.e(f15732a, "Runtime exception while getting specialized handlers");
        }
    }
}
