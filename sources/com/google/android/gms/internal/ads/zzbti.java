package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbti {
    private final zzbsl zza;
    private zzfvj zzb;

    zzbti(zzbsl zzbsl) {
        this.zza = zzbsl;
    }

    private final void zzd() {
        if (this.zzb == null) {
            zzcga zzcga = new zzcga();
            this.zzb = zzcga;
            this.zza.zzb((zzaoc) null).zzi(new zzbtg(zzcga), new zzbth(zzcga));
        }
    }

    public final zzbtl zza(String str, zzbss zzbss, zzbsr zzbsr) {
        zzd();
        return new zzbtl(this.zzb, "google.afma.activeView.handleUpdate", zzbss, zzbsr);
    }

    public final void zzb(String str, zzbol zzbol) {
        zzd();
        this.zzb = zzfva.zzn(this.zzb, new zzbte(str, zzbol), zzcfv.zzf);
    }

    public final void zzc(String str, zzbol zzbol) {
        this.zzb = zzfva.zzm(this.zzb, new zzbtf(str, zzbol), zzcfv.zzf);
    }
}
