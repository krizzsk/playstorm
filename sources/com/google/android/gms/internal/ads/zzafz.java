package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzafz implements zzaga {
    private final List zza;
    private final zzzz[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzafz(List list) {
        this.zza = list;
        this.zzb = new zzzz[list.size()];
    }

    private final boolean zzf(zzdy zzdy, int i) {
        if (zzdy.zza() == 0) {
            return false;
        }
        if (zzdy.zzk() != i) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    public final void zza(zzdy zzdy) {
        if (!this.zzc) {
            return;
        }
        if (this.zzd != 2 || zzf(zzdy, 32)) {
            if (this.zzd != 1 || zzf(zzdy, 0)) {
                int zzc2 = zzdy.zzc();
                int zza2 = zzdy.zza();
                for (zzzz zzq : this.zzb) {
                    zzdy.zzF(zzc2);
                    zzq.zzq(zzdy, zza2);
                }
                this.zze += zza2;
            }
        }
    }

    public final void zzb(zzyv zzyv, zzahm zzahm) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzahj zzahj = (zzahj) this.zza.get(i);
            zzahm.zzc();
            zzzz zzv = zzyv.zzv(zzahm.zza(), 3);
            zzab zzab = new zzab();
            zzab.zzH(zzahm.zzb());
            zzab.zzS("application/dvbsubs");
            zzab.zzI(Collections.singletonList(zzahj.zzb));
            zzab.zzK(zzahj.zza);
            zzv.zzk(zzab.zzY());
            this.zzb[i] = zzv;
        }
    }

    public final void zzc() {
        if (this.zzc) {
            if (this.zzf != -9223372036854775807L) {
                for (zzzz zzs : this.zzb) {
                    zzs.zzs(this.zzf, 1, this.zze, 0, (zzzy) null);
                }
            }
            this.zzc = false;
        }
    }

    public final void zzd(long j, int i) {
        if ((i & 4) != 0) {
            this.zzc = true;
            if (j != -9223372036854775807L) {
                this.zzf = j;
            }
            this.zze = 0;
            this.zzd = 2;
        }
    }

    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
