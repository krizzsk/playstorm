package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeyl implements zzeyv {
    private final zzeyv zza;
    private zzdbb zzb;

    public zzeyl(zzeyv zzeyv) {
        this.zza = zzeyv;
    }

    /* renamed from: zza */
    public final synchronized zzdbb zzd() {
        return this.zzb;
    }

    public final synchronized zzfvj zzb(zzeyw zzeyw, zzeyu zzeyu, zzdbb zzdbb) {
        this.zzb = zzdbb;
        if (zzeyw.zza != null) {
            zzcyz zzb2 = this.zzb.zzb();
            return zzb2.zzh(zzb2.zzj(zzfva.zzi(zzeyw.zza)));
        }
        return ((zzeyk) this.zza).zzb(zzeyw, zzeyu, zzdbb);
    }

    public final /* bridge */ /* synthetic */ zzfvj zzc(zzeyw zzeyw, zzeyu zzeyu, Object obj) {
        return zzb(zzeyw, zzeyu, (zzdbb) null);
    }
}
