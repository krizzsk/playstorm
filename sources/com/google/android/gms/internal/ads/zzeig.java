package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeig extends zzeid {
    private final zzcnf zza;
    private final zzdbc zzb;
    private final zzekm zzc;
    private final zzdhe zzd;

    public zzeig(zzcnf zzcnf, zzdbc zzdbc, zzekm zzekm, zzdhe zzdhe) {
        this.zza = zzcnf;
        this.zzb = zzdbc;
        this.zzc = zzekm;
        this.zzd = zzdhe;
    }

    /* access modifiers changed from: protected */
    public final zzfvj zzc(zzfby zzfby, Bundle bundle) {
        zzdkw zzg = this.zza.zzg();
        zzdbc zzdbc = this.zzb;
        zzdbc.zzf(zzfby);
        zzdbc.zzd(bundle);
        zzg.zze(zzdbc.zzg());
        zzg.zzd(this.zzd);
        zzg.zzc(this.zzc);
        zzcyz zza2 = zzg.zzf().zza();
        return zza2.zzh(zza2.zzi());
    }
}
