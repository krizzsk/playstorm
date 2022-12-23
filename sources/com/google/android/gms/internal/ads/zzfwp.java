package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfwp {
    private final zzgfm zza;

    private zzfwp(zzgfm zzgfm) {
        this.zza = zzgfm;
    }

    public static zzfwp zze(String str, byte[] bArr, int i) {
        zzgfl zza2 = zzgfm.zza();
        zza2.zza(str);
        zza2.zzb(zzgjg.zzv(bArr));
        int i2 = i - 1;
        zza2.zzc(i2 != 0 ? i2 != 1 ? 5 : 4 : 3);
        return new zzfwp((zzgfm) zza2.zzaj());
    }

    /* access modifiers changed from: package-private */
    public final zzgfm zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zza.zzf();
    }

    public final byte[] zzc() {
        return this.zza.zze().zzE();
    }

    public final int zzd() {
        int zzi = this.zza.zzi() - 2;
        int i = 1;
        if (zzi != 1) {
            i = 2;
            if (zzi != 2) {
                i = 3;
                if (zzi != 3) {
                    if (zzi == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
