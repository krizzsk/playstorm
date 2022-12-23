package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaho {
    public static int zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzdy zzdy, int i, int i2) {
        zzdy.zzF(i);
        if (zzdy.zza() < 5) {
            return -9223372036854775807L;
        }
        int zze = zzdy.zze();
        if ((8388608 & zze) != 0 || ((zze >> 8) & 8191) != i2 || (zze & 32) == 0 || zzdy.zzk() < 7 || zzdy.zza() < 7 || (zzdy.zzk() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzdy.zzB(bArr, 0, 6);
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        long j = ((long) bArr[3]) & 255;
        return ((((long) b2) & 255) << 17) | ((((long) b) & 255) << 25) | ((((long) b3) & 255) << 9) | (j + j) | ((((long) bArr[4]) & 255) >> 7);
    }
}
