package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzede implements zzfgf {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final zzfgn zzc;

    public zzede(Set set, zzfgn zzfgn) {
        this.zzc = zzfgn;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzedd zzedd = (zzedd) it.next();
            this.zza.put(zzedd.zzb, zzedd.zza);
            this.zzb.put(zzedd.zzc, zzedd.zza);
        }
    }

    public final void zzbF(zzffy zzffy, String str) {
    }

    public final void zzbG(zzffy zzffy, String str, Throwable th) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "f.");
        if (this.zzb.containsKey(zzffy)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzffy))), "f.");
        }
    }

    public final void zzc(zzffy zzffy, String str) {
        this.zzc.zzd("task.".concat(String.valueOf(str)));
        if (this.zza.containsKey(zzffy)) {
            this.zzc.zzd("label.".concat(String.valueOf((String) this.zza.get(zzffy))));
        }
    }

    public final void zzd(zzffy zzffy, String str) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "s.");
        if (this.zzb.containsKey(zzffy)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzffy))), "s.");
        }
    }
}
