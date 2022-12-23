package com.ogury.sdk.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.ogury.core.internal.InternalCore;
import com.ogury.sdk.OguryConfiguration;
import java.util.Map;

/* renamed from: com.ogury.sdk.internal.f */
/* compiled from: MonitoringInfoHelper.kt */
public final class C10856f {

    /* renamed from: a */
    private final OguryConfiguration f27085a;

    public C10856f(OguryConfiguration oguryConfiguration) {
        C10865m.m32951b(oguryConfiguration, "oguryConfiguration");
        this.f27085a = oguryConfiguration;
    }

    /* renamed from: a */
    public final String mo67922a() {
        return this.f27085a.getAssetKey();
    }

    /* renamed from: b */
    public static String m32936b() {
        String frameworkName = InternalCore.getFrameworkName();
        C10865m.m32949a((Object) frameworkName, "InternalCore.getFrameworkName()");
        return frameworkName;
    }

    /* renamed from: c */
    public final String mo67923c() {
        String packageName = this.f27085a.getContext().getPackageName();
        C10865m.m32949a((Object) packageName, "oguryConfiguration.context.packageName");
        return packageName;
    }

    /* renamed from: d */
    public final String mo67924d() throws PackageManager.NameNotFoundException {
        Context context = this.f27085a.getContext();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
        if (packageInfo != null) {
            return packageInfo.versionName;
        }
        return null;
    }

    /* renamed from: e */
    public final Map<String, String> mo67925e() {
        return this.f27085a.getMonitoringInfoList();
    }
}
