package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeyx {
    static zzeyv zza(Context context, zzfdj zzfdj, zzfeb zzfeb) {
        return zzc(context, zzfdj, zzfeb);
    }

    static zzeyv zzb(Context context, zzfdj zzfdj, zzfeb zzfeb) {
        return zzc(context, zzfdj, zzfeb);
    }

    private static zzeyv zzc(Context context, zzfdj zzfdj, zzfeb zzfeb) {
        zzcel zzcel;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfn)).booleanValue()) {
            zzcel = zzt.zzo().zzh().zzh();
        } else {
            zzcel = zzt.zzo().zzh().zzi();
        }
        boolean z = false;
        if (zzcel != null && zzcel.zzh()) {
            z = true;
        }
        if (((Integer) zzay.zzc().zzb(zzbhy.zzfD)).intValue() > 0) {
            if (!((Boolean) zzay.zzc().zzb(zzbhy.zzfm)).booleanValue() || z) {
                zzfea zza = zzfeb.zza(zzfdr.AppOpen, context, zzfdj, new zzexz(new zzexw()));
                return new zzeyb(new zzeyl(new zzeyk()), new zzeyh(zza.zza, zzcfv.zza), zza.zzb, zza.zza.zza().zzf, zzcfv.zza);
            }
        }
        return new zzeyk();
    }
}
