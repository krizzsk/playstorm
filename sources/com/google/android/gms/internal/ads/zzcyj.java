package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcyj implements zzfuw {
    final /* synthetic */ zzfuw zza;
    final /* synthetic */ zzcyk zzb;

    zzcyj(zzcyk zzcyk, zzfuw zzfuw) {
        this.zzb = zzcyk;
        this.zza = zzfuw;
    }

    public final void zza(Throwable th) {
        zzcfv.zze.execute(new zzcyh(this.zzb));
        this.zza.zza(th);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcfv.zze.execute(new zzcyh(this.zzb));
        this.zza.zzb((zzcxw) obj);
    }
}
