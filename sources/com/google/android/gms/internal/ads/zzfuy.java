package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfuy implements Runnable {
    final Future zza;
    final zzfuw zzb;

    zzfuy(Future future, zzfuw zzfuw) {
        this.zza = future;
        this.zzb = zzfuw;
    }

    public final void run() {
        Throwable zza2;
        Future future = this.zza;
        if (!(future instanceof zzfwb) || (zza2 = zzfwc.zza((zzfwb) future)) == null) {
            try {
                this.zzb.zzb(zzfva.zzp(this.zza));
            } catch (ExecutionException e) {
                this.zzb.zza(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.zzb.zza(e2);
            }
        } else {
            this.zzb.zza(zza2);
        }
    }

    public final String toString() {
        zzfom zza2 = zzfon.zza(this);
        zza2.zza(this.zzb);
        return zza2.toString();
    }
}
