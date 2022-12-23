package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeo extends zzek {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzeo(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    public final int zza(byte[] bArr, int i, int i2) throws zzen {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new zzen(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        int i3 = zzeg.zza;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.zze;
        if (j2 != -1) {
            this.zze = j2 - ((long) read);
        }
        zzg(read);
        return read;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f1, code lost:
        r3 = 2000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fb, code lost:
        r3 = 2005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0101, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0102, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0101 A[ExcHandler: zzen (r0v1 'e' com.google.android.gms.internal.ads.zzen A[CUSTOM_DECLARE]), Splitter:B:1:0x0003] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzb(com.google.android.gms.internal.ads.zzew r16) throws com.google.android.gms.internal.ads.zzen {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            android.net.Uri r4 = r0.zza     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            r1.zzb = r4     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            r15.zzi(r16)     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            java.lang.String r5 = "content"
            android.net.Uri r6 = r0.zza     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            java.lang.String r6 = r6.getScheme()     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            boolean r5 = r5.equals(r6)     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            if (r5 == 0) goto L_0x002f
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            r5.<init>()     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            int r6 = com.google.android.gms.internal.ads.zzeg.zza     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            r7 = 31
            if (r6 < r7) goto L_0x0026
            com.google.android.gms.internal.ads.zzem.zza(r5)     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
        L_0x0026:
            android.content.ContentResolver r6 = r1.zza     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            java.lang.String r7 = "*/*"
            android.content.res.AssetFileDescriptor r5 = r6.openTypedAssetFileDescriptor(r4, r7, r5)     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            goto L_0x0037
        L_0x002f:
            android.content.ContentResolver r5 = r1.zza     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            java.lang.String r6 = "r"
            android.content.res.AssetFileDescriptor r5 = r5.openAssetFileDescriptor(r4, r6)     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
        L_0x0037:
            r1.zzc = r5     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            if (r5 == 0) goto L_0x00cc
            long r6 = r5.getLength()     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            java.io.FileDescriptor r8 = r5.getFileDescriptor()     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            r4.<init>(r8)     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            r1.zzd = r4     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r11 = 2008(0x7d8, float:2.814E-42)
            r12 = 0
            if (r10 == 0) goto L_0x0060
            long r13 = r0.zzf     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 > 0) goto L_0x005a
            goto L_0x0060
        L_0x005a:
            com.google.android.gms.internal.ads.zzen r0 = new com.google.android.gms.internal.ads.zzen     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            r0.<init>(r12, r11)     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            throw r0     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
        L_0x0060:
            long r13 = r5.getStartOffset()     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            long r2 = r0.zzf     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            long r2 = r2 + r13
            long r2 = r4.skip(r2)     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            long r2 = r2 - r13
            long r13 = r0.zzf     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            int r13 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x00c6
            r13 = 0
            if (r10 != 0) goto L_0x0098
            java.nio.channels.FileChannel r2 = r4.getChannel()     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            long r3 = r2.size()     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0086
            r1.zze = r8     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            r3 = r8
            goto L_0x00a0
        L_0x0086:
            long r6 = r2.position()     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            long r3 = r3 - r6
            r1.zze = r3     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x0092
            goto L_0x00a0
        L_0x0092:
            com.google.android.gms.internal.ads.zzen r0 = new com.google.android.gms.internal.ads.zzen     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            r0.<init>(r12, r11)     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            throw r0     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
        L_0x0098:
            long r3 = r6 - r2
            r1.zze = r3     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x00c0
        L_0x00a0:
            long r5 = r0.zzg
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x00b0
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x00ae
            long r5 = java.lang.Math.min(r3, r5)
        L_0x00ae:
            r1.zze = r5
        L_0x00b0:
            r2 = 1
            r1.zzf = r2
            r15.zzj(r16)
            long r2 = r0.zzg
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00bd
            return r2
        L_0x00bd:
            long r2 = r1.zze
            return r2
        L_0x00c0:
            com.google.android.gms.internal.ads.zzen r0 = new com.google.android.gms.internal.ads.zzen     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            r0.<init>(r12, r11)     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            throw r0     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
        L_0x00c6:
            com.google.android.gms.internal.ads.zzen r0 = new com.google.android.gms.internal.ads.zzen     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            r0.<init>(r12, r11)     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            throw r0     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
        L_0x00cc:
            com.google.android.gms.internal.ads.zzen r0 = new com.google.android.gms.internal.ads.zzen     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            r4.<init>()     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            java.lang.String r6 = "Could not open file descriptor for: "
            r4.append(r6)     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            r4.append(r3)     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            java.lang.String r3 = r4.toString()     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            r2.<init>(r3)     // Catch:{ zzen -> 0x0101, IOException -> 0x00f0 }
            r3 = 2000(0x7d0, float:2.803E-42)
            r0.<init>(r2, r3)     // Catch:{ zzen -> 0x0101, IOException -> 0x00ee }
            throw r0     // Catch:{ zzen -> 0x0101, IOException -> 0x00ee }
        L_0x00ee:
            r0 = move-exception
            goto L_0x00f3
        L_0x00f0:
            r0 = move-exception
            r3 = 2000(0x7d0, float:2.803E-42)
        L_0x00f3:
            com.google.android.gms.internal.ads.zzen r2 = new com.google.android.gms.internal.ads.zzen
            boolean r4 = r0 instanceof java.io.FileNotFoundException
            r5 = 1
            if (r5 == r4) goto L_0x00fb
            goto L_0x00fd
        L_0x00fb:
            r3 = 2005(0x7d5, float:2.81E-42)
        L_0x00fd:
            r2.<init>(r0, r3)
            throw r2
        L_0x0101:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeo.zzb(com.google.android.gms.internal.ads.zzew):long");
    }

    public final Uri zzc() {
        return this.zzb;
    }

    public final void zzd() throws zzen {
        this.zzb = null;
        try {
            FileInputStream fileInputStream = this.zzd;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.zzd = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.zzc;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
            } catch (IOException e) {
                throw new zzen(e, 2000);
            } catch (Throwable th) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new zzen(e2, 2000);
        } catch (Throwable th2) {
            this.zzd = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th2;
            } catch (IOException e3) {
                throw new zzen(e3, 2000);
            } catch (Throwable th3) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th3;
            }
        }
    }
}
