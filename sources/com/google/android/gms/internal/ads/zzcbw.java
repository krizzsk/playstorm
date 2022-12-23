package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzcbw extends zzcbj {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzcbx zzb;

    public zzcbw(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzcbx zzcbx) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzcbx;
    }

    public final void zze(int i) {
    }

    public final void zzf(zze zze) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zze.zzb());
        }
    }

    public final void zzg() {
        zzcbx zzcbx;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null && (zzcbx = this.zzb) != null) {
            rewardedInterstitialAdLoadCallback.onAdLoaded(zzcbx);
        }
    }
}
