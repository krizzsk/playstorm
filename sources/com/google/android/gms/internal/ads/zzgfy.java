package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgfy extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgfy zzb;
    private String zze = "";
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;
    /* access modifiers changed from: private */
    public int zzh;

    static {
        zzgfy zzgfy = new zzgfy();
        zzb = zzgfy;
        zzgko.zzaN(zzgfy.class, zzgfy);
    }

    private zzgfy() {
    }

    public static zzgfx zza() {
        return (zzgfx) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzgfy zzgfy, String str) {
        str.getClass();
        zzgfy.zze = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzgfy();
        } else {
            if (i2 == 4) {
                return new zzgfx((zzgfv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
