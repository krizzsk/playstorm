package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeix implements zzefg {
    private final Context zza;
    private final zzdsx zzb;

    public zzeix(Context context, zzdsx zzdsx) {
        this.zza = context;
        this.zzb = zzdsx;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) throws zzfcd, zzeio {
        zzehd zzehd = new zzehd(zzfbg, (zzbvs) zzefb.zzb, true);
        zzdst zze = this.zzb.zze(new zzcyl(zzfbs, zzfbg, zzefb.zza), new zzdsu(zzehd));
        zzehd.zzb(zze.zzc());
        ((zzegu) zzefb.zzc).zzc(zze.zzn());
        return zze.zzk();
    }

    public final void zzb(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) throws zzfcd {
        try {
            ((zzbvs) zzefb.zzb).zzp(zzfbg.zzaa);
            if (zzfbs.zza.zza.zzo.zza == 3) {
                ((zzbvs) zzefb.zzb).zzn(zzfbg.zzV, zzfbg.zzw.toString(), zzfbs.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeiw(this, zzefb, (zzeiv) null), (zzbuf) zzefb.zzc);
            } else {
                ((zzbvs) zzefb.zzb).zzo(zzfbg.zzV, zzfbg.zzw.toString(), zzfbs.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeiw(this, zzefb, (zzeiv) null), (zzbuf) zzefb.zzc);
            }
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
