package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzeny implements zzetb {
    private final Set zza;

    zzeny(Set set) {
        this.zza = set;
    }

    public final int zza() {
        return 8;
    }

    public final zzfvj zzb() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.zza) {
            arrayList.add(add);
        }
        return zzfva.zzi(new zzenx(arrayList));
    }
}
