package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcpl implements zzext {
    private final Context zza;
    private final zzq zzb;
    private final String zzc;
    private final zzcrb zzd;
    private final zzcpl zze = this;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;
    private final zzgqh zzj;
    private final zzgqh zzk;

    /* synthetic */ zzcpl(zzcrb zzcrb, Context context, String str, zzq zzq, zzcpk zzcpk) {
        this.zzd = zzcrb;
        this.zza = context;
        this.zzb = zzq;
        this.zzc = str;
        this.zzf = zzgpv.zza(context);
        this.zzg = zzgpv.zza(zzq);
        this.zzh = zzgpt.zzc(new zzemd(this.zzd.zzo));
        this.zzi = zzgpt.zzc(zzemi.zza());
        this.zzj = zzgpt.zzc(zzdgp.zza());
        zzgqh zzgqh = this.zzf;
        zzcrb zzcrb2 = this.zzd;
        this.zzk = zzgpt.zzc(new zzexr(zzgqh, zzcrb2.zzp, this.zzg, zzcrb2.zzQ, this.zzh, this.zzi, zzfca.zza(), this.zzj));
    }

    public final zzelj zza() {
        zzcfo zzd2 = this.zzd.zza.zzd();
        zzgqc.zzb(zzd2);
        return new zzelj(this.zza, this.zzb, this.zzc, (zzexq) this.zzk.zzb(), (zzemc) this.zzh.zzb(), zzd2);
    }
}
