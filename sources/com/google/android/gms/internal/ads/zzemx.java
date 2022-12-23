package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzemx implements Runnable {
    public final /* synthetic */ zzemy zza;
    public final /* synthetic */ zze zzb;

    public /* synthetic */ zzemx(zzemy zzemy, zze zze) {
        this.zza = zzemy;
        this.zzb = zze;
    }

    public final void run() {
        zzemy zzemy = this.zza;
        zzemy.zze.zzd.zza().zza(this.zzb);
    }
}
