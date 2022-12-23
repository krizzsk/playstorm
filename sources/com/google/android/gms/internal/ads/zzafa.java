package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzafa implements zzafg {
    private final zzzf zza;
    private final zzze zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzafa(zzzf zzzf, zzze zzze) {
        this.zza = zzzf;
        this.zzb = zzze;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    public final long zzd(zzyt zzyt) {
        long j = this.zzd;
        if (j < 0) {
            return -1;
        }
        this.zzd = -1;
        return -(j + 2);
    }

    public final zzzv zze() {
        zzcw.zzf(this.zzc != -1);
        return new zzzd(this.zza, this.zzc);
    }

    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzeg.zzd(jArr, j, true, true)];
    }
}
