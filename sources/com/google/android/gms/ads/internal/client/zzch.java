package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzbtz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzch extends zzaqv implements zzcj {
    zzch(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public final zzbtz getAdapterCreator() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        zzbtz zzf = zzbty.zzf(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzf;
    }

    public final zzei getLiteSdkVersion() throws RemoteException {
        Parcel zzbk = zzbk(1, zza());
        zzei zzei = (zzei) zzaqx.zza(zzbk, zzei.CREATOR);
        zzbk.recycle();
        return zzei;
    }
}
