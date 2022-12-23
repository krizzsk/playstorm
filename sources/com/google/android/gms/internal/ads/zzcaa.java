package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcaa implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcac zzb;

    zzcaa(zzcac zzcac, Context context) {
        this.zzb = zzcac;
        this.zza = context;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbzz zzbzz;
        zzcab zzcab = (zzcab) this.zzb.zza.get(this.zza);
        if (zzcab == null || zzcab.zza + ((Long) zzbje.zza.zze()).longValue() < zzt.zzA().currentTimeMillis()) {
            zzbzz = new zzbzy(this.zza).zza();
        } else {
            zzbzz = new zzbzy(this.zza, zzcab.zzb).zza();
        }
        zzcac zzcac = this.zzb;
        zzcac.zza.put(this.zza, new zzcab(zzcac, zzbzz));
        return zzbzz;
    }
}
