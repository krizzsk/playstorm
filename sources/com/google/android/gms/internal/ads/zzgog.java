package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgog extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgog zzb;
    private int zze;
    private zzgjg zzf = zzgjg.zzb;
    private zzgjg zzg = zzgjg.zzb;
    private byte zzh = 2;

    static {
        zzgog zzgog = new zzgog();
        zzb = zzgog;
        zzgko.zzaN(zzgog.class, zzgog);
    }

    private zzgog() {
    }

    public static zzgof zza() {
        return (zzgof) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzgog zzgog, zzgjg zzgjg) {
        zzgog.zze |= 1;
        zzgog.zzf = zzgjg;
    }

    static /* synthetic */ void zze(zzgog zzgog, zzgjg zzgjg) {
        zzgog.zze |= 2;
        zzgog.zzg = zzgjg;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgog();
        } else {
            if (i2 == 4) {
                return new zzgof((zzgoa) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzh = b;
            return null;
        }
    }
}
