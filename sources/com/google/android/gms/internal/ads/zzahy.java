package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzahy implements zzzv {
    private final zzahv zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzahy(zzahv zzahv, int i, long j, long j2) {
        this.zza = zzahv;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / ((long) zzahv.zzd);
        this.zzd = j3;
        this.zze = zza(j3);
    }

    private final long zza(long j) {
        return zzeg.zzw(j * ((long) this.zzb), 1000000, (long) this.zza.zzc);
    }

    public final long zze() {
        return this.zze;
    }

    public final zzzt zzg(long j) {
        long zzr = zzeg.zzr((((long) this.zza.zzc) * j) / (((long) this.zzb) * 1000000), 0, this.zzd - 1);
        long j2 = this.zzc;
        int i = this.zza.zzd;
        long zza2 = zza(zzr);
        zzzw zzzw = new zzzw(zza2, j2 + (((long) i) * zzr));
        if (zza2 >= j || zzr == this.zzd - 1) {
            return new zzzt(zzzw, zzzw);
        }
        long j3 = zzr + 1;
        return new zzzt(zzzw, new zzzw(zza(j3), this.zzc + (j3 * ((long) this.zza.zzd))));
    }

    public final boolean zzh() {
        return true;
    }
}
