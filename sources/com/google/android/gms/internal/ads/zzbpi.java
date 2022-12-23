package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public abstract class zzbpi extends zzaqw implements zzbpj {
    public zzbpi() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    public static zzbpj zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        return queryLocalInterface instanceof zzbpj ? (zzbpj) queryLocalInterface : new zzbph(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            zzaqx.zzc(parcel);
            zzf(readString);
        } else if (i != 2) {
            return false;
        } else {
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
