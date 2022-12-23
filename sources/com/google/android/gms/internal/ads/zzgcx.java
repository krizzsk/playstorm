package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgcx extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgcx zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzgcx zzgcx = new zzgcx();
        zzb = zzgcx;
        zzgko.zzaN(zzgcx.class, zzgcx);
    }

    private zzgcx() {
    }

    public static zzgcw zzc() {
        return (zzgcw) zzb.zzaw();
    }

    public static zzgcx zze(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgcx) zzgko.zzaB(zzb, zzgjg, zzgka);
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
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        } else if (i2 == 3) {
            return new zzgcx();
        } else {
            if (i2 == 4) {
                return new zzgcw((zzgcv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
