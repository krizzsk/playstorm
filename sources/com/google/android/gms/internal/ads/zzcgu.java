package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcgu implements Runnable {
    final /* synthetic */ zzcgv zza;

    zzcgu(zzcgv zzcgv) {
        this.zza = zzcgv;
    }

    public final void run() {
        zzcgv zzcgv = this.zza;
        if (zzcgv.zzq != null) {
            zzcgv.zzq.zzd();
        }
    }
}
