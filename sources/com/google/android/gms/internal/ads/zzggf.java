package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzggf extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzggf zzb;
    private String zze = "";

    static {
        zzggf zzggf = new zzggf();
        zzb = zzggf;
        zzgko.zzaN(zzggf.class, zzggf);
    }

    private zzggf() {
    }

    public static zzggf zzc() {
        return zzb;
    }

    public static zzggf zzd(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzggf) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzggf();
        } else {
            if (i2 == 4) {
                return new zzgge((zzggd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zze() {
        return this.zze;
    }
}
