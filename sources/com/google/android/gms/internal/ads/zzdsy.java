package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdsy implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzdsy(zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
        this.zzc = zzgqh3;
    }

    public final /* synthetic */ Object zzb() {
        zzgqh zzgqh = this.zza;
        zzgqh zzgqh2 = this.zzb;
        int i = ((zzdbj) this.zzc).zza().zzo.zza;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 0) {
            return ((zzejz) zzgqh2).zzb();
        } else {
            return ((zzejz) zzgqh).zzb();
        }
    }
}
