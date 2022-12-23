package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.google.common.base.Ascii;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzagv {
    private final zzee zza = new zzee(0);
    private final zzdy zzb = new zzdy();
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;

    zzagv() {
    }

    public static long zzc(zzdy zzdy) {
        zzdy zzdy2 = zzdy;
        int zzc2 = zzdy.zzc();
        if (zzdy.zza() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzdy2.zzB(bArr, 0, 9);
        zzdy2.zzF(zzc2);
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = (long) bArr[0];
        byte b = bArr[1];
        long j2 = (long) bArr[2];
        return ((((long) bArr[3]) & 255) << 5) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) b) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((((long) bArr[4]) & 248) >> 3);
    }

    private final int zzf(zzyt zzyt) {
        zzdy zzdy = this.zzb;
        byte[] bArr = zzeg.zzf;
        int length = bArr.length;
        zzdy.zzD(bArr, 0);
        this.zzc = true;
        zzyt.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i + 1] & 255) << Ascii.DLE) | ((bArr[i + 2] & 255) << 8);
    }

    public final int zza(zzyt zzyt, zzzs zzzs) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd2 = zzyt.zzd();
            int min = (int) Math.min(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, zzd2);
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
            int zzd3 = zzdy.zzd() - 4;
            while (true) {
                if (zzd3 < zzc2) {
                    break;
                }
                if (zzg(zzdy.zzH(), zzd3) == 442) {
                    zzdy.zzF(zzd3 + 4);
                    long zzc3 = zzc(zzdy);
                    if (zzc3 != -9223372036854775807L) {
                        j = zzc3;
                        break;
                    }
                }
                zzd3--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zzf(zzyt);
            return 0;
        } else if (!this.zzd) {
            int min2 = (int) Math.min(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, zzyt.zzd());
            if (zzyt.zzf() != 0) {
                zzzs.zza = 0;
                return 1;
            }
            this.zzb.zzC(min2);
            zzyt.zzj();
            ((zzym) zzyt).zzm(this.zzb.zzH(), 0, min2, false);
            zzdy zzdy2 = this.zzb;
            int zzc4 = zzdy2.zzc();
            int zzd4 = zzdy2.zzd();
            while (true) {
                if (zzc4 >= zzd4 - 3) {
                    break;
                }
                if (zzg(zzdy2.zzH(), zzc4) == 442) {
                    zzdy2.zzF(zzc4 + 4);
                    long zzc5 = zzc(zzdy2);
                    if (zzc5 != -9223372036854775807L) {
                        j = zzc5;
                        break;
                    }
                }
                zzc4++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        } else {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zzf(zzyt);
                return 0;
            }
            long zzb2 = this.zza.zzb(this.zzg) - this.zza.zzb(j3);
            this.zzh = zzb2;
            if (zzb2 < 0) {
                Log.w("PsDurationReader", "Invalid duration: " + zzb2 + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zzf(zzyt);
            return 0;
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzee zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
