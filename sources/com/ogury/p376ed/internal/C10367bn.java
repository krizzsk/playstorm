package com.ogury.p376ed.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.bn */
public final class C10367bn {
    /* renamed from: a */
    public static List<Activity> m31376a(Context context) {
        C10765mq.m32773b(context, "context");
        try {
            List<Activity> arrayList = new ArrayList<>();
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            C10765mq.m32770a((Object) activityInfoArr, "activitiesInfo");
            int i = 0;
            int length = activityInfoArr.length;
            while (i < length) {
                ActivityInfo activityInfo = activityInfoArr[i];
                i++;
                String str = activityInfo.name;
                C10765mq.m32770a((Object) str, "activityInfo.name");
                Activity a = m31375a(str);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return C10692km.m32648a();
        }
    }

    /* renamed from: a */
    private static Activity m31375a(String str) {
        try {
            Object newInstance = Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (newInstance instanceof Activity) {
                return (Activity) newInstance;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
