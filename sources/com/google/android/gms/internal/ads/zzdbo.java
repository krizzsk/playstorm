package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdbo implements zzgpu {
    private final zzdbn zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;

    public zzdbo(zzdbn zzdbn, zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3, zzgqh zzgqh4) {
        this.zza = zzdbn;
        this.zzb = zzgqh;
        this.zzc = zzgqh2;
        this.zzd = zzgqh3;
        this.zze = zzgqh4;
    }

    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zzb.zzb();
        zzcfo zza2 = ((zzcnu) this.zzc).zza();
        zzfbg zza3 = ((zzcym) this.zzd).zza();
        zzccf zzccf = new zzccf();
        if (zza3.zzB != null) {
            return new zzccd(context, zza2, zza3.zzB, zza3.zzt.zzb, zzccf, (byte[]) null);
        }
        return null;
    }
}
