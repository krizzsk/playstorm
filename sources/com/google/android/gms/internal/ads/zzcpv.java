package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcpv implements zzdxh {
    private final Long zza;
    private final String zzb;
    private final zzcrb zzc;
    private final zzcpz zzd;
    private final zzcpv zze = this;

    /* synthetic */ zzcpv(zzcrb zzcrb, zzcpz zzcpz, Long l, String str, zzcpu zzcpu) {
        this.zzc = zzcrb;
        this.zzd = zzcpz;
        this.zza = l;
        this.zzb = str;
    }

    public final zzdxr zza() {
        long longValue = this.zza.longValue();
        zzcpz zzcpz = this.zzd;
        return zzdxs.zza(longValue, zzcpz.zza, zzdxl.zzc(zzcpz.zzb), this.zzc, this.zzb);
    }

    public final zzdxv zzb() {
        long longValue = this.zza.longValue();
        zzcpz zzcpz = this.zzd;
        return zzdxw.zza(longValue, zzcpz.zza, zzdxl.zzc(zzcpz.zzb), this.zzc, this.zzb);
    }
}
