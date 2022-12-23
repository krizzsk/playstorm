package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgs implements zzjc {
    private final zzka zza;
    private final zzgr zzb;
    private zzju zzc;
    private zzjc zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzgs(zzgr zzgr, zzcx zzcx) {
        this.zzb = zzgr;
        this.zza = new zzka(zzcx);
    }

    public final long zza() {
        throw null;
    }

    public final long zzb(boolean z) {
        zzju zzju = this.zzc;
        if (zzju == null || zzju.zzM() || (!this.zzc.zzN() && (z || this.zzc.zzG()))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzjc zzjc = this.zzd;
            if (zzjc != null) {
                long zza2 = zzjc.zza();
                if (this.zze) {
                    if (zza2 < this.zza.zza()) {
                        this.zza.zze();
                    } else {
                        this.zze = false;
                        if (this.zzf) {
                            this.zza.zzd();
                        }
                    }
                }
                this.zza.zzb(zza2);
                zzbt zzc2 = zzjc.zzc();
                if (!zzc2.equals(this.zza.zzc())) {
                    this.zza.zzg(zzc2);
                    this.zzb.zza(zzc2);
                }
            } else {
                throw null;
            }
        }
        if (this.zze) {
            return this.zza.zza();
        }
        zzjc zzjc2 = this.zzd;
        if (zzjc2 != null) {
            return zzjc2.zza();
        }
        throw null;
    }

    public final zzbt zzc() {
        zzjc zzjc = this.zzd;
        return zzjc != null ? zzjc.zzc() : this.zza.zzc();
    }

    public final void zzd(zzju zzju) {
        if (zzju == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzju zzju) throws zzgu {
        zzjc zzjc;
        zzjc zzi = zzju.zzi();
        if (zzi != null && zzi != (zzjc = this.zzd)) {
            if (zzjc == null) {
                this.zzd = zzi;
                this.zzc = zzju;
                zzi.zzg(this.zza.zzc());
                return;
            }
            throw zzgu.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    public final void zzg(zzbt zzbt) {
        zzjc zzjc = this.zzd;
        if (zzjc != null) {
            zzjc.zzg(zzbt);
            zzbt = this.zzd.zzc();
        }
        this.zza.zzg(zzbt);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }
}
