package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzcbp {
    public static final zzcbd zza(Context context, String str, zzbtz zzbtz) {
        try {
            IBinder zze = ((zzcbh) zzcfm.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzcbo.zza)).zze(ObjectWrapper.wrap(context), str, zzbtz, 221310000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzcbd ? (zzcbd) queryLocalInterface : new zzcbb(zze);
        } catch (RemoteException | zzcfl e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
