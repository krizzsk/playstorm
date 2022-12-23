package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzeli implements zzemr {
    final /* synthetic */ zzelj zza;

    zzeli(zzelj zzelj) {
        this.zza = zzelj;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcvu zzcvu = (zzcvu) obj;
        synchronized (this.zza) {
            zzelj zzelj = this.zza;
            if (zzelj.zzh != null) {
                zzelj.zzh.zzV();
            }
            this.zza.zzh = zzcvu;
            this.zza.zzh.zzW();
        }
    }
}
