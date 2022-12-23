package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdvt implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzdvt(zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
        this.zzc = zzgqh3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdvr zzdvr = (zzdvr) this.zza.zzb();
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        return ((Boolean) zzay.zzc().zzb(zzbhy.zzhf)).booleanValue() ? new zzdiy((zzecx) this.zzc.zzb(), zzfvk) : new zzdiy(zzdvr, zzfvk);
    }
}
