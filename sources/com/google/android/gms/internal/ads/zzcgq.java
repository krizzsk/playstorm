package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcgq implements Runnable {
    final /* synthetic */ zzcgv zza;

    zzcgq(zzcgv zzcgv) {
        this.zza = zzcgv;
    }

    public final void run() {
        zzcgv zzcgv = this.zza;
        if (zzcgv.zzq != null) {
            zzcgv.zzq.zzh();
        }
    }
}
