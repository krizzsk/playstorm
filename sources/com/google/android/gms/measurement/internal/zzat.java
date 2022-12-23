package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzat implements Iterator {
    final Iterator zza = this.zzb.zza.keySet().iterator();
    final /* synthetic */ zzau zzb;

    zzat(zzau zzau) {
        this.zzb = zzau;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    /* renamed from: zza */
    public final String next() {
        return (String) this.zza.next();
    }
}
