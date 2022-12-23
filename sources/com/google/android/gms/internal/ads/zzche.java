package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzche implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzchf zzb;

    zzche(zzchf zzchf, boolean z) {
        this.zzb = zzchf;
        this.zza = z;
    }

    public final void run() {
        this.zzb.zzJ("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
