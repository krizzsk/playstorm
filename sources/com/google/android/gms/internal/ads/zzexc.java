package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzexc implements zzdbv, zzddr, zzeys, zzo, zzded, zzdci, zzdjf {
    private final zzfdj zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzexc zzh = null;

    public zzexc(zzfdj zzfdj) {
        this.zza = zzfdj;
    }

    public static zzexc zzi(zzexc zzexc) {
        zzexc zzexc2 = new zzexc(zzexc.zza);
        zzexc2.zzh = zzexc;
        return zzexc2;
    }

    public final void zzb() {
        zzexc zzexc = this.zzh;
        if (zzexc != null) {
            zzexc.zzb();
            return;
        }
        zzeyj.zza(this.zzf, zzewv.zza);
        zzeyj.zza(this.zzd, zzeww.zza);
        zzeyj.zza(this.zzd, zzewx.zza);
    }

    public final void zzbC() {
        zzexc zzexc = this.zzh;
        if (zzexc != null) {
            zzexc.zzbC();
        } else {
            zzeyj.zza(this.zzf, zzews.zza);
        }
    }

    public final void zzbK() {
    }

    public final void zzbL(zzeys zzeys) {
        this.zzh = (zzexc) zzeys;
    }

    public final void zzbr() {
    }

    public final void zze() {
        zzexc zzexc = this.zzh;
        if (zzexc != null) {
            zzexc.zze();
        } else {
            zzeyj.zza(this.zzf, zzewz.zza);
        }
    }

    public final void zzf(int i) {
        zzexc zzexc = this.zzh;
        if (zzexc != null) {
            zzexc.zzf(i);
        } else {
            zzeyj.zza(this.zzf, new zzewr(i));
        }
    }

    public final void zzg(zzs zzs) {
        zzexc zzexc = this.zzh;
        if (zzexc != null) {
            zzexc.zzg(zzs);
        } else {
            zzeyj.zza(this.zzg, new zzewq(zzs));
        }
    }

    public final void zzh() {
        zzexc zzexc = this.zzh;
        if (zzexc != null) {
            zzexc.zzh();
        } else {
            zzeyj.zza(this.zze, zzexb.zza);
        }
    }

    public final void zzj() {
        zzexc zzexc = this.zzh;
        if (zzexc != null) {
            zzexc.zzj();
            return;
        }
        this.zza.zza();
        zzeyj.zza(this.zzc, zzewo.zza);
        zzeyj.zza(this.zzd, zzewp.zza);
    }

    public final void zzk(zze zze2) {
        zzexc zzexc = this.zzh;
        if (zzexc != null) {
            zzexc.zzk(zze2);
        } else {
            zzeyj.zza(this.zzd, new zzewy(zze2));
        }
    }

    public final void zzn(zzddr zzddr) {
        this.zze.set(zzddr);
    }

    public final void zzo(zzo zzo) {
        this.zzf.set(zzo);
    }

    public final void zzp(zzde zzde) {
        this.zzg.set(zzde);
    }

    public final void zzq() {
        zzexc zzexc = this.zzh;
        if (zzexc != null) {
            zzexc.zzq();
        } else {
            zzeyj.zza(this.zzd, zzexa.zza);
        }
    }

    public final void zzr(zzbci zzbci) {
        this.zzb.set(zzbci);
    }

    public final void zzs(zzbcm zzbcm) {
        this.zzd.set(zzbcm);
    }

    public final void zzt(zzbcj zzbcj) {
        this.zzc.set(zzbcj);
    }

    public final void zzl(zzbcf zzbcf) {
        zzexc zzexc = this.zzh;
        if (zzexc != null) {
            zzexc.zzl(zzbcf);
        } else {
            zzeyj.zza(this.zzb, new zzewu(zzbcf));
        }
    }

    public final void zza(zze zze2) {
        zzexc zzexc = this.zzh;
        if (zzexc != null) {
            zzexc.zza(zze2);
            return;
        }
        zzeyj.zza(this.zzb, new zzewn(zze2));
        zzeyj.zza(this.zzb, new zzewt(zze2));
    }
}
