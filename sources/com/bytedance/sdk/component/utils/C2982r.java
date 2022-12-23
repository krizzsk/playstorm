package com.bytedance.sdk.component.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.utils.r */
/* compiled from: ProcessUtil */
public class C2982r {

    /* renamed from: a */
    private static String f6748a;

    /* renamed from: a */
    public static boolean m8418a(Context context) {
        if (context == null) {
            return false;
        }
        return context.getApplicationContext().getPackageName().equals(m8420b(context));
    }

    /* renamed from: b */
    public static String m8420b(Context context) {
        if (!TextUtils.isEmpty(f6748a)) {
            return f6748a;
        }
        String a = m8417a();
        f6748a = a;
        if (!TextUtils.isEmpty(a)) {
            return f6748a;
        }
        String b = m8419b();
        f6748a = b;
        if (!TextUtils.isEmpty(b)) {
            return f6748a;
        }
        String c = m8421c(context);
        f6748a = c;
        return c;
    }

    /* renamed from: a */
    private static String m8417a() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    private static String m8419b() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    private static String m8421c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (!(activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null)) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid) {
                    return next.processName;
                }
            }
        }
        return null;
    }
}
