package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgcr extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgcr zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzgcr zzgcr = new zzgcr();
        zzb = zzgcr;
        zzgko.zzaN(zzgcr.class, zzgcr);
    }

    private zzgcr() {
    }

    public static zzgcq zzc() {
        return (zzgcq) zzb.zzaw();
    }

    public static zzgcr zze(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgcr) zzgko.zzaB(zzb, zzgjg, zzgka);
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
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgcr();
        } else {
            if (i2 == 4) {
                return new zzgcq((zzgcp) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
