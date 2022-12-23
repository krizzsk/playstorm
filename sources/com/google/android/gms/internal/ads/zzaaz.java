package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzaaz implements zzzv {
    final /* synthetic */ zzzv zza;
    final /* synthetic */ zzaba zzb;

    zzaaz(zzaba zzaba, zzzv zzzv) {
        this.zzb = zzaba;
        this.zza = zzzv;
    }

    public final long zze() {
        return this.zza.zze();
    }

    public final zzzt zzg(long j) {
        zzzt zzg = this.zza.zzg(j);
        zzzw zzzw = zzg.zza;
        zzzw zzzw2 = new zzzw(zzzw.zzb, zzzw.zzc + this.zzb.zzb);
        zzzw zzzw3 = zzg.zzb;
        return new zzzt(zzzw2, new zzzw(zzzw3.zzb, zzzw3.zzc + this.zzb.zzb));
    }

    public final boolean zzh() {
        return this.zza.zzh();
    }
}
