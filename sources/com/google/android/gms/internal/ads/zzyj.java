package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzyj {
    public static void zza(long j, zzdy zzdy, zzzz[] zzzzArr) {
        int i;
        while (true) {
            boolean z = true;
            if (zzdy.zza() > 1) {
                int zzc = zzc(zzdy);
                int zzc2 = zzc(zzdy);
                int zzc3 = zzdy.zzc() + zzc2;
                if (zzc2 == -1 || zzc2 > zzdy.zza()) {
                    Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    zzc3 = zzdy.zzd();
                } else if (zzc == 4 && zzc2 >= 8) {
                    int zzk = zzdy.zzk();
                    int zzo = zzdy.zzo();
                    if (zzo == 49) {
                        i = zzdy.zze();
                        zzo = 49;
                    } else {
                        i = 0;
                    }
                    int zzk2 = zzdy.zzk();
                    if (zzo == 47) {
                        zzdy.zzG(1);
                        zzo = 47;
                    }
                    boolean z2 = zzk == 181 && (zzo == 49 || zzo == 47) && zzk2 == 3;
                    if (zzo == 49) {
                        if (i != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        zzb(j, zzdy, zzzzArr);
                    }
                }
                zzdy.zzF(zzc3);
            } else {
                return;
            }
        }
    }

    public static void zzb(long j, zzdy zzdy, zzzz[] zzzzArr) {
        int zzk = zzdy.zzk();
        if ((zzk & 64) != 0) {
            zzdy.zzG(1);
            int i = (zzk & 31) * 3;
            int zzc = zzdy.zzc();
            for (zzzz zzzz : zzzzArr) {
                zzdy.zzF(zzc);
                zzzz.zzq(zzdy, i);
                if (j != -9223372036854775807L) {
                    zzzz.zzs(j, 1, i, 0, (zzzy) null);
                }
            }
        }
    }

    private static int zzc(zzdy zzdy) {
        int i = 0;
        while (zzdy.zza() != 0) {
            int zzk = zzdy.zzk();
            i += zzk;
            if (zzk != 255) {
                return i;
            }
        }
        return -1;
    }
}
