package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.audio.WavUtil;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzahx {
    public static Pair zza(zzyt zzyt) throws IOException {
        zzyt.zzj();
        zzahw zzd = zzd(1684108385, zzyt, new zzdy(8));
        ((zzym) zzyt).zzo(8, false);
        return Pair.create(Long.valueOf(zzyt.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzahv zzb(zzyt zzyt) throws IOException {
        byte[] bArr;
        zzdy zzdy = new zzdy(16);
        zzahw zzd = zzd(WavUtil.FMT_FOURCC, zzyt, zzdy);
        zzcw.zzf(zzd.zzb >= 16);
        zzym zzym = (zzym) zzyt;
        zzym.zzm(zzdy.zzH(), 0, 16, false);
        zzdy.zzF(0);
        int zzi = zzdy.zzi();
        int zzi2 = zzdy.zzi();
        int zzh = zzdy.zzh();
        int zzh2 = zzdy.zzh();
        int zzi3 = zzdy.zzi();
        int zzi4 = zzdy.zzi();
        int i = ((int) zzd.zzb) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            zzym.zzm(bArr2, 0, i, false);
            bArr = bArr2;
        } else {
            bArr = zzeg.zzf;
        }
        zzym.zzo((int) (zzyt.zze() - zzyt.zzf()), false);
        return new zzahv(zzi, zzi2, zzh, zzh2, zzi3, zzi4, bArr);
    }

    public static boolean zzc(zzyt zzyt) throws IOException {
        zzdy zzdy = new zzdy(8);
        int i = zzahw.zza(zzyt, zzdy).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((zzym) zzyt).zzm(zzdy.zzH(), 0, 4, false);
        zzdy.zzF(0);
        int zze = zzdy.zze();
        if (zze == 1463899717) {
            return true;
        }
        Log.e("WavHeaderReader", "Unsupported form type: " + zze);
        return false;
    }

    private static zzahw zzd(int i, zzyt zzyt, zzdy zzdy) throws IOException {
        zzahw zza = zzahw.zza(zzyt, zzdy);
        while (true) {
            int i2 = zza.zza;
            if (i2 == i) {
                return zza;
            }
            Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = zza.zzb + 8;
            if (j <= 2147483647L) {
                ((zzym) zzyt).zzo((int) j, false);
                zza = zzahw.zza(zzyt, zzdy);
            } else {
                int i3 = zza.zza;
                throw zzbp.zzc("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
        }
    }
}
