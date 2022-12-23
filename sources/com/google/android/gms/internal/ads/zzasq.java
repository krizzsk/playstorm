package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzasq extends Thread {
    final /* synthetic */ AudioTrack zza;
    final /* synthetic */ zzata zzb;

    zzasq(zzata zzata, AudioTrack audioTrack) {
        this.zzb = zzata;
        this.zza = audioTrack;
    }

    public final void run() {
        try {
            this.zza.flush();
            this.zza.release();
        } finally {
            this.zzb.zze.open();
        }
    }
}
