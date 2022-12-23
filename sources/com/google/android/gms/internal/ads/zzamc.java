package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzamc extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzamc zzb;
    private int zze;
    private zzgjg zzf = zzgjg.zzb;
    private zzgjg zzg;
    private zzgjg zzh;
    private zzgjg zzi;

    static {
        zzamc zzamc = new zzamc();
        zzb = zzamc;
        zzgko.zzaN(zzamc.class, zzamc);
    }

    private zzamc() {
        zzgjg zzgjg = zzgjg.zzb;
        this.zzg = zzgjg;
        this.zzh = zzgjg;
        this.zzi = zzgjg;
    }

    public static zzamb zza() {
        return (zzamb) zzb.zzaw();
    }

    public static zzamc zzd(byte[] bArr, zzgka zzgka) throws zzgla {
        return (zzamc) zzgko.zzaD(zzb, bArr, zzgka);
    }

    static /* synthetic */ void zzi(zzamc zzamc, zzgjg zzgjg) {
        zzamc.zze |= 1;
        zzamc.zzf = zzgjg;
    }

    static /* synthetic */ void zzj(zzamc zzamc, zzgjg zzgjg) {
        zzamc.zze |= 2;
        zzamc.zzg = zzgjg;
    }

    static /* synthetic */ void zzk(zzamc zzamc, zzgjg zzgjg) {
        zzamc.zze |= 4;
        zzamc.zzh = zzgjg;
    }

    static /* synthetic */ void zzl(zzamc zzamc, zzgjg zzgjg) {
        zzamc.zze |= 8;
        zzamc.zzi = zzgjg;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzamc();
        } else {
            if (i2 == 4) {
                return new zzamb((zzalh) null);
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

    public final zzgjg zzf() {
        return this.zzg;
    }

    public final zzgjg zzg() {
        return this.zzi;
    }

    public final zzgjg zzh() {
        return this.zzh;
    }
}
