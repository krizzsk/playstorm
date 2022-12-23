package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgci extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgci zzb;
    private zzgcl zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzgci zzgci = new zzgci();
        zzb = zzgci;
        zzgko.zzaN(zzgci.class, zzgci);
    }

    private zzgci() {
    }

    public static zzgch zzc() {
        return (zzgch) zzb.zzaw();
    }

    public static zzgci zze(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgci) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    static /* synthetic */ void zzg(zzgci zzgci, zzgcl zzgcl) {
        zzgcl.getClass();
        zzgci.zze = zzgcl;
    }

    public final int zza() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgci();
        } else {
            if (i2 == 4) {
                return new zzgch((zzgcg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgcl zzf() {
        zzgcl zzgcl = this.zze;
        return zzgcl == null ? zzgcl.zze() : zzgcl;
    }
}
