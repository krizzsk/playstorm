package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzeik implements zzfuw {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzfbg zzc;
    final /* synthetic */ zzfbj zzd;
    final /* synthetic */ zzfic zze;
    final /* synthetic */ zzfbs zzf;
    final /* synthetic */ zzeil zzg;

    zzeik(zzeil zzeil, long j, String str, zzfbg zzfbg, zzfbj zzfbj, zzfic zzfic, zzfbs zzfbs) {
        this.zzg = zzeil;
        this.zza = j;
        this.zzb = str;
        this.zzc = zzfbg;
        this.zzd = zzfbj;
        this.zze = zzfic;
        this.zzf = zzfbs;
    }

    public final void zza(Throwable th) {
        int i;
        zze zze2;
        long elapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof zzeia) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else {
            i = th instanceof zzfcd ? 5 : (!(th instanceof zzdzk) || zzfcx.zza(th).zza != 3) ? 6 : 1;
        }
        zzeil.zzg(this.zzg, this.zzb, i, elapsedRealtime, this.zzc.zzah);
        zzeil zzeil = this.zzg;
        if (zzeil.zze) {
            zzeil.zzb.zza(this.zzd, this.zzc, i, th instanceof zzefc ? (zzefc) th : null, elapsedRealtime);
        }
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzgV)).booleanValue()) {
            zzfig zzc2 = this.zzg.zzc;
            zzfic zzfic = this.zze;
            zzfbs zzfbs = this.zzf;
            zzfbg zzfbg = this.zzc;
            zzc2.zzd(zzfic.zza(zzfbs, zzfbg, zzfbg.zzo));
        }
        zze zza2 = zzfcx.zza(th);
        int i2 = zza2.zza;
        if ((i2 == 3 || i2 == 0) && (zze2 = zza2.zzd) != null && !zze2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza2 = zzfcx.zza(new zzefc(13, zza2.zzd));
        }
        this.zzg.zzf.zze(this.zzc, elapsedRealtime, zza2);
    }

    public final void zzb(Object obj) {
        long elapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        zzeil.zzg(this.zzg, this.zzb, 0, elapsedRealtime, this.zzc.zzah);
        zzeil zzeil = this.zzg;
        if (zzeil.zze) {
            zzeil.zzb.zza(this.zzd, this.zzc, 0, (zzefc) null, elapsedRealtime);
        }
        this.zzg.zzf.zzf(this.zzc, elapsedRealtime, (zze) null);
    }
}
