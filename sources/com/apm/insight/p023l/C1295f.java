package com.apm.insight.p023l;

import com.apm.insight.C1240h;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.C1341a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* renamed from: com.apm.insight.l.f */
public class C1295f {
    /* renamed from: a */
    public static File m1751a(String str, int i, int i2) {
        File file = new File(C1308o.m1831a(C1240h.m1558g(), str), "logcat.txt");
        if (file.exists() && file.length() > 0) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m1950a(file.getAbsolutePath(), String.valueOf(i), String.valueOf(i2));
        return file;
    }

    /* renamed from: a */
    public static void m1752a() {
        try {
            m1751a(C1240h.m1557f(), C1240h.m1560i().getLogcatDumpCount(), C1240h.m1560i().getLogcatLevel());
            m1753b();
            m1755d();
            m1754c();
            m1756e();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static File m1753b() {
        File file = new File(C1308o.m1846e(C1240h.m1558g()), "maps.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m1967f(file.getAbsolutePath());
        return file;
    }

    /* renamed from: c */
    public static File m1754c() {
        File file = new File(C1308o.m1846e(C1240h.m1558g()), "meminfo.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m1962d(file.getAbsolutePath());
        return file;
    }

    /* renamed from: d */
    public static File m1755d() {
        File file = new File(C1308o.m1846e(C1240h.m1558g()), "fds.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m1964e(file.getAbsolutePath());
        return file;
    }

    /* renamed from: e */
    public static File m1756e() {
        File file = new File(C1308o.m1846e(C1240h.m1558g()), "threads.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m1968g(file.getAbsolutePath());
        return file;
    }

    /* renamed from: f */
    public static File m1757f() {
        BufferedWriter bufferedWriter;
        File file = new File(C1308o.m1846e(C1240h.m1558g()), "anr_trace.txt");
        if (file.exists() || !C1341a.m2049f()) {
            return file;
        }
        File file2 = new File("/data/anr/traces.txt");
        if (!file2.exists()) {
            return file;
        }
        BufferedReader bufferedReader = null;
        try {
            file.getParentFile().mkdirs();
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file));
                int i = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            bufferedWriter.write(readLine);
                            bufferedWriter.write(10);
                            i += readLine.length();
                            if (i >= 1048576) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (IOException unused) {
                        bufferedReader = bufferedReader2;
                        C1300k.m1795a((Closeable) bufferedReader);
                        C1300k.m1795a((Closeable) bufferedWriter);
                        return file;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        C1300k.m1795a((Closeable) bufferedReader);
                        C1300k.m1795a((Closeable) bufferedWriter);
                        throw th;
                    }
                }
                C1300k.m1795a((Closeable) bufferedReader2);
            } catch (IOException unused2) {
                bufferedWriter = null;
                bufferedReader = bufferedReader2;
                C1300k.m1795a((Closeable) bufferedReader);
                C1300k.m1795a((Closeable) bufferedWriter);
                return file;
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = null;
                bufferedReader = bufferedReader2;
                C1300k.m1795a((Closeable) bufferedReader);
                C1300k.m1795a((Closeable) bufferedWriter);
                throw th;
            }
        } catch (IOException unused3) {
            bufferedWriter = null;
            C1300k.m1795a((Closeable) bufferedReader);
            C1300k.m1795a((Closeable) bufferedWriter);
            return file;
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter = null;
            C1300k.m1795a((Closeable) bufferedReader);
            C1300k.m1795a((Closeable) bufferedWriter);
            throw th;
        }
        C1300k.m1795a((Closeable) bufferedWriter);
        return file;
    }
}
