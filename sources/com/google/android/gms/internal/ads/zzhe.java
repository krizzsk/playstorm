package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzhe {
    final Context zza;
    final zzcx zzb = zzcx.zza;
    final zzfph zzc;
    final zzfph zzd;
    zzfph zze;
    zzfph zzf;
    final zzfph zzg;
    final zzfoi zzh;
    final Looper zzi = zzeg.zzD();
    final zzi zzj = zzi.zza;
    final zzjx zzk = zzjx.zze;
    boolean zzl;
    final zzgp zzm = new zzgp(0.97f, 1.03f, 1000, 1.0E-7f, zzeg.zzv(20), zzeg.zzv(500), 0.999f, (zzgo) null);

    public zzhe(Context context, zzckr zzckr, byte[] bArr) {
        zzgy zzgy = new zzgy(zzckr, (byte[]) null);
        zzgz zzgz = new zzgz(context);
        zzha zzha = new zzha(context);
        zzhb zzhb = zzhb.zza;
        zzhc zzhc = new zzhc(context);
        zzhd zzhd = zzhd.zza;
        this.zza = context;
        this.zzc = zzgy;
        this.zzd = zzgz;
        this.zze = zzha;
        this.zzf = zzhb;
        this.zzg = zzhc;
        this.zzh = zzhd;
    }

    static /* synthetic */ zzsa zza(Context context) {
        return new zzro(context, new zzyo());
    }
}
