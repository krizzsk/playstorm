package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzezi implements zzfuw {
    final /* synthetic */ zzemr zza;
    final /* synthetic */ zzfhq zzb;
    final /* synthetic */ zzfhg zzc;
    final /* synthetic */ zzdkx zzd;
    final /* synthetic */ zzezj zze;

    zzezi(zzezj zzezj, zzemr zzemr, zzfhq zzfhq, zzfhg zzfhg, zzdkx zzdkx) {
        this.zze = zzezj;
        this.zza = zzemr;
        this.zzb = zzfhq;
        this.zzc = zzfhg;
        this.zzd = zzdkx;
    }

    public final void zza(Throwable th) {
        zzfhq zzfhq;
        zze zza2 = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zza(zza2);
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzgN)).booleanValue()) {
                this.zze.zzb.execute(new zzezg(this, zza2));
                this.zze.zzb.execute(new zzezh(this, zza2));
            }
            zzfcs.zzb(zza2.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbjh.zzc.zze()).booleanValue() || (zzfhq = this.zzb) == null) {
                zzfhs zze2 = this.zze.zzg;
                zzfhg zzfhg = this.zzc;
                zzfhg.zza(zza2);
                zzfhg.zze(false);
                zze2.zzb(zzfhg.zzj());
            } else {
                zzfhq.zzc(zza2);
                zzfhg zzfhg2 = this.zzc;
                zzfhg2.zze(false);
                zzfhq.zza(zzfhg2);
                zzfhq.zzg();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhq zzfhq;
        zzdjy zzdjy = (zzdjy) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzgN)).booleanValue()) {
                zzdfw zzn = zzdjy.zzn();
                zzn.zza(this.zze.zzd);
                zzn.zzd(this.zze.zze);
            }
            this.zza.zzb(zzdjy);
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzgN)).booleanValue()) {
                this.zze.zzb.execute(new zzeze(this));
                this.zze.zzb.execute(new zzezf(this));
            }
            if (!((Boolean) zzbjh.zzc.zze()).booleanValue() || (zzfhq = this.zzb) == null) {
                zzfhs zze2 = this.zze.zzg;
                zzfhg zzfhg = this.zzc;
                zzfhg.zzb(zzdjy.zzp().zzb);
                zzfhg.zzc(zzdjy.zzl().zzg());
                zzfhg.zze(true);
                zze2.zzb(zzfhg.zzj());
            } else {
                zzfhq.zzf(zzdjy.zzp().zzb);
                zzfhq.zze(zzdjy.zzl().zzg());
                zzfhg zzfhg2 = this.zzc;
                zzfhg2.zze(true);
                zzfhq.zza(zzfhg2);
                zzfhq.zzg();
            }
        }
    }
}
