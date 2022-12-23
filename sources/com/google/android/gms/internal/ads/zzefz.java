package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzfg;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzas;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzefz implements zzeey {
    private final zzcwr zza;
    private final Context zzb;
    private final zzdto zzc;
    private final zzfby zzd;
    private final Executor zze;
    private final zzfoi zzf;

    public zzefz(zzcwr zzcwr, Context context, Executor executor, zzdto zzdto, zzfby zzfby, zzfoi zzfoi) {
        this.zzb = context;
        this.zza = zzcwr;
        this.zze = executor;
        this.zzc = zzdto;
        this.zzd = zzfby;
        this.zzf = zzfoi;
    }

    public final zzfvj zza(zzfbs zzfbs, zzfbg zzfbg) {
        return zzfva.zzn(zzfva.zzi((Object) null), new zzeft(this, zzfbs, zzfbg), this.zze);
    }

    public final boolean zzb(zzfbs zzfbs, zzfbg zzfbg) {
        zzfbl zzfbl = zzfbg.zzt;
        return (zzfbl == null || zzfbl.zza == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzc(zzfbs zzfbs, zzfbg zzfbg, Object obj) throws Exception {
        View view;
        zzq zza2 = zzfcc.zza(this.zzb, zzfbg.zzv);
        zzcli zza3 = this.zzc.zza(zza2, zzfbg, zzfbs.zzb.zzb);
        zza3.zzab(zzfbg.zzX);
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzgy)).booleanValue() || !zzfbg.zzai) {
            view = new zzdtr(this.zzb, (View) zza3, (zzas) this.zzf.apply(zzfbg));
        } else {
            view = zzcxi.zza(this.zzb, (View) zza3, zzfbg);
        }
        zzcvv zza4 = this.zza.zza(new zzcyl(zzfbs, zzfbg, (String) null), new zzcwb(view, zza3, new zzefu(zza3), zzfcc.zzc(zza2)));
        zza4.zzj().zzi(zza3, false, (zzboo) null);
        zza4.zzc().zzj(new zzefv(zza3), zzcfv.zzf);
        zza4.zzj();
        zzfbl zzfbl = zzfbg.zzt;
        zzfvj zzj = zzdtn.zzj(zza3, zzfbl.zzb, zzfbl.zza);
        if (zzfbg.zzN) {
            zzj.zzc(new zzefw(zza3), this.zze);
        }
        zzj.zzc(new zzefx(this, zza3), this.zze);
        return zzfva.zzm(zzj, new zzefy(zza4), zzcfv.zzf);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzcli zzcli) {
        zzcli.zzaa();
        zzcme zzs = zzcli.zzs();
        zzfg zzfg = this.zzd.zza;
        if (zzfg != null && zzs != null) {
            zzs.zzs(zzfg);
        }
    }
}
