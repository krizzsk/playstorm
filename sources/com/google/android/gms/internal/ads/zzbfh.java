package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbfh extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbfh zzb;
    private int zze;
    private zzbfd zzf;
    private zzgkx zzg = zzaH();
    private int zzh;
    private zzbgj zzi;

    static {
        zzbfh zzbfh = new zzbfh();
        zzb = zzbfh;
        zzgko.zzaN(zzbfh.class, zzbfh);
    }

    private zzbfh() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzbgh.class, "zzh", zzbey.zza, "zzi"});
        } else if (i2 == 3) {
            return new zzbfh();
        } else {
            if (i2 == 4) {
                return new zzbfg((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
