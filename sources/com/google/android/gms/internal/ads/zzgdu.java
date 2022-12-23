package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgdu extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgdu zzb;
    private zzged zze;
    private zzgdo zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzgdu zzgdu = new zzgdu();
        zzb = zzgdu;
        zzgko.zzaN(zzgdu.class, zzgdu);
    }

    private zzgdu() {
    }

    public static zzgdt zzc() {
        return (zzgdt) zzb.zzaw();
    }

    public static zzgdu zze() {
        return zzb;
    }

    static /* synthetic */ void zzg(zzgdu zzgdu, zzged zzged) {
        zzged.getClass();
        zzgdu.zze = zzged;
    }

    static /* synthetic */ void zzh(zzgdu zzgdu, zzgdo zzgdo) {
        zzgdo.getClass();
        zzgdu.zzf = zzgdo;
    }

    public final zzgdo zza() {
        zzgdo zzgdo = this.zzf;
        return zzgdo == null ? zzgdo.zzd() : zzgdo;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgdu();
        } else {
            if (i2 == 4) {
                return new zzgdt((zzgds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzged zzf() {
        zzged zzged = this.zze;
        return zzged == null ? zzged.zzd() : zzged;
    }

    public final int zzi() {
        int i = this.zzg;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
