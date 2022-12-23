package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbfz extends zzgko implements zzglz {
    /* access modifiers changed from: private */
    public static final zzbfz zzb;
    private int zze;
    private zzgkx zzf = zzaH();
    private int zzg;
    private int zzh;
    private long zzi;
    private String zzj = "";
    private String zzk = "";
    private long zzl;

    static {
        zzbfz zzbfz = new zzbfz();
        zzb = zzbfz;
        zzgko.zzaN(zzbfz.class, zzbfz);
    }

    private zzbfz() {
    }

    public static zzbfv zza() {
        return (zzbfv) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzbfz zzbfz, Iterable iterable) {
        zzgkx zzgkx = zzbfz.zzf;
        if (!zzgkx.zzc()) {
            zzbfz.zzf = zzgko.zzaI(zzgkx);
        }
        zzgip.zzar(iterable, zzbfz.zzf);
    }

    static /* synthetic */ void zze(zzbfz zzbfz, int i) {
        zzbfz.zze |= 1;
        zzbfz.zzg = i;
    }

    static /* synthetic */ void zzf(zzbfz zzbfz, int i) {
        zzbfz.zze |= 2;
        zzbfz.zzh = i;
    }

    static /* synthetic */ void zzg(zzbfz zzbfz, long j) {
        zzbfz.zze |= 4;
        zzbfz.zzi = j;
    }

    static /* synthetic */ void zzh(zzbfz zzbfz, String str) {
        str.getClass();
        zzbfz.zze |= 8;
        zzbfz.zzj = str;
    }

    static /* synthetic */ void zzi(zzbfz zzbfz, String str) {
        str.getClass();
        zzbfz.zze |= 16;
        zzbfz.zzk = str;
    }

    static /* synthetic */ void zzj(zzbfz zzbfz, long j) {
        zzbfz.zze |= 32;
        zzbfz.zzl = j;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zze", "zzf", zzbfu.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new zzbfz();
        } else {
            if (i2 == 4) {
                return new zzbfv((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
