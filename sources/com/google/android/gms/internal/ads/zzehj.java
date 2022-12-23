package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzehj implements zzefg {
    private final Context zza;
    private final zzdkx zzb;

    public zzehj(Context context, zzdkx zzdkx) {
        this.zza = context;
        this.zzb = zzdkx;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) throws zzfcd, zzeio {
        zzehd zzehd = new zzehd(zzfbg, (zzbvs) zzefb.zzb, false);
        zzdjz zze = this.zzb.zze(new zzcyl(zzfbs, zzfbg, zzefb.zza), new zzdkc(zzehd, (zzcli) null));
        zzehd.zzb(zze.zzc());
        ((zzegu) zzefb.zzc).zzc(zze.zzh());
        return zze.zzg();
    }

    public final void zzb(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) throws zzfcd {
        try {
            ((zzbvs) zzefb.zzb).zzp(zzfbg.zzaa);
            ((zzbvs) zzefb.zzb).zzk(zzfbg.zzV, zzfbg.zzw.toString(), zzfbs.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehi(this, zzefb, (zzehh) null), (zzbuf) zzefb.zzc);
        } catch (RemoteException e) {
            throw new zzfcd(e);
        }
    }
}
