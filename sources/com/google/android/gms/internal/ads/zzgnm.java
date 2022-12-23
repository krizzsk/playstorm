package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgnm implements Iterator {
    final Iterator zza = this.zzb.zza.iterator();
    final /* synthetic */ zzgnn zzb;

    zzgnm(zzgnn zzgnn) {
        this.zzb = zzgnn;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
