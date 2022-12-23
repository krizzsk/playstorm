package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzafb extends zzafl {
    private zzzf zza;
    private zzafa zzb;

    zzafb() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    public final long zza(zzdy zzdy) {
        if (!zzd(zzdy.zzH())) {
            return -1;
        }
        int i = (zzdy.zzH()[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int zza2 = zzzb.zza(zzdy, i);
            zzdy.zzF(0);
            return (long) zza2;
        }
        zzdy.zzG(4);
        zzdy.zzu();
        int zza22 = zzzb.zza(zzdy, i);
        zzdy.zzF(0);
        return (long) zza22;
    }

    /* access modifiers changed from: protected */
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzdy zzdy, long j, zzafi zzafi) {
        byte[] zzH = zzdy.zzH();
        zzzf zzzf = this.zza;
        if (zzzf == null) {
            zzzf zzzf2 = new zzzf(zzH, 17);
            this.zza = zzzf2;
            zzafi.zza = zzzf2.zzc(Arrays.copyOfRange(zzH, 9, zzdy.zzd()), (zzbl) null);
            return true;
        } else if ((zzH[0] & Byte.MAX_VALUE) == 3) {
            zzze zzb2 = zzzc.zzb(zzdy);
            zzzf zzf = zzzf.zzf(zzb2);
            this.zza = zzf;
            this.zzb = new zzafa(zzf, zzb2);
            return true;
        } else if (!zzd(zzH)) {
            return true;
        } else {
            zzafa zzafa = this.zzb;
            if (zzafa != null) {
                zzafa.zza(j);
                zzafi.zzb = this.zzb;
            }
            if (zzafi.zza != null) {
                return false;
            }
            throw null;
        }
    }
}
