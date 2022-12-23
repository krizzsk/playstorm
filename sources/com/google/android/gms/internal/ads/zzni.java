package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzni implements Runnable {
    public final /* synthetic */ zznk zza;
    public final /* synthetic */ zzad zzb;
    public final /* synthetic */ zzgn zzc;

    public /* synthetic */ zzni(zznk zznk, zzad zzad, zzgn zzgn) {
        this.zza = zznk;
        this.zzb = zzad;
        this.zzc = zzgn;
    }

    public final void run() {
        this.zza.zzn(this.zzb, this.zzc);
    }
}
