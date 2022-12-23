package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzyq {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, OpusUtil.SAMPLE_RATE, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static zzad zza(byte[] bArr, String str, String str2, zzv zzv) {
        zzdx zzdx;
        int i = 0;
        int i2 = -1;
        if (bArr[0] == Byte.MAX_VALUE) {
            zzdx = new zzdx(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b = copyOf[0];
            if (b == -2 || b == -1) {
                for (int i3 = 0; i3 < copyOf.length - 1; i3 += 2) {
                    byte b2 = copyOf[i3];
                    int i4 = i3 + 1;
                    copyOf[i3] = copyOf[i4];
                    copyOf[i4] = b2;
                }
            }
            int length = copyOf.length;
            zzdx = new zzdx(copyOf, length);
            if (copyOf[0] == 31) {
                zzdx zzdx2 = new zzdx(copyOf, length);
                while (zzdx2.zza() >= 16) {
                    zzdx2.zzj(2);
                    zzdx.zze(zzdx2.zzc(14), 14);
                }
            }
            zzdx.zzg(copyOf, copyOf.length);
        }
        zzdx.zzj(60);
        int i5 = zzb[zzdx.zzc(6)];
        int i6 = zzc[zzdx.zzc(4)];
        int zzc2 = zzdx.zzc(5);
        if (zzc2 < 29) {
            i2 = (zzd[zzc2] * 1000) / 2;
        }
        zzdx.zzj(10);
        if (zzdx.zzc(2) > 0) {
            i = 1;
        }
        zzab zzab = new zzab();
        zzab.zzH(str);
        zzab.zzS("audio/vnd.dts");
        zzab.zzv(i2);
        zzab.zzw(i5 + i);
        zzab.zzT(i6);
        zzab.zzB((zzv) null);
        zzab.zzK(str2);
        return zzab.zzY();
    }
}
