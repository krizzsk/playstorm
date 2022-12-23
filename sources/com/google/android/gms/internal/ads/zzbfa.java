package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbfa extends zzgkk implements zzglz {
    private zzbfa() {
        super(zzbfb.zzb);
    }

    public final zzbdx zza() {
        return ((zzbfb) this.zza).zza();
    }

    public final zzbet zzb() {
        return ((zzbfb) this.zza).zzc();
    }

    public final zzbfa zzc(Iterable iterable) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbfb.zzh((zzbfb) this.zza, iterable);
        return this;
    }

    public final zzbfa zzd() {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzbfb) this.zza).zzk = zzbfb.zzaG();
        return this;
    }

    public final zzbfa zze(zzbdw zzbdw) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbfb.zzk((zzbfb) this.zza, (zzbdx) zzbdw.zzaj());
        return this;
    }

    public final zzbfa zzf(zzbeg zzbeg) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbfb.zzn((zzbfb) this.zza, zzbeg);
        return this;
    }

    public final zzbfa zzg(zzbes zzbes) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbfb.zzj((zzbfb) this.zza, (zzbet) zzbes.zzaj());
        return this;
    }

    public final zzbfa zzh(String str) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbfb.zzg((zzbfb) this.zza, str);
        return this;
    }

    public final zzbfa zzi(zzbfz zzbfz) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbfb.zzl((zzbfb) this.zza, zzbfz);
        return this;
    }

    public final zzbfa zzj(zzbhg zzbhg) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbfb.zzm((zzbfb) this.zza, zzbhg);
        return this;
    }

    public final String zzk() {
        return ((zzbfb) this.zza).zzf();
    }

    /* synthetic */ zzbfa(zzbds zzbds) {
        super(zzbfb.zzb);
    }
}
