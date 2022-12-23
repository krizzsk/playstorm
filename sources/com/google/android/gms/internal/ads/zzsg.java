package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzsg implements Runnable {
    public final /* synthetic */ zzsk zza;
    public final /* synthetic */ zzsl zzb;
    public final /* synthetic */ zzrs zzc;
    public final /* synthetic */ zzrx zzd;
    public final /* synthetic */ IOException zze;
    public final /* synthetic */ boolean zzf;

    public /* synthetic */ zzsg(zzsk zzsk, zzsl zzsl, zzrs zzrs, zzrx zzrx, IOException iOException, boolean z) {
        this.zza = zzsk;
        this.zzb = zzsl;
        this.zzc = zzrs;
        this.zzd = zzrx;
        this.zze = iOException;
        this.zzf = z;
    }

    public final void run() {
        zzsk zzsk = this.zza;
        this.zzb.zzai(zzsk.zza, zzsk.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
