package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzaak implements zzyh {
    private final zzzf zza;
    private final int zzb;
    private final zzza zzc = new zzza();

    /* synthetic */ zzaak(zzzf zzzf, int i, zzaaj zzaaj) {
        this.zza = zzzf;
        this.zzb = i;
    }

    private final long zzc(zzyt zzyt) throws IOException {
        while (zzyt.zze() < zzyt.zzd() - 6) {
            zzzf zzzf = this.zza;
            int i = this.zzb;
            zzza zzza = this.zzc;
            long zze = zzyt.zze();
            byte[] bArr = new byte[2];
            zzym zzym = (zzym) zzyt;
            zzym.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                zzyt.zzj();
                zzym.zzl((int) (zze - zzyt.zzf()), false);
            } else {
                zzdy zzdy = new zzdy(16);
                System.arraycopy(bArr, 0, zzdy.zzH(), 0, 2);
                zzdy.zzE(zzyw.zza(zzyt, zzdy.zzH(), 2, 14));
                zzyt.zzj();
                zzym.zzl((int) (zze - zzyt.zzf()), false);
                if (zzzb.zzc(zzdy, zzzf, i, zzza)) {
                    break;
                }
            }
            zzym.zzl(1, false);
        }
        if (zzyt.zze() < zzyt.zzd() - 6) {
            return this.zzc.zza;
        }
        ((zzym) zzyt).zzl((int) (zzyt.zzd() - zzyt.zze()), false);
        return this.zza.zzj;
    }

    public final zzyg zza(zzyt zzyt, long j) throws IOException {
        long zzf = zzyt.zzf();
        long zzc2 = zzc(zzyt);
        long zze = zzyt.zze();
        ((zzym) zzyt).zzl(Math.max(6, this.zza.zzc), false);
        long zzc3 = zzc(zzyt);
        long zze2 = zzyt.zze();
        if (zzc2 > j || zzc3 <= j) {
            return zzc3 <= j ? zzyg.zzf(zzc3, zze2) : zzyg.zzd(zzc2, zzf);
        }
        return zzyg.zze(zze);
    }

    public final /* synthetic */ void zzb() {
    }
}
