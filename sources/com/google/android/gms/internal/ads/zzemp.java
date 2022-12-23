package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbf;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzemp {
    private final zzdnr zza;
    private final zzemc zzb;
    private final zzdbv zzc;

    public zzemp(zzdnr zzdnr, zzfgo zzfgo) {
        this.zza = zzdnr;
        zzemc zzemc = new zzemc(zzfgo);
        this.zzb = zzemc;
        this.zzc = new zzemo(zzemc, this.zza.zzg());
    }

    public final zzdbv zza() {
        return this.zzc;
    }

    public final zzddg zzb() {
        return this.zzb;
    }

    public final zzdlo zzc() {
        return new zzdlo(this.zza, this.zzb.zzc());
    }

    public final zzemc zzd() {
        return this.zzb;
    }

    public final void zze(zzbf zzbf) {
        this.zzb.zze(zzbf);
    }
}
