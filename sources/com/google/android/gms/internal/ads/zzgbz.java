package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgbz extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgbz zzb;
    private zzgcc zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzgbz zzgbz = new zzgbz();
        zzb = zzgbz;
        zzgko.zzaN(zzgbz.class, zzgbz);
    }

    private zzgbz() {
    }

    public static zzgby zzc() {
        return (zzgby) zzb.zzaw();
    }

    public static zzgbz zze() {
        return zzb;
    }

    public static zzgbz zzf(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgbz) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    static /* synthetic */ void zzh(zzgbz zzgbz, zzgcc zzgcc) {
        zzgcc.getClass();
        zzgbz.zze = zzgcc;
    }

    public final int zza() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgbz();
        } else {
            if (i2 == 4) {
                return new zzgby((zzgbx) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgcc zzg() {
        zzgcc zzgcc = this.zze;
        return zzgcc == null ? zzgcc.zze() : zzgcc;
    }
}
