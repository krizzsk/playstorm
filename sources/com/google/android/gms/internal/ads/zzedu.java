package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzedu implements zzfgf {
    private final zzedr zza;

    zzedu(zzedr zzedr) {
        this.zza = zzedr;
    }

    public final void zzbF(zzffy zzffy, String str) {
    }

    public final void zzbG(zzffy zzffy, String str, Throwable th) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzff)).booleanValue() && zzffy.RENDERER == zzffy && this.zza.zzc() != 0) {
            this.zza.zze(zzt.zzA().elapsedRealtime() - this.zza.zzc());
        }
    }

    public final void zzc(zzffy zzffy, String str) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzff)).booleanValue() && zzffy.RENDERER == zzffy) {
            this.zza.zzf(zzt.zzA().elapsedRealtime());
        }
    }

    public final void zzd(zzffy zzffy, String str) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzff)).booleanValue() && zzffy.RENDERER == zzffy && this.zza.zzc() != 0) {
            this.zza.zze(zzt.zzA().elapsedRealtime() - this.zza.zzc());
        }
    }
}
