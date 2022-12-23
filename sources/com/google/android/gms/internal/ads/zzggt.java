package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzggt extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzggt zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzgjg zzf = zzgjg.zzb;

    static {
        zzggt zzggt = new zzggt();
        zzb = zzggt;
        zzgko.zzaN(zzggt.class, zzggt);
    }

    private zzggt() {
    }

    public static zzggs zzc() {
        return (zzggs) zzb.zzaw();
    }

    public static zzggt zze(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzggt) zzgko.zzaB(zzb, zzgjg, zzgka);
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
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzggt();
        } else {
            if (i2 == 4) {
                return new zzggs((zzggr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgjg zzf() {
        return this.zzf;
    }
}
