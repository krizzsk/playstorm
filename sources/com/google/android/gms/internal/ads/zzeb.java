package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzeb implements zzdf {
    private Message zza;
    private zzec zzb;

    private zzeb() {
    }

    /* synthetic */ zzeb(zzea zzea) {
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzec.zzk(this);
    }

    public final zzeb zzb(Message message, zzec zzec) {
        this.zza = message;
        this.zzb = zzec;
        return this;
    }

    public final void zza() {
        Message message = this.zza;
        if (message != null) {
            message.sendToTarget();
            zzd();
            return;
        }
        throw null;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        if (message != null) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
            zzd();
            return sendMessageAtFrontOfQueue;
        }
        throw null;
    }
}
