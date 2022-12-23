package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzjd {
    public final zzrz zza;
    public final Object zzb;
    public final zztr[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzje zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzjv[] zzi;
    private final zzvn zzj;
    private final zzjn zzk;
    private zzjd zzl;
    private zztz zzm = zztz.zza;
    private zzvo zzn;
    private long zzo;

    public zzjd(zzjv[] zzjvArr, long j, zzvn zzvn, zzvw zzvw, zzjn zzjn, zzje zzje, zzvo zzvo, byte[] bArr) {
        zzje zzje2 = zzje;
        this.zzi = zzjvArr;
        this.zzo = j;
        this.zzj = zzvn;
        this.zzk = zzjn;
        this.zzb = zzje2.zza.zza;
        this.zzf = zzje2;
        this.zzn = zzvo;
        this.zzc = new zztr[2];
        this.zzh = new boolean[2];
        zzsb zzsb = zzje2.zza;
        long j2 = zzje2.zzb;
        long j3 = zzje2.zzd;
        zzvw zzvw2 = zzvw;
        zzrz zzo2 = zzjn.zzo(zzsb, zzvw, j2);
        this.zza = j3 != -9223372036854775807L ? new zzrg(zzo2, true, 0, j3) : zzo2;
    }

    private final void zzs() {
        if (zzu()) {
            int i = 0;
            while (true) {
                zzvo zzvo = this.zzn;
                if (i < zzvo.zza) {
                    zzvo.zzb(i);
                    zzvh zzvh = this.zzn.zzc[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private final void zzt() {
        if (zzu()) {
            int i = 0;
            while (true) {
                zzvo zzvo = this.zzn;
                if (i < zzvo.zza) {
                    zzvo.zzb(i);
                    zzvh zzvh = this.zzn.zzc[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzvo zzvo, long j, boolean z) {
        return zzb(zzvo, j, false, new boolean[2]);
    }

    public final long zzb(zzvo zzvo, long j, boolean z, boolean[] zArr) {
        zzvo zzvo2 = zzvo;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzvo2.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z || !zzvo.zza(this.zzn, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzjv[] zzjvArr = this.zzi;
            if (i2 >= 2) {
                break;
            }
            zzjvArr[i2].zzb();
            i2++;
        }
        zzs();
        this.zzn = zzvo2;
        zzt();
        long zzf2 = this.zza.zzf(zzvo2.zzc, this.zzh, this.zzc, zArr, j);
        int i3 = 0;
        while (true) {
            zzjv[] zzjvArr2 = this.zzi;
            if (i3 >= 2) {
                break;
            }
            zzjvArr2[i3].zzb();
            i3++;
        }
        this.zze = false;
        int i4 = 0;
        while (true) {
            zztr[] zztrArr = this.zzc;
            if (i4 >= 2) {
                return zzf2;
            }
            if (zztrArr[i4] != null) {
                zzcw.zzf(zzvo.zzb(i4));
                this.zzi[i4].zzb();
                this.zze = true;
            } else {
                zzcw.zzf(zzvo2.zzc[i4] == null);
            }
            i4++;
        }
    }

    public final long zzc() {
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        long zzb2 = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
        return zzb2 == Long.MIN_VALUE ? this.zzf.zze : zzb2;
    }

    public final long zzd() {
        if (!this.zzd) {
            return 0;
        }
        return this.zza.zzc();
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzjd zzg() {
        return this.zzl;
    }

    public final zztz zzh() {
        return this.zzm;
    }

    public final zzvo zzi() {
        return this.zzn;
    }

    public final zzvo zzj(float f, zzci zzci) throws zzgu {
        zzvo zzj2 = this.zzj.zzj(this.zzi, this.zzm, this.zzf.zza, zzci);
        for (zzvh zzvh : zzj2.zzc) {
        }
        return zzj2;
    }

    public final void zzk(long j) {
        zzcw.zzf(zzu());
        this.zza.zzo(j - this.zzo);
    }

    public final void zzl(float f, zzci zzci) throws zzgu {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzvo zzj2 = zzj(f, zzci);
        zzje zzje = this.zzf;
        long j = zzje.zzb;
        long j2 = zzje.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0, j2 - 1);
        }
        long zza2 = zza(zzj2, j, false);
        long j3 = this.zzo;
        zzje zzje2 = this.zzf;
        this.zzo = j3 + (zzje2.zzb - zza2);
        this.zzf = zzje2.zzb(zza2);
    }

    public final void zzm(long j) {
        zzcw.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzjn zzjn = this.zzk;
        zzrz zzrz = this.zza;
        try {
            if (zzrz instanceof zzrg) {
                zzjn.zzh(((zzrg) zzrz).zza);
            } else {
                zzjn.zzh(zzrz);
            }
        } catch (RuntimeException e) {
            zzdn.zza("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(zzjd zzjd) {
        if (zzjd != this.zzl) {
            zzs();
            this.zzl = zzjd;
            zzt();
        }
    }

    public final void zzp(long j) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zzrz zzrz = this.zza;
        if (zzrz instanceof zzrg) {
            long j = this.zzf.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zzrg) zzrz).zzn(0, j);
        }
    }

    public final boolean zzr() {
        return this.zzd && (!this.zze || this.zza.zzb() == Long.MIN_VALUE);
    }
}
