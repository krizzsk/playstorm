package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzavd {
    public final zzavm zza = new zzavm();
    public final zzaue zzb;
    public zzavk zzc;
    public zzava zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public zzaud zzh;
    public zzavl zzi;

    public zzavd(zzaue zzaue) {
        this.zzb = zzaue;
    }

    public final void zzb() {
        zzavm zzavm = this.zza;
        zzavm.zzd = 0;
        zzavm.zzr = 0;
        zzavm.zzl = false;
        zzavm.zzq = false;
        zzavm.zzn = null;
        this.zze = 0;
        this.zzg = 0;
        this.zzf = 0;
        this.zzh = null;
        this.zzi = null;
    }

    public final void zza(zzavk zzavk, zzava zzava) {
        if (zzavk != null) {
            this.zzc = zzavk;
            if (zzava != null) {
                this.zzd = zzava;
                this.zzb.zza(zzavk.zzf);
                zzb();
                return;
            }
            throw null;
        }
        throw null;
    }
}
