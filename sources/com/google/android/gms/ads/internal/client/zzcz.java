package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqv;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzcz extends zzaqv implements zzdb {
    zzcz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    public final void zze() throws RemoteException {
        zzbl(1, zza());
    }
}
