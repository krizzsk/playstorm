package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfws {
    private final zzgfr zza;

    private zzfws(zzgfr zzgfr) {
        this.zza = zzgfr;
    }

    public static zzfws zzd() {
        return new zzfws(zzgfu.zzd());
    }

    private final synchronized int zze() {
        int zza2;
        zza2 = zzgat.zza();
        while (zzg(zza2)) {
            zza2 = zzgat.zza();
        }
        return zza2;
    }

    private final synchronized zzgft zzf(zzgfm zzgfm) throws GeneralSecurityException {
        return zzh(zzfxi.zzc(zzgfm), zzgfm.zzi());
    }

    private final synchronized boolean zzg(int i) {
        boolean z;
        Iterator it = this.zza.zzc().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((zzgft) it.next()).zza() == i) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }

    private final synchronized zzgft zzh(zzgfh zzgfh, int i) throws GeneralSecurityException {
        zzgfs zzd;
        int zze = zze();
        if (i != 2) {
            zzd = zzgft.zzd();
            zzd.zza(zzgfh);
            zzd.zzb(zze);
            zzd.zzd(3);
            zzd.zzc(i);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (zzgft) zzd.zzaj();
    }

    @Deprecated
    public final synchronized int zza(zzgfm zzgfm, boolean z) throws GeneralSecurityException {
        zzgft zzf;
        zzf = zzf(zzgfm);
        this.zza.zza(zzf);
        this.zza.zzb(zzf.zza());
        return zzf.zza();
    }

    public final synchronized zzfwr zzb() throws GeneralSecurityException {
        return zzfwr.zza((zzgfu) this.zza.zzaj());
    }

    @Deprecated
    public final synchronized zzfws zzc(zzgfm zzgfm) throws GeneralSecurityException {
        zza(zzgfm, true);
        return this;
    }
}
