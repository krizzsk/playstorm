package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.tapjoy.TJAdUnitConstants;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdvr implements zzden, zzddg, zzdbv {
    private final zzdwb zza;
    private final zzdwl zzb;

    public zzdvr(zzdwb zzdwb, zzdwl zzdwl) {
        this.zza = zzdwb;
        this.zzb = zzdwl;
    }

    public final void zza(zze zze) {
        this.zza.zza().put("action", "ftl");
        this.zza.zza().put("ftl", String.valueOf(zze.zza));
        this.zza.zza().put("ed", zze.zzc);
        this.zzb.zze(this.zza.zza());
    }

    public final void zzb(zzfbs zzfbs) {
        this.zza.zzb(zzfbs);
    }

    public final void zzbE(zzbzu zzbzu) {
        this.zza.zzc(zzbzu.zza);
    }

    public final void zzn() {
        this.zza.zza().put("action", TJAdUnitConstants.String.VIDEO_LOADED);
        this.zzb.zze(this.zza.zza());
    }
}
