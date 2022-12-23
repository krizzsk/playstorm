package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zznd implements Runnable {
    public final /* synthetic */ zznk zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zznd(zznk zznk, long j) {
        this.zza = zznk;
        this.zzb = j;
    }

    public final void run() {
        this.zza.zzo(this.zzb);
    }
}
