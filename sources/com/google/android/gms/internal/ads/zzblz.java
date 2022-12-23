package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzblz extends zzaqv implements zzbmb {
    zzblz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void zze(zzblr zzblr) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzblr);
        zzbl(1, zza);
    }
}
