package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfzm extends zzgas {
    /* access modifiers changed from: private */
    public static final byte[] zza = new byte[0];

    zzfzm() {
        super(zzgdx.class, zzgea.class, new zzfzk(zzfwk.class));
    }

    static /* bridge */ /* synthetic */ zzgao zzh(int i, int i2, int i3, zzfwp zzfwp, byte[] bArr, int i4) {
        zzgdq zza2 = zzgdr.zza();
        zzgec zza3 = zzged.zza();
        int i5 = 4;
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzgjg.zzv(bArr));
        zzged zzged = (zzged) zza3.zzaj();
        zzgfl zza4 = zzgfm.zza();
        zza4.zza(zzfwp.zzb());
        zza4.zzb(zzgjg.zzv(zzfwp.zzc()));
        int zzd = zzfwp.zzd() - 1;
        if (zzd == 0) {
            i5 = 3;
        } else if (zzd != 1) {
            i5 = zzd != 2 ? 6 : 5;
        }
        zza4.zzc(i5);
        zzgdn zza5 = zzgdo.zza();
        zza5.zza((zzgfm) zza4.zzaj());
        zzgdt zzc = zzgdu.zzc();
        zzc.zzb(zzged);
        zzc.zza((zzgdo) zza5.zzaj());
        zzc.zzc(i3);
        zza2.zza((zzgdu) zzc.zzaj());
        return new zzgao((zzgdr) zza2.zzaj(), i4);
    }

    public final zzgap zza() {
        return new zzfzl(this, zzgdr.class);
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgdx.zze(zzgjg, zzgka.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzgdx zzgdx = (zzgdx) zzgly;
        if (!zzgdx.zzg().zzD()) {
            zzgik.zzb(zzgdx.zza(), 0);
            zzfzv.zza(zzgdx.zzf().zzc());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    public final int zzf() {
        return 4;
    }
}
