package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzbmm extends zzaqv implements zzbmo {
    zzbmm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public final void zze(zzbmx zzbmx) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbmx);
        zzbl(1, zza);
    }
}
