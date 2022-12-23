package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzdyg implements zzfuw {
    final /* synthetic */ zzdyi zza;

    zzdyg(zzdyi zzdyi) {
        this.zza = zzdyi;
    }

    public final void zza(Throwable th) {
        synchronized (this) {
            this.zza.zzc = true;
            this.zza.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (zzt.zzA().elapsedRealtime() - this.zza.zzd));
            this.zza.zze.zze(new Exception());
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            this.zza.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (zzt.zzA().elapsedRealtime() - this.zza.zzd));
            this.zza.zzi.execute(new zzdyf(this, str));
        }
    }
}
