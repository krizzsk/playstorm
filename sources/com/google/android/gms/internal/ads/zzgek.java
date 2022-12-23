package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgek extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgek zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgeq zzf;
    /* access modifiers changed from: private */
    public zzgjg zzg = zzgjg.zzb;

    static {
        zzgek zzgek = new zzgek();
        zzb = zzgek;
        zzgko.zzaN(zzgek.class, zzgek);
    }

    private zzgek() {
    }

    public static zzgej zzc() {
        return (zzgej) zzb.zzaw();
    }

    public static zzgek zze() {
        return zzb;
    }

    public static zzgek zzf(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgek) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    static /* synthetic */ void zzj(zzgek zzgek, zzgeq zzgeq) {
        zzgeq.getClass();
        zzgek.zzf = zzgeq;
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
            return new zzgek();
        } else {
            if (i2 == 4) {
                return new zzgej((zzgei) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgeq zzg() {
        zzgeq zzgeq = this.zzf;
        return zzgeq == null ? zzgeq.zze() : zzgeq;
    }

    public final zzgjg zzh() {
        return this.zzg;
    }
}
