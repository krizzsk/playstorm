package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeyh implements zzeyv {
    private final zzfdn zza;
    private final Executor zzb;
    private final zzfuw zzc = new zzeyf(this);

    public zzeyh(zzfdn zzfdn, Executor executor) {
        this.zza = zzfdn;
        this.zzb = executor;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zza(zzdbb zzdbb, zzeyq zzeyq) throws Exception {
        zzfdx zzfdx = zzeyq.zzb;
        zzbzu zzbzu = zzeyq.zza;
        zzfdw zzb2 = zzfdx != null ? this.zza.zzb(zzfdx) : null;
        if (zzfdx == null) {
            return zzfva.zzi((Object) null);
        }
        if (!(zzb2 == null || zzbzu == null)) {
            zzfva.zzr(zzdbb.zzb().zzg(zzbzu), this.zzc, this.zzb);
        }
        return zzfva.zzi(new zzeyg(zzfdx, zzbzu, zzb2));
    }

    public final zzfvj zzb(zzeyw zzeyw, zzeyu zzeyu, zzdbb zzdbb) {
        return zzfva.zzf(zzfva.zzn(zzfur.zzv(new zzeyr(this.zza, zzdbb, this.zzb).zzc()), new zzeyd(this, zzdbb), this.zzb), Exception.class, new zzeye(this), this.zzb);
    }

    public final /* bridge */ /* synthetic */ zzfvj zzc(zzeyw zzeyw, zzeyu zzeyu, Object obj) {
        return zzb(zzeyw, zzeyu, (zzdbb) null);
    }

    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
