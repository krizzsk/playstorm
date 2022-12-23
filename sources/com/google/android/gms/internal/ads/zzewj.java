package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzewj implements zzfuw {
    final /* synthetic */ zzemr zza;
    final /* synthetic */ zzfhq zzb;
    final /* synthetic */ zzfhg zzc;
    final /* synthetic */ zzewl zzd;
    final /* synthetic */ zzewm zze;

    zzewj(zzewm zzewm, zzemr zzemr, zzfhq zzfhq, zzfhg zzfhg, zzewl zzewl) {
        this.zze = zzewm;
        this.zza = zzemr;
        this.zzb = zzfhq;
        this.zzc = zzfhg;
        this.zzd = zzewl;
    }

    public final void zza(Throwable th) {
        zze zze2;
        zzfhq zzfhq;
        zzcvc zzcvc = (zzcvc) this.zze.zze.zzd();
        if (zzcvc == null) {
            zze2 = zzfcx.zzb(th, (zzefd) null);
        } else {
            zze2 = zzcvc.zzb().zza(th);
        }
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcvc != null) {
                zzcvc.zzc().zza(zze2);
                if (((Boolean) zzay.zzc().zzb(zzbhy.zzgM)).booleanValue()) {
                    this.zze.zzc.execute(new zzewi(this, zze2));
                }
            } else {
                this.zze.zzd.zza(zze2);
                ((zzcvc) this.zze.zzm(this.zzd).zzh()).zzb().zzc().zzd();
            }
            zzfcs.zzb(zze2.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbjh.zzc.zze()).booleanValue() || (zzfhq = this.zzb) == null) {
                zzfhs zzh = this.zze.zzh;
                zzfhg zzfhg = this.zzc;
                zzfhg.zza(zze2);
                zzfhg.zze(false);
                zzh.zzb(zzfhg.zzj());
            } else {
                zzfhq.zzc(zze2);
                zzfhg zzfhg2 = this.zzc;
                zzfhg2.zze(false);
                zzfhq.zza(zzfhg2);
                zzfhq.zzg();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhq zzfhq;
        zzcxw zzcxw = (zzcxw) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzgM)).booleanValue()) {
                zzcxw.zzn().zzb(this.zze.zzd);
            }
            this.zza.zzb(zzcxw);
            if (!((Boolean) zzbjh.zzc.zze()).booleanValue() || (zzfhq = this.zzb) == null) {
                zzfhs zzh = this.zze.zzh;
                zzfhg zzfhg = this.zzc;
                zzfhg.zzb(zzcxw.zzp().zzb);
                zzfhg.zzc(zzcxw.zzl().zzg());
                zzfhg.zze(true);
                zzh.zzb(zzfhg.zzj());
            } else {
                zzfhq.zzf(zzcxw.zzp().zzb);
                zzfhq.zze(zzcxw.zzl().zzg());
                zzfhg zzfhg2 = this.zzc;
                zzfhg2.zze(true);
                zzfhq.zza(zzfhg2);
                zzfhq.zzg();
            }
        }
    }
}
