package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcpz implements zzdxp {
    /* access modifiers changed from: private */
    public final Context zza;
    private final zzbpg zzb;
    private final zzcrb zzc;
    private final zzcpz zzd = this;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;

    /* synthetic */ zzcpz(zzcrb zzcrb, Context context, zzbpg zzbpg, zzcpy zzcpy) {
        this.zzc = zzcrb;
        this.zza = context;
        this.zzb = zzbpg;
        this.zze = zzgpv.zza(this);
        zzgpu zza2 = zzgpv.zza(zzbpg);
        this.zzf = zza2;
        zzdxl zzdxl = new zzdxl(zza2);
        this.zzg = zzdxl;
        this.zzh = zzgpt.zzc(new zzdxn(this.zze, zzdxl));
    }

    public final zzdxg zzb() {
        return new zzcpt(this.zzc, this.zzd, (zzcps) null);
    }

    public final zzdxm zzd() {
        return (zzdxm) this.zzh.zzb();
    }
}
