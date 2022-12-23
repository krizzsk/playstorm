package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzzj {
    private final zzdy zza = new zzdy(10);

    public final zzbl zza(zzyt zzyt, zzabz zzabz) throws IOException {
        zzbl zzbl = null;
        int i = 0;
        while (true) {
            try {
                ((zzym) zzyt).zzm(this.zza.zzH(), 0, 10, false);
                this.zza.zzF(0);
                if (this.zza.zzm() != 4801587) {
                    break;
                }
                this.zza.zzG(3);
                int zzj = this.zza.zzj();
                int i2 = zzj + 10;
                if (zzbl == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zza.zzH(), 0, bArr, 0, 10);
                    ((zzym) zzyt).zzm(bArr, 10, zzj, false);
                    zzbl = zzacb.zza(bArr, i2, zzabz, new zzabc());
                } else {
                    ((zzym) zzyt).zzl(zzj, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzyt.zzj();
        ((zzym) zzyt).zzl(i, false);
        return zzbl;
    }
}
