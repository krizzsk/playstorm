package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzeiw extends zzbvo {
    private final zzefb zza;

    /* synthetic */ zzeiw(zzeix zzeix, zzefb zzefb, zzeiv zzeiv) {
        this.zza = zzefb;
    }

    public final void zze(String str) throws RemoteException {
        ((zzegu) this.zza.zzc).zzi(0, str);
    }

    public final void zzf(zze zze) throws RemoteException {
        ((zzegu) this.zza.zzc).zzh(zze);
    }

    public final void zzg() throws RemoteException {
        ((zzegu) this.zza.zzc).zzo();
    }
}
