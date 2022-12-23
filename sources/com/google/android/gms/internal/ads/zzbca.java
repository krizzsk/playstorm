package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzbca extends zzbch {
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzbca(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    public final void zzb(int i) {
    }

    public final void zzc(zze zze) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zze.zzb());
        }
    }

    public final void zzd(zzbcf zzbcf) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzbcb(zzbcf, this.zzb));
        }
    }
}
