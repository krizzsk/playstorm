package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdta implements zzgpu {
    private final zzgqh zza;

    public zzdta(zzgqh zzgqh) {
        this.zza = zzgqh;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbdv zzbdv;
        if (((zzdbj) this.zza).zza().zzo.zza == 3) {
            zzbdv = zzbdv.REWARDED_INTERSTITIAL;
        } else {
            zzbdv = zzbdv.REWARD_BASED_VIDEO_AD;
        }
        zzgqc.zzb(zzbdv);
        return zzbdv;
    }
}
