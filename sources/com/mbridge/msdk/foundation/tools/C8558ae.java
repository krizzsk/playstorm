package com.mbridge.msdk.foundation.tools;

import com.google.common.base.Ascii;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* renamed from: com.mbridge.msdk.foundation.tools.ae */
/* compiled from: Util */
final class C8558ae {

    /* renamed from: com.mbridge.msdk.foundation.tools.ae$a */
    /* compiled from: Util */
    private static class C8559a {

        /* renamed from: a */
        static final SecureRandom f20701a = new SecureRandom();

        /* renamed from: b */
        static final char[] f20702b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    /* renamed from: a */
    static String m24742a() {
        byte[] bArr = new byte[16];
        C8559a.f20701a.nextBytes(bArr);
        char[] cArr = new char[32];
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = i << 1;
            cArr[i2] = C8559a.f20702b[(b >> 4) & 15];
            cArr[i2 + 1] = C8559a.f20702b[b & Ascii.f17944SI];
        }
        return new String(cArr);
    }

    /* renamed from: b */
    static int m24747b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get((Object) null), new Object[0])).intValue();
        } catch (Throwable unused) {
            return 4096;
        }
    }

    /* renamed from: a */
    static boolean m24745a(File file) throws IOException {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || ((!parentFile.isDirectory() && !parentFile.mkdirs()) || !file.createNewFile())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    static byte[] m24748b(File file) throws IOException {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) == 0) {
            int i = (int) length;
            byte[] bArr = new byte[i];
            m24744a(file, bArr, i);
            return bArr;
        }
        throw new IllegalArgumentException("file too large, path:" + file.getPath());
    }

    /* renamed from: a */
    static void m24744a(File file, byte[] bArr, int i) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i2 = 0;
        while (i2 < i) {
            try {
                int read = randomAccessFile.read(bArr, i2, i - i2);
                if (read < 0) {
                    break;
                }
                i2 += read;
            } catch (Throwable th) {
                m24743a((Closeable) randomAccessFile);
                throw th;
            }
        }
        m24743a((Closeable) randomAccessFile);
    }

    /* renamed from: a */
    static boolean m24746a(File file, byte[] bArr) {
        RandomAccessFile randomAccessFile;
        try {
            String parent = file.getParent();
            File file2 = new File(parent, file.getName() + ".tmp");
            if (!m24745a(file2)) {
                return false;
            }
            randomAccessFile = new RandomAccessFile(file2, "rw");
            randomAccessFile.setLength((long) bArr.length);
            randomAccessFile.write(bArr);
            m24743a((Closeable) randomAccessFile);
            if (!file.exists() || file.delete()) {
                return file2.renameTo(file);
            }
            return false;
        } catch (Exception unused) {
        } catch (Throwable th) {
            m24743a((Closeable) randomAccessFile);
            throw th;
        }
    }

    /* renamed from: a */
    static void m24743a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    static void m24749c(File file) {
        try {
            if (file.exists()) {
                m24750d(file);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    private static void m24750d(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File d : listFiles) {
                m24750d(d);
            }
        }
        file.delete();
    }
}
