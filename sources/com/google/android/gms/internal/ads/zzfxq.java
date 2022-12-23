package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfxq extends zzgar {
    zzfxq() {
        super(zzgbq.class, new zzfxo(zzfwd.class));
    }

    static /* bridge */ /* synthetic */ zzgao zzg(int i, int i2, int i3, int i4, int i5, int i6) {
        zzgby zzc = zzgbz.zzc();
        zzgcb zzc2 = zzgcc.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgcc) zzc2.zzaj());
        zzc.zza(i);
        zzgem zzc3 = zzgen.zzc();
        zzgep zzc4 = zzgeq.zzc();
        zzc4.zzb(5);
        zzc4.zza(i4);
        zzc3.zzb((zzgeq) zzc4.zzaj());
        zzc3.zza(32);
        zzgbs zza = zzgbt.zza();
        zza.zza((zzgbz) zzc.zzaj());
        zza.zzb((zzgen) zzc3.zzaj());
        return new zzgao((zzgbt) zza.zzaj(), i6);
    }

    public final zzgap zza() {
        return new zzfxp(this, zzgbt.class);
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgbq.zze(zzgjg, zzgka.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzgbq zzgbq = (zzgbq) zzgly;
        zzgik.zzb(zzgbq.zza(), 0);
        new zzfxt();
        zzfxt.zzh(zzgbq.zzf());
        new zzgaz();
        zzgaz.zzh(zzgbq.zzg());
    }

    public final int zze() {
        return 2;
    }

    public final int zzf() {
        return 3;
    }
}
