package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzejp implements zzefg {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzdsx zzc;

    public zzejp(Context context, Executor executor, zzdsx zzdsx) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdsx;
    }

    /* access modifiers changed from: private */
    public static final void zze(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) {
        try {
            ((zzfct) zzefb.zzb).zzk(zzfbs.zza.zza.zzd, zzfbg.zzw.toString());
        } catch (Exception e) {
            zze.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzefb.zza)), e);
        }
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) throws zzfcd, zzeio {
        zzdst zze = this.zzc.zze(new zzcyl(zzfbs, zzfbg, zzefb.zza), new zzdsu(new zzejl(zzefb)));
        zze.zzd().zzj(new zzcti((zzfct) zzefb.zzb), this.zzb);
        zzdcz zze2 = zze.zze();
        zzdbq zzb2 = zze.zzb();
        ((zzegv) zzefb.zzc).zzc(new zzejo(this, zze.zza(), zzb2, zze2, zze.zzg()));
        return zze.zzk();
    }

    public final void zzb(zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) throws zzfcd {
        if (!((zzfct) zzefb.zzb).zzA()) {
            ((zzegv) zzefb.zzc).zzd(new zzejn(this, zzfbs, zzfbg, zzefb));
            ((zzfct) zzefb.zzb).zzh(this.zza, zzfbs.zza.zza.zzd, (String) null, (zzcav) zzefb.zzc, zzfbg.zzw.toString());
            return;
        }
        zze(zzfbs, zzfbg, zzefb);
    }
}
