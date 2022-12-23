package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.exoplayer2.extractor.p194ts.TsExtractor;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzahe {
    private final zzee zza = new zzee(0);
    private final zzdy zzb = new zzdy();
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;

    zzahe(int i) {
    }

    private final int zze(zzyt zzyt) {
        zzdy zzdy = this.zzb;
        byte[] bArr = zzeg.zzf;
        int length = bArr.length;
        zzdy.zzD(bArr, 0);
        this.zzc = true;
        zzyt.zzj();
        return 0;
    }

    public final int zza(zzyt zzyt, zzzs zzzs, int i) throws IOException {
        if (i <= 0) {
            zze(zzyt);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd2 = zzyt.zzd();
            int min = (int) Math.min(112800, zzd2);
            long j2 = zzd2 - ((long) min);
            if (zzyt.zzf() != j2) {
                zzzs.zza = j2;
                return 1;
            }
            this.zzb.zzC(min);
            zzyt.zzj();
            ((zzym) zzyt).zzm(this.zzb.zzH(), 0, min, false);
            zzdy zzdy = this.zzb;
            int zzc2 = zzdy.zzc();
            int zzd3 = zzdy.zzd();
            int i2 = zzd3 - 188;
            while (true) {
                if (i2 < zzc2) {
                    break;
                }
                byte[] zzH = zzdy.zzH();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * TsExtractor.TS_PACKET_SIZE) + i2;
                    if (i5 < zzc2 || i5 >= zzd3 || zzH[i5] != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            long zzb2 = zzaho.zzb(zzdy, i2, i);
                            if (zzb2 != -9223372036854775807L) {
                                j = zzb2;
                                break;
                            }
                        }
                    }
                    i3++;
                }
                i2--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zze(zzyt);
            return 0;
        } else if (!this.zzd) {
            int min2 = (int) Math.min(112800, zzyt.zzd());
            if (zzyt.zzf() != 0) {
                zzzs.zza = 0;
                return 1;
            }
            this.zzb.zzC(min2);
            zzyt.zzj();
            ((zzym) zzyt).zzm(this.zzb.zzH(), 0, min2, false);
            zzdy zzdy2 = this.zzb;
            int zzc3 = zzdy2.zzc();
            int zzd4 = zzdy2.zzd();
            while (true) {
                if (zzc3 >= zzd4) {
                    break;
                }
                if (zzdy2.zzH()[zzc3] == 71) {
                    long zzb3 = zzaho.zzb(zzdy2, zzc3, i);
                    if (zzb3 != -9223372036854775807L) {
                        j = zzb3;
                        break;
                    }
                }
                zzc3++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        } else {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zze(zzyt);
                return 0;
            }
            long zzb4 = this.zza.zzb(this.zzg) - this.zza.zzb(j3);
            this.zzh = zzb4;
            if (zzb4 < 0) {
                Log.w("TsDurationReader", "Invalid duration: " + zzb4 + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zze(zzyt);
            return 0;
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzee zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
