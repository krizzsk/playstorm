package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfzw implements zzghi {
    private final String zza;
    private final int zzb;
    private zzgco zzc;
    private zzgbq zzd;
    private int zze;
    private zzgda zzf;

    zzfzw(zzgfm zzgfm) throws GeneralSecurityException {
        String zzf2 = zzgfm.zzf();
        this.zza = zzf2;
        if (zzf2.equals(zzfxk.zzb)) {
            try {
                zzgcr zze2 = zzgcr.zze(zzgfm.zze(), zzgka.zza());
                this.zzc = (zzgco) zzfxi.zzd(zzgfm);
                this.zzb = zze2.zza();
            } catch (zzgla e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.zza.equals(zzfxk.zza)) {
            try {
                zzgbt zzd2 = zzgbt.zzd(zzgfm.zze(), zzgka.zza());
                this.zzd = (zzgbq) zzfxi.zzd(zzgfm);
                this.zze = zzd2.zze().zza();
                this.zzb = this.zze + zzd2.zzf().zza();
            } catch (zzgla e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (this.zza.equals(zzfzh.zza)) {
            try {
                zzgdd zze3 = zzgdd.zze(zzgfm.zze(), zzgka.zza());
                this.zzf = (zzgda) zzfxi.zzd(zzgfm);
                this.zzb = zze3.zza();
            } catch (zzgla e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(this.zza)));
        }
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzgan zzb(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.zzb) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.zza.equals(zzfxk.zzb)) {
            zzgcn zzc2 = zzgco.zzc();
            zzc2.zzah(this.zzc);
            zzc2.zza(zzgjg.zzw(bArr, 0, this.zzb));
            return new zzgan((zzfwd) zzfxi.zzg(this.zza, (zzgco) zzc2.zzaj(), zzfwd.class));
        } else if (this.zza.equals(zzfxk.zza)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
            zzgbv zzc3 = zzgbw.zzc();
            zzc3.zzah(this.zzd.zzf());
            zzc3.zza(zzgjg.zzv(copyOfRange));
            zzgej zzc4 = zzgek.zzc();
            zzc4.zzah(this.zzd.zzg());
            zzc4.zza(zzgjg.zzv(copyOfRange2));
            zzgbp zzc5 = zzgbq.zzc();
            zzc5.zzc(this.zzd.zza());
            zzc5.zza((zzgbw) zzc3.zzaj());
            zzc5.zzb((zzgek) zzc4.zzaj());
            return new zzgan((zzfwd) zzfxi.zzg(this.zza, (zzgbq) zzc5.zzaj(), zzfwd.class));
        } else if (this.zza.equals(zzfzh.zza)) {
            zzgcz zzc6 = zzgda.zzc();
            zzc6.zzah(this.zzf);
            zzc6.zza(zzgjg.zzw(bArr, 0, this.zzb));
            return new zzgan((zzfwj) zzfxi.zzg(this.zza, (zzgda) zzc6.zzaj(), zzfwj.class));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
