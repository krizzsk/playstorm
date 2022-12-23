package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbwi implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbwj zzb;

    zzbwi(zzbwj zzbwj, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzb = zzbwj;
        this.zza = adOverlayInfoParcel;
    }

    public final void run() {
        zzt.zzj();
        zzm.zza(this.zzb.zza, this.zza, true);
    }
}
