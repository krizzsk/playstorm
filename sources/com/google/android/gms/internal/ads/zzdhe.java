package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdhe {
    private final Set zza;
    private final Set zzb;
    private final Set zzc;
    private final Set zzd;
    private final Set zze;
    private final Set zzf;
    private final Set zzg;
    private final Set zzh;
    private final Set zzi;
    private final Set zzj;
    private final Set zzk;
    private final Set zzl;
    private final Set zzm;
    private final Set zzn;
    private final zzeys zzo;
    private zzdbu zzp;
    private zzeil zzq;

    /* synthetic */ zzdhe(zzdhc zzdhc, zzdhd zzdhd) {
        this.zza = zzdhc.zzc;
        this.zzb = zzdhc.zzd;
        this.zzd = zzdhc.zzf;
        this.zze = zzdhc.zzg;
        this.zzc = zzdhc.zze;
        this.zzf = zzdhc.zzh;
        this.zzg = zzdhc.zza;
        this.zzh = zzdhc.zzi;
        this.zzi = zzdhc.zzl;
        this.zzj = zzdhc.zzj;
        this.zzk = zzdhc.zzk;
        this.zzl = zzdhc.zzm;
        this.zzo = zzdhc.zzo;
        this.zzm = zzdhc.zzn;
        this.zzn = zzdhc.zzb;
    }

    public final zzdbu zza(Set set) {
        if (this.zzp == null) {
            this.zzp = new zzdbu(set);
        }
        return this.zzp;
    }

    public final zzeil zzb(Clock clock, zzeim zzeim, zzefd zzefd, zzfig zzfig) {
        if (this.zzq == null) {
            this.zzq = new zzeil(clock, zzeim, zzefd, zzfig);
        }
        return this.zzq;
    }

    public final zzeys zzc() {
        return this.zzo;
    }

    public final Set zzd() {
        return this.zzm;
    }

    public final Set zze() {
        return this.zza;
    }

    public final Set zzf() {
        return this.zzh;
    }

    public final Set zzg() {
        return this.zzi;
    }

    public final Set zzh() {
        return this.zzd;
    }

    public final Set zzi() {
        return this.zzc;
    }

    public final Set zzj() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final Set zzk() {
        return this.zzg;
    }

    public final Set zzl() {
        return this.zzj;
    }

    public final Set zzm() {
        return this.zze;
    }

    public final Set zzn() {
        return this.zzl;
    }

    public final Set zzo() {
        return this.zzn;
    }

    public final Set zzp() {
        return this.zzk;
    }

    /* access modifiers changed from: package-private */
    public final Set zzq() {
        return this.zzb;
    }
}
