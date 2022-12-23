package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzbqy extends zzaqv implements zzbra {
    zzbqy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    public final void zze(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbl(2, zza);
    }

    public final void zzf(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zze);
        zzbl(3, zza);
    }

    public final void zzg(zzbqu zzbqu) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbqu);
        zzbl(1, zza);
    }
}
