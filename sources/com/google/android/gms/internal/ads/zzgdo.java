package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgdo extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgdo zzb;
    private zzgfm zze;

    static {
        zzgdo zzgdo = new zzgdo();
        zzb = zzgdo;
        zzgko.zzaN(zzgdo.class, zzgdo);
    }

    private zzgdo() {
    }

    public static zzgdn zza() {
        return (zzgdn) zzb.zzaw();
    }

    public static zzgdo zzd() {
        return zzb;
    }

    static /* synthetic */ void zzf(zzgdo zzgdo, zzgfm zzgfm) {
        zzgfm.getClass();
        zzgdo.zze = zzgfm;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzgdo();
        } else {
            if (i2 == 4) {
                return new zzgdn((zzgdm) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgfm zze() {
        zzgfm zzgfm = this.zze;
        return zzgfm == null ? zzgfm.zzd() : zzgfm;
    }
}
