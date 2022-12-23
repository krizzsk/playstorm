package com.bykv.p068vk.openvk.component.video.p069a.p082e;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.bykv.vk.openvk.component.video.a.e.c */
/* compiled from: VideoFilesUtils */
public class C2514c {
    /* renamed from: a */
    public static long m6222a(String str, String str2) {
        File c = m6225c(str, str2);
        if (c.exists()) {
            return c.length();
        }
        File b = m6224b(str, str2);
        if (b.exists()) {
            return b.length();
        }
        return 0;
    }

    /* renamed from: b */
    public static File m6224b(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2 + ".temp");
    }

    /* renamed from: c */
    public static File m6225c(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    /* renamed from: a */
    public static void m6223a(RandomAccessFile randomAccessFile, byte[] bArr, int i, int i2, String str) throws IOException {
        try {
            randomAccessFile.seek((long) i);
            randomAccessFile.write(bArr, 0, i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
