package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgcl extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgcl zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgcl zzgcl = new zzgcl();
        zzb = zzgcl;
        zzgko.zzaN(zzgcl.class, zzgcl);
    }

    private zzgcl() {
    }

    public static zzgck zzc() {
        return (zzgck) zzb.zzaw();
    }

    public static zzgcl zze() {
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
            return new zzgcl();
        } else {
            if (i2 == 4) {
                return new zzgck((zzgcj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
