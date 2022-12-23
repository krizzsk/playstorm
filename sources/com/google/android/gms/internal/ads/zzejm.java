package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzejm implements Runnable {
    public final /* synthetic */ zzejn zza;
    public final /* synthetic */ zzfbs zzb;
    public final /* synthetic */ zzfbg zzc;
    public final /* synthetic */ zzefb zzd;

    public /* synthetic */ zzejm(zzejn zzejn, zzfbs zzfbs, zzfbg zzfbg, zzefb zzefb) {
        this.zza = zzejn;
        this.zzb = zzfbs;
        this.zzc = zzfbg;
        this.zzd = zzefb;
    }

    public final void run() {
        zzejn zzejn = this.zza;
        zzejp.zze(this.zzb, this.zzc, this.zzd);
    }
}
