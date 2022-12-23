package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfui extends zzfuk {
    zzfui(zzfrc zzfrc, boolean z) {
        super(zzfrc, true);
        zzw();
    }

    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        ArrayList zza = zzfrv.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfuj zzfuj = (zzfuj) it.next();
            zza.add(zzfuj != null ? zzfuj.zza : null);
        }
        return Collections.unmodifiableList(zza);
    }
}
