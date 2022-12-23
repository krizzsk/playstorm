package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgi implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzgk zza;
    private final Handler zzb;

    public zzgi(zzgk zzgk, Handler handler) {
        this.zza = zzgk;
        this.zzb = handler;
    }

    public final void onAudioFocusChange(int i) {
        this.zzb.post(new zzgh(this, i));
    }
}
