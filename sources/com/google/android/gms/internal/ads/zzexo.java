package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzexo implements Runnable {
    public final /* synthetic */ zzexp zza;
    public final /* synthetic */ zze zzb;

    public /* synthetic */ zzexo(zzexp zzexp, zze zze) {
        this.zza = zzexp;
        this.zzb = zze;
    }

    public final void run() {
        zzexp zzexp = this.zza;
        zzexp.zze.zzd.zza(this.zzb);
    }
}
