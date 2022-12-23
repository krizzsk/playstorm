package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbwh implements zzo {
    final /* synthetic */ zzbwj zza;

    zzbwh(zzbwj zzbwj) {
        this.zza = zzbwj;
    }

    public final void zzb() {
        zzcfi.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbwj zzbwj = this.zza;
        zzbwj.zzb.onAdOpened(zzbwj);
    }

    public final void zzbC() {
        zzcfi.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    public final void zzbK() {
        zzcfi.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zzbr() {
        zzcfi.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void zze() {
    }

    public final void zzf(int i) {
        zzcfi.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbwj zzbwj = this.zza;
        zzbwj.zzb.onAdClosed(zzbwj);
    }
}
