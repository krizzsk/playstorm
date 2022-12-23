package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzri implements zzsl, zzpe {
    final /* synthetic */ zzrk zza;
    private final Object zzb;
    private zzsk zzc;
    private zzpd zzd;

    public zzri(zzrk zzrk, Object obj) {
        this.zza = zzrk;
        this.zzc = zzrk.zze((zzsb) null);
        this.zzd = zzrk.zzc((zzsb) null);
        this.zzb = obj;
    }

    private final boolean zzf(int i, zzsb zzsb) {
        zzsb zzsb2;
        if (zzsb != null) {
            zzsb2 = this.zza.zzv(this.zzb, zzsb);
            if (zzsb2 == null) {
                return false;
            }
        } else {
            zzsb2 = null;
        }
        zzsk zzsk = this.zzc;
        if (zzsk.zza != i || !zzeg.zzS(zzsk.zzb, zzsb2)) {
            this.zzc = this.zza.zzf(i, zzsb2, 0);
        }
        zzpd zzpd = this.zzd;
        if (zzpd.zza == i && zzeg.zzS(zzpd.zzb, zzsb2)) {
            return true;
        }
        this.zzd = this.zza.zzd(i, zzsb2);
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
