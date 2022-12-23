package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public abstract class zzcdv extends zzaqw implements zzcdw {
    public zzcdv() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            zzaqx.zzc(parcel);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzaqx.zzc(parcel);
            zzb(readString);
        } else if (i != 3) {
            return false;
        } else {
            zzaqx.zzc(parcel);
            zzc(parcel.readString(), parcel.readString(), (Bundle) zzaqx.zza(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
