package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
final class zzem implements Runnable {
    final /* synthetic */ zzeo zza;

    zzem(zzeo zzeo) {
        this.zza = zzeo;
    }

    public final void run() {
        zzep zzep = this.zza.zza;
        if (zzep.zza != null) {
            try {
                zzep.zza.zze(1);
            } catch (RemoteException e) {
                zzcfi.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
