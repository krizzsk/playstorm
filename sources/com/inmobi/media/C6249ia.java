package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.ia */
/* compiled from: AppInfo */
public class C6249ia {

    /* renamed from: e */
    private static final String f15824e = C6249ia.class.getSimpleName();

    /* renamed from: a */
    public String f15825a;

    /* renamed from: b */
    public String f15826b;

    /* renamed from: c */
    public Map<String, String> f15827c;

    /* renamed from: d */
    public byte f15828d;

    /* renamed from: f */
    private String f15829f;

    /* renamed from: g */
    private String f15830g;

    /* renamed from: com.inmobi.media.ia$a */
    /* compiled from: AppInfo */
    static class C6250a {

        /* renamed from: a */
        static final C6249ia f15831a = new C6249ia((byte) 0);
    }

    /* synthetic */ C6249ia(byte b) {
        this();
    }

    private C6249ia() {
        this.f15827c = new HashMap();
        Context c = C6227ho.m18551c();
        try {
            PackageManager packageManager = c.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(c.getPackageName(), 128);
            if (applicationInfo != null) {
                this.f15825a = applicationInfo.packageName;
                this.f15829f = applicationInfo.loadLabel(packageManager).toString();
                this.f15826b = packageManager.getInstallerPackageName(this.f15825a);
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(c.getPackageName(), 128);
            String str = null;
            if (packageInfo != null) {
                str = packageInfo.versionName;
                if (str == null || "".equals(str)) {
                    if (Build.VERSION.SDK_INT < 28) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(packageInfo.versionCode);
                        str = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(packageInfo.getLongVersionCode());
                        str = sb2.toString();
                    }
                }
            }
            if (str != null && !"".equals(str)) {
                this.f15830g = str;
            }
        } catch (Exception unused) {
        }
        this.f15828d = m18646b();
        this.f15827c.put("u-appbid", this.f15825a);
        this.f15827c.put("u-appdnm", this.f15829f);
        this.f15827c.put("u-appver", this.f15830g);
        this.f15827c.put("u-appsecure", Byte.toString(this.f15828d));
    }

    /* renamed from: a */
    public static C6249ia m18645a() {
        return C6250a.f15831a;
    }

    /* renamed from: b */
    private static byte m18646b() {
        try {
            if (Build.VERSION.SDK_INT < 23 || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                return 0;
            }
            return 1;
        } catch (Exception unused) {
            return 2;
        }
    }
}
