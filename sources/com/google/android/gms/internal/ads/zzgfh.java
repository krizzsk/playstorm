package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgfh extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgfh zzb;
    /* access modifiers changed from: private */
    public String zze = "";
    /* access modifiers changed from: private */
    public zzgjg zzf = zzgjg.zzb;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzgfh zzgfh = new zzgfh();
        zzb = zzgfh;
        zzgko.zzaN(zzgfh.class, zzgfh);
    }

    private zzgfh() {
    }

    public static zzgfg zza() {
        return (zzgfg) zzb.zzaw();
    }

    public static zzgfh zzd() {
        return zzb;
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
            return new zzgfh();
        } else {
            if (i2 == 4) {
                return new zzgfg((zzgff) null);
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
        int i = this.zzg;
        int i2 = 4;
        if (i == 0) {
            i2 = 2;
        } else if (i == 1) {
            i2 = 3;
        } else if (i != 2) {
            i2 = i != 3 ? i != 4 ? 0 : 6 : 5;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
