package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzbpw extends zzaqw implements zzbpx {
    public zzbpw() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzaqx.zzc(parcel);
        zzb((ParcelFileDescriptor) zzaqx.zza(parcel, ParcelFileDescriptor.CREATOR));
        return true;
    }
}
