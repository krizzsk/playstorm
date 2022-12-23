package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzefl implements zzeey {
    private final zzcvi zza;
    private final Context zzb;
    private final zzdto zzc;
    private final zzfby zzd;
    private final Executor zze;
    private final zzcfo zzf;
    private final zzboo zzg;
    private final boolean zzh = ((Boolean) zzay.zzc().zzb(zzbhy.zzhq)).booleanValue();

    public zzefl(zzcvi zzcvi, Context context, Executor executor, zzdto zzdto, zzfby zzfby, zzcfo zzcfo, zzboo zzboo) {
        this.zzb = context;
        this.zza = zzcvi;
        this.zze = executor;
        this.zzc = zzdto;
        this.zzd = zzfby;
        this.zzf = zzcfo;
        this.zzg = zzboo;
    }

    public final zzfvj zza(zzfbs zzfbs, zzfbg zzfbg) {
        zzdts zzdts = new zzdts();
        zzfvj zzn = zzfva.zzn(zzfva.zzi((Object) null), new zzefj(this, zzfbg, zzfbs, zzdts), this.zze);
        zzn.zzc(new zzefk(zzdts), this.zze);
        return zzn;
    }

    public final boolean zzb(zzfbs zzfbs, zzfbg zzfbg) {
        zzfbl zzfbl = zzfbg.zzt;
        return (zzfbl == null || zzfbl.zza == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzc(zzfbg zzfbg, zzfbs zzfbs, zzdts zzdts, Object obj) throws Exception {
        zzfbg zzfbg2 = zzfbg;
        zzfbs zzfbs2 = zzfbs;
        zzcli zza2 = this.zzc.zza(this.zzd.zze, zzfbg2, zzfbs2.zzb.zzb);
        zza2.zzab(zzfbg2.zzX);
        zzdts.zza(this.zzb, (View) zza2);
        zzcga zzcga = new zzcga();
        zzcvi zzcvi = this.zza;
        zzcyl zzcyl = new zzcyl(zzfbs2, zzfbg2, (String) null);
        zzefn zzefn = r1;
        zzefn zzefn2 = new zzefn(this.zzf, zzcga, zzfbg, zza2, this.zzd, this.zzh, this.zzg);
        zzcvf zza3 = zzcvi.zza(zzcyl, new zzdkc(zzefn, zza2), new zzcvg(zzfbg2.zzab));
        zza3.zzj().zzi(zza2, false, this.zzh ? this.zzg : null);
        zzcga.zzd(zza3);
        zza3.zzc().zzj(new zzefh(zza2), zzcfv.zzf);
        zza3.zzj();
        zzfbl zzfbl = zzfbg2.zzt;
        return zzfva.zzm(zzdtn.zzj(zza2, zzfbl.zzb, zzfbl.zza), new zzefi(this, zza2, zzfbg2, zza3), this.zze);
    }
}
