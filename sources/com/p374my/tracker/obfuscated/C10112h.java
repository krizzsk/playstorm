package com.p374my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: com.my.tracker.obfuscated.h */
public abstract class C10112h {
    /* renamed from: a */
    public static PackageInfo m30078a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th) {
            C10175u0.m30444b("InstallHandler: unable to read app version from package manager: " + th);
            return null;
        }
    }

    /* renamed from: b */
    public static String m30079b(Context context) {
        try {
            return context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            C10175u0.m30441a("ReferrerHandler: cannot retrieve \"installer\", exception", th);
            return null;
        }
    }
}
