package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdwj implements zzfgf {
    private final Map zza = new HashMap();
    private final zzdwb zzb;
    private final Clock zzc;
    private final Map zzd = new HashMap();

    public zzdwj(zzdwb zzdwb, Set set, Clock clock) {
        this.zzb = zzdwb;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdwi zzdwi = (zzdwi) it.next();
            this.zzd.put(zzdwi.zzc, zzdwi);
        }
        this.zzc = clock;
    }

    private final void zze(zzffy zzffy, boolean z) {
        zzffy zzb2 = ((zzdwi) this.zzd.get(zzffy)).zzb;
        String str = true != z ? "f." : "s.";
        if (this.zza.containsKey(zzb2)) {
            this.zzb.zza().put("label.".concat(((zzdwi) this.zzd.get(zzffy)).zza), str.concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzb2)).longValue()))));
        }
    }

    public final void zzbF(zzffy zzffy, String str) {
    }

    public final void zzbG(zzffy zzffy, String str, Throwable th) {
        if (this.zza.containsKey(zzffy)) {
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzffy)).longValue()))));
        }
        if (this.zzd.containsKey(zzffy)) {
            zze(zzffy, false);
        }
    }

    public final void zzc(zzffy zzffy, String str) {
        this.zza.put(zzffy, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    public final void zzd(zzffy zzffy, String str) {
        if (this.zza.containsKey(zzffy)) {
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzffy)).longValue()))));
        }
        if (this.zzd.containsKey(zzffy)) {
            zze(zzffy, true);
        }
    }
}
