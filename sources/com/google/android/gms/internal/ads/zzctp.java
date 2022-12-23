package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzctp implements zzfuw {
    final /* synthetic */ zzctr zza;

    zzctp(zzctr zzctr) {
        this.zza = zzctr;
    }

    public final void zza(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzctr zzctr = this.zza;
        zzfch zzd = zzctr.zzh;
        List zzb = zzctr.zzg.zzb(zzctr.zze, zzctr.zzf, false, "", (String) obj, zzctr.zzf.zzc);
        int i = 1;
        if (true == zzt.zzo().zzv(this.zza.zza)) {
            i = 2;
        }
        zzd.zzc(zzb, i);
    }
}
