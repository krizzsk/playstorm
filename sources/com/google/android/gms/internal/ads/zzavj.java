package com.google.android.gms.internal.ads;

import android.support.p003v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzavj {
    private static final int[] zza = {zzazn.zzg("isom"), zzazn.zzg("iso2"), zzazn.zzg("iso3"), zzazn.zzg("iso4"), zzazn.zzg("iso5"), zzazn.zzg("iso6"), zzazn.zzg("avc1"), zzazn.zzg("hvc1"), zzazn.zzg("hev1"), zzazn.zzg("mp41"), zzazn.zzg("mp42"), zzazn.zzg("3g2a"), zzazn.zzg("3g2b"), zzazn.zzg("3gr6"), zzazn.zzg("3gs6"), zzazn.zzg("3ge6"), zzazn.zzg("3gg6"), zzazn.zzg("M4V "), zzazn.zzg("M4A "), zzazn.zzg("f4v "), zzazn.zzg("kddi"), zzazn.zzg("M4VP"), zzazn.zzg("qt  "), zzazn.zzg("MSNV")};

    public static boolean zza(zzatu zzatu) throws IOException, InterruptedException {
        return zzc(zzatu, true);
    }

    public static boolean zzb(zzatu zzatu) throws IOException, InterruptedException {
        return zzc(zzatu, false);
    }

    private static boolean zzc(zzatu zzatu, boolean z) throws IOException, InterruptedException {
        boolean z2;
        zzatu zzatu2 = zzatu;
        long zzc = zzatu.zzc();
        if (zzc == -1 || zzc > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            zzc = 4096;
        }
        int i = (int) zzc;
        zzazg zzazg = new zzazg(64);
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            zzazg.zzs(8);
            zzatu.zzg(zzazg.zza, 0, 8, false);
            long zzm = zzazg.zzm();
            int zze = zzazg.zze();
            int i3 = 16;
            if (zzm == 1) {
                zzatu.zzg(zzazg.zza, 8, 8, false);
                zzazg.zzu(16);
                zzm = zzazg.zzn();
            } else {
                i3 = 8;
            }
            long j = (long) i3;
            if (zzm < j) {
                return false;
            }
            i2 += i3;
            if (zze != zzaus.zzE) {
                if (zze == zzaus.zzN || zze == zzaus.zzP) {
                    z2 = true;
                } else if ((((long) i2) + zzm) - j >= ((long) i)) {
                    break;
                } else {
                    int i4 = (int) (zzm - j);
                    i2 += i4;
                    if (zze == zzaus.zzd) {
                        if (i4 < 8) {
                            return false;
                        }
                        zzazg.zzs(i4);
                        zzatu.zzg(zzazg.zza, 0, i4, false);
                        int i5 = i4 >> 2;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                break;
                            }
                            if (i6 == 1) {
                                zzazg.zzw(4);
                            } else {
                                int zze2 = zzazg.zze();
                                if ((zze2 >>> 8) == zzazn.zzg("3gp")) {
                                    break;
                                }
                                int[] iArr = zza;
                                int length = iArr.length;
                                for (int i7 = 0; i7 < 24; i7++) {
                                    if (iArr[i7] == zze2) {
                                        break;
                                    }
                                }
                                continue;
                            }
                            i6++;
                        }
                        z3 = true;
                        if (!z3) {
                            return false;
                        }
                    } else if (i4 != 0) {
                        zzatu.zzf(i4, false);
                    }
                }
            }
        }
        z2 = false;
        if (!z3 || z != z2) {
            return false;
        }
        return true;
    }
}
