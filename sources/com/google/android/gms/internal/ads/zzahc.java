package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.extractor.p194ts.TsExtractor;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzahc implements zzyh {
    private final zzee zza;
    private final zzdy zzb = new zzdy();
    private final int zzc;

    public zzahc(int i, zzee zzee, int i2) {
        this.zzc = i;
        this.zza = zzee;
    }

    public final zzyg zza(zzyt zzyt, long j) throws IOException {
        int zza2;
        int i;
        long j2;
        long zzf = zzyt.zzf();
        int min = (int) Math.min(112800, zzyt.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzym) zzyt).zzm(this.zzb.zzH(), 0, min, false);
        zzdy zzdy = this.zzb;
        int zzd = zzdy.zzd();
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (zzdy.zza() >= 188 && (i = zza2 + TsExtractor.TS_PACKET_SIZE) <= zzd) {
            long zzb2 = zzaho.zzb(zzdy, (zza2 = zzaho.zza(zzdy.zzH(), zzdy.zzc(), zzd)), this.zzc);
            if (zzb2 != -9223372036854775807L) {
                long zzb3 = this.zza.zzb(zzb2);
                if (zzb3 > j) {
                    if (j5 == -9223372036854775807L) {
                        return zzyg.zzd(zzb3, zzf);
                    }
                    j2 = zzf + j4;
                } else if (100000 + zzb3 > j) {
                    j2 = zzf + ((long) zza2);
                } else {
                    j4 = (long) zza2;
                    j5 = zzb3;
                }
                return zzyg.zze(j2);
            }
            zzdy.zzF(i);
            j3 = (long) i;
        }
        return j5 != -9223372036854775807L ? zzyg.zzf(j5, zzf + j3) : zzyg.zza;
    }

    public final void zzb() {
        zzdy zzdy = this.zzb;
        byte[] bArr = zzeg.zzf;
        int length = bArr.length;
        zzdy.zzD(bArr, 0);
    }
}
