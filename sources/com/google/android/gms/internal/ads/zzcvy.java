package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcvy implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;
    private final zzgqh zzj;

    public zzcvy(zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3, zzgqh zzgqh4, zzgqh zzgqh5, zzgqh zzgqh6, zzgqh zzgqh7, zzgqh zzgqh8, zzgqh zzgqh9, zzgqh zzgqh10) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
        this.zzc = zzgqh3;
        this.zzd = zzgqh4;
        this.zze = zzgqh5;
        this.zzf = zzgqh6;
        this.zzg = zzgqh7;
        this.zzh = zzgqh8;
        this.zzi = zzgqh9;
        this.zzj = zzgqh10;
    }

    public static zzcvx zzc(zzcxv zzcxv, Context context, zzfbh zzfbh, View view, zzcli zzcli, zzcxu zzcxu, zzdnr zzdnr, zzdjh zzdjh, zzgpo zzgpo, Executor executor) {
        return new zzcvx(zzcxv, context, zzfbh, view, zzcli, zzcxu, zzdnr, zzdjh, zzgpo, executor);
    }

    /* renamed from: zza */
    public final zzcvx zzb() {
        return new zzcvx(((zzczr) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcwe) this.zzc).zza(), ((zzcwd) this.zzd).zza(), ((zzcwp) this.zze).zza(), ((zzcwf) this.zzf).zza(), ((zzdlr) this.zzg).zza(), (zzdjh) this.zzh.zzb(), zzgpt.zza(this.zzi), (Executor) this.zzj.zzb());
    }
}
