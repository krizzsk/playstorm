package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgdr extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgdr zzb;
    private zzgdu zze;

    static {
        zzgdr zzgdr = new zzgdr();
        zzb = zzgdr;
        zzgko.zzaN(zzgdr.class, zzgdr);
    }

    private zzgdr() {
    }

    public static zzgdq zza() {
        return (zzgdq) zzb.zzaw();
    }

    public static zzgdr zzd(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzgdr) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    static /* synthetic */ void zzf(zzgdr zzgdr, zzgdu zzgdu) {
        zzgdu.getClass();
        zzgdr.zze = zzgdu;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzgdr();
        } else {
            if (i2 == 4) {
                return new zzgdq((zzgdp) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgdu zze() {
        zzgdu zzgdu = this.zze;
        return zzgdu == null ? zzgdu.zze() : zzgdu;
    }
}
