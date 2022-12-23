package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzagt implements zzyh {
    private final zzee zza;
    private final zzdy zzb = new zzdy();

    /* synthetic */ zzagt(zzee zzee, zzags zzags) {
        this.zza = zzee;
    }

    public final zzyg zza(zzyt zzyt, long j) throws IOException {
        int zzh;
        long j2;
        long zzf = zzyt.zzf();
        int min = (int) Math.min(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, zzyt.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzym) zzyt).zzm(this.zzb.zzH(), 0, min, false);
        zzdy zzdy = this.zzb;
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (zzdy.zza() >= 4) {
            if (zzagu.zzh(zzdy.zzH(), zzdy.zzc()) != 442) {
                zzdy.zzG(1);
            } else {
                zzdy.zzG(4);
                long zzc = zzagv.zzc(zzdy);
                if (zzc != -9223372036854775807L) {
                    long zzb2 = this.zza.zzb(zzc);
                    if (zzb2 > j) {
                        if (j3 == -9223372036854775807L) {
                            return zzyg.zzd(zzb2, zzf);
                        }
                        j2 = (long) i2;
                    } else if (100000 + zzb2 > j) {
                        j2 = (long) zzdy.zzc();
                    } else {
                        i2 = zzdy.zzc();
                        j3 = zzb2;
                    }
                    return zzyg.zze(zzf + j2);
                }
                int zzd = zzdy.zzd();
                if (zzdy.zza() >= 10) {
                    zzdy.zzG(9);
                    int zzk = zzdy.zzk() & 7;
                    if (zzdy.zza() >= zzk) {
                        zzdy.zzG(zzk);
                        if (zzdy.zza() >= 4) {
                            if (zzagu.zzh(zzdy.zzH(), zzdy.zzc()) == 443) {
                                zzdy.zzG(4);
                                int zzo = zzdy.zzo();
                                if (zzdy.zza() < zzo) {
                                    zzdy.zzF(zzd);
                                } else {
                                    zzdy.zzG(zzo);
                                }
                            }
                            while (true) {
                                if (zzdy.zza() < 4 || (zzh = zzagu.zzh(zzdy.zzH(), zzdy.zzc())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzdy.zzG(4);
                                if (zzdy.zza() < 2) {
                                    zzdy.zzF(zzd);
                                    break;
                                }
                                zzdy.zzF(Math.min(zzdy.zzd(), zzdy.zzc() + zzdy.zzo()));
                            }
                        } else {
                            zzdy.zzF(zzd);
                        }
                    } else {
                        zzdy.zzF(zzd);
                    }
                } else {
                    zzdy.zzF(zzd);
                }
                i = zzdy.zzc();
            }
        }
        return j3 != -9223372036854775807L ? zzyg.zzf(j3, zzf + ((long) i)) : zzyg.zza;
    }

    public final void zzb() {
        zzdy zzdy = this.zzb;
        byte[] bArr = zzeg.zzf;
        int length = bArr.length;
        zzdy.zzD(bArr, 0);
    }
}
