package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgbk extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgbk zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgbn zzf;

    static {
        zzgbk zzgbk = new zzgbk();
        zzb = zzgbk;
        zzgko.zzaN(zzgbk.class, zzgbk);
    }

    private zzgbk() {
    }

    public static zzgbj zzc() {
        return (zzgbj) zzb.zzaw();
    }

    public static zzgbk zze(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgbk) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    static /* synthetic */ void zzh(zzgbk zzgbk, zzgbn zzgbn) {
        zzgbn.getClass();
        zzgbk.zzf = zzgbn;
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
            return new zzgbk();
        } else {
            if (i2 == 4) {
                return new zzgbj((zzgbi) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgbn zzf() {
        zzgbn zzgbn = this.zzf;
        return zzgbn == null ? zzgbn.zze() : zzgbn;
    }
}
