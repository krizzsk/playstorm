package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbsb implements zzcgc {
    final /* synthetic */ zzbsk zza;
    final /* synthetic */ zzfhg zzb;
    final /* synthetic */ zzbsl zzc;

    zzbsb(zzbsl zzbsl, zzbsk zzbsk, zzfhg zzfhg) {
        this.zzc = zzbsl;
        this.zza = zzbsk;
        this.zzb = zzfhg;
    }

    public final void zza() {
        synchronized (this.zzc.zza) {
            this.zzc.zzi = 1;
            zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbjh.zzd.zze()).booleanValue()) {
                zzbsl zzbsl = this.zzc;
                if (zzbsl.zze != null) {
                    zzfhs zze = zzbsl.zze;
                    zzfhg zzfhg = this.zzb;
                    zzfhg.zze(false);
                    zze.zzb(zzfhg.zzj());
                }
            }
        }
    }
}
