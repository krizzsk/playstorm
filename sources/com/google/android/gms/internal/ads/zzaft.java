package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.primitives.SignedBytes;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaft implements zzaga {
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

    public zzaft() {
        this((String) null);
    }

    public final void zza(zzdy zzdy) {
        int zzk2;
        byte b;
        zzcw.zzb(this.zze);
        while (zzdy.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                while (true) {
                    if (zzdy.zza() <= 0) {
                        break;
                    } else if (!this.zzh) {
                        this.zzh = zzdy.zzk() == 172;
                    } else {
                        zzk2 = zzdy.zzk();
                        this.zzh = zzk2 == 172;
                        b = SignedBytes.MAX_POWER_OF_TWO;
                        if (zzk2 == 64) {
                            break;
                        } else if (zzk2 == 65) {
                            zzk2 = 65;
                            break;
                        }
                    }
                }
                this.zzf = 1;
                zzdy zzdy2 = this.zzb;
                zzdy2.zzH()[0] = -84;
                byte[] zzH = zzdy2.zzH();
                if (zzk2 == 65) {
                    b = 65;
                }
                zzH[1] = b;
                this.zzg = 2;
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
                byte[] zzH2 = this.zzb.zzH();
                int min2 = Math.min(zzdy.zza(), 16 - this.zzg);
                zzdy.zzB(zzH2, this.zzg, min2);
                int i4 = this.zzg + min2;
                this.zzg = i4;
                if (i4 == 16) {
                    this.zza.zzh(0);
                    zzxz zza2 = zzya.zza(this.zza);
                    zzad zzad = this.zzj;
                    if (zzad == null || zzad.zzz != 2 || zza2.zza != zzad.zzA || !MimeTypes.AUDIO_AC4.equals(zzad.zzm)) {
                        zzab zzab = new zzab();
                        zzab.zzH(this.zzd);
                        zzab.zzS(MimeTypes.AUDIO_AC4);
                        zzab.zzw(2);
                        zzab.zzT(zza2.zza);
                        zzab.zzK(this.zzc);
                        zzad zzY = zzab.zzY();
                        this.zzj = zzY;
                        this.zze.zzk(zzY);
                    }
                    this.zzk = zza2.zzb;
                    this.zzi = (((long) zza2.zzc) * 1000000) / ((long) this.zzj.zzA);
                    this.zzb.zzF(0);
                    zzzx.zzb(this.zze, this.zzb, 16);
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

    public zzaft(String str) {
        this.zza = new zzdx(new byte[16], 16);
        this.zzb = new zzdy(this.zza.zza);
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
