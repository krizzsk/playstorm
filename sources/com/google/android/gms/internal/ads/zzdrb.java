package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzdrb implements Runnable {
    public final /* synthetic */ zzdrd zza;

    public /* synthetic */ zzdrb(zzdrd zzdrd) {
        this.zza = zzdrd;
    }

    public final void run() {
        try {
            this.zza.zzd();
        } catch (RemoteException e) {
            zze.zzl("#007 Could not call remote method.", e);
        }
    }
}
