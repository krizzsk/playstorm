package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzeti implements zzetb {
    private final zzfvk zza;
    private final Context zzb;

    public zzeti(zzfvk zzfvk, Context context) {
        this.zza = zzfvk;
        this.zzb = context;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    public final int zza() {
        return 38;
    }

    public final zzfvj zzb() {
        return this.zza.zzb(new zzeth(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ac A[Catch:{ Exception -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzetg zzc() throws java.lang.Exception {
        /*
            r22 = this;
            r0 = r22
            android.content.Context r1 = r0.zzb
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r3 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r3 = zzd(r1, r3)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0018
            r7 = r4
            goto L_0x0019
        L_0x0018:
            r7 = r5
        L_0x0019:
            java.lang.String r3 = "http://www.google.com"
            android.content.pm.ResolveInfo r3 = zzd(r1, r3)
            if (r3 == 0) goto L_0x0023
            r8 = r4
            goto L_0x0024
        L_0x0023:
            r8 = r5
        L_0x0024:
            java.lang.String r9 = r2.getCountry()
            com.google.android.gms.ads.internal.zzt.zzp()
            com.google.android.gms.ads.internal.client.zzaw.zzb()
            boolean r10 = com.google.android.gms.internal.ads.zzcfb.zzp()
            android.content.Context r3 = r0.zzb
            boolean r11 = com.google.android.gms.common.util.DeviceProperties.isLatchsky(r3)
            android.content.Context r3 = r0.zzb
            boolean r12 = com.google.android.gms.common.util.DeviceProperties.isSidewinder(r3)
            java.lang.String r13 = r2.getLanguage()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0066
            android.os.LocaleList r2 = android.os.LocaleList.getDefault()
            r3 = r5
        L_0x0052:
            int r4 = r2.size()
            if (r3 >= r4) goto L_0x0066
            java.util.Locale r4 = r2.get(r3)
            java.lang.String r4 = r4.getLanguage()
            r14.add(r4)
            int r3 = r3 + 1
            goto L_0x0052
        L_0x0066:
            android.content.Context r2 = r0.zzb
            java.lang.String r3 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r3 = zzd(r1, r3)
            java.lang.String r4 = "."
            if (r3 != 0) goto L_0x0074
        L_0x0072:
            r15 = 0
            goto L_0x009c
        L_0x0074:
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            if (r3 != 0) goto L_0x0079
            goto L_0x0072
        L_0x0079:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r2)     // Catch:{ NameNotFoundException -> 0x0072 }
            java.lang.String r15 = r3.packageName     // Catch:{ NameNotFoundException -> 0x0072 }
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r15, r5)     // Catch:{ NameNotFoundException -> 0x0072 }
            if (r2 == 0) goto L_0x0072
            int r2 = r2.versionCode     // Catch:{ NameNotFoundException -> 0x0072 }
            java.lang.String r3 = r3.packageName     // Catch:{ NameNotFoundException -> 0x0072 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0072 }
            r15.<init>()     // Catch:{ NameNotFoundException -> 0x0072 }
            r15.append(r2)     // Catch:{ NameNotFoundException -> 0x0072 }
            r15.append(r4)     // Catch:{ NameNotFoundException -> 0x0072 }
            r15.append(r3)     // Catch:{ NameNotFoundException -> 0x0072 }
            java.lang.String r2 = r15.toString()     // Catch:{ NameNotFoundException -> 0x0072 }
            r15 = r2
        L_0x009c:
            android.content.Context r2 = r0.zzb
            com.google.android.gms.common.wrappers.PackageManagerWrapper r2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r2)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r3 = "com.android.vending"
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r6)     // Catch:{ Exception -> 0x00c5 }
            if (r2 == 0) goto L_0x00c5
            int r3 = r2.versionCode     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r2 = r2.packageName     // Catch:{ Exception -> 0x00c5 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c5 }
            r6.<init>()     // Catch:{ Exception -> 0x00c5 }
            r6.append(r3)     // Catch:{ Exception -> 0x00c5 }
            r6.append(r4)     // Catch:{ Exception -> 0x00c5 }
            r6.append(r2)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x00c5 }
            r16 = r2
            goto L_0x00c7
        L_0x00c5:
            r16 = 0
        L_0x00c7:
            java.lang.String r17 = android.os.Build.FINGERPRINT
            android.content.Context r2 = r0.zzb
            if (r1 != 0) goto L_0x00d0
        L_0x00cd:
            r18 = r5
            goto L_0x0119
        L_0x00d0:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "http://www.example.com"
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r6 = "android.intent.action.VIEW"
            r3.<init>(r6, r4)
            android.content.pm.ResolveInfo r4 = r1.resolveActivity(r3, r5)
            r6 = 65536(0x10000, float:9.18355E-41)
            java.util.List r1 = r1.queryIntentActivities(r3, r6)
            if (r1 == 0) goto L_0x0117
            if (r4 == 0) goto L_0x0117
            r3 = r5
        L_0x00ec:
            int r6 = r1.size()
            if (r3 >= r6) goto L_0x0117
            java.lang.Object r6 = r1.get(r3)
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6
            android.content.pm.ActivityInfo r5 = r4.activityInfo
            java.lang.String r5 = r5.name
            android.content.pm.ActivityInfo r6 = r6.activityInfo
            java.lang.String r6 = r6.name
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0113
            android.content.pm.ActivityInfo r1 = r4.activityInfo
            java.lang.String r1 = r1.packageName
            java.lang.String r2 = com.google.android.gms.internal.ads.zzgqi.zza(r2)
            boolean r5 = r1.equals(r2)
            goto L_0x00cd
        L_0x0113:
            int r3 = r3 + 1
            r5 = 0
            goto L_0x00ec
        L_0x0117:
            r18 = 0
        L_0x0119:
            com.google.android.gms.ads.internal.zzt.zzp()
            android.os.StatFs r1 = new android.os.StatFs
            java.io.File r2 = android.os.Environment.getDataDirectory()
            java.lang.String r2 = r2.getAbsolutePath()
            r1.<init>(r2)
            long r1 = r1.getAvailableBytes()
            com.google.android.gms.internal.ads.zzetg r3 = new com.google.android.gms.internal.ads.zzetg
            java.lang.String r19 = android.os.Build.MODEL
            r4 = 1024(0x400, double:5.06E-321)
            long r20 = r1 / r4
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeti.zzc():com.google.android.gms.internal.ads.zzetg");
    }
}
