package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcgp implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcgv zzc;

    zzcgp(zzcgv zzcgv, String str, String str2) {
        this.zzc = zzcgv;
        this.zza = str;
        this.zzb = str2;
    }

    public final void run() {
        zzcgv zzcgv = this.zzc;
        if (zzcgv.zzq != null) {
            zzcgv.zzq.zzb(this.zza, this.zzb);
        }
    }
}
