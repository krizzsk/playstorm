package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzawq implements Runnable {
    final /* synthetic */ IOException zza;
    final /* synthetic */ zzawu zzb;

    zzawq(zzawu zzawu, IOException iOException) {
        this.zzb = zzawu;
        this.zza = iOException;
    }

    public final void run() {
        this.zzb.zze.zzi(this.zza);
    }
}
