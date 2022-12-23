package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfef implements zzfuw {
    final /* synthetic */ zzfei zza;
    final /* synthetic */ zzfej zzb;

    zzfef(zzfej zzfej, zzfei zzfei) {
        this.zzb = zzfej;
        this.zza = zzfei;
    }

    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Void voidR = (Void) obj;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            this.zzb.zzd.addFirst(this.zza);
            zzfej zzfej = this.zzb;
            if (zzfej.zzf == 1) {
                zzfej.zzh();
            }
        }
    }
}
