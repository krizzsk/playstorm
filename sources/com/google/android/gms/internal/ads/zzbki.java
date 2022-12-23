package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzbki extends zzaqv implements IInterface {
    zzbki(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbze zzbze) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbze);
        zzbl(1, zza);
    }
}
