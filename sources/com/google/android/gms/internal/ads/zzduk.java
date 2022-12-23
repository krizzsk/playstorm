package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzduk implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;

    public zzduk(zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3, zzgqh zzgqh4, zzgqh zzgqh5) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
        this.zzc = zzgqh3;
        this.zzd = zzgqh4;
        this.zze = zzgqh5;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzcnk) this.zza).zza();
        String zza3 = ((zzeac) this.zzb).zzb();
        zzcfo zza4 = ((zzcnu) this.zzc).zza();
        zzbdv zzbdv = (zzbdv) this.zzd.zzb();
        String str = (String) this.zze.zzb();
        zzbdl zzbdl = new zzbdl(new zzbdr(zza2));
        zzbgk zza5 = zzbgl.zza();
        zza5.zza(zza4.zzb);
        zza5.zzc(zza4.zzc);
        zza5.zzb(true != zza4.zzd ? 2 : 0);
        zzbdl.zzb(new zzduj(zzbdv, zza3, (zzbgl) zza5.zzaj(), str));
        return zzbdl;
    }
}
