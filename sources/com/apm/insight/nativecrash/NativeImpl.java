package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.apm.insight.C1240h;
import com.apm.insight.p011b.C1183d;
import com.apm.insight.p011b.C1186f;
import com.apm.insight.p011b.C1187g;
import com.apm.insight.p019h.C1243b;
import com.apm.insight.p023l.C1308o;
import com.apm.insight.p023l.C1315u;
import com.apm.insight.p023l.C1319x;
import java.io.File;

public class NativeImpl {

    /* renamed from: a */
    private static volatile boolean f1318a = false;

    /* renamed from: b */
    private static volatile boolean f1319b = false;

    /* renamed from: c */
    private static boolean f1320c = true;

    /* renamed from: a */
    public static int m1945a(int i) {
        if (f1318a && i >= 0) {
            try {
                return doLock("", i);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String m1946a(String str) {
        if (!f1318a) {
            return null;
        }
        return doGetCrashHeader(str);
    }

    /* renamed from: a */
    public static void m1947a(int i, String str) {
        if (f1318a && !TextUtils.isEmpty(str)) {
            try {
                doWriteFile(i, str, str.length());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m1948a(long j) {
    }

    /* renamed from: a */
    public static void m1949a(File file) {
        if (f1318a) {
            doRebuildTombstone(C1308o.m1840c(file).getAbsolutePath(), C1308o.m1836b(file).getAbsolutePath(), C1308o.m1844d(file).getAbsolutePath());
        }
    }

    /* renamed from: a */
    public static void m1950a(String str, String str2, String str3) {
        if (f1318a) {
            try {
                doDumpLogcat(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m1951a(boolean z) {
        f1320c = z;
        if (f1318a) {
            doSetResendSigQuit(z ? 1 : 0);
        }
    }

    /* renamed from: a */
    public static boolean m1952a() {
        if (f1319b) {
            return f1318a;
        }
        f1319b = true;
        if (!f1318a) {
            f1318a = C1315u.m1901a("apminsighta");
        }
        return f1318a;
    }

    /* renamed from: a */
    public static boolean m1953a(Context context) {
        String str;
        boolean a = m1952a();
        if (a) {
            String str2 = C1308o.m1860j(context) + "/apminsight";
            if (new File(context.getApplicationInfo().nativeLibraryDir, "libapminsightb.so").exists()) {
                str = context.getApplicationInfo().nativeLibraryDir;
            } else {
                str = C1243b.m1576a();
                C1243b.m1579b("apminsightb");
            }
            doStart(Build.VERSION.SDK_INT, str, str2, C1240h.m1557f(), C1240h.m1563l());
        }
        return a;
    }

    /* renamed from: b */
    public static int m1954b() {
        if (!f1318a) {
            return -1;
        }
        return doCreateCallbackThread();
    }

    /* renamed from: b */
    public static void m1955b(int i) {
        if (f1318a) {
            try {
                doCloseFile(i);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m1956b(long j) {
        if (f1318a) {
            try {
                doSetAlogFlushAddr(j);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m1957b(String str) {
        if (f1318a) {
            doDumpHprof(str);
        }
    }

    /* renamed from: c */
    public static int m1958c(String str) {
        if (f1318a && !TextUtils.isEmpty(str)) {
            try {
                return doLock(str, -1);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static long m1959c(int i) {
        if (!f1318a) {
            return 0;
        }
        return doGetThreadCpuTime(i);
    }

    /* renamed from: c */
    public static void m1960c() {
    }

    /* renamed from: c */
    public static void m1961c(long j) {
        if (f1318a) {
            try {
                doSetAlogLogDirAddr(j);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m1962d(String str) {
        if (f1318a) {
            try {
                doDumpMemInfo(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public static boolean m1963d() {
        if (!f1318a) {
            return false;
        }
        try {
            return doCheckNativeCrash();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static native boolean doCheckNativeCrash();

    private static native void doCloseFile(int i);

    private static native int doCreateCallbackThread();

    private static native void doDump(String str);

    private static native void doDumpFds(String str);

    private static native void doDumpHprof(String str);

    private static native void doDumpLogcat(String str, String str2, String str3);

    private static native void doDumpMaps(String str);

    private static native void doDumpMemInfo(String str);

    private static native void doDumpThreads(String str);

    private static native long doGetAppCpuTime();

    private static native long doGetChildCpuTime();

    private static native String doGetCrashHeader(String str);

    private static native long doGetDeviceCpuTime();

    private static native int doGetFDCount();

    private static native String[] doGetFdDump(int i, int i2, int[] iArr, String[] strArr);

    private static native long doGetFreeMemory();

    private static native long doGetThreadCpuTime(int i);

    private static native int doGetThreadsCount();

    private static native long doGetTotalMemory();

    private static native long doGetVMSize();

    private static native void doInitThreadDump();

    private static native int doLock(String str, int i);

    private static native int doOpenFile(String str);

    private static native void doRebuildTombstone(String str, String str2, String str3);

    private static native void doSetAlogConfigPath(String str);

    private static native void doSetAlogFlushAddr(long j);

    private static native void doSetAlogLogDirAddr(long j);

    private static native void doSetResendSigQuit(int i);

    private static native void doSetUploadEnd();

    private static native void doSignalMainThread();

    private static native int doStart(int i, String str, String str2, String str3, int i2);

    private static native void doStartAnrMonitor(int i);

    private static native void doWriteFile(int i, String str, int i2);

    /* renamed from: e */
    public static void m1964e(String str) {
        if (f1318a) {
            try {
                doDumpFds(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: e */
    public static boolean m1965e() {
        if (!f1318a) {
            return false;
        }
        try {
            return is64Bit();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static void m1966f() {
        C1319x.m1937a(new Runnable() {
            public void run() {
                try {
                    NativeImpl.m1976l();
                } catch (Throwable unused) {
                }
            }
        }, "NPTH-AnrMonitor");
    }

    /* renamed from: f */
    public static void m1967f(String str) {
        if (f1318a) {
            try {
                doDumpMaps(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    public static void m1968g(String str) {
        if (f1318a) {
            try {
                doDumpThreads(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    public static boolean m1969g() {
        return f1320c;
    }

    /* renamed from: h */
    public static int m1970h(String str) {
        if (!f1318a) {
            return -1;
        }
        try {
            return doOpenFile(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: h */
    public static void m1971h() {
        if (f1318a) {
            doSignalMainThread();
        }
    }

    private static void handleNativeCrash(String str) {
        NativeCrashCollector.onNativeCrash(str);
    }

    /* renamed from: i */
    public static void m1972i() {
        if (f1318a) {
            doSetUploadEnd();
        }
    }

    /* renamed from: i */
    public static void m1973i(String str) {
        if (f1318a) {
            doDump(str);
        }
    }

    private static native boolean is64Bit();

    /* renamed from: j */
    public static void m1974j() {
        if (f1318a) {
            doInitThreadDump();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m1976l() {
        if (f1318a) {
            try {
                doStartAnrMonitor(Build.VERSION.SDK_INT);
            } catch (Throwable unused) {
            }
        }
    }

    private static void reportEventForAnrMonitor() {
        try {
            System.currentTimeMillis();
            C1240h.m1561j();
            C1186f.m1298b(true);
            C1183d.m1292b();
            C1187g.m1299a(C1240h.m1558g()).mo12196a().mo12185e();
        } catch (Throwable unused) {
        }
    }
}
