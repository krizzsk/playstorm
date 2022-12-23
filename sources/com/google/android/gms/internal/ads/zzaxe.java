package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaxe implements zzaxa {
    private final zzaxa[] zza;
    private final ArrayList zzb;
    private final zzasc zzc = new zzasc();
    private zzawz zzd;
    private zzasd zze;
    private int zzf = -1;
    private zzaxd zzg;

    public zzaxe(zzaxa... zzaxaArr) {
        this.zza = zzaxaArr;
        this.zzb = new ArrayList(Arrays.asList(zzaxaArr));
    }

    static /* bridge */ /* synthetic */ void zzf(zzaxe zzaxe, int i, zzasd zzasd, Object obj) {
        zzaxd zzaxd;
        if (zzaxe.zzg == null) {
            for (int i2 = 0; i2 <= 0; i2++) {
                zzasd.zzg(i2, zzaxe.zzc, false);
            }
            int i3 = zzaxe.zzf;
            if (i3 == -1) {
                zzaxe.zzf = 1;
            } else if (i3 != 1) {
                zzaxd = new zzaxd(1);
                zzaxe.zzg = zzaxd;
            }
            zzaxd = null;
            zzaxe.zzg = zzaxd;
        }
        if (zzaxe.zzg == null) {
            zzaxe.zzb.remove(zzaxe.zza[i]);
            if (i == 0) {
                zzaxe.zze = zzasd;
            }
            if (zzaxe.zzb.isEmpty()) {
                zzaxe.zzd.zzg(zzaxe.zze, (Object) null);
            }
        }
    }

    public final void zza() throws IOException {
        zzaxd zzaxd = this.zzg;
        if (zzaxd == null) {
            for (zzaxa zza2 : this.zza) {
                zza2.zza();
            }
            return;
        }
        throw zzaxd;
    }

    public final void zzb(zzari zzari, boolean z, zzawz zzawz) {
        this.zzd = zzawz;
        int i = 0;
        while (true) {
            zzaxa[] zzaxaArr = this.zza;
            if (i < zzaxaArr.length) {
                zzaxaArr[i].zzb(zzari, false, new zzaxc(this, i));
                i++;
            } else {
                return;
            }
        }
    }

    public final void zzc(zzawy zzawy) {
        zzaxb zzaxb = (zzaxb) zzawy;
        int i = 0;
        while (true) {
            zzaxa[] zzaxaArr = this.zza;
            if (i < zzaxaArr.length) {
                zzaxaArr[i].zzc(zzaxb.zza[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void zzd() {
        for (zzaxa zzd2 : this.zza) {
            zzd2.zzd();
        }
    }

    public final zzawy zze(int i, zzayl zzayl) {
        int length = this.zza.length;
        zzawy[] zzawyArr = new zzawy[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzawyArr[i2] = this.zza[i2].zze(i, zzayl);
        }
        return new zzaxb(zzawyArr);
    }
}
