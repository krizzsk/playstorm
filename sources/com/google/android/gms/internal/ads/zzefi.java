package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzefi implements zzfoi {
    public final /* synthetic */ zzefl zza;
    public final /* synthetic */ zzcli zzb;
    public final /* synthetic */ zzfbg zzc;
    public final /* synthetic */ zzcvf zzd;

    public /* synthetic */ zzefi(zzefl zzefl, zzcli zzcli, zzfbg zzfbg, zzcvf zzcvf) {
        this.zza = zzefl;
        this.zzb = zzcli;
        this.zzc = zzfbg;
        this.zzd = zzcvf;
    }

    public final Object apply(Object obj) {
        zzcli zzcli = this.zzb;
        zzfbg zzfbg = this.zzc;
        zzcvf zzcvf = this.zzd;
        if (zzfbg.zzN) {
            zzcli.zzag();
        }
        zzcli.zzaa();
        zzcli.onPause();
        return zzcvf.zza();
    }
}
