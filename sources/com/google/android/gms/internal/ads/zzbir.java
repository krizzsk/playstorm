package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzbir extends zzaqv implements zzbit {
    zzbir(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public final void zze(zzbiq zzbiq) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbiq);
        zzbl(1, zza);
    }
}
