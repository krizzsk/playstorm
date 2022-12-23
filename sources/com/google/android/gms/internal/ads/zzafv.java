package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzafv implements zzys {
    public static final zzyz zza = zzafu.zza;
    private final zzafw zzb;
    private final zzdy zzc;
    private final zzdy zzd;
    private final zzdx zze;
    private zzyv zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzafv() {
        this(0);
    }

    public final int zza(zzyt zzyt, zzzs zzzs) throws IOException {
        zzcw.zzb(this.zzf);
        int zza2 = zzyt.zza(this.zzc.zzH(), 0, 2048);
        if (!this.zzj) {
            this.zzf.zzL(new zzzu(-9223372036854775807L, 0));
            this.zzj = true;
        }
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(zza2);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    public final void zzb(zzyv zzyv) {
        this.zzf = zzyv;
        this.zzb.zzb(zzyv, new zzahm(Integer.MIN_VALUE, 0, 1));
        zzyv.zzB();
    }

    public final void zzc(long j, long j2) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j2;
    }

    public final boolean zzd(zzyt zzyt) throws IOException {
        zzym zzym;
        int i = 0;
        while (true) {
            zzym = (zzym) zzyt;
            zzym.zzm(this.zzd.zzH(), 0, 10, false);
            this.zzd.zzF(0);
            if (this.zzd.zzm() != 4801587) {
                break;
            }
            this.zzd.zzG(3);
            int zzj2 = this.zzd.zzj();
            i += zzj2 + 10;
            zzym.zzl(zzj2, false);
        }
        zzyt.zzj();
        zzym.zzl(i, false);
        if (this.zzh == -1) {
            this.zzh = (long) i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzym.zzm(this.zzd.zzH(), 0, 2, false);
            this.zzd.zzF(0);
            if (!zzafw.zzf(this.zzd.zzo())) {
                i4++;
                zzyt.zzj();
                zzym.zzl(i4, false);
            } else {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzym.zzm(this.zzd.zzH(), 0, 4, false);
                this.zze.zzh(14);
                int zzc2 = this.zze.zzc(13);
                if (zzc2 <= 6) {
                    i4++;
                    zzyt.zzj();
                    zzym.zzl(i4, false);
                } else {
                    zzym.zzl(zzc2 - 6, false);
                    i3 += zzc2;
                }
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    public zzafv(int i) {
        this.zzb = new zzafw(true, (String) null);
        this.zzc = new zzdy(2048);
        this.zzh = -1;
        this.zzd = new zzdy(10);
        byte[] zzH = this.zzd.zzH();
        this.zze = new zzdx(zzH, zzH.length);
    }
}
