package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzny extends Thread {
    final /* synthetic */ AudioTrack zza;
    final /* synthetic */ zzon zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzny(zzon zzon, String str, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.zzb = zzon;
        this.zza = audioTrack;
    }

    public final void run() {
        try {
            this.zza.flush();
            this.zza.release();
        } finally {
            this.zzb.zzf.open();
        }
    }
}
