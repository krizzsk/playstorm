package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final /* synthetic */ class zzdx implements Runnable {
    public final /* synthetic */ zzee zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ OnInitializationCompleteListener zzc;

    public /* synthetic */ zzdx(zzee zzee, Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        this.zza = zzee;
        this.zzb = context;
        this.zzc = onInitializationCompleteListener;
    }

    public final void run() {
        this.zza.zzn(this.zzb, (String) null, this.zzc);
    }
}
