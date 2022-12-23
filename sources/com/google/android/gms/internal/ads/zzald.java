package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzald extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzald zzb;
    private int zze;
    private int zzf = 2;

    static {
        zzald zzald = new zzald();
        zzb = zzald;
        zzgko.zzaN(zzald.class, zzald);
    }

    private zzald() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zze", "zzf", zzale.zza});
        } else if (i2 == 3) {
            return new zzald();
        } else {
            if (i2 == 4) {
                return new zzalc((zzakz) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
