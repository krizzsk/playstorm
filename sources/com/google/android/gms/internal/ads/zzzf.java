package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzzf {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzze zzk;
    private final zzbl zzl;

    private zzzf(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, zzze zzze, zzbl zzbl) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = zzi(i5);
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = zzh(i7);
        this.zzj = j;
        this.zzk = zzze;
        this.zzl = zzbl;
    }

    public zzzf(byte[] bArr, int i) {
        zzdx zzdx = new zzdx(bArr, bArr.length);
        zzdx.zzh(i * 8);
        this.zza = zzdx.zzc(16);
        this.zzb = zzdx.zzc(16);
        this.zzc = zzdx.zzc(24);
        this.zzd = zzdx.zzc(24);
        int zzc2 = zzdx.zzc(20);
        this.zze = zzc2;
        this.zzf = zzi(zzc2);
        this.zzg = zzdx.zzc(3) + 1;
        int zzc3 = zzdx.zzc(5) + 1;
        this.zzh = zzc3;
        this.zzi = zzh(zzc3);
        this.zzj = zzeg.zzy(zzdx.zzc(4), zzdx.zzc(32));
        this.zzk = null;
        this.zzl = null;
    }

    private static int zzh(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int zzi(int i) {
        switch (i) {
            case 8000:
                return 4;
            case AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case OpusUtil.SAMPLE_RATE:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j = this.zzj;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.zze);
    }

    public final long zzb(long j) {
        return zzeg.zzr((j * ((long) this.zze)) / 1000000, 0, this.zzj - 1);
    }

    public final zzad zzc(byte[] bArr, zzbl zzbl) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.zzd;
        if (i <= 0) {
            i = -1;
        }
        zzbl zzd2 = zzd(zzbl);
        zzab zzab = new zzab();
        zzab.zzS("audio/flac");
        zzab.zzL(i);
        zzab.zzw(this.zzg);
        zzab.zzT(this.zze);
        zzab.zzI(Collections.singletonList(bArr));
        zzab.zzM(zzd2);
        return zzab.zzY();
    }

    public final zzbl zzd(zzbl zzbl) {
        zzbl zzbl2 = this.zzl;
        return zzbl2 == null ? zzbl : zzbl2.zzd(zzbl);
    }

    public final zzzf zze(List list) {
        return new zzzf(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzbl(list)));
    }

    public final zzzf zzf(zzze zzze) {
        return new zzzf(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzze, this.zzl);
    }

    public final zzzf zzg(List list) {
        return new zzzf(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzaaf.zzb(list)));
    }
}
