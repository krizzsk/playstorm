package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbfu extends zzgko implements zzglz {
    private static final zzgku zzb = new zzbfs();
    /* access modifiers changed from: private */
    public static final zzbfu zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private zzgkt zzk = zzaE();
    private zzbfp zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;

    static {
        zzbfu zzbfu = new zzbfu();
        zze = zzbfu;
        zzgko.zzaN(zzbfu.class, zzbfu);
    }

    private zzbfu() {
    }

    static /* synthetic */ void zzA(zzbfu zzbfu, int i) {
        zzbfu.zzo = i - 1;
        zzbfu.zzf |= 128;
    }

    static /* synthetic */ void zzB(zzbfu zzbfu, int i) {
        zzbfu.zzq = i - 1;
        zzbfu.zzf |= 512;
    }

    public static zzbft zzg() {
        return (zzbft) zze.zzaw();
    }

    public static zzbfu zzi(byte[] bArr) throws zzgla {
        return (zzbfu) zzgko.zzaA(zze, bArr);
    }

    static /* synthetic */ void zzl(zzbfu zzbfu, long j) {
        zzbfu.zzf |= 1;
        zzbfu.zzg = j;
    }

    static /* synthetic */ void zzm(zzbfu zzbfu, long j) {
        zzbfu.zzf |= 4;
        zzbfu.zzi = j;
    }

    static /* synthetic */ void zzn(zzbfu zzbfu, long j) {
        zzbfu.zzf |= 8;
        zzbfu.zzj = j;
    }

    static /* synthetic */ void zzo(zzbfu zzbfu, Iterable iterable) {
        zzgkt zzgkt = zzbfu.zzk;
        if (!zzgkt.zzc()) {
            zzbfu.zzk = zzgko.zzaF(zzgkt);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzbfu.zzk.zzh(((zzbej) it.next()).zza());
        }
    }

    static /* synthetic */ void zzp(zzbfu zzbfu, zzbfp zzbfp) {
        zzbfp.getClass();
        zzbfu.zzl = zzbfp;
        zzbfu.zzf |= 16;
    }

    static /* synthetic */ void zzq(zzbfu zzbfu, int i) {
        zzbfu.zzf |= 256;
        zzbfu.zzp = i;
    }

    static /* synthetic */ void zzr(zzbfu zzbfu, zzbfy zzbfy) {
        zzbfu.zzr = zzbfy.zza();
        zzbfu.zzf |= 1024;
    }

    static /* synthetic */ void zzx(zzbfu zzbfu, int i) {
        zzbfu.zzh = i - 1;
        zzbfu.zzf |= 2;
    }

    static /* synthetic */ void zzy(zzbfu zzbfu, int i) {
        zzbfu.zzm = i - 1;
        zzbfu.zzf |= 32;
    }

    static /* synthetic */ void zzz(zzbfu zzbfu, int i) {
        zzbfu.zzn = i - 1;
        zzbfu.zzf |= 64;
    }

    public final int zza() {
        return this.zzp;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgks zzgks = zzbey.zza;
            return zzaM(zze, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n", new Object[]{"zzf", "zzg", "zzh", zzbey.zza, "zzi", "zzj", "zzk", zzbej.zzc(), "zzl", "zzm", zzgks, "zzn", zzgks, "zzo", zzgks, "zzp", "zzq", zzgks, "zzr", zzbfy.zzc()});
        } else if (i2 == 3) {
            return new zzbfu();
        } else {
            if (i2 == 4) {
                return new zzbft((zzbds) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }

    public final long zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final long zze() {
        return this.zzg;
    }

    public final zzbfp zzf() {
        zzbfp zzbfp = this.zzl;
        return zzbfp == null ? zzbfp.zzd() : zzbfp;
    }

    public final zzbfy zzj() {
        zzbfy zzb2 = zzbfy.zzb(this.zzr);
        return zzb2 == null ? zzbfy.UNSPECIFIED : zzb2;
    }

    public final List zzk() {
        return new zzgkv(this.zzk, zzb);
    }

    public final int zzs() {
        int zza = zzbez.zza(this.zzn);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzt() {
        int zza = zzbez.zza(this.zzo);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzu() {
        int zza = zzbez.zza(this.zzq);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzv() {
        int zza = zzbez.zza(this.zzh);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzw() {
        int zza = zzbez.zza(this.zzm);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
