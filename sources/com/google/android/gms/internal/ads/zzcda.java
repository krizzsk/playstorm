package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzcda implements Runnable {
    public final /* synthetic */ zzcdn zza;
    public final /* synthetic */ zzcdm zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzcda(zzcdn zzcdn, zzcdm zzcdm, String str) {
        this.zza = zzcdn;
        this.zzb = zzcdm;
        this.zzc = str;
    }

    public final void run() {
        this.zza.zzj(this.zzb, this.zzc);
    }
}
