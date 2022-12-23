package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzahu implements zzys {
    public static final zzyz zza = zzahq.zza;
    private zzyv zzb;
    private zzzz zzc;
    private int zzd = 0;
    private long zze = -1;
    private zzahs zzf;
    private int zzg = -1;
    private long zzh = -1;

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ee, code lost:
        if (r2 != 65534) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f5, code lost:
        if (r3 == 32) goto L_0x00fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzyt r20, com.google.android.gms.internal.ads.zzzs r21) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            com.google.android.gms.internal.ads.zzzz r2 = r0.zzc
            com.google.android.gms.internal.ads.zzcw.zzb(r2)
            int r2 = com.google.android.gms.internal.ads.zzeg.zza
            int r2 = r0.zzd
            r3 = -1
            r4 = 0
            r5 = 4
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x015e
            r8 = 2
            r9 = -1
            if (r2 == r6) goto L_0x0129
            r11 = 3
            if (r2 == r8) goto L_0x00a3
            if (r2 == r11) goto L_0x003d
            long r11 = r0.zzh
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r6 = r7
        L_0x0026:
            com.google.android.gms.internal.ads.zzcw.zzf(r6)
            long r5 = r0.zzh
            long r8 = r20.zzf()
            long r5 = r5 - r8
            com.google.android.gms.internal.ads.zzahs r2 = r0.zzf
            if (r2 == 0) goto L_0x003c
            boolean r1 = r2.zzc(r1, r5)
            if (r1 == 0) goto L_0x003b
            return r3
        L_0x003b:
            return r7
        L_0x003c:
            throw r4
        L_0x003d:
            android.util.Pair r2 = com.google.android.gms.internal.ads.zzahx.zza(r20)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            int r3 = r3.intValue()
            r0.zzg = r3
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r11 = r0.zze
            int r6 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0063
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r6 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r6 != 0) goto L_0x0063
            r2 = r11
        L_0x0063:
            int r6 = r0.zzg
            long r11 = (long) r6
            long r11 = r11 + r2
            r0.zzh = r11
            long r1 = r20.zzd()
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x0096
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0096
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Data exceeds input length: "
            r3.append(r6)
            r3.append(r11)
            java.lang.String r6 = ", "
            r3.append(r6)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = "WavExtractor"
            android.util.Log.w(r6, r3)
            r0.zzh = r1
            r11 = r1
        L_0x0096:
            com.google.android.gms.internal.ads.zzahs r1 = r0.zzf
            if (r1 == 0) goto L_0x00a2
            int r2 = r0.zzg
            r1.zza(r2, r11)
            r0.zzd = r5
            return r7
        L_0x00a2:
            throw r4
        L_0x00a3:
            com.google.android.gms.internal.ads.zzahv r1 = com.google.android.gms.internal.ads.zzahx.zzb(r20)
            int r2 = r1.zza
            r3 = 17
            if (r2 != r3) goto L_0x00b9
            com.google.android.gms.internal.ads.zzahr r2 = new com.google.android.gms.internal.ads.zzahr
            com.google.android.gms.internal.ads.zzyv r3 = r0.zzb
            com.google.android.gms.internal.ads.zzzz r4 = r0.zzc
            r2.<init>(r3, r4, r1)
            r0.zzf = r2
            goto L_0x0110
        L_0x00b9:
            r3 = 6
            if (r2 != r3) goto L_0x00cf
            com.google.android.gms.internal.ads.zzaht r2 = new com.google.android.gms.internal.ads.zzaht
            com.google.android.gms.internal.ads.zzyv r14 = r0.zzb
            com.google.android.gms.internal.ads.zzzz r15 = r0.zzc
            r18 = -1
            java.lang.String r17 = "audio/g711-alaw"
            r13 = r2
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18)
            r0.zzf = r2
            goto L_0x0110
        L_0x00cf:
            r3 = 7
            if (r2 != r3) goto L_0x00e5
            com.google.android.gms.internal.ads.zzaht r2 = new com.google.android.gms.internal.ads.zzaht
            com.google.android.gms.internal.ads.zzyv r14 = r0.zzb
            com.google.android.gms.internal.ads.zzzz r15 = r0.zzc
            r18 = -1
            java.lang.String r17 = "audio/g711-mlaw"
            r13 = r2
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18)
            r0.zzf = r2
            goto L_0x0110
        L_0x00e5:
            int r3 = r1.zze
            if (r2 == r6) goto L_0x00f8
            if (r2 == r11) goto L_0x00f3
            r4 = 65534(0xfffe, float:9.1833E-41)
            if (r2 == r4) goto L_0x00f8
        L_0x00f0:
            r18 = r7
            goto L_0x00fe
        L_0x00f3:
            r4 = 32
            if (r3 != r4) goto L_0x00f0
            goto L_0x00fc
        L_0x00f8:
            int r5 = com.google.android.gms.internal.ads.zzeg.zzn(r3)
        L_0x00fc:
            r18 = r5
        L_0x00fe:
            if (r18 == 0) goto L_0x0113
            com.google.android.gms.internal.ads.zzaht r2 = new com.google.android.gms.internal.ads.zzaht
            com.google.android.gms.internal.ads.zzyv r14 = r0.zzb
            com.google.android.gms.internal.ads.zzzz r15 = r0.zzc
            java.lang.String r17 = "audio/raw"
            r13 = r2
            r16 = r1
            r13.<init>(r14, r15, r16, r17, r18)
            r0.zzf = r2
        L_0x0110:
            r0.zzd = r11
            return r7
        L_0x0113:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Unsupported WAV format type: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.ads.zzbp r1 = com.google.android.gms.internal.ads.zzbp.zzc(r1)
            throw r1
        L_0x0129:
            com.google.android.gms.internal.ads.zzdy r2 = new com.google.android.gms.internal.ads.zzdy
            r3 = 8
            r2.<init>((int) r3)
            com.google.android.gms.internal.ads.zzahw r4 = com.google.android.gms.internal.ads.zzahw.zza(r1, r2)
            int r5 = r4.zza
            r6 = 1685272116(0x64733634, float:1.7945858E22)
            if (r5 == r6) goto L_0x013f
            r20.zzj()
            goto L_0x0159
        L_0x013f:
            com.google.android.gms.internal.ads.zzym r1 = (com.google.android.gms.internal.ads.zzym) r1
            r1.zzl(r3, r7)
            r2.zzF(r7)
            byte[] r5 = r2.zzH()
            r1.zzm(r5, r7, r3, r7)
            long r9 = r2.zzp()
            long r4 = r4.zzb
            int r2 = (int) r4
            int r2 = r2 + r3
            r1.zzo(r2, r7)
        L_0x0159:
            r0.zze = r9
            r0.zzd = r8
            return r7
        L_0x015e:
            long r8 = r20.zzf()
            r10 = 0
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x016a
            r2 = r6
            goto L_0x016b
        L_0x016a:
            r2 = r7
        L_0x016b:
            com.google.android.gms.internal.ads.zzcw.zzf(r2)
            int r2 = r0.zzg
            if (r2 == r3) goto L_0x017a
            com.google.android.gms.internal.ads.zzym r1 = (com.google.android.gms.internal.ads.zzym) r1
            r1.zzo(r2, r7)
            r0.zzd = r5
            goto L_0x0191
        L_0x017a:
            boolean r2 = com.google.android.gms.internal.ads.zzahx.zzc(r20)
            if (r2 == 0) goto L_0x0192
            long r2 = r20.zze()
            long r4 = r20.zzf()
            com.google.android.gms.internal.ads.zzym r1 = (com.google.android.gms.internal.ads.zzym) r1
            long r2 = r2 - r4
            int r2 = (int) r2
            r1.zzo(r2, r7)
            r0.zzd = r6
        L_0x0191:
            return r7
        L_0x0192:
            java.lang.String r1 = "Unsupported or unrecognized wav file type."
            com.google.android.gms.internal.ads.zzbp r1 = com.google.android.gms.internal.ads.zzbp.zza(r1, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahu.zza(com.google.android.gms.internal.ads.zzyt, com.google.android.gms.internal.ads.zzzs):int");
    }

    public final void zzb(zzyv zzyv) {
        this.zzb = zzyv;
        this.zzc = zzyv.zzv(0, 1);
        zzyv.zzB();
    }

    public final void zzc(long j, long j2) {
        this.zzd = j == 0 ? 0 : 4;
        zzahs zzahs = this.zzf;
        if (zzahs != null) {
            zzahs.zzb(j2);
        }
    }

    public final boolean zzd(zzyt zzyt) throws IOException {
        return zzahx.zzc(zzyt);
    }
}
