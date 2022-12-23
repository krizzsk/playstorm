package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeit implements zzefg {
    private final Context zza;
    private final Executor zzb;
    private final zzdsx zzc;

    public zzeit(Context context, Executor executor, zzdsx zzdsx) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdsx;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) throws zzfcd, zzeio {
        zzdst zze = this.zzc.zze(new zzcyl(zzfbs, zzfbg, zzefb.zza), new zzdsu(new zzeis(zzefb)));
        zze.zzd().zzj(new zzcti((zzfct) zzefb.zzb), this.zzb);
        ((zzegu) zzefb.zzc).zzc(zze.zzm());
        return zze.zzk();
    }

    public final void zzb(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) throws zzfcd {
        try {
            zzfby zzfby = zzfbs.zza.zza;
            if (zzfby.zzo.zza == 3) {
                ((zzfct) zzefb.zzb).zzq(this.zza, zzfby.zzd, zzfbg.zzw.toString(), (zzbuf) zzefb.zzc);
            } else {
                ((zzfct) zzefb.zzb).zzp(this.zza, zzfby.zzd, zzfbg.zzw.toString(), (zzbuf) zzefb.zzc);
            }
        } catch (Exception e) {
            zze.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzefb.zza)), e);
        }
    }
}
