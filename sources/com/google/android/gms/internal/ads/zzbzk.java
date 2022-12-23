package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbzk extends zzaqv implements zzbzm {
    zzbzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final void zze(zzbzu zzbzu, zzbzq zzbzq) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzbzu);
        zzaqx.zzg(zza, zzbzq);
        zzbl(6, zza);
    }

    public final void zzf(zzbzu zzbzu, zzbzq zzbzq) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzbzu);
        zzaqx.zzg(zza, zzbzq);
        zzbl(5, zza);
    }

    public final void zzg(zzbzu zzbzu, zzbzq zzbzq) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzbzu);
        zzaqx.zzg(zza, zzbzq);
        zzbl(4, zza);
    }

    public final void zzh(String str, zzbzq zzbzq) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzaqx.zzg(zza, zzbzq);
        zzbl(7, zza);
    }
}
