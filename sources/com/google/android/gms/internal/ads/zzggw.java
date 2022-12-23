package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzggw extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzggw zzb;
    private int zze;

    static {
        zzggw zzggw = new zzggw();
        zzb = zzggw;
        zzgko.zzaN(zzggw.class, zzggw);
    }

    private zzggw() {
    }

    public static zzggw zzc() {
        return zzb;
    }

    public static zzggw zzd(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzggw) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzggw();
        } else {
            if (i2 == 4) {
                return new zzggv((zzggu) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
