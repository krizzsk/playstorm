package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbgp extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbgp zzb;
    private int zze;
    private int zzf = 1000;
    private zzbgs zzg;
    private zzbgj zzh;

    static {
        zzbgp zzbgp = new zzbgp();
        zzb = zzbgp;
        zzgko.zzaN(zzbgp.class, zzbgp);
    }

    private zzbgp() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", zzbey.zza, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzbgp();
        } else {
            if (i2 == 4) {
                return new zzbgo((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
