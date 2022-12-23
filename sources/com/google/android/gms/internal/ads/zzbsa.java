package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbsa implements zzcge {
    final /* synthetic */ zzbsk zza;
    final /* synthetic */ zzfhg zzb;
    final /* synthetic */ zzbsl zzc;

    zzbsa(zzbsl zzbsl, zzbsk zzbsk, zzfhg zzfhg) {
        this.zzc = zzbsl;
        this.zza = zzbsk;
        this.zzb = zzfhg;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbrg zzbrg = (zzbrg) obj;
        synchronized (this.zzc.zza) {
            this.zzc.zzi = 0;
            zzbsl zzbsl = this.zzc;
            if (!(zzbsl.zzh == null || this.zza == zzbsl.zzh)) {
                zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                this.zzc.zzh.zzb();
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbjh.zzd.zze()).booleanValue()) {
                zzbsl zzbsl2 = this.zzc;
                if (zzbsl2.zze != null) {
                    zzfhs zze = zzbsl2.zze;
                    zzfhg zzfhg = this.zzb;
                    zzfhg.zze(true);
                    zze.zzb(zzfhg.zzj());
                }
            }
        }
    }
}
