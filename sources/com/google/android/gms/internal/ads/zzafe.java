package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzafe {
    private final zzaff zza = new zzaff();
    private final zzdy zzb = new zzdy(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzafe() {
    }

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzaff zzaff = this.zza;
            if (i5 >= zzaff.zzc) {
                break;
            }
            int[] iArr = zzaff.zzf;
            this.zzd = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final zzdy zza() {
        return this.zzb;
    }

    public final zzaff zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzC(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzdy zzdy = this.zzb;
        if (zzdy.zzH().length != 65025) {
            zzdy.zzD(Arrays.copyOf(zzdy.zzH(), Math.max(65025, zzdy.zzd())), this.zzb.zzd());
        }
    }

    public final boolean zze(zzyt zzyt) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zzC(0);
        }
        while (true) {
            boolean z = true;
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                if (!this.zza.zzc(zzyt, -1) || !this.zza.zzb(zzyt, true)) {
                    return false;
                }
                zzaff zzaff = this.zza;
                int i2 = zzaff.zzd;
                if ((zzaff.zza & 1) == 1 && this.zzb.zzd() == 0) {
                    i2 += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!zzyw.zze(zzyt, i2)) {
                    return false;
                }
                this.zzc = i;
            }
            int zzf = zzf(i);
            int i3 = this.zzc + this.zzd;
            if (zzf > 0) {
                zzdy zzdy = this.zzb;
                zzdy.zzz(zzdy.zzd() + zzf);
                zzdy zzdy2 = this.zzb;
                if (!zzyw.zzd(zzyt, zzdy2.zzH(), zzdy2.zzd(), zzf)) {
                    return false;
                }
                zzdy zzdy3 = this.zzb;
                zzdy3.zzE(zzdy3.zzd() + zzf);
                if (this.zza.zzf[i3 - 1] == 255) {
                    z = false;
                }
                this.zze = z;
            }
            if (i3 == this.zza.zzc) {
                i3 = -1;
            }
            this.zzc = i3;
        }
        return false;
    }
}
