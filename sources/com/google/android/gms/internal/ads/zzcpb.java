package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcpb implements zzewf {
    private final zzcrb zza;
    private final zzcpb zzb = this;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;
    private final zzgqh zzj;
    private final zzgqh zzk;

    /* synthetic */ zzcpb(zzcrb zzcrb, Context context, String str, zzcpa zzcpa) {
        this.zza = zzcrb;
        this.zzc = zzgpv.zza(context);
        this.zzd = zzgpv.zza(str);
        zzgqh zzgqh = this.zzc;
        zzcrb zzcrb2 = this.zza;
        this.zze = new zzeyz(zzgqh, zzcrb2.zzaw, zzcrb2.zzax);
        this.zzf = zzgpt.zzc(new zzexd(zzcrb2.zzaw));
        zzgqh zzgqh2 = this.zzc;
        zzcrb zzcrb3 = this.zza;
        this.zzg = zzgpt.zzc(new zzevx(zzgqh2, zzcrb3.zzp, zzcrb3.zzQ, this.zze, this.zzf, zzfca.zza(), zzcrb3.zzi));
        zzcrb zzcrb4 = this.zza;
        this.zzh = zzgpt.zzc(new zzewd(zzcrb4.zzQ, this.zzc, this.zzd, this.zzg, this.zzf, zzcrb4.zzi));
        zzgqh zzgqh3 = this.zzc;
        zzcrb zzcrb5 = this.zza;
        this.zzi = new zzeyy(zzgqh3, zzcrb5.zzaw, zzcrb5.zzax);
        this.zzj = zzgpt.zzc(new zzexf(zzgqh3, zzcrb5.zzp, zzcrb5.zzQ, this.zzi, this.zzf, zzfca.zza(), zzcrb5.zzi));
        zzcrb zzcrb6 = this.zza;
        this.zzk = zzgpt.zzc(new zzexl(zzcrb6.zzQ, this.zzc, this.zzd, this.zzj, this.zzf, zzcrb6.zzi));
    }

    public final zzewc zza() {
        return (zzewc) this.zzh.zzb();
    }

    public final zzexk zzb() {
        return (zzexk) this.zzk.zzb();
    }
}
