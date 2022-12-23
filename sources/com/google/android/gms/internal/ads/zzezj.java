package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzezj implements zzems {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzcnf zzc;
    /* access modifiers changed from: private */
    public final zzemc zzd;
    /* access modifiers changed from: private */
    public final zzfaj zze;
    private zzbit zzf;
    /* access modifiers changed from: private */
    public final zzfhs zzg;
    private final zzfbw zzh;
    /* access modifiers changed from: private */
    public zzfvj zzi;

    public zzezj(Context context, Executor executor, zzcnf zzcnf, zzemc zzemc, zzfaj zzfaj, zzfbw zzfbw) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcnf;
        this.zzd = zzemc;
        this.zzh = zzfbw;
        this.zze = zzfaj;
        this.zzg = zzcnf.zzy();
    }

    public final boolean zza() {
        zzfvj zzfvj = this.zzi;
        return zzfvj != null && !zzfvj.isDone();
    }

    public final boolean zzb(zzl zzl, String str, zzemq zzemq, zzemr zzemr) {
        zzdkx zzf2;
        zzfhq zzfhq;
        zzfhg zzb2 = zzfhf.zzb(this.zza, 7, 4, zzl);
        if (str == null) {
            zze.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new zzezd(this));
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzhr)).booleanValue() && zzl.zzf) {
                this.zzc.zzk().zzl(true);
            }
            zzq zzq = ((zzezc) zzemq).zza;
            zzfbw zzfbw = this.zzh;
            zzfbw.zzs(str);
            zzfbw.zzr(zzq);
            zzfbw.zzE(zzl);
            zzfby zzG = zzfbw.zzG();
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzgN)).booleanValue()) {
                zzdkw zzg2 = this.zzc.zzg();
                zzdbc zzdbc = new zzdbc();
                zzdbc.zzc(this.zza);
                zzdbc.zzf(zzG);
                zzg2.zze(zzdbc.zzg());
                zzdhc zzdhc = new zzdhc();
                zzdhc.zzj(this.zzd, this.zzb);
                zzdhc.zzk(this.zzd, this.zzb);
                zzg2.zzd(zzdhc.zzn());
                zzg2.zzc(new zzekm(this.zzf));
                zzf2 = zzg2.zzf();
            } else {
                zzdhc zzdhc2 = new zzdhc();
                zzfaj zzfaj = this.zze;
                if (zzfaj != null) {
                    zzdhc2.zze(zzfaj, this.zzb);
                    zzdhc2.zzf(this.zze, this.zzb);
                    zzdhc2.zzb(this.zze, this.zzb);
                }
                zzdkw zzg3 = this.zzc.zzg();
                zzdbc zzdbc2 = new zzdbc();
                zzdbc2.zzc(this.zza);
                zzdbc2.zzf(zzG);
                zzg3.zze(zzdbc2.zzg());
                zzdhc2.zzj(this.zzd, this.zzb);
                zzdhc2.zze(this.zzd, this.zzb);
                zzdhc2.zzf(this.zzd, this.zzb);
                zzdhc2.zzb(this.zzd, this.zzb);
                zzdhc2.zza(this.zzd, this.zzb);
                zzdhc2.zzl(this.zzd, this.zzb);
                zzdhc2.zzk(this.zzd, this.zzb);
                zzdhc2.zzi(this.zzd, this.zzb);
                zzdhc2.zzc(this.zzd, this.zzb);
                zzg3.zzd(zzdhc2.zzn());
                zzg3.zzc(new zzekm(this.zzf));
                zzf2 = zzg3.zzf();
            }
            zzdkx zzdkx = zzf2;
            if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
                zzfhq zzf3 = zzdkx.zzf();
                zzf3.zzh(4);
                zzf3.zzb(zzl.zzp);
                zzfhq = zzf3;
            } else {
                zzfhq = null;
            }
            zzcyz zza2 = zzdkx.zza();
            zzfvj zzh2 = zza2.zzh(zza2.zzi());
            this.zzi = zzh2;
            zzfva.zzr(zzh2, new zzezi(this, zzemr, zzfhq, zzb2, zzdkx), this.zzb);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh() {
        this.zzd.zza(zzfcx.zzd(6, (String) null, (com.google.android.gms.ads.internal.client.zze) null));
    }

    public final void zzi(zzbit zzbit) {
        this.zzf = zzbit;
    }
}
