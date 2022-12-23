package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgbh extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgbh zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzgjg zzf = zzgjg.zzb;
    private zzgbn zzg;

    static {
        zzgbh zzgbh = new zzgbh();
        zzb = zzgbh;
        zzgko.zzaN(zzgbh.class, zzgbh);
    }

    private zzgbh() {
    }

    public static zzgbg zzc() {
        return (zzgbg) zzb.zzaw();
    }

    public static zzgbh zze(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgbh) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    static /* synthetic */ void zzj(zzgbh zzgbh, zzgbn zzgbn) {
        zzgbn.getClass();
        zzgbh.zzg = zzgbn;
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
            return zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgbh();
        } else {
            if (i2 == 4) {
                return new zzgbg((zzgbf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgbn zzf() {
        zzgbn zzgbn = this.zzg;
        return zzgbn == null ? zzgbn.zze() : zzgbn;
    }

    public final zzgjg zzg() {
        return this.zzf;
    }
}
