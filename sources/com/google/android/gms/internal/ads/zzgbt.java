package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgbt extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgbt zzb;
    private zzgbz zze;
    private zzgen zzf;

    static {
        zzgbt zzgbt = new zzgbt();
        zzb = zzgbt;
        zzgko.zzaN(zzgbt.class, zzgbt);
    }

    private zzgbt() {
    }

    public static zzgbs zza() {
        return (zzgbs) zzb.zzaw();
    }

    public static zzgbt zzd(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgbt) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    static /* synthetic */ void zzg(zzgbt zzgbt, zzgbz zzgbz) {
        zzgbz.getClass();
        zzgbt.zze = zzgbz;
    }

    static /* synthetic */ void zzh(zzgbt zzgbt, zzgen zzgen) {
        zzgen.getClass();
        zzgbt.zzf = zzgen;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgbt();
        } else {
            if (i2 == 4) {
                return new zzgbs((zzgbr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgbz zze() {
        zzgbz zzgbz = this.zze;
        return zzgbz == null ? zzgbz.zze() : zzgbz;
    }

    public final zzgen zzf() {
        zzgen zzgen = this.zzf;
        return zzgen == null ? zzgen.zze() : zzgen;
    }
}
