package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfqo extends AbstractSet {
    final /* synthetic */ zzfqr zza;

    zzfqo(zzfqr zzfqr) {
        this.zza = zzfqr;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.containsKey(obj);
    }

    public final Iterator iterator() {
        zzfqr zzfqr = this.zza;
        Map zzl = zzfqr.zzl();
        if (zzl != null) {
            return zzl.keySet().iterator();
        }
        return new zzfqj(zzfqr);
    }

    public final boolean remove(@CheckForNull Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.keySet().remove(obj);
        }
        return this.zza.zzx(obj) != zzfqr.zzd;
    }

    public final int size() {
        return this.zza.size();
    }
}
