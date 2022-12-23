package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbel extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbel zzb;
    private int zze;
    private int zzf;
    private zzbgf zzg;

    static {
        zzbel zzbel = new zzbel();
        zzb = zzbel;
        zzgko.zzaN(zzbel.class, zzbel);
    }

    private zzbel() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzbej.zzc(), "zzg"});
        } else if (i2 == 3) {
            return new zzbel();
        } else {
            if (i2 == 4) {
                return new zzbek((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
