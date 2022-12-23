package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbgu extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbgu zzb;
    private int zze;
    private zzbgl zzf;
    private int zzg = 1000;
    private zzbgs zzh;
    private zzbgj zzi;

    static {
        zzbgu zzbgu = new zzbgu();
        zzb = zzbgu;
        zzgko.zzaN(zzbgu.class, zzbgu);
    }

    private zzbgu() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", zzbey.zza, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzbgu();
        } else {
            if (i2 == 4) {
                return new zzbgt((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
