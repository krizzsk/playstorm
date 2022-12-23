package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzzc {
    public static zzze zzb(zzdy zzdy) {
        zzdy.zzG(1);
        int zzm = zzdy.zzm();
        long zzc = ((long) zzdy.zzc()) + ((long) zzm);
        int i = zzm / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzr = zzdy.zzr();
            if (zzr == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = zzr;
            jArr2[i2] = zzdy.zzr();
            zzdy.zzG(2);
            i2++;
        }
        zzdy.zzG((int) (zzc - ((long) zzdy.zzc())));
        return new zzze(jArr, jArr2);
    }

    public static zzbl zza(zzyt zzyt, boolean z) throws IOException {
        zzbl zza = new zzzj().zza(zzyt, z ? null : zzacb.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }
}
