package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzchd implements Runnable {
    final /* synthetic */ zzchf zza;

    zzchd(zzchf zzchf) {
        this.zza = zzchf;
    }

    public final void run() {
        this.zza.zzJ("surfaceDestroyed", new String[0]);
    }
}
