package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcpn {
    private zzcni zza;
    private zzcrd zzb;
    private zzfgi zzc;
    private zzcrq zzd;
    private zzfcy zze;

    private zzcpn() {
    }

    /* synthetic */ zzcpn(zzcpm zzcpm) {
    }

    public final zzcnf zza() {
        zzgqc.zzc(this.zza, zzcni.class);
        zzgqc.zzc(this.zzb, zzcrd.class);
        if (this.zzc == null) {
            this.zzc = new zzfgi();
        }
        if (this.zzd == null) {
            this.zzd = new zzcrq();
        }
        if (this.zze == null) {
            this.zze = new zzfcy();
        }
        return new zzcrb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, (zzcra) null);
    }

    public final zzcpn zzb(zzcni zzcni) {
        this.zza = zzcni;
        return this;
    }

    public final zzcpn zzc(zzcrd zzcrd) {
        this.zzb = zzcrd;
        return this;
    }
}
