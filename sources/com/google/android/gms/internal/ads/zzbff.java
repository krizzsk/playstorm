package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbff extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbff zzb;
    private int zze;
    private int zzf;
    private zzgkt zzg = zzaE();

    static {
        zzbff zzbff = new zzbff();
        zzb = zzbff;
        zzgko.zzaN(zzbff.class, zzbff);
    }

    private zzbff() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zze", "zzf", zzbey.zza, "zzg"});
        } else if (i2 == 3) {
            return new zzbff();
        } else {
            if (i2 == 4) {
                return new zzbfe((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
