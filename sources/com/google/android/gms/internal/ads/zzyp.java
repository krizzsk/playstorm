package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzyp {
    public final String zza;

    private zzyp(int i, int i2, String str) {
        this.zza = str;
    }

    public static zzyp zza(zzdy zzdy) {
        String str;
        zzdy.zzG(2);
        int zzk = zzdy.zzk();
        int i = zzk >> 1;
        int zzk2 = (zzdy.zzk() >> 3) | ((zzk & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = zzk2 < 10 ? ".0" : ".";
        return new zzyp(i, zzk2, str + ".0" + i + str2 + zzk2);
    }
}
