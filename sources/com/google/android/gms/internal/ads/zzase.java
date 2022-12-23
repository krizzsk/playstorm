package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.OpusUtil;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzase {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {OpusUtil.SAMPLE_RATE, 44100, 32000};
    private static final int[] zzd = {2, 1, 2, 3, 3, 4, 4, 5};

    public static int zza(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = zzb[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    public static zzars zzb(zzazg zzazg, String str, String str2, zzatr zzatr) {
        int i = zzc[(zzazg.zzg() & 192) >> 6];
        int zzg = zzazg.zzg();
        int i2 = zzd[(zzg & 56) >> 3];
        if ((zzg & 4) != 0) {
            i2++;
        }
        return zzars.zzg(str, "audio/ac3", (String) null, -1, -1, i2, i, (List) null, zzatr, 0, str2);
    }

    public static zzars zzc(zzazg zzazg, String str, String str2, zzatr zzatr) {
        zzazg zzazg2 = zzazg;
        zzazg.zzw(2);
        int i = zzc[(zzazg.zzg() & 192) >> 6];
        int zzg = zzazg.zzg();
        int i2 = zzd[(zzg & 14) >> 1];
        if ((zzg & 1) != 0) {
            i2++;
        }
        return zzars.zzg(str, "audio/eac3", (String) null, -1, -1, i2, i, (List) null, zzatr, 0, str2);
    }
}
