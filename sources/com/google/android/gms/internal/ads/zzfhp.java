package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfhp {
    public static void zza(zzfvj zzfvj, zzfhq zzfhq, zzfhg zzfhg) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            zzfva.zzr(zzfur.zzv(zzfvj), new zzfhn(zzfhq, zzfhg, false), zzcfv.zzf);
        }
    }

    public static void zzb(zzfvj zzfvj, zzfhq zzfhq, zzfhg zzfhg) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            zzfva.zzr(zzfur.zzv(zzfvj), new zzfho(zzfhq, zzfhg), zzcfv.zzf);
        }
    }

    public static void zzc(zzfvj zzfvj, zzfhg zzfhg) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            zzfva.zzr(zzfur.zzv(zzfvj), new zzfhm(zzfhg), zzcfv.zzf);
        }
    }

    public static boolean zzd(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) zzay.zzc().zzb(zzbhy.zzhn), str);
    }
}
