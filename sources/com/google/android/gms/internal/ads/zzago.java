package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzago implements zzaga {
    private final zzdy zza;
    private final zzzl zzb;
    private final String zzc;
    private zzzz zzd;
    private String zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private long zzj;
    private int zzk;
    private long zzl;

    public zzago() {
        this((String) null);
    }

    public final void zza(zzdy zzdy) {
        zzcw.zzb(this.zzd);
        while (zzdy.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                byte[] zzH = zzdy.zzH();
                int zzc2 = zzdy.zzc();
                int zzd2 = zzdy.zzd();
                while (true) {
                    if (zzc2 >= zzd2) {
                        zzdy.zzF(zzd2);
                        break;
                    }
                    byte b = zzH[zzc2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.zzi && (b & 224) == 224;
                    this.zzi = z;
                    if (z2) {
                        zzdy.zzF(zzc2 + 1);
                        this.zzi = false;
                        this.zza.zzH()[1] = zzH[zzc2];
                        this.zzg = 2;
                        this.zzf = 1;
                        break;
                    }
                    zzc2++;
                }
            } else if (i != 1) {
                int min = Math.min(zzdy.zza(), this.zzk - this.zzg);
                zzzx.zzb(this.zzd, zzdy, min);
                int i2 = this.zzg + min;
                this.zzg = i2;
                int i3 = this.zzk;
                if (i2 >= i3) {
                    long j = this.zzl;
                    if (j != -9223372036854775807L) {
                        this.zzd.zzs(j, 1, i3, 0, (zzzy) null);
                        this.zzl += this.zzj;
                    }
                    this.zzg = 0;
                    this.zzf = 0;
                }
            } else {
                int min2 = Math.min(zzdy.zza(), 4 - this.zzg);
                zzdy.zzB(this.zza.zzH(), this.zzg, min2);
                int i4 = this.zzg + min2;
                this.zzg = i4;
                if (i4 >= 4) {
                    this.zza.zzF(0);
                    if (!this.zzb.zza(this.zza.zze())) {
                        this.zzg = 0;
                        this.zzf = 1;
                    } else {
                        zzzl zzzl = this.zzb;
                        this.zzk = zzzl.zzc;
                        if (!this.zzh) {
                            this.zzj = (((long) zzzl.zzg) * 1000000) / ((long) zzzl.zzd);
                            zzab zzab = new zzab();
                            zzab.zzH(this.zze);
                            zzab.zzS(this.zzb.zzb);
                            zzab.zzL(4096);
                            zzab.zzw(this.zzb.zze);
                            zzab.zzT(this.zzb.zzd);
                            zzab.zzK(this.zzc);
                            this.zzd.zzk(zzab.zzY());
                            this.zzh = true;
                        }
                        this.zza.zzF(0);
                        zzzx.zzb(this.zzd, this.zza, 4);
                        this.zzf = 2;
                    }
                }
            }
        }
    }

    public final void zzb(zzyv zzyv, zzahm zzahm) {
        zzahm.zzc();
        this.zze = zzahm.zzb();
        this.zzd = zzyv.zzv(zzahm.zza(), 1);
    }

    public final void zzc() {
    }

    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzi = false;
        this.zzl = -9223372036854775807L;
    }

    public zzago(String str) {
        this.zzf = 0;
        zzdy zzdy = new zzdy(4);
        this.zza = zzdy;
        zzdy.zzH()[0] = -1;
        this.zzb = new zzzl();
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
