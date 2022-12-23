package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbbd implements Runnable {
    final /* synthetic */ zzbbe zza;

    zzbbd(zzbbe zzbbe) {
        this.zza = zzbbe;
    }

    public final void run() {
        synchronized (this.zza.zzc) {
            zzbbe zzbbe = this.zza;
            if (!zzbbe.zzd || !zzbbe.zze) {
                zze.zze("App is still foreground");
            } else {
                zzbbe.zzd = false;
                zze.zze("App went background");
                for (zzbbf zza2 : this.zza.zzf) {
                    try {
                        zza2.zza(false);
                    } catch (Exception e) {
                        zzcfi.zzh("", e);
                    }
                }
            }
        }
    }
}
