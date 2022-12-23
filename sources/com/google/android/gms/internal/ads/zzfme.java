package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfme extends zzaqv implements IInterface {
    zzfme(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfmc zze(zzfma zzfma) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzfma);
        Parcel zzbk = zzbk(1, zza);
        zzfmc zzfmc = (zzfmc) zzaqx.zza(zzbk, zzfmc.CREATOR);
        zzbk.recycle();
        return zzfmc;
    }

    public final zzfml zzf(zzfmj zzfmj) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzfmj);
        Parcel zzbk = zzbk(3, zza);
        zzfml zzfml = (zzfml) zzaqx.zza(zzbk, zzfml.CREATOR);
        zzbk.recycle();
        return zzfml;
    }

    public final void zzg(zzflx zzflx) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzflx);
        zzbl(2, zza);
    }
}
