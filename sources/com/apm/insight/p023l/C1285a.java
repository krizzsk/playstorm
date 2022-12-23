package com.apm.insight.p023l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.apm.insight.entity.C1217a;
import com.apm.insight.p011b.C1186f;
import com.apm.insight.runtime.p024a.C1343b;
import com.facebook.internal.security.CertificateUtil;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.a */
public final class C1285a {

    /* renamed from: a */
    private static String f1278a = null;

    /* renamed from: b */
    private static Class<?> f1279b = null;

    /* renamed from: c */
    private static Field f1280c = null;

    /* renamed from: d */
    private static Field f1281d = null;

    /* renamed from: e */
    private static boolean f1282e = false;

    /* renamed from: a */
    private static long m1715a(int i) {
        if (i < 0) {
            return 0;
        }
        return ((long) i) * PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    /* renamed from: a */
    public static ActivityManager.ProcessErrorStateInfo m1716a(Context context, int i) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        int myPid = Process.myPid();
        int i2 = 0;
        while (i2 < i) {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo next : processesInErrorState) {
                    if (next.pid == myPid && next.condition == 2) {
                        return next;
                    }
                }
            }
            i2++;
            if (i == i2 || C1186f.m1297a()) {
                break;
            }
            SystemClock.sleep(200);
        }
        return null;
    }

    /* renamed from: a */
    private static String m1717a() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read > 0) {
                        sb.append((char) read);
                    } else {
                        String sb2 = sb.toString();
                        C1300k.m1795a((Closeable) bufferedReader);
                        return sb2;
                    }
                }
            } catch (Throwable unused) {
                C1300k.m1795a((Closeable) bufferedReader);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            C1300k.m1795a((Closeable) bufferedReader);
            return null;
        }
    }

    /* renamed from: a */
    public static void m1718a(Context context, JSONObject jSONObject) {
        try {
            m1720a(jSONObject);
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                m1723b(jSONObject, activityManager);
            }
            m1721a(jSONObject, activityManager);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m1719a(String str) {
        f1278a = str;
    }

    /* renamed from: a */
    private static void m1720a(JSONObject jSONObject) {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("dalvikPrivateDirty", m1715a(memoryInfo.dalvikPrivateDirty));
        jSONObject2.put("dalvikPss", m1715a(memoryInfo.dalvikPss));
        jSONObject2.put("dalvikSharedDirty", m1715a(memoryInfo.dalvikSharedDirty));
        jSONObject2.put("nativePrivateDirty", m1715a(memoryInfo.nativePrivateDirty));
        jSONObject2.put("nativePss", m1715a(memoryInfo.nativePss));
        jSONObject2.put("nativeSharedDirty", m1715a(memoryInfo.nativeSharedDirty));
        jSONObject2.put("otherPrivateDirty", m1715a(memoryInfo.otherPrivateDirty));
        jSONObject2.put("otherPss", m1715a(memoryInfo.otherPss));
        jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
                if (!TextUtils.isEmpty(memoryStat)) {
                    jSONObject2.put("summary.graphics", m1715a(Integer.parseInt(memoryStat)));
                }
            } catch (Throwable unused) {
            }
        }
        jSONObject2.put("totalPrivateClean", C1287c.m1731a(memoryInfo));
        jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
        jSONObject2.put("totalPss", m1715a(memoryInfo.getTotalPss()));
        jSONObject2.put("totalSharedClean", C1287c.m1732b(memoryInfo));
        jSONObject2.put("totalSharedDirty", m1715a(memoryInfo.getTotalSharedDirty()));
        jSONObject2.put("totalSwappablePss", m1715a(C1287c.m1733c(memoryInfo)));
        jSONObject.put("memory_info", jSONObject2);
    }

    /* renamed from: a */
    private static void m1721a(JSONObject jSONObject, ActivityManager activityManager) {
        JSONObject jSONObject2 = new JSONObject();
        boolean z = true;
        C1217a.m1409a(jSONObject, "filters", "native_heap_leak", String.valueOf(Debug.getNativeHeapAllocatedSize() > 209715200));
        jSONObject2.put("native_heap_size", Debug.getNativeHeapSize());
        jSONObject2.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
        jSONObject2.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();
        long j = runtime.totalMemory();
        jSONObject2.put("max_memory", maxMemory);
        jSONObject2.put("free_memory", freeMemory);
        jSONObject2.put("total_memory", j);
        if (((float) (j - freeMemory)) <= ((float) maxMemory) * 0.95f) {
            z = false;
        }
        C1217a.m1409a(jSONObject, "filters", "java_heap_leak", String.valueOf(z));
        if (activityManager != null) {
            jSONObject2.put("memory_class", activityManager.getMemoryClass());
            jSONObject2.put("large_memory_class", activityManager.getLargeMemoryClass());
        }
        jSONObject.put("app_memory_info", jSONObject2);
    }

    /* renamed from: a */
    public static boolean m1722a(Context context) {
        return context == null ? C1343b.m2080d().mo12450f() : C1343b.m2080d().mo12450f() || m1728f(context);
    }

    /* renamed from: b */
    private static void m1723b(JSONObject jSONObject, ActivityManager activityManager) {
        JSONObject jSONObject2 = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        jSONObject2.put("availMem", memoryInfo.availMem);
        jSONObject2.put("lowMemory", memoryInfo.lowMemory);
        jSONObject2.put("threshold", memoryInfo.threshold);
        jSONObject2.put("totalMem", C1304n.m1826a(memoryInfo));
        jSONObject.put("sys_memory_info", jSONObject2);
    }

    /* renamed from: b */
    public static boolean m1724b(Context context) {
        String c = m1725c(context);
        if (c != null && c.contains(CertificateUtil.DELIMITER)) {
            return false;
        }
        if (c == null || !c.equals(context.getPackageName())) {
            return c != null && c.equals(context.getApplicationInfo().processName);
        }
        return true;
    }

    /* renamed from: c */
    public static String m1725c(Context context) {
        if (!TextUtils.isEmpty(f1278a)) {
            return f1278a;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
                    if (next.pid == myPid) {
                        String str = next.processName;
                        f1278a = str;
                        return str;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String a = m1717a();
        f1278a = a;
        return a == null ? "" : a;
    }

    /* renamed from: d */
    public static String m1726d(Context context) {
        Class<?> g = m1729g(context);
        if (f1280c == null && g != null) {
            try {
                f1280c = g.getDeclaredField("VERSION_NAME");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f1280c;
        if (field == null) {
            return "";
        }
        try {
            return String.valueOf(field.get((Object) null));
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* renamed from: e */
    public static int m1727e(Context context) {
        Class<?> g = m1729g(context);
        if (f1281d == null && g != null) {
            try {
                f1281d = g.getDeclaredField("VERSION_CODE");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f1281d;
        if (field == null) {
            return -1;
        }
        try {
            return ((Integer) field.get((Object) null)).intValue();
        } catch (Throwable unused2) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        r5 = r5.get(0).topActivity;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m1728f(android.content.Context r5) {
        /*
            java.lang.String r0 = r5.getPackageName()
            r1 = 0
            java.lang.String r2 = "activity"
            java.lang.Object r5 = r5.getSystemService(r2)     // Catch:{ all -> 0x005d }
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5     // Catch:{ all -> 0x005d }
            if (r5 != 0) goto L_0x0010
            return r1
        L_0x0010:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x005d }
            r3 = 21
            if (r2 >= r3) goto L_0x0038
            r2 = 1
            java.util.List r5 = r5.getRunningTasks(r2)     // Catch:{ all -> 0x005d }
            if (r5 == 0) goto L_0x005d
            boolean r3 = r5.isEmpty()     // Catch:{ all -> 0x005d }
            if (r3 != 0) goto L_0x005d
            java.lang.Object r5 = r5.get(r1)     // Catch:{ all -> 0x005d }
            android.app.ActivityManager$RunningTaskInfo r5 = (android.app.ActivityManager.RunningTaskInfo) r5     // Catch:{ all -> 0x005d }
            android.content.ComponentName r5 = r5.topActivity     // Catch:{ all -> 0x005d }
            if (r5 == 0) goto L_0x005d
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x005d }
            boolean r5 = r0.equals(r5)     // Catch:{ all -> 0x005d }
            if (r5 == 0) goto L_0x005d
            return r2
        L_0x0038:
            java.util.List r5 = r5.getRunningAppProcesses()     // Catch:{ all -> 0x005d }
            if (r5 == 0) goto L_0x005d
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x005d }
        L_0x0042:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x005d
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x005d }
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch:{ all -> 0x005d }
            int r3 = r2.importance     // Catch:{ all -> 0x005d }
            r4 = 100
            if (r3 != r4) goto L_0x0042
            java.lang.String[] r5 = r2.pkgList     // Catch:{ all -> 0x005d }
            r5 = r5[r1]     // Catch:{ all -> 0x005d }
            boolean r5 = r0.equals(r5)     // Catch:{ all -> 0x005d }
            return r5
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p023l.C1285a.m1728f(android.content.Context):boolean");
    }

    /* renamed from: g */
    private static Class<?> m1729g(Context context) {
        if (f1279b == null && !f1282e) {
            try {
                f1279b = Class.forName(context.getPackageName() + ".BuildConfig");
            } catch (ClassNotFoundException unused) {
            }
            f1282e = true;
        }
        return f1279b;
    }
}
