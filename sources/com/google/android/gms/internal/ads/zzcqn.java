package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcqn implements zzfba {
    private final zzcrb zza;
    private final zzcqn zzb = this;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;
    private final zzgqh zzj;

    /* synthetic */ zzcqn(zzcrb zzcrb, Context context, String str, zzcqm zzcqm) {
        this.zza = zzcrb;
        zzgpu zza2 = zzgpv.zza(context);
        this.zzc = zza2;
        zzcrb zzcrb2 = this.zza;
        this.zzd = new zzeza(zza2, zzcrb2.zzaw, zzcrb2.zzax);
        this.zze = zzgpt.zzc(new zzfak(zzcrb2.zzaw));
        this.zzf = zzgpt.zzc(zzfbv.zza());
        zzgqh zzgqh = this.zzc;
        zzcrb zzcrb3 = this.zza;
        zzgqh zzc2 = zzgpt.zzc(new zzfau(zzgqh, zzcrb3.zzp, zzcrb3.zzQ, this.zzd, this.zze, zzfca.zza(), this.zzf));
        this.zzg = zzc2;
        this.zzh = zzgpt.zzc(new zzfbe(zzc2, this.zze, this.zzf));
        zzgpu zzc3 = zzgpv.zzc(str);
        this.zzi = zzc3;
        this.zzj = zzgpt.zzc(new zzfay(zzc3, this.zzg, this.zzc, this.zze, this.zzf, this.zza.zzi));
    }

    public final zzfax zza() {
        return (zzfax) this.zzj.zzb();
    }

    public final zzfbd zzb() {
        return (zzfbd) this.zzh.zzb();
    }
}
