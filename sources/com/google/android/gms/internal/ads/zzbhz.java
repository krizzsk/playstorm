package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzbhz {
    static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbja.zzc("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbjl.zza);
        zzc(arrayList, zzbjl.zzb);
        zzc(arrayList, zzbjl.zzc);
        zzc(arrayList, zzbjl.zzd);
        zzc(arrayList, zzbjl.zze);
        zzc(arrayList, zzbjl.zzu);
        zzc(arrayList, zzbjl.zzf);
        zzc(arrayList, zzbjl.zzm);
        zzc(arrayList, zzbjl.zzn);
        zzc(arrayList, zzbjl.zzo);
        zzc(arrayList, zzbjl.zzp);
        zzc(arrayList, zzbjl.zzq);
        zzc(arrayList, zzbjl.zzr);
        zzc(arrayList, zzbjl.zzs);
        zzc(arrayList, zzbjl.zzt);
        zzc(arrayList, zzbjl.zzg);
        zzc(arrayList, zzbjl.zzh);
        zzc(arrayList, zzbjl.zzi);
        zzc(arrayList, zzbjl.zzj);
        zzc(arrayList, zzbjl.zzk);
        zzc(arrayList, zzbjl.zzl);
        return arrayList;
    }

    static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbjy.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbja zzbja) {
        String str = (String) zzbja.zze();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
