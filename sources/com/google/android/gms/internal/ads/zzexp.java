package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzexp implements zzfuw {
    final /* synthetic */ zzemr zza;
    final /* synthetic */ zzfhq zzb;
    final /* synthetic */ zzfhg zzc;
    final /* synthetic */ zzcwr zzd;
    final /* synthetic */ zzexq zze;

    zzexp(zzexq zzexq, zzemr zzemr, zzfhq zzfhq, zzfhg zzfhg, zzcwr zzcwr) {
        this.zze = zzexq;
        this.zza = zzemr;
        this.zzb = zzfhq;
        this.zzc = zzfhg;
        this.zzd = zzcwr;
    }

    public final void zza(Throwable th) {
        zzfhq zzfhq;
        zze zza2 = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zza(zza2);
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzgL)).booleanValue()) {
                this.zze.zzb.execute(new zzexo(this, zza2));
            }
            zzexq zzexq = this.zze;
            zzexq.zzh.zzd(zzexq.zzj.zzc());
            zzfcs.zzb(zza2.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbjh.zzc.zze()).booleanValue() || (zzfhq = this.zzb) == null) {
                zzfhs zzj = this.zze.zzi;
                zzfhg zzfhg = this.zzc;
                zzfhg.zza(zza2);
                zzfhg.zze(false);
                zzj.zzb(zzfhg.zzj());
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
        zzcvu zzcvu = (zzcvu) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zze.zzf.removeAllViews();
            if (zzcvu.zzc() != null) {
                ViewParent parent = zzcvu.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    String str = "";
                    if (zzcvu.zzl() != null) {
                        str = zzcvu.zzl().zzg();
                    }
                    com.google.android.gms.ads.internal.util.zze.zzj("Banner view provided from " + str + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcvu.zzc());
                }
            }
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzgL)).booleanValue()) {
                zzdfw zzn = zzcvu.zzn();
                zzn.zza(this.zze.zzd);
                zzn.zzc(this.zze.zze);
            }
            this.zze.zzf.addView(zzcvu.zzc());
            this.zza.zzb(zzcvu);
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzgL)).booleanValue()) {
                zzexq zzexq = this.zze;
                Executor zzk = zzexq.zzb;
                zzemc zzg = zzexq.zzd;
                zzg.getClass();
                zzk.execute(new zzexn(zzg));
            }
            this.zze.zzh.zzd(zzcvu.zza());
            if (!((Boolean) zzbjh.zzc.zze()).booleanValue() || (zzfhq = this.zzb) == null) {
                zzfhs zzj = this.zze.zzi;
                zzfhg zzfhg = this.zzc;
                zzfhg.zzb(zzcvu.zzp().zzb);
                zzfhg.zzc(zzcvu.zzl().zzg());
                zzfhg.zze(true);
                zzj.zzb(zzfhg.zzj());
            } else {
                zzfhq.zzf(zzcvu.zzp().zzb);
                zzfhq.zze(zzcvu.zzl().zzg());
                zzfhg zzfhg2 = this.zzc;
                zzfhg2.zze(true);
                zzfhq.zza(zzfhg2);
                zzfhq.zzg();
            }
        }
    }
}
