package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzok extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzon zza;
    final /* synthetic */ zzol zzb;

    zzok(zzol zzol, zzon zzon) {
        this.zzb = zzol;
        this.zza = zzon;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        zzcw.zzf(audioTrack == this.zzb.zza.zzq);
        zzon zzon = this.zzb.zza;
        if (zzon.zzn != null && zzon.zzO) {
            zzon.zzn.zzb();
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzcw.zzf(audioTrack == this.zzb.zza.zzq);
        zzon zzon = this.zzb.zza;
        if (zzon.zzn != null && zzon.zzO) {
            zzon.zzn.zzb();
        }
    }
}
