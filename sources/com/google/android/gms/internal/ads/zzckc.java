package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzckc implements Runnable {
    public final /* synthetic */ zzchr zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzckc(zzchr zzchr, boolean z, long j) {
        this.zza = zzchr;
        this.zzb = z;
        this.zzc = j;
    }

    public final void run() {
        zzchr zzchr = this.zza;
        boolean z = this.zzb;
        long j = this.zzc;
        int i = zzckd.zzd;
        zzchr.zzx(z, j);
    }
}
