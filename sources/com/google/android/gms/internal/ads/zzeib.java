package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeib extends zzeid {
    private final zzcnf zza;
    private final zzdlo zzb;
    private final zzdbc zzc;
    private final zzdhe zzd;

    public zzeib(zzcnf zzcnf, zzdlo zzdlo, zzdbc zzdbc, zzdhe zzdhe) {
        this.zza = zzcnf;
        this.zzb = zzdlo;
        this.zzc = zzdbc;
        this.zzd = zzdhe;
    }

    /* access modifiers changed from: protected */
    public final zzfvj zzc(zzfby zzfby, Bundle bundle) {
        zzdls zzh = this.zza.zzh();
        zzdbc zzdbc = this.zzc;
        zzdbc.zzf(zzfby);
        zzdbc.zzd(bundle);
        zzh.zzf(zzdbc.zzg());
        zzh.zze(this.zzd);
        zzh.zzd(this.zzb);
        zzh.zzc(new zzcvr((ViewGroup) null));
        zzcyz zza2 = zzh.zzg().zza();
        return zza2.zzh(zza2.zzi());
    }
}
