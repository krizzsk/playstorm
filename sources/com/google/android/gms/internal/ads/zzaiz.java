package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzaiz implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzajb zzc;

    zzaiz(zzajb zzajb, String str, long j) {
        this.zzc = zzajb;
        this.zza = str;
        this.zzb = j;
    }

    public final void run() {
        this.zzc.zza.zza(this.zza, this.zzb);
        zzajb zzajb = this.zzc;
        zzajb.zza.zzb(zzajb.toString());
    }
}
