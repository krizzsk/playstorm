package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdxd implements zzden, zza, zzdbs, zzdcm, zzdcn, zzddg, zzdbv, zzarb, zzfgf {
    private final List zza;
    private final zzdwr zzb;
    private long zzc;

    public zzdxd(zzdwr zzdwr, zzcnf zzcnf) {
        this.zzb = zzdwr;
        this.zza = Collections.singletonList(zzcnf);
    }

    private final void zze(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(String.valueOf(cls.getSimpleName())), str, objArr);
    }

    public final void onAdClicked() {
        zze(zza.class, "onAdClicked", new Object[0]);
    }

    public final void zza(zze zze) {
        zze(zzdbv.class, "onAdFailedToLoad", Integer.valueOf(zze.zza), zze.zzb, zze.zzc);
    }

    public final void zzb(zzfbs zzfbs) {
    }

    public final void zzbE(zzbzu zzbzu) {
        this.zzc = zzt.zzA().elapsedRealtime();
        zze(zzden.class, "onAdRequest", new Object[0]);
    }

    public final void zzbF(zzffy zzffy, String str) {
        zze(zzffx.class, "onTaskCreated", str);
    }

    public final void zzbG(zzffy zzffy, String str, Throwable th) {
        zze(zzffx.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    public final void zzbq(Context context) {
        zze(zzdcn.class, "onDestroy", context);
    }

    public final void zzbs(Context context) {
        zze(zzdcn.class, "onPause", context);
    }

    public final void zzbt(Context context) {
        zze(zzdcn.class, "onResume", context);
    }

    public final void zzbu(String str, String str2) {
        zze(zzarb.class, "onAppEvent", str, str2);
    }

    public final void zzbv() {
        zze(zzdbs.class, "onRewardedVideoCompleted", new Object[0]);
    }

    public final void zzc(zzffy zzffy, String str) {
        zze(zzffx.class, "onTaskStarted", str);
    }

    public final void zzd(zzffy zzffy, String str) {
        zze(zzffx.class, "onTaskSucceeded", str);
    }

    public final void zzj() {
        zze(zzdbs.class, "onAdClosed", new Object[0]);
    }

    public final void zzl() {
        zze(zzdcm.class, "onAdImpression", new Object[0]);
    }

    public final void zzm() {
        zze(zzdbs.class, "onAdLeftApplication", new Object[0]);
    }

    public final void zzn() {
        long elapsedRealtime = zzt.zzA().elapsedRealtime();
        long j = this.zzc;
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (elapsedRealtime - j));
        zze(zzddg.class, "onAdLoaded", new Object[0]);
    }

    public final void zzo() {
        zze(zzdbs.class, "onAdOpened", new Object[0]);
    }

    @ParametersAreNonnullByDefault
    public final void zzp(zzcak zzcak, String str, String str2) {
        zze(zzdbs.class, "onRewarded", zzcak, str, str2);
    }

    public final void zzr() {
        zze(zzdbs.class, "onRewardedVideoStarted", new Object[0]);
    }
}
