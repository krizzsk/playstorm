package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqx;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public abstract class zzdg extends zzaqw implements zzdh {
    public zzdg() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzdh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof zzdh ? (zzdh) queryLocalInterface : new zzdf(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String zzg = zzg();
            parcel2.writeNoException();
            parcel2.writeString(zzg);
        } else if (i == 2) {
            String zzh = zzh();
            parcel2.writeNoException();
            parcel2.writeString(zzh);
        } else if (i == 3) {
            List zzi = zzi();
            parcel2.writeNoException();
            parcel2.writeTypedList(zzi);
        } else if (i == 4) {
            zzu zzf = zzf();
            parcel2.writeNoException();
            zzaqx.zzf(parcel2, zzf);
        } else if (i != 5) {
            return false;
        } else {
            Bundle zze = zze();
            parcel2.writeNoException();
            zzaqx.zzf(parcel2, zze);
        }
        return true;
    }
}
