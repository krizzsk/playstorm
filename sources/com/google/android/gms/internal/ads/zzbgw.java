package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbgw extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbgw zzb;
    private int zze;
    private int zzf = 1000;
    private zzbgs zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zzbgw zzbgw = new zzbgw();
        zzb = zzbgw;
        zzgko.zzaN(zzbgw.class, zzbgw);
    }

    private zzbgw() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zze", "zzf", zzbey.zza, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzbgw();
        } else {
            if (i2 == 4) {
                return new zzbgv((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
