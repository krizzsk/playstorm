package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcbk;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final /* synthetic */ class zzew implements Runnable {
    public final /* synthetic */ zzcbk zza;

    public /* synthetic */ zzew(zzcbk zzcbk) {
        this.zza = zzcbk;
    }

    public final void run() {
        zzcbk zzcbk = this.zza;
        if (zzcbk != null) {
            try {
                zzcbk.zze(1);
            } catch (RemoteException e) {
                zzcfi.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
