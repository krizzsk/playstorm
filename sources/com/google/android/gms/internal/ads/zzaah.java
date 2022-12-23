package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.AacUtil;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaah implements zzys {
    public static final zzyz zza = zzaag.zza;
    private static final int[] zzb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzc = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] zzd = zzeg.zzZ("#!AMR\n");
    private static final byte[] zze = zzeg.zzZ("#!AMR-WB\n");
    private static final int zzf = zzc[8];
    private final byte[] zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private zzyv zzp;
    private zzzz zzq;
    private zzzv zzr;
    private boolean zzs;

    public zzaah() {
        this(0);
    }

    public zzaah(int i) {
        this.zzg = new byte[1];
        this.zzm = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039 A[Catch:{ EOFException -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e A[Catch:{ EOFException -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"trackOutput"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zze(com.google.android.gms.internal.ads.zzyt r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.zzk
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0091
            r12.zzj()     // Catch:{ EOFException -> 0x0090 }
            byte[] r0 = r11.zzg     // Catch:{ EOFException -> 0x0090 }
            r4 = r12
            com.google.android.gms.internal.ads.zzym r4 = (com.google.android.gms.internal.ads.zzym) r4     // Catch:{ EOFException -> 0x0090 }
            r4.zzm(r0, r3, r2, r3)     // Catch:{ EOFException -> 0x0090 }
            byte[] r0 = r11.zzg     // Catch:{ EOFException -> 0x0090 }
            byte r0 = r0[r3]     // Catch:{ EOFException -> 0x0090 }
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L_0x007a
            int r0 = r0 >> 3
            r0 = r0 & 15
            boolean r4 = r11.zzh     // Catch:{ EOFException -> 0x0090 }
            if (r4 == 0) goto L_0x002c
            r6 = 10
            if (r0 < r6) goto L_0x0037
            r6 = 13
            if (r0 <= r6) goto L_0x002c
            goto L_0x0037
        L_0x002c:
            if (r4 != 0) goto L_0x0055
            r6 = 12
            if (r0 < r6) goto L_0x0037
            r6 = 14
            if (r0 > r6) goto L_0x0037
            goto L_0x0055
        L_0x0037:
            if (r4 == 0) goto L_0x003e
            int[] r4 = zzc     // Catch:{ EOFException -> 0x0090 }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x0090 }
            goto L_0x0042
        L_0x003e:
            int[] r4 = zzb     // Catch:{ EOFException -> 0x0090 }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x0090 }
        L_0x0042:
            r11.zzj = r0     // Catch:{ EOFException -> 0x0090 }
            r11.zzk = r0
            int r4 = r11.zzm
            if (r4 != r1) goto L_0x004d
            r11.zzm = r0
            r4 = r0
        L_0x004d:
            if (r4 != r0) goto L_0x0091
            int r4 = r11.zzn
            int r4 = r4 + r2
            r11.zzn = r4
            goto L_0x0091
        L_0x0055:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L_0x005c
            r12 = r3
        L_0x005c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0090 }
            r2.<init>()     // Catch:{ EOFException -> 0x0090 }
            java.lang.String r3 = "Illegal AMR "
            r2.append(r3)     // Catch:{ EOFException -> 0x0090 }
            r2.append(r12)     // Catch:{ EOFException -> 0x0090 }
            java.lang.String r12 = " frame type "
            r2.append(r12)     // Catch:{ EOFException -> 0x0090 }
            r2.append(r0)     // Catch:{ EOFException -> 0x0090 }
            java.lang.String r12 = r2.toString()     // Catch:{ EOFException -> 0x0090 }
            com.google.android.gms.internal.ads.zzbp r12 = com.google.android.gms.internal.ads.zzbp.zza(r12, r5)     // Catch:{ EOFException -> 0x0090 }
            throw r12     // Catch:{ EOFException -> 0x0090 }
        L_0x007a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0090 }
            r12.<init>()     // Catch:{ EOFException -> 0x0090 }
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch:{ EOFException -> 0x0090 }
            r12.append(r0)     // Catch:{ EOFException -> 0x0090 }
            java.lang.String r12 = r12.toString()     // Catch:{ EOFException -> 0x0090 }
            com.google.android.gms.internal.ads.zzbp r12 = com.google.android.gms.internal.ads.zzbp.zza(r12, r5)     // Catch:{ EOFException -> 0x0090 }
            throw r12     // Catch:{ EOFException -> 0x0090 }
        L_0x0090:
            return r1
        L_0x0091:
            com.google.android.gms.internal.ads.zzzz r4 = r11.zzq
            int r12 = com.google.android.gms.internal.ads.zzzx.zza(r4, r12, r0, r2)
            if (r12 != r1) goto L_0x009a
            return r1
        L_0x009a:
            int r0 = r11.zzk
            int r0 = r0 - r12
            r11.zzk = r0
            if (r0 <= 0) goto L_0x00a2
            return r3
        L_0x00a2:
            com.google.android.gms.internal.ads.zzzz r4 = r11.zzq
            long r5 = r11.zzi
            r7 = 1
            int r8 = r11.zzj
            r9 = 0
            r10 = 0
            r4.zzs(r5, r7, r8, r9, r10)
            long r0 = r11.zzi
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.zzi = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaah.zze(com.google.android.gms.internal.ads.zzyt):int");
    }

    private static boolean zzf(zzyt zzyt, byte[] bArr) throws IOException {
        zzyt.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((zzym) zzyt).zzm(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzg(zzyt zzyt) throws IOException {
        if (zzf(zzyt, zzd)) {
            this.zzh = false;
            ((zzym) zzyt).zzo(zzd.length, false);
            return true;
        } else if (!zzf(zzyt, zze)) {
            return false;
        } else {
            this.zzh = true;
            ((zzym) zzyt).zzo(zze.length, false);
            return true;
        }
    }

    public final int zza(zzyt zzyt, zzzs zzzs) throws IOException {
        zzcw.zzb(this.zzq);
        int i = zzeg.zza;
        if (zzyt.zzf() != 0 || zzg(zzyt)) {
            if (!this.zzs) {
                this.zzs = true;
                boolean z = this.zzh;
                String str = true != z ? "audio/3gpp" : "audio/amr-wb";
                int i2 = true != z ? 8000 : AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
                zzzz zzzz = this.zzq;
                zzab zzab = new zzab();
                zzab.zzS(str);
                zzab.zzL(zzf);
                zzab.zzw(1);
                zzab.zzT(i2);
                zzzz.zzk(zzab.zzY());
            }
            int zze2 = zze(zzyt);
            if (this.zzl) {
                return zze2;
            }
            zzzu zzzu = new zzzu(-9223372036854775807L, 0);
            this.zzr = zzzu;
            this.zzp.zzL(zzzu);
            this.zzl = true;
            return zze2;
        }
        throw zzbp.zza("Could not find AMR header.", (Throwable) null);
    }

    public final void zzb(zzyv zzyv) {
        this.zzp = zzyv;
        this.zzq = zzyv.zzv(0, 1);
        zzyv.zzB();
    }

    public final void zzc(long j, long j2) {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 0;
        this.zzo = 0;
    }

    public final boolean zzd(zzyt zzyt) throws IOException {
        return zzg(zzyt);
    }
}
