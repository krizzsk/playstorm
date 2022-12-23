package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzark extends Handler {
    final /* synthetic */ zzarl zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzark(zzarl zzarl, Looper looper) {
        super(looper);
        this.zza = zzarl;
    }

    public final void handleMessage(Message message) {
        this.zza.zzt(message);
    }
}
