package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzjj implements zzsl, zzpe {
    final /* synthetic */ zzjn zza;
    private final zzjl zzb;
    private zzsk zzc;
    private zzpd zzd;

    public zzjj(zzjn zzjn, zzjl zzjl) {
        this.zza = zzjn;
        this.zzc = zzjn.zzf;
        this.zzd = zzjn.zzg;
        this.zzb = zzjl;
    }

    private final boolean zzf(int i, zzsb zzsb) {
        zzsb zzsb2 = null;
        if (zzsb != null) {
            zzjl zzjl = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzjl.zzc.size()) {
                    break;
                } else if (((zzsb) zzjl.zzc.get(i2)).zzd == zzsb.zzd) {
                    zzsb2 = zzsb.zzc(Pair.create(zzjl.zzb, zzsb.zza));
                    break;
                } else {
                    i2++;
                }
            }
            if (zzsb2 == null) {
                return false;
            }
        }
        int i3 = i + this.zzb.zzd;
        zzsk zzsk = this.zzc;
        if (zzsk.zza != i3 || !zzeg.zzS(zzsk.zzb, zzsb2)) {
            this.zzc = this.zza.zzf.zza(i3, zzsb2, 0);
        }
        zzpd zzpd = this.zzd;
        if (zzpd.zza == i3 && zzeg.zzS(zzpd.zzb, zzsb2)) {
            return true;
        }
        this.zzd = this.zza.zzg.zza(i3, zzsb2);
        return true;
    }

    public final void zzaf(int i, zzsb zzsb, zzrx zzrx) {
        if (zzf(i, zzsb)) {
            this.zzc.zzc(zzrx);
        }
    }

    public final void zzag(int i, zzsb zzsb, zzrs zzrs, zzrx zzrx) {
        if (zzf(i, zzsb)) {
            this.zzc.zze(zzrs, zzrx);
        }
    }

    public final void zzah(int i, zzsb zzsb, zzrs zzrs, zzrx zzrx) {
        if (zzf(i, zzsb)) {
            this.zzc.zzg(zzrs, zzrx);
        }
    }

    public final void zzai(int i, zzsb zzsb, zzrs zzrs, zzrx zzrx, IOException iOException, boolean z) {
        if (zzf(i, zzsb)) {
            this.zzc.zzi(zzrs, zzrx, iOException, z);
        }
    }

    public final void zzaj(int i, zzsb zzsb, zzrs zzrs, zzrx zzrx) {
        if (zzf(i, zzsb)) {
            this.zzc.zzk(zzrs, zzrx);
        }
    }
}
