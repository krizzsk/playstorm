package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzzd implements zzzv {
    private final zzzf zza;
    private final long zzb;

    public zzzd(zzzf zzzf, long j) {
        this.zza = zzzf;
        this.zzb = j;
    }

    private final zzzw zza(long j, long j2) {
        return new zzzw((j * 1000000) / ((long) this.zza.zze), this.zzb + j2);
    }

    public final long zze() {
        return this.zza.zza();
    }

    public final zzzt zzg(long j) {
        long j2;
        zzcw.zzb(this.zza.zzk);
        zzzf zzzf = this.zza;
        zzze zzze = zzzf.zzk;
        long[] jArr = zzze.zza;
        long[] jArr2 = zzze.zzb;
        int zzd = zzeg.zzd(jArr, zzzf.zzb(j), true, false);
        long j3 = 0;
        if (zzd == -1) {
            j2 = 0;
        } else {
            j2 = jArr[zzd];
        }
        if (zzd != -1) {
            j3 = jArr2[zzd];
        }
        zzzw zza2 = zza(j2, j3);
        if (zza2.zzb == j || zzd == jArr.length - 1) {
            return new zzzt(zza2, zza2);
        }
        int i = zzd + 1;
        return new zzzt(zza2, zza(jArr[i], jArr2[i]));
    }

    public final boolean zzh() {
        return true;
    }
}
