package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzbvk extends zzaqv implements zzbvm {
    zzbvk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbl(2, zza);
    }

    public final void zzf(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zze);
        zzbl(3, zza);
    }

    public final void zzg(zzbuo zzbuo) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbuo);
        zzbl(1, zza);
    }
}
