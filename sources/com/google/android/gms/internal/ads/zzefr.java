package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzefr implements zzeey {
    private final zzcux zza;
    private final Context zzb;
    private final zzdto zzc;
    private final Executor zzd;

    public zzefr(zzcux zzcux, Context context, Executor executor, zzdto zzdto) {
        this.zzb = context;
        this.zza = zzcux;
        this.zzd = executor;
        this.zzc = zzdto;
    }

    public final zzfvj zza(zzfbs zzfbs, zzfbg zzfbg) {
        return zzfva.zzn(zzfva.zzi((Object) null), new zzefo(this, zzfbs, zzfbg), this.zzd);
    }

    public final boolean zzb(zzfbs zzfbs, zzfbg zzfbg) {
        zzfbl zzfbl = zzfbg.zzt;
        return (zzfbl == null || zzfbl.zza == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzc(zzfbs zzfbs, zzfbg zzfbg, Object obj) throws Exception {
        zzq zza2 = zzfcc.zza(this.zzb, zzfbg.zzv);
        zzcli zza3 = this.zzc.zza(zza2, zzfbg, zzfbs.zzb.zzb);
        zzcup zza4 = this.zza.zza(new zzcyl(zzfbs, zzfbg, (String) null), new zzcuq((View) zza3, zza3, zzfcc.zzc(zza2), zzfbg.zzab, zzfbg.zzaf, zzfbg.zzP));
        zza4.zzg().zzi(zza3, false, (zzboo) null);
        zza4.zzc().zzj(new zzefp(zza3), zzcfv.zzf);
        zza4.zzg();
        zzfbl zzfbl = zzfbg.zzt;
        return zzfva.zzm(zzdtn.zzj(zza3, zzfbl.zzb, zzfbl.zza), new zzefq(zza4), zzcfv.zzf);
    }
}
