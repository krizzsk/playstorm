package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzaei {
    public final zzzz zza;
    public final zzaev zzb = new zzaev();
    public final zzdy zzc = new zzdy();
    public zzaew zzd;
    public zzaee zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final zzdy zzj = new zzdy(1);
    private final zzdy zzk = new zzdy();
    /* access modifiers changed from: private */
    public boolean zzl;

    public zzaei(zzzz zzzz, zzaew zzaew, zzaee zzaee) {
        this.zza = zzzz;
        this.zzd = zzaew;
        this.zze = zzaee;
        zzh(zzaew, zzaee);
    }

    public final int zza() {
        int i;
        if (!this.zzl) {
            i = this.zzd.zzg[this.zzf];
        } else {
            i = this.zzb.zzj[this.zzf] ? 1 : 0;
        }
        return zzf() != null ? i | 1073741824 : i;
    }

    public final int zzb() {
        if (!this.zzl) {
            return this.zzd.zzd[this.zzf];
        }
        return this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i, int i2) {
        zzdy zzdy;
        zzaeu zzf2 = zzf();
        if (zzf2 == null) {
            return 0;
        }
        int i3 = zzf2.zzd;
        if (i3 != 0) {
            zzdy = this.zzb.zzn;
        } else {
            byte[] bArr = (byte[]) zzeg.zzG(zzf2.zze);
            zzdy zzdy2 = this.zzk;
            int length = bArr.length;
            zzdy2.zzD(bArr, length);
            zzdy = this.zzk;
            i3 = length;
        }
        boolean zzb2 = this.zzb.zzb(this.zzf);
        boolean z = zzb2 || i2 != 0;
        zzdy zzdy3 = this.zzj;
        zzdy3.zzH()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzdy3.zzF(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzdy, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zzb2) {
            this.zzc.zzC(8);
            zzdy zzdy4 = this.zzc;
            byte[] zzH = zzdy4.zzH();
            zzH[0] = 0;
            zzH[1] = 1;
            zzH[2] = 0;
            zzH[3] = (byte) i2;
            zzH[4] = (byte) ((i >> 24) & 255);
            zzH[5] = (byte) ((i >> 16) & 255);
            zzH[6] = (byte) ((i >> 8) & 255);
            zzH[7] = (byte) (i & 255);
            this.zza.zzr(zzdy4, 8, 1);
            return i3 + 9;
        }
        zzdy zzdy5 = this.zzb.zzn;
        int zzo = zzdy5.zzo();
        zzdy5.zzG(-2);
        int i4 = (zzo * 6) + 2;
        if (i2 != 0) {
            this.zzc.zzC(i4);
            byte[] zzH2 = this.zzc.zzH();
            zzdy5.zzB(zzH2, 0, i4);
            int i5 = (((zzH2[2] & 255) << 8) | (zzH2[3] & 255)) + i2;
            zzH2[2] = (byte) ((i5 >> 8) & 255);
            zzH2[3] = (byte) (i5 & 255);
            zzdy5 = this.zzc;
        }
        this.zza.zzr(zzdy5, i4, 1);
        return i3 + 1 + i4;
    }

    public final long zzd() {
        if (!this.zzl) {
            return this.zzd.zzc[this.zzf];
        }
        return this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzaev zzaev = this.zzb;
        return zzaev.zzi[this.zzf];
    }

    public final zzaeu zzf() {
        if (!this.zzl) {
            return null;
        }
        zzaee zzaee = this.zzb.zza;
        int i = zzeg.zza;
        int i2 = zzaee.zza;
        zzaeu zzaeu = this.zzb.zzm;
        if (zzaeu == null) {
            zzaeu = this.zzd.zza.zza(i2);
        }
        if (zzaeu == null || !zzaeu.zza) {
            return null;
        }
        return zzaeu;
    }

    public final void zzh(zzaew zzaew, zzaee zzaee) {
        this.zzd = zzaew;
        this.zze = zzaee;
        this.zza.zzk(zzaew.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzaev zzaev = this.zzb;
        zzaev.zzd = 0;
        zzaev.zzp = 0;
        zzaev.zzq = false;
        zzaev.zzk = false;
        zzaev.zzo = false;
        zzaev.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i2 = this.zzh;
        if (i != iArr[i2]) {
            return true;
        }
        this.zzh = i2 + 1;
        this.zzg = 0;
        return false;
    }
}
