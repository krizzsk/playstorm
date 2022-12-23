package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfbb implements zzemr {
    final /* synthetic */ zzfbd zza;

    zzfbb(zzfbd zzfbd) {
        this.zza = zzfbd;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdss zzdss = (zzdss) obj;
        synchronized (this.zza) {
            this.zza.zzd = zzdss;
            this.zza.zzd.zzW();
        }
    }
}
