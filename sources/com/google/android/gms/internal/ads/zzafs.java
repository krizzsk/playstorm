package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzafs implements zzys {
    public static final zzyz zza = zzafr.zza;
    private final zzaft zzb = new zzaft((String) null);
    private final zzdy zzc = new zzdy(16384);
    private boolean zzd;

    public final int zza(zzyt zzyt, zzzs zzzs) throws IOException {
        int zza2 = zzyt.zza(this.zzc.zzH(), 0, 16384);
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
        int i;
        zzdy zzdy = new zzdy(10);
        int i2 = 0;
        while (true) {
            zzym = (zzym) zzyt;
            zzym.zzm(zzdy.zzH(), 0, 10, false);
            zzdy.zzF(0);
            if (zzdy.zzm() != 4801587) {
                break;
            }
            zzdy.zzG(3);
            int zzj = zzdy.zzj();
            i2 += zzj + 10;
            zzym.zzl(zzj, false);
        }
        zzyt.zzj();
        zzym.zzl(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zzym.zzm(zzdy.zzH(), 0, 7, false);
            zzdy.zzF(0);
            int zzo = zzdy.zzo();
            if (zzo == 44096 || zzo == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] zzH = zzdy.zzH();
                int i6 = zzya.zza;
                if (zzH.length < 7) {
                    i = -1;
                } else {
                    byte b = ((zzH[2] & 255) << 8) | (zzH[3] & 255);
                    if (b == 65535) {
                        b = ((zzH[4] & 255) << Ascii.DLE) | ((zzH[5] & 255) << 8) | (zzH[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (zzo == 44097) {
                        i5 += 2;
                    }
                    i = b + i5;
                }
                if (i == -1) {
                    return false;
                }
                zzym.zzl(i - 7, false);
            } else {
                zzyt.zzj();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zzym.zzl(i4, false);
                i3 = 0;
            }
        }
    }
}
