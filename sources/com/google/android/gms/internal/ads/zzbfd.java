package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbfd extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbfd zzb;
    private int zze;
    private String zzf = "";
    private int zzg;
    private zzgkt zzh = zzaE();
    private zzbgj zzi;

    static {
        zzbfd zzbfd = new zzbfd();
        zzb = zzbfd;
        zzgko.zzaN(zzbfd.class, zzbfd);
    }

    private zzbfd() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzbey.zza, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzbfd();
        } else {
            if (i2 == 4) {
                return new zzbfc((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
