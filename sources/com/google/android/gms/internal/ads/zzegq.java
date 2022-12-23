package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzegq implements Runnable {
    public final /* synthetic */ zzegs zza;
    public final /* synthetic */ zzfbs zzb;
    public final /* synthetic */ zzfbg zzc;

    public /* synthetic */ zzegq(zzegs zzegs, zzfbs zzfbs, zzfbg zzfbg) {
        this.zza = zzegs;
        this.zzb = zzfbs;
        this.zzc = zzfbg;
    }

    public final void run() {
        this.zza.zzf(this.zzb, this.zzc);
    }
}
