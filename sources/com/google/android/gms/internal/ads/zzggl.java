package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzggl extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzggl zzb;
    private String zze = "";
    private zzgfm zzf;

    static {
        zzggl zzggl = new zzggl();
        zzb = zzggl;
        zzgko.zzaN(zzggl.class, zzggl);
    }

    private zzggl() {
    }

    public static zzggl zzd() {
        return zzb;
    }

    public static zzggl zze(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzggl) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    public final zzgfm zza() {
        zzgfm zzgfm = this.zzf;
        return zzgfm == null ? zzgfm.zzd() : zzgfm;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzggl();
        } else {
            if (i2 == 4) {
                return new zzggk((zzggj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zzf != null;
    }
}
