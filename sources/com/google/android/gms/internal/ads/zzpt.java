package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzpt extends Handler {
    final /* synthetic */ zzpv zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzpt(zzpv zzpv, Looper looper) {
        super(looper);
        this.zza = zzpv;
    }

    public final void handleMessage(Message message) {
        zzpv.zza(this.zza, message);
    }
}
