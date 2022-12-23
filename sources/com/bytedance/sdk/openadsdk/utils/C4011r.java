package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.C3578m;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* renamed from: com.bytedance.sdk.openadsdk.utils.r */
/* compiled from: TTCrashHandler */
public class C4011r implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f10250a = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: b */
    private String f10251b;

    /* renamed from: a */
    public static C4011r m13165a() {
        return new C4011r();
    }

    private C4011r() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        m13167b();
    }

    /* renamed from: b */
    private void m13167b() {
        Context a = C3578m.m11231a();
        if (a != null) {
            try {
                File file = new File(a.getFilesDir(), "TTCache");
                file.mkdirs();
                this.f10251b = file.getPath();
            } catch (Throwable unused) {
            }
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        boolean z = false;
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            if (stringWriter2 != null) {
                z = stringWriter2.contains(AdSlot.class.getPackage().getName());
            }
        } catch (Throwable unused) {
        }
        if (z) {
            m13166a(thread, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f10250a;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.io.FileOutputStream} */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f6 A[SYNTHETIC, Splitter:B:55:0x00f6] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010a A[SYNTHETIC, Splitter:B:68:0x010a] */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13166a(java.lang.Thread r18, java.lang.Throwable r19) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r0 = ", "
            java.lang.String r2 = "0"
            java.lang.String r3 = "TTCrashHandler"
            r4 = 0
            java.lang.String r5 = r1.f10251b     // Catch:{ all -> 0x0101 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0101 }
            if (r5 == 0) goto L_0x0014
            r17.m13167b()     // Catch:{ all -> 0x0101 }
        L_0x0014:
            java.lang.String r5 = r1.f10251b     // Catch:{ all -> 0x0101 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0101 }
            if (r5 == 0) goto L_0x001d
            return
        L_0x001d:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0101 }
            java.lang.String r6 = r1.f10251b     // Catch:{ all -> 0x0101 }
            java.lang.String r7 = "tt_crash_count.properties"
            r5.<init>(r6, r7)     // Catch:{ all -> 0x0101 }
            boolean r6 = r5.exists()     // Catch:{ all -> 0x0101 }
            java.lang.String r7 = "tt_crash_info"
            java.lang.String r8 = "crash_last_time"
            java.lang.String r9 = "crash_count"
            r10 = 1
            if (r6 == 0) goto L_0x00d0
            boolean r6 = r5.isFile()     // Catch:{ all -> 0x0101 }
            if (r6 == 0) goto L_0x00d0
            boolean r6 = r5.canRead()     // Catch:{ all -> 0x0101 }
            if (r6 == 0) goto L_0x00d0
            java.util.Properties r6 = new java.util.Properties     // Catch:{ all -> 0x0101 }
            r6.<init>()     // Catch:{ all -> 0x0101 }
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ all -> 0x0101 }
            r11.<init>(r5)     // Catch:{ all -> 0x0101 }
            r6.load(r11)     // Catch:{ all -> 0x00cc }
            java.lang.String r12 = r6.getProperty(r9, r2)     // Catch:{ all -> 0x00cc }
            java.lang.String r2 = r6.getProperty(r8, r2)     // Catch:{ all -> 0x00cc }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x00cc }
            int r12 = r12.intValue()     // Catch:{ all -> 0x00cc }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00cc }
            long r13 = r2.longValue()     // Catch:{ all -> 0x00cc }
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00cc }
            long r15 = r15 - r13
            r13 = 300000(0x493e0, double:1.482197E-318)
            int r2 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            r13 = 0
            if (r2 >= 0) goto L_0x0074
            int r12 = r12 + r10
            r2 = r13
            goto L_0x0076
        L_0x0074:
            r2 = r10
            r12 = r2
        L_0x0076:
            r14 = 3
            if (r12 < r14) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r10 = r13
        L_0x007b:
            if (r10 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r13 = r12
        L_0x007f:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cc }
            r12.<init>()     // Catch:{ all -> 0x00cc }
            java.lang.String r14 = "=="
            r12.append(r14)     // Catch:{ all -> 0x00cc }
            r12.append(r13)     // Catch:{ all -> 0x00cc }
            r12.append(r0)     // Catch:{ all -> 0x00cc }
            r12.append(r10)     // Catch:{ all -> 0x00cc }
            r12.append(r0)     // Catch:{ all -> 0x00cc }
            r12.append(r2)     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x00cc }
            com.bytedance.sdk.component.utils.C2975l.m8391e(r3, r0)     // Catch:{ all -> 0x00cc }
            if (r10 == 0) goto L_0x00a5
            r5.delete()     // Catch:{ all -> 0x00c2 }
            goto L_0x00c2
        L_0x00a5:
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x00cc }
            r6.setProperty(r9, r0)     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x00b9
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x00cc }
            r6.setProperty(r8, r0)     // Catch:{ all -> 0x00cc }
        L_0x00b9:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00cc }
            r2.<init>(r5)     // Catch:{ all -> 0x00cc }
            r6.store(r2, r7)     // Catch:{ all -> 0x00ca }
            r4 = r2
        L_0x00c2:
            if (r10 == 0) goto L_0x00c7
            r17.m13168c()     // Catch:{ all -> 0x00cc }
        L_0x00c7:
            r2 = r4
            r4 = r11
            goto L_0x00f4
        L_0x00ca:
            r0 = move-exception
            goto L_0x00ce
        L_0x00cc:
            r0 = move-exception
            r2 = r4
        L_0x00ce:
            r4 = r11
            goto L_0x0103
        L_0x00d0:
            java.util.Properties r0 = new java.util.Properties     // Catch:{ all -> 0x0101 }
            r0.<init>()     // Catch:{ all -> 0x0101 }
            java.lang.String r2 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0101 }
            r0.setProperty(r9, r2)     // Catch:{ all -> 0x0101 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0101 }
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0101 }
            r0.setProperty(r8, r2)     // Catch:{ all -> 0x0101 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0101 }
            r2.<init>(r5)     // Catch:{ all -> 0x0101 }
            r0.store(r2, r7)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "==first"
            com.bytedance.sdk.component.utils.C2975l.m8391e(r3, r0)     // Catch:{ all -> 0x00ff }
        L_0x00f4:
            if (r4 == 0) goto L_0x00f9
            r4.close()     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            if (r2 == 0) goto L_0x0110
        L_0x00fb:
            r2.close()     // Catch:{ all -> 0x0110 }
            goto L_0x0110
        L_0x00ff:
            r0 = move-exception
            goto L_0x0103
        L_0x0101:
            r0 = move-exception
            r2 = r4
        L_0x0103:
            java.lang.String r5 = "crash count error"
            com.bytedance.sdk.component.utils.C2975l.m8388c(r3, r5, r0)     // Catch:{ all -> 0x0111 }
            if (r4 == 0) goto L_0x010d
            r4.close()     // Catch:{ all -> 0x010d }
        L_0x010d:
            if (r2 == 0) goto L_0x0110
            goto L_0x00fb
        L_0x0110:
            return
        L_0x0111:
            r0 = move-exception
            if (r4 == 0) goto L_0x0117
            r4.close()     // Catch:{ all -> 0x0117 }
        L_0x0117:
            if (r2 == 0) goto L_0x011c
            r2.close()     // Catch:{ all -> 0x011c }
        L_0x011c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C4011r.m13166a(java.lang.Thread, java.lang.Throwable):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(1:4)|5|7|8|(1:10)|11|12|(3:13|14|16)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003a */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13168c() {
        /*
            r7 = this;
            java.lang.String r0 = "a"
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.String r4 = "com.bytedance.sdk.openadsdk.TTC2Proxy"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ all -> 0x001e }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r2] = r6     // Catch:{ all -> 0x001e }
            java.lang.reflect.Method r4 = com.bytedance.sdk.component.utils.C2988w.m8466a(r4, r0, r5)     // Catch:{ all -> 0x001e }
            if (r4 == 0) goto L_0x001e
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x001e }
            android.content.Context r6 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()     // Catch:{ all -> 0x001e }
            r5[r2] = r6     // Catch:{ all -> 0x001e }
            r4.invoke(r1, r5)     // Catch:{ all -> 0x001e }
        L_0x001e:
            java.lang.String r4 = "com.bytedance.sdk.openadsdk.TTC3Proxy"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ all -> 0x0037 }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r2] = r6     // Catch:{ all -> 0x0037 }
            java.lang.reflect.Method r0 = com.bytedance.sdk.component.utils.C2988w.m8466a(r4, r0, r5)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0037
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0037 }
            android.content.Context r4 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()     // Catch:{ all -> 0x0037 }
            r3[r2] = r4     // Catch:{ all -> 0x0037 }
            r0.invoke(r1, r3)     // Catch:{ all -> 0x0037 }
        L_0x0037:
            com.bytedance.sdk.openadsdk.core.p155i.C3533d.m10951a()     // Catch:{ all -> 0x003a }
        L_0x003a:
            com.bytedance.sdk.component.adexpress.p091a.p093b.C2603a.m6643b()     // Catch:{ all -> 0x003d }
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C4011r.m13168c():void");
    }
}
