package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcgr implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcgv zzc;

    zzcgr(zzcgv zzcgv, int i, int i2) {
        this.zzc = zzcgv;
        this.zza = i;
        this.zzb = i2;
    }

    public final void run() {
        zzcgv zzcgv = this.zzc;
        if (zzcgv.zzq != null) {
            zzcgv.zzq.zzj(this.zza, this.zzb);
        }
    }
}
