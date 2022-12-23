package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgaz extends zzgar {
    public zzgaz() {
        super(zzgek.class, new zzgax(zzfwv.class));
    }

    public static final void zzh(zzgek zzgek) throws GeneralSecurityException {
        zzgik.zzb(zzgek.zza(), 0);
        if (zzgek.zzh().zzd() >= 16) {
            zzn(zzgek.zzg());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    static /* bridge */ /* synthetic */ zzgao zzm(int i, int i2, int i3, int i4) {
        zzgem zzc = zzgen.zzc();
        zzgep zzc2 = zzgeq.zzc();
        zzc2.zzb(i3);
        zzc2.zza(i2);
        zzc.zzb((zzgeq) zzc2.zzaj());
        zzc.zza(i);
        return new zzgao((zzgen) zzc.zzaj(), i4);
    }

    /* access modifiers changed from: private */
    public static void zzn(zzgeq zzgeq) throws GeneralSecurityException {
        if (zzgeq.zza() >= 10) {
            int zzg = zzgeq.zzg() - 2;
            if (zzg != 1) {
                if (zzg != 2) {
                    if (zzg != 3) {
                        if (zzg != 4) {
                            if (zzg != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (zzgeq.zza() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (zzgeq.zza() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (zzgeq.zza() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (zzgeq.zza() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (zzgeq.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final zzgap zza() {
        return new zzgay(this, zzgen.class);
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgek.zzf(zzgjg, zzgka.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzh((zzgek) zzgly);
    }

    public final int zze() {
        return 2;
    }

    public final int zzf() {
        return 3;
    }
}
