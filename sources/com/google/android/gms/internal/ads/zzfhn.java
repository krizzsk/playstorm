package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfhn implements zzfuw {
    final /* synthetic */ zzfhq zza;
    final /* synthetic */ zzfhg zzb;

    zzfhn(zzfhq zzfhq, zzfhg zzfhg, boolean z) {
        this.zza = zzfhq;
        this.zzb = zzfhg;
    }

    public final void zza(Throwable th) {
        zzfhg zzfhg = this.zzb;
        if (zzfhg.zzh()) {
            zzfhq zzfhq = this.zza;
            zzfhg.zze(false);
            zzfhq.zza(zzfhg);
        }
    }

    public final void zzb(Object obj) {
        zzfhq zzfhq = this.zza;
        zzfhg zzfhg = this.zzb;
        zzfhg.zze(true);
        zzfhq.zza(zzfhg);
    }
}
