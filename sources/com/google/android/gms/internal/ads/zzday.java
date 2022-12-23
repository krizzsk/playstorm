package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzday {
    private final zzfge zza;
    private final zzcfo zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzgpo zzg;
    private final String zzh;
    private final zzete zzi;

    public zzday(zzfge zzfge, zzcfo zzcfo, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzgpo zzgpo, zzg zzg2, String str2, zzete zzete) {
        this.zza = zzfge;
        this.zzb = zzcfo;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzgpo;
        this.zzh = str2;
        this.zzi = zzete;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbzu zza(zzfvj zzfvj) throws Exception {
        return new zzbzu((Bundle) zzfvj.get(), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, (String) ((zzfvj) this.zzg.zzb()).get(), this.zzh, (zzfdu) null, (String) null);
    }

    public final zzfvj zzb() {
        zzfge zzfge = this.zza;
        return zzffo.zzc(this.zzi.zza(new Bundle()), zzffy.SIGNALS, zzfge).zza();
    }

    public final zzfvj zzc() {
        zzfvj zzb2 = zzb();
        return this.zza.zza(zzffy.REQUEST_PARCEL, zzb2, (zzfvj) this.zzg.zzb()).zza(new zzdax(this, zzb2)).zza();
    }
}
