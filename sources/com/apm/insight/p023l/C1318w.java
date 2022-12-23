package com.apm.insight.p023l;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.apm.insight.C1240h;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.w */
public class C1318w {
    /* renamed from: a */
    public static long m1927a(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getTotalBytes();
            }
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static JSONObject m1928a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("inner_free", m1930b());
            jSONObject.put("inner_total", m1932c());
            jSONObject.put("sdcard_free", m1935f());
            jSONObject.put("sdcard_total", m1936g());
            jSONObject.put("inner_free_real", m1933d());
            jSONObject.put("inner_total_real", m1934e());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static boolean m1929a() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: b */
    private static long m1930b() {
        try {
            return m1931b(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static long m1931b(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getFreeBytes();
            }
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: c */
    private static long m1932c() {
        try {
            return m1927a(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: d */
    private static long m1933d() {
        try {
            return m1931b(C1240h.m1558g().getFilesDir());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: e */
    private static long m1934e() {
        try {
            return m1927a(C1240h.m1558g().getFilesDir());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: f */
    private static long m1935f() {
        try {
            if (m1929a()) {
                return Environment.getExternalStorageDirectory().getFreeSpace();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: g */
    private static long m1936g() {
        try {
            if (m1929a()) {
                return Environment.getExternalStorageDirectory().getTotalSpace();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
