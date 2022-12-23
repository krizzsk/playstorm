package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgen extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgen zzb;
    private zzgeq zze;
    /* access modifiers changed from: private */
    public int zzf;
    private int zzg;

    static {
        zzgen zzgen = new zzgen();
        zzb = zzgen;
        zzgko.zzaN(zzgen.class, zzgen);
    }

    private zzgen() {
    }

    public static zzgem zzc() {
        return (zzgem) zzb.zzaw();
    }

    public static zzgen zze() {
        return zzb;
    }

    public static zzgen zzf(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgen) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    static /* synthetic */ void zzh(zzgen zzgen, zzgeq zzgeq) {
        zzgeq.getClass();
        zzgen.zze = zzgeq;
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
            return zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgen();
        } else {
            if (i2 == 4) {
                return new zzgem((zzgel) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgeq zzg() {
        zzgeq zzgeq = this.zze;
        return zzgeq == null ? zzgeq.zze() : zzgeq;
    }
}
