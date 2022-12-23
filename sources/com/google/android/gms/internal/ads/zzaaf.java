package com.google.android.gms.internal.ads;

import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaaf {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static zzbl zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] zzag = zzeg.zzag(str, "=");
            if (zzag.length != 2) {
                Log.w("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (zzag[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzabh.zzb(new zzdy(Base64.decode(zzag[1], 0))));
                } catch (RuntimeException e) {
                    zzdn.zzb("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzacx(zzag[0], zzag[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbl((List) arrayList);
    }

    public static zzaac zzc(zzdy zzdy, boolean z, boolean z2) throws zzbp {
        if (z) {
            zzd(3, zzdy, false);
        }
        String zzx = zzdy.zzx((int) zzdy.zzq(), zzfog.zzc);
        long zzq = zzdy.zzq();
        String[] strArr = new String[((int) zzq)];
        int length = zzx.length() + 15;
        for (int i = 0; ((long) i) < zzq; i++) {
            String zzx2 = zzdy.zzx((int) zzdy.zzq(), zzfog.zzc);
            strArr[i] = zzx2;
            length = length + 4 + zzx2.length();
        }
        if (!z2 || (zzdy.zzk() & 1) != 0) {
            return new zzaac(zzx, strArr, length + 1);
        }
        throw zzbp.zza("framing bit expected to be set", (Throwable) null);
    }

    public static boolean zzd(int i, zzdy zzdy, boolean z) throws zzbp {
        if (zzdy.zza() < 7) {
            if (z) {
                return false;
            }
            int zza = zzdy.zza();
            throw zzbp.zza("too short header: " + zza, (Throwable) null);
        } else if (zzdy.zzk() != i) {
            if (z) {
                return false;
            }
            throw zzbp.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), (Throwable) null);
        } else if (zzdy.zzk() == 118 && zzdy.zzk() == 111 && zzdy.zzk() == 114 && zzdy.zzk() == 98 && zzdy.zzk() == 105 && zzdy.zzk() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw zzbp.zza("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
