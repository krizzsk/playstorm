package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfxw extends zzgar {
    zzfxw() {
        super(zzgcf.class, new zzfxu(zzfwd.class));
    }

    static /* bridge */ /* synthetic */ zzgao zzg(int i, int i2, int i3) {
        zzgch zzc = zzgci.zzc();
        zzc.zza(i);
        zzgck zzc2 = zzgcl.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgcl) zzc2.zzaj());
        return new zzgao((zzgci) zzc.zzaj(), i3);
    }

    public final zzgap zza() {
        return new zzfxv(this, zzgci.class);
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgcf.zze(zzgjg, zzgka.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzgcf zzgcf = (zzgcf) zzgly;
        zzgik.zzb(zzgcf.zza(), 0);
        zzgik.zza(zzgcf.zzg().zzd());
        if (zzgcf.zzf().zza() != 12 && zzgcf.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    public final int zzf() {
        return 3;
    }
}
