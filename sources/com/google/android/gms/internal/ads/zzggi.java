package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzggi extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzggi zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzggl zzf;

    static {
        zzggi zzggi = new zzggi();
        zzb = zzggi;
        zzgko.zzaN(zzggi.class, zzggi);
    }

    private zzggi() {
    }

    public static zzggh zzc() {
        return (zzggh) zzb.zzaw();
    }

    public static zzggi zze(zzgjg zzgjg, zzgka zzgka) throws zzgla {
        return (zzggi) zzgko.zzaB(zzb, zzgjg, zzgka);
    }

    static /* synthetic */ void zzh(zzggi zzggi, zzggl zzggl) {
        zzggl.getClass();
        zzggi.zzf = zzggl;
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
            return new zzggi();
        } else {
            if (i2 == 4) {
                return new zzggh((zzggg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzggl zzf() {
        zzggl zzggl = this.zzf;
        return zzggl == null ? zzggl.zzd() : zzggl;
    }
}
