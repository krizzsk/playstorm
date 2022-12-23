package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbef extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbef zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzbef zzbef = new zzbef();
        zzb = zzbef;
        zzgko.zzaN(zzbef.class, zzbef);
    }

    private zzbef() {
    }

    public static zzbee zza() {
        return (zzbee) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzbef zzbef, boolean z) {
        zzbef.zze |= 1;
        zzbef.zzf = z;
    }

    static /* synthetic */ void zze(zzbef zzbef, boolean z) {
        zzbef.zze |= 2;
        zzbef.zzg = z;
    }

    static /* synthetic */ void zzf(zzbef zzbef, int i) {
        zzbef.zze |= 4;
        zzbef.zzh = i;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzbef();
        } else {
            if (i2 == 4) {
                return new zzbee((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
