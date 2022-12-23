package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final class zzf {
    final zzax zza = new zzax();
    final zzg zzb;
    final zzg zzc;
    final zzj zzd;

    public zzf() {
        zzg zzg = new zzg((zzg) null, this.zza);
        this.zzc = zzg;
        this.zzb = zzg.zza();
        this.zzd = new zzj();
        this.zzc.zzg("require", new zzw(this.zzd));
        this.zzd.zza("internal.platform", zze.zza);
        this.zzc.zzg("runtime.counter", new zzah(Double.valueOf(0.0d)));
    }

    public final zzap zza(zzg zzg, zzgx... zzgxArr) {
        zzap zzap = zzap.zzf;
        for (zzgx zza2 : zzgxArr) {
            zzap = zzi.zza(zza2);
            zzh.zzc(this.zzc);
            if ((zzap instanceof zzaq) || (zzap instanceof zzao)) {
                zzap = this.zza.zza(zzg, zzap);
            }
        }
        return zzap;
    }
}
