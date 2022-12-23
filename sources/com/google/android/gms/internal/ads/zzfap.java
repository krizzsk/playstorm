package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzfap implements Runnable {
    public final /* synthetic */ zzfaq zza;
    public final /* synthetic */ zze zzb;

    public /* synthetic */ zzfap(zzfaq zzfaq, zze zze) {
        this.zza = zzfaq;
        this.zzb = zze;
    }

    public final void run() {
        zzfaq zzfaq = this.zza;
        zzfaq.zze.zzd.zza(this.zzb);
    }
}
