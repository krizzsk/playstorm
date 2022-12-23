package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzdlm implements zzcxz {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzgqh zzd;
    private final zzdnr zze;

    zzdlm(Map map, Map map2, Map map3, zzgqh zzgqh, zzdnr zzdnr) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzgqh;
        this.zze = zzdnr;
    }

    public final zzeey zza(int i, String str) {
        zzeey zza2;
        zzeey zzeey = (zzeey) this.zza.get(str);
        if (zzeey != null) {
            return zzeey;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzehm zzehm = (zzehm) this.zzc.get(str);
            if (zzehm != null) {
                return new zzeez(zzehm, zzcyb.zza);
            }
            zzeey zzeey2 = (zzeey) this.zzb.get(str);
            if (zzeey2 == null) {
                return null;
            }
            return zzcyd.zza(zzeey2);
        } else if (this.zze.zze() == null || (zza2 = ((zzcxz) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        } else {
            return zzcyd.zza(zza2);
        }
    }
}
