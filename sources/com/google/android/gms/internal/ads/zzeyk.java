package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeyk implements zzeyv {
    private zzdbb zza;

    /* renamed from: zza */
    public final synchronized zzdbb zzd() {
        return this.zza;
    }

    public final /* bridge */ /* synthetic */ zzfvj zzc(zzeyw zzeyw, zzeyu zzeyu, Object obj) {
        return zzb(zzeyw, zzeyu, (zzdbb) null);
    }

    public final synchronized zzfvj zzb(zzeyw zzeyw, zzeyu zzeyu, zzdbb zzdbb) {
        zzcyz zzb;
        if (zzdbb != null) {
            this.zza = zzdbb;
        } else {
            this.zza = (zzdbb) zzeyu.zza(zzeyw.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzh(zzb.zzi());
    }
}
