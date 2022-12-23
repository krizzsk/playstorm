package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgcf extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgcf zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgcl zzf;
    /* access modifiers changed from: private */
    public zzgjg zzg = zzgjg.zzb;

    static {
        zzgcf zzgcf = new zzgcf();
        zzb = zzgcf;
        zzgko.zzaN(zzgcf.class, zzgcf);
    }

    private zzgcf() {
    }

    public static zzgce zzc() {
        return (zzgce) zzb.zzaw();
    }

    public static zzgcf zze(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgcf) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    static /* synthetic */ void zzi(zzgcf zzgcf, zzgcl zzgcl) {
        zzgcl.getClass();
        zzgcf.zzf = zzgcl;
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
            return new zzgcf();
        } else {
            if (i2 == 4) {
                return new zzgce((zzgcd) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgcl zzf() {
        zzgcl zzgcl = this.zzf;
        return zzgcl == null ? zzgcl.zze() : zzgcl;
    }

    public final zzgjg zzg() {
        return this.zzg;
    }
}
