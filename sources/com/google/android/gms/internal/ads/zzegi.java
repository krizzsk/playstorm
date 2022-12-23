package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzegi extends zzbvf {
    final /* synthetic */ zzegj zza;
    private final zzefb zzb;

    /* synthetic */ zzegi(zzegj zzegj, zzefb zzefb, zzegh zzegh) {
        this.zza = zzegj;
        this.zzb = zzefb;
    }

    public final void zze(String str) throws RemoteException {
        ((zzegu) this.zzb.zzc).zzi(0, str);
    }

    public final void zzf(zze zze) throws RemoteException {
        ((zzegu) this.zzb.zzc).zzh(zze);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.zzc = (View) ObjectWrapper.unwrap(iObjectWrapper);
        ((zzegu) this.zzb.zzc).zzo();
    }

    public final void zzh(zzbui zzbui) throws RemoteException {
        this.zza.zzd = zzbui;
        ((zzegu) this.zzb.zzc).zzo();
    }
}
