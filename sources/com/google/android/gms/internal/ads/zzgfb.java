package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgfb extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgfb zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgfe zzf;
    /* access modifiers changed from: private */
    public zzgjg zzg = zzgjg.zzb;

    static {
        zzgfb zzgfb = new zzgfb();
        zzb = zzgfb;
        zzgko.zzaN(zzgfb.class, zzgfb);
    }

    private zzgfb() {
    }

    public static zzgfa zzc() {
        return (zzgfa) zzb.zzaw();
    }

    public static zzgfb zze(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgfb) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    static /* synthetic */ void zzi(zzgfb zzgfb, zzgfe zzgfe) {
        zzgfe.getClass();
        zzgfb.zzf = zzgfe;
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
            return new zzgfb();
        } else {
            if (i2 == 4) {
                return new zzgfa((zzgez) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgfe zzf() {
        zzgfe zzgfe = this.zzf;
        return zzgfe == null ? zzgfe.zzf() : zzgfe;
    }

    public final zzgjg zzg() {
        return this.zzg;
    }

    public final boolean zzk() {
        return this.zzf != null;
    }
}
