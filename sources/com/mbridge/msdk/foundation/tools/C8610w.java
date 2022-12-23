package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.same.p300b.C8419b;
import com.mbridge.msdk.foundation.same.p300b.C8421d;
import com.mbridge.msdk.foundation.same.p300b.C8422e;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.util.UUID;

/* renamed from: com.mbridge.msdk.foundation.tools.w */
/* compiled from: SameSDCardTool */
public final class C8610w {

    /* renamed from: a */
    static boolean f20806a = false;

    /* renamed from: b */
    static String f20807b = "";

    /* renamed from: c */
    public static char[] f20808c = {'P', 'a', 'c', 'k', 'a', 'g', 'e', 'M', 'a', 'n', 'a', 'g', 'e', 'r'};

    /* renamed from: d */
    private static boolean f20809d = false;

    /* renamed from: e */
    private static int f20810e = -1;

    /* renamed from: f */
    private static int f20811f = -1;

    /* renamed from: g */
    private static int f20812g = -1;

    /* renamed from: h */
    private static int f20813h = -1;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0026 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m24892a(android.content.Context r2) {
        /*
            boolean r0 = f20809d
            if (r0 != 0) goto L_0x0047
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0026 }
            r0.<init>()     // Catch:{ Exception -> 0x0026 }
            java.io.File r1 = r2.getFilesDir()     // Catch:{ Exception -> 0x0026 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0026 }
            r0.append(r1)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r1 = java.io.File.separator     // Catch:{ Exception -> 0x0026 }
            r0.append(r1)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0026 }
            f20807b = r0     // Catch:{ Exception -> 0x0026 }
            r0 = 0
            f20806a = r0     // Catch:{ Exception -> 0x0026 }
            m24894b(r2)     // Catch:{ Exception -> 0x0026 }
            goto L_0x0044
        L_0x0026:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0044 }
            r0.<init>()     // Catch:{ Exception -> 0x0044 }
            java.io.File r1 = r2.getFilesDir()     // Catch:{ Exception -> 0x0044 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0044 }
            r0.append(r1)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r1 = java.io.File.separator     // Catch:{ Exception -> 0x0044 }
            r0.append(r1)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0044 }
            f20807b = r0     // Catch:{ Exception -> 0x0044 }
            m24894b(r2)     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            r2 = 1
            f20809d = r2
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8610w.m24892a(android.content.Context):void");
    }

    /* renamed from: b */
    private static void m24894b(Context context) {
        C8422e.m24333a((C8419b) new C8421d(m24895c(context)));
        C8422e.m24331a().mo57502b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        if ((m24897d() > 31457280) == false) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m24895c(android.content.Context r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 18
            if (r0 < r2) goto L_0x001a
            java.io.File r0 = r6.getExternalFilesDir(r1)     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x001a
            java.io.File r0 = m24891a((java.io.File) r0)     // Catch:{ all -> 0x0012 }
            goto L_0x001b
        L_0x0012:
            r0 = move-exception
            java.lang.String r2 = "common-exception"
            java.lang.String r3 = "hasSDCard is failed"
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r2, r3, r0)
        L_0x001a:
            r0 = r1
        L_0x001b:
            boolean r2 = f20806a
            if (r2 == 0) goto L_0x006f
            if (r0 != 0) goto L_0x005e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = r2.getPath()
            r0.append(r2)
            java.lang.String r2 = java.io.File.separator
            r0.append(r2)
            java.lang.String r2 = "Android"
            r0.append(r2)
            java.lang.String r2 = java.io.File.separator
            r0.append(r2)
            java.lang.String r2 = "data"
            r0.append(r2)
            java.lang.String r2 = java.io.File.separator
            r0.append(r2)
            java.lang.String r2 = r6.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            java.io.File r0 = m24891a((java.io.File) r2)
        L_0x005e:
            long r2 = m24897d()
            r4 = 31457280(0x1e00000, double:1.55419614E-316)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x006b
            r2 = 1
            goto L_0x006c
        L_0x006b:
            r2 = 0
        L_0x006c:
            if (r2 != 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r1 = r0
        L_0x0070:
            if (r1 == 0) goto L_0x0078
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0080
        L_0x0078:
            java.io.File r6 = r6.getFilesDir()
            java.io.File r1 = r6.getAbsoluteFile()
        L_0x0080:
            java.lang.String r6 = r1.getAbsolutePath()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8610w.m24895c(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    private static File m24891a(File file) {
        File file2 = new File(file, UUID.randomUUID() + "");
        if (file2.exists()) {
            file2.delete();
        }
        if (!file2.mkdirs()) {
            return null;
        }
        file2.delete();
        return file.getAbsoluteFile();
    }

    /* renamed from: c */
    private static boolean m24896c() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            C8608u.m24884d("", "hasSDCard is failed");
            return false;
        }
    }

    /* renamed from: a */
    public static int m24890a() {
        try {
            Context g = C2350a.m5601e().mo15792g();
            long longValue = ((Long) C8554aa.m24733b(g, "freeExternalSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > TapjoyConstants.SESSION_ID_INACTIVITY_TIME || f20811f == -1) {
                f20811f = Long.valueOf((m24897d() / 1000) / 1000).intValue();
                C8554aa.m24732a(g, "freeExternalSize", Long.valueOf(currentTimeMillis));
            }
        } catch (Throwable th) {
            C8608u.m24881a("SameSDCardTool", th.getMessage(), th);
        }
        return f20811f;
    }

    /* renamed from: d */
    private static long m24897d() {
        if (m24896c()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static int m24893b() {
        if (f20810e == -1) {
            try {
                f20810e = new Long((m24898e() / 1000) / 1000).intValue();
            } catch (Throwable th) {
                C8608u.m24881a("SameSDCardTool", th.getMessage(), th);
            }
        }
        return f20810e;
    }

    /* renamed from: e */
    private static long m24898e() {
        if (m24896c()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
