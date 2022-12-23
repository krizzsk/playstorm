package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgoe extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgoe zzb;
    private int zze;
    private String zzf = "";

    static {
        zzgoe zzgoe = new zzgoe();
        zzb = zzgoe;
        zzgko.zzaN(zzgoe.class, zzgoe);
    }

    private zzgoe() {
    }

    public static zzgod zza() {
        return (zzgod) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzgoe zzgoe, String str) {
        zzgoe.zze |= 1;
        zzgoe.zzf = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgoe();
        } else {
            if (i2 == 4) {
                return new zzgod((zzgoa) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
