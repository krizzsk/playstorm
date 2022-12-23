package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeii extends zzeid {
    private final zzcnf zza;
    private final zzdbc zzb;
    private final zzdhe zzc;

    public zzeii(zzcnf zzcnf, zzdbc zzdbc, zzdhe zzdhe) {
        this.zza = zzcnf;
        this.zzb = zzdbc;
        this.zzc = zzdhe;
    }

    /* access modifiers changed from: protected */
    public final zzfvj zzc(zzfby zzfby, Bundle bundle) {
        zzdsw zzi = this.zza.zzi();
        zzdbc zzdbc = this.zzb;
        zzdbc.zzf(zzfby);
        zzdbc.zzd(bundle);
        zzi.zzd(zzdbc.zzg());
        zzi.zzc(this.zzc);
        zzcyz zzb2 = zzi.zze().zzb();
        return zzb2.zzh(zzb2.zzi());
    }
}
