package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfaw implements zzemr {
    final /* synthetic */ zzfax zza;

    zzfaw(zzfax zzfax) {
        this.zza = zzfax;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzg = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdss zzdss = (zzdss) obj;
        synchronized (this.zza) {
            this.zza.zzg = zzdss;
            this.zza.zzg.zzW();
        }
    }
}
