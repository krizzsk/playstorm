package com.google.android.play.core.splitinstall;

import com.google.android.play.core.internal.zzcq;
import com.google.android.play.core.internal.zzcs;
import com.google.android.play.core.splitinstall.testing.zzr;
import java.io.File;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zze implements zzp {
    private final zze zza = this;
    private final zzcs zzb;
    private final zzcs zzc;
    private final zzcs zzd;
    private final zzcs zze;
    private final zzcs zzf;
    private final zzcs zzg;
    private final zzcs zzh;
    private final zzcs zzi;
    private final zzcs zzj;
    private final zzcs zzk;
    private final zzcs zzl;

    /* synthetic */ zze(zzac zzac, zzd zzd2) {
        zzad zzad = new zzad(zzac);
        this.zzb = zzad;
        this.zzc = zzcq.zzc(new zzbd(zzad));
        this.zzd = zzcq.zzc(new zzag(zzac));
        this.zze = zzcq.zzc(new zzt(this.zzb));
        zzcs zzc2 = zzcq.zzc(new zzbf(this.zzb));
        this.zzf = zzc2;
        this.zzg = zzcq.zzc(new zzab(this.zzc, this.zzd, this.zze, zzc2));
        zzcs zzc3 = zzcq.zzc(new zzaf(this.zzb));
        this.zzh = zzc3;
        zzae zzae = new zzae(zzc3);
        this.zzi = zzae;
        zzcs zzc4 = zzcq.zzc(new zzr(this.zzb, zzc3, this.zze, zzae));
        this.zzj = zzc4;
        zzcs zzc5 = zzcq.zzc(new zzm(this.zzg, zzc4, this.zzh));
        this.zzk = zzc5;
        this.zzl = zzcq.zzc(new zzah(zzac, zzc5));
    }

    public final SplitInstallManager zza() {
        return (SplitInstallManager) this.zzl.zza();
    }

    public final File zzb() {
        return (File) this.zzh.zza();
    }
}
