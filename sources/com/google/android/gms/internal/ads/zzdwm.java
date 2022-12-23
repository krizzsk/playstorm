package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzdwm implements Runnable {
    public final /* synthetic */ zzdwn zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdwm(zzdwn zzdwn, String str) {
        this.zza = zzdwn;
        this.zzb = str;
    }

    public final void run() {
        zzdwn zzdwn = this.zza;
        zzdwn.zzd.zza(this.zzb);
    }
}
