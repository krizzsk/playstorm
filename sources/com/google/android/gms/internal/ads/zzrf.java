package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzrf implements zztr {
    public final zztr zza;
    final /* synthetic */ zzrg zzb;
    private boolean zzc;

    public zzrf(zzrg zzrg, zztr zztr) {
        this.zzb = zzrg;
        this.zza = zztr;
    }

    public final int zza(zzja zzja, zzgc zzgc, int i) {
        if (this.zzb.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzgc.zzc(4);
            return -4;
        }
        int zza2 = this.zza.zza(zzja, zzgc, i);
        if (zza2 == -5) {
            zzad zzad = zzja.zza;
            if (zzad != null) {
                int i2 = zzad.zzC;
                int i3 = 0;
                if (i2 == 0) {
                    if (zzad.zzD != 0) {
                        i2 = 0;
                    }
                    return -5;
                }
                if (this.zzb.zzb == Long.MIN_VALUE) {
                    i3 = zzad.zzD;
                }
                zzab zzb2 = zzad.zzb();
                zzb2.zzC(i2);
                zzb2.zzD(i3);
                zzja.zza = zzb2.zzY();
                return -5;
            }
            throw null;
        }
        zzrg zzrg = this.zzb;
        long j = zzrg.zzb;
        if (j == Long.MIN_VALUE || ((zza2 != -4 || zzgc.zzd < j) && (zza2 != -3 || zzrg.zzb() != Long.MIN_VALUE || zzgc.zzc))) {
            return zza2;
        }
        zzgc.zzb();
        zzgc.zzc(4);
        this.zzc = true;
        return -4;
    }

    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
