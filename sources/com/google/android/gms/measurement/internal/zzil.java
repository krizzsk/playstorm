package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzil implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzip zzb;

    zzil(zzip zzip, boolean z) {
        this.zzb = zzip;
        this.zza = z;
    }

    public final void run() {
        boolean zzJ = this.zzb.zzs.zzJ();
        boolean zzI = this.zzb.zzs.zzI();
        this.zzb.zzs.zzF(this.zza);
        if (zzI == this.zza) {
            this.zzb.zzs.zzay().zzj().zzb("Default data collection state already set to", Boolean.valueOf(this.zza));
        }
        if (this.zzb.zzs.zzJ() == zzJ || this.zzb.zzs.zzJ() != this.zzb.zzs.zzI()) {
            this.zzb.zzs.zzay().zzl().zzc("Default data collection is different than actual status", Boolean.valueOf(this.zza), Boolean.valueOf(zzJ));
        }
        this.zzb.zzae();
    }
}
