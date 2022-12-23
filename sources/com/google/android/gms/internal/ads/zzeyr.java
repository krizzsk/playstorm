package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzeyr {
    private final zzfdn zza;
    private final zzdbb zzb;
    private final Executor zzc;
    /* access modifiers changed from: private */
    public zzeyq zzd;

    public zzeyr(zzfdn zzfdn, zzdbb zzdbb, Executor executor) {
        this.zza = zzfdn;
        this.zzb = zzdbb;
        this.zzc = executor;
    }

    /* access modifiers changed from: private */
    @Deprecated
    public final zzfdx zze() {
        zzfby zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final zzfvj zzc() {
        zzfvj zzfvj;
        zzeyq zzeyq = this.zzd;
        if (zzeyq != null) {
            return zzfva.zzi(zzeyq);
        }
        if (!((Boolean) zzbju.zza.zze()).booleanValue()) {
            zzeyq zzeyq2 = new zzeyq((zzbzu) null, zze(), (zzeyp) null);
            this.zzd = zzeyq2;
            zzfvj = zzfva.zzi(zzeyq2);
        } else {
            zzfvj = zzfva.zzf(zzfva.zzm(zzfur.zzv(this.zzb.zzb().zze(this.zza.zza())), new zzeyo(this), this.zzc), zzebm.class, new zzeyn(this), this.zzc);
        }
        return zzfva.zzm(zzfvj, zzeym.zza, this.zzc);
    }
}
