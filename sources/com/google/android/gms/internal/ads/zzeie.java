package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeie extends zzeid {
    private final zzcnf zza;
    private final zzdbc zzb;
    private final zzekm zzc;
    private final zzdhe zzd;
    private final zzdlo zze;
    private final zzdeh zzf;
    private final ViewGroup zzg;
    private final zzdgn zzh;

    public zzeie(zzcnf zzcnf, zzdbc zzdbc, zzekm zzekm, zzdhe zzdhe, zzdlo zzdlo, zzdeh zzdeh, ViewGroup viewGroup, zzdgn zzdgn) {
        this.zza = zzcnf;
        this.zzb = zzdbc;
        this.zzc = zzekm;
        this.zzd = zzdhe;
        this.zze = zzdlo;
        this.zzf = zzdeh;
        this.zzg = viewGroup;
        this.zzh = zzdgn;
    }

    /* access modifiers changed from: protected */
    public final zzfvj zzc(zzfby zzfby, Bundle bundle) {
        zzcwq zze2 = this.zza.zze();
        zzdbc zzdbc = this.zzb;
        zzdbc.zzf(zzfby);
        zzdbc.zzd(bundle);
        zze2.zzi(zzdbc.zzg());
        zze2.zzf(this.zzd);
        zze2.zze(this.zzc);
        zze2.zzd(this.zze);
        zze2.zzg(new zzcxo(this.zzf, this.zzh));
        zze2.zzc(new zzcvr(this.zzg));
        zzcyz zzd2 = zze2.zzj().zzd();
        return zzd2.zzh(zzd2.zzi());
    }
}
