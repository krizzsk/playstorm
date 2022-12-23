package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgdj extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgdj zzb;

    static {
        zzgdj zzgdj = new zzgdj();
        zzb = zzgdj;
        zzgko.zzaN(zzgdj.class, zzgdj);
    }

    private zzgdj() {
    }

    public static zzgdj zzc() {
        return zzb;
    }

    public static zzgdj zzd(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgdj) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new zzgdj();
        }
        if (i2 == 4) {
            return new zzgdi((zzgdh) null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
