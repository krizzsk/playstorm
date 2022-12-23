package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzzk implements zzzv {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzzk(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzcw.zzd(length == length2);
        boolean z = length2 > 0;
        this.zzd = z;
        if (!z || jArr2[0] <= 0) {
            this.zza = jArr;
            this.zzb = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.zza = jArr3;
            this.zzb = new long[i];
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, this.zzb, 1, length2);
        }
        this.zzc = j;
    }

    public final long zze() {
        return this.zzc;
    }

    public final zzzt zzg(long j) {
        if (!this.zzd) {
            zzzw zzzw = zzzw.zza;
            return new zzzt(zzzw, zzzw);
        }
        int zzd2 = zzeg.zzd(this.zzb, j, true, true);
        zzzw zzzw2 = new zzzw(this.zzb[zzd2], this.zza[zzd2]);
        if (zzzw2.zzb != j) {
            long[] jArr = this.zzb;
            if (zzd2 != jArr.length - 1) {
                int i = zzd2 + 1;
                return new zzzt(zzzw2, new zzzw(jArr[i], this.zza[i]));
            }
        }
        return new zzzt(zzzw2, zzzw2);
    }

    public final boolean zzh() {
        return this.zzd;
    }
}
