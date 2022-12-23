package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdz implements zzcx {
    protected zzdz() {
    }

    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    public final zzdg zzb(Looper looper, Handler.Callback callback) {
        return new zzec(new Handler(looper, callback));
    }
}
