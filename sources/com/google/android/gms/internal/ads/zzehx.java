package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzehx extends zzbvl {
    final /* synthetic */ zzehy zza;
    private final zzefb zzb;

    /* synthetic */ zzehx(zzehy zzehy, zzefb zzefb, zzehw zzehw) {
        this.zza = zzehy;
        this.zzb = zzefb;
    }

    public final void zze(String str) throws RemoteException {
        ((zzegu) this.zzb.zzc).zzi(0, str);
    }

    public final void zzf(zze zze) throws RemoteException {
        ((zzegu) this.zzb.zzc).zzh(zze);
    }

    public final void zzg(zzbuo zzbuo) throws RemoteException {
        this.zza.zzc = zzbuo;
        ((zzegu) this.zzb.zzc).zzo();
    }
}
