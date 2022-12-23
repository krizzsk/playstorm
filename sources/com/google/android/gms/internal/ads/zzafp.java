package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzafp implements zzys {
    public static final zzyz zza = zzafo.zza;
    private final zzafq zzb = new zzafq((String) null);
    private final zzdy zzc = new zzdy(2786);
    private boolean zzd;

    public final int zza(zzyt zzyt, zzzs zzzs) throws IOException {
        int zza2 = zzyt.zza(this.zzc.zzH(), 0, 2786);
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(zza2);
        if (!this.zzd) {
            this.zzb.zzd(0, 4);
            this.zzd = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    public final void zzb(zzyv zzyv) {
        this.zzb.zzb(zzyv, new zzahm(Integer.MIN_VALUE, 0, 1));
        zzyv.zzB();
        zzyv.zzL(new zzzu(-9223372036854775807L, 0));
    }

    public final void zzc(long j, long j2) {
        this.zzd = false;
        this.zzb.zze();
    }

    public final boolean zzd(zzyt zzyt) throws IOException {
        zzym zzym;
        zzdy zzdy = new zzdy(10);
        int i = 0;
        while (true) {
            zzym = (zzym) zzyt;
            zzym.zzm(zzdy.zzH(), 0, 10, false);
            zzdy.zzF(0);
            if (zzdy.zzm() != 4801587) {
                break;
            }
            zzdy.zzG(3);
            int zzj = zzdy.zzj();
            i += zzj + 10;
            zzym.zzl(zzj, false);
        }
        zzyt.zzj();
        zzym.zzl(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            zzym.zzm(zzdy.zzH(), 0, 6, false);
            zzdy.zzF(0);
            if (zzdy.zzo() != 2935) {
                zzyt.zzj();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                zzym.zzl(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int zzb2 = zzxx.zzb(zzdy.zzH());
                if (zzb2 == -1) {
                    return false;
                }
                zzym.zzl(zzb2 - 6, false);
            }
        }
    }
}
