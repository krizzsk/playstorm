package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzgd extends zzci {
    private final int zzc;
    private final zztu zzd;

    public zzgd(boolean z, zztu zztu, byte[] bArr) {
        this.zzd = zztu;
        this.zzc = zztu.zzc();
    }

    private final int zzw(int i, boolean z) {
        if (z) {
            return this.zzd.zzd(i);
        }
        if (i >= this.zzc - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int zzx(int i, boolean z) {
        if (z) {
            return this.zzd.zze(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    public final int zza(Object obj) {
        int zza;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        if (zzp == -1 || (zza = zzu(zzp).zza(obj3)) == -1) {
            return -1;
        }
        return zzs(zzp) + zza;
    }

    public final zzcf zzd(int i, zzcf zzcf, boolean z) {
        int zzq = zzq(i);
        int zzt = zzt(zzq);
        zzu(zzq).zzd(i - zzs(zzq), zzcf, z);
        zzcf.zzd += zzt;
        if (z) {
            Object zzv = zzv(zzq);
            Object obj = zzcf.zzc;
            if (obj != null) {
                zzcf.zzc = Pair.create(zzv, obj);
            } else {
                throw null;
            }
        }
        return zzcf;
    }

    public final zzch zze(int i, zzch zzch, long j) {
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzs = zzs(zzr);
        zzu(zzr).zze(i - zzt, zzch, j);
        Object zzv = zzv(zzr);
        if (!zzch.zza.equals(zzch.zzc)) {
            zzv = Pair.create(zzv, zzch.zzc);
        }
        zzch.zzc = zzv;
        zzch.zzo += zzs;
        zzch.zzp += zzs;
        return zzch;
    }

    public final Object zzf(int i) {
        int zzq = zzq(i);
        return Pair.create(zzv(zzq), zzu(zzq).zzf(i - zzs(zzq)));
    }

    public final int zzg(boolean z) {
        if (this.zzc == 0) {
            return -1;
        }
        int zza = z ? this.zzd.zza() : 0;
        while (zzu(zza).zzo()) {
            zza = zzw(zza, z);
            if (zza == -1) {
                return -1;
            }
        }
        return zzt(zza) + zzu(zza).zzg(z);
    }

    public final int zzh(boolean z) {
        int i = this.zzc;
        if (i == 0) {
            return -1;
        }
        int zzb = z ? this.zzd.zzb() : i - 1;
        while (zzu(zzb).zzo()) {
            zzb = zzx(zzb, z);
            if (zzb == -1) {
                return -1;
            }
        }
        return zzt(zzb) + zzu(zzb).zzh(z);
    }

    public final int zzj(int i, int i2, boolean z) {
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzj = zzu(zzr).zzj(i - zzt, i2 == 2 ? 0 : i2, z);
        if (zzj != -1) {
            return zzt + zzj;
        }
        int zzw = zzw(zzr, z);
        while (zzw != -1 && zzu(zzw).zzo()) {
            zzw = zzw(zzw, z);
        }
        if (zzw != -1) {
            return zzt(zzw) + zzu(zzw).zzg(z);
        }
        if (i2 == 2) {
            return zzg(z);
        }
        return -1;
    }

    public final int zzk(int i, int i2, boolean z) {
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzk = zzu(zzr).zzk(i - zzt, 0, false);
        if (zzk != -1) {
            return zzt + zzk;
        }
        int zzx = zzx(zzr, false);
        while (zzx != -1 && zzu(zzx).zzo()) {
            zzx = zzx(zzx, false);
        }
        if (zzx != -1) {
            return zzt(zzx) + zzu(zzx).zzh(false);
        }
        return -1;
    }

    public final zzcf zzn(Object obj, zzcf zzcf) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        int zzt = zzt(zzp);
        zzu(zzp).zzn(obj3, zzcf);
        zzcf.zzd += zzt;
        zzcf.zzc = obj;
        return zzcf;
    }

    /* access modifiers changed from: protected */
    public abstract int zzp(Object obj);

    /* access modifiers changed from: protected */
    public abstract int zzq(int i);

    /* access modifiers changed from: protected */
    public abstract int zzr(int i);

    /* access modifiers changed from: protected */
    public abstract int zzs(int i);

    /* access modifiers changed from: protected */
    public abstract int zzt(int i);

    /* access modifiers changed from: protected */
    public abstract zzci zzu(int i);

    /* access modifiers changed from: protected */
    public abstract Object zzv(int i);
}
