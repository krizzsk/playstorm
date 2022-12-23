package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzegz implements zzfoi {
    public final /* synthetic */ zzehb zza;
    public final /* synthetic */ zzcli zzb;
    public final /* synthetic */ zzfbg zzc;
    public final /* synthetic */ zzdjz zzd;

    public /* synthetic */ zzegz(zzehb zzehb, zzcli zzcli, zzfbg zzfbg, zzdjz zzdjz) {
        this.zza = zzehb;
        this.zzb = zzcli;
        this.zzc = zzfbg;
        this.zzd = zzdjz;
    }

    public final Object apply(Object obj) {
        zzcli zzcli = this.zzb;
        zzfbg zzfbg = this.zzc;
        zzdjz zzdjz = this.zzd;
        if (zzfbg.zzN) {
            zzcli.zzag();
        }
        zzcli.zzaa();
        zzcli.onPause();
        return zzdjz.zzg();
    }
}
