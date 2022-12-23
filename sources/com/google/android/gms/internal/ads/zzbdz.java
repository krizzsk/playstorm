package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbdz extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbdz zzb;
    private int zze;
    private int zzf;
    private zzbed zzg;
    private zzbef zzh;

    static {
        zzbdz zzbdz = new zzbdz();
        zzb = zzbdz;
        zzgko.zzaN(zzbdz.class, zzbdz);
    }

    private zzbdz() {
    }

    public static zzbdy zza() {
        return (zzbdy) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzbdz zzbdz, zzbed zzbed) {
        zzbed.getClass();
        zzbdz.zzg = zzbed;
        zzbdz.zze |= 2;
    }

    static /* synthetic */ void zze(zzbdz zzbdz, zzbef zzbef) {
        zzbef.getClass();
        zzbdz.zzh = zzbef;
        zzbdz.zze |= 4;
    }

    static /* synthetic */ void zzf(zzbdz zzbdz, int i) {
        zzbdz.zzf = 1;
        zzbdz.zze = 1 | zzbdz.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", zzbeb.zza, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzbdz();
        } else {
            if (i2 == 4) {
                return new zzbdy((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
