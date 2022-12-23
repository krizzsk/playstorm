package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzazu {
    public final List zza;
    public final int zzb;

    private zzazu(List list, int i) {
        this.zza = list;
        this.zzb = i;
    }

    public static zzazu zza(zzazg zzazg) throws zzarv {
        List list;
        try {
            zzazg.zzw(21);
            int zzg = zzazg.zzg() & 3;
            int zzg2 = zzazg.zzg();
            int zzc = zzazg.zzc();
            int i = 0;
            for (int i2 = 0; i2 < zzg2; i2++) {
                zzazg.zzw(1);
                int zzj = zzazg.zzj();
                for (int i3 = 0; i3 < zzj; i3++) {
                    int zzj2 = zzazg.zzj();
                    i += zzj2 + 4;
                    zzazg.zzw(zzj2);
                }
            }
            zzazg.zzv(zzc);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < zzg2; i5++) {
                zzazg.zzw(1);
                int zzj3 = zzazg.zzj();
                for (int i6 = 0; i6 < zzj3; i6++) {
                    int zzj4 = zzazg.zzj();
                    System.arraycopy(zzaze.zza, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(zzazg.zza, zzazg.zzc(), bArr, i7, zzj4);
                    i4 = i7 + zzj4;
                    zzazg.zzw(zzj4);
                }
            }
            if (i == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new zzazu(list, zzg + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzarv("Error parsing HEVC config", e);
        }
    }
}
