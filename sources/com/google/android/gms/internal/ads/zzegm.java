package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzegm implements zzdlf {
    public final /* synthetic */ zzcga zza;

    public /* synthetic */ zzegm(zzcga zzcga) {
        this.zza = zzcga;
    }

    public final void zza(boolean z, Context context, zzdcf zzdcf) {
        zzcga zzcga = this.zza;
        try {
            zzt.zzj();
            zzm.zza(context, (AdOverlayInfoParcel) zzcga.get(), true);
        } catch (Exception unused) {
        }
    }
}
