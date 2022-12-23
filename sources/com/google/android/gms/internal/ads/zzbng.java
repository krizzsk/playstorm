package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzbs;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
final class zzbng implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ zzbs zzb;
    final /* synthetic */ zzbnh zzc;

    zzbng(zzbnh zzbnh, AdManagerAdView adManagerAdView, zzbs zzbs) {
        this.zzc = zzbnh;
        this.zza = adManagerAdView;
        this.zzb = zzbs;
    }

    public final void run() {
        if (this.zza.zzb(this.zzb)) {
            this.zzc.zza.onAdManagerAdViewLoaded(this.zza);
        } else {
            zzcfi.zzj("Could not bind.");
        }
    }
}
