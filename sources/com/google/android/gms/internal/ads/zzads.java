package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzads implements zzadr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzads(long[] jArr, long[] jArr2, long j, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzads zza(long j, long j2, zzzl zzzl, zzdy zzdy) {
        int i;
        long j3 = j;
        zzzl zzzl2 = zzzl;
        zzdy zzdy2 = zzdy;
        zzdy2.zzG(10);
        int zze = zzdy.zze();
        if (zze <= 0) {
            return null;
        }
        int i2 = zzzl2.zzd;
        long zzw = zzeg.zzw((long) zze, ((long) (i2 >= 32000 ? 1152 : 576)) * 1000000, (long) i2);
        int zzo = zzdy.zzo();
        int zzo2 = zzdy.zzo();
        int zzo3 = zzdy.zzo();
        zzdy2.zzG(2);
        long j4 = j2 + ((long) zzzl2.zzc);
        long[] jArr = new long[zzo];
        long[] jArr2 = new long[zzo];
        int i3 = 0;
        long j5 = j2;
        while (i3 < zzo) {
            int i4 = zzo2;
            jArr[i3] = (((long) i3) * zzw) / ((long) zzo);
            long j6 = j4;
            jArr2[i3] = Math.max(j5, j6);
            if (zzo3 == 1) {
                i = zzdy.zzk();
            } else if (zzo3 == 2) {
                i = zzdy.zzo();
            } else if (zzo3 == 3) {
                i = zzdy.zzm();
            } else if (zzo3 != 4) {
                return null;
            } else {
                i = zzdy.zzn();
            }
            j5 += (long) (i * i4);
            i3++;
            j4 = j6;
            zzo2 = i4;
        }
        if (!(j3 == -1 || j3 == j5)) {
            Log.w("VbriSeeker", "VBRI data size mismatch: " + j3 + ", " + j5);
        }
        return new zzads(jArr, jArr2, zzw, j5);
    }

    public final long zzb() {
        return this.zzd;
    }

    public final long zzc(long j) {
        return this.zza[zzeg.zzd(this.zzb, j, true, true)];
    }

    public final long zze() {
        return this.zzc;
    }

    public final zzzt zzg(long j) {
        int zzd2 = zzeg.zzd(this.zza, j, true, true);
        zzzw zzzw = new zzzw(this.zza[zzd2], this.zzb[zzd2]);
        if (zzzw.zzb < j) {
            long[] jArr = this.zza;
            if (zzd2 != jArr.length - 1) {
                int i = zzd2 + 1;
                return new zzzt(zzzw, new zzzw(jArr[i], this.zzb[i]));
            }
        }
        return new zzzt(zzzw, zzzw);
    }

    public final boolean zzh() {
        return true;
    }
}
