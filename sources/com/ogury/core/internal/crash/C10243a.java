package com.ogury.core.internal.crash;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.ogury.core.internal.C10219ai;

/* renamed from: com.ogury.core.internal.crash.a */
/* compiled from: AppInfo.kt */
public final class C10243a {

    /* renamed from: a */
    public static final C10244a f26014a = new C10244a((byte) 0);

    /* renamed from: b */
    private final String f26015b;

    /* renamed from: c */
    private final String f26016c;

    /* renamed from: com.ogury.core.internal.crash.a$a */
    /* compiled from: AppInfo.kt */
    public static final class C10244a {
        private C10244a() {
        }

        public /* synthetic */ C10244a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C10243a m31062a(Context context) {
            PackageInfo packageInfo;
            String str;
            C10219ai.m31036b(context, "context");
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (Exception e) {
                C10256i iVar = C10256i.f26043a;
                C10256i.m31098a(e);
                packageInfo = null;
            }
            if (packageInfo == null || (str = packageInfo.versionName) == null) {
                str = "";
            }
            String packageName = context.getPackageName();
            C10219ai.m31034a((Object) packageName, "context.packageName");
            return new C10243a(str, packageName);
        }
    }

    public C10243a(String str, String str2) {
        C10219ai.m31036b(str, "version");
        C10219ai.m31036b(str2, "packageName");
        this.f26015b = str;
        this.f26016c = str2;
    }

    /* renamed from: a */
    public final String mo66802a() {
        return this.f26015b;
    }

    /* renamed from: b */
    public final String mo66803b() {
        return this.f26016c;
    }
}
