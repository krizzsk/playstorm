package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzair implements Runnable {
    private final zzajb zza;
    private final zzajh zzb;
    private final Runnable zzc;

    public zzair(zzajb zzajb, zzajh zzajh, Runnable runnable) {
        this.zza = zzajb;
        this.zzb = zzajh;
        this.zzc = runnable;
    }

    public final void run() {
        this.zza.zzw();
        zzajh zzajh = this.zzb;
        if (zzajh.zzc()) {
            this.zza.zzo(zzajh.zza);
        } else {
            this.zza.zzn(zzajh.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
