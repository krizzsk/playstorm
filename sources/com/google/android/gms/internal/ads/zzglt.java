package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzglt {
    zzglt() {
    }

    public static final int zza(int i, Object obj, Object obj2) {
        zzgls zzgls = (zzgls) obj;
        zzglr zzglr = (zzglr) obj2;
        if (zzgls.isEmpty()) {
            return 0;
        }
        Iterator it = zzgls.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean zzb(Object obj) {
        return !((zzgls) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzgls zzgls = (zzgls) obj;
        zzgls zzgls2 = (zzgls) obj2;
        if (!zzgls2.isEmpty()) {
            if (!zzgls.zze()) {
                zzgls = zzgls.zzb();
            }
            zzgls.zzd(zzgls2);
        }
        return zzgls;
    }
}
