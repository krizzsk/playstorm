package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzadt implements zzadr {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzadt(long j, int i, long j2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = j3;
        this.zze = j3 != -1 ? j + j3 : -1;
    }

    public static zzadt zza(long j, long j2, zzzl zzzl, zzdy zzdy) {
        int zzn;
        long j3 = j;
        zzzl zzzl2 = zzzl;
        int i = zzzl2.zzg;
        int i2 = zzzl2.zzd;
        int zze2 = zzdy.zze();
        if ((zze2 & 1) != 1 || (zzn = zzdy.zzn()) == 0) {
            return null;
        }
        long zzw = zzeg.zzw((long) zzn, ((long) i) * 1000000, (long) i2);
        if ((zze2 & 6) != 6) {
            return new zzadt(j2, zzzl2.zzc, zzw, -1, (long[]) null);
        }
        long zzs = zzdy.zzs();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = (long) zzdy.zzk();
        }
        if (j3 != -1) {
            long j4 = j2 + zzs;
            if (j3 != j4) {
                Log.w("XingSeeker", "XING data size mismatch: " + j3 + ", " + j4);
            }
        }
        return new zzadt(j2, zzzl2.zzc, zzw, zzs, jArr);
    }

    private final long zzd(int i) {
        return (this.zzc * ((long) i)) / 100;
    }

    public final long zzb() {
        return this.zze;
    }

    public final long zzc(long j) {
        long j2;
        long j3 = j - this.zza;
        if (!zzh() || j3 <= ((long) this.zzb)) {
            return 0;
        }
        long[] jArr = (long[]) zzcw.zzb(this.zzf);
        double d = (((double) j3) * 256.0d) / ((double) this.zzd);
        int zzd2 = zzeg.zzd(jArr, (long) d, true, true);
        long zzd3 = zzd(zzd2);
        long j4 = jArr[zzd2];
        int i = zzd2 + 1;
        long zzd4 = zzd(i);
        if (zzd2 == 99) {
            j2 = 256;
        } else {
            j2 = jArr[i];
        }
        return zzd3 + Math.round((j4 == j2 ? 0.0d : (d - ((double) j4)) / ((double) (j2 - j4))) * ((double) (zzd4 - zzd3)));
    }

    public final long zze() {
        return this.zzc;
    }

    public final zzzt zzg(long j) {
        double d;
        if (!zzh()) {
            zzzw zzzw = new zzzw(0, this.zza + ((long) this.zzb));
            return new zzzt(zzzw, zzzw);
        }
        long zzr = zzeg.zzr(j, 0, this.zzc);
        double d2 = (((double) zzr) * 100.0d) / ((double) this.zzc);
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = (long[]) zzcw.zzb(this.zzf);
                double d4 = (double) jArr[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = (double) jArr[i + 1];
                }
                d3 = d4 + ((d2 - ((double) i)) * (d - d4));
            }
        }
        zzzw zzzw2 = new zzzw(zzr, this.zza + zzeg.zzr(Math.round((d3 / 256.0d) * ((double) this.zzd)), (long) this.zzb, this.zzd - 1));
        return new zzzt(zzzw2, zzzw2);
    }

    public final boolean zzh() {
        return this.zzf != null;
    }
}
