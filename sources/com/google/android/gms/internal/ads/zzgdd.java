package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgdd extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgdd zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzgdd zzgdd = new zzgdd();
        zzb = zzgdd;
        zzgko.zzaN(zzgdd.class, zzgdd);
    }

    private zzgdd() {
    }

    public static zzgdc zzc() {
        return (zzgdc) zzb.zzaw();
    }

    public static zzgdd zze(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgdd) zzgko.zzaB(zzb, zzgjg, zzgka);
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
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgdd();
        } else {
            if (i2 == 4) {
                return new zzgdc((zzgdb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
