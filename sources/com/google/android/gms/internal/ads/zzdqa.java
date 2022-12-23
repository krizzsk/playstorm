package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzdqa implements zzcmt {
    public final /* synthetic */ zzcfz zza;

    public /* synthetic */ zzdqa(zzcfz zzcfz) {
        this.zza = zzcfz;
    }

    public final void zza(boolean z) {
        zzcfz zzcfz = this.zza;
        if (z) {
            zzcfz.zzb();
        } else {
            zzcfz.zze(new zzeio(1, "Image Web View failed to load."));
        }
    }
}
