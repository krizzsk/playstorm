package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzbrt implements Runnable {
    public final /* synthetic */ zzbsl zza;
    public final /* synthetic */ zzbsk zzb;
    public final /* synthetic */ zzbrg zzc;

    public /* synthetic */ zzbrt(zzbsl zzbsl, zzbsk zzbsk, zzbrg zzbrg) {
        this.zza = zzbsl;
        this.zzb = zzbsk;
        this.zzc = zzbrg;
    }

    public final void run() {
        this.zza.zzi(this.zzb, this.zzc);
    }
}
