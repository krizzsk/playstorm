package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzejf implements zzfoi {
    public final /* synthetic */ zzejj zza;
    public final /* synthetic */ zzcli zzb;
    public final /* synthetic */ zzfbg zzc;
    public final /* synthetic */ zzdst zzd;

    public /* synthetic */ zzejf(zzejj zzejj, zzcli zzcli, zzfbg zzfbg, zzdst zzdst) {
        this.zza = zzejj;
        this.zzb = zzcli;
        this.zzc = zzfbg;
        this.zzd = zzdst;
    }

    public final Object apply(Object obj) {
        zzcli zzcli = this.zzb;
        zzfbg zzfbg = this.zzc;
        zzdst zzdst = this.zzd;
        if (zzfbg.zzN) {
            zzcli.zzag();
        }
        zzcli.zzaa();
        zzcli.onPause();
        return zzdst.zzk();
    }
}
