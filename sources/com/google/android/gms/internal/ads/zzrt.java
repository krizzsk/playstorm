package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzrt implements zzrz, zzry {
    public final zzsb zza;
    private final long zzb;
    private zzsd zzc;
    private zzrz zzd;
    private zzry zze;
    private long zzf = -9223372036854775807L;
    private final zzvw zzg;

    public zzrt(zzsb zzsb, zzvw zzvw, long j, byte[] bArr) {
        this.zza = zzsb;
        this.zzg = zzvw;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzf;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    public final long zza(long j, zzjx zzjx) {
        zzrz zzrz = this.zzd;
        int i = zzeg.zza;
        return zzrz.zza(j, zzjx);
    }

    public final long zzb() {
        zzrz zzrz = this.zzd;
        int i = zzeg.zza;
        return zzrz.zzb();
    }

    public final long zzc() {
        zzrz zzrz = this.zzd;
        int i = zzeg.zza;
        return zzrz.zzc();
    }

    public final long zzd() {
        zzrz zzrz = this.zzd;
        int i = zzeg.zza;
        return zzrz.zzd();
    }

    public final long zze(long j) {
        zzrz zzrz = this.zzd;
        int i = zzeg.zza;
        return zzrz.zze(j);
    }

    public final long zzf(zzvh[] zzvhArr, boolean[] zArr, zztr[] zztrArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.zzf;
        if (j3 == -9223372036854775807L || j != this.zzb) {
            j2 = j;
        } else {
            this.zzf = -9223372036854775807L;
            j2 = j3;
        }
        zzrz zzrz = this.zzd;
        int i = zzeg.zza;
        return zzrz.zzf(zzvhArr, zArr, zztrArr, zArr2, j2);
    }

    public final /* bridge */ /* synthetic */ void zzg(zztt zztt) {
        zzrz zzrz = (zzrz) zztt;
        zzry zzry = this.zze;
        int i = zzeg.zza;
        zzry.zzg(this);
    }

    public final zztz zzh() {
        zzrz zzrz = this.zzd;
        int i = zzeg.zza;
        return zzrz.zzh();
    }

    public final void zzi(zzrz zzrz) {
        zzry zzry = this.zze;
        int i = zzeg.zza;
        zzry.zzi(this);
    }

    public final void zzj(long j, boolean z) {
        zzrz zzrz = this.zzd;
        int i = zzeg.zza;
        zzrz.zzj(j, false);
    }

    public final void zzk() throws IOException {
        try {
            zzrz zzrz = this.zzd;
            if (zzrz != null) {
                zzrz.zzk();
                return;
            }
            zzsd zzsd = this.zzc;
            if (zzsd != null) {
                zzsd.zzw();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public final void zzl(zzry zzry, long j) {
        this.zze = zzry;
        zzrz zzrz = this.zzd;
        if (zzrz != null) {
            zzrz.zzl(this, zzv(this.zzb));
        }
    }

    public final void zzm(long j) {
        zzrz zzrz = this.zzd;
        int i = zzeg.zza;
        zzrz.zzm(j);
    }

    public final long zzn() {
        return this.zzf;
    }

    public final boolean zzo(long j) {
        zzrz zzrz = this.zzd;
        return zzrz != null && zzrz.zzo(j);
    }

    public final boolean zzp() {
        zzrz zzrz = this.zzd;
        return zzrz != null && zzrz.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzsb zzsb) {
        long zzv = zzv(this.zzb);
        zzsd zzsd = this.zzc;
        if (zzsd != null) {
            zzrz zzD = zzsd.zzD(zzsb, this.zzg, zzv);
            this.zzd = zzD;
            if (this.zze != null) {
                zzD.zzl(this, zzv);
                return;
            }
            return;
        }
        throw null;
    }

    public final void zzs(long j) {
        this.zzf = j;
    }

    public final void zzu(zzsd zzsd) {
        zzcw.zzf(this.zzc == null);
        this.zzc = zzsd;
    }

    public final void zzt() {
        zzrz zzrz = this.zzd;
        if (zzrz != null) {
            zzsd zzsd = this.zzc;
            if (zzsd != null) {
                zzsd.zzB(zzrz);
                return;
            }
            throw null;
        }
    }
}
