package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgft extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzgft zzb;
    private zzgfh zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;
    /* access modifiers changed from: private */
    public int zzh;

    static {
        zzgft zzgft = new zzgft();
        zzb = zzgft;
        zzgko.zzaN(zzgft.class, zzgft);
    }

    private zzgft() {
    }

    public static zzgfs zzd() {
        return (zzgfs) zzb.zzaw();
    }

    static /* synthetic */ void zzf(zzgft zzgft, zzgfh zzgfh) {
        zzgfh.getClass();
        zzgft.zze = zzgfh;
    }

    public final int zza() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzgft();
        } else {
            if (i2 == 4) {
                return new zzgfs((zzgfq) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgfh zzc() {
        zzgfh zzgfh = this.zze;
        return zzgfh == null ? zzgfh.zzd() : zzgfh;
    }

    public final boolean zzh() {
        return this.zze != null;
    }

    public final int zzi() {
        int i = this.zzf;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzj() {
        int zzb2 = zzggn.zzb(this.zzh);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
