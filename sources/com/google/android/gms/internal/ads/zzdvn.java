package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdvn implements zzfgf {
    private final Map zza;
    private final zzbdl zzb;

    zzdvn(zzbdl zzbdl, Map map) {
        this.zza = map;
        this.zzb = zzbdl;
    }

    public final void zzbF(zzffy zzffy, String str) {
    }

    public final void zzbG(zzffy zzffy, String str, Throwable th) {
        if (this.zza.containsKey(zzffy)) {
            this.zzb.zzc(((zzdvm) this.zza.get(zzffy)).zzc);
        }
    }

    public final void zzc(zzffy zzffy, String str) {
        if (this.zza.containsKey(zzffy)) {
            this.zzb.zzc(((zzdvm) this.zza.get(zzffy)).zza);
        }
    }

    public final void zzd(zzffy zzffy, String str) {
        if (this.zza.containsKey(zzffy)) {
            this.zzb.zzc(((zzdvm) this.zza.get(zzffy)).zzb);
        }
    }
}
