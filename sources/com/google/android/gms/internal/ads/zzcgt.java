package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcgt implements Runnable {
    final /* synthetic */ zzcgv zza;

    zzcgt(zzcgv zzcgv) {
        this.zza = zzcgv;
    }

    public final void run() {
        zzcgv zzcgv = this.zza;
        if (zzcgv.zzq != null) {
            if (!zzcgv.zzr) {
                zzcgv.zzq.zzg();
                this.zza.zzr = true;
            }
            this.zza.zzq.zze();
        }
    }
}
