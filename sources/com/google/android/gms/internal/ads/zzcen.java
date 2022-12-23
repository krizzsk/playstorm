package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcen extends zzb {
    final /* synthetic */ zzcer zza;

    zzcen(zzcer zzcer) {
        this.zza = zzcer;
    }

    public final void zza() {
        zzcer zzcer = this.zza;
        zzbib zzbib = new zzbib(zzcer.zze, zzcer.zzf.zza);
        synchronized (this.zza.zza) {
            try {
                zzt.zze();
                zzbie.zza(this.zza.zzg, zzbib);
            } catch (IllegalArgumentException e) {
                zze.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
