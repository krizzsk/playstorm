package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzsi implements Runnable {
    public final /* synthetic */ zzsk zza;
    public final /* synthetic */ zzsl zzb;
    public final /* synthetic */ zzrs zzc;
    public final /* synthetic */ zzrx zzd;

    public /* synthetic */ zzsi(zzsk zzsk, zzsl zzsl, zzrs zzrs, zzrx zzrx) {
        this.zza = zzsk;
        this.zzb = zzsl;
        this.zzc = zzrs;
        this.zzd = zzrx;
    }

    public final void run() {
        zzsk zzsk = this.zza;
        this.zzb.zzah(zzsk.zza, zzsk.zzb, this.zzc, this.zzd);
    }
}
