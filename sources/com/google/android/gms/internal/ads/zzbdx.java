package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbdx extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbdx zzb;
    private int zze;
    private int zzf;
    private int zzg = 1000;
    private zzben zzh;
    private zzbep zzi;
    private zzgkx zzj = zzaH();
    private zzber zzk;
    private zzbgb zzl;
    private zzbfr zzm;
    private zzbff zzn;
    private zzbfh zzo;
    private zzgkx zzp = zzaH();

    static {
        zzbdx zzbdx = new zzbdx();
        zzb = zzbdx;
        zzgko.zzaN(zzbdx.class, zzbdx);
    }

    private zzbdx() {
    }

    public static zzbdx zzc() {
        return zzb;
    }

    static /* synthetic */ void zze(zzbdx zzbdx, zzbdv zzbdv) {
        zzbdx.zzf = zzbdv.zza();
        zzbdx.zze |= 1;
    }

    static /* synthetic */ void zzf(zzbdx zzbdx, zzbep zzbep) {
        zzbep.getClass();
        zzbdx.zzi = zzbep;
        zzbdx.zze |= 8;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zze", "zzf", zzbdv.zzc(), "zzg", zzbey.zza, "zzh", "zzi", "zzj", zzbel.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzbgn.class});
        } else if (i2 == 3) {
            return new zzbdx();
        } else {
            if (i2 == 4) {
                return new zzbdw((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzbep zzd() {
        zzbep zzbep = this.zzi;
        return zzbep == null ? zzbep.zzc() : zzbep;
    }
}
