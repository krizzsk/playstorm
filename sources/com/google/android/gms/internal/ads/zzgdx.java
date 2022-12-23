package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgdx extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgdx zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgea zzf;
    /* access modifiers changed from: private */
    public zzgjg zzg = zzgjg.zzb;

    static {
        zzgdx zzgdx = new zzgdx();
        zzb = zzgdx;
        zzgko.zzaN(zzgdx.class, zzgdx);
    }

    private zzgdx() {
    }

    public static zzgdw zzc() {
        return (zzgdw) zzb.zzaw();
    }

    public static zzgdx zze(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgdx) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    static /* synthetic */ void zzi(zzgdx zzgdx, zzgea zzgea) {
        zzgea.getClass();
        zzgdx.zzf = zzgea;
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
            return zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgdx();
        } else {
            if (i2 == 4) {
                return new zzgdw((zzgdv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgea zzf() {
        zzgea zzgea = this.zzf;
        return zzgea == null ? zzgea.zzf() : zzgea;
    }

    public final zzgjg zzg() {
        return this.zzg;
    }
}
