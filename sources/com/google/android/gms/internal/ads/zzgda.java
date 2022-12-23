package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgda extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgda zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzgjg zzf = zzgjg.zzb;

    static {
        zzgda zzgda = new zzgda();
        zzb = zzgda;
        zzgko.zzaN(zzgda.class, zzgda);
    }

    private zzgda() {
    }

    public static zzgcz zzc() {
        return (zzgcz) zzb.zzaw();
    }

    public static zzgda zze(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgda) zzgko.zzaB(zzb, zzgjg, zzgka);
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
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgda();
        } else {
            if (i2 == 4) {
                return new zzgcz((zzgcy) null);
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
