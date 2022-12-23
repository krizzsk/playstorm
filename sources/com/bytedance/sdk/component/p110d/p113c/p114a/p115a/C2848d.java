package com.bytedance.sdk.component.p110d.p113c.p114a.p115a;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.sdk.component.d.c.a.a.d */
/* compiled from: Util */
final class C2848d {

    /* renamed from: a */
    static final Charset f6430a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f6431b = Charset.forName("UTF-8");

    /* renamed from: a */
    static void m7883a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m7883a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
