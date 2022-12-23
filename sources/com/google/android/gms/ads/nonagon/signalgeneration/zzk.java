package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdsd;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzk implements Runnable {
    public final /* synthetic */ zzz zza;
    public final /* synthetic */ zzdsd[] zzb;

    public /* synthetic */ zzk(zzz zzz, zzdsd[] zzdsdArr) {
        this.zza = zzz;
        this.zzb = zzdsdArr;
    }

    public final void run() {
        this.zza.zzG(this.zzb);
    }
}
