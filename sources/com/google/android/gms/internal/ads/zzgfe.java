package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgfe extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgfe zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgey zzf;
    /* access modifiers changed from: private */
    public zzgjg zzg = zzgjg.zzb;

    static {
        zzgfe zzgfe = new zzgfe();
        zzb = zzgfe;
        zzgko.zzaN(zzgfe.class, zzgfe);
    }

    private zzgfe() {
    }

    public static zzgfd zzd() {
        return (zzgfd) zzb.zzaw();
    }

    public static zzgfe zzf() {
        return zzb;
    }

    public static zzgfe zzg(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgfe) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    static /* synthetic */ void zzj(zzgfe zzgfe, zzgey zzgey) {
        zzgey.getClass();
        zzgfe.zzf = zzgey;
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
            return new zzgfe();
        } else {
            if (i2 == 4) {
                return new zzgfd((zzgfc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgey zzc() {
        zzgey zzgey = this.zzf;
        return zzgey == null ? zzgey.zzd() : zzgey;
    }

    public final zzgjg zzh() {
        return this.zzg;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
