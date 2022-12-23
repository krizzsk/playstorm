package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzflt extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzflt zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private zzflp zzi;

    static {
        zzflt zzflt = new zzflt();
        zzb = zzflt;
        zzgko.zzaN(zzflt.class, zzflt);
    }

    private zzflt() {
    }

    public static zzflr zza() {
        return (zzflr) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzflt zzflt, String str) {
        str.getClass();
        zzflt.zze |= 2;
        zzflt.zzg = str;
    }

    static /* synthetic */ void zze(zzflt zzflt, zzflp zzflp) {
        zzflp.getClass();
        zzflt.zzi = zzflp;
        zzflt.zze |= 8;
    }

    static /* synthetic */ void zzf(zzflt zzflt, int i) {
        zzflt.zzf = 1;
        zzflt.zze = 1 | zzflt.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", zzfls.zza, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzflt();
        } else {
            if (i2 == 4) {
                return new zzflr((zzflq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
