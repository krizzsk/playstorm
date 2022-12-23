package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgeq extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgeq zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzgeq zzgeq = new zzgeq();
        zzb = zzgeq;
        zzgko.zzaN(zzgeq.class, zzgeq);
    }

    private zzgeq() {
    }

    public static zzgep zzc() {
        return (zzgep) zzb.zzaw();
    }

    public static zzgeq zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgeq();
        } else {
            if (i2 == 4) {
                return new zzgep((zzgeo) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final int zzg() {
        int zzb2 = zzgeh.zzb(this.zze);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
