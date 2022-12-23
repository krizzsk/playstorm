package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzge extends BroadcastReceiver implements Runnable {
    final /* synthetic */ zzgg zza;
    private final zzgf zzb;
    private final Handler zzc;

    public zzge(zzgg zzgg, Handler handler, zzgf zzgf) {
        this.zza = zzgg;
        this.zzc = handler;
        this.zzb = zzgf;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zzc.post(this);
        }
    }

    public final void run() {
    }
}
