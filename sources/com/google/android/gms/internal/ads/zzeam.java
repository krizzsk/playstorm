package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzeam implements zzfuw {
    final /* synthetic */ zzean zza;

    zzeam(zzean zzean) {
        this.zza = zzean;
    }

    public final void zza(Throwable th) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzff)).booleanValue()) {
            Matcher matcher = zzean.zza.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zza.zzf.zzg(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfbs zzfbs = (zzfbs) obj;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzff)).booleanValue()) {
            this.zza.zzf.zzg(zzfbs.zzb.zzb.zze);
            this.zza.zzf.zzh(zzfbs.zzb.zzb.zzf);
        }
    }
}
