package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdxk {
    private final zzbpg zza;

    zzdxk(zzbpg zzbpg) {
        this.zza = zzbpg;
    }

    private final void zzs(zzdxj zzdxj) throws RemoteException {
        String zza2 = zzdxj.zza(zzdxj);
        zze.zzi("Dispatching AFMA event on publisher webview: ".concat(zza2));
        this.zza.zzb(zza2);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdxj("initialize", (zzdxi) null));
    }

    public final void zzb(long j) throws RemoteException {
        zzdxj zzdxj = new zzdxj("interstitial", (zzdxi) null);
        zzdxj.zza = Long.valueOf(j);
        zzdxj.zzc = "onAdClicked";
        this.zza.zzb(zzdxj.zza(zzdxj));
    }

    public final void zzc(long j) throws RemoteException {
        zzdxj zzdxj = new zzdxj("interstitial", (zzdxi) null);
        zzdxj.zza = Long.valueOf(j);
        zzdxj.zzc = "onAdClosed";
        zzs(zzdxj);
    }

    public final void zzd(long j, int i) throws RemoteException {
        zzdxj zzdxj = new zzdxj("interstitial", (zzdxi) null);
        zzdxj.zza = Long.valueOf(j);
        zzdxj.zzc = "onAdFailedToLoad";
        zzdxj.zzd = Integer.valueOf(i);
        zzs(zzdxj);
    }

    public final void zze(long j) throws RemoteException {
        zzdxj zzdxj = new zzdxj("interstitial", (zzdxi) null);
        zzdxj.zza = Long.valueOf(j);
        zzdxj.zzc = "onAdLoaded";
        zzs(zzdxj);
    }

    public final void zzf(long j) throws RemoteException {
        zzdxj zzdxj = new zzdxj("interstitial", (zzdxi) null);
        zzdxj.zza = Long.valueOf(j);
        zzdxj.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdxj);
    }

    public final void zzg(long j) throws RemoteException {
        zzdxj zzdxj = new zzdxj("interstitial", (zzdxi) null);
        zzdxj.zza = Long.valueOf(j);
        zzdxj.zzc = "onAdOpened";
        zzs(zzdxj);
    }

    public final void zzh(long j) throws RemoteException {
        zzdxj zzdxj = new zzdxj("creation", (zzdxi) null);
        zzdxj.zza = Long.valueOf(j);
        zzdxj.zzc = "nativeObjectCreated";
        zzs(zzdxj);
    }

    public final void zzi(long j) throws RemoteException {
        zzdxj zzdxj = new zzdxj("creation", (zzdxi) null);
        zzdxj.zza = Long.valueOf(j);
        zzdxj.zzc = "nativeObjectNotCreated";
        zzs(zzdxj);
    }

    public final void zzj(long j) throws RemoteException {
        zzdxj zzdxj = new zzdxj("rewarded", (zzdxi) null);
        zzdxj.zza = Long.valueOf(j);
        zzdxj.zzc = "onAdClicked";
        zzs(zzdxj);
    }

    public final void zzk(long j) throws RemoteException {
        zzdxj zzdxj = new zzdxj("rewarded", (zzdxi) null);
        zzdxj.zza = Long.valueOf(j);
        zzdxj.zzc = "onRewardedAdClosed";
        zzs(zzdxj);
    }

    public final void zzl(long j, zzcba zzcba) throws RemoteException {
        zzdxj zzdxj = new zzdxj("rewarded", (zzdxi) null);
        zzdxj.zza = Long.valueOf(j);
        zzdxj.zzc = "onUserEarnedReward";
        zzdxj.zze = zzcba.zzf();
        zzdxj.zzf = Integer.valueOf(zzcba.zze());
        zzs(zzdxj);
    }

    public final void zzm(long j, int i) throws RemoteException {
        zzdxj zzdxj = new zzdxj("rewarded", (zzdxi) null);
        zzdxj.zza = Long.valueOf(j);
        zzdxj.zzc = "onRewardedAdFailedToLoad";
        zzdxj.zzd = Integer.valueOf(i);
        zzs(zzdxj);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzdxj zzdxj = new zzdxj("rewarded", (zzdxi) null);
        zzdxj.zza = Long.valueOf(j);
        zzdxj.zzc = "onRewardedAdFailedToShow";
        zzdxj.zzd = Integer.valueOf(i);
        zzs(zzdxj);
    }

    public final void zzo(long j) throws RemoteException {
        zzdxj zzdxj = new zzdxj("rewarded", (zzdxi) null);
        zzdxj.zza = Long.valueOf(j);
        zzdxj.zzc = "onAdImpression";
        zzs(zzdxj);
    }

    public final void zzp(long j) throws RemoteException {
        zzdxj zzdxj = new zzdxj("rewarded", (zzdxi) null);
        zzdxj.zza = Long.valueOf(j);
        zzdxj.zzc = "onRewardedAdLoaded";
        zzs(zzdxj);
    }

    public final void zzq(long j) throws RemoteException {
        zzdxj zzdxj = new zzdxj("rewarded", (zzdxi) null);
        zzdxj.zza = Long.valueOf(j);
        zzdxj.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdxj);
    }

    public final void zzr(long j) throws RemoteException {
        zzdxj zzdxj = new zzdxj("rewarded", (zzdxi) null);
        zzdxj.zza = Long.valueOf(j);
        zzdxj.zzc = "onRewardedAdOpened";
        zzs(zzdxj);
    }
}
