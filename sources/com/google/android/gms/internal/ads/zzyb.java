package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzyb {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;
    public final String zzf;

    private zzyb(List list, int i, int i2, int i3, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = f;
        this.zzf = str;
    }

    public static zzyb zza(zzdy zzdy) throws zzbp {
        String str;
        float f;
        int i;
        int i2;
        try {
            zzdy.zzG(4);
            int zzk = (zzdy.zzk() & 3) + 1;
            if (zzk != 3) {
                ArrayList arrayList = new ArrayList();
                int zzk2 = zzdy.zzk() & 31;
                for (int i3 = 0; i3 < zzk2; i3++) {
                    arrayList.add(zzb(zzdy));
                }
                int zzk3 = zzdy.zzk();
                for (int i4 = 0; i4 < zzk3; i4++) {
                    arrayList.add(zzb(zzdy));
                }
                if (zzk2 > 0) {
                    zzzo zzd2 = zzzp.zzd((byte[]) arrayList.get(0), zzk + 1, ((byte[]) arrayList.get(0)).length);
                    int i5 = zzd2.zze;
                    int i6 = zzd2.zzf;
                    float f2 = zzd2.zzg;
                    str = zzcy.zza(zzd2.zza, zzd2.zzb, zzd2.zzc);
                    i2 = i5;
                    i = i6;
                    f = f2;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                    str = null;
                }
                return new zzyb(arrayList, zzk, i2, i, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzbp.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzdy zzdy) {
        int zzo = zzdy.zzo();
        int zzc2 = zzdy.zzc();
        zzdy.zzG(zzo);
        return zzcy.zzc(zzdy.zzH(), zzc2, zzo);
    }
}
