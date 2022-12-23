package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzalt extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzalt zzb;
    private int zze;
    private long zzf = -1;
    private int zzg = 1000;

    static {
        zzalt zzalt = new zzalt();
        zzb = zzalt;
        zzgko.zzaN(zzalt.class, zzalt);
    }

    private zzalt() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", zzame.zza});
        } else if (i2 == 3) {
            return new zzalt();
        } else {
            if (i2 == 4) {
                return new zzals((zzalh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
