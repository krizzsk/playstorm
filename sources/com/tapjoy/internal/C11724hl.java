package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;

/* renamed from: com.tapjoy.internal.hl */
public final class C11724hl extends C11833o {

    /* renamed from: c */
    private static C11724hl f28520c;

    /* renamed from: a */
    public static synchronized C11724hl m34046a(Context context) {
        C11724hl hlVar;
        synchronized (C11724hl.class) {
            if (f28520c == null) {
                f28520c = new C11724hl(context);
            }
            hlVar = f28520c;
        }
        return hlVar;
    }

    private C11724hl(Context context) {
        super(context, new C11835q() {
            /* renamed from: a */
            public final String mo72638a(Context context) {
                return C11737ht.m34105a(context).f28567b.getString("gcm.regId", "");
            }

            /* renamed from: b */
            public final void mo72640b(Context context) {
                C11737ht.m34105a(context).mo72668a(true);
            }

            /* renamed from: a */
            public final void mo72639a(Context context, long j) {
                SharedPreferences.Editor edit = C11737ht.m34105a(context).f28567b.edit();
                edit.putLong("gcm.onServerExpirationTime", j);
                edit.apply();
            }
        });
    }

    /* renamed from: a */
    public static boolean m34047a(Object obj) {
        return Boolean.TRUE.equals(obj) || "true".equals(obj);
    }

    /* renamed from: b */
    public static int m34048b(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private static int m34044a(Bundle bundle, String str, Context context) {
        if (bundle != null) {
            Object obj = bundle.get(str);
            if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                try {
                    if ("drawable".equals(context.getResources().getResourceTypeName(intValue))) {
                        return intValue;
                    }
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (obj != null) {
                Object[] objArr = {str};
                if (C11710hg.f28464a) {
                    C11845w.m34414a(4, "Tapjoy", "meta-data of {} invalid", objArr);
                }
            }
        }
        return 0;
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [android.text.Spanned] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a1, code lost:
        if (r10 == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a3, code lost:
        r8 = android.text.Html.fromHtml(r8);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    @javax.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.Notification m34045a(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10, boolean r11, java.lang.String r12, java.lang.String r13, int r14, java.lang.String r15) {
        /*
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            java.lang.String r1 = r6.getPackageName()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.MAIN"
            r2.<init>(r3)
            r2.setPackage(r1)
            java.lang.String r1 = "android.intent.category.LAUNCHER"
            r2.addCategory(r1)
            r1 = 0
            java.util.List r0 = r0.queryIntentActivities(r2, r1)
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r4 = 0
            if (r0 == 0) goto L_0x0048
            int r5 = r0.size()
            if (r5 > 0) goto L_0x0028
            goto L_0x0048
        L_0x0028:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r2)
            r5.setFlags(r3)
            java.lang.Object r2 = r0.get(r1)
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            java.lang.String r2 = r2.packageName
            java.lang.Object r0 = r0.get(r1)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r0 = r0.name
            r5.setClassName(r2, r0)
            goto L_0x0049
        L_0x0048:
            r5 = r4
        L_0x0049:
            if (r5 == 0) goto L_0x006a
            java.lang.String r0 = "com.tapjoy.PUSH_CLICK"
            r5.setAction(r0)
            java.lang.String r0 = r6.getPackageName()
            r5.setPackage(r0)
            java.lang.String r0 = "com.tapjoy.PUSH_ID"
            r5.putExtra(r0, r7)
            if (r12 == 0) goto L_0x0063
            java.lang.String r7 = "com.tapjoy.PUSH_PAYLOAD"
            r5.putExtra(r7, r12)
        L_0x0063:
            if (r13 == 0) goto L_0x006a
            java.lang.String r7 = "com.tapjoy.PUSH_PLACEMENT"
            r5.putExtra(r7, r13)
        L_0x006a:
            r7 = 134217728(0x8000000, float:3.85186E-34)
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 19
            if (r12 != r13) goto L_0x0073
            goto L_0x007d
        L_0x0073:
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 23
            if (r12 < r13) goto L_0x007c
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x007d
        L_0x007c:
            r3 = r7
        L_0x007d:
            android.content.Context r7 = r6.getApplicationContext()
            android.app.PendingIntent r7 = android.app.PendingIntent.getActivity(r7, r14, r5, r3)
            if (r7 != 0) goto L_0x0088
            return r4
        L_0x0088:
            android.content.pm.PackageManager r12 = r6.getPackageManager()
            java.lang.String r13 = r6.getPackageName()
            r14 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r13 = r12.getApplicationInfo(r13, r14)     // Catch:{ NameNotFoundException -> 0x0151 }
            int r14 = r8.length()
            if (r14 != 0) goto L_0x00a1
            java.lang.CharSequence r8 = r12.getApplicationLabel(r13)
            goto L_0x00a7
        L_0x00a1:
            if (r10 == 0) goto L_0x00a7
            android.text.Spanned r8 = android.text.Html.fromHtml(r8)
        L_0x00a7:
            if (r10 == 0) goto L_0x00ad
            android.text.Spanned r9 = android.text.Html.fromHtml(r9)
        L_0x00ad:
            android.os.Bundle r10 = r13.metaData
            java.lang.String r12 = "com.tapjoy.notification.icon"
            int r10 = m34044a(r10, r12, r6)
            if (r10 != 0) goto L_0x00c1
            int r10 = r13.icon
            if (r10 == 0) goto L_0x00be
            int r10 = r13.icon
            goto L_0x00c1
        L_0x00be:
            r10 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x00c1:
            android.os.Bundle r12 = r13.metaData
            java.lang.String r14 = "com.tapjoy.notification.icon.large"
            int r12 = m34044a(r12, r14, r6)
            if (r12 == 0) goto L_0x00d4
            android.content.res.Resources r14 = r6.getResources()
            android.graphics.Bitmap r12 = android.graphics.BitmapFactory.decodeResource(r14, r12)
            goto L_0x00d5
        L_0x00d4:
            r12 = r4
        L_0x00d5:
            java.lang.String r14 = "tapjoy"
            if (r15 != 0) goto L_0x00e5
            android.os.Bundle r0 = r13.metaData
            if (r0 == 0) goto L_0x00e5
            android.os.Bundle r13 = r13.metaData
            java.lang.String r15 = "com.tapjoy.notification.default_channel_id"
            java.lang.String r15 = r13.getString(r15, r14)
        L_0x00e5:
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r13 < r0) goto L_0x010a
            java.lang.String r13 = "notification"
            java.lang.Object r13 = r6.getSystemService(r13)
            android.app.NotificationManager r13 = (android.app.NotificationManager) r13
            if (r15 == 0) goto L_0x00fe
            android.app.NotificationChannel r0 = r13.getNotificationChannel(r15)
            if (r0 != 0) goto L_0x00fc
            goto L_0x00fe
        L_0x00fc:
            r4 = r15
            goto L_0x010a
        L_0x00fe:
            android.app.NotificationChannel r15 = new android.app.NotificationChannel
            r0 = 3
            java.lang.String r2 = "Tapjoy"
            r15.<init>(r14, r2, r0)
            r13.createNotificationChannel(r15)
            r4 = r14
        L_0x010a:
            com.tapjoy.internal.js$c r13 = new com.tapjoy.internal.js$c
            r13.<init>(r6, r4)
            android.app.Notification r6 = r13.f28871M
            r6.icon = r10
            com.tapjoy.internal.js$c r6 = r13.mo72804c(r8)
            com.tapjoy.internal.js$c r6 = r6.mo72802a((java.lang.CharSequence) r8)
            com.tapjoy.internal.js$c r6 = r6.mo72803b(r9)
            r6.f28877e = r7
            android.app.Notification r7 = r6.f28871M
            int r10 = r7.flags
            r10 = r10 | 16
            r7.flags = r10
            r6.f28883k = r1
            com.tapjoy.internal.js$b r7 = new com.tapjoy.internal.js$b
            r7.<init>()
            com.tapjoy.internal.js$b r7 = r7.mo72798a((java.lang.CharSequence) r8)
            com.tapjoy.internal.js$b r7 = r7.mo72800b(r9)
            com.tapjoy.internal.js$c r6 = r6.mo72801a((com.tapjoy.internal.C11821js.C11825d) r7)
            if (r11 == 0) goto L_0x0143
            android.app.Notification r7 = r6.f28871M
            r8 = 1
            r7.defaults = r8
        L_0x0143:
            if (r12 == 0) goto L_0x0147
            r6.f28880h = r12
        L_0x0147:
            com.tapjoy.internal.jt r7 = new com.tapjoy.internal.jt
            r7.<init>(r6)
            android.app.Notification r6 = r7.mo72806b()
            return r6
        L_0x0151:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11724hl.m34045a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, int, java.lang.String):android.app.Notification");
    }
}
