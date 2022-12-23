package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfja {
    private static final zzfja zza = new zzfja();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfja() {
    }

    public static zzfja zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfip zzfip) {
        this.zzb.add(zzfip);
    }

    public final void zze(zzfip zzfip) {
        boolean zzg = zzg();
        this.zzb.remove(zzfip);
        this.zzc.remove(zzfip);
        if (zzg && !zzg()) {
            zzfjh.zzb().zzf();
        }
    }

    public final void zzf(zzfip zzfip) {
        boolean zzg = zzg();
        this.zzc.add(zzfip);
        if (!zzg) {
            zzfjh.zzb().zze();
        }
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
