package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbgs extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbgs zzb;
    private int zze;
    private int zzf;

    static {
        zzbgs zzbgs = new zzbgs();
        zzb = zzbgs;
        zzgko.zzaN(zzbgs.class, zzbgs);
    }

    private zzbgs() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", zzbgr.zza});
        } else if (i2 == 3) {
            return new zzbgs();
        } else {
            if (i2 == 4) {
                return new zzbgq((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
