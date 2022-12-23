package com.p374my.target;

import android.app.Application;
import android.content.Context;
import com.p374my.tracker.MyTracker;

/* renamed from: com.my.target.o8 */
public final class C9889o8 {

    /* renamed from: a */
    public static boolean f24466a;

    /* renamed from: a */
    public static void m28935a(Context context) {
        if (!f24466a) {
            try {
                String str = (String) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("com.my.target.myTrackerSdkKey");
                if (str != null) {
                    MyTracker.initTracker(str, (Application) context.getApplicationContext());
                } else {
                    C9672e0.m27882a("myTracker SDK key is not provided");
                }
            } catch (Throwable th) {
                C9672e0.m27882a("Unable to initialize myTracker: " + th.getMessage());
            }
            f24466a = true;
        }
    }
}
