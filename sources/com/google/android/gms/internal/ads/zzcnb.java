package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public abstract class zzcnb extends zzaqw implements zzcnc {
    public static zzcnc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return queryLocalInterface instanceof zzcnc ? (zzcnc) queryLocalInterface : new zzcna(iBinder);
    }
}
