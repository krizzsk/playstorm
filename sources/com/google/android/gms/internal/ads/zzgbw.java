package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgbw extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgbw zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgcc zzf;
    /* access modifiers changed from: private */
    public zzgjg zzg = zzgjg.zzb;

    static {
        zzgbw zzgbw = new zzgbw();
        zzb = zzgbw;
        zzgko.zzaN(zzgbw.class, zzgbw);
    }

    private zzgbw() {
    }

    public static zzgbv zzc() {
        return (zzgbv) zzb.zzaw();
    }

    public static zzgbw zze() {
        return zzb;
    }

    public static zzgbw zzf(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgbw) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    static /* synthetic */ void zzj(zzgbw zzgbw, zzgcc zzgcc) {
        zzgcc.getClass();
        zzgbw.zzf = zzgcc;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgbw();
        } else {
            if (i2 == 4) {
                return new zzgbv((zzgbu) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgcc zzg() {
        zzgcc zzgcc = this.zzf;
        return zzgcc == null ? zzgcc.zze() : zzgcc;
    }

    public final zzgjg zzh() {
        return this.zzg;
    }
}
