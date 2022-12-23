package com.p374my.target;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: com.my.target.h8 */
public final class C9740h8 {

    /* renamed from: a */
    public static final FilenameFilter f24014a = $$Lambda$WN8gVEMvZHvzGpPdoKYhbZeGZDI.INSTANCE;

    /* renamed from: b */
    public static final FilenameFilter f24015b = $$Lambda$8ILkdpWbV59BmSlDHeTciTMoc4.INSTANCE;

    /* renamed from: c */
    public static volatile C9740h8 f24016c;

    /* renamed from: d */
    public final File f24017d;

    public C9740h8(File file) {
        this.f24017d = file;
    }

    /* renamed from: a */
    public static C9740h8 m28156a(Context context) {
        C9740h8 h8Var = f24016c;
        if (h8Var == null) {
            synchronized (C9740h8.class) {
                h8Var = f24016c;
                if (h8Var == null) {
                    File cacheDir = context.getCacheDir();
                    boolean z = true;
                    if (cacheDir != null && !cacheDir.exists()) {
                        z = cacheDir.mkdir();
                    }
                    if (!z) {
                        C9672e0.m27884c("DiskCache: unable to create cache dir");
                        return null;
                    }
                    File file = new File(cacheDir, "mytargetcache");
                    if (!file.exists()) {
                        z = file.mkdir();
                    }
                    if (!z) {
                        C9672e0.m27884c("DiskCache: unable to create cache dir");
                        return null;
                    } else if (file.isDirectory() && file.canWrite()) {
                        C9740h8 h8Var2 = new C9740h8(file);
                        f24016c = h8Var2;
                        h8Var = h8Var2;
                    }
                }
            }
        }
        return h8Var;
    }

    /* renamed from: a */
    public final int mo64189a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 8192);
        int i = 0;
        while (true) {
            try {
                int read = bufferedInputStream.read(bArr, 0, 8192);
                if (read == -1) {
                    break;
                }
                bufferedOutputStream.write(bArr, 0, read);
                i += read;
            } catch (Throwable th) {
                C9672e0.m27882a(th.getMessage());
            }
        }
        bufferedOutputStream.flush();
        try {
            bufferedOutputStream.close();
        } catch (Throwable th2) {
            C9672e0.m27882a(th2.getMessage());
        }
        try {
            bufferedInputStream.close();
        } catch (Throwable th3) {
            C9672e0.m27882a(th3.getMessage());
        }
        return i;
        throw th;
        bufferedInputStream.close();
        throw th;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|12|21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4 = "DiskCache OOME, called twice: " + r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0063 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo64190a(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.mo64195a()     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = ".img"
            java.io.File r4 = r3.mo64193a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x0078 }
            boolean r0 = r4.exists()     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0075
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r0.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "DiskCache get image: "
            r0.append(r1)     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = r4.getPath()     // Catch:{ all -> 0x0078 }
            r0.append(r1)     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0078 }
            com.p374my.target.C9672e0.m27882a(r0)     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ OutOfMemoryError -> 0x0048, all -> 0x0032 }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch:{ OutOfMemoryError -> 0x0048, all -> 0x0032 }
            monitor-exit(r3)
            return r4
        L_0x0032:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r0.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "DiskCache exception: "
            r0.append(r1)     // Catch:{ all -> 0x0078 }
            r0.append(r4)     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x0078 }
        L_0x0044:
            com.p374my.target.C9672e0.m27884c(r4)     // Catch:{ all -> 0x0078 }
            goto L_0x0075
        L_0x0048:
            r0 = move-exception
            java.lang.System.gc()     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "DiskCache OOME, trying once again"
            com.p374my.target.C9672e0.m27884c(r1)     // Catch:{ all -> 0x0078 }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x0063 }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x0063 }
            r2 = 2
            r1.inSampleSize = r2     // Catch:{ OutOfMemoryError -> 0x0063 }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ OutOfMemoryError -> 0x0063 }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeFile(r4, r1)     // Catch:{ OutOfMemoryError -> 0x0063 }
            monitor-exit(r3)
            return r4
        L_0x0063:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r4.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "DiskCache OOME, called twice: "
            r4.append(r1)     // Catch:{ all -> 0x0078 }
            r4.append(r0)     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0078 }
            goto L_0x0044
        L_0x0075:
            r4 = 0
            monitor-exit(r3)
            return r4
        L_0x0078:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9740h8.mo64190a(java.lang.String):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0070, code lost:
        return r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008c A[SYNTHETIC, Splitter:B:23:0x008c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.io.File mo64191a(int r6, java.lang.String r7, boolean r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo64195a()     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = ".json"
            java.io.File r6 = r5.mo64193a((java.lang.String) r6, (java.lang.String) r0)     // Catch:{ all -> 0x0091 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r0.<init>()     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = "DiskCache save text: "
            r0.append(r1)     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = r6.getPath()     // Catch:{ all -> 0x0091 }
            r0.append(r1)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0091 }
            com.p374my.target.C9672e0.m27882a(r0)     // Catch:{ all -> 0x0091 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0091 }
            boolean r2 = r6.exists()     // Catch:{ all -> 0x0091 }
            if (r2 == 0) goto L_0x0036
            if (r8 == 0) goto L_0x0036
            long r0 = r6.lastModified()     // Catch:{ all -> 0x0091 }
        L_0x0036:
            r8 = 0
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0071 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0071 }
            r3.<init>(r6)     // Catch:{ all -> 0x0071 }
            java.lang.String r4 = "UTF-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)     // Catch:{ all -> 0x0071 }
            java.nio.charset.CharsetEncoder r4 = r4.newEncoder()     // Catch:{ all -> 0x0071 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0071 }
            r2.write(r7)     // Catch:{ all -> 0x0073 }
            r2.close()     // Catch:{ all -> 0x0073 }
            boolean r7 = r6.setLastModified(r0)     // Catch:{ all -> 0x0071 }
            if (r7 != 0) goto L_0x006f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r7.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "DiskCache: unable to set last modified to file "
            r7.append(r0)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r6.getPath()     // Catch:{ all -> 0x0071 }
            r7.append(r0)     // Catch:{ all -> 0x0071 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0071 }
            com.p374my.target.C9672e0.m27882a(r7)     // Catch:{ all -> 0x0071 }
        L_0x006f:
            monitor-exit(r5)
            return r6
        L_0x0071:
            r6 = move-exception
            goto L_0x0075
        L_0x0073:
            r6 = move-exception
            goto L_0x0076
        L_0x0075:
            r2 = r8
        L_0x0076:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r7.<init>()     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "DiskCache exception: "
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            r7.append(r6)     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0091 }
            com.p374my.target.C9672e0.m27884c(r6)     // Catch:{ all -> 0x0091 }
            if (r2 == 0) goto L_0x008f
            r2.close()     // Catch:{ all -> 0x008f }
        L_0x008f:
            monitor-exit(r5)
            return r8
        L_0x0091:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9740h8.mo64191a(int, java.lang.String, boolean):java.io.File");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        com.p374my.target.C9672e0.m27884c("DiskCache exception: " + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        if (r1 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        com.p374my.target.C9672e0.m27884c("DiskCache exception: " + r5);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x002b, B:18:0x004a, B:30:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[SYNTHETIC, Splitter:B:21:0x0060] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.io.File mo64192a(java.io.InputStream r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.mo64195a()     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = ".img"
            java.io.File r5 = r3.mo64193a((java.lang.String) r5, (java.lang.String) r0)     // Catch:{ all -> 0x0098 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r0.<init>()     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "DiskCache save image: "
            r0.append(r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = r5.getPath()     // Catch:{ all -> 0x0098 }
            r0.append(r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0098 }
            com.p374my.target.C9672e0.m27882a(r0)     // Catch:{ all -> 0x0098 }
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0048 }
            r1.<init>(r5)     // Catch:{ all -> 0x0048 }
            r3.mo64189a((java.io.InputStream) r4, (java.io.OutputStream) r1)     // Catch:{ all -> 0x0046 }
            r1.close()     // Catch:{ all -> 0x002f }
            goto L_0x0044
        L_0x002f:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r0.<init>()     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "DiskCache exception: "
            r0.append(r1)     // Catch:{ all -> 0x0098 }
            r0.append(r4)     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x0098 }
            com.p374my.target.C9672e0.m27884c(r4)     // Catch:{ all -> 0x0098 }
        L_0x0044:
            monitor-exit(r3)
            return r5
        L_0x0046:
            r4 = move-exception
            goto L_0x004a
        L_0x0048:
            r4 = move-exception
            r1 = r0
        L_0x004a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x007b }
            r5.<init>()     // Catch:{ all -> 0x007b }
            java.lang.String r2 = "DiskCache exception: "
            r5.append(r2)     // Catch:{ all -> 0x007b }
            r5.append(r4)     // Catch:{ all -> 0x007b }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x007b }
            com.p374my.target.C9672e0.m27884c(r4)     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x0079
            r1.close()     // Catch:{ all -> 0x0064 }
            goto L_0x0079
        L_0x0064:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r5.<init>()     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "DiskCache exception: "
            r5.append(r1)     // Catch:{ all -> 0x0098 }
            r5.append(r4)     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0098 }
            com.p374my.target.C9672e0.m27884c(r4)     // Catch:{ all -> 0x0098 }
        L_0x0079:
            monitor-exit(r3)
            return r0
        L_0x007b:
            r4 = move-exception
            if (r1 == 0) goto L_0x0097
            r1.close()     // Catch:{ all -> 0x0082 }
            goto L_0x0097
        L_0x0082:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r0.<init>()     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "DiskCache exception: "
            r0.append(r1)     // Catch:{ all -> 0x0098 }
            r0.append(r5)     // Catch:{ all -> 0x0098 }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x0098 }
            com.p374my.target.C9672e0.m27884c(r5)     // Catch:{ all -> 0x0098 }
        L_0x0097:
            throw r4     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9740h8.mo64192a(java.io.InputStream, java.lang.String):java.io.File");
    }

    /* renamed from: a */
    public final File mo64193a(String str, String str2) {
        return new File(this.f24017d.getAbsolutePath() + File.separator + ("mytrg_" + C9764i8.m28306c(str) + str2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b3, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r6 = "DiskCache exception: " + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0119, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011a, code lost:
        if (r7 != null) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0120, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        com.p374my.target.C9672e0.m27884c("DiskCache exception: " + r7);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:25:0x00ae, B:43:0x00ec, B:53:0x011c] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0102 A[SYNTHETIC, Splitter:B:46:0x0102] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String mo64194a(int r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo64195a()     // Catch:{ all -> 0x0138 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = ".json"
            java.io.File r6 = r5.mo64193a((java.lang.String) r6, (java.lang.String) r0)     // Catch:{ all -> 0x0138 }
            boolean r0 = r6.exists()     // Catch:{ all -> 0x0138 }
            r1 = 0
            if (r0 == 0) goto L_0x0136
            boolean r0 = r6.isFile()     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x0060
            long r2 = r6.lastModified()     // Catch:{ all -> 0x0138 }
            long r2 = r2 + r7
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0138 }
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x0060
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r7.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r8 = "DiskCache: remove expired file "
            r7.append(r8)     // Catch:{ all -> 0x0138 }
            java.lang.String r8 = r6.getPath()     // Catch:{ all -> 0x0138 }
            r7.append(r8)     // Catch:{ all -> 0x0138 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0138 }
            com.p374my.target.C9672e0.m27882a(r7)     // Catch:{ all -> 0x0138 }
            boolean r7 = r6.delete()     // Catch:{ all -> 0x0138 }
            if (r7 != 0) goto L_0x005e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r7.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r8 = "DiskCache: unable to delete file "
            r7.append(r8)     // Catch:{ all -> 0x0138 }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ all -> 0x0138 }
            r7.append(r6)     // Catch:{ all -> 0x0138 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0138 }
            com.p374my.target.C9672e0.m27882a(r6)     // Catch:{ all -> 0x0138 }
        L_0x005e:
            monitor-exit(r5)
            return r1
        L_0x0060:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r7.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r8 = "DiskCache get text: "
            r7.append(r8)     // Catch:{ all -> 0x0138 }
            java.lang.String r8 = r6.getPath()     // Catch:{ all -> 0x0138 }
            r7.append(r8)     // Catch:{ all -> 0x0138 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0138 }
            com.p374my.target.C9672e0.m27882a(r7)     // Catch:{ all -> 0x0138 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x00ea }
            r7.<init>(r6)     // Catch:{ all -> 0x00ea }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e8 }
            r6.<init>()     // Catch:{ all -> 0x00e8 }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "UTF-8"
            r8.<init>(r7, r0)     // Catch:{ all -> 0x00e8 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x00e8 }
            r0.<init>(r8)     // Catch:{ all -> 0x00e8 }
            r8 = 1024(0x400, float:1.435E-42)
            char[] r8 = new char[r8]     // Catch:{ all -> 0x00e8 }
        L_0x0092:
            int r2 = r0.read(r8)     // Catch:{ all -> 0x00e8 }
            r3 = -1
            if (r2 == r3) goto L_0x00a3
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x00e8 }
            r4 = 0
            r3.<init>(r8, r4, r2)     // Catch:{ all -> 0x00e8 }
            r6.append(r3)     // Catch:{ all -> 0x00e8 }
            goto L_0x0092
        L_0x00a3:
            int r8 = r6.length()     // Catch:{ all -> 0x00e8 }
            if (r8 != 0) goto L_0x00c9
            java.lang.String r6 = "DiskCache error: cache file is empty"
            com.p374my.target.C9672e0.m27882a(r6)     // Catch:{ all -> 0x00e8 }
            r7.close()     // Catch:{ all -> 0x00b3 }
            goto L_0x0136
        L_0x00b3:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r7.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r8 = "DiskCache exception: "
            r7.append(r8)     // Catch:{ all -> 0x0138 }
            r7.append(r6)     // Catch:{ all -> 0x0138 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0138 }
        L_0x00c5:
            com.p374my.target.C9672e0.m27884c(r6)     // Catch:{ all -> 0x0138 }
            goto L_0x0136
        L_0x00c9:
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00e8 }
            r7.close()     // Catch:{ all -> 0x00d1 }
            goto L_0x00e6
        L_0x00d1:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r8.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "DiskCache exception: "
            r8.append(r0)     // Catch:{ all -> 0x0138 }
            r8.append(r7)     // Catch:{ all -> 0x0138 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x0138 }
            com.p374my.target.C9672e0.m27884c(r7)     // Catch:{ all -> 0x0138 }
        L_0x00e6:
            monitor-exit(r5)
            return r6
        L_0x00e8:
            r6 = move-exception
            goto L_0x00ec
        L_0x00ea:
            r6 = move-exception
            r7 = r1
        L_0x00ec:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            r8.<init>()     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = "DiskCache exception: "
            r8.append(r0)     // Catch:{ all -> 0x0119 }
            r8.append(r6)     // Catch:{ all -> 0x0119 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0119 }
            com.p374my.target.C9672e0.m27884c(r6)     // Catch:{ all -> 0x0119 }
            if (r7 == 0) goto L_0x0136
            r7.close()     // Catch:{ all -> 0x0106 }
            goto L_0x0136
        L_0x0106:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r7.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r8 = "DiskCache exception: "
            r7.append(r8)     // Catch:{ all -> 0x0138 }
            r7.append(r6)     // Catch:{ all -> 0x0138 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0138 }
            goto L_0x00c5
        L_0x0119:
            r6 = move-exception
            if (r7 == 0) goto L_0x0135
            r7.close()     // Catch:{ all -> 0x0120 }
            goto L_0x0135
        L_0x0120:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r8.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "DiskCache exception: "
            r8.append(r0)     // Catch:{ all -> 0x0138 }
            r8.append(r7)     // Catch:{ all -> 0x0138 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x0138 }
            com.p374my.target.C9672e0.m27884c(r7)     // Catch:{ all -> 0x0138 }
        L_0x0135:
            throw r6     // Catch:{ all -> 0x0138 }
        L_0x0136:
            monitor-exit(r5)
            return r1
        L_0x0138:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9740h8.mo64194a(int, long):java.lang.String");
    }

    /* renamed from: a */
    public synchronized void mo64195a() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (this.f24017d.lastModified() + 604800000 < currentTimeMillis) {
                File[] listFiles = this.f24017d.listFiles(f24014a);
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file.isFile() && file.lastModified() + 604800000 < currentTimeMillis) {
                            C9672e0.m27882a("DiskCache: remove expired file " + file.getPath());
                            if (!file.delete()) {
                                C9672e0.m27882a("DiskCache: unable to delete file " + file.getAbsolutePath());
                            }
                        }
                    }
                }
                if (!this.f24017d.setLastModified(currentTimeMillis)) {
                    C9672e0.m27882a("DiskCache: unable to set last modified to dir " + this.f24017d.getAbsolutePath());
                }
            }
            File[] listFiles2 = this.f24017d.listFiles(f24015b);
            if (listFiles2 != null && listFiles2.length > 10) {
                Arrays.sort(listFiles2, $$Lambda$d7v3j7XBshhqSN5SzMHtC3zqH3Q.INSTANCE);
                for (int length = listFiles2.length - 1; length >= 10; length--) {
                    String path = listFiles2[length].getPath();
                    C9672e0.m27882a("DiskCache: remove redundant video " + path);
                    if (!listFiles2[length].delete()) {
                        C9672e0.m27882a("DiskCache: unable to remove file " + path);
                    }
                }
            }
        } catch (Throwable th) {
            C9672e0.m27884c("DiskCache exception: " + th);
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        com.p374my.target.C9672e0.m27884c("DiskCache exception: " + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        if (r1 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        com.p374my.target.C9672e0.m27884c("DiskCache exception: " + r5);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:8:0x002b, B:18:0x004a, B:30:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[SYNTHETIC, Splitter:B:21:0x0060] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.io.File mo64196b(java.io.InputStream r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.mo64195a()     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = ".mp4"
            java.io.File r5 = r3.mo64193a((java.lang.String) r5, (java.lang.String) r0)     // Catch:{ all -> 0x0098 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r0.<init>()     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "DiskCache save video: "
            r0.append(r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = r5.getPath()     // Catch:{ all -> 0x0098 }
            r0.append(r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0098 }
            com.p374my.target.C9672e0.m27882a(r0)     // Catch:{ all -> 0x0098 }
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0048 }
            r1.<init>(r5)     // Catch:{ all -> 0x0048 }
            r3.mo64189a((java.io.InputStream) r4, (java.io.OutputStream) r1)     // Catch:{ all -> 0x0046 }
            r1.close()     // Catch:{ all -> 0x002f }
            goto L_0x0044
        L_0x002f:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r0.<init>()     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "DiskCache exception: "
            r0.append(r1)     // Catch:{ all -> 0x0098 }
            r0.append(r4)     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x0098 }
            com.p374my.target.C9672e0.m27884c(r4)     // Catch:{ all -> 0x0098 }
        L_0x0044:
            monitor-exit(r3)
            return r5
        L_0x0046:
            r4 = move-exception
            goto L_0x004a
        L_0x0048:
            r4 = move-exception
            r1 = r0
        L_0x004a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x007b }
            r5.<init>()     // Catch:{ all -> 0x007b }
            java.lang.String r2 = "DiskCache exception: "
            r5.append(r2)     // Catch:{ all -> 0x007b }
            r5.append(r4)     // Catch:{ all -> 0x007b }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x007b }
            com.p374my.target.C9672e0.m27884c(r4)     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x0079
            r1.close()     // Catch:{ all -> 0x0064 }
            goto L_0x0079
        L_0x0064:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r5.<init>()     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "DiskCache exception: "
            r5.append(r1)     // Catch:{ all -> 0x0098 }
            r5.append(r4)     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0098 }
            com.p374my.target.C9672e0.m27884c(r4)     // Catch:{ all -> 0x0098 }
        L_0x0079:
            monitor-exit(r3)
            return r0
        L_0x007b:
            r4 = move-exception
            if (r1 == 0) goto L_0x0097
            r1.close()     // Catch:{ all -> 0x0082 }
            goto L_0x0097
        L_0x0082:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r0.<init>()     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "DiskCache exception: "
            r0.append(r1)     // Catch:{ all -> 0x0098 }
            r0.append(r5)     // Catch:{ all -> 0x0098 }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x0098 }
            com.p374my.target.C9672e0.m27884c(r5)     // Catch:{ all -> 0x0098 }
        L_0x0097:
            throw r4     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9740h8.mo64196b(java.io.InputStream, java.lang.String):java.io.File");
    }

    /* renamed from: b */
    public String mo64197b(String str) {
        return mo64198b(str, ".img");
    }

    /* renamed from: b */
    public final synchronized String mo64198b(String str, String str2) {
        mo64195a();
        File a = mo64193a(str, str2);
        if (a.exists()) {
            C9672e0.m27882a("DiskCache get path: " + a.getPath());
            try {
                return a.getAbsolutePath();
            } catch (Throwable th) {
                C9672e0.m27884c("DiskCache exception: " + th);
            }
        }
        return null;
    }

    /* renamed from: c */
    public String mo64199c(String str) {
        return mo64198b(str, ".mp4");
    }
}
