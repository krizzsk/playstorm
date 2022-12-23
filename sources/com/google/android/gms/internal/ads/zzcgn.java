package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcgn implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcgv zzb;

    zzcgn(zzcgv zzcgv, MediaPlayer mediaPlayer) {
        this.zzb = zzcgv;
        this.zza = mediaPlayer;
    }

    public final void run() {
        zzcgv.zzl(this.zzb, this.zza);
        zzcgv zzcgv = this.zzb;
        if (zzcgv.zzq != null) {
            zzcgv.zzq.zzf();
        }
    }
}
