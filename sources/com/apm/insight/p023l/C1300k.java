package com.apm.insight.p023l;

import com.apm.insight.p019h.C1241a;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.ZipFile;

/* renamed from: com.apm.insight.l.k */
public final class C1300k {
    /* renamed from: a */
    public static void m1795a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m1796a(String str, int i) {
        C1241a.m1570a("android.os.FileUtils", "setPermissions", str, Integer.valueOf(i), -1, -1);
    }

    /* renamed from: a */
    public static void m1797a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }
}
