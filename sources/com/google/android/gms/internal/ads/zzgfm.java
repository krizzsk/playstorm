package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgfm extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgfm zzb;
    private String zze = "";
    /* access modifiers changed from: private */
    public zzgjg zzf = zzgjg.zzb;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzgfm zzgfm = new zzgfm();
        zzb = zzgfm;
        zzgko.zzaN(zzgfm.class, zzgfm);
    }

    private zzgfm() {
    }

    public static zzgfl zza() {
        return (zzgfl) zzb.zzaw();
    }

    public static zzgfm zzd() {
        return zzb;
    }

    static /* synthetic */ void zzg(zzgfm zzgfm, String str) {
        str.getClass();
        zzgfm.zze = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgfm();
        } else {
            if (i2 == 4) {
                return new zzgfl((zzgfk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgjg zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public final int zzi() {
        int zzb2 = zzggn.zzb(this.zzg);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
