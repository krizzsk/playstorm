package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzsp implements zzrz, zzry {
    /* access modifiers changed from: private */
    public final zzrz zza;
    private final long zzb;
    private zzry zzc;

    public zzsp(zzrz zzrz, long j) {
        this.zza = zzrz;
        this.zzb = j;
    }

    public final long zza(long j, zzjx zzjx) {
        return this.zza.zza(j - this.zzb, zzjx) + this.zzb;
    }

    public final long zzb() {
        long zzb2 = this.zza.zzb();
        if (zzb2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb2 + this.zzb;
    }

    public final long zzc() {
        long zzc2 = this.zza.zzc();
        if (zzc2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc2 + this.zzb;
    }

    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    public final long zze(long j) {
        return this.zza.zze(j - this.zzb) + this.zzb;
    }

    public final long zzf(zzvh[] zzvhArr, boolean[] zArr, zztr[] zztrArr, boolean[] zArr2, long j) {
        zztr[] zztrArr2 = zztrArr;
        zztr[] zztrArr3 = new zztr[zztrArr2.length];
        int i = 0;
        while (true) {
            zztr zztr = null;
            if (i >= zztrArr2.length) {
                break;
            }
            zzsq zzsq = (zzsq) zztrArr2[i];
            if (zzsq != null) {
                zztr = zzsq.zzc();
            }
            zztrArr3[i] = zztr;
            i++;
        }
        long zzf = this.zza.zzf(zzvhArr, zArr, zztrArr3, zArr2, j - this.zzb);
        for (int i2 = 0; i2 < zztrArr2.length; i2++) {
            zztr zztr2 = zztrArr3[i2];
            if (zztr2 == null) {
                zztrArr2[i2] = null;
            } else {
                zztr zztr3 = zztrArr2[i2];
                if (zztr3 == null || ((zzsq) zztr3).zzc() != zztr2) {
                    zztrArr2[i2] = new zzsq(zztr2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
    }

    public final /* bridge */ /* synthetic */ void zzg(zztt zztt) {
        zzrz zzrz = (zzrz) zztt;
        zzry zzry = this.zzc;
        if (zzry != null) {
            zzry.zzg(this);
            return;
        }
        throw null;
    }

    public final zztz zzh() {
        return this.zza.zzh();
    }

    public final void zzj(long j, boolean z) {
        this.zza.zzj(j - this.zzb, false);
    }

    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    public final void zzl(zzry zzry, long j) {
        this.zzc = zzry;
        this.zza.zzl(this, j - this.zzb);
    }

    public final void zzm(long j) {
        this.zza.zzm(j - this.zzb);
    }

    public final boolean zzo(long j) {
        return this.zza.zzo(j - this.zzb);
    }

    public final boolean zzp() {
        return this.zza.zzp();
    }

    public final void zzi(zzrz zzrz) {
        zzry zzry = this.zzc;
        if (zzry != null) {
            zzry.zzi(this);
            return;
        }
        throw null;
    }
}
