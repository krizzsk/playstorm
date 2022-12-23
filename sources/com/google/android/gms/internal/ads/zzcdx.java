package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzcdx extends zzaqv implements zzcdz {
    zzcdx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public final void zze(IObjectWrapper iObjectWrapper, zzced zzced, zzcdw zzcdw) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzced);
        zzaqx.zzg(zza, zzcdw);
        zzbl(1, zza);
    }

    public final void zzf(zzbys zzbys) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzbys);
        zzbl(7, zza);
    }

    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbyj zzbyj) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbyj);
        zzbl(10, zza);
    }

    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbyj zzbyj) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbyj);
        zzbl(9, zza);
    }

    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(8, zza);
    }

    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(2, zza);
    }

    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbyj zzbyj) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbyj);
        zzbl(6, zza);
    }

    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbyj zzbyj) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbyj);
        zzbl(5, zza);
    }
}
