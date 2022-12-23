package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcqj implements zzezm {
    private final zzcrb zza;
    private final zzcqj zzb = this;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;

    /* synthetic */ zzcqj(zzcrb zzcrb, Context context, String str, zzq zzq, zzcqi zzcqi) {
        this.zza = zzcrb;
        this.zzc = zzgpv.zza(context);
        this.zzd = zzgpv.zza(zzq);
        this.zze = zzgpv.zza(str);
        this.zzf = zzgpt.zzc(new zzemd(this.zza.zzo));
        this.zzg = zzgpt.zzc(new zzfak(this.zza.zzaw));
        zzgqh zzgqh = this.zzc;
        zzcrb zzcrb2 = this.zza;
        zzgqh zzc2 = zzgpt.zzc(new zzezk(zzgqh, zzcrb2.zzp, zzcrb2.zzQ, this.zzf, this.zzg, zzfca.zza()));
        this.zzh = zzc2;
        this.zzi = zzgpt.zzc(new zzeml(this.zzc, this.zzd, this.zze, zzc2, this.zzf, this.zzg, this.zza.zzi));
    }

    public final zzemk zza() {
        return (zzemk) this.zzi.zzb();
    }
}
