package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzajx implements zzail {
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final zzajw zzc;
    private final int zzd;

    public zzajx(zzajw zzajw, int i) {
        this.zzc = zzajw;
        this.zzd = 5242880;
    }

    static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    static long zzf(InputStream inputStream) throws IOException {
        return (((long) zzn(inputStream)) & 255) | ((((long) zzn(inputStream)) & 255) << 8) | ((((long) zzn(inputStream)) & 255) << 16) | ((((long) zzn(inputStream)) & 255) << 24) | ((((long) zzn(inputStream)) & 255) << 32) | ((((long) zzn(inputStream)) & 255) << 40) | ((((long) zzn(inputStream)) & 255) << 48) | ((255 & ((long) zzn(inputStream))) << 56);
    }

    static String zzh(zzajv zzajv) throws IOException {
        return new String(zzm(zzajv, zzf(zzajv)), "UTF-8");
    }

    static void zzj(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static void zzk(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, (long) length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] zzm(zzajv zzajv, long j) throws IOException {
        long zza2 = zzajv.zza();
        if (j >= 0 && j <= zza2) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzajv).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + zza2);
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzaju zzaju) {
        if (!this.zza.containsKey(str)) {
            this.zzb += zzaju.zza;
        } else {
            this.zzb += zzaju.zza - ((zzaju) this.zza.get(str)).zza;
        }
        this.zza.put(str, zzaju);
    }

    private final void zzp(String str) {
        zzaju zzaju = (zzaju) this.zza.remove(str);
        if (zzaju != null) {
            this.zzb -= zzaju.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public final synchronized zzaik zza(String str) {
        zzajv zzajv;
        zzaju zzaju = (zzaju) this.zza.get(str);
        if (zzaju == null) {
            return null;
        }
        File zzg = zzg(str);
        try {
            zzajv = new zzajv(new BufferedInputStream(new FileInputStream(zzg)), zzg.length());
            zzaju zza2 = zzaju.zza(zzajv);
            if (!TextUtils.equals(str, zza2.zzb)) {
                zzajn.zza("%s: key=%s, found=%s", zzg.getAbsolutePath(), str, zza2.zzb);
                zzp(str);
                zzajv.close();
                return null;
            }
            byte[] zzm = zzm(zzajv, zzajv.zza());
            zzaik zzaik = new zzaik();
            zzaik.zza = zzm;
            zzaik.zzb = zzaju.zzc;
            zzaik.zzc = zzaju.zzd;
            zzaik.zzd = zzaju.zze;
            zzaik.zze = zzaju.zzf;
            zzaik.zzf = zzaju.zzg;
            List<zzait> list = zzaju.zzh;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (zzait zzait : list) {
                treeMap.put(zzait.zza(), zzait.zzb());
            }
            zzaik.zzg = treeMap;
            zzaik.zzh = Collections.unmodifiableList(zzaju.zzh);
            zzajv.close();
            return zzaik;
        } catch (IOException e) {
            zzajn.zza("%s: %s", zzg.getAbsolutePath(), e.toString());
            zzi(str);
            return null;
        } catch (Throwable th) {
            zzajv.close();
            throw th;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x005a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzb() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzajw r0 = r9.zzc     // Catch:{ all -> 0x0062 }
            java.io.File r0 = r0.zza()     // Catch:{ all -> 0x0062 }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0062 }
            r2 = 0
            if (r1 != 0) goto L_0x0026
            boolean r1 = r0.mkdirs()     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0024
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0062 }
            r1[r2] = r0     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "Unable to create cache dir %s"
            com.google.android.gms.internal.ads.zzajn.zzb(r0, r1)     // Catch:{ all -> 0x0062 }
            monitor-exit(r9)
            return
        L_0x0024:
            monitor-exit(r9)
            return
        L_0x0026:
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r9)
            return
        L_0x002e:
            int r1 = r0.length     // Catch:{ all -> 0x0062 }
        L_0x002f:
            if (r2 >= r1) goto L_0x0060
            r3 = r0[r2]     // Catch:{ all -> 0x0062 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x005a }
            com.google.android.gms.internal.ads.zzajv r6 = new com.google.android.gms.internal.ads.zzajv     // Catch:{ IOException -> 0x005a }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x005a }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x005a }
            r8.<init>(r3)     // Catch:{ IOException -> 0x005a }
            r7.<init>(r8)     // Catch:{ IOException -> 0x005a }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x005a }
            com.google.android.gms.internal.ads.zzaju r7 = com.google.android.gms.internal.ads.zzaju.zza(r6)     // Catch:{ all -> 0x0055 }
            r7.zza = r4     // Catch:{ all -> 0x0055 }
            java.lang.String r4 = r7.zzb     // Catch:{ all -> 0x0055 }
            r9.zzo(r4, r7)     // Catch:{ all -> 0x0055 }
            r6.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005d
        L_0x0055:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x005a }
            throw r4     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            r3.delete()     // Catch:{ all -> 0x0062 }
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0060:
            monitor-exit(r9)
            return
        L_0x0062:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajx.zzb():void");
    }

    public final synchronized void zzc(String str, boolean z) {
        zzaik zza2 = zza(str);
        if (zza2 != null) {
            zza2.zzf = 0;
            zza2.zze = 0;
            zzd(str, zza2);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0163 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzd(java.lang.String r16, com.google.android.gms.internal.ads.zzaik r17) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r2 = r17
            monitor-enter(r15)
            long r3 = r1.zzb     // Catch:{ all -> 0x019a }
            byte[] r5 = r2.zza     // Catch:{ all -> 0x019a }
            int r5 = r5.length     // Catch:{ all -> 0x019a }
            int r6 = r1.zzd     // Catch:{ all -> 0x019a }
            long r7 = (long) r5
            long r3 = r3 + r7
            long r7 = (long) r6
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r4 = 1063675494(0x3f666666, float:0.9)
            if (r3 <= 0) goto L_0x0021
            float r3 = (float) r5
            float r5 = (float) r6
            float r5 = r5 * r4
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            monitor-exit(r15)
            return
        L_0x0021:
            java.io.File r3 = r15.zzg(r16)     // Catch:{ all -> 0x019a }
            r6 = 0
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0163 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0163 }
            r8.<init>(r3)     // Catch:{ IOException -> 0x0163 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0163 }
            com.google.android.gms.internal.ads.zzaju r8 = new com.google.android.gms.internal.ads.zzaju     // Catch:{ IOException -> 0x0163 }
            r8.<init>(r0, r2)     // Catch:{ IOException -> 0x0163 }
            r9 = 538247942(0x20150306, float:1.2621791E-19)
            zzj(r7, r9)     // Catch:{ IOException -> 0x013d }
            java.lang.String r9 = r8.zzb     // Catch:{ IOException -> 0x013d }
            zzl(r7, r9)     // Catch:{ IOException -> 0x013d }
            java.lang.String r9 = r8.zzc     // Catch:{ IOException -> 0x013d }
            if (r9 != 0) goto L_0x0046
            java.lang.String r9 = ""
        L_0x0046:
            zzl(r7, r9)     // Catch:{ IOException -> 0x013d }
            long r9 = r8.zzd     // Catch:{ IOException -> 0x013d }
            zzk(r7, r9)     // Catch:{ IOException -> 0x013d }
            long r9 = r8.zze     // Catch:{ IOException -> 0x013d }
            zzk(r7, r9)     // Catch:{ IOException -> 0x013d }
            long r9 = r8.zzf     // Catch:{ IOException -> 0x013d }
            zzk(r7, r9)     // Catch:{ IOException -> 0x013d }
            long r9 = r8.zzg     // Catch:{ IOException -> 0x013d }
            zzk(r7, r9)     // Catch:{ IOException -> 0x013d }
            java.util.List r9 = r8.zzh     // Catch:{ IOException -> 0x013d }
            if (r9 == 0) goto L_0x0087
            int r10 = r9.size()     // Catch:{ IOException -> 0x013d }
            zzj(r7, r10)     // Catch:{ IOException -> 0x013d }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ IOException -> 0x013d }
        L_0x006c:
            boolean r10 = r9.hasNext()     // Catch:{ IOException -> 0x013d }
            if (r10 == 0) goto L_0x008a
            java.lang.Object r10 = r9.next()     // Catch:{ IOException -> 0x013d }
            com.google.android.gms.internal.ads.zzait r10 = (com.google.android.gms.internal.ads.zzait) r10     // Catch:{ IOException -> 0x013d }
            java.lang.String r11 = r10.zza()     // Catch:{ IOException -> 0x013d }
            zzl(r7, r11)     // Catch:{ IOException -> 0x013d }
            java.lang.String r10 = r10.zzb()     // Catch:{ IOException -> 0x013d }
            zzl(r7, r10)     // Catch:{ IOException -> 0x013d }
            goto L_0x006c
        L_0x0087:
            zzj(r7, r6)     // Catch:{ IOException -> 0x013d }
        L_0x008a:
            r7.flush()     // Catch:{ IOException -> 0x013d }
            byte[] r2 = r2.zza     // Catch:{ IOException -> 0x0163 }
            r7.write(r2)     // Catch:{ IOException -> 0x0163 }
            r7.close()     // Catch:{ IOException -> 0x0163 }
            long r9 = r3.length()     // Catch:{ IOException -> 0x0163 }
            r8.zza = r9     // Catch:{ IOException -> 0x0163 }
            r15.zzo(r0, r8)     // Catch:{ IOException -> 0x0163 }
            long r7 = r1.zzb     // Catch:{ IOException -> 0x0163 }
            int r0 = r1.zzd     // Catch:{ IOException -> 0x0163 }
            long r9 = (long) r0     // Catch:{ IOException -> 0x0163 }
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a9
            goto L_0x0198
        L_0x00a9:
            boolean r0 = com.google.android.gms.internal.ads.zzajn.zzb     // Catch:{ IOException -> 0x0163 }
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = "Pruning old cache entries."
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x0163 }
            com.google.android.gms.internal.ads.zzajn.zzd(r0, r2)     // Catch:{ IOException -> 0x0163 }
        L_0x00b4:
            long r7 = r1.zzb     // Catch:{ IOException -> 0x0163 }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0163 }
            java.util.Map r0 = r1.zza     // Catch:{ IOException -> 0x0163 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x0163 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x0163 }
            r2 = r6
        L_0x00c5:
            boolean r11 = r0.hasNext()     // Catch:{ IOException -> 0x0163 }
            r12 = 2
            if (r11 == 0) goto L_0x0114
            java.lang.Object r11 = r0.next()     // Catch:{ IOException -> 0x0163 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ IOException -> 0x0163 }
            java.lang.Object r11 = r11.getValue()     // Catch:{ IOException -> 0x0163 }
            com.google.android.gms.internal.ads.zzaju r11 = (com.google.android.gms.internal.ads.zzaju) r11     // Catch:{ IOException -> 0x0163 }
            java.lang.String r13 = r11.zzb     // Catch:{ IOException -> 0x0163 }
            java.io.File r13 = r15.zzg(r13)     // Catch:{ IOException -> 0x0163 }
            boolean r13 = r13.delete()     // Catch:{ IOException -> 0x0163 }
            if (r13 == 0) goto L_0x00ec
            long r13 = r1.zzb     // Catch:{ IOException -> 0x0163 }
            long r4 = r11.zza     // Catch:{ IOException -> 0x0163 }
            long r13 = r13 - r4
            r1.zzb = r13     // Catch:{ IOException -> 0x0163 }
            goto L_0x00fe
        L_0x00ec:
            java.lang.String r4 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x0163 }
            java.lang.String r11 = r11.zzb     // Catch:{ IOException -> 0x0163 }
            r5[r6] = r11     // Catch:{ IOException -> 0x0163 }
            java.lang.String r11 = zzq(r11)     // Catch:{ IOException -> 0x0163 }
            r13 = 1
            r5[r13] = r11     // Catch:{ IOException -> 0x0163 }
            com.google.android.gms.internal.ads.zzajn.zza(r4, r5)     // Catch:{ IOException -> 0x0163 }
        L_0x00fe:
            r0.remove()     // Catch:{ IOException -> 0x0163 }
            int r2 = r2 + 1
            long r4 = r1.zzb     // Catch:{ IOException -> 0x0163 }
            float r4 = (float) r4     // Catch:{ IOException -> 0x0163 }
            int r5 = r1.zzd     // Catch:{ IOException -> 0x0163 }
            float r5 = (float) r5     // Catch:{ IOException -> 0x0163 }
            r11 = 1063675494(0x3f666666, float:0.9)
            float r5 = r5 * r11
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r4 = r11
            goto L_0x00c5
        L_0x0114:
            boolean r0 = com.google.android.gms.internal.ads.zzajn.zzb     // Catch:{ IOException -> 0x0163 }
            if (r0 == 0) goto L_0x0198
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x0163 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0163 }
            r0[r6] = r2     // Catch:{ IOException -> 0x0163 }
            long r4 = r1.zzb     // Catch:{ IOException -> 0x0163 }
            long r4 = r4 - r7
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0163 }
            r4 = 1
            r0[r4] = r2     // Catch:{ IOException -> 0x0163 }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0163 }
            long r4 = r4 - r9
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x0163 }
            r0[r12] = r2     // Catch:{ IOException -> 0x0163 }
            java.lang.String r2 = "pruned %d files, %d bytes, %d ms"
            com.google.android.gms.internal.ads.zzajn.zzd(r2, r0)     // Catch:{ IOException -> 0x0163 }
            monitor-exit(r15)
            return
        L_0x013d:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0163 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0163 }
            r4[r6] = r0     // Catch:{ IOException -> 0x0163 }
            java.lang.String r0 = "%s"
            com.google.android.gms.internal.ads.zzajn.zza(r0, r4)     // Catch:{ IOException -> 0x0163 }
            r7.close()     // Catch:{ IOException -> 0x0163 }
            java.lang.String r0 = "Failed to write header for %s"
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0163 }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x0163 }
            r4[r6] = r2     // Catch:{ IOException -> 0x0163 }
            com.google.android.gms.internal.ads.zzajn.zza(r0, r4)     // Catch:{ IOException -> 0x0163 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0163 }
            r0.<init>()     // Catch:{ IOException -> 0x0163 }
            throw r0     // Catch:{ IOException -> 0x0163 }
        L_0x0163:
            boolean r0 = r3.delete()     // Catch:{ all -> 0x019a }
            if (r0 != 0) goto L_0x0177
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x019a }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ all -> 0x019a }
            r0[r6] = r2     // Catch:{ all -> 0x019a }
            java.lang.String r2 = "Could not clean up file %s"
            com.google.android.gms.internal.ads.zzajn.zza(r2, r0)     // Catch:{ all -> 0x019a }
        L_0x0177:
            com.google.android.gms.internal.ads.zzajw r0 = r1.zzc     // Catch:{ all -> 0x019a }
            java.io.File r0 = r0.zza()     // Catch:{ all -> 0x019a }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x019a }
            if (r0 != 0) goto L_0x0198
            java.lang.String r0 = "Re-initializing cache after external clearing."
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ all -> 0x019a }
            com.google.android.gms.internal.ads.zzajn.zza(r0, r2)     // Catch:{ all -> 0x019a }
            java.util.Map r0 = r1.zza     // Catch:{ all -> 0x019a }
            r0.clear()     // Catch:{ all -> 0x019a }
            r2 = 0
            r1.zzb = r2     // Catch:{ all -> 0x019a }
            r15.zzb()     // Catch:{ all -> 0x019a }
            monitor-exit(r15)
            return
        L_0x0198:
            monitor-exit(r15)
            return
        L_0x019a:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajx.zzd(java.lang.String, com.google.android.gms.internal.ads.zzaik):void");
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean delete = zzg(str).delete();
        zzp(str);
        if (!delete) {
            zzajn.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
        }
    }

    public zzajx(File file, int i) {
        this.zzc = new zzajt(this, file);
        this.zzd = 20971520;
    }
}
