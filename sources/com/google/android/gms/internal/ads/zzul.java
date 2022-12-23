package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzul implements Comparator {
    public static final /* synthetic */ zzul zza = new zzul();

    private /* synthetic */ zzul() {
    }

    public final int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return zzfqw.zzj().zzc((zzve) Collections.max(list, zzvc.zza), (zzve) Collections.max(list2, zzvc.zza), zzvc.zza).zzb(list.size(), list2.size()).zzc((zzve) Collections.max(list, zzvd.zza), (zzve) Collections.max(list2, zzvd.zza), zzvd.zza).zza();
    }
}
