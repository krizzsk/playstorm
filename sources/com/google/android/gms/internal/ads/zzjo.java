package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzjo {
    private static final zzsb zzt = new zzsb(new Object());
    public final zzci zza;
    public final zzsb zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzgu zzf;
    public final boolean zzg;
    public final zztz zzh;
    public final zzvo zzi;
    public final List zzj;
    public final zzsb zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzbt zzn;
    public final boolean zzo;
    public final boolean zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzjo(zzci zzci, zzsb zzsb, long j, long j2, int i, zzgu zzgu, boolean z, zztz zztz, zzvo zzvo, List list, zzsb zzsb2, boolean z2, int i2, zzbt zzbt, long j3, long j4, long j5, boolean z3, boolean z4) {
        this.zza = zzci;
        this.zzb = zzsb;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzgu;
        this.zzg = z;
        this.zzh = zztz;
        this.zzi = zzvo;
        this.zzj = list;
        this.zzk = zzsb2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = zzbt;
        this.zzq = j3;
        this.zzr = j4;
        this.zzs = j5;
        this.zzo = z3;
        this.zzp = z4;
    }

    public static zzjo zzh(zzvo zzvo) {
        return new zzjo(zzci.zza, zzt, -9223372036854775807L, 0, 1, (zzgu) null, false, zztz.zza, zzvo, zzfrh.zzo(), zzt, false, 0, zzbt.zza, 0, 0, 0, false, false);
    }

    public static zzsb zzi() {
        return zzt;
    }

    public final zzjo zza(zzsb zzsb) {
        zzci zzci = this.zza;
        return new zzjo(zzci, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzsb, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzjo zzb(zzsb zzsb, long j, long j2, long j3, long j4, zztz zztz, zzvo zzvo, List list) {
        long j5 = j;
        zztz zztz2 = zztz;
        zzvo zzvo2 = zzvo;
        List list2 = list;
        zzci zzci = this.zza;
        return new zzjo(zzci, zzsb, j2, j3, this.zze, this.zzf, this.zzg, zztz2, zzvo2, list2, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, j4, j5, this.zzo, this.zzp);
    }

    public final zzjo zzc(boolean z) {
        zzci zzci = this.zza;
        return new zzjo(zzci, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, z, this.zzp);
    }

    public final zzjo zzd(boolean z, int i) {
        zzci zzci = this.zza;
        return new zzjo(zzci, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzjo zze(zzgu zzgu) {
        zzci zzci = this.zza;
        return new zzjo(zzci, this.zzb, this.zzc, this.zzd, this.zze, zzgu, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzjo zzf(int i) {
        zzci zzci = this.zza;
        return new zzjo(zzci, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }

    public final zzjo zzg(zzci zzci) {
        return new zzjo(zzci, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzq, this.zzr, this.zzs, this.zzo, this.zzp);
    }
}
