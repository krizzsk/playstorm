package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzchw implements Runnable {
    public final /* synthetic */ zzcij zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzchw(zzcij zzcij, boolean z, long j) {
        this.zza = zzcij;
        this.zzb = z;
        this.zzc = j;
    }

    public final void run() {
        this.zza.zzI(this.zzb, this.zzc);
    }
}
