package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzci {
    public static final zzci zza = new zzcd();
    public static final zzl zzb = zzcc.zza;

    protected zzci() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzci)) {
            return false;
        }
        zzci zzci = (zzci) obj;
        if (zzci.zzc() != zzc() || zzci.zzb() != zzb()) {
            return false;
        }
        zzch zzch = new zzch();
        zzcf zzcf = new zzcf();
        zzch zzch2 = new zzch();
        zzcf zzcf2 = new zzcf();
        for (int i = 0; i < zzc(); i++) {
            if (!zze(i, zzch, 0).equals(zzci.zze(i, zzch2, 0))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < zzb(); i2++) {
            if (!zzd(i2, zzcf, true).equals(zzci.zzd(i2, zzcf2, true))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        zzch zzch = new zzch();
        zzcf zzcf = new zzcf();
        int zzc = zzc() + 217;
        for (int i = 0; i < zzc(); i++) {
            zzc = (zzc * 31) + zze(i, zzch, 0).hashCode();
        }
        int zzb2 = (zzc * 31) + zzb();
        for (int i2 = 0; i2 < zzb(); i2++) {
            zzb2 = (zzb2 * 31) + zzd(i2, zzcf, true).hashCode();
        }
        return zzb2;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzcf zzd(int i, zzcf zzcf, boolean z);

    public abstract zzch zze(int i, zzch zzch, long j);

    public abstract Object zzf(int i);

    public int zzg(boolean z) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i, zzcf zzcf, zzch zzch, int i2, boolean z) {
        int i3 = zzd(i, zzcf, false).zzd;
        if (zze(i3, zzch, 0).zzp != i) {
            return i + 1;
        }
        int zzj = zzj(i3, i2, z);
        if (zzj == -1) {
            return -1;
        }
        return zze(zzj, zzch, 0).zzo;
    }

    public int zzj(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == zzh(z) ? zzg(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == zzh(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public int zzk(int i, int i2, boolean z) {
        if (i == zzg(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair zzl(zzch zzch, zzcf zzcf, int i, long j) {
        Pair zzm = zzm(zzch, zzcf, i, j, 0);
        if (zzm != null) {
            return zzm;
        }
        throw null;
    }

    public final Pair zzm(zzch zzch, zzcf zzcf, int i, long j, long j2) {
        zzcw.zza(i, 0, zzc());
        zze(i, zzch, j2);
        if (j == -9223372036854775807L) {
            long j3 = zzch.zzm;
            j = 0;
        }
        int i2 = zzch.zzo;
        zzd(i2, zzcf, false);
        while (i2 < zzch.zzp) {
            long j4 = zzcf.zzf;
            int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i3 == 0) {
                break;
            }
            int i4 = i2 + 1;
            long j5 = zzd(i4, zzcf, false).zzf;
            if (i3 < 0) {
                break;
            }
            i2 = i4;
        }
        zzd(i2, zzcf, true);
        long j6 = zzcf.zzf;
        long j7 = zzcf.zze;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long max = Math.max(0, j);
        Object obj = zzcf.zzc;
        if (obj != null) {
            return Pair.create(obj, Long.valueOf(max));
        }
        throw null;
    }

    public zzcf zzn(Object obj, zzcf zzcf) {
        return zzd(zza(obj), zzcf, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
