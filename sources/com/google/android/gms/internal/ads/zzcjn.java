package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcjn implements Iterable {
    private final List zza = new ArrayList();

    public final Iterator iterator() {
        return this.zza.iterator();
    }

    /* access modifiers changed from: package-private */
    public final zzcjm zza(zzchr zzchr) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcjm zzcjm = (zzcjm) it.next();
            if (zzcjm.zza == zzchr) {
                return zzcjm;
            }
        }
        return null;
    }

    public final void zzb(zzcjm zzcjm) {
        this.zza.add(zzcjm);
    }

    public final void zzc(zzcjm zzcjm) {
        this.zza.remove(zzcjm);
    }

    public final boolean zzd(zzchr zzchr) {
        ArrayList<zzcjm> arrayList = new ArrayList<>();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcjm zzcjm = (zzcjm) it.next();
            if (zzcjm.zza == zzchr) {
                arrayList.add(zzcjm);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (zzcjm zzcjm2 : arrayList) {
            zzcjm2.zzb.zzb();
        }
        return true;
    }
}
