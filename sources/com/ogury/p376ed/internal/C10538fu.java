package com.ogury.p376ed.internal;

import android.app.ActivityManager;
import android.content.Context;
import java.util.List;

/* renamed from: com.ogury.ed.internal.fu */
public final class C10538fu {
    /* renamed from: a */
    public static boolean m32043a(Context context) {
        C10765mq.m32773b(context, "context");
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.importance == 100 && C10765mq.m32772a((Object) next.processName, (Object) packageName)) {
                    return false;
                }
            }
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
    }
}
