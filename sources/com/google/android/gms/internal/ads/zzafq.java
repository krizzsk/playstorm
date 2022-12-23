package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzafq implements zzaga {
    private final zzdx zza;
    private final zzdy zzb;
    private final String zzc;
    private String zzd;
    private zzzz zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzad zzj;
    private int zzk;
    private long zzl;

    public zzafq() {
        this((String) null);
    }

    public final void zza(zzdy zzdy) {
        zzcw.zzb(this.zze);
        while (zzdy.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                while (true) {
                    if (zzdy.zza() <= 0) {
                        break;
                    } else if (!this.zzh) {
                        this.zzh = zzdy.zzk() == 11;
                    } else {
                        int zzk2 = zzdy.zzk();
                        if (zzk2 == 119) {
                            this.zzh = false;
                            this.zzf = 1;
                            zzdy zzdy2 = this.zzb;
                            zzdy2.zzH()[0] = Ascii.f17948VT;
                            zzdy2.zzH()[1] = 119;
                            this.zzg = 2;
                            break;
                        }
                        this.zzh = zzk2 == 11;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(zzdy.zza(), this.zzk - this.zzg);
                zzzx.zzb(this.zze, zzdy, min);
                int i2 = this.zzg + min;
                this.zzg = i2;
                int i3 = this.zzk;
                if (i2 == i3) {
                    long j = this.zzl;
                    if (j != -9223372036854775807L) {
                        this.zze.zzs(j, 1, i3, 0, (zzzy) null);
                        this.zzl += this.zzi;
                    }
                    this.zzf = 0;
                }
            } else {
                byte[] zzH = this.zzb.zzH();
                int min2 = Math.min(zzdy.zza(), 128 - this.zzg);
                zzdy.zzB(zzH, this.zzg, min2);
                int i4 = this.zzg + min2;
                this.zzg = i4;
                if (i4 == 128) {
                    this.zza.zzh(0);
                    zzxw zze2 = zzxx.zze(this.zza);
                    zzad zzad = this.zzj;
                    if (zzad == null || zze2.zzc != zzad.zzz || zze2.zzb != zzad.zzA || !zzeg.zzS(zze2.zza, zzad.zzm)) {
                        zzab zzab = new zzab();
                        zzab.zzH(this.zzd);
                        zzab.zzS(zze2.zza);
                        zzab.zzw(zze2.zzc);
                        zzab.zzT(zze2.zzb);
                        zzab.zzK(this.zzc);
                        zzad zzY = zzab.zzY();
                        this.zzj = zzY;
                        this.zze.zzk(zzY);
                    }
                    this.zzk = zze2.zzd;
                    this.zzi = (((long) zze2.zze) * 1000000) / ((long) this.zzj.zzA);
                    this.zzb.zzF(0);
                    zzzx.zzb(this.zze, this.zzb, 128);
                    this.zzf = 2;
                }
            }
        }
    }

    public final void zzb(zzyv zzyv, zzahm zzahm) {
        zzahm.zzc();
        this.zzd = zzahm.zzb();
        this.zze = zzyv.zzv(zzahm.zza(), 1);
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
        this.zzh = false;
        this.zzl = -9223372036854775807L;
    }

    public zzafq(String str) {
        this.zza = new zzdx(new byte[128], 128);
        this.zzb = new zzdy(this.zza.zza);
        this.zzf = 0;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
