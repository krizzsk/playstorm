package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbep extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbep zzb;
    private int zze;
    private String zzf = "";
    private zzgkx zzg = zzaH();
    private int zzh = 1000;
    private int zzi = 1000;
    private int zzj = 1000;

    static {
        zzbep zzbep = new zzbep();
        zzb = zzbep;
        zzgko.zzaN(zzbep.class, zzbep);
    }

    private zzbep() {
    }

    public static zzbep zzc() {
        return zzb;
    }

    static /* synthetic */ void zzd(zzbep zzbep, String str) {
        str.getClass();
        zzbep.zze |= 1;
        zzbep.zzf = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgks zzgks = zzbey.zza;
            return zzaM(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zze", "zzf", "zzg", zzbel.class, "zzh", zzgks, "zzi", zzgks, "zzj", zzgks});
        } else if (i2 == 3) {
            return new zzbep();
        } else {
            if (i2 == 4) {
                return new zzbeo((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
