package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfhz extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzfhz zzb;
    private zzfhv zze;

    static {
        zzfhz zzfhz = new zzfhz();
        zzb = zzfhz;
        zzgko.zzaN(zzfhz.class, zzfhz);
    }

    private zzfhz() {
    }

    public static zzfhy zza() {
        return (zzfhy) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzfhz zzfhz, zzfhv zzfhv) {
        zzfhv.getClass();
        zzfhz.zze = zzfhv;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzfhz();
        } else {
            if (i2 == 4) {
                return new zzfhy((zzfhw) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
