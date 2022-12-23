package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzdhb {
    protected final Map zza = new HashMap();

    protected zzdhb(Set set) {
        zzm(set);
    }

    public final synchronized void zzg(zzdiy zzdiy) {
        zzj(zzdiy.zza, zzdiy.zzb);
    }

    public final synchronized void zzj(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzm(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzg((zzdiy) it.next());
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzo(zzdha zzdha) {
        for (Map.Entry entry : this.zza.entrySet()) {
            ((Executor) entry.getValue()).execute(new zzdgz(zzdha, entry.getKey()));
        }
    }
}
