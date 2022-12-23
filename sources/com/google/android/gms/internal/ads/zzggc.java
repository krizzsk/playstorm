package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzggc extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzggc zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzggf zzf;

    static {
        zzggc zzggc = new zzggc();
        zzb = zzggc;
        zzgko.zzaN(zzggc.class, zzggc);
    }

    private zzggc() {
    }

    public static zzggb zzc() {
        return (zzggb) zzb.zzaw();
    }

    public static zzggc zze(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzggc) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    static /* synthetic */ void zzh(zzggc zzggc, zzggf zzggf) {
        zzggf.getClass();
        zzggc.zzf = zzggf;
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
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzggc();
        } else {
            if (i2 == 4) {
                return new zzggb((zzgga) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzggf zzf() {
        zzggf zzggf = this.zzf;
        return zzggf == null ? zzggf.zzc() : zzggf;
    }
}
