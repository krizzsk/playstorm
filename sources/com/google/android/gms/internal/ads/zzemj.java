package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzemj implements zzemr {
    final /* synthetic */ zzemk zza;

    zzemj(zzemk zzemk) {
        this.zza = zzemk;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdjy zzdjy = (zzdjy) obj;
        synchronized (this.zza) {
            this.zza.zzh = zzdjy;
            this.zza.zzh.zzW();
        }
    }
}
