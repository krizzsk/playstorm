package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfaq implements zzfuw {
    final /* synthetic */ zzemr zza;
    final /* synthetic */ zzfhq zzb;
    final /* synthetic */ zzfhg zzc;
    final /* synthetic */ zzfas zzd;
    final /* synthetic */ zzfat zze;

    zzfaq(zzfat zzfat, zzemr zzemr, zzfhq zzfhq, zzfhg zzfhg, zzfas zzfas) {
        this.zze = zzfat;
        this.zza = zzemr;
        this.zzb = zzfhq;
        this.zzc = zzfhg;
        this.zzd = zzfas;
    }

    public final void zza(Throwable th) {
        zze zze2;
        zzfhq zzfhq;
        zzdsx zzdsx = (zzdsx) this.zze.zze.zzd();
        if (zzdsx == null) {
            zze2 = zzfcx.zzb(th, (zzefd) null);
        } else {
            zze2 = zzdsx.zzb().zza(th);
        }
        synchronized (this.zze) {
            if (zzdsx != null) {
                zzdsx.zza().zza(zze2);
                this.zze.zzb.execute(new zzfap(this, zze2));
            } else {
                this.zze.zzd.zza(zze2);
                this.zze.zzk(this.zzd).zze().zzb().zzc().zzd();
            }
            zzfcs.zzb(zze2.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbjh.zzc.zze()).booleanValue() || (zzfhq = this.zzb) == null) {
                zzfhs zzg = this.zze.zzg;
                zzfhg zzfhg = this.zzc;
                zzfhg.zza(zze2);
                zzfhg.zze(false);
                zzg.zzb(zzfhg.zzj());
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
        zzdss zzdss = (zzdss) obj;
        synchronized (this.zze) {
            zzdss.zzn().zzd(this.zze.zzd);
            this.zza.zzb(zzdss);
            zzfat zzfat = this.zze;
            Executor zzh = zzfat.zzb;
            zzfaj zzf = zzfat.zzd;
            zzf.getClass();
            zzh.execute(new zzfao(zzf));
            this.zze.zzd.zzv();
            if (!((Boolean) zzbjh.zzc.zze()).booleanValue() || (zzfhq = this.zzb) == null) {
                zzfhs zzg = this.zze.zzg;
                zzfhg zzfhg = this.zzc;
                zzfhg.zzb(zzdss.zzp().zzb);
                zzfhg.zzc(zzdss.zzl().zzg());
                zzfhg.zze(true);
                zzg.zzb(zzfhg.zzj());
            } else {
                zzfhq.zzf(zzdss.zzp().zzb);
                zzfhq.zze(zzdss.zzl().zzg());
                zzfhg zzfhg2 = this.zzc;
                zzfhg2.zze(true);
                zzfhq.zza(zzfhg2);
                zzfhq.zzg();
            }
        }
    }
}
