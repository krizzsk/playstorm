package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.OpusUtil;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzafh extends zzafl {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};

    zzafh() {
    }

    public static boolean zzd(zzdy zzdy) {
        return zzk(zzdy, zza);
    }

    private static boolean zzk(zzdy zzdy, byte[] bArr) {
        if (zzdy.zza() < 8) {
            return false;
        }
        int zzc = zzdy.zzc();
        byte[] bArr2 = new byte[8];
        zzdy.zzB(bArr2, 0, 8);
        zzdy.zzF(zzc);
        return Arrays.equals(bArr2, bArr);
    }

    /* access modifiers changed from: protected */
    public final long zza(zzdy zzdy) {
        byte[] zzH = zzdy.zzH();
        byte b = zzH[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = zzH[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        return zzg(((long) b3) * ((long) (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2)));
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzdy zzdy, long j, zzafi zzafi) throws zzbp {
        boolean z = false;
        if (zzk(zzdy, zza)) {
            byte[] copyOf = Arrays.copyOf(zzdy.zzH(), zzdy.zzd());
            byte b = copyOf[9] & 255;
            List zza2 = zzzq.zza(copyOf);
            if (zzafi.zza == null) {
                z = true;
            }
            zzcw.zzf(z);
            zzab zzab = new zzab();
            zzab.zzS("audio/opus");
            zzab.zzw(b);
            zzab.zzT(OpusUtil.SAMPLE_RATE);
            zzab.zzI(zza2);
            zzafi.zza = zzab.zzY();
            return true;
        } else if (zzk(zzdy, zzb)) {
            zzcw.zzb(zzafi.zza);
            zzdy.zzG(8);
            zzbl zzb2 = zzaaf.zzb(zzfrh.zzn(zzaaf.zzc(zzdy, false, false).zzb));
            if (zzb2 == null) {
                return true;
            }
            zzab zzb3 = zzafi.zza.zzb();
            zzb3.zzM(zzb2.zzd(zzafi.zza.zzk));
            zzafi.zza = zzb3.zzY();
            return true;
        } else {
            zzcw.zzb(zzafi.zza);
            return false;
        }
    }
}
