package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
final class zzeq implements Runnable {
    final /* synthetic */ zzer zza;

    zzeq(zzer zzer) {
        this.zza = zzer;
    }

    public final void run() {
        zzer zzer = this.zza;
        if (zzer.zza != null) {
            try {
                zzer.zza.zze(1);
            } catch (RemoteException e) {
                zzcfi.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
