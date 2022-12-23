package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzawp implements Runnable {
    final /* synthetic */ zzaws zza;
    final /* synthetic */ zzawu zzb;

    zzawp(zzawu zzawu, zzaws zzaws) {
        this.zzb = zzawu;
        this.zza = zzaws;
    }

    public final void run() {
        this.zza.zza();
        int size = this.zzb.zzn.size();
        for (int i = 0; i < size; i++) {
            ((zzaxj) this.zzb.zzn.valueAt(i)).zzi();
        }
    }
}
