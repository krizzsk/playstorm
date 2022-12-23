package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzxn implements Runnable {
    public final /* synthetic */ zzxq zza;
    public final /* synthetic */ zzad zzb;
    public final /* synthetic */ zzgn zzc;

    public /* synthetic */ zzxn(zzxq zzxq, zzad zzad, zzgn zzgn) {
        this.zza = zzxq;
        this.zzb = zzad;
        this.zzc = zzgn;
    }

    public final void run() {
        this.zza.zzl(this.zzb, this.zzc);
    }
}
