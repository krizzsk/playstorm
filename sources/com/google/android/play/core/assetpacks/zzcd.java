package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.zzc;
import com.google.android.play.core.internal.zzcp;
import com.google.android.play.core.internal.zzcq;
import com.google.android.play.core.internal.zzcs;
import com.google.android.play.core.splitinstall.zzt;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzcd implements zza {
    private final zzcs zzA;
    private final zzcs zzB;
    private final zzcs zzC;
    private final zzcs zzD;
    private final zzcd zza = this;
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
    private final zzcs zzm;
    private final zzcs zzn;
    private final zzcs zzo;
    private final zzcs zzp;
    private final zzcs zzq;
    private final zzcs zzr;
    private final zzcs zzs;
    private final zzcs zzt;
    private final zzcs zzu;
    private final zzcs zzv;
    private final zzcs zzw;
    private final zzcs zzx;
    private final zzcs zzy;
    private final zzcs zzz;

    /* synthetic */ zzcd(zzp zzp2, zzcc zzcc) {
        zzu zzu2 = new zzu(zzp2);
        this.zzb = zzu2;
        zzcs zzc2 = zzcq.zzc(new zzee(zzu2));
        this.zzc = zzc2;
        this.zzd = zzcq.zzc(new zzbi(this.zzb, zzc2));
        this.zze = zzcq.zzc(zzcp.zza);
        zzcs zzc3 = zzcq.zzc(zzc.zzb());
        this.zzf = zzc3;
        zzcs zzc4 = zzcq.zzc(new zzec(this.zzd, this.zzc, zzc3));
        this.zzg = zzc4;
        this.zzh = zzcq.zzc(new zzax(this.zzb, this.zze, zzc4));
        this.zzi = zzcq.zzc(new zzv(this.zzb));
        this.zzj = new zzcp();
        zzcs zzc5 = zzcq.zzc(zzq.zza);
        this.zzk = zzc5;
        this.zzl = zzcq.zzc(new zzdf(this.zzd, this.zzj, this.zze, zzc5));
        zzcp zzcp = new zzcp();
        this.zzm = zzcp;
        this.zzn = zzcq.zzc(new zzcg(this.zzd, this.zzj, zzcp, this.zze, this.zzg));
        this.zzo = zzcq.zzc(new zzes(this.zzd));
        this.zzp = zzcq.zzc(new zzdv(this.zzd));
        this.zzq = zzcq.zzc(new zzea(this.zzd, this.zzj, this.zzl, this.zzk, this.zze, this.zzf, this.zzg));
        this.zzr = zzcq.zzc(new zzeh(this.zzd, this.zzj));
        this.zzs = zzcq.zzc(new zzel(this.zzd, this.zzj, this.zzl, this.zzk, this.zze));
        zzcs zzc6 = zzcq.zzc(new zzbv(this.zzj));
        this.zzt = zzc6;
        zzcs zzc7 = zzcq.zzc(new zzdi(this.zzl, this.zzd, zzc6, this.zzf));
        this.zzu = zzc7;
        this.zzv = zzcq.zzc(new zzcm(this.zzl, this.zzj, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, zzc7));
        this.zzw = zzcq.zzc(zzby.zza);
        zzcs zzc8 = zzcq.zzc(zzw.zza);
        this.zzx = zzc8;
        zzcp.zzb(this.zzm, zzcq.zzc(new zzbc(this.zzb, this.zzl, this.zzv, this.zzj, this.zze, this.zzw, this.zzk, zzc8, this.zzg)));
        zzcs zzc9 = zzcq.zzc(new zzdp(this.zzi, this.zzm, this.zze, this.zzb, this.zzc, this.zzk, this.zzg));
        this.zzy = zzc9;
        zzcp.zzb(this.zzj, zzcq.zzc(new zzt(this.zzb, this.zzh, zzc9)));
        zzcs zzc10 = zzcq.zzc(new zzt(this.zzb));
        this.zzz = zzc10;
        zzcs zzc11 = zzcq.zzc(new zzm(this.zzd, this.zzj, this.zzm, zzc10, this.zzl, this.zze, this.zzw, this.zzk, this.zzf, this.zzg));
        this.zzA = zzc11;
        this.zzB = zzcq.zzc(new zzs(zzc11, this.zzb));
        zzcs zzc12 = zzcq.zzc(new zzcj(this.zzb));
        this.zzC = zzc12;
        this.zzD = zzcq.zzc(new zzc(this.zzb, this.zzd, this.zzA, zzc12));
    }

    public final AssetPackManager zza() {
        return (AssetPackManager) this.zzB.zza();
    }

    public final void zzb(AssetPackExtractionService assetPackExtractionService) {
        assetPackExtractionService.zza = (zzb) this.zzD.zza();
    }
}
