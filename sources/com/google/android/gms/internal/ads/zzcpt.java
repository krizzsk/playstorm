package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcpt implements zzdxg {
    private final zzcrb zza;
    private final zzcpz zzb;
    private Long zzc;
    private String zzd;

    /* synthetic */ zzcpt(zzcrb zzcrb, zzcpz zzcpz, zzcps zzcps) {
        this.zza = zzcrb;
        this.zzb = zzcpz;
    }

    public final /* synthetic */ zzdxg zza(String str) {
        if (str != null) {
            this.zzd = str;
            return this;
        }
        throw null;
    }

    public final /* bridge */ /* synthetic */ zzdxg zzb(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    public final zzdxh zzc() {
        zzgqc.zzc(this.zzc, Long.class);
        zzgqc.zzc(this.zzd, String.class);
        return new zzcpv(this.zza, this.zzb, this.zzc, this.zzd, (zzcpu) null);
    }
}
