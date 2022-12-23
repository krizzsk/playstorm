package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzemy implements zzfuw {
    final /* synthetic */ zzemr zza;
    final /* synthetic */ zzfhq zzb;
    final /* synthetic */ zzfhg zzc;
    final /* synthetic */ zzdlt zzd;
    final /* synthetic */ zzemz zze;

    zzemy(zzemz zzemz, zzemr zzemr, zzfhq zzfhq, zzfhg zzfhg, zzdlt zzdlt) {
        this.zze = zzemz;
        this.zza = zzemr;
        this.zzb = zzfhq;
        this.zzc = zzfhg;
        this.zzd = zzdlt;
    }

    public final void zza(Throwable th) {
        zzfhq zzfhq;
        zze zza2 = this.zzd.zza().zza(th);
        this.zzd.zzb().zza(zza2);
        this.zze.zzb.zzA().execute(new zzemx(this, zza2));
        zzfcs.zzb(zza2.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbjh.zzc.zze()).booleanValue() || (zzfhq = this.zzb) == null) {
            zzfhs zze2 = this.zze.zze;
            zzfhg zzfhg = this.zzc;
            zzfhg.zza(zza2);
            zzfhg.zze(false);
            zze2.zzb(zzfhg.zzj());
            return;
        }
        zzfhq.zzc(zza2);
        zzfhg zzfhg2 = this.zzc;
        zzfhg2.zze(false);
        zzfhq.zza(zzfhg2);
        zzfhq.zzg();
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhq zzfhq;
        zzcxw zzcxw = (zzcxw) obj;
        synchronized (this.zze) {
            zzcxw.zzn().zza(this.zze.zzd.zzd());
            this.zza.zzb(zzcxw);
            this.zze.zzb.zzA().execute(new zzemw(this));
            if (!((Boolean) zzbjh.zzc.zze()).booleanValue() || (zzfhq = this.zzb) == null) {
                zzfhs zze2 = this.zze.zze;
                zzfhg zzfhg = this.zzc;
                zzfhg.zzb(zzcxw.zzp().zzb);
                zzfhg.zzc(zzcxw.zzl().zzg());
                zzfhg.zze(true);
                zze2.zzb(zzfhg.zzj());
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
