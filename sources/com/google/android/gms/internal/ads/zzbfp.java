package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbfp extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbfp zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbfp zzbfp = new zzbfp();
        zzb = zzbfp;
        zzgko.zzaN(zzbfp.class, zzbfp);
    }

    private zzbfp() {
    }

    public static zzbfi zza() {
        return (zzbfi) zzb.zzaw();
    }

    public static zzbfp zzd() {
        return zzb;
    }

    static /* synthetic */ void zzi(zzbfp zzbfp, int i) {
        zzbfp.zzf = i - 1;
        zzbfp.zze |= 1;
    }

    static /* synthetic */ void zzj(zzbfp zzbfp, int i) {
        zzbfp.zzg = i - 1;
        zzbfp.zze |= 2;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", zzbfn.zza, "zzg", zzbfk.zza});
        } else if (i2 == 3) {
            return new zzbfp();
        } else {
            if (i2 == 4) {
                return new zzbfi((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final boolean zze() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzf() {
        return (this.zze & 1) != 0;
    }

    public final int zzg() {
        int zza = zzbfl.zza(this.zzg);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzh() {
        int zza = zzbfo.zza(this.zzf);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
