package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzaau extends zzaat {
    private final zzdy zzb = new zzdy(zzzp.zza);
    private final zzdy zzc = new zzdy(4);
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzaau(zzzz zzzz) {
        super(zzzz);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(zzdy zzdy) throws zzaas {
        int zzk = zzdy.zzk();
        int i = zzk >> 4;
        int i2 = zzk & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        throw new zzaas("Video format not supported: " + i2);
    }

    /* access modifiers changed from: protected */
    public final boolean zzb(zzdy zzdy, long j) throws zzbp {
        int zzk = zzdy.zzk();
        long zzf2 = j + (((long) zzdy.zzf()) * 1000);
        if (zzk == 0) {
            if (!this.zze) {
                zzdy zzdy2 = new zzdy(new byte[zzdy.zza()]);
                zzdy.zzB(zzdy2.zzH(), 0, zzdy.zza());
                zzyb zza = zzyb.zza(zzdy2);
                this.zzd = zza.zzb;
                zzab zzab = new zzab();
                zzab.zzS("video/avc");
                zzab.zzx(zza.zzf);
                zzab.zzX(zza.zzc);
                zzab.zzF(zza.zzd);
                zzab.zzP(zza.zze);
                zzab.zzI(zza.zza);
                this.zza.zzk(zzab.zzY());
                this.zze = true;
                return false;
            }
        } else if (zzk == 1 && this.zze) {
            int i = this.zzg == 1 ? 1 : 0;
            if (!this.zzf && i == 0) {
                return false;
            }
            byte[] zzH = this.zzc.zzH();
            zzH[0] = 0;
            zzH[1] = 0;
            zzH[2] = 0;
            int i2 = 4 - this.zzd;
            int i3 = 0;
            while (zzdy.zza() > 0) {
                zzdy.zzB(this.zzc.zzH(), i2, this.zzd);
                this.zzc.zzF(0);
                int zzn = this.zzc.zzn();
                this.zzb.zzF(0);
                this.zza.zzq(this.zzb, 4);
                this.zza.zzq(zzdy, zzn);
                i3 = i3 + 4 + zzn;
            }
            this.zza.zzs(zzf2, i, i3, 0, (zzzy) null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
