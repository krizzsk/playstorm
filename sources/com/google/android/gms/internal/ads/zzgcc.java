package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgcc extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgcc zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgcc zzgcc = new zzgcc();
        zzb = zzgcc;
        zzgko.zzaN(zzgcc.class, zzgcc);
    }

    private zzgcc() {
    }

    public static zzgcb zzc() {
        return (zzgcb) zzb.zzaw();
    }

    public static zzgcc zze() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzgcc();
        } else {
            if (i2 == 4) {
                return new zzgcb((zzgca) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
