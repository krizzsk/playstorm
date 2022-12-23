package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final /* synthetic */ class zzdv implements Runnable {
    public final /* synthetic */ zzee zza;
    public final /* synthetic */ OnInitializationCompleteListener zzb;

    public /* synthetic */ zzdv(zzee zzee, OnInitializationCompleteListener onInitializationCompleteListener) {
        this.zza = zzee;
        this.zzb = onInitializationCompleteListener;
    }

    public final void run() {
        this.zza.zzm(this.zzb);
    }
}
