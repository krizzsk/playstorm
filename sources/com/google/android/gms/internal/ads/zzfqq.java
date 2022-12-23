package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfqq extends AbstractCollection {
    final /* synthetic */ zzfqr zza;

    zzfqq(zzfqr zzfqr) {
        this.zza = zzfqr;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final Iterator iterator() {
        zzfqr zzfqr = this.zza;
        Map zzl = zzfqr.zzl();
        if (zzl != null) {
            return zzl.values().iterator();
        }
        return new zzfql(zzfqr);
    }

    public final int size() {
        return this.zza.size();
    }
}
