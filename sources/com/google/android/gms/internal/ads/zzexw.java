package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzexw implements zzeyv {
    private zzdbb zza;
    private final Executor zzb = zzfvq.zzb();

    public final zzdbb zza() {
        return this.zza;
    }

    public final zzfvj zzb(zzeyw zzeyw, zzeyu zzeyu, zzdbb zzdbb) {
        zzdba zza2 = zzeyu.zza(zzeyw.zzb);
        zza2.zzb(new zzezb(true));
        zzdbb zzdbb2 = (zzdbb) zza2.zzh();
        this.zza = zzdbb2;
        zzcyz zzb2 = zzdbb2.zzb();
        zzfdw zzfdw = new zzfdw();
        return zzfva.zzm(zzfva.zzn(zzfur.zzv(zzb2.zzi()), new zzexu(this, zzfdw, zzb2), this.zzb), new zzexv(zzfdw), this.zzb);
    }

    public final /* bridge */ /* synthetic */ zzfvj zzc(zzeyw zzeyw, zzeyu zzeyu, Object obj) {
        return zzb(zzeyw, zzeyu, (zzdbb) null);
    }

    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
