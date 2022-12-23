package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzaim implements Runnable {
    final /* synthetic */ zzajb zza;
    final /* synthetic */ zzain zzb;

    zzaim(zzain zzain, zzajb zzajb) {
        this.zzb = zzain;
        this.zza = zzajb;
    }

    public final void run() {
        try {
            this.zzb.zzc.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
