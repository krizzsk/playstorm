package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcyi implements zzfuw {
    final /* synthetic */ zzfuw zza;
    final /* synthetic */ zzcyk zzb;

    zzcyi(zzcyk zzcyk, zzfuw zzfuw) {
        this.zzb = zzcyk;
        this.zza = zzfuw;
    }

    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzcfv.zze.execute(new zzcyh(this.zzb));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcyk.zzb(this.zzb, ((zzcyd) obj).zza, this.zza);
    }
}
