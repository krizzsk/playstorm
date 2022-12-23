package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzehb implements zzeey {
    private final Context zza;
    private final zzdto zzb;
    private final zzdkx zzc;
    private final zzfby zzd;
    private final Executor zze;
    private final zzcfo zzf;
    private final zzboo zzg;
    private final boolean zzh = ((Boolean) zzay.zzc().zzb(zzbhy.zzhq)).booleanValue();

    public zzehb(Context context, zzcfo zzcfo, zzfby zzfby, Executor executor, zzdkx zzdkx, zzdto zzdto, zzboo zzboo) {
        this.zza = context;
        this.zzd = zzfby;
        this.zzc = zzdkx;
        this.zze = executor;
        this.zzf = zzcfo;
        this.zzb = zzdto;
        this.zzg = zzboo;
    }

    public final zzfvj zza(zzfbs zzfbs, zzfbg zzfbg) {
        zzdts zzdts = new zzdts();
        zzfvj zzn = zzfva.zzn(zzfva.zzi((Object) null), new zzegw(this, zzfbg, zzfbs, zzdts), this.zze);
        zzn.zzc(new zzegx(zzdts), this.zze);
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
        zzcli zza2 = this.zzb.zza(this.zzd.zze, zzfbg2, zzfbs2.zzb.zzb);
        zza2.zzab(zzfbg2.zzX);
        zzdts.zza(this.zza, (View) zza2);
        zzcga zzcga = new zzcga();
        zzdkx zzdkx = this.zzc;
        zzcyl zzcyl = new zzcyl(zzfbs2, zzfbg2, (String) null);
        zzeha zzeha = r1;
        zzeha zzeha2 = new zzeha(this.zza, this.zzf, zzcga, zzfbg, zza2, this.zzd, this.zzh, this.zzg);
        zzdjz zze2 = zzdkx.zze(zzcyl, new zzdkc(zzeha, zza2));
        zzcga.zzd(zze2);
        zze2.zzc().zzj(new zzegy(zza2), zzcfv.zzf);
        zze2.zzk().zzi(zza2, true, this.zzh ? this.zzg : null);
        zze2.zzk();
        zzfbg zzfbg3 = zzfbg;
        zzfbl zzfbl = zzfbg3.zzt;
        return zzfva.zzm(zzdtn.zzj(zza2, zzfbl.zzb, zzfbl.zza), new zzegz(this, zza2, zzfbg3, zze2), this.zze);
    }
}
